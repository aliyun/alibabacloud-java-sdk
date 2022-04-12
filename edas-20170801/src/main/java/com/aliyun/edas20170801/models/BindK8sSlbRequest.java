// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindK8sSlbRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Port")
    public String port;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("ServicePortInfos")
    public String servicePortInfos;

    @NameInMap("SlbId")
    public String slbId;

    @NameInMap("SlbProtocol")
    public String slbProtocol;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("TargetPort")
    public String targetPort;

    @NameInMap("Type")
    public String type;

    public static BindK8sSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        BindK8sSlbRequest self = new BindK8sSlbRequest();
        return TeaModel.build(map, self);
    }

    public BindK8sSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindK8sSlbRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public BindK8sSlbRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public BindK8sSlbRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public BindK8sSlbRequest setServicePortInfos(String servicePortInfos) {
        this.servicePortInfos = servicePortInfos;
        return this;
    }
    public String getServicePortInfos() {
        return this.servicePortInfos;
    }

    public BindK8sSlbRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public BindK8sSlbRequest setSlbProtocol(String slbProtocol) {
        this.slbProtocol = slbProtocol;
        return this;
    }
    public String getSlbProtocol() {
        return this.slbProtocol;
    }

    public BindK8sSlbRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public BindK8sSlbRequest setTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public String getTargetPort() {
        return this.targetPort;
    }

    public BindK8sSlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
