// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreatePdnsAppKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePdnsAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePdnsAppKeyResponseBody self = new CreatePdnsAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePdnsAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
