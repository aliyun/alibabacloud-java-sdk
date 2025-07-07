// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountSeparateEaRequest extends TeaModel {
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

    public static EnterpriseAccountSeparateEaRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountSeparateEaRequest self = new EnterpriseAccountSeparateEaRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountSeparateEaRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseAccountSeparateEaRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountSeparateEaRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountSeparateEaRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountSeparateEaRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
