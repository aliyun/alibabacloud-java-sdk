// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PhoneStatus")
    public DescribePhoneNumberStatusResponseBodyPhoneStatus phoneStatus;

    public static DescribePhoneNumberStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberStatusResponseBody self = new DescribePhoneNumberStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhoneNumberStatusResponseBody setPhoneStatus(DescribePhoneNumberStatusResponseBodyPhoneStatus phoneStatus) {
        this.phoneStatus = phoneStatus;
        return this;
    }
    public DescribePhoneNumberStatusResponseBodyPhoneStatus getPhoneStatus() {
        return this.phoneStatus;
    }

    public static class DescribePhoneNumberStatusResponseBodyPhoneStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SerialId")
        public String serialId;

        @NameInMap("Carrier")
        public String carrier;

        public static DescribePhoneNumberStatusResponseBodyPhoneStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberStatusResponseBodyPhoneStatus self = new DescribePhoneNumberStatusResponseBodyPhoneStatus();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberStatusResponseBodyPhoneStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePhoneNumberStatusResponseBodyPhoneStatus setSerialId(String serialId) {
            this.serialId = serialId;
            return this;
        }
        public String getSerialId() {
            return this.serialId;
        }

        public DescribePhoneNumberStatusResponseBodyPhoneStatus setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

    }

}
