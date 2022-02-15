// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteInstanceSPInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceSPInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceSPInfoResponseBody self = new DeleteInstanceSPInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceSPInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
