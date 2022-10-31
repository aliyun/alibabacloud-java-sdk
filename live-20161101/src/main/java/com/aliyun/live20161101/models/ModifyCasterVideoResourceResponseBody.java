// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterVideoResourceResponseBody extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    public static ModifyCasterVideoResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterVideoResourceResponseBody self = new ModifyCasterVideoResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCasterVideoResourceResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyCasterVideoResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCasterVideoResourceResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
