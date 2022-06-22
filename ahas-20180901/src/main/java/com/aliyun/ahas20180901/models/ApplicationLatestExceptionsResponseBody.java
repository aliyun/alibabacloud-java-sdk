// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ApplicationLatestExceptionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ApplicationLatestExceptionsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ApplicationLatestExceptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplicationLatestExceptionsResponseBody self = new ApplicationLatestExceptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplicationLatestExceptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplicationLatestExceptionsResponseBody setData(java.util.List<ApplicationLatestExceptionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ApplicationLatestExceptionsResponseBodyData> getData() {
        return this.data;
    }

    public ApplicationLatestExceptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplicationLatestExceptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplicationLatestExceptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplicationLatestExceptionsResponseBodyData extends TeaModel {
        @NameInMap("Exceptions")
        public String exceptions;

        @NameInMap("Num")
        public Integer num;

        @NameInMap("Resource")
        public String resource;

        public static ApplicationLatestExceptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplicationLatestExceptionsResponseBodyData self = new ApplicationLatestExceptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplicationLatestExceptionsResponseBodyData setExceptions(String exceptions) {
            this.exceptions = exceptions;
            return this;
        }
        public String getExceptions() {
            return this.exceptions;
        }

        public ApplicationLatestExceptionsResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ApplicationLatestExceptionsResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

}
