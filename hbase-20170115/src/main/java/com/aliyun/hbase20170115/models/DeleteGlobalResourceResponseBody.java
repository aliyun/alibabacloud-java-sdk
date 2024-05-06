// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DeleteGlobalResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGlobalResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalResourceResponseBody self = new DeleteGlobalResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
