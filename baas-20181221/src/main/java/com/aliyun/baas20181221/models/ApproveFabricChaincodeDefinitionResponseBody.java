// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ApproveFabricChaincodeDefinitionResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ChaincodeVO result;

    @NameInMap("Success")
    public Boolean success;

    public static ApproveFabricChaincodeDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApproveFabricChaincodeDefinitionResponseBody self = new ApproveFabricChaincodeDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public ApproveFabricChaincodeDefinitionResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setResult(ChaincodeVO result) {
        this.result = result;
        return this;
    }
    public ChaincodeVO getResult() {
        return this.result;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
