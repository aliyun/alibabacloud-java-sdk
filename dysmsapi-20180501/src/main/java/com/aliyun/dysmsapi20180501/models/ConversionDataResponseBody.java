// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class ConversionDataResponseBody extends TeaModel {
    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("ResponseDescription")
    public String responseDescription;

    @NameInMap("RequestId")
    public String requestId;

    public static ConversionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataResponseBody self = new ConversionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ConversionDataResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public ConversionDataResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

    public ConversionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
