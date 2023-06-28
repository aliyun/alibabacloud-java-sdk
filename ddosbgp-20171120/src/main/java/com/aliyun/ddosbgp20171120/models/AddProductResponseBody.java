// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class AddProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProductResponseBody self = new AddProductResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
