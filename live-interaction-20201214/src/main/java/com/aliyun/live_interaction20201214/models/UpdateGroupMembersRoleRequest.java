// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateGroupMembersRoleRequest extends TeaModel {
    // App ID。IMPaaS租户的ID。
    @NameInMap("AppId")
    public String appId;

    // 更新群成员角色请求体。
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
        // 会话ID
        @NameInMap("AppCid")
        public String appCid;

        // 操作用户ID。
        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        // 更新后的成员角色。取值： 2：管理员。 3：普通。 100~127：自定义。 不能为1。
        @NameInMap("Role")
        public Integer role;

        // 需要更改的uids
        @NameInMap("AppUids")
        public java.util.List<String> appUids;

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

        public UpdateGroupMembersRoleRequestRequestParams setAppUids(java.util.List<String> appUids) {
            this.appUids = appUids;
            return this;
        }
        public java.util.List<String> getAppUids() {
            return this.appUids;
        }

    }

}
