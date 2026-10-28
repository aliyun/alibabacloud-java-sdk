// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterOperateLogsRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the value from your client. Make sure that the value is unique across different requests. The <strong>ClientToken</strong> parameter supports only ASCII characters and can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the dedicated DTS cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsxxxxx</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The ID of the data migration or synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>k2gm967v16f****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The end timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1650866995000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OwnerID")
    public String ownerID;

    /**
     * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start timestamp. If you do not specify this parameter, the logs generated within the last seven days are returned by default. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1650866955000</p>
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

    public DescribeClusterOperateLogsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeClusterOperateLogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
