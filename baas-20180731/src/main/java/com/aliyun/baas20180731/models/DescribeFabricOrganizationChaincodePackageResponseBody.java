// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChaincodePackageResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<String> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricOrganizationChaincodePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationChaincodePackageResponseBody self = new DescribeFabricOrganizationChaincodePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationChaincodePackageResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationChaincodePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFabricOrganizationChaincodePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationChaincodePackageResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

    public DescribeFabricOrganizationChaincodePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
