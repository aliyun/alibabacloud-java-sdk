// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgQueryLoadTreeRequest extends TeaModel {
    @NameInMap("EncryptTicket")
    public String encryptTicket;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LoadOrgOnly")
    public Boolean loadOrgOnly;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CF20ED94-D406-512F-9798-4E1F65720BF6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnterpriseOrgQueryLoadTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgQueryLoadTreeRequest self = new EnterpriseOrgQueryLoadTreeRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgQueryLoadTreeRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseOrgQueryLoadTreeRequest setLoadOrgOnly(Boolean loadOrgOnly) {
        this.loadOrgOnly = loadOrgOnly;
        return this;
    }
    public Boolean getLoadOrgOnly() {
        return this.loadOrgOnly;
    }

    public EnterpriseOrgQueryLoadTreeRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseOrgQueryLoadTreeRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseOrgQueryLoadTreeRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseOrgQueryLoadTreeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
