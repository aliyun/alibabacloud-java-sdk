// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class AutoInstallAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AutoInstallAppResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AutoInstallAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AutoInstallAppResponseBody self = new AutoInstallAppResponseBody();
        return TeaModel.build(map, self);
    }

    public AutoInstallAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AutoInstallAppResponseBody setData(AutoInstallAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AutoInstallAppResponseBodyData getData() {
        return this.data;
    }

    public AutoInstallAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AutoInstallAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AutoInstallAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AutoInstallAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AutoInstallAppResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static AutoInstallAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AutoInstallAppResponseBodyData self = new AutoInstallAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AutoInstallAppResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
