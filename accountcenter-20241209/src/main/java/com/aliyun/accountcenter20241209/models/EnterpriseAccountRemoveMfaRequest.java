// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountRemoveMfaRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public String pk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnterpriseAccountRemoveMfaRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountRemoveMfaRequest self = new EnterpriseAccountRemoveMfaRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountRemoveMfaRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseAccountRemoveMfaRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountRemoveMfaRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountRemoveMfaRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountRemoveMfaRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public EnterpriseAccountRemoveMfaRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
