// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<DescribeClusterResourcesResponseBody> body;

    public static DescribeClusterResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourcesResponse self = new DescribeClusterResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterResourcesResponse setBody(java.util.List<DescribeClusterResourcesResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeClusterResourcesResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeClusterResourcesResponseBody extends TeaModel {
        // 集群ID。
        @NameInMap("cluster_id")
        public String clusterId;

        // 资源创建时间。
        @NameInMap("created")
        public String created;

        // 资源实例ID。
        @NameInMap("instance_id")
        public String instanceId;

        // 资源元信息。
        @NameInMap("resource_info")
        public String resourceInfo;

        // 资源类型。
        @NameInMap("resource_type")
        public String resourceType;

        // 资源状态。
        @NameInMap("state")
        public String state;

        // 是否为自动创建。
        @NameInMap("auto_create")
        public Long autoCreate;

        public static DescribeClusterResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResourcesResponseBody self = new DescribeClusterResourcesResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResourcesResponseBody setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterResourcesResponseBody setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeClusterResourcesResponseBody setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClusterResourcesResponseBody setResourceInfo(String resourceInfo) {
            this.resourceInfo = resourceInfo;
            return this;
        }
        public String getResourceInfo() {
            return this.resourceInfo;
        }

        public DescribeClusterResourcesResponseBody setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeClusterResourcesResponseBody setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterResourcesResponseBody setAutoCreate(Long autoCreate) {
            this.autoCreate = autoCreate;
            return this;
        }
        public Long getAutoCreate() {
            return this.autoCreate;
        }

    }

}
