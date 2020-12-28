// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetLicenseKeyResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetLicenseKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseKeyResponseBody self = new GetLicenseKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLicenseKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLicenseKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLicenseKeyResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetLicenseKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLicenseKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
