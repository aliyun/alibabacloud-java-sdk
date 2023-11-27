// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class AddGroupMembersRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        @NameInMap("JoinTime")
        public Long joinTime;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Role")
        public Integer role;

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

        public AddGroupMembersRequestRequestParamsInitMembers setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public AddGroupMembersRequestRequestParamsInitMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public AddGroupMembersRequestRequestParamsInitMembers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public AddGroupMembersRequestRequestParamsInitMembers setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

    public static class AddGroupMembersRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("InitMembers")
        public java.util.List<AddGroupMembersRequestRequestParamsInitMembers> initMembers;

        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        public static AddGroupMembersRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            AddGroupMembersRequestRequestParams self = new AddGroupMembersRequestRequestParams();
            return TeaModel.build(map, self);
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

        public AddGroupMembersRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

    }

}
