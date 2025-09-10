// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DeleteNodeResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8F065DDD-6996-5973-9691-9EC57BD0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeResponseBody self = new DeleteNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
