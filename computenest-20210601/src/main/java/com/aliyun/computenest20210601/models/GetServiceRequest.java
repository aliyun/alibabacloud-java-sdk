// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a544xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("ShowDetails")
    public java.util.List<String> showDetails;

    public static GetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRequest self = new GetServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public GetServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetServiceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceRequest setShowDetails(java.util.List<String> showDetails) {
        this.showDetails = showDetails;
        return this;
    }
    public java.util.List<String> getShowDetails() {
        return this.showDetails;
    }

}
