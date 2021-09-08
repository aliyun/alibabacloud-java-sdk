// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceResponse extends TeaModel {
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
    public BatchRegisterDeviceResponseData data;

    public static BatchRegisterDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceResponse self = new BatchRegisterDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRegisterDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchRegisterDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRegisterDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchRegisterDeviceResponse setData(BatchRegisterDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public BatchRegisterDeviceResponseData getData() {
        return this.data;
    }

    public static class BatchRegisterDeviceResponseData extends TeaModel {
        @NameInMap("ApplyId")
        @Validation(required = true)
        public Long applyId;

        public static BatchRegisterDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            BatchRegisterDeviceResponseData self = new BatchRegisterDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public BatchRegisterDeviceResponseData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

    }

}
