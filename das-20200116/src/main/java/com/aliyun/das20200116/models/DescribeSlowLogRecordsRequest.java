// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the results in ascending order. The default value is <strong>true</strong>.</p>
     * <ul>
     * <li><p><strong>true</strong>: Sorts the results in ascending order.</p>
     * </li>
     * <li><p><strong>false</strong>: Sorts the results in descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The end of the time range to query. The value must be a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1634972640000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeSlowLogRecordsRequestFilters> filters;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-8vbk4xz99su8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-d9j9fe7wq7t9i****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * <ul>
     * <li><p>QueryTimeSeconds: the query execution time in seconds.</p>
     * </li>
     * <li><p>LockTimeSeconds: the lock duration in seconds.</p>
     * </li>
     * <li><p>RowsSent: the number of rows sent.</p>
     * </li>
     * <li><p>RowsExamined: the number of rows examined.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Redis</strong></p>
     * <ul>
     * <li><p>QueryTime: the query execution time.</p>
     * </li>
     * <li><p>Timestamp: the end time of the query execution.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>MongoDB</strong></p>
     * <ul>
     * <li><p>QueryTime: the query execution time.</p>
     * </li>
     * <li><p>Timestamp: the end time of the query execution.</p>
     * </li>
     * <li><p>KeysExamined: the number of keys examined.</p>
     * </li>
     * <li><p>DocExamined: the number of documents scanned.</p>
     * </li>
     * <li><p>ReturnNum: the number of rows returned.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>RDS for PostgreSQL, PolarDB for PostgreSQL, and SQL Server do not support sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>QueryTimeSeconds</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Page numbering starts at 1.</p>
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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start of the time range to query. The value must be a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeSlowLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsRequest self = new DescribeSlowLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public DescribeSlowLogRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogRecordsRequest setFilters(java.util.List<DescribeSlowLogRecordsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeSlowLogRecordsRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeSlowLogRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSlowLogRecordsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeSlowLogRecordsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
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

    public DescribeSlowLogRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeSlowLogRecordsRequestFilters extends TeaModel {
        /**
         * <p>The filter key.</p>
         * <blockquote>
         * <p>For details, refer to the supplementary information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value for the filter key.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSlowLogRecordsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsRequestFilters self = new DescribeSlowLogRecordsRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSlowLogRecordsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
