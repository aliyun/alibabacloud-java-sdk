// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetRepositoryTagV2ResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public GetRepositoryTagV2ResponseBodyResult result;

    public static GetRepositoryTagV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryTagV2ResponseBody self = new GetRepositoryTagV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepositoryTagV2ResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRepositoryTagV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepositoryTagV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRepositoryTagV2ResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRepositoryTagV2ResponseBody setResult(GetRepositoryTagV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRepositoryTagV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRepositoryTagV2ResponseBodyResultCommitSignature extends TeaModel {
        @NameInMap("VerificationStatus")
        public String verificationStatus;

        @NameInMap("GpgKeyId")
        public String gpgKeyId;

        public static GetRepositoryTagV2ResponseBodyResultCommitSignature build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagV2ResponseBodyResultCommitSignature self = new GetRepositoryTagV2ResponseBodyResultCommitSignature();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagV2ResponseBodyResultCommitSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        public GetRepositoryTagV2ResponseBodyResultCommitSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

    }

    public static class GetRepositoryTagV2ResponseBodyResultCommit extends TeaModel {
        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("AuthoredDate")
        public String authoredDate;

        @NameInMap("Title")
        public String title;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("Id")
        public String id;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("CommittedDate")
        public String committedDate;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        @NameInMap("Signature")
        public GetRepositoryTagV2ResponseBodyResultCommitSignature signature;

        public static GetRepositoryTagV2ResponseBodyResultCommit build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagV2ResponseBodyResultCommit self = new GetRepositoryTagV2ResponseBodyResultCommit();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public GetRepositoryTagV2ResponseBodyResultCommit setSignature(GetRepositoryTagV2ResponseBodyResultCommitSignature signature) {
            this.signature = signature;
            return this;
        }
        public GetRepositoryTagV2ResponseBodyResultCommitSignature getSignature() {
            return this.signature;
        }

    }

    public static class GetRepositoryTagV2ResponseBodyResultSignature extends TeaModel {
        @NameInMap("VerificationStatus")
        public String verificationStatus;

        @NameInMap("GpgKeyId")
        public String gpgKeyId;

        public static GetRepositoryTagV2ResponseBodyResultSignature build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagV2ResponseBodyResultSignature self = new GetRepositoryTagV2ResponseBodyResultSignature();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagV2ResponseBodyResultSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        public GetRepositoryTagV2ResponseBodyResultSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

    }

    public static class GetRepositoryTagV2ResponseBodyResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("Commit")
        public GetRepositoryTagV2ResponseBodyResultCommit commit;

        @NameInMap("Signature")
        public GetRepositoryTagV2ResponseBodyResultSignature signature;

        public static GetRepositoryTagV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryTagV2ResponseBodyResult self = new GetRepositoryTagV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRepositoryTagV2ResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetRepositoryTagV2ResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepositoryTagV2ResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRepositoryTagV2ResponseBodyResult setCommit(GetRepositoryTagV2ResponseBodyResultCommit commit) {
            this.commit = commit;
            return this;
        }
        public GetRepositoryTagV2ResponseBodyResultCommit getCommit() {
            return this.commit;
        }

        public GetRepositoryTagV2ResponseBodyResult setSignature(GetRepositoryTagV2ResponseBodyResultSignature signature) {
            this.signature = signature;
            return this;
        }
        public GetRepositoryTagV2ResponseBodyResultSignature getSignature() {
            return this.signature;
        }

    }

}
