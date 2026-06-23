// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSlowLogTrendRequest extends TeaModel {
    /**
     * <p>The cluster ID. Call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query information about all clusters in a specific region, including cluster IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp11xxl475ui8****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. Specify the time in the \<code>yyyy-MM-dd hh:mm:ss\\</code> format. The time is in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The time range cannot exceed 7 days.</p>
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
     * <p>The execution duration of a slow SQL query, in milliseconds. The minimum value is <strong>1000</strong>. The default value is <strong>1000</strong>. The operation returns slow SQL queries that take longer than this duration to execute.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueryDurationMs")
    public Integer queryDurationMs;

    /**
     * <p>The region ID. Call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query region IDs.</p>
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
     * <p>The beginning of the time range to query. Specify the time in the \<code>yyyy-MM-dd hh:mm:ss\\</code> format. The time is in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-20 16:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSlowLogTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogTrendRequest self = new DescribeSlowLogTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogTrendRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSlowLogTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogTrendRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSlowLogTrendRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSlowLogTrendRequest setQueryDurationMs(Integer queryDurationMs) {
        this.queryDurationMs = queryDurationMs;
        return this;
    }
    public Integer getQueryDurationMs() {
        return this.queryDurationMs;
    }

    public DescribeSlowLogTrendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSlowLogTrendRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSlowLogTrendRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSlowLogTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
