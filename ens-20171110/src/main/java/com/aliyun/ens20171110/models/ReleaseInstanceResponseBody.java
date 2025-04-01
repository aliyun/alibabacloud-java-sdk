// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the resource.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>instance</li>
     * <li>eip</li>
     * <li>disk</li>
     * <li>network</li>
     * <li>natgateway</li>
     * <li>vswitch</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>eip</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ReleaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceResponseBody self = new ReleaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseInstanceResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
