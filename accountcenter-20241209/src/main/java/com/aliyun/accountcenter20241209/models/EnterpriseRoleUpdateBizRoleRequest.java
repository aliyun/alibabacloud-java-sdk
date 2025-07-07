// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleUpdateBizRoleRequest extends TeaModel {
    @NameInMap("BizPermissionCodeListJson")
    public String bizPermissionCodeListJson;

    @NameInMap("BizRoleCode")
    public String bizRoleCode;

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

    public static EnterpriseRoleUpdateBizRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleUpdateBizRoleRequest self = new EnterpriseRoleUpdateBizRoleRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleUpdateBizRoleRequest setBizPermissionCodeListJson(String bizPermissionCodeListJson) {
        this.bizPermissionCodeListJson = bizPermissionCodeListJson;
        return this;
    }
    public String getBizPermissionCodeListJson() {
        return this.bizPermissionCodeListJson;
    }

    public EnterpriseRoleUpdateBizRoleRequest setBizRoleCode(String bizRoleCode) {
        this.bizRoleCode = bizRoleCode;
        return this;
    }
    public String getBizRoleCode() {
        return this.bizRoleCode;
    }

    public EnterpriseRoleUpdateBizRoleRequest setBizRoleDesc(String bizRoleDesc) {
        this.bizRoleDesc = bizRoleDesc;
        return this;
    }
    public String getBizRoleDesc() {
        return this.bizRoleDesc;
    }

    public EnterpriseRoleUpdateBizRoleRequest setBizRoleName(String bizRoleName) {
        this.bizRoleName = bizRoleName;
        return this;
    }
    public String getBizRoleName() {
        return this.bizRoleName;
    }

    public EnterpriseRoleUpdateBizRoleRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseRoleUpdateBizRoleRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseRoleUpdateBizRoleRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseRoleUpdateBizRoleRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

}
