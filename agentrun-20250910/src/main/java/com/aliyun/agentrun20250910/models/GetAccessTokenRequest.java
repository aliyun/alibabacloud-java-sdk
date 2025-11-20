// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetAccessTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mod-kw1750tjqs94n9k37o5hjk</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>COUPON_OPERATION_CALLBACK</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <strong>example:</strong>
     * <p>SceneTestingTask</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static GetAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessTokenRequest self = new GetAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessTokenRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetAccessTokenRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public GetAccessTokenRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
