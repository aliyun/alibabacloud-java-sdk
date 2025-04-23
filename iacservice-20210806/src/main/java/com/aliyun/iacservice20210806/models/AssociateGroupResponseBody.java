// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B6ED9F71-7FA8-598E-B64D-4606FB3FCCC9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AssociateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateGroupResponseBody self = new AssociateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
