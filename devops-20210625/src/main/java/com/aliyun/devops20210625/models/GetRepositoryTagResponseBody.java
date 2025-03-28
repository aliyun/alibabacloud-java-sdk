// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>CE7353E3-F989-56A9-B97C-897ABBDB9A01</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetRepositoryTagResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("gpgKeyId")
        public String gpgKeyId;

        /**
         * <strong>example:</strong>
         * <p>verified</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("authorEmail")
        public String authorEmail;

        @NameInMap("authorName")
        public String authorName;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 08:00:00</p>
         */
        @NameInMap("authoredDate")
        public String authoredDate;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 09:00:00</p>
         */
        @NameInMap("committedDate")
        public String committedDate;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("committerEmail")
        public String committerEmail;

        @NameInMap("committerName")
        public String committerName;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 10:00:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>e0297d8fb0393c833a8531e7cc8832739e3cba6d</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        @NameInMap("parentIds")
        public java.util.List<String> parentIds;

        /**
         * <strong>example:</strong>
         * <p>e0297d8f</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>9a494e7b88ca35cde00579af2df4ab46136c022e</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>tag v1.0</p>
         */
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
