// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetRepositoryTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetRepositoryTagResponseBodyResult result;

    public static GetRepositoryTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryTagResponseBody self = new GetRepositoryTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepositoryTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepositoryTagResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRepositoryTagResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRepositoryTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRepositoryTagResponseBody setResult(GetRepositoryTagResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRepositoryTagResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRepositoryTagResponseBodyResultSignature extends TeaModel {
        @NameInMap("GpgKeyId")
        public String gpgKeyId;

        @NameInMap("VerificationStatus")
        public String verificationStatus;

        public static GetRepositoryTagResponseBodyResultSignature build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagResponseBodyResultSignature self = new GetRepositoryTagResponseBodyResultSignature();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagResponseBodyResultSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public GetRepositoryTagResponseBodyResultSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class GetRepositoryTagResponseBodyResultCommitSignature extends TeaModel {
        @NameInMap("GpgKeyId")
        public String gpgKeyId;

        @NameInMap("VerificationStatus")
        public String verificationStatus;

        public static GetRepositoryTagResponseBodyResultCommitSignature build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagResponseBodyResultCommitSignature self = new GetRepositoryTagResponseBodyResultCommitSignature();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagResponseBodyResultCommitSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public GetRepositoryTagResponseBodyResultCommitSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class GetRepositoryTagResponseBodyResultCommit extends TeaModel {
        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("AuthoredDate")
        public String authoredDate;

        @NameInMap("Signature")
        public GetRepositoryTagResponseBodyResultCommitSignature signature;

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

        public static GetRepositoryTagResponseBodyResultCommit build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagResponseBodyResultCommit self = new GetRepositoryTagResponseBodyResultCommit();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagResponseBodyResultCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetRepositoryTagResponseBodyResultCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryTagResponseBodyResultCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetRepositoryTagResponseBodyResultCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public GetRepositoryTagResponseBodyResultCommit setSignature(GetRepositoryTagResponseBodyResultCommitSignature signature) {
            this.signature = signature;
            return this;
        }
        public GetRepositoryTagResponseBodyResultCommitSignature getSignature() {
            return this.signature;
        }

        public GetRepositoryTagResponseBodyResultCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public GetRepositoryTagResponseBodyResultCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetRepositoryTagResponseBodyResultCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetRepositoryTagResponseBodyResultCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetRepositoryTagResponseBodyResultCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetRepositoryTagResponseBodyResultCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetRepositoryTagResponseBodyResultCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRepositoryTagResponseBodyResultCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

    }

    public static class GetRepositoryTagResponseBodyResult extends TeaModel {
        @NameInMap("Signature")
        public GetRepositoryTagResponseBodyResultSignature signature;

        @NameInMap("Commit")
        public GetRepositoryTagResponseBodyResultCommit commit;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetRepositoryTagResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagResponseBodyResult self = new GetRepositoryTagResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagResponseBodyResult setSignature(GetRepositoryTagResponseBodyResultSignature signature) {
            this.signature = signature;
            return this;
        }
        public GetRepositoryTagResponseBodyResultSignature getSignature() {
            return this.signature;
        }

        public GetRepositoryTagResponseBodyResult setCommit(GetRepositoryTagResponseBodyResultCommit commit) {
            this.commit = commit;
            return this;
        }
        public GetRepositoryTagResponseBodyResultCommit getCommit() {
            return this.commit;
        }

        public GetRepositoryTagResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetRepositoryTagResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepositoryTagResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
