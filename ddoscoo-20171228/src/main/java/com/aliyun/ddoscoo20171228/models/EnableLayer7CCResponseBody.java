// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class EnableLayer7CCResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableLayer7CCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableLayer7CCResponseBody self = new EnableLayer7CCResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableLayer7CCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
