// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentHostsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("SerialNumbers")
    public String serialNumbers;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    @NameInMap("AliyunHost")
    public Boolean aliyunHost;

    @NameInMap("Status")
    public String status;

    public static DescribeMonitoringAgentHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentHostsRequest self = new DescribeMonitoringAgentHostsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentHostsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMonitoringAgentHostsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribeMonitoringAgentHostsRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeMonitoringAgentHostsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMonitoringAgentHostsRequest setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
        return this;
    }
    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public DescribeMonitoringAgentHostsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitoringAgentHostsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitoringAgentHostsRequest setInstanceRegionId(String instanceRegionId) {
        this.instanceRegionId = instanceRegionId;
        return this;
    }
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public DescribeMonitoringAgentHostsRequest setAliyunHost(Boolean aliyunHost) {
        this.aliyunHost = aliyunHost;
        return this;
    }
    public Boolean getAliyunHost() {
        return this.aliyunHost;
    }

    public DescribeMonitoringAgentHostsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
