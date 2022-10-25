// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateBranchResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateBranchResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBranchResponseBody self = new CreateBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateBranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBranchResponseBody setResult(CreateBranchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateBranchResponseBodyResult getResult() {
        return this.result;
    }

    public CreateBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBranchResponseBodyResultCommitInfo extends TeaModel {
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

        public static CreateBranchResponseBodyResultCommitInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateBranchResponseBodyResultCommitInfo self = new CreateBranchResponseBodyResultCommitInfo();
            return TeaModel.build(map, self);
        }

        public CreateBranchResponseBodyResultCommitInfo setAuthorDate(String authorDate) {
            this.authorDate = authorDate;
            return this;
        }
        public String getAuthorDate() {
            return this.authorDate;
        }

        public CreateBranchResponseBodyResultCommitInfo setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public CreateBranchResponseBodyResultCommitInfo setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public CreateBranchResponseBodyResultCommitInfo setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public CreateBranchResponseBodyResultCommitInfo setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public CreateBranchResponseBodyResultCommitInfo setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public CreateBranchResponseBodyResultCommitInfo setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateBranchResponseBodyResultCommitInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateBranchResponseBodyResultCommitInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateBranchResponseBodyResultCommitInfo setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public CreateBranchResponseBodyResultCommitInfo setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public CreateBranchResponseBodyResultCommitInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateBranchResponseBodyResult extends TeaModel {
        @NameInMap("BranchName")
        public String branchName;

        @NameInMap("CommitInfo")
        public CreateBranchResponseBodyResultCommitInfo commitInfo;

        @NameInMap("ProtectedBranch")
        public Boolean protectedBranch;

        public static CreateBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateBranchResponseBodyResult self = new CreateBranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateBranchResponseBodyResult setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public CreateBranchResponseBodyResult setCommitInfo(CreateBranchResponseBodyResultCommitInfo commitInfo) {
            this.commitInfo = commitInfo;
            return this;
        }
        public CreateBranchResponseBodyResultCommitInfo getCommitInfo() {
            return this.commitInfo;
        }

        public CreateBranchResponseBodyResult setProtectedBranch(Boolean protectedBranch) {
            this.protectedBranch = protectedBranch;
            return this;
        }
        public Boolean getProtectedBranch() {
            return this.protectedBranch;
        }

    }

}
