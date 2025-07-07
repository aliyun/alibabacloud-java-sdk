// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateIpMaskRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpMasksJson")
    public String ipMasksJson;

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
    @NameInMap("Status")
    public String status;

    public static EnterpriseAccountUpdateIpMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateIpMaskRequest self = new EnterpriseAccountUpdateIpMaskRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateIpMaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseAccountUpdateIpMaskRequest setIpMasksJson(String ipMasksJson) {
        this.ipMasksJson = ipMasksJson;
        return this;
    }
    public String getIpMasksJson() {
        return this.ipMasksJson;
    }

    public EnterpriseAccountUpdateIpMaskRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountUpdateIpMaskRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountUpdateIpMaskRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountUpdateIpMaskRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public EnterpriseAccountUpdateIpMaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountUpdateIpMaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
