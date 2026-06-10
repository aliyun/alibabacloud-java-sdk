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
        /**
         * <p>The cluster ID of the dependent resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cc5ee03f63e43425cb6f71f1a1756****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The type of the dependent resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::VPC::NatGateway</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        /**
         * <p>The instance ID of the dependent resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-wz9sphwk42sdtjixo****</p>
         */
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
        /**
         * <p>The type of the Kubernetes object.</p>
         * 
         * <strong>example:</strong>
         * <p>Service</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The namespace of the Kubernetes object.</p>
         * 
         * <strong>example:</strong>
         * <p>kube-system</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the Kubernetes object.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx-ingress-lb</p>
         */
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
        /**
         * <p>Indicates whether to delete the resource by default when the cluster is deleted. Valid values:</p>
         * <ul>
         * <li><p>true: The resource is deleted by default.</p>
         * </li>
         * <li><p>false: The resource is not deleted by default.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("delete_by_default")
        public Boolean deleteByDefault;

        /**
         * <p>Indicates whether the default behavior specified by the <code>delete_by_default</code> parameter can be changed. Valid values:</p>
         * <ul>
         * <li><p>true: The default behavior can be changed.</p>
         * </li>
         * <li><p>false: The default behavior cannot be changed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>cb95aa626a47740afbf6aa099b65****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-15T14:34:42+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-wz9sphwk42sdtjixo****</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <p>Information about the resource. For more details about its source, see <a href="https://help.aliyun.com/document_detail/133836.html">ListStackResources</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Id\&quot;:\&quot;KubernetesWorkerRole\&quot;,\&quot;Name\&quot;:\&quot;KubernetesWorkerRole\&quot;,\&quot;Type\&quot;:\&quot;ALIYUN::RAM::Role\&quot;,\&quot;Status\&quot;:\&quot;CREATE_COMPLETE\&quot;,\&quot;StatusReason\&quot;:\&quot;state changed\&quot;,\&quot;Updated\&quot;:\&quot;2025-04-10T06:21:17\&quot;,\&quot;PhysicalId\&quot;:\&quot;KubernetesWorkerRole-7e611193-225f-40f6-bc3c-ea8633******\&quot;}</p>
         */
        @NameInMap("resource_info")
        public String resourceInfo;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::VPC::NatGateway</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        /**
         * <p>The state of the resource. Valid values:</p>
         * <ul>
         * <li><p><code>CREATE_COMPLETE</code>: The resource is successfully created.</p>
         * </li>
         * <li><p><code>CREATE_FAILED</code>: The resource fails to be created.</p>
         * </li>
         * <li><p><code>CREATE_IN_PROGRESS</code>: The resource is being created.</p>
         * </li>
         * <li><p><code>DELETE_FAILED</code>: The resource fails to be deleted.</p>
         * </li>
         * <li><p><code>DELETE_IN_PROGRESS</code>: The resource is being deleted.</p>
         * </li>
         * <li><p><code>ROLLBACK_COMPLETE</code>: The rollback is successful.</p>
         * </li>
         * <li><p><code>ROLLBACK_FAILED</code>: The rollback fails.</p>
         * </li>
         * <li><p><code>ROLLBACK_IN_PROGRESS</code>: The rollback is in progress.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>Indicates whether the resource is created by ACK. Valid values:</p>
         * <ul>
         * <li><p>1: The resource is created by ACK.</p>
         * </li>
         * <li><p>0: The resource is an existing resource.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_create")
        public Long autoCreate;

        /**
         * <p>The list of dependent resources.</p>
         */
        @NameInMap("dependencies")
        public java.util.List<DescribeClusterResourcesResponseBodyDependencies> dependencies;

        /**
         * <p>The Kubernetes object that is associated with the resource.</p>
         */
        @NameInMap("associated_object")
        public DescribeClusterResourcesResponseBodyAssociatedObject associatedObject;

        /**
         * <p>The deletion behavior of the resource when the cluster is deleted.</p>
         */
        @NameInMap("delete_behavior")
        public DescribeClusterResourcesResponseBodyDeleteBehavior deleteBehavior;

        /**
         * <p>The type of the creator of the resource. Valid values:</p>
         * <ul>
         * <li><p>user: The resource is created by a user.</p>
         * </li>
         * <li><p>system: The resource is created by the ACK control plane.</p>
         * </li>
         * <li><p>addon: The resource is created by an add-on.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addon</p>
         */
        @NameInMap("creator_type")
        public String creatorType;

        /**
         * <p>Extra information about the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;type&quot;: &quot;SLS_Data&quot; }</p>
         */
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
