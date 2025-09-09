// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetNetworkAvailableZonesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPoc")
    public Boolean isPoc;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("NetworkRegionId")
    public String networkRegionId;

    /**
     * <strong>example:</strong>
     * <p>PrivateLink</p>
     */
    @NameInMap("PrivateVpcConnectionMode")
    public String privateVpcConnectionMode;

    /**
     * <strong>example:</strong>
     * <p>service-55fc2eabbce647fa976b</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("ServiceInstanceEndpointServiceType")
    public String serviceInstanceEndpointServiceType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static GetNetworkAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkAvailableZonesRequest self = new GetNetworkAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public GetNetworkAvailableZonesRequest setIsPoc(Boolean isPoc) {
        this.isPoc = isPoc;
        return this;
    }
    public Boolean getIsPoc() {
        return this.isPoc;
    }

    public GetNetworkAvailableZonesRequest setNetworkRegionId(String networkRegionId) {
        this.networkRegionId = networkRegionId;
        return this;
    }
    public String getNetworkRegionId() {
        return this.networkRegionId;
    }

    public GetNetworkAvailableZonesRequest setPrivateVpcConnectionMode(String privateVpcConnectionMode) {
        this.privateVpcConnectionMode = privateVpcConnectionMode;
        return this;
    }
    public String getPrivateVpcConnectionMode() {
        return this.privateVpcConnectionMode;
    }

    public GetNetworkAvailableZonesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetNetworkAvailableZonesRequest setServiceInstanceEndpointServiceType(String serviceInstanceEndpointServiceType) {
        this.serviceInstanceEndpointServiceType = serviceInstanceEndpointServiceType;
        return this;
    }
    public String getServiceInstanceEndpointServiceType() {
        return this.serviceInstanceEndpointServiceType;
    }

    public GetNetworkAvailableZonesRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public GetNetworkAvailableZonesRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetNetworkAvailableZonesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
