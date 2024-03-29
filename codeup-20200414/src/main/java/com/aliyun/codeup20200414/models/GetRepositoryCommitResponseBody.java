// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetRepositoryCommitResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetRepositoryCommitResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetRepositoryCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryCommitResponseBody self = new GetRepositoryCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepositoryCommitResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRepositoryCommitResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRepositoryCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepositoryCommitResponseBody setResult(GetRepositoryCommitResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRepositoryCommitResponseBodyResult getResult() {
        return this.result;
    }

    public GetRepositoryCommitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRepositoryCommitResponseBodyResultSignature extends TeaModel {
        @NameInMap("GpgKeyId")
        public String gpgKeyId;

        @NameInMap("VerificationStatus")
        public String verificationStatus;

        public static GetRepositoryCommitResponseBodyResultSignature build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryCommitResponseBodyResultSignature self = new GetRepositoryCommitResponseBodyResultSignature();
            return TeaModel.build(map, self);
        }

        public GetRepositoryCommitResponseBodyResultSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public GetRepositoryCommitResponseBodyResultSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class GetRepositoryCommitResponseBodyResult extends TeaModel {
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

        @NameInMap("Signature")
        public GetRepositoryCommitResponseBodyResultSignature signature;

        @NameInMap("Title")
        public String title;

        public static GetRepositoryCommitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryCommitResponseBodyResult self = new GetRepositoryCommitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRepositoryCommitResponseBodyResult setAuthorDate(String authorDate) {
            this.authorDate = authorDate;
            return this;
        }
        public String getAuthorDate() {
            return this.authorDate;
        }

        public GetRepositoryCommitResponseBodyResult setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetRepositoryCommitResponseBodyResult setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetRepositoryCommitResponseBodyResult setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetRepositoryCommitResponseBodyResult setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetRepositoryCommitResponseBodyResult setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetRepositoryCommitResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryCommitResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRepositoryCommitResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetRepositoryCommitResponseBodyResult setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public GetRepositoryCommitResponseBodyResult setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetRepositoryCommitResponseBodyResult setSignature(GetRepositoryCommitResponseBodyResultSignature signature) {
            this.signature = signature;
            return this;
        }
        public GetRepositoryCommitResponseBodyResultSignature getSignature() {
            return this.signature;
        }

        public GetRepositoryCommitResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
