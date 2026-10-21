// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RetryImageCacheShrinkRequest extends TeaModel {
    /**
     * <p>The request body is a fixed empty object {}. WorkspaceId is passed as a query parameter. Do not pass the Pool, role, Digest, or network parameters.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>This parameter is required and cannot be empty. It is reserved to keep the API compatible. This field does not currently deduplicate requests or recover the original result. If a timeout occurs or the result is not confirmed, query the query cache status first before deciding whether to commit again.</p>
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
     * <p>The current routed workspace. The server verifies the account, region, and resource ownership. You cannot omit this parameter or use it to access other workspaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-example</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static RetryImageCacheShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryImageCacheShrinkRequest self = new RetryImageCacheShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RetryImageCacheShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public RetryImageCacheShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RetryImageCacheShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RetryImageCacheShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
