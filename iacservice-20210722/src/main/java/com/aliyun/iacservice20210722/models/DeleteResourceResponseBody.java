// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class DeleteResourceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceResponseBody self = new DeleteResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
