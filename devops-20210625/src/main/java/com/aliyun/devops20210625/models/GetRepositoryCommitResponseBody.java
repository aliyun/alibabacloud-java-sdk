// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryCommitResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
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
     * <p>A7586FEB-E48D-5579-983F-74981FBFF627</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetRepositoryCommitResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
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

    public static class GetRepositoryCommitResponseBodyResultAuthor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c4ef67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c4ef67f1bea827c4/w/100/h/100</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>19927</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>test-nickname</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("websiteUrl")
        public String websiteUrl;

        public static GetRepositoryCommitResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryCommitResponseBodyResultAuthor self = new GetRepositoryCommitResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public GetRepositoryCommitResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetRepositoryCommitResponseBodyResultAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetRepositoryCommitResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRepositoryCommitResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepositoryCommitResponseBodyResultAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetRepositoryCommitResponseBodyResultAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetRepositoryCommitResponseBodyResultAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

    }

    public static class GetRepositoryCommitResponseBodyResultCommitter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c4ef67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c4ef67f1bea827c4/w/100/h/100</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>24661</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>committer-codeup</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>nickname</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("websiteUrl")
        public String websiteUrl;

        public static GetRepositoryCommitResponseBodyResultCommitter build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryCommitResponseBodyResultCommitter self = new GetRepositoryCommitResponseBodyResultCommitter();
            return TeaModel.build(map, self);
        }

        public GetRepositoryCommitResponseBodyResultCommitter setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetRepositoryCommitResponseBodyResultCommitter setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetRepositoryCommitResponseBodyResultCommitter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRepositoryCommitResponseBodyResultCommitter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepositoryCommitResponseBodyResultCommitter setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetRepositoryCommitResponseBodyResultCommitter setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetRepositoryCommitResponseBodyResultCommitter setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

    }

    public static class GetRepositoryCommitResponseBodyResultSignature extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>34d2c47c7ce46a5c4639c5ffe208</p>
         */
        @NameInMap("gpgKeyId")
        public String gpgKeyId;

        /**
         * <strong>example:</strong>
         * <p>verified</p>
         */
        @NameInMap("verificationStatus")
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
        @NameInMap("author")
        public GetRepositoryCommitResponseBodyResultAuthor author;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("authorEmail")
        public String authorEmail;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("authorName")
        public String authorName;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 15:00:00</p>
         */
        @NameInMap("authoredDate")
        public String authoredDate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("commentsCount")
        public Long commentsCount;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 15:00:02</p>
         */
        @NameInMap("committedDate")
        public String committedDate;

        @NameInMap("committer")
        public GetRepositoryCommitResponseBodyResultCommitter committer;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("committerEmail")
        public String committerEmail;

        /**
         * <strong>example:</strong>
         * <p>committer-codeup</p>
         */
        @NameInMap("committerName")
        public String committerName;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>ff4fb5ac6d1f44f452654336d2dba468ae6c8d04</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        @NameInMap("parentIds")
        public java.util.List<String> parentIds;

        /**
         * <strong>example:</strong>
         * <p>ff4fb5ac</p>
         */
        @NameInMap("shortId")
        public String shortId;

        @NameInMap("signature")
        public GetRepositoryCommitResponseBodyResultSignature signature;

        @NameInMap("title")
        public String title;

        public static GetRepositoryCommitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryCommitResponseBodyResult self = new GetRepositoryCommitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRepositoryCommitResponseBodyResult setAuthor(GetRepositoryCommitResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public GetRepositoryCommitResponseBodyResultAuthor getAuthor() {
            return this.author;
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

        public GetRepositoryCommitResponseBodyResult setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public GetRepositoryCommitResponseBodyResult setCommentsCount(Long commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }
        public Long getCommentsCount() {
            return this.commentsCount;
        }

        public GetRepositoryCommitResponseBodyResult setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetRepositoryCommitResponseBodyResult setCommitter(GetRepositoryCommitResponseBodyResultCommitter committer) {
            this.committer = committer;
            return this;
        }
        public GetRepositoryCommitResponseBodyResultCommitter getCommitter() {
            return this.committer;
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
