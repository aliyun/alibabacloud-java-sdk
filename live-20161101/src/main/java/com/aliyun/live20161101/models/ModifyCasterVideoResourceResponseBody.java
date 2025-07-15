// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterVideoResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio. This parameter is used in the requests of the following operations: DescribeCasterVideoResources, AddCasterLayout, and DescribeCasterLayouts.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>98461064-1c94-4dc1-85ce-94098764****</p>
     */
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
