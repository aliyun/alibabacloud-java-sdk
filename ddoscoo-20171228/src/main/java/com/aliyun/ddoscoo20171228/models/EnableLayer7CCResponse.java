// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class EnableLayer7CCResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EnableLayer7CCResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLayer7CCResponse self = new EnableLayer7CCResponse();
        return TeaModel.build(map, self);
    }

    public EnableLayer7CCResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
