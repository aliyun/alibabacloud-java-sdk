// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchClearEdgeInstanceDeviceConfigResponse extends TeaModel {
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

    public static BatchClearEdgeInstanceDeviceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchClearEdgeInstanceDeviceConfigResponse self = new BatchClearEdgeInstanceDeviceConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchClearEdgeInstanceDeviceConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchClearEdgeInstanceDeviceConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchClearEdgeInstanceDeviceConfigResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchClearEdgeInstanceDeviceConfigResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
