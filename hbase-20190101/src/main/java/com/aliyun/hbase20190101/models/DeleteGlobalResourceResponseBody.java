// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteGlobalResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BD0B0B9A-79E8-4FDD-9C51-93443490B784</p>
     */
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
