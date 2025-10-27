// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeProcessListRequest extends TeaModel {
    @NameInMap("ComputingGroupId")
    public String computingGroupId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-xxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The query ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InitialQueryId")
    public String initialQueryId;

    /**
     * <p>The user who executes the query statement.</p>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("InitialUser")
    public String initialUser;

    /**
     * <p>The keyword of the query statement.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The execution duration of slow SQL queries. Minimum value: 1000. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueryDurationMs")
    public String queryDurationMs;

    /**
     * <p>Specifies the columns by which the query results are sorted in descending order.</p>
     * <ul>
     * <li>0: The query results are sorted by the query_duration_ms column.</li>
     * <li>1: The query results are sorted by the query_duration_ms and query_start_time columns.</li>
     * <li>2: The query results are sorted by the query_duration_ms, query_start_time, and user columns.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("QueryOrder")
    public Long queryOrder;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeProcessListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessListRequest self = new DescribeProcessListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessListRequest setComputingGroupId(String computingGroupId) {
        this.computingGroupId = computingGroupId;
        return this;
    }
    public String getComputingGroupId() {
        return this.computingGroupId;
    }

    public DescribeProcessListRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
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

    public DescribeProcessListRequest setQueryDurationMs(String queryDurationMs) {
        this.queryDurationMs = queryDurationMs;
        return this;
    }
    public String getQueryDurationMs() {
        return this.queryDurationMs;
    }

    public DescribeProcessListRequest setQueryOrder(Long queryOrder) {
        this.queryOrder = queryOrder;
        return this;
    }
    public Long getQueryOrder() {
        return this.queryOrder;
    }

    public DescribeProcessListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
