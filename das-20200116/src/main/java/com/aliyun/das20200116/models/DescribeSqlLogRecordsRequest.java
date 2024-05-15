// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogRecordsRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Filters")
    public java.util.List<DescribeSqlLogRecordsRequestFilters> filters;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Role")
    public String role;

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
         * <p>Parameter filtering</p>
         */
        @NameInMap("Key")
        public String key;

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
