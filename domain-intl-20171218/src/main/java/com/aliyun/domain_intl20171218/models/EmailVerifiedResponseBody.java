// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class EmailVerifiedResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EmailVerifiedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EmailVerifiedResponseBody self = new EmailVerifiedResponseBody();
        return TeaModel.build(map, self);
    }

    public EmailVerifiedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
