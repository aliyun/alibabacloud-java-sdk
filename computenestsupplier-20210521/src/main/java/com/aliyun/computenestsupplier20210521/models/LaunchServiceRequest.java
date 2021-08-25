// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class LaunchServiceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("ClientToken")
    public String clientToken;

    public static LaunchServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        LaunchServiceRequest self = new LaunchServiceRequest();
        return TeaModel.build(map, self);
    }

    public LaunchServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public LaunchServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public LaunchServiceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public LaunchServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
