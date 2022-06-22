// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterAssignMapUpdateRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AssignId")
    public Long assignId;

    @NameInMap("ClientSet")
    public String clientSet;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxAllowedQps")
    public Float maxAllowedQps;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServerPort")
    public Integer serverPort;

    public static SentinelClusterAssignMapUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterAssignMapUpdateRequest self = new SentinelClusterAssignMapUpdateRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterAssignMapUpdateRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelClusterAssignMapUpdateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelClusterAssignMapUpdateRequest setAssignId(Long assignId) {
        this.assignId = assignId;
        return this;
    }
    public Long getAssignId() {
        return this.assignId;
    }

    public SentinelClusterAssignMapUpdateRequest setClientSet(String clientSet) {
        this.clientSet = clientSet;
        return this;
    }
    public String getClientSet() {
        return this.clientSet;
    }

    public SentinelClusterAssignMapUpdateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelClusterAssignMapUpdateRequest setMaxAllowedQps(Float maxAllowedQps) {
        this.maxAllowedQps = maxAllowedQps;
        return this;
    }
    public Float getMaxAllowedQps() {
        return this.maxAllowedQps;
    }

    public SentinelClusterAssignMapUpdateRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelClusterAssignMapUpdateRequest setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
        return this;
    }
    public Integer getServerPort() {
        return this.serverPort;
    }

}
