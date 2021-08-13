// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdByIdentityResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // code
    @NameInMap("Code")
    public Integer code;

    // result
    @NameInMap("Result")
    public String result;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceIdByIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdByIdentityResponseBody self = new GetDeviceIdByIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdByIdentityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceIdByIdentityResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeviceIdByIdentityResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetDeviceIdByIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
