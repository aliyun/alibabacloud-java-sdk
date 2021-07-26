// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleTypeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 值班类型对象
    @NameInMap("ScheduleType")
    public GetScheduleTypeResponseBodyScheduleType scheduleType;

    public static GetScheduleTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleTypeResponseBody self = new GetScheduleTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduleTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduleTypeResponseBody setScheduleType(GetScheduleTypeResponseBodyScheduleType scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public GetScheduleTypeResponseBodyScheduleType getScheduleType() {
        return this.scheduleType;
    }

    public static class GetScheduleTypeResponseBodyScheduleType extends TeaModel {
        // 值班类型状态
        @NameInMap("Status")
        public String status;

        // 资源一级ID
        @NameInMap("ScheduleTypeId")
        public String scheduleTypeId;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 值班类型value
        @NameInMap("ScheduleType")
        public String scheduleType;

        // relatedWorker
        @NameInMap("RelatedWorker")
        public java.util.List<String> relatedWorker;

        public static GetScheduleTypeResponseBodyScheduleType build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleTypeResponseBodyScheduleType self = new GetScheduleTypeResponseBodyScheduleType();
            return TeaModel.build(map, self);
        }

        public GetScheduleTypeResponseBodyScheduleType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetScheduleTypeResponseBodyScheduleType setScheduleTypeId(String scheduleTypeId) {
            this.scheduleTypeId = scheduleTypeId;
            return this;
        }
        public String getScheduleTypeId() {
            return this.scheduleTypeId;
        }

        public GetScheduleTypeResponseBodyScheduleType setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetScheduleTypeResponseBodyScheduleType setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetScheduleTypeResponseBodyScheduleType setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public GetScheduleTypeResponseBodyScheduleType setRelatedWorker(java.util.List<String> relatedWorker) {
            this.relatedWorker = relatedWorker;
            return this;
        }
        public java.util.List<String> getRelatedWorker() {
            return this.relatedWorker;
        }

    }

}
