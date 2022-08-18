// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ValidateDnsGtmCnameRrCanUseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ValidateDnsGtmCnameRrCanUseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateDnsGtmCnameRrCanUseResponseBody self = new ValidateDnsGtmCnameRrCanUseResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateDnsGtmCnameRrCanUseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
