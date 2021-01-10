// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CheckFaceUserDoExistOnDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CheckFaceUserDoExistOnDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CheckFaceUserDoExistOnDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFaceUserDoExistOnDeviceResponseBody self = new CheckFaceUserDoExistOnDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFaceUserDoExistOnDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckFaceUserDoExistOnDeviceResponseBody setData(CheckFaceUserDoExistOnDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckFaceUserDoExistOnDeviceResponseBodyData getData() {
        return this.data;
    }

    public CheckFaceUserDoExistOnDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckFaceUserDoExistOnDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckFaceUserDoExistOnDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckFaceUserDoExistOnDeviceResponseBodyData extends TeaModel {
        @NameInMap("DoExist")
        public Boolean doExist;

        public static CheckFaceUserDoExistOnDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckFaceUserDoExistOnDeviceResponseBodyData self = new CheckFaceUserDoExistOnDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckFaceUserDoExistOnDeviceResponseBodyData setDoExist(Boolean doExist) {
            this.doExist = doExist;
            return this;
        }
        public Boolean getDoExist() {
            return this.doExist;
        }

    }

}
