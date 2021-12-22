// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RescaleLevel")
    public String rescaleLevel;

    @NameInMap("RescaleType")
    public String rescaleType;

    @NameInMap("ResourceSelector")
    public String resourceSelector;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("ToAppVersion")
    public String toAppVersion;

    public static RescaleApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationRequest self = new RescaleApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RescaleApplicationRequest setRescaleLevel(String rescaleLevel) {
        this.rescaleLevel = rescaleLevel;
        return this;
    }
    public String getRescaleLevel() {
        return this.rescaleLevel;
    }

    public RescaleApplicationRequest setRescaleType(String rescaleType) {
        this.rescaleType = rescaleType;
        return this;
    }
    public String getRescaleType() {
        return this.rescaleType;
    }

    public RescaleApplicationRequest setResourceSelector(String resourceSelector) {
        this.resourceSelector = resourceSelector;
        return this;
    }
    public String getResourceSelector() {
        return this.resourceSelector;
    }

    public RescaleApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RescaleApplicationRequest setToAppVersion(String toAppVersion) {
        this.toAppVersion = toAppVersion;
        return this;
    }
    public String getToAppVersion() {
        return this.toAppVersion;
    }

}
