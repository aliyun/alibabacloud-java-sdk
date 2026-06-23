// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsRequest extends TeaModel {
    /**
     * <p>The cluster ID. Call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query information about all clusters in the destination region, including cluster IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1z58t881wcx****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. The format is \<code>yyyy-MM-dd hh:mm:ss\\</code>. The time is in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The interval between the start time and the end time cannot exceed 7 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-27 16:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be an integer that is greater than 0 and does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong> (Default)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The minimum query duration, in milliseconds. The minimum value is <strong>1000</strong>. The default value is <strong>1000</strong>. The response returns information about queries that take longer than the specified duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueryDurationMs")
    public Integer queryDurationMs;

    /**
     * <p>The region ID. Call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. The format is \<code>yyyy-MM-dd hh:mm:ss\\</code>. The time is in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-20 16:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSlowLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsRequest self = new DescribeSlowLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSlowLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSlowLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSlowLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowLogRecordsRequest setQueryDurationMs(Integer queryDurationMs) {
        this.queryDurationMs = queryDurationMs;
        return this;
    }
    public Integer getQueryDurationMs() {
        return this.queryDurationMs;
    }

    public DescribeSlowLogRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSlowLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSlowLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSlowLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
