// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemovePdnsAppKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemovePdnsAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemovePdnsAppKeyResponseBody self = new RemovePdnsAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public RemovePdnsAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
