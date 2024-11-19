// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSoundCodeScheduleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.soundcodeservice.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSoundCodeScheduleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>iot.soundcodeservice.NotSigned</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2022-03-28</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>23:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1620634297000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>INNER</p>
         */
        @NameInMap("OpenType")
        public String openType;

        /**
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        @NameInMap("ScheduleCode")
        public String scheduleCode;

        /**
         * <strong>example:</strong>
         * <p>2022-03-28</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>WORKING</p>
         */
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
