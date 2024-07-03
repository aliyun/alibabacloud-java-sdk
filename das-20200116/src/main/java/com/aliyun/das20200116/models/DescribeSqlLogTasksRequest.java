// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTasksRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1608888296000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter parameters.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeSqlLogTasksRequestFilters> filters;

    /**
     * <p>The ID of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1nti25tc7bq5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p> This parameter is available only for instances that are deployed in the cluster architecture. You can specify this parameter to query the tasks of a specific node. If this parameter is not specified, the tasks of the primary node are returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp1o58x3ib7e6z496</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeSqlLogTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogTasksRequest self = new DescribeSqlLogTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogTasksRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSqlLogTasksRequest setFilters(java.util.List<DescribeSqlLogTasksRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeSqlLogTasksRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeSqlLogTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSqlLogTasksRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeSqlLogTasksRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeSqlLogTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlLogTasksRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeSqlLogTasksRequestFilters extends TeaModel {
        /**
         * <p>The name of the filter parameter.</p>
         * <blockquote>
         * <p> For more information about the filter parameters, see the <strong>Valid values of Key</strong> section of this topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>delimiter</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>,</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSqlLogTasksRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogTasksRequestFilters self = new DescribeSqlLogTasksRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogTasksRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSqlLogTasksRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
