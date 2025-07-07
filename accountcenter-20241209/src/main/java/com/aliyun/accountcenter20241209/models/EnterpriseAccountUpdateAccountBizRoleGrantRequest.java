// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateAccountBizRoleGrantRequest extends TeaModel {
    @NameInMap("BizRoleCodeListJson")
    public String bizRoleCodeListJson;

    @NameInMap("EncryptTicket")
    public String encryptTicket;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    @NameInMap("Pk")
    public String pk;

    public static EnterpriseAccountUpdateAccountBizRoleGrantRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateAccountBizRoleGrantRequest self = new EnterpriseAccountUpdateAccountBizRoleGrantRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateAccountBizRoleGrantRequest setBizRoleCodeListJson(String bizRoleCodeListJson) {
        this.bizRoleCodeListJson = bizRoleCodeListJson;
        return this;
    }
    public String getBizRoleCodeListJson() {
        return this.bizRoleCodeListJson;
    }

    public EnterpriseAccountUpdateAccountBizRoleGrantRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseAccountUpdateAccountBizRoleGrantRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountUpdateAccountBizRoleGrantRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountUpdateAccountBizRoleGrantRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountUpdateAccountBizRoleGrantRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
