// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDeviceStatusResponseData data;

    public static GetDeviceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusResponse self = new GetDeviceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDeviceStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeviceStatusResponse setData(GetDeviceStatusResponseData data) {
        this.data = data;
        return this;
    }
    public GetDeviceStatusResponseData getData() {
        return this.data;
    }

    public static class GetDeviceStatusResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static GetDeviceStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusResponseData self = new GetDeviceStatusResponseData();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
