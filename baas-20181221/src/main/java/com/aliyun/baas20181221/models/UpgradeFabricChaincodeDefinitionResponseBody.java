// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpgradeFabricChaincodeDefinitionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1E55C947-19B4-4AAD-9D22-0B8DA8904B3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ChaincodeVO result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpgradeFabricChaincodeDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFabricChaincodeDefinitionResponseBody self = new UpgradeFabricChaincodeDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setResult(ChaincodeVO result) {
        this.result = result;
        return this;
    }
    public ChaincodeVO getResult() {
        return this.result;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
