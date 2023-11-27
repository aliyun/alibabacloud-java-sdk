// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        @NameInMap("JoinTime")
        public Long joinTime;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Role")
        public Integer role;

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

        public CreateGroupRequestRequestParamsInitMembers setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public CreateGroupRequestRequestParamsInitMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public CreateGroupRequestRequestParamsInitMembers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public CreateGroupRequestRequestParamsInitMembers setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

    public static class CreateGroupRequestRequestParams extends TeaModel {
        @NameInMap("CreatorAppUid")
        public String creatorAppUid;

        @NameInMap("EntranceId")
        public String entranceId;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        @NameInMap("IconMediaId")
        public String iconMediaId;

        @NameInMap("InitMembers")
        public java.util.List<CreateGroupRequestRequestParamsInitMembers> initMembers;

        @NameInMap("Title")
        public String title;

        @NameInMap("Uuid")
        public String uuid;

        public static CreateGroupRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupRequestRequestParams self = new CreateGroupRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public CreateGroupRequestRequestParams setCreatorAppUid(String creatorAppUid) {
            this.creatorAppUid = creatorAppUid;
            return this;
        }
        public String getCreatorAppUid() {
            return this.creatorAppUid;
        }

        public CreateGroupRequestRequestParams setEntranceId(String entranceId) {
            this.entranceId = entranceId;
            return this;
        }
        public String getEntranceId() {
            return this.entranceId;
        }

        public CreateGroupRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public CreateGroupRequestRequestParams setIconMediaId(String iconMediaId) {
            this.iconMediaId = iconMediaId;
            return this;
        }
        public String getIconMediaId() {
            return this.iconMediaId;
        }

        public CreateGroupRequestRequestParams setInitMembers(java.util.List<CreateGroupRequestRequestParamsInitMembers> initMembers) {
            this.initMembers = initMembers;
            return this;
        }
        public java.util.List<CreateGroupRequestRequestParamsInitMembers> getInitMembers() {
            return this.initMembers;
        }

        public CreateGroupRequestRequestParams setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateGroupRequestRequestParams setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
