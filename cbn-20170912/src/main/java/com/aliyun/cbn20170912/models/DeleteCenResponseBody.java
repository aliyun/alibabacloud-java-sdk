// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenResponseBody self = new DeleteCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
