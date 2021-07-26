// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListScheduleTypesResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 数组，返回示例目录。
    @NameInMap("ScheduleType")
    public java.util.List<ListScheduleTypesResponseBodyScheduleType> scheduleType;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    public static ListScheduleTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleTypesResponseBody self = new ListScheduleTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduleTypesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListScheduleTypesResponseBody setScheduleType(java.util.List<ListScheduleTypesResponseBodyScheduleType> scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public java.util.List<ListScheduleTypesResponseBodyScheduleType> getScheduleType() {
        return this.scheduleType;
    }

    public ListScheduleTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduleTypesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListScheduleTypesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public static class ListScheduleTypesResponseBodyScheduleType extends TeaModel {
        // 值班类型状态
        @NameInMap("Status")
        public String status;

        @NameInMap("RelatedWorker")
        public java.util.List<String> relatedWorker;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 资源一级ID
        @NameInMap("ScheduleTypeId")
        public String scheduleTypeId;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 值班类型value
        @NameInMap("ScheduleType")
        public String scheduleType;

        public static ListScheduleTypesResponseBodyScheduleType build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleTypesResponseBodyScheduleType self = new ListScheduleTypesResponseBodyScheduleType();
            return TeaModel.build(map, self);
        }

        public ListScheduleTypesResponseBodyScheduleType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListScheduleTypesResponseBodyScheduleType setRelatedWorker(java.util.List<String> relatedWorker) {
            this.relatedWorker = relatedWorker;
            return this;
        }
        public java.util.List<String> getRelatedWorker() {
            return this.relatedWorker;
        }

        public ListScheduleTypesResponseBodyScheduleType setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListScheduleTypesResponseBodyScheduleType setScheduleTypeId(String scheduleTypeId) {
            this.scheduleTypeId = scheduleTypeId;
            return this;
        }
        public String getScheduleTypeId() {
            return this.scheduleTypeId;
        }

        public ListScheduleTypesResponseBodyScheduleType setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListScheduleTypesResponseBodyScheduleType setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

    }

}
