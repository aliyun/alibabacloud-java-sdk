// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetOrganizationSecurityCenterStatusResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public GetOrganizationSecurityCenterStatusResponseBodyResult result;

    public static GetOrganizationSecurityCenterStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationSecurityCenterStatusResponseBody self = new GetOrganizationSecurityCenterStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationSecurityCenterStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOrganizationSecurityCenterStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrganizationSecurityCenterStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOrganizationSecurityCenterStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOrganizationSecurityCenterStatusResponseBody setResult(GetOrganizationSecurityCenterStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetOrganizationSecurityCenterStatusResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetOrganizationSecurityCenterStatusResponseBodyResult extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        public static GetOrganizationSecurityCenterStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationSecurityCenterStatusResponseBodyResult self = new GetOrganizationSecurityCenterStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOrganizationSecurityCenterStatusResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
