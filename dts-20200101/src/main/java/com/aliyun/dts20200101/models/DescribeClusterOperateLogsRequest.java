// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterOperateLogsRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. **The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the DTS dedicated cluster on which a DTS task runs.</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The ID of the data migration or synchronization task.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The end of the time range to query. The value must be in the UNIX timestamp format. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OwnerID")
    public String ownerID;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. The value must be in the UNIX timestamp format. Unit: milliseconds. If you do not specify this parameter, the data within the last seven days is returned by default.</p>
     */
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
