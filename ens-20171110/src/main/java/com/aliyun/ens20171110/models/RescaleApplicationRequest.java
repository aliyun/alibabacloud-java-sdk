// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can query the application ID by calling the ListApplications operation.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The level of resource scaling. The value must be of the enumerated data type. Valid values:</p>
     * <br>
     * <p>*   AreaIspCode (default): scales resources based on the Internet service provider (ISP).</p>
     * <p>*   RegionId: scales resources based on the edge node.</p>
     * <p>*   InstanceId: scales resources based on the instance ID. Resource scale-out specifies resource hosting and scale-in specifies resource release.</p>
     */
    @NameInMap("RescaleLevel")
    public String rescaleLevel;

    /**
     * <p>The scaling operation. The value must be of the enumerated data type. Valid values:</p>
     * <br>
     * <p>*   Add: adds new resources.</p>
     * <p>*   Del: releases resources.</p>
     */
    @NameInMap("RescaleType")
    public String rescaleType;

    /**
     * <p>The required resources. The value must be a JSON string.</p>
     */
    @NameInMap("ResourceSelector")
    public String resourceSelector;

    /**
     * <p>The timeout period for asynchronous scaling. Unit: seconds. Default value: 300.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The version number of the application deployment package. By default, the stable version number is used. This parameter takes effect only when you perform resource scale-out.</p>
     */
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
