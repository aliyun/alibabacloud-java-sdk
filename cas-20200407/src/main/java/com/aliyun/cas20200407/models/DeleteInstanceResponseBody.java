// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4BD0CBD9-FB03-5ECD-A8FD-F90C62D78095</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceResponseBody self = new DeleteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
