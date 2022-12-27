// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryTagResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetRepositoryTagResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static GetRepositoryTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryTagResponseBody self = new GetRepositoryTagResponseBody();
        return TeaModel.build(map, self);
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

    public GetRepositoryTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepositoryTagResponseBody setResult(GetRepositoryTagResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRepositoryTagResponseBodyResult getResult() {
        return this.result;
    }

    public GetRepositoryTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRepositoryTagResponseBodyResultCommitSignature extends TeaModel {
        @NameInMap("gpgKeyId")
        public String gpgKeyId;

        @NameInMap("verificationStatus")
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
        @NameInMap("authorEmail")
        public String authorEmail;

        @NameInMap("authorName")
        public String authorName;

        @NameInMap("authoredDate")
        public String authoredDate;

        @NameInMap("committedDate")
        public String committedDate;

        @NameInMap("committerEmail")
        public String committerEmail;

        @NameInMap("committerName")
        public String committerName;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        @NameInMap("parentIds")
        public java.util.List<String> parentIds;

        @NameInMap("shortId")
        public String shortId;

        @NameInMap("signature")
        public GetRepositoryTagResponseBodyResultCommitSignature signature;

        @NameInMap("title")
        public String title;

        public static GetRepositoryTagResponseBodyResultCommit build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagResponseBodyResultCommit self = new GetRepositoryTagResponseBodyResultCommit();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagResponseBodyResultCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetRepositoryTagResponseBodyResultCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetRepositoryTagResponseBodyResultCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public GetRepositoryTagResponseBodyResultCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetRepositoryTagResponseBodyResultCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetRepositoryTagResponseBodyResultCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetRepositoryTagResponseBodyResultCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryTagResponseBodyResultCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRepositoryTagResponseBodyResultCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetRepositoryTagResponseBodyResultCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public GetRepositoryTagResponseBodyResultCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetRepositoryTagResponseBodyResultCommit setSignature(GetRepositoryTagResponseBodyResultCommitSignature signature) {
            this.signature = signature;
            return this;
        }
        public GetRepositoryTagResponseBodyResultCommitSignature getSignature() {
            return this.signature;
        }

        public GetRepositoryTagResponseBodyResultCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetRepositoryTagResponseBodyResult extends TeaModel {
        @NameInMap("commit")
        public GetRepositoryTagResponseBodyResultCommit commit;

        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        @NameInMap("name")
        public String name;

        public static GetRepositoryTagResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagResponseBodyResult self = new GetRepositoryTagResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagResponseBodyResult setCommit(GetRepositoryTagResponseBodyResultCommit commit) {
            this.commit = commit;
            return this;
        }
        public GetRepositoryTagResponseBodyResultCommit getCommit() {
            return this.commit;
        }

        public GetRepositoryTagResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

    }

}
