// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateSessionExpireTimeRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SessionExpireTime")
    public Integer sessionExpireTime;

    public static EnterpriseAccountUpdateSessionExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateSessionExpireTimeRequest self = new EnterpriseAccountUpdateSessionExpireTimeRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateSessionExpireTimeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseAccountUpdateSessionExpireTimeRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountUpdateSessionExpireTimeRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountUpdateSessionExpireTimeRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountUpdateSessionExpireTimeRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public EnterpriseAccountUpdateSessionExpireTimeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountUpdateSessionExpireTimeRequest setSessionExpireTime(Integer sessionExpireTime) {
        this.sessionExpireTime = sessionExpireTime;
        return this;
    }
    public Integer getSessionExpireTime() {
        return this.sessionExpireTime;
    }

}
