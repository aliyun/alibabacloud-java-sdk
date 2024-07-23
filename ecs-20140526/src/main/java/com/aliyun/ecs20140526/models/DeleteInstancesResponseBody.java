// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteInstancesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B7813C6-57BF-41XX-B12B-F172F65A6046</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesResponseBody self = new DeleteInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
