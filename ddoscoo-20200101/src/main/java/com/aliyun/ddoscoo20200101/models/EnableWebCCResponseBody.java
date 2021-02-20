// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableWebCCResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableWebCCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableWebCCResponseBody self = new EnableWebCCResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableWebCCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
