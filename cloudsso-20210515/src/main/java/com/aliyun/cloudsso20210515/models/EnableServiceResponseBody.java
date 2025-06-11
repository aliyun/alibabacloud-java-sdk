// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class EnableServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D57EAD2-8723-1F26-B69C-F8707D8B565D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceResponseBody self = new EnableServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
