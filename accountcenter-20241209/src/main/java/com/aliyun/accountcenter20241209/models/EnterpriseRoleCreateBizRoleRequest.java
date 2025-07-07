// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleCreateBizRoleRequest extends TeaModel {
    @NameInMap("BizPermissionCodeListJson")
    public String bizPermissionCodeListJson;

    @NameInMap("BizRoleDesc")
    public String bizRoleDesc;

    @NameInMap("BizRoleName")
    public String bizRoleName;

    @NameInMap("EncryptTicket")
    public String encryptTicket;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static EnterpriseRoleCreateBizRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleCreateBizRoleRequest self = new EnterpriseRoleCreateBizRoleRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleCreateBizRoleRequest setBizPermissionCodeListJson(String bizPermissionCodeListJson) {
        this.bizPermissionCodeListJson = bizPermissionCodeListJson;
        return this;
    }
    public String getBizPermissionCodeListJson() {
        return this.bizPermissionCodeListJson;
    }

    public EnterpriseRoleCreateBizRoleRequest setBizRoleDesc(String bizRoleDesc) {
        this.bizRoleDesc = bizRoleDesc;
        return this;
    }
    public String getBizRoleDesc() {
        return this.bizRoleDesc;
    }

    public EnterpriseRoleCreateBizRoleRequest setBizRoleName(String bizRoleName) {
        this.bizRoleName = bizRoleName;
        return this;
    }
    public String getBizRoleName() {
        return this.bizRoleName;
    }

    public EnterpriseRoleCreateBizRoleRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseRoleCreateBizRoleRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseRoleCreateBizRoleRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseRoleCreateBizRoleRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseRoleCreateBizRoleRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
