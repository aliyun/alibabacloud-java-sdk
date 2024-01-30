// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceDetailRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>The group to which the service belongs.</p>
     */
    @NameInMap("group")
    public String group;

    /**
     * <p>The IP address of the service provider. Fuzzy searches are supported.</p>
     */
    @NameInMap("ip")
    public String ip;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The source of the data. Valid values:</p>
     * <br>
     * <p>*   agent: Use this value if you use the service query feature of the latest version to pass the query result.</p>
     * <p>*   registry: Use this value if you use the service query feature of the earlier version to pass the query result.</p>
     */
    @NameInMap("origin")
    public String origin;

    /**
     * <p>The region ID of the service.</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The type of the service registry. This parameter is deprecated. You can ignore it.</p>
     */
    @NameInMap("registryType")
    public String registryType;

    /**
     * <p>The ID of the service. This parameter is deprecated. You can ignore it.</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>The type of the service. Valid values:</p>
     * <br>
     * <p>*   dubbo</p>
     * <p>*   springCloud</p>
     * <p>*   hsf</p>
     * <p>*   istio</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <p>The version of the service.</p>
     */
    @NameInMap("serviceVersion")
    public String serviceVersion;

    /**
     * <p>The source of the service. Set the value to edas.</p>
     */
    @NameInMap("source")
    public String source;

    public static GetServiceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDetailRequest self = new GetServiceDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetServiceDetailRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetServiceDetailRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetServiceDetailRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetServiceDetailRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public GetServiceDetailRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetServiceDetailRequest setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public GetServiceDetailRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceDetailRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetServiceDetailRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetServiceDetailRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceDetailRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
