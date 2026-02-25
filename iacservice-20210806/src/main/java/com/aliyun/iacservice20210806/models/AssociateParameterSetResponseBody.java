// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateParameterSetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BF75EF50-955D-5E1F-AB23-A657C2C6D3C7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AssociateParameterSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateParameterSetResponseBody self = new AssociateParameterSetResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateParameterSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
