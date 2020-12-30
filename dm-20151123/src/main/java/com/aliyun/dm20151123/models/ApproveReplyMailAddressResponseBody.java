// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveReplyMailAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ApproveReplyMailAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApproveReplyMailAddressResponseBody self = new ApproveReplyMailAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ApproveReplyMailAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
