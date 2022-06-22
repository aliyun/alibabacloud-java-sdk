// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ApplicationExceptionsWithTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ApplicationExceptionsWithTimeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ApplicationExceptionsWithTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplicationExceptionsWithTimeResponseBody self = new ApplicationExceptionsWithTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplicationExceptionsWithTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplicationExceptionsWithTimeResponseBody setData(java.util.List<ApplicationExceptionsWithTimeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ApplicationExceptionsWithTimeResponseBodyData> getData() {
        return this.data;
    }

    public ApplicationExceptionsWithTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplicationExceptionsWithTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplicationExceptionsWithTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplicationExceptionsWithTimeResponseBodyData extends TeaModel {
        @NameInMap("Exceptions")
        public String exceptions;

        @NameInMap("Num")
        public Integer num;

        @NameInMap("Resource")
        public String resource;

        public static ApplicationExceptionsWithTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplicationExceptionsWithTimeResponseBodyData self = new ApplicationExceptionsWithTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplicationExceptionsWithTimeResponseBodyData setExceptions(String exceptions) {
            this.exceptions = exceptions;
            return this;
        }
        public String getExceptions() {
            return this.exceptions;
        }

        public ApplicationExceptionsWithTimeResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ApplicationExceptionsWithTimeResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

}
