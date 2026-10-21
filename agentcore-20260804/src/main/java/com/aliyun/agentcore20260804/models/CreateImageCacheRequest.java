// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateImageCacheRequest extends TeaModel {
    /**
     * <p>The business parameters for creating an image cache.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateImageCacheRequestBody body;

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
         * <p>Specifies whether to allow the current source reading and transfer to use the public network. At least one of this parameter and accessVpc must be set to true. The server verifies the access conditions of the current workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("accessInternet")
        public Boolean accessInternet;

        /**
         * <p>Specifies whether to allow the current source reading and transfer to use a VPC. At least one of this parameter and accessInternet must be set to true. The server parses the trusted network of the current workspace and does not modify the agent runtime network.</p>
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
         * <p>The name of the repository under the namespace. Do not include the namespace repeatedly.</p>
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
