// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdatePasskeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePasskeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePasskeyResponseBody self = new UpdatePasskeyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePasskeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
