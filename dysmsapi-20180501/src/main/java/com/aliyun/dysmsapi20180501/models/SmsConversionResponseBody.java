// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SmsConversionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseCode")
    public String responseCode;

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
