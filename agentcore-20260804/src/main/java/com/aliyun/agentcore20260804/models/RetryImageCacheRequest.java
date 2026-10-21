// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RetryImageCacheRequest extends TeaModel {
    /**
     * <p>The request body is a fixed empty object {}. WorkspaceId is passed as a query parameter. Do not pass the Pool, role, Digest, or network parameters.</p>
     */
    @NameInMap("body")
    public RetryImageCacheRequestBody body;

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
