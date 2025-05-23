// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterInspectConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>873DC52C-28AA-5A5C-938C-684D3D4B****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteClusterInspectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterInspectConfigResponseBody self = new DeleteClusterInspectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterInspectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
