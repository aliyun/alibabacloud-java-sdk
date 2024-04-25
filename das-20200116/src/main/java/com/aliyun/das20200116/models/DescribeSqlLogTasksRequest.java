// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTasksRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Filters")
    public java.util.List<DescribeSqlLogTasksRequestFilters> filters;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

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
        @NameInMap("Key")
        public String key;

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
