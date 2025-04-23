// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1E7BA3EB-B0EF-53F5-9999-07CAD6D9F8A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupResponseBody self = new DeleteGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
