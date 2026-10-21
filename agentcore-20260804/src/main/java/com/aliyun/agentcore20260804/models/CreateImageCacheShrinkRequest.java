// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateImageCacheShrinkRequest extends TeaModel {
    /**
     * <p>The business parameters for creating an image cache.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>This parameter is required and cannot be empty. It is reserved to be compatible with the API. Currently, it does not provide the ability to deduplicate requests or recover the original result based on this field. If a timeout occurs or the result is unconfirmed, query the query cache status first before deciding whether to recommit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The product entry region, which is determined by the selected region endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The current routed workspace. The server verifies the account, region, and resource ownership. This parameter cannot be omitted or used to access other workspaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-example</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateImageCacheShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheShrinkRequest self = new CreateImageCacheShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreateImageCacheShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageCacheShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageCacheShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
