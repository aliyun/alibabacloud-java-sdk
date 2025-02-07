// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeletePasskeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8A1673AA-5DB3-5AFB-8758-AF9EC2889259</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePasskeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePasskeyResponseBody self = new DeletePasskeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePasskeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
