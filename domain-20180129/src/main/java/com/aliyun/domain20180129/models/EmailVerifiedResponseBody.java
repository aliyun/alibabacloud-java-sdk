// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class EmailVerifiedResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BF014B60-C708-4253-B5F2-3F9B493F398B</p>
     */
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
