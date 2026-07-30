// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This field is of the Long type. During serialization and deserialization, precision may be lost. Make sure that the value does not exceed 9007199254740991.</p>
     * </notice>
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1732069466000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     * <blockquote>
     * <p>Error log filtering is supported only for RDS MySQL, RDS PostgreSQL, PolarDB for MySQL, PolarDB for PostgreSQL, and PolarDB for PostgreSQL (compatible with Oracle).</p>
     * </blockquote>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeErrorLogRecordsRequestFilters> filters;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1u5mas9exx7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-bp16v3824rt73****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The node role:</p>
     * <ul>
     * <li>db</li>
     * <li>mongos</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for ApsaraDB for MongoDB instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This field is of the Long type. During serialization and deserialization, precision may be lost. Make sure that the value does not exceed 9007199254740991.</p>
     * </notice>
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1731983066000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeErrorLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogRecordsRequest self = new DescribeErrorLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeErrorLogRecordsRequest setFilters(java.util.List<DescribeErrorLogRecordsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeErrorLogRecordsRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeErrorLogRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeErrorLogRecordsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeErrorLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeErrorLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeErrorLogRecordsRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DescribeErrorLogRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeErrorLogRecordsRequestFilters extends TeaModel {
        /**
         * <p>The filter parameter. Set the value to filters.</p>
         * 
         * <strong>example:</strong>
         * <p>filters</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The content of the error log to filter.</p>
         * 
         * <strong>example:</strong>
         * <p>deadlock</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeErrorLogRecordsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogRecordsRequestFilters self = new DescribeErrorLogRecordsRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogRecordsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeErrorLogRecordsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
