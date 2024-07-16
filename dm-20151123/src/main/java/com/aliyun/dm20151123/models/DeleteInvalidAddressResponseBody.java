// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteInvalidAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2D086F6-xxxx-xxxx-xxxx-006DED011A85</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInvalidAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvalidAddressResponseBody self = new DeleteInvalidAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInvalidAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
