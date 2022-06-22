// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricQueryMachineResourceMetricRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Pid")
    public Integer pid;

    @NameInMap("PrivateIp")
    public String privateIp;

    @NameInMap("ProcessConfigurationId")
    public String processConfigurationId;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("VpcId")
    public String vpcId;

    public static SentinelMetricQueryMachineResourceMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricQueryMachineResourceMetricRequest self = new SentinelMetricQueryMachineResourceMetricRequest();
        return TeaModel.build(map, self);
    }

    public SentinelMetricQueryMachineResourceMetricRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setPid(Integer pid) {
        this.pid = pid;
        return this;
    }
    public Integer getPid() {
        return this.pid;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setProcessConfigurationId(String processConfigurationId) {
        this.processConfigurationId = processConfigurationId;
        return this;
    }
    public String getProcessConfigurationId() {
        return this.processConfigurationId;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SentinelMetricQueryMachineResourceMetricRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
