// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchSubscribeAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchSubscribeAppsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchSubscribeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSubscribeAppsResponseBody self = new BatchSubscribeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSubscribeAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchSubscribeAppsResponseBody setData(BatchSubscribeAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchSubscribeAppsResponseBodyData getData() {
        return this.data;
    }

    public BatchSubscribeAppsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchSubscribeAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchSubscribeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchSubscribeAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchSubscribeAppsResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static BatchSubscribeAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchSubscribeAppsResponseBodyData self = new BatchSubscribeAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchSubscribeAppsResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
