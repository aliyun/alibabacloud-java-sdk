// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeFlowgraphRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("eagleEyeTraceId")
    public String eagleEyeTraceId;

    @NameInMap("eagleEyeRpcId")
    public String eagleEyeRpcId;

    @NameInMap("eagleEyeUserData")
    public String eagleEyeUserData;

    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Days")
    public Integer days;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static DescribeFlowgraphRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowgraphRequest self = new DescribeFlowgraphRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowgraphRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeFlowgraphRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFlowgraphRequest setEagleEyeTraceId(String eagleEyeTraceId) {
        this.eagleEyeTraceId = eagleEyeTraceId;
        return this;
    }
    public String getEagleEyeTraceId() {
        return this.eagleEyeTraceId;
    }

    public DescribeFlowgraphRequest setEagleEyeRpcId(String eagleEyeRpcId) {
        this.eagleEyeRpcId = eagleEyeRpcId;
        return this;
    }
    public String getEagleEyeRpcId() {
        return this.eagleEyeRpcId;
    }

    public DescribeFlowgraphRequest setEagleEyeUserData(String eagleEyeUserData) {
        this.eagleEyeUserData = eagleEyeUserData;
        return this;
    }
    public String getEagleEyeUserData() {
        return this.eagleEyeUserData;
    }

    public DescribeFlowgraphRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeFlowgraphRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeFlowgraphRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeFlowgraphRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

    public DescribeFlowgraphRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeFlowgraphRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
