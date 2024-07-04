// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteObjectResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A5626B44-0189-443E-9816-D951F596CC89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteObjectResponseBody self = new DeleteObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
