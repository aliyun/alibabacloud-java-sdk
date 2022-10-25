// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetBranchInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetBranchInfoResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetBranchInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBranchInfoResponseBody self = new GetBranchInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBranchInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBranchInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBranchInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBranchInfoResponseBody setResult(GetBranchInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetBranchInfoResponseBodyResult getResult() {
        return this.result;
    }

    public GetBranchInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBranchInfoResponseBodyResultCommitInfo extends TeaModel {
        @NameInMap("AuthorDate")
        public String authorDate;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommittedDate")
        public String committedDate;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("Title")
        public String title;

        public static GetBranchInfoResponseBodyResultCommitInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBranchInfoResponseBodyResultCommitInfo self = new GetBranchInfoResponseBodyResultCommitInfo();
            return TeaModel.build(map, self);
        }

        public GetBranchInfoResponseBodyResultCommitInfo setAuthorDate(String authorDate) {
            this.authorDate = authorDate;
            return this;
        }
        public String getAuthorDate() {
            return this.authorDate;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetBranchInfoResponseBodyResultCommitInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetBranchInfoResponseBodyResult extends TeaModel {
        @NameInMap("BranchName")
        public String branchName;

        @NameInMap("CommitInfo")
        public GetBranchInfoResponseBodyResultCommitInfo commitInfo;

        @NameInMap("ProtectedBranch")
        public Boolean protectedBranch;

        public static GetBranchInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetBranchInfoResponseBodyResult self = new GetBranchInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetBranchInfoResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public GetBranchInfoResponseBodyResult setCommitInfo(GetBranchInfoResponseBodyResultCommitInfo commitInfo) {
            this.commitInfo = commitInfo;
            return this;
        }
        public GetBranchInfoResponseBodyResultCommitInfo getCommitInfo() {
            return this.commitInfo;
        }

        public GetBranchInfoResponseBodyResult setProtectedBranch(Boolean protectedBranch) {
            this.protectedBranch = protectedBranch;
            return this;
        }
        public Boolean getProtectedBranch() {
            return this.protectedBranch;
        }

    }

}
