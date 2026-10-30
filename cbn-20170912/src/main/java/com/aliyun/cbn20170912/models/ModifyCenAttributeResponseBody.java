// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>13526224-5780-4426-8BDF-BC8B08700F22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCenAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenAttributeResponseBody self = new ModifyCenAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCenAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
