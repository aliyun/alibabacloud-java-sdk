// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public static class DescribeClusterResourcesResponseBodyDependencies extends TeaModel {
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("resource_type")
        public String resourceType;

        @NameInMap("instance_id")
        public String instanceId;

        public static DescribeClusterResourcesResponseBodyDependencies build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResourcesResponseBodyDependencies self = new DescribeClusterResourcesResponseBodyDependencies();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResourcesResponseBodyDependencies setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterResourcesResponseBodyDependencies setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeClusterResourcesResponseBodyDependencies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeClusterResourcesResponseBodyAssociatedObject extends TeaModel {
        @NameInMap("kind")
        public String kind;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("name")
        public String name;

        public static DescribeClusterResourcesResponseBodyAssociatedObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResourcesResponseBodyAssociatedObject self = new DescribeClusterResourcesResponseBodyAssociatedObject();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResourcesResponseBodyAssociatedObject setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public DescribeClusterResourcesResponseBodyAssociatedObject setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeClusterResourcesResponseBodyAssociatedObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeClusterResourcesResponseBodyDeleteBehavior extends TeaModel {
        @NameInMap("delete_by_default")
        public Boolean deleteByDefault;

        @NameInMap("changeable")
        public Boolean changeable;

        public static DescribeClusterResourcesResponseBodyDeleteBehavior build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResourcesResponseBodyDeleteBehavior self = new DescribeClusterResourcesResponseBodyDeleteBehavior();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResourcesResponseBodyDeleteBehavior setDeleteByDefault(Boolean deleteByDefault) {
            this.deleteByDefault = deleteByDefault;
            return this;
        }
        public Boolean getDeleteByDefault() {
            return this.deleteByDefault;
        }

        public DescribeClusterResourcesResponseBodyDeleteBehavior setChangeable(Boolean changeable) {
            this.changeable = changeable;
            return this;
        }
        public Boolean getChangeable() {
            return this.changeable;
        }

    }

    public static class DescribeClusterResourcesResponseBody extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The time when the resource was created.</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The resource ID.</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <p>The information about the resource. For more information about how to query the source information about a resource, see [ListStackResources](~~133836~~).</p>
         */
        @NameInMap("resource_info")
        public String resourceInfo;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        /**
         * <p>The resource status. Valid values:</p>
         * <br>
         * <p>*   `CREATE_COMPLETE`: The resource is created.</p>
         * <p>*   `CREATE_FAILED`: The resource failed to be created.</p>
         * <p>*   `CREATE_IN_PROGRESS`: The resource is being created.</p>
         * <p>*   `DELETE_FAILED`: The resource failed to be deleted.</p>
         * <p>*   `DELETE_IN_PROGRESS`: The resource is being deleted.</p>
         * <p>*   `ROLLBACK_COMPLETE`: The resource is rolled back.</p>
         * <p>*   `ROLLBACK_FAILED`: The resource failed to be rolled back.</p>
         * <p>*   `ROLLBACK_IN_PROGRESS`: The resource is being rolled back.</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>Indicates whether the resource is created by Container Service for Kubernetes (ACK). Valid values:</p>
         * <br>
         * <p>*   1: The resource is created by ACK.</p>
         * <p>*   0: The resource is an existing resource.</p>
         */
        @NameInMap("auto_create")
        public Long autoCreate;

        @NameInMap("dependencies")
        public java.util.List<DescribeClusterResourcesResponseBodyDependencies> dependencies;

        @NameInMap("associated_object")
        public DescribeClusterResourcesResponseBodyAssociatedObject associatedObject;

        @NameInMap("delete_behavior")
        public DescribeClusterResourcesResponseBodyDeleteBehavior deleteBehavior;

        @NameInMap("creator_type")
        public String creatorType;

        @NameInMap("extra_info")
        public java.util.Map<String, ?> extraInfo;

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

        public DescribeClusterResourcesResponseBody setDependencies(java.util.List<DescribeClusterResourcesResponseBodyDependencies> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<DescribeClusterResourcesResponseBodyDependencies> getDependencies() {
            return this.dependencies;
        }

        public DescribeClusterResourcesResponseBody setAssociatedObject(DescribeClusterResourcesResponseBodyAssociatedObject associatedObject) {
            this.associatedObject = associatedObject;
            return this;
        }
        public DescribeClusterResourcesResponseBodyAssociatedObject getAssociatedObject() {
            return this.associatedObject;
        }

        public DescribeClusterResourcesResponseBody setDeleteBehavior(DescribeClusterResourcesResponseBodyDeleteBehavior deleteBehavior) {
            this.deleteBehavior = deleteBehavior;
            return this;
        }
        public DescribeClusterResourcesResponseBodyDeleteBehavior getDeleteBehavior() {
            return this.deleteBehavior;
        }

        public DescribeClusterResourcesResponseBody setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public DescribeClusterResourcesResponseBody setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

    }

}
