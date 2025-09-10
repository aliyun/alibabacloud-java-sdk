// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePrometheusVirtualInstanceResponseBody extends TeaModel {
    @NameInMap("instance")
    public CreatePrometheusVirtualInstanceResponseBodyInstance instance;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePrometheusVirtualInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusVirtualInstanceResponseBody self = new CreatePrometheusVirtualInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusVirtualInstanceResponseBody setInstance(CreatePrometheusVirtualInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public CreatePrometheusVirtualInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public CreatePrometheusVirtualInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePrometheusVirtualInstanceResponseBodyInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1751520976660</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxx">http://xxxxxxx</a></p>
         */
        @NameInMap("httpApiUrl")
        public String httpApiUrl;

        /**
         * <strong>example:</strong>
         * <p>rw-e815960b4c9ebc5c3d89790c7e82</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>ack-csi-fuse</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>cn-zhengzhou-jva</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>167212345678</p>
         */
        @NameInMap("userId")
        public String userId;

        public static CreatePrometheusVirtualInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            CreatePrometheusVirtualInstanceResponseBodyInstance self = new CreatePrometheusVirtualInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public CreatePrometheusVirtualInstanceResponseBodyInstance setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreatePrometheusVirtualInstanceResponseBodyInstance setHttpApiUrl(String httpApiUrl) {
            this.httpApiUrl = httpApiUrl;
            return this;
        }
        public String getHttpApiUrl() {
            return this.httpApiUrl;
        }

        public CreatePrometheusVirtualInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreatePrometheusVirtualInstanceResponseBodyInstance setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreatePrometheusVirtualInstanceResponseBodyInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreatePrometheusVirtualInstanceResponseBodyInstance setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
