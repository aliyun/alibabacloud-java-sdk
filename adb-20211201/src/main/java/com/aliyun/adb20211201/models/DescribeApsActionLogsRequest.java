// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsActionLogsRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the cluster. The cluster must be of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the logs. Specify the time in the <strong>yyyy-MM-ddTHH:mmZ</strong> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>When you query logs, the end time must be later than the start time, and the time span between the start time and the end time cannot exceed 30 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-11T09:30Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The keyword for the query. Fuzzy matching is applied during log query.</p>
     * 
     * <strong>example:</strong>
     * <p>table_test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be a positive integer that is greater than 0 and does not exceed the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the region ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p>The task stage. Valid values:</p>
     * <ul>
     * <li><strong>StructureMigrate</strong>: Schema migration.</li>
     * <li><strong>FullDataSync</strong>: Full data synchronization.</li>
     * <li><strong>IncrementalSync</strong>: Incremental data synchronization.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, logs of all task stages are queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FullDataSync</p>
     */
    @NameInMap("Stage")
    public String stage;

    /**
     * <p>The start time of the logs. Specify the time in the <strong>yyyy-MM-ddTHH:mmZ</strong> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-11T08:30Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The log type. Separate multiple log types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>INFO</strong>: Information.</li>
     * <li><strong>WARN</strong>: Warning.</li>
     * <li><strong>ERROR</strong>: Error.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, logs of all types are queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>INFO,WARN,ERROR</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The ID of the data link task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aps-hz109vpvt4fg8528d****</p>
     */
    @NameInMap("WorkloadId")
    public String workloadId;

    public static DescribeApsActionLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsActionLogsRequest self = new DescribeApsActionLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApsActionLogsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeApsActionLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApsActionLogsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeApsActionLogsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeApsActionLogsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeApsActionLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApsActionLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApsActionLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApsActionLogsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeApsActionLogsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeApsActionLogsRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public DescribeApsActionLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeApsActionLogsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeApsActionLogsRequest setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

}
