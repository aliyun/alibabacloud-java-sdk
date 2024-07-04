// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class AddMediaTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddMediaTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMediaTagResponseBody self = new AddMediaTagResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMediaTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
