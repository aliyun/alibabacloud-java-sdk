// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateImageCacheRequest extends TeaModel {
    /**
     * <p>The request body for creating an image cache.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateImageCacheRequestBody body;

    /**
     * <p>The non-empty request token passed as a query parameter. The current implementation does not guarantee deduplication by this token or recovery of the original acceptance result.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The product entry region, passed as a query parameter. It must match the selected region endpoint and the workspace region.</p>
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

    public static CreateImageCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheRequest self = new CreateImageCacheRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheRequest setBody(CreateImageCacheRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateImageCacheRequestBody getBody() {
        return this.body;
    }

    public CreateImageCacheRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageCacheRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageCacheRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateImageCacheRequestBody extends TeaModel {
        /**
         * <p>Specifies whether to allow public network access for the current source reading and transfer. At least one of this parameter and <code>accessVpc</code> must be set to true. The server validates the access conditions of the current workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("accessInternet")
        public Boolean accessInternet;

        /**
         * <p>Specifies whether to allow the use of a VPC for the current source reading and transfer. At least one of this parameter and <code>accessInternet</code> must be set to true. The server resolves the trusted network of the current workspace and does not modify the runtime network of the agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("accessVpc")
        public Boolean accessVpc;

        /**
         * <p>The ID of the source ACR Enterprise instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-example</p>
         */
        @NameInMap("acrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The namespace of the source ACR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the repository under the namespace. Do not include the namespace in the repository name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("repository")
        public String repository;

        /**
         * <p>The selected tag of the source image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("tag")
        public String tag;

        public static CreateImageCacheRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestBody self = new CreateImageCacheRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheRequestBody setAccessInternet(Boolean accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public Boolean getAccessInternet() {
            return this.accessInternet;
        }

        public CreateImageCacheRequestBody setAccessVpc(Boolean accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public Boolean getAccessVpc() {
            return this.accessVpc;
        }

        public CreateImageCacheRequestBody setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public CreateImageCacheRequestBody setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateImageCacheRequestBody setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public CreateImageCacheRequestBody setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
