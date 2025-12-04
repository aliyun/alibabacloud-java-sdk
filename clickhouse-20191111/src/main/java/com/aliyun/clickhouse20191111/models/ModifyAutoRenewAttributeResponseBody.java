// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7B94AB34-6875-56D2-92B4-0C2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeResponseBody self = new ModifyAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
