// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeIpTrafficRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Eip")
    public String eip;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("QueryProtocol")
    public String queryProtocol;

    public static DescribeIpTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpTrafficRequest self = new DescribeIpTrafficRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpTrafficRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeIpTrafficRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeIpTrafficRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeIpTrafficRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeIpTrafficRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeIpTrafficRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }
    public String getEip() {
        return this.eip;
    }

    public DescribeIpTrafficRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DescribeIpTrafficRequest setQueryProtocol(String queryProtocol) {
        this.queryProtocol = queryProtocol;
        return this;
    }
    public String getQueryProtocol() {
        return this.queryProtocol;
    }

}
