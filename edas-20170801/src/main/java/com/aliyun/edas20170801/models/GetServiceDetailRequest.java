// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceDetailRequest extends TeaModel {
    @NameInMap("appId")
    public String appId;

    @NameInMap("group")
    public String group;

    @NameInMap("ip")
    public String ip;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("origin")
    public String origin;

    @NameInMap("region")
    public String region;

    @NameInMap("registryType")
    public String registryType;

    @NameInMap("serviceId")
    public String serviceId;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("serviceType")
    public String serviceType;

    @NameInMap("serviceVersion")
    public String serviceVersion;

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
