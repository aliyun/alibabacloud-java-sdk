// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class TransferInResendMailTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TransferInResendMailTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferInResendMailTokenResponseBody self = new TransferInResendMailTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferInResendMailTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
