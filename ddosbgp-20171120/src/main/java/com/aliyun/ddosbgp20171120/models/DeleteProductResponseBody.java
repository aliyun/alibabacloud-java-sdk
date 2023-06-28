// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DeleteProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductResponseBody self = new DeleteProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
