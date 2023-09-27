// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApiErrorResponseBody extends TeaModel {
    @NameInMap("ClientErrors")
    public DescribeApiErrorResponseBodyClientErrors clientErrors;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerErrors")
    public DescribeApiErrorResponseBodyServerErrors serverErrors;

    public static DescribeApiErrorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiErrorResponseBody self = new DescribeApiErrorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiErrorResponseBody setClientErrors(DescribeApiErrorResponseBodyClientErrors clientErrors) {
        this.clientErrors = clientErrors;
        return this;
    }
    public DescribeApiErrorResponseBodyClientErrors getClientErrors() {
        return this.clientErrors;
    }

    public DescribeApiErrorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiErrorResponseBody setServerErrors(DescribeApiErrorResponseBodyServerErrors serverErrors) {
        this.serverErrors = serverErrors;
        return this;
    }
    public DescribeApiErrorResponseBodyServerErrors getServerErrors() {
        return this.serverErrors;
    }

    public static class DescribeApiErrorResponseBodyClientErrorsClientError extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static DescribeApiErrorResponseBodyClientErrorsClientError build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiErrorResponseBodyClientErrorsClientError self = new DescribeApiErrorResponseBodyClientErrorsClientError();
            return TeaModel.build(map, self);
        }

        public DescribeApiErrorResponseBodyClientErrorsClientError setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeApiErrorResponseBodyClientErrorsClientError setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApiErrorResponseBodyClientErrors extends TeaModel {
        @NameInMap("ClientError")
        public java.util.List<DescribeApiErrorResponseBodyClientErrorsClientError> clientError;

        public static DescribeApiErrorResponseBodyClientErrors build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiErrorResponseBodyClientErrors self = new DescribeApiErrorResponseBodyClientErrors();
            return TeaModel.build(map, self);
        }

        public DescribeApiErrorResponseBodyClientErrors setClientError(java.util.List<DescribeApiErrorResponseBodyClientErrorsClientError> clientError) {
            this.clientError = clientError;
            return this;
        }
        public java.util.List<DescribeApiErrorResponseBodyClientErrorsClientError> getClientError() {
            return this.clientError;
        }

    }

    public static class DescribeApiErrorResponseBodyServerErrorsServerError extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static DescribeApiErrorResponseBodyServerErrorsServerError build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiErrorResponseBodyServerErrorsServerError self = new DescribeApiErrorResponseBodyServerErrorsServerError();
            return TeaModel.build(map, self);
        }

        public DescribeApiErrorResponseBodyServerErrorsServerError setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeApiErrorResponseBodyServerErrorsServerError setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApiErrorResponseBodyServerErrors extends TeaModel {
        @NameInMap("ServerError")
        public java.util.List<DescribeApiErrorResponseBodyServerErrorsServerError> serverError;

        public static DescribeApiErrorResponseBodyServerErrors build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiErrorResponseBodyServerErrors self = new DescribeApiErrorResponseBodyServerErrors();
            return TeaModel.build(map, self);
        }

        public DescribeApiErrorResponseBodyServerErrors setServerError(java.util.List<DescribeApiErrorResponseBodyServerErrorsServerError> serverError) {
            this.serverError = serverError;
            return this;
        }
        public java.util.List<DescribeApiErrorResponseBodyServerErrorsServerError> getServerError() {
            return this.serverError;
        }

    }

}
