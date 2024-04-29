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
        @NameInMap("Id")
        public String id;

        public static DescribeLabReservationResponseBodyLabReservation build(java.util.Map<String, ?> map) throws Exception {
            DescribeLabReservationResponseBodyLabReservation self = new DescribeLabReservationResponseBodyLabReservation();
            return TeaModel.build(map, self);
        }

        public DescribeLabReservationResponseBodyLabReservation setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
