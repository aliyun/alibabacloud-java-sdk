// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetServiceAccessInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxxxxxxx">http://xxxxxxxxx</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>dcwedsxcx</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    public static GetServiceAccessInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceAccessInfoResponseBody self = new GetServiceAccessInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceAccessInfoResponseBody setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public GetServiceAccessInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceAccessInfoResponseBody setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
