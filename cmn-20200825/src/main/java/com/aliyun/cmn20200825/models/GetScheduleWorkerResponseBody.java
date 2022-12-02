// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleWorkerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduleWorker")
    public GetScheduleWorkerResponseBodyScheduleWorker scheduleWorker;

    public static GetScheduleWorkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleWorkerResponseBody self = new GetScheduleWorkerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduleWorkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduleWorkerResponseBody setScheduleWorker(GetScheduleWorkerResponseBodyScheduleWorker scheduleWorker) {
        this.scheduleWorker = scheduleWorker;
        return this;
    }
    public GetScheduleWorkerResponseBodyScheduleWorker getScheduleWorker() {
        return this.scheduleWorker;
    }

    public static class GetScheduleWorkerResponseBodyScheduleWorker extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ScheduleWorkerId")
        public String scheduleWorkerId;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("WorkerContact")
        public String workerContact;

        @NameInMap("WorkerId")
        public String workerId;

        @NameInMap("WorkerName")
        public String workerName;

        public static GetScheduleWorkerResponseBodyScheduleWorker build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleWorkerResponseBodyScheduleWorker self = new GetScheduleWorkerResponseBodyScheduleWorker();
            return TeaModel.build(map, self);
        }

        public GetScheduleWorkerResponseBodyScheduleWorker setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetScheduleWorkerResponseBodyScheduleWorker setScheduleWorkerId(String scheduleWorkerId) {
            this.scheduleWorkerId = scheduleWorkerId;
            return this;
        }
        public String getScheduleWorkerId() {
            return this.scheduleWorkerId;
        }

        public GetScheduleWorkerResponseBodyScheduleWorker setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetScheduleWorkerResponseBodyScheduleWorker setWorkerContact(String workerContact) {
            this.workerContact = workerContact;
            return this;
        }
        public String getWorkerContact() {
            return this.workerContact;
        }

        public GetScheduleWorkerResponseBodyScheduleWorker setWorkerId(String workerId) {
            this.workerId = workerId;
            return this;
        }
        public String getWorkerId() {
            return this.workerId;
        }

        public GetScheduleWorkerResponseBodyScheduleWorker setWorkerName(String workerName) {
            this.workerName = workerName;
            return this;
        }
        public String getWorkerName() {
            return this.workerName;
        }

    }

}
