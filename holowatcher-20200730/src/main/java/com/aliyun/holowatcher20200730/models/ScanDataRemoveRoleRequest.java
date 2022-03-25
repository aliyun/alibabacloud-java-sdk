// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataRemoveRoleRequest extends TeaModel {
    // 业务幂等编号，用于幂等处理
    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    // 移除角色的项目ID，必须是开放平台图对应source创建的项目
    @NameInMap("ProjectId")
    public Long projectId;

    // removeUserDataRequest
    @NameInMap("RemoveUserDataRequest")
    public ScanDataRemoveRoleRequestRemoveUserDataRequest removeUserDataRequest;

    // 移除角色名称，本次只支持PROJECT_MANAGER
    @NameInMap("RoleName")
    public String roleName;

    // 数据请求来源，目前只支持广州三维家3VJIA
    @NameInMap("Source")
    public String source;

    public static ScanDataRemoveRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanDataRemoveRoleRequest self = new ScanDataRemoveRoleRequest();
        return TeaModel.build(map, self);
    }

    public ScanDataRemoveRoleRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ScanDataRemoveRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ScanDataRemoveRoleRequest setRemoveUserDataRequest(ScanDataRemoveRoleRequestRemoveUserDataRequest removeUserDataRequest) {
        this.removeUserDataRequest = removeUserDataRequest;
        return this;
    }
    public ScanDataRemoveRoleRequestRemoveUserDataRequest getRemoveUserDataRequest() {
        return this.removeUserDataRequest;
    }

    public ScanDataRemoveRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ScanDataRemoveRoleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public static class ScanDataRemoveRoleRequestRemoveUserDataRequest extends TeaModel {
        // 会员手机号码
        @NameInMap("UserMobNum")
        public String userMobNum;

        // 会员昵称
        @NameInMap("UserNick")
        public String userNick;

        // 会员类型，目前只支持TB淘宝
        @NameInMap("UserType")
        public String userType;

        public static ScanDataRemoveRoleRequestRemoveUserDataRequest build(java.util.Map<String, ?> map) throws Exception {
            ScanDataRemoveRoleRequestRemoveUserDataRequest self = new ScanDataRemoveRoleRequestRemoveUserDataRequest();
            return TeaModel.build(map, self);
        }

        public ScanDataRemoveRoleRequestRemoveUserDataRequest setUserMobNum(String userMobNum) {
            this.userMobNum = userMobNum;
            return this;
        }
        public String getUserMobNum() {
            return this.userMobNum;
        }

        public ScanDataRemoveRoleRequestRemoveUserDataRequest setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public ScanDataRemoveRoleRequestRemoveUserDataRequest setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
