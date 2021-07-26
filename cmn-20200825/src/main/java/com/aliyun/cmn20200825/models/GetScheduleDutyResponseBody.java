// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleDutyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 值班表对象
    @NameInMap("ScheduleDuty")
    public GetScheduleDutyResponseBodyScheduleDuty scheduleDuty;

    public static GetScheduleDutyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleDutyResponseBody self = new GetScheduleDutyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduleDutyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduleDutyResponseBody setScheduleDuty(GetScheduleDutyResponseBodyScheduleDuty scheduleDuty) {
        this.scheduleDuty = scheduleDuty;
        return this;
    }
    public GetScheduleDutyResponseBodyScheduleDuty getScheduleDuty() {
        return this.scheduleDuty;
    }

    public static class GetScheduleDutyResponseBodyScheduleDuty extends TeaModel {
        // 值班表类型
        @NameInMap("WorkType")
        public String workType;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 值班表日期
        @NameInMap("WorkDate")
        public String workDate;

        // 值班人员工号
        @NameInMap("WorkerId")
        public String workerId;

        // 资源一级ID
        @NameInMap("ScheduleDutyId")
        public String scheduleDutyId;

        // 值班人员姓名
        @NameInMap("WorkerName")
        public String workerName;

        public static GetScheduleDutyResponseBodyScheduleDuty build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleDutyResponseBodyScheduleDuty self = new GetScheduleDutyResponseBodyScheduleDuty();
            return TeaModel.build(map, self);
        }

        public GetScheduleDutyResponseBodyScheduleDuty setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public GetScheduleDutyResponseBodyScheduleDuty setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetScheduleDutyResponseBodyScheduleDuty setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetScheduleDutyResponseBodyScheduleDuty setWorkDate(String workDate) {
            this.workDate = workDate;
            return this;
        }
        public String getWorkDate() {
            return this.workDate;
        }

        public GetScheduleDutyResponseBodyScheduleDuty setWorkerId(String workerId) {
            this.workerId = workerId;
            return this;
        }
        public String getWorkerId() {
            return this.workerId;
        }

        public GetScheduleDutyResponseBodyScheduleDuty setScheduleDutyId(String scheduleDutyId) {
            this.scheduleDutyId = scheduleDutyId;
            return this;
        }
        public String getScheduleDutyId() {
            return this.scheduleDutyId;
        }

        public GetScheduleDutyResponseBodyScheduleDuty setWorkerName(String workerName) {
            this.workerName = workerName;
            return this;
        }
        public String getWorkerName() {
            return this.workerName;
        }

    }

}
