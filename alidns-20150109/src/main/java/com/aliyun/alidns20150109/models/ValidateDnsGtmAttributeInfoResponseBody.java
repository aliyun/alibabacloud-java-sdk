// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ValidateDnsGtmAttributeInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ValidateDnsGtmAttributeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateDnsGtmAttributeInfoResponseBody self = new ValidateDnsGtmAttributeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateDnsGtmAttributeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
