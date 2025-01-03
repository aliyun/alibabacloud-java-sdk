// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetBranchInfoResponseBody extends TeaModel {
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
     * <p>6177543A-8D54-5736-A93B-E0195A1512CB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetBranchInfoResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
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

    public static class GetBranchInfoResponseBodyResultCommitAuthor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
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
         * <p>28056</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>codeup-test</p>
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
         * <p>testtest</p>
         */
        @NameInMap("username")
        public String username;

        public static GetBranchInfoResponseBodyResultCommitAuthor build(java.util.Map<String, ?> map) throws Exception {
            GetBranchInfoResponseBodyResultCommitAuthor self = new GetBranchInfoResponseBodyResultCommitAuthor();
            return TeaModel.build(map, self);
        }

        public GetBranchInfoResponseBodyResultCommitAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetBranchInfoResponseBodyResultCommitAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetBranchInfoResponseBodyResultCommitAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBranchInfoResponseBodyResultCommitAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBranchInfoResponseBodyResultCommitAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetBranchInfoResponseBodyResultCommitAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetBranchInfoResponseBodyResultCommitCommitter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
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
         * <p>5035</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>codeup-commit</p>
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
         * <p>commitcommit</p>
         */
        @NameInMap("username")
        public String username;

        public static GetBranchInfoResponseBodyResultCommitCommitter build(java.util.Map<String, ?> map) throws Exception {
            GetBranchInfoResponseBodyResultCommitCommitter self = new GetBranchInfoResponseBodyResultCommitCommitter();
            return TeaModel.build(map, self);
        }

        public GetBranchInfoResponseBodyResultCommitCommitter setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetBranchInfoResponseBodyResultCommitCommitter setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetBranchInfoResponseBodyResultCommitCommitter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBranchInfoResponseBodyResultCommitCommitter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBranchInfoResponseBodyResultCommitCommitter setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetBranchInfoResponseBodyResultCommitCommitter setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetBranchInfoResponseBodyResultCommitSignature extends TeaModel {
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

        public static GetBranchInfoResponseBodyResultCommitSignature build(java.util.Map<String, ?> map) throws Exception {
            GetBranchInfoResponseBodyResultCommitSignature self = new GetBranchInfoResponseBodyResultCommitSignature();
            return TeaModel.build(map, self);
        }

        public GetBranchInfoResponseBodyResultCommitSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public GetBranchInfoResponseBodyResultCommitSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class GetBranchInfoResponseBodyResultCommit extends TeaModel {
        @NameInMap("author")
        public GetBranchInfoResponseBodyResultCommitAuthor author;

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
         * <p>0</p>
         */
        @NameInMap("commentsCount")
        public Long commentsCount;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 09:00:00</p>
         */
        @NameInMap("committedDate")
        public String committedDate;

        @NameInMap("committer")
        public GetBranchInfoResponseBodyResultCommitCommitter committer;

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
        public GetBranchInfoResponseBodyResultCommitSignature signature;

        @NameInMap("title")
        public String title;

        public static GetBranchInfoResponseBodyResultCommit build(java.util.Map<String, ?> map) throws Exception {
            GetBranchInfoResponseBodyResultCommit self = new GetBranchInfoResponseBodyResultCommit();
            return TeaModel.build(map, self);
        }

        public GetBranchInfoResponseBodyResultCommit setAuthor(GetBranchInfoResponseBodyResultCommitAuthor author) {
            this.author = author;
            return this;
        }
        public GetBranchInfoResponseBodyResultCommitAuthor getAuthor() {
            return this.author;
        }

        public GetBranchInfoResponseBodyResultCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetBranchInfoResponseBodyResultCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetBranchInfoResponseBodyResultCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public GetBranchInfoResponseBodyResultCommit setCommentsCount(Long commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }
        public Long getCommentsCount() {
            return this.commentsCount;
        }

        public GetBranchInfoResponseBodyResultCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetBranchInfoResponseBodyResultCommit setCommitter(GetBranchInfoResponseBodyResultCommitCommitter committer) {
            this.committer = committer;
            return this;
        }
        public GetBranchInfoResponseBodyResultCommitCommitter getCommitter() {
            return this.committer;
        }

        public GetBranchInfoResponseBodyResultCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetBranchInfoResponseBodyResultCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetBranchInfoResponseBodyResultCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetBranchInfoResponseBodyResultCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBranchInfoResponseBodyResultCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetBranchInfoResponseBodyResultCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public GetBranchInfoResponseBodyResultCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetBranchInfoResponseBodyResultCommit setSignature(GetBranchInfoResponseBodyResultCommitSignature signature) {
            this.signature = signature;
            return this;
        }
        public GetBranchInfoResponseBodyResultCommitSignature getSignature() {
            return this.signature;
        }

        public GetBranchInfoResponseBodyResultCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetBranchInfoResponseBodyResult extends TeaModel {
        @NameInMap("commit")
        public GetBranchInfoResponseBodyResultCommit commit;

        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("protected")
        public String _protected;

        public static GetBranchInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetBranchInfoResponseBodyResult self = new GetBranchInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetBranchInfoResponseBodyResult setCommit(GetBranchInfoResponseBodyResultCommit commit) {
            this.commit = commit;
            return this;
        }
        public GetBranchInfoResponseBodyResultCommit getCommit() {
            return this.commit;
        }

        public GetBranchInfoResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBranchInfoResponseBodyResult set_protected(String _protected) {
            this._protected = _protected;
            return this;
        }
        public String get_protected() {
            return this._protected;
        }

    }

}
