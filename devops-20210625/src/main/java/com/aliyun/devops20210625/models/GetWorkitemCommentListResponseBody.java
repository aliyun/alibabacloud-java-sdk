// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemCommentListResponseBody extends TeaModel {
    @NameInMap("commentList")
    public java.util.List<GetWorkitemCommentListResponseBodyCommentList> commentList;

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

    public static GetWorkitemCommentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemCommentListResponseBody self = new GetWorkitemCommentListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkitemCommentListResponseBody setCommentList(java.util.List<GetWorkitemCommentListResponseBodyCommentList> commentList) {
        this.commentList = commentList;
        return this;
    }
    public java.util.List<GetWorkitemCommentListResponseBodyCommentList> getCommentList() {
        return this.commentList;
    }

    public GetWorkitemCommentListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkitemCommentListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetWorkitemCommentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkitemCommentListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetWorkitemCommentListResponseBodyCommentListUser extends TeaModel {
        @NameInMap("account")
        public String account;

        @NameInMap("avatar")
        public String avatar;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("realName")
        public String realName;

        public static GetWorkitemCommentListResponseBodyCommentListUser build(java.util.Map<String, ?> map) throws Exception {
            GetWorkitemCommentListResponseBodyCommentListUser self = new GetWorkitemCommentListResponseBodyCommentListUser();
            return TeaModel.build(map, self);
        }

        public GetWorkitemCommentListResponseBodyCommentListUser setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetWorkitemCommentListResponseBodyCommentListUser setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public GetWorkitemCommentListResponseBodyCommentListUser setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetWorkitemCommentListResponseBodyCommentListUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetWorkitemCommentListResponseBodyCommentListUser setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

    }

    public static class GetWorkitemCommentListResponseBodyCommentList extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("formatType")
        public String formatType;

        @NameInMap("id")
        public Long id;

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
        public GetWorkitemCommentListResponseBodyCommentListUser user;

        public static GetWorkitemCommentListResponseBodyCommentList build(java.util.Map<String, ?> map) throws Exception {
            GetWorkitemCommentListResponseBodyCommentList self = new GetWorkitemCommentListResponseBodyCommentList();
            return TeaModel.build(map, self);
        }

        public GetWorkitemCommentListResponseBodyCommentList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetWorkitemCommentListResponseBodyCommentList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkitemCommentListResponseBodyCommentList setFormatType(String formatType) {
            this.formatType = formatType;
            return this;
        }
        public String getFormatType() {
            return this.formatType;
        }

        public GetWorkitemCommentListResponseBodyCommentList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkitemCommentListResponseBodyCommentList setIsTop(Boolean isTop) {
            this.isTop = isTop;
            return this;
        }
        public Boolean getIsTop() {
            return this.isTop;
        }

        public GetWorkitemCommentListResponseBodyCommentList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetWorkitemCommentListResponseBodyCommentList setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetWorkitemCommentListResponseBodyCommentList setTargetIdentifier(String targetIdentifier) {
            this.targetIdentifier = targetIdentifier;
            return this;
        }
        public String getTargetIdentifier() {
            return this.targetIdentifier;
        }

        public GetWorkitemCommentListResponseBodyCommentList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetWorkitemCommentListResponseBodyCommentList setTopTime(Long topTime) {
            this.topTime = topTime;
            return this;
        }
        public Long getTopTime() {
            return this.topTime;
        }

        public GetWorkitemCommentListResponseBodyCommentList setUser(GetWorkitemCommentListResponseBodyCommentListUser user) {
            this.user = user;
            return this;
        }
        public GetWorkitemCommentListResponseBodyCommentListUser getUser() {
            return this.user;
        }

    }

}
