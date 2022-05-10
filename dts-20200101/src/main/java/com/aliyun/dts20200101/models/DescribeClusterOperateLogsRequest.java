// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterOperateLogsRequest extends TeaModel {
    // callType=AssumedRoleUser
    @NameInMap("AccountId")
    public String accountId;

    // 幂等性验证
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    // migration job id
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("EndTime")
    public Long endTime;

    // OwnerID
    @NameInMap("OwnerID")
    public String ownerID;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 当不传时默认最近返回七天的数据
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeClusterOperateLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterOperateLogsRequest self = new DescribeClusterOperateLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterOperateLogsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeClusterOperateLogsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeClusterOperateLogsRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeClusterOperateLogsRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeClusterOperateLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeClusterOperateLogsRequest setOwnerID(String ownerID) {
        this.ownerID = ownerID;
        return this;
    }
    public String getOwnerID() {
        return this.ownerID;
    }

    public DescribeClusterOperateLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClusterOperateLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClusterOperateLogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
