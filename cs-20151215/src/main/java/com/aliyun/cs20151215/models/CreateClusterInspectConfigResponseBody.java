// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterInspectConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>873DC52C-28AA-5A5C-938C-684D3D4B****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateClusterInspectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterInspectConfigResponseBody self = new CreateClusterInspectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterInspectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
