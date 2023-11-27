// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateGroupMembersRoleRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public UpdateGroupMembersRoleRequestRequestParams requestParams;

    public static UpdateGroupMembersRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupMembersRoleRequest self = new UpdateGroupMembersRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupMembersRoleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateGroupMembersRoleRequest setRequestParams(UpdateGroupMembersRoleRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public UpdateGroupMembersRoleRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class UpdateGroupMembersRoleRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("AppUids")
        public java.util.List<String> appUids;

        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        @NameInMap("Role")
        public Integer role;

        public static UpdateGroupMembersRoleRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupMembersRoleRequestRequestParams self = new UpdateGroupMembersRoleRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateGroupMembersRoleRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public UpdateGroupMembersRoleRequestRequestParams setAppUids(java.util.List<String> appUids) {
            this.appUids = appUids;
            return this;
        }
        public java.util.List<String> getAppUids() {
            return this.appUids;
        }

        public UpdateGroupMembersRoleRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

        public UpdateGroupMembersRoleRequestRequestParams setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

}
