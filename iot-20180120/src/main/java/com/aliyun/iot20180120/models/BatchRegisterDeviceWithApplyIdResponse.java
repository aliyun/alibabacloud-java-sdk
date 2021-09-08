// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceWithApplyIdResponse extends TeaModel {
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
    public BatchRegisterDeviceWithApplyIdResponseData data;

    public static BatchRegisterDeviceWithApplyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceWithApplyIdResponse self = new BatchRegisterDeviceWithApplyIdResponse();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceWithApplyIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRegisterDeviceWithApplyIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchRegisterDeviceWithApplyIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRegisterDeviceWithApplyIdResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchRegisterDeviceWithApplyIdResponse setData(BatchRegisterDeviceWithApplyIdResponseData data) {
        this.data = data;
        return this;
    }
    public BatchRegisterDeviceWithApplyIdResponseData getData() {
        return this.data;
    }

    public static class BatchRegisterDeviceWithApplyIdResponseData extends TeaModel {
        @NameInMap("ApplyId")
        @Validation(required = true)
        public Long applyId;

        public static BatchRegisterDeviceWithApplyIdResponseData build(java.util.Map<String, ?> map) throws Exception {
            BatchRegisterDeviceWithApplyIdResponseData self = new BatchRegisterDeviceWithApplyIdResponseData();
            return TeaModel.build(map, self);
        }

        public BatchRegisterDeviceWithApplyIdResponseData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

    }

}
