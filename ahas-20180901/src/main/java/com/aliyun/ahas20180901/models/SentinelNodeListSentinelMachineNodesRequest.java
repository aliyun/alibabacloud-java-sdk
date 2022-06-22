// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelNodeListSentinelMachineNodesRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Key")
    public String key;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Pid")
    public Integer pid;

    @NameInMap("ProcessConfigurationId")
    public String processConfigurationId;

    @NameInMap("Type")
    public String type;

    @NameInMap("VpcId")
    public String vpcId;

    public static SentinelNodeListSentinelMachineNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelNodeListSentinelMachineNodesRequest self = new SentinelNodeListSentinelMachineNodesRequest();
        return TeaModel.build(map, self);
    }

    public SentinelNodeListSentinelMachineNodesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelNodeListSentinelMachineNodesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelNodeListSentinelMachineNodesRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public SentinelNodeListSentinelMachineNodesRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SentinelNodeListSentinelMachineNodesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelNodeListSentinelMachineNodesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelNodeListSentinelMachineNodesRequest setPid(Integer pid) {
        this.pid = pid;
        return this;
    }
    public Integer getPid() {
        return this.pid;
    }

    public SentinelNodeListSentinelMachineNodesRequest setProcessConfigurationId(String processConfigurationId) {
        this.processConfigurationId = processConfigurationId;
        return this;
    }
    public String getProcessConfigurationId() {
        return this.processConfigurationId;
    }

    public SentinelNodeListSentinelMachineNodesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SentinelNodeListSentinelMachineNodesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
