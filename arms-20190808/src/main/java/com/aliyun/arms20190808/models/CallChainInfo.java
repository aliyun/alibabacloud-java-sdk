// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CallChainInfo extends TeaModel {
    // additionalInfo
    @NameInMap("AdditionalInfo")
    public String additionalInfo;

    // appName
    @NameInMap("AppName")
    public String appName;

    // appType
    @NameInMap("AppType")
    public String appType;

    // children
    @NameInMap("Children")
    public java.util.List<CallChainInfo> children;

    // haveSpan
    @NameInMap("HaveSpan")
    public Boolean haveSpan;

    // logMap
    @NameInMap("LogMap")
    public java.util.Map<String, java.util.Map<String, ?>> logMap;

    // logTime
    @NameInMap("LogTime")
    public Long logTime;

    // parentSpanId
    @NameInMap("ParentSpanId")
    public String parentSpanId;

    // pid
    @NameInMap("Pid")
    public String pid;

    // regionId
    @NameInMap("RegionId")
    public String regionId;

    // resultCode
    @NameInMap("ResultCode")
    public String resultCode;

    // rpc
    @NameInMap("Rpc")
    public String rpc;

    // rpcId
    @NameInMap("RpcId")
    public String rpcId;

    // rpcType
    @NameInMap("RpcType")
    public Long rpcType;

    // serverIp
    @NameInMap("ServerIp")
    public String serverIp;

    // span
    @NameInMap("Span")
    public Long span;

    // spanId
    @NameInMap("SpanId")
    public String spanId;

    // tagMap
    @NameInMap("TagMap")
    public java.util.Map<String, String> tagMap;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    public static CallChainInfo build(java.util.Map<String, ?> map) throws Exception {
        CallChainInfo self = new CallChainInfo();
        return TeaModel.build(map, self);
    }

    public CallChainInfo setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public CallChainInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CallChainInfo setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CallChainInfo setChildren(java.util.List<CallChainInfo> children) {
        this.children = children;
        return this;
    }
    public java.util.List<CallChainInfo> getChildren() {
        return this.children;
    }

    public CallChainInfo setHaveSpan(Boolean haveSpan) {
        this.haveSpan = haveSpan;
        return this;
    }
    public Boolean getHaveSpan() {
        return this.haveSpan;
    }

    public CallChainInfo setLogMap(java.util.Map<String, java.util.Map<String, ?>> logMap) {
        this.logMap = logMap;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getLogMap() {
        return this.logMap;
    }

    public CallChainInfo setLogTime(Long logTime) {
        this.logTime = logTime;
        return this;
    }
    public Long getLogTime() {
        return this.logTime;
    }

    public CallChainInfo setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
        return this;
    }
    public String getParentSpanId() {
        return this.parentSpanId;
    }

    public CallChainInfo setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public CallChainInfo setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CallChainInfo setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallChainInfo setRpc(String rpc) {
        this.rpc = rpc;
        return this;
    }
    public String getRpc() {
        return this.rpc;
    }

    public CallChainInfo setRpcId(String rpcId) {
        this.rpcId = rpcId;
        return this;
    }
    public String getRpcId() {
        return this.rpcId;
    }

    public CallChainInfo setRpcType(Long rpcType) {
        this.rpcType = rpcType;
        return this;
    }
    public Long getRpcType() {
        return this.rpcType;
    }

    public CallChainInfo setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public CallChainInfo setSpan(Long span) {
        this.span = span;
        return this;
    }
    public Long getSpan() {
        return this.span;
    }

    public CallChainInfo setSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }
    public String getSpanId() {
        return this.spanId;
    }

    public CallChainInfo setTagMap(java.util.Map<String, String> tagMap) {
        this.tagMap = tagMap;
        return this;
    }
    public java.util.Map<String, String> getTagMap() {
        return this.tagMap;
    }

    public CallChainInfo setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
