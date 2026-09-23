// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ReduceCreditSeatsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReduceCreditSeatsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReduceCreditSeatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReduceCreditSeatsResponseBody self = new ReduceCreditSeatsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReduceCreditSeatsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ReduceCreditSeatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReduceCreditSeatsResponseBody setData(ReduceCreditSeatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReduceCreditSeatsResponseBodyData getData() {
        return this.data;
    }

    public ReduceCreditSeatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReduceCreditSeatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReduceCreditSeatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReduceCreditSeatsResponseBodyData extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Success")
        public Boolean success;

        public static ReduceCreditSeatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReduceCreditSeatsResponseBodyData self = new ReduceCreditSeatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReduceCreditSeatsResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ReduceCreditSeatsResponseBodyData setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public ReduceCreditSeatsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ReduceCreditSeatsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
