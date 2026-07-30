// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogStatisticRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the results in ascending order. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The end time of the query. This value is a UNIX timestamp in UTC. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1608888296000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeSlowLogStatisticRequestFilters> filters;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <ul>
     * <li><p>For RDS for MySQL and PolarDB for MySQL, this parameter applies only to cluster instances. If you do not specify this parameter, the slow query logs of the primary node are queried by default.</p>
     * </li>
     * <li><p>For PolarDB-X 2.0, specify <strong>polarx_cn</strong> for compute nodes or <strong>polarx_dn</strong> for data nodes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>r-x****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The sorting method. Valid values:</p>
     * <p><strong>Count</strong></p>
     * <p><strong>QueryTime</strong></p>
     * <p><strong>LockTime</strong></p>
     * <p><strong>RowsExamined</strong></p>
     * <p><strong>RowsSent</strong></p>
     * 
     * <strong>example:</strong>
     * <p>count</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. The value must be a positive integer. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query. This value is a UNIX timestamp in UTC. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1568269711000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04ea3310df40c3fa8a6b4854db49f79a</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The task type.</p>
     * <p>For SQL engines:</p>
     * <p><strong>SlowLogRequestOrigin</strong>: Aggregates logs by source IP address.</p>
     * <p><strong>SlowLogRequestUser</strong>: Aggregates logs by source user.</p>
     * <p><strong>SQL</strong>: Aggregates logs by SQL ID.</p>
     * <p>For ApsaraDB for MongoDB engines:</p>
     * <p><strong>SlowLogRequestOrigin</strong>: Aggregates logs by source IP address.</p>
     * <p><strong>SlowLogRequestUser</strong>: Aggregates logs by source user.</p>
     * <p><strong>SQL</strong>: Aggregates logs by query ID.</p>
     * <p><strong>SlowLogRequestOpType</strong>: Aggregates logs by operation type.</p>
     * <p><strong>SlowLogRequestNamespace</strong>: Aggregates logs by namespace.</p>
     * <p>For Redis engines:</p>
     * <p><strong>SlowLogRequestNodeId</strong>: Aggregates logs by node ID.</p>
     * <p><strong>SlowLogRequestHostInsId</strong>: Aggregates logs by host instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeSlowLogStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogStatisticRequest self = new DescribeSlowLogStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogStatisticRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public DescribeSlowLogStatisticRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogStatisticRequest setFilters(java.util.List<DescribeSlowLogStatisticRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeSlowLogStatisticRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeSlowLogStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSlowLogStatisticRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeSlowLogStatisticRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeSlowLogStatisticRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogStatisticRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowLogStatisticRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSlowLogStatisticRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DescribeSlowLogStatisticRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeSlowLogStatisticRequestFilters extends TeaModel {
        /**
         * <p>The filter parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyWords</p>
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

        public static DescribeSlowLogStatisticRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogStatisticRequestFilters self = new DescribeSlowLogStatisticRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogStatisticRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSlowLogStatisticRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
