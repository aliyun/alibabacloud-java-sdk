// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public GetDeviceStatusResponseBodyData data;

    public static GetDeviceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusResponseBody self = new GetDeviceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDeviceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeviceStatusResponseBody setData(GetDeviceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceStatusResponseBodyData getData() {
        return this.data;
    }

    public static class GetDeviceStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static GetDeviceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusResponseBodyData self = new GetDeviceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
