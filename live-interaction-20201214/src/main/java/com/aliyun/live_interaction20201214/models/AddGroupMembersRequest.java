// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class AddGroupMembersRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 群加人请求实体
    @NameInMap("RequestParams")
    public AddGroupMembersRequestRequestParams requestParams;

    public static AddGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGroupMembersRequest self = new AddGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddGroupMembersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddGroupMembersRequest setRequestParams(AddGroupMembersRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public AddGroupMembersRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class AddGroupMembersRequestRequestParamsInitMembers extends TeaModel {
        @NameInMap("AppUid")
        public String appUid;

        // 1群主，2管理员，3普通
        @NameInMap("Role")
        public Integer role;

        @NameInMap("Nick")
        public String nick;

        // unix毫秒数
        @NameInMap("JoinTime")
        public Long joinTime;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static AddGroupMembersRequestRequestParamsInitMembers build(java.util.Map<String, ?> map) throws Exception {
            AddGroupMembersRequestRequestParamsInitMembers self = new AddGroupMembersRequestRequestParamsInitMembers();
            return TeaModel.build(map, self);
        }

        public AddGroupMembersRequestRequestParamsInitMembers setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public AddGroupMembersRequestRequestParamsInitMembers setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public AddGroupMembersRequestRequestParamsInitMembers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public AddGroupMembersRequestRequestParamsInitMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public AddGroupMembersRequestRequestParamsInitMembers setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

    public static class AddGroupMembersRequestRequestParams extends TeaModel {
        // 操作者
        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        // 会话id
        @NameInMap("AppCid")
        public String appCid;

        // 初始化成员
        @NameInMap("InitMembers")
        public java.util.List<AddGroupMembersRequestRequestParamsInitMembers> initMembers;

        public static AddGroupMembersRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            AddGroupMembersRequestRequestParams self = new AddGroupMembersRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public AddGroupMembersRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

        public AddGroupMembersRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public AddGroupMembersRequestRequestParams setInitMembers(java.util.List<AddGroupMembersRequestRequestParamsInitMembers> initMembers) {
            this.initMembers = initMembers;
            return this;
        }
        public java.util.List<AddGroupMembersRequestRequestParamsInitMembers> getInitMembers() {
            return this.initMembers;
        }

    }

}
