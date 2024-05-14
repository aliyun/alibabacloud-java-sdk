// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeLabReservationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LabReservation")
    public DescribeLabReservationResponseBodyLabReservation labReservation;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLabReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabReservationResponseBody self = new DescribeLabReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLabReservationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLabReservationResponseBody setLabReservation(DescribeLabReservationResponseBodyLabReservation labReservation) {
        this.labReservation = labReservation;
        return this;
    }
    public DescribeLabReservationResponseBodyLabReservation getLabReservation() {
        return this.labReservation;
    }

    public DescribeLabReservationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLabReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLabReservationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLabReservationResponseBodyLabReservation extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("MemberCount")
        public Long memberCount;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeLabReservationResponseBodyLabReservation build(java.util.Map<String, ?> map) throws Exception {
            DescribeLabReservationResponseBodyLabReservation self = new DescribeLabReservationResponseBodyLabReservation();
            return TeaModel.build(map, self);
        }

        public DescribeLabReservationResponseBodyLabReservation setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeLabReservationResponseBodyLabReservation setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLabReservationResponseBodyLabReservation setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeLabReservationResponseBodyLabReservation setMemberCount(Long memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Long getMemberCount() {
            return this.memberCount;
        }

        public DescribeLabReservationResponseBodyLabReservation setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
