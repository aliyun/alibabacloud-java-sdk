// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTasksRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeSqlLogTasksRequestFilters> filters;

    /**
     * <p>The ID of the database instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>> This parameter is available only for instances that run in a cluster architecture. You can specify this parameter to query the logs of a specific node. If this parameter is not specified, the logs of the primary node are returned by default.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
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
