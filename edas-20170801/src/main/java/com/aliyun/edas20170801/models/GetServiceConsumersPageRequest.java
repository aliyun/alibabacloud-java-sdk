// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceConsumersPageRequest extends TeaModel {
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

    @NameInMap("page")
    public Integer page;

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

    @NameInMap("size")
    public Integer size;

    @NameInMap("source")
    public String source;

    public static GetServiceConsumersPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConsumersPageRequest self = new GetServiceConsumersPageRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceConsumersPageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetServiceConsumersPageRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetServiceConsumersPageRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetServiceConsumersPageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetServiceConsumersPageRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public GetServiceConsumersPageRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetServiceConsumersPageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetServiceConsumersPageRequest setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public GetServiceConsumersPageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceConsumersPageRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetServiceConsumersPageRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetServiceConsumersPageRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceConsumersPageRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public GetServiceConsumersPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
