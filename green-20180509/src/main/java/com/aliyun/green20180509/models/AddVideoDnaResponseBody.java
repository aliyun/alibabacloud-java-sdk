// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddVideoDnaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddVideoDnaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVideoDnaResponseBody self = new AddVideoDnaResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVideoDnaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
