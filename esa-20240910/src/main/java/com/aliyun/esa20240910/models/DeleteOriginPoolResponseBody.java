// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginPoolResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOriginPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOriginPoolResponseBody self = new DeleteOriginPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOriginPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
