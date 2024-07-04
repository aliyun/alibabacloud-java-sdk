// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class DeleteMediaTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaTagResponseBody self = new DeleteMediaTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
