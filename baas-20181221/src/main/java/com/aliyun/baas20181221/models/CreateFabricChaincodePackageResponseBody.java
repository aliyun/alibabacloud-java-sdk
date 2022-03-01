// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChaincodePackageResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ChaincodePackage result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateFabricChaincodePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChaincodePackageResponseBody self = new CreateFabricChaincodePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFabricChaincodePackageResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateFabricChaincodePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFabricChaincodePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFabricChaincodePackageResponseBody setResult(ChaincodePackage result) {
        this.result = result;
        return this;
    }
    public ChaincodePackage getResult() {
        return this.result;
    }

    public CreateFabricChaincodePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
