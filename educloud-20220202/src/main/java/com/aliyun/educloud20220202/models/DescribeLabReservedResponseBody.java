// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeLabReservedResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeLabReservedResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLabReservedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabReservedResponseBody self = new DescribeLabReservedResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLabReservedResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeLabReservedResponseBody setData(DescribeLabReservedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLabReservedResponseBodyData getData() {
        return this.data;
    }

    public DescribeLabReservedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLabReservedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLabReservedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLabReservedResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("LabId")
        public String labId;

        @NameInMap("LabTitle")
        public String labTitle;

        @NameInMap("Number")
        public Long number;

        @NameInMap("ReservedId")
        public String reservedId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Long status;

        public static DescribeLabReservedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLabReservedResponseBodyData self = new DescribeLabReservedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLabReservedResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeLabReservedResponseBodyData setLabId(String labId) {
            this.labId = labId;
            return this;
        }
        public String getLabId() {
            return this.labId;
        }

        public DescribeLabReservedResponseBodyData setLabTitle(String labTitle) {
            this.labTitle = labTitle;
            return this;
        }
        public String getLabTitle() {
            return this.labTitle;
        }

        public DescribeLabReservedResponseBodyData setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public DescribeLabReservedResponseBodyData setReservedId(String reservedId) {
            this.reservedId = reservedId;
            return this;
        }
        public String getReservedId() {
            return this.reservedId;
        }

        public DescribeLabReservedResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeLabReservedResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
