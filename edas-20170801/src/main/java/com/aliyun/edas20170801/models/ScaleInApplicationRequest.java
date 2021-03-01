// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleInApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EccInfo")
    public String eccInfo;

    @NameInMap("ForceStatus")
    public Boolean forceStatus;

    public static ScaleInApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleInApplicationRequest self = new ScaleInApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ScaleInApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ScaleInApplicationRequest setEccInfo(String eccInfo) {
        this.eccInfo = eccInfo;
        return this;
    }
    public String getEccInfo() {
        return this.eccInfo;
    }

    public ScaleInApplicationRequest setForceStatus(Boolean forceStatus) {
        this.forceStatus = forceStatus;
        return this;
    }
    public Boolean getForceStatus() {
        return this.forceStatus;
    }

}
