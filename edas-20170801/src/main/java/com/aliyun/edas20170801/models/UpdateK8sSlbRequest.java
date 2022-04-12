// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sSlbRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DisableForceOverride")
    public Boolean disableForceOverride;

    @NameInMap("Port")
    public String port;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("ServicePortInfos")
    public String servicePortInfos;

    @NameInMap("SlbName")
    public String slbName;

    @NameInMap("SlbProtocol")
    public String slbProtocol;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("TargetPort")
    public String targetPort;

    @NameInMap("Type")
    public String type;

    public static UpdateK8sSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sSlbRequest self = new UpdateK8sSlbRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateK8sSlbRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateK8sSlbRequest setDisableForceOverride(Boolean disableForceOverride) {
        this.disableForceOverride = disableForceOverride;
        return this;
    }
    public Boolean getDisableForceOverride() {
        return this.disableForceOverride;
    }

    public UpdateK8sSlbRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public UpdateK8sSlbRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public UpdateK8sSlbRequest setServicePortInfos(String servicePortInfos) {
        this.servicePortInfos = servicePortInfos;
        return this;
    }
    public String getServicePortInfos() {
        return this.servicePortInfos;
    }

    public UpdateK8sSlbRequest setSlbName(String slbName) {
        this.slbName = slbName;
        return this;
    }
    public String getSlbName() {
        return this.slbName;
    }

    public UpdateK8sSlbRequest setSlbProtocol(String slbProtocol) {
        this.slbProtocol = slbProtocol;
        return this;
    }
    public String getSlbProtocol() {
        return this.slbProtocol;
    }

    public UpdateK8sSlbRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public UpdateK8sSlbRequest setTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public String getTargetPort() {
        return this.targetPort;
    }

    public UpdateK8sSlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
