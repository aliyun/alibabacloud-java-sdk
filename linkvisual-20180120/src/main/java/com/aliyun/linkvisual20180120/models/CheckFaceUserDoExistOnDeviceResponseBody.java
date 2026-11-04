// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CheckFaceUserDoExistOnDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned check information.</p>
     */
    @NameInMap("Data")
    public CheckFaceUserDoExistOnDeviceResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A13279A-5640-45E7-87AA-83750541AD0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckFaceUserDoExistOnDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFaceUserDoExistOnDeviceResponseBody self = new CheckFaceUserDoExistOnDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFaceUserDoExistOnDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public CheckFaceUserDoExistOnDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckFaceUserDoExistOnDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckFaceUserDoExistOnDeviceResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the face of the specified user is successfully synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
