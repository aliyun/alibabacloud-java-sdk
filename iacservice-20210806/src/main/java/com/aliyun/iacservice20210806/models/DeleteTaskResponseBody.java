// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>73B38F77-62BA-5878-8952-530DFE21C93B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskResponseBody self = new DeleteTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
