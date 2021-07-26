// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListScheduleWorkersResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("ScheduleWorker")
    public java.util.List<ListScheduleWorkersResponseBodyScheduleWorker> scheduleWorker;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    public static ListScheduleWorkersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleWorkersResponseBody self = new ListScheduleWorkersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduleWorkersResponseBody setScheduleWorker(java.util.List<ListScheduleWorkersResponseBodyScheduleWorker> scheduleWorker) {
        this.scheduleWorker = scheduleWorker;
        return this;
    }
    public java.util.List<ListScheduleWorkersResponseBodyScheduleWorker> getScheduleWorker() {
        return this.scheduleWorker;
    }

    public ListScheduleWorkersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListScheduleWorkersResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListScheduleWorkersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduleWorkersResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public static class ListScheduleWorkersResponseBodyScheduleWorker extends TeaModel {
        // 资源一级ID
        @NameInMap("ScheduleWorkerId")
        public String scheduleWorkerId;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 值班人员工号
        @NameInMap("WorkerId")
        public String workerId;

        // 值班人员姓名
        @NameInMap("WorkerName")
        public String workerName;

        // 联系方式
        @NameInMap("WorkerContact")
        public String workerContact;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListScheduleWorkersResponseBodyScheduleWorker build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleWorkersResponseBodyScheduleWorker self = new ListScheduleWorkersResponseBodyScheduleWorker();
            return TeaModel.build(map, self);
        }

        public ListScheduleWorkersResponseBodyScheduleWorker setScheduleWorkerId(String scheduleWorkerId) {
            this.scheduleWorkerId = scheduleWorkerId;
            return this;
        }
        public String getScheduleWorkerId() {
            return this.scheduleWorkerId;
        }

        public ListScheduleWorkersResponseBodyScheduleWorker setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListScheduleWorkersResponseBodyScheduleWorker setWorkerId(String workerId) {
            this.workerId = workerId;
            return this;
        }
        public String getWorkerId() {
            return this.workerId;
        }

        public ListScheduleWorkersResponseBodyScheduleWorker setWorkerName(String workerName) {
            this.workerName = workerName;
            return this;
        }
        public String getWorkerName() {
            return this.workerName;
        }

        public ListScheduleWorkersResponseBodyScheduleWorker setWorkerContact(String workerContact) {
            this.workerContact = workerContact;
            return this;
        }
        public String getWorkerContact() {
            return this.workerContact;
        }

        public ListScheduleWorkersResponseBodyScheduleWorker setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
