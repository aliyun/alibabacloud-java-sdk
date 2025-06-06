// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateRepositoryMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
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
     * <p>F590C9D8-E908-5B6C-95AC-56B7E8011FFA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateRepositoryMemberResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateRepositoryMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepositoryMemberResponseBody self = new UpdateRepositoryMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRepositoryMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateRepositoryMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateRepositoryMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRepositoryMemberResponseBody setResult(UpdateRepositoryMemberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateRepositoryMemberResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateRepositoryMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRepositoryMemberResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("accessLevel")
        public Integer accessLevel;

        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@alibaba.com">test@alibaba.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>2020-08-08 08:08:08</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <strong>example:</strong>
         * <p>30815</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test_memeber_name</p>
         */
        @NameInMap("memberName")
        public String memberName;

        /**
         * <strong>example:</strong>
         * <p>USERS</p>
         */
        @NameInMap("memberType")
        public String memberType;

        /**
         * <strong>example:</strong>
         * <p>codeup</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>223241</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>codeup-test</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>web url</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("webUrl")
        public String webUrl;

        public static UpdateRepositoryMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateRepositoryMemberResponseBodyResult self = new UpdateRepositoryMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateRepositoryMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateRepositoryMemberResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateRepositoryMemberResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateRepositoryMemberResponseBodyResult setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public UpdateRepositoryMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateRepositoryMemberResponseBodyResult setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public UpdateRepositoryMemberResponseBodyResult setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public UpdateRepositoryMemberResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRepositoryMemberResponseBodyResult setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public UpdateRepositoryMemberResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateRepositoryMemberResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateRepositoryMemberResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateRepositoryMemberResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
