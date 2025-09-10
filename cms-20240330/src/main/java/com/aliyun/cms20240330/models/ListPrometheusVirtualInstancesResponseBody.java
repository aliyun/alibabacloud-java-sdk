// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusVirtualInstancesResponseBody extends TeaModel {
    @NameInMap("instances")
    public java.util.List<ListPrometheusVirtualInstancesResponseBodyInstances> instances;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPrometheusVirtualInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusVirtualInstancesResponseBody self = new ListPrometheusVirtualInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusVirtualInstancesResponseBody setInstances(java.util.List<ListPrometheusVirtualInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListPrometheusVirtualInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListPrometheusVirtualInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrometheusVirtualInstancesResponseBodyInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1750315319946</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxxx">http://xxxxxxxx</a></p>
         */
        @NameInMap("httpApiUrl")
        public String httpApiUrl;

        /**
         * <strong>example:</strong>
         * <p>rw-b8cfbbe94194ac37fe83f3d2d16a</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai-cloudspe</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>17073812345</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListPrometheusVirtualInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusVirtualInstancesResponseBodyInstances self = new ListPrometheusVirtualInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListPrometheusVirtualInstancesResponseBodyInstances setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListPrometheusVirtualInstancesResponseBodyInstances setHttpApiUrl(String httpApiUrl) {
            this.httpApiUrl = httpApiUrl;
            return this;
        }
        public String getHttpApiUrl() {
            return this.httpApiUrl;
        }

        public ListPrometheusVirtualInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPrometheusVirtualInstancesResponseBodyInstances setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListPrometheusVirtualInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPrometheusVirtualInstancesResponseBodyInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
