// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleQueryBizRoleDetailRequest extends TeaModel {
    @NameInMap("BizRoleCode")
    public String bizRoleCode;

    @NameInMap("EncryptTicket")
    public String encryptTicket;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    public static EnterpriseRoleQueryBizRoleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleQueryBizRoleDetailRequest self = new EnterpriseRoleQueryBizRoleDetailRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleQueryBizRoleDetailRequest setBizRoleCode(String bizRoleCode) {
        this.bizRoleCode = bizRoleCode;
        return this;
    }
    public String getBizRoleCode() {
        return this.bizRoleCode;
    }

    public EnterpriseRoleQueryBizRoleDetailRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseRoleQueryBizRoleDetailRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseRoleQueryBizRoleDetailRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseRoleQueryBizRoleDetailRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

}
