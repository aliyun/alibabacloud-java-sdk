// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SmsConversionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code. If OK is returned, the request is successful. For more information, see [Error codes](~~180674~~).</p>
     */
    @NameInMap("ResponseCode")
    public String responseCode;

    /**
     * <p>The description of the status code.</p>
     */
    @NameInMap("ResponseDescription")
    public String responseDescription;

    public static SmsConversionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmsConversionResponseBody self = new SmsConversionResponseBody();
        return TeaModel.build(map, self);
    }

    public SmsConversionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SmsConversionResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public SmsConversionResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

}
