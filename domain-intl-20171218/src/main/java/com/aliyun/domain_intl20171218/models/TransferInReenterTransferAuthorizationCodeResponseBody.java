// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class TransferInReenterTransferAuthorizationCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TransferInReenterTransferAuthorizationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferInReenterTransferAuthorizationCodeResponseBody self = new TransferInReenterTransferAuthorizationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferInReenterTransferAuthorizationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
