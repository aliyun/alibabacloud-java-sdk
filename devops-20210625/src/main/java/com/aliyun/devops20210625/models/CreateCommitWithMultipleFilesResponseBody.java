// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommitWithMultipleFilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>A7586FEB-E48D-5579-983F-74981FBFF627</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateCommitWithMultipleFilesResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>284692704493684695</p>
         */
        @NameInMap("aliyunPk")
        public String aliyunPk;

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
         * <p>test-codeup</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>235671547828975455</p>
         */
        @NameInMap("aliyunPk")
        public String aliyunPk;

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
         * <p>committer-codeup</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
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
         * <p>2022-03-18 16:00:00</p>
         */
        @NameInMap("committedDate")
        public String committedDate;

        @NameInMap("committer")
        public CreateCommitWithMultipleFilesResponseBodyResultCommitter committer;

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
         * <p>de02b625ba8488f92eb204bcb3773a40c1b4ddac</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        @NameInMap("parentIds")
        public java.util.List<String> parentIds;

        /**
         * <strong>example:</strong>
         * <p>de02b625</p>
         */
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
