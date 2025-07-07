// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateAccountAliasRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("AppName")
    public String appName;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnterpriseAccountUpdateAccountAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateAccountAliasRequest self = new EnterpriseAccountUpdateAccountAliasRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateAccountAliasRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public EnterpriseAccountUpdateAccountAliasRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseAccountUpdateAccountAliasRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseAccountUpdateAccountAliasRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountUpdateAccountAliasRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountUpdateAccountAliasRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountUpdateAccountAliasRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public EnterpriseAccountUpdateAccountAliasRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
