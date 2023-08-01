// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoryCommitsResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    public static ListRepositoryCommitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCommitsResponseBody self = new ListRepositoryCommitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCommitsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryCommitsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryCommitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryCommitsResponseBody setResult(java.util.List<ListRepositoryCommitsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryCommitsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryCommitsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryCommitsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRepositoryCommitsResponseBodyResultAuthor extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        @NameInMap("websiteUrl")
        public String websiteUrl;

        public static ListRepositoryCommitsResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCommitsResponseBodyResultAuthor self = new ListRepositoryCommitsResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCommitsResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoryCommitsResponseBodyResultAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListRepositoryCommitsResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryCommitsResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryCommitsResponseBodyResultAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRepositoryCommitsResponseBodyResultAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListRepositoryCommitsResponseBodyResultAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

    }

    public static class ListRepositoryCommitsResponseBodyResultCommitter extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        @NameInMap("websiteUrl")
        public String websiteUrl;

        public static ListRepositoryCommitsResponseBodyResultCommitter build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCommitsResponseBodyResultCommitter self = new ListRepositoryCommitsResponseBodyResultCommitter();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCommitsResponseBodyResultCommitter setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoryCommitsResponseBodyResultCommitter setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListRepositoryCommitsResponseBodyResultCommitter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryCommitsResponseBodyResultCommitter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryCommitsResponseBodyResultCommitter setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRepositoryCommitsResponseBodyResultCommitter setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListRepositoryCommitsResponseBodyResultCommitter setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

    }

    public static class ListRepositoryCommitsResponseBodyResultSignature extends TeaModel {
        @NameInMap("gpgKeyId")
        public String gpgKeyId;

        @NameInMap("verificationStatus")
        public String verificationStatus;

        public static ListRepositoryCommitsResponseBodyResultSignature build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCommitsResponseBodyResultSignature self = new ListRepositoryCommitsResponseBodyResultSignature();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCommitsResponseBodyResultSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public ListRepositoryCommitsResponseBodyResultSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class ListRepositoryCommitsResponseBodyResult extends TeaModel {
        @NameInMap("author")
        public ListRepositoryCommitsResponseBodyResultAuthor author;

        @NameInMap("authorEmail")
        public String authorEmail;

        @NameInMap("authorName")
        public String authorName;

        @NameInMap("authoredDate")
        public String authoredDate;

        @NameInMap("commentsCount")
        public Long commentsCount;

        @NameInMap("committedDate")
        public String committedDate;

        @NameInMap("committer")
        public ListRepositoryCommitsResponseBodyResultCommitter committer;

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
        public ListRepositoryCommitsResponseBodyResultSignature signature;

        @NameInMap("title")
        public String title;

        public static ListRepositoryCommitsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCommitsResponseBodyResult self = new ListRepositoryCommitsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCommitsResponseBodyResult setAuthor(ListRepositoryCommitsResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public ListRepositoryCommitsResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public ListRepositoryCommitsResponseBodyResult setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ListRepositoryCommitsResponseBodyResult setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ListRepositoryCommitsResponseBodyResult setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public ListRepositoryCommitsResponseBodyResult setCommentsCount(Long commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }
        public Long getCommentsCount() {
            return this.commentsCount;
        }

        public ListRepositoryCommitsResponseBodyResult setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public ListRepositoryCommitsResponseBodyResult setCommitter(ListRepositoryCommitsResponseBodyResultCommitter committer) {
            this.committer = committer;
            return this;
        }
        public ListRepositoryCommitsResponseBodyResultCommitter getCommitter() {
            return this.committer;
        }

        public ListRepositoryCommitsResponseBodyResult setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ListRepositoryCommitsResponseBodyResult setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ListRepositoryCommitsResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoryCommitsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRepositoryCommitsResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryCommitsResponseBodyResult setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public ListRepositoryCommitsResponseBodyResult setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ListRepositoryCommitsResponseBodyResult setSignature(ListRepositoryCommitsResponseBodyResultSignature signature) {
            this.signature = signature;
            return this;
        }
        public ListRepositoryCommitsResponseBodyResultSignature getSignature() {
            return this.signature;
        }

        public ListRepositoryCommitsResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
