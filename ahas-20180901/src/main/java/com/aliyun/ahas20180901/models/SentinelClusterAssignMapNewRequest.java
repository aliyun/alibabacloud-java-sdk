// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterAssignMapNewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ClientSet")
    public String clientSet;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxAllowedQps")
    public Float maxAllowedQps;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Pid")
    public Integer pid;

    @NameInMap("ProcessConfigurationId")
    public String processConfigurationId;

    @NameInMap("ServerIp")
    public String serverIp;

    @NameInMap("ServerMachineId")
    public Long serverMachineId;

    @NameInMap("ServerPort")
    public Integer serverPort;

    @NameInMap("VpcId")
    public String vpcId;

    public static SentinelClusterAssignMapNewRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterAssignMapNewRequest self = new SentinelClusterAssignMapNewRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterAssignMapNewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelClusterAssignMapNewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelClusterAssignMapNewRequest setClientSet(String clientSet) {
        this.clientSet = clientSet;
        return this;
    }
    public String getClientSet() {
        return this.clientSet;
    }

    public SentinelClusterAssignMapNewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelClusterAssignMapNewRequest setMaxAllowedQps(Float maxAllowedQps) {
        this.maxAllowedQps = maxAllowedQps;
        return this;
    }
    public Float getMaxAllowedQps() {
        return this.maxAllowedQps;
    }

    public SentinelClusterAssignMapNewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelClusterAssignMapNewRequest setPid(Integer pid) {
        this.pid = pid;
        return this;
    }
    public Integer getPid() {
        return this.pid;
    }

    public SentinelClusterAssignMapNewRequest setProcessConfigurationId(String processConfigurationId) {
        this.processConfigurationId = processConfigurationId;
        return this;
    }
    public String getProcessConfigurationId() {
        return this.processConfigurationId;
    }

    public SentinelClusterAssignMapNewRequest setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public SentinelClusterAssignMapNewRequest setServerMachineId(Long serverMachineId) {
        this.serverMachineId = serverMachineId;
        return this;
    }
    public Long getServerMachineId() {
        return this.serverMachineId;
    }

    public SentinelClusterAssignMapNewRequest setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
        return this;
    }
    public Integer getServerPort() {
        return this.serverPort;
    }

    public SentinelClusterAssignMapNewRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
