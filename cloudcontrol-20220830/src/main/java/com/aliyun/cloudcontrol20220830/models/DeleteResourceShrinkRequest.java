// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class DeleteResourceShrinkRequest extends TeaModel {
    /**
     * <p>A client token to ensure idempotence. This parameter works only if the cloud product supports idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>1e810dfe1468721d0664a49b9d9f74f4</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("filter")
    public String filterShrink;

    /**
     * <p>The region ID. This parameter is required if the cloud product is region-specific.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static DeleteResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceShrinkRequest self = new DeleteResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteResourceShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public DeleteResourceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
