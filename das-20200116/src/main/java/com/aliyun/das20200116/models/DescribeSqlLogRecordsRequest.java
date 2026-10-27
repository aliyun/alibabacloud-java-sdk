// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogRecordsRequest extends TeaModel {
    /**
     * <p>The end time. The value is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1608888296000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeSqlLogRecordsRequestFilters> filters;

    /**
     * <p>The ID of the database instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <ul>
     * <li>For ApsaraDB RDS for MySQL and PolarDB for MySQL, this parameter applies only to Cluster Edition instances. If you do not specify this parameter, the log details of the primary node are queried by default.</li>
     * <li>For PolarDB-X 2.0, set this parameter to <strong>polarx_cn</strong> (compute node) or <strong>polarx_dn</strong> (data node).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pi-uf6k5f6g3912i****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The page number for paging. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The maximum number of entries per page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role of the node in the PolarDB-X 2.0 instance. Valid values:</p>
     * <ul>
     * <li><strong>polarx_cn</strong>: compute node.</li>
     * <li><strong>polarx_dn</strong>: data node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx_cn</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The start time. The value is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
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
         * <p>The filter parameter.</p>
         * <blockquote>
         * <p>For supported filter parameters and their valid values, refer to <strong>Supplementary request parameter descriptions</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>keyWords</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
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
