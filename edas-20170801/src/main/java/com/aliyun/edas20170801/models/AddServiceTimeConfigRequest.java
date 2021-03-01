// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AddServiceTimeConfigRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("ServiceGroup")
    public String serviceGroup;

    @NameInMap("Path")
    public String path;

    @NameInMap("ConsumerAppName")
    public String consumerAppName;

    @NameInMap("ConsumerAppId")
    public String consumerAppId;

    @NameInMap("Timeout")
    public String timeout;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Source")
    public String source;

    public static AddServiceTimeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddServiceTimeConfigRequest self = new AddServiceTimeConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddServiceTimeConfigRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddServiceTimeConfigRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public AddServiceTimeConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddServiceTimeConfigRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public AddServiceTimeConfigRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public AddServiceTimeConfigRequest setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }
    public String getServiceGroup() {
        return this.serviceGroup;
    }

    public AddServiceTimeConfigRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public AddServiceTimeConfigRequest setConsumerAppName(String consumerAppName) {
        this.consumerAppName = consumerAppName;
        return this;
    }
    public String getConsumerAppName() {
        return this.consumerAppName;
    }

    public AddServiceTimeConfigRequest setConsumerAppId(String consumerAppId) {
        this.consumerAppId = consumerAppId;
        return this;
    }
    public String getConsumerAppId() {
        return this.consumerAppId;
    }

    public AddServiceTimeConfigRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public AddServiceTimeConfigRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AddServiceTimeConfigRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
