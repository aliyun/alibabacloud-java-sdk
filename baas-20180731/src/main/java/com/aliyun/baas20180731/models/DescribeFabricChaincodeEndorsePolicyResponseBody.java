// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeEndorsePolicyResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricChaincodeEndorsePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeEndorsePolicyResponseBody self = new DescribeFabricChaincodeEndorsePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeEndorsePolicyResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricChaincodeEndorsePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricChaincodeEndorsePolicyResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DescribeFabricChaincodeEndorsePolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
