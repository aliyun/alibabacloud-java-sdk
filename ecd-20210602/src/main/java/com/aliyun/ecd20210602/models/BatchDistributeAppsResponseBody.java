// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchDistributeAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchDistributeAppsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchDistributeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDistributeAppsResponseBody self = new BatchDistributeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDistributeAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchDistributeAppsResponseBody setData(BatchDistributeAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchDistributeAppsResponseBodyData getData() {
        return this.data;
    }

    public BatchDistributeAppsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchDistributeAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchDistributeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDistributeAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchDistributeAppsResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static BatchDistributeAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchDistributeAppsResponseBodyData self = new BatchDistributeAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchDistributeAppsResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
