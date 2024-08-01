// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class ConversionDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status code. Returning OK means the request was successful. For other error codes, please refer to the <a href="https://help.aliyun.com/document_detail/180674.html">Error codes</a> list.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResponseCode")
    public String responseCode;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResponseDescription")
    public String responseDescription;

    public static ConversionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataResponseBody self = new ConversionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ConversionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
