// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkitemCommentResponseBody extends TeaModel {
    @NameInMap("comment")
    public UpdateWorkitemCommentResponseBodyComment comment;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    public static UpdateWorkitemCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkitemCommentResponseBody self = new UpdateWorkitemCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkitemCommentResponseBody setComment(UpdateWorkitemCommentResponseBodyComment comment) {
        this.comment = comment;
        return this;
    }
    public UpdateWorkitemCommentResponseBodyComment getComment() {
        return this.comment;
    }

    public UpdateWorkitemCommentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateWorkitemCommentResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateWorkitemCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkitemCommentResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UpdateWorkitemCommentResponseBodyCommentUser extends TeaModel {
        @NameInMap("account")
        public String account;

        @NameInMap("avatar")
        public String avatar;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("realName")
        public String realName;

        public static UpdateWorkitemCommentResponseBodyCommentUser build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkitemCommentResponseBodyCommentUser self = new UpdateWorkitemCommentResponseBodyCommentUser();
            return TeaModel.build(map, self);
        }

        public UpdateWorkitemCommentResponseBodyCommentUser setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public UpdateWorkitemCommentResponseBodyCommentUser setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public UpdateWorkitemCommentResponseBodyCommentUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateWorkitemCommentResponseBodyCommentUser setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public UpdateWorkitemCommentResponseBodyCommentUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public UpdateWorkitemCommentResponseBodyCommentUser setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

    }

    public static class UpdateWorkitemCommentResponseBodyComment extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("formatType")
        public String formatType;

        @NameInMap("id")
        public String id;

        @NameInMap("isTop")
        public Boolean isTop;

        @NameInMap("modifiedTime")
        public Long modifiedTime;

        @NameInMap("parentId")
        public Long parentId;

        @NameInMap("targetIdentifier")
        public String targetIdentifier;

        @NameInMap("targetType")
        public String targetType;

        @NameInMap("topTime")
        public Long topTime;

        @NameInMap("user")
        public UpdateWorkitemCommentResponseBodyCommentUser user;

        public static UpdateWorkitemCommentResponseBodyComment build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkitemCommentResponseBodyComment self = new UpdateWorkitemCommentResponseBodyComment();
            return TeaModel.build(map, self);
        }

        public UpdateWorkitemCommentResponseBodyComment setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateWorkitemCommentResponseBodyComment setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateWorkitemCommentResponseBodyComment setFormatType(String formatType) {
            this.formatType = formatType;
            return this;
        }
        public String getFormatType() {
            return this.formatType;
        }

        public UpdateWorkitemCommentResponseBodyComment setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateWorkitemCommentResponseBodyComment setIsTop(Boolean isTop) {
            this.isTop = isTop;
            return this;
        }
        public Boolean getIsTop() {
            return this.isTop;
        }

        public UpdateWorkitemCommentResponseBodyComment setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public UpdateWorkitemCommentResponseBodyComment setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public UpdateWorkitemCommentResponseBodyComment setTargetIdentifier(String targetIdentifier) {
            this.targetIdentifier = targetIdentifier;
            return this;
        }
        public String getTargetIdentifier() {
            return this.targetIdentifier;
        }

        public UpdateWorkitemCommentResponseBodyComment setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public UpdateWorkitemCommentResponseBodyComment setTopTime(Long topTime) {
            this.topTime = topTime;
            return this;
        }
        public Long getTopTime() {
            return this.topTime;
        }

        public UpdateWorkitemCommentResponseBodyComment setUser(UpdateWorkitemCommentResponseBodyCommentUser user) {
            this.user = user;
            return this;
        }
        public UpdateWorkitemCommentResponseBodyCommentUser getUser() {
            return this.user;
        }

    }

}
