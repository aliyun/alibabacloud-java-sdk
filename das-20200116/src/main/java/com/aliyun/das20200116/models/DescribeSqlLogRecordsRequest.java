// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogRecordsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeSqlLogRecordsRequestFilters> filters;

    /**
     * <p>The ID of the database instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>*   For ApsaraDB RDS for MySQL and PolarDB for MySQL, this parameter is available only for Cluster Edition instances. By default, if this parameter is not specified, the information about the logs of the primary node is returned.</p>
     * <p>*   Set this parameter to **polarx_cn** or **polarx_dn** if the node that you want to query belongs to a PolarDB-X 2.0 database instance. A value of polarx_cn indicates a compute node. A value of polarx_dn indicates a data node.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role of the node of the PolarDB-X 2.0 database instance. Valid values:</p>
     * <br>
     * <p>*   \\*\\*polarx_cn\\*\\*: compute node</p>
     * <p>*   \\*\\*polarx_dn\\*\\*: data node</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The beginning of the time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeSqlLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogRecordsRequest self = new DescribeSqlLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSqlLogRecordsRequest setFilters(java.util.List<DescribeSqlLogRecordsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeSqlLogRecordsRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeSqlLogRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSqlLogRecordsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeSqlLogRecordsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeSqlLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlLogRecordsRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DescribeSqlLogRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeSqlLogRecordsRequestFilters extends TeaModel {
        /**
         * <p>The name of the filter parameter.</p>
         * <br>
         * <p>>  For more information about the supported filter parameters and their valid values, see the following **supplement about the Key parameter**.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSqlLogRecordsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogRecordsRequestFilters self = new DescribeSqlLogRecordsRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogRecordsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSqlLogRecordsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
