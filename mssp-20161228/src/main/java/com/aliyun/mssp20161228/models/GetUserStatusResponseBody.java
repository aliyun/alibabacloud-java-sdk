// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetUserStatusResponseBody extends TeaModel {
    /**
     * <p>Interface response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public GetUserStatusResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message of the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>D8DBD769-613E-5E6B-A9FD-B622375B152D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. - <strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserStatusResponseBody self = new GetUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserStatusResponseBody setData(GetUserStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserStatusResponseBodyData getData() {
        return this.data;
    }

    public GetUserStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserStatusResponseBodyData extends TeaModel {
        /**
         * <p>Customer type.</p>
         * 
         * <strong>example:</strong>
         * <p>official</p>
         */
        @NameInMap("CustomerType")
        public String customerType;

        /**
         * <p>End date.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-28 00:00:00</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>726cec3c-4887-4354-8c21-c0ad12e10fc2</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Start date.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-20 00:00:00</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>FirstLogin</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Version.</p>
         * 
         * <strong>example:</strong>
         * <p>mdrjichu</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetUserStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserStatusResponseBodyData self = new GetUserStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserStatusResponseBodyData setCustomerType(String customerType) {
            this.customerType = customerType;
            return this;
        }
        public String getCustomerType() {
            return this.customerType;
        }

        public GetUserStatusResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetUserStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserStatusResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetUserStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserStatusResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
