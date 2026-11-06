// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RetryImageCacheRequest extends TeaModel {
    /**
     * <p>The request body for retrying image cache creation.</p>
     */
    @NameInMap("body")
    public RetryImageCacheRequestBody body;

    /**
     * <p>The non-empty request token passed as a query parameter. The current implementation does not guarantee deduplication or recovery of the original acceptance result based on this token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The product entry region. This parameter is passed as a query parameter and must be consistent with the selected region endpoint and the workspace region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-example</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static RetryImageCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryImageCacheRequest self = new RetryImageCacheRequest();
        return TeaModel.build(map, self);
    }

    public RetryImageCacheRequest setBody(RetryImageCacheRequestBody body) {
        this.body = body;
        return this;
    }
    public RetryImageCacheRequestBody getBody() {
        return this.body;
    }

    public RetryImageCacheRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RetryImageCacheRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RetryImageCacheRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RetryImageCacheRequestBody extends TeaModel {
        public static RetryImageCacheRequestBody build(java.util.Map<String, ?> map) throws Exception {
            RetryImageCacheRequestBody self = new RetryImageCacheRequestBody();
            return TeaModel.build(map, self);
        }

    }

}
