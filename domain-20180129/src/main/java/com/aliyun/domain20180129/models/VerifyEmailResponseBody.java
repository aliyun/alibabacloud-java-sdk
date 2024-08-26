// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class VerifyEmailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FD3AD289-83EE-4E32-803A-CF1B3A8EEE64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyEmailResponseBody self = new VerifyEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
