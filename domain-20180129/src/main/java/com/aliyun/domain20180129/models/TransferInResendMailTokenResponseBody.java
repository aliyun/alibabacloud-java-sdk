// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class TransferInResendMailTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
     */
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
