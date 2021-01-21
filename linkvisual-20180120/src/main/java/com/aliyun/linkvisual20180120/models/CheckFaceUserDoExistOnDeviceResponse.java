// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CheckFaceUserDoExistOnDeviceResponse extends TeaModel {
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
    public CheckFaceUserDoExistOnDeviceResponseData data;

    public static CheckFaceUserDoExistOnDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFaceUserDoExistOnDeviceResponse self = new CheckFaceUserDoExistOnDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CheckFaceUserDoExistOnDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckFaceUserDoExistOnDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckFaceUserDoExistOnDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckFaceUserDoExistOnDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckFaceUserDoExistOnDeviceResponse setData(CheckFaceUserDoExistOnDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public CheckFaceUserDoExistOnDeviceResponseData getData() {
        return this.data;
    }

    public static class CheckFaceUserDoExistOnDeviceResponseData extends TeaModel {
        @NameInMap("DoExist")
        @Validation(required = true)
        public Boolean doExist;

        public static CheckFaceUserDoExistOnDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            CheckFaceUserDoExistOnDeviceResponseData self = new CheckFaceUserDoExistOnDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public CheckFaceUserDoExistOnDeviceResponseData setDoExist(Boolean doExist) {
            this.doExist = doExist;
            return this;
        }
        public Boolean getDoExist() {
            return this.doExist;
        }

    }

}
