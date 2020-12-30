// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyMailAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMailAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMailAddressResponseBody self = new ModifyMailAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMailAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
