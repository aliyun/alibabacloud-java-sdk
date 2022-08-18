// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateAppKeyStateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppKeyStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppKeyStateResponseBody self = new UpdateAppKeyStateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppKeyStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
