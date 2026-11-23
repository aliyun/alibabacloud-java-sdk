// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeProcessListRequest extends TeaModel {
    /**
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query all clusters in the specified region, including their cluster IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1190tj036am****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the query statement.</p>
     * 
     * <strong>example:</strong>
     * <p>6c69d508-f05f-4c74-857c-d982b7e7e79f</p>
     */
    @NameInMap("InitialQueryId")
    public String initialQueryId;

    /**
     * <p>The database account.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("InitialUser")
    public String initialUser;

    /**
     * <p>The query keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>join</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The column by which to sort the results. Valid values:</p>
     * <ul>
     * <li>elapsed: cumulative execution time</li>
     * <li>written_rows: number of written rows</li>
     * <li>read_rows: number of read rows</li>
     * <li>memory_usage: memory usage</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>elapsed</p>
     */
    @NameInMap("Order")
    public String order;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: integers greater than 0 and less than or equal to the maximum value of the Integer data type. Default value: 1.</p>
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
     * <p>The minimum query duration. Minimum value: <strong>1000</strong>. Default value: <strong>1000</strong>. Unit: milliseconds. The response returns queries whose duration exceeds this value.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("QueryDurationMs")
    public Integer queryDurationMs;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the region ID.</p>
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

    public static DescribeProcessListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessListRequest self = new DescribeProcessListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeProcessListRequest setInitialQueryId(String initialQueryId) {
        this.initialQueryId = initialQueryId;
        return this;
    }
    public String getInitialQueryId() {
        return this.initialQueryId;
    }

    public DescribeProcessListRequest setInitialUser(String initialUser) {
        this.initialUser = initialUser;
        return this;
    }
    public String getInitialUser() {
        return this.initialUser;
    }

    public DescribeProcessListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeProcessListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeProcessListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeProcessListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeProcessListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProcessListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProcessListRequest setQueryDurationMs(Integer queryDurationMs) {
        this.queryDurationMs = queryDurationMs;
        return this;
    }
    public Integer getQueryDurationMs() {
        return this.queryDurationMs;
    }

    public DescribeProcessListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeProcessListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeProcessListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
