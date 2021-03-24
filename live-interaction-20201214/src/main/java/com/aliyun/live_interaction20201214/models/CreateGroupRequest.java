// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 创建群聊请求实体
    @NameInMap("RequestParams")
    public CreateGroupRequestRequestParams requestParams;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateGroupRequest setRequestParams(CreateGroupRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public CreateGroupRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class CreateGroupRequestRequestParamsInitMembers extends TeaModel {
        @NameInMap("AppUid")
        public String appUid;

        // 1群主，2管理员，3普通
        @NameInMap("Role")
        public Integer role;

        @NameInMap("Nick")
        public String nick;

        // unix时间毫秒数
        @NameInMap("JoinTime")
        public Long joinTime;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static CreateGroupRequestRequestParamsInitMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupRequestRequestParamsInitMembers self = new CreateGroupRequestRequestParamsInitMembers();
            return TeaModel.build(map, self);
        }

        public CreateGroupRequestRequestParamsInitMembers setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public CreateGroupRequestRequestParamsInitMembers setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public CreateGroupRequestRequestParamsInitMembers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public CreateGroupRequestRequestParamsInitMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public CreateGroupRequestRequestParamsInitMembers setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

    public static class CreateGroupRequestRequestParams extends TeaModel {
        // UUID(不可重复)
        @NameInMap("Uuid")
        public String uuid;

        // 创建者
        @NameInMap("CreatorAppUid")
        public String creatorAppUid;

        // 群标题
        @NameInMap("Title")
        public String title;

        // 图标的id
        @NameInMap("IconMediaId")
        public String iconMediaId;

        // 拓展字段
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        // 初始化成员
        @NameInMap("InitMembers")
        public java.util.List<CreateGroupRequestRequestParamsInitMembers> initMembers;

        public static CreateGroupRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupRequestRequestParams self = new CreateGroupRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public CreateGroupRequestRequestParams setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public CreateGroupRequestRequestParams setCreatorAppUid(String creatorAppUid) {
            this.creatorAppUid = creatorAppUid;
            return this;
        }
        public String getCreatorAppUid() {
            return this.creatorAppUid;
        }

        public CreateGroupRequestRequestParams setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateGroupRequestRequestParams setIconMediaId(String iconMediaId) {
            this.iconMediaId = iconMediaId;
            return this;
        }
        public String getIconMediaId() {
            return this.iconMediaId;
        }

        public CreateGroupRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public CreateGroupRequestRequestParams setInitMembers(java.util.List<CreateGroupRequestRequestParamsInitMembers> initMembers) {
            this.initMembers = initMembers;
            return this;
        }
        public java.util.List<CreateGroupRequestRequestParamsInitMembers> getInitMembers() {
            return this.initMembers;
        }

    }

}
