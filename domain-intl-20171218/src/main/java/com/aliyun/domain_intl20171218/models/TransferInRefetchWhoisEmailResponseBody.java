// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class TransferInRefetchWhoisEmailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TransferInRefetchWhoisEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferInRefetchWhoisEmailResponseBody self = new TransferInRefetchWhoisEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferInRefetchWhoisEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
