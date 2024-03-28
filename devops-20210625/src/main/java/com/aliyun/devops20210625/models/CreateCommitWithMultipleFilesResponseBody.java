// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommitWithMultipleFilesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateCommitWithMultipleFilesResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CreateCommitWithMultipleFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitWithMultipleFilesResponseBody self = new CreateCommitWithMultipleFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommitWithMultipleFilesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateCommitWithMultipleFilesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateCommitWithMultipleFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommitWithMultipleFilesResponseBody setResult(CreateCommitWithMultipleFilesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateCommitWithMultipleFilesResponseBodyResult getResult() {
        return this.result;
    }

    public CreateCommitWithMultipleFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCommitWithMultipleFilesResponseBodyResultAuthor extends TeaModel {
        @NameInMap("aliyunPk")
        public String aliyunPk;

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

        public static CreateCommitWithMultipleFilesResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            CreateCommitWithMultipleFilesResponseBodyResultAuthor self = new CreateCommitWithMultipleFilesResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public CreateCommitWithMultipleFilesResponseBodyResultAuthor setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

    }

    public static class CreateCommitWithMultipleFilesResponseBodyResultCommitter extends TeaModel {
        @NameInMap("aliyunPk")
        public String aliyunPk;

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

        public static CreateCommitWithMultipleFilesResponseBodyResultCommitter build(java.util.Map<String, ?> map) throws Exception {
            CreateCommitWithMultipleFilesResponseBodyResultCommitter self = new CreateCommitWithMultipleFilesResponseBodyResultCommitter();
            return TeaModel.build(map, self);
        }

        public CreateCommitWithMultipleFilesResponseBodyResultCommitter setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultCommitter setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultCommitter setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultCommitter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultCommitter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultCommitter setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultCommitter setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateCommitWithMultipleFilesResponseBodyResultCommitter setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

    }

    public static class CreateCommitWithMultipleFilesResponseBodyResult extends TeaModel {
        @NameInMap("author")
        public CreateCommitWithMultipleFilesResponseBodyResultAuthor author;

        @NameInMap("authorEmail")
        public String authorEmail;

        @NameInMap("authorName")
        public String authorName;

        @NameInMap("authoredDate")
        public String authoredDate;

        @NameInMap("committedDate")
        public String committedDate;

        @NameInMap("committer")
        public CreateCommitWithMultipleFilesResponseBodyResultCommitter committer;

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

        @NameInMap("title")
        public String title;

        public static CreateCommitWithMultipleFilesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateCommitWithMultipleFilesResponseBodyResult self = new CreateCommitWithMultipleFilesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setAuthor(CreateCommitWithMultipleFilesResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public CreateCommitWithMultipleFilesResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setCommitter(CreateCommitWithMultipleFilesResponseBodyResultCommitter committer) {
            this.committer = committer;
            return this;
        }
        public CreateCommitWithMultipleFilesResponseBodyResultCommitter getCommitter() {
            return this.committer;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public CreateCommitWithMultipleFilesResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
