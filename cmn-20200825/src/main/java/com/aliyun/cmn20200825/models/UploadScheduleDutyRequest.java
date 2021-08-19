// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UploadScheduleDutyRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // scheduleDuty
    @NameInMap("ScheduleDuty")
    public java.util.List<UploadScheduleDutyRequestScheduleDuty> scheduleDuty;

    public static UploadScheduleDutyRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadScheduleDutyRequest self = new UploadScheduleDutyRequest();
        return TeaModel.build(map, self);
    }

    public UploadScheduleDutyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UploadScheduleDutyRequest setScheduleDuty(java.util.List<UploadScheduleDutyRequestScheduleDuty> scheduleDuty) {
        this.scheduleDuty = scheduleDuty;
        return this;
    }
    public java.util.List<UploadScheduleDutyRequestScheduleDuty> getScheduleDuty() {
        return this.scheduleDuty;
    }

    public static class UploadScheduleDutyRequestScheduleDutyWorker extends TeaModel {
        // 值班表类型
        @NameInMap("WorkType")
        public String workType;

        // 值班人员姓名
        @NameInMap("WorkerName")
        public java.util.List<String> workerName;

        public static UploadScheduleDutyRequestScheduleDutyWorker build(java.util.Map<String, ?> map) throws Exception {
            UploadScheduleDutyRequestScheduleDutyWorker self = new UploadScheduleDutyRequestScheduleDutyWorker();
            return TeaModel.build(map, self);
        }

        public UploadScheduleDutyRequestScheduleDutyWorker setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public UploadScheduleDutyRequestScheduleDutyWorker setWorkerName(java.util.List<String> workerName) {
            this.workerName = workerName;
            return this;
        }
        public java.util.List<String> getWorkerName() {
            return this.workerName;
        }

    }

    public static class UploadScheduleDutyRequestScheduleDuty extends TeaModel {
        // 值班表日期
        @NameInMap("WorkDate")
        public String workDate;

        // worker
        @NameInMap("Worker")
        public java.util.List<UploadScheduleDutyRequestScheduleDutyWorker> worker;

        public static UploadScheduleDutyRequestScheduleDuty build(java.util.Map<String, ?> map) throws Exception {
            UploadScheduleDutyRequestScheduleDuty self = new UploadScheduleDutyRequestScheduleDuty();
            return TeaModel.build(map, self);
        }

        public UploadScheduleDutyRequestScheduleDuty setWorkDate(String workDate) {
            this.workDate = workDate;
            return this;
        }
        public String getWorkDate() {
            return this.workDate;
        }

        public UploadScheduleDutyRequestScheduleDuty setWorker(java.util.List<UploadScheduleDutyRequestScheduleDutyWorker> worker) {
            this.worker = worker;
            return this;
        }
        public java.util.List<UploadScheduleDutyRequestScheduleDutyWorker> getWorker() {
            return this.worker;
        }

    }

}
