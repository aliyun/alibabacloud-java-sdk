// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ModifyServiceInstanceResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46577928-3162-15A6-9084-69820EB9xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyServiceInstanceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceInstanceResourcesResponseBody self = new ModifyServiceInstanceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyServiceInstanceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
