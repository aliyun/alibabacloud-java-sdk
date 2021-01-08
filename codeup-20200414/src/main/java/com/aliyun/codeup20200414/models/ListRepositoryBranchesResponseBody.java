// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryBranchesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<ListRepositoryBranchesResponseBodyResult> result;

    public static ListRepositoryBranchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryBranchesResponseBody self = new ListRepositoryBranchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryBranchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryBranchesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListRepositoryBranchesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryBranchesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryBranchesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryBranchesResponseBody setResult(java.util.List<ListRepositoryBranchesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryBranchesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRepositoryBranchesResponseBodyResultCommitInfo extends TeaModel {
        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("AuthorDate")
        public String authorDate;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("Title")
        public String title;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("Id")
        public String id;

        @NameInMap("CommittedDate")
        public String committedDate;

        public static ListRepositoryBranchesResponseBodyResultCommitInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryBranchesResponseBodyResultCommitInfo self = new ListRepositoryBranchesResponseBodyResultCommitInfo();
            return TeaModel.build(map, self);
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setAuthorDate(String authorDate) {
            this.authorDate = authorDate;
            return this;
        }
        public String getAuthorDate() {
            return this.authorDate;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRepositoryBranchesResponseBodyResultCommitInfo setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

    }

    public static class ListRepositoryBranchesResponseBodyResult extends TeaModel {
        @NameInMap("ProtectedBranch")
        public Boolean protectedBranch;

        @NameInMap("CommitInfo")
        public ListRepositoryBranchesResponseBodyResultCommitInfo commitInfo;

        @NameInMap("BranchName")
        public String branchName;

        public static ListRepositoryBranchesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryBranchesResponseBodyResult self = new ListRepositoryBranchesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryBranchesResponseBodyResult setProtectedBranch(Boolean protectedBranch) {
            this.protectedBranch = protectedBranch;
            return this;
        }
        public Boolean getProtectedBranch() {
            return this.protectedBranch;
        }

        public ListRepositoryBranchesResponseBodyResult setCommitInfo(ListRepositoryBranchesResponseBodyResultCommitInfo commitInfo) {
            this.commitInfo = commitInfo;
            return this;
        }
        public ListRepositoryBranchesResponseBodyResultCommitInfo getCommitInfo() {
            return this.commitInfo;
        }

        public ListRepositoryBranchesResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

    }

}
