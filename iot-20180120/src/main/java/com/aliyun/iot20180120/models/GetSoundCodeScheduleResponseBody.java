// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSoundCodeScheduleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSoundCodeScheduleResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSoundCodeScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSoundCodeScheduleResponseBody self = new GetSoundCodeScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSoundCodeScheduleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSoundCodeScheduleResponseBody setData(GetSoundCodeScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSoundCodeScheduleResponseBodyData getData() {
        return this.data;
    }

    public GetSoundCodeScheduleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSoundCodeScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSoundCodeScheduleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSoundCodeScheduleResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpenType")
        public String openType;

        @NameInMap("ScheduleCode")
        public String scheduleCode;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static GetSoundCodeScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSoundCodeScheduleResponseBodyData self = new GetSoundCodeScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSoundCodeScheduleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSoundCodeScheduleResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetSoundCodeScheduleResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetSoundCodeScheduleResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSoundCodeScheduleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSoundCodeScheduleResponseBodyData setOpenType(String openType) {
            this.openType = openType;
            return this;
        }
        public String getOpenType() {
            return this.openType;
        }

        public GetSoundCodeScheduleResponseBodyData setScheduleCode(String scheduleCode) {
            this.scheduleCode = scheduleCode;
            return this;
        }
        public String getScheduleCode() {
            return this.scheduleCode;
        }

        public GetSoundCodeScheduleResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetSoundCodeScheduleResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetSoundCodeScheduleResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
