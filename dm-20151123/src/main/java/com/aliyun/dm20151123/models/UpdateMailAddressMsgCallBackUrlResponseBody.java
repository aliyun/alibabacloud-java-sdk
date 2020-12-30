// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UpdateMailAddressMsgCallBackUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMailAddressMsgCallBackUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMailAddressMsgCallBackUrlResponseBody self = new UpdateMailAddressMsgCallBackUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMailAddressMsgCallBackUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
