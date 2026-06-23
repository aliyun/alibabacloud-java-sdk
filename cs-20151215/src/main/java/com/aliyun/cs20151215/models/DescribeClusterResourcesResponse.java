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
         * <p>依赖资源的集群ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cc5ee03f63e43425cb6f71f1a1756****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>依赖资源类型。</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::VPC::NatGateway</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        /**
         * <p>依赖资源实例ID。</p>
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
         * <p>k8s对象类型。</p>
         * 
         * <strong>example:</strong>
         * <p>Service</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>k8s对象命名空间。</p>
         * 
         * <strong>example:</strong>
         * <p>kube-system</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>k8s对象名称。</p>
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
         * <p>删除集群时是否默认删除该资源。</p>
         * <ul>
         * <li><p>true：默认删除该资源。</p>
         * </li>
         * <li><p>fasle：不删除该资源。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("delete_by_default")
        public Boolean deleteByDefault;

        /**
         * <p><code>delete_by_default</code>的默认行为是否可以更改。</p>
         * <ul>
         * <li><p>true：可以更改。</p>
         * </li>
         * <li><p>false：不支持更改。</p>
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
         * <p>集群ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cb95aa626a47740afbf6aa099b65****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>资源创建时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-15T14:34:42+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>资源ID。</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-wz9sphwk42sdtjixo****</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <p>资源信息。关于资源的源信息，请参见<a href="https://help.aliyun.com/document_detail/133836.html">ListStackResources</a>。</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Id\&quot;:\&quot;KubernetesWorkerRole\&quot;,\&quot;Name\&quot;:\&quot;KubernetesWorkerRole\&quot;,\&quot;Type\&quot;:\&quot;ALIYUN::RAM::Role\&quot;,\&quot;Status\&quot;:\&quot;CREATE_COMPLETE\&quot;,\&quot;StatusReason\&quot;:\&quot;state changed\&quot;,\&quot;Updated\&quot;:\&quot;2025-04-10T06:21:17\&quot;,\&quot;PhysicalId\&quot;:\&quot;KubernetesWorkerRole-7e611193-225f-40f6-bc3c-ea8633******\&quot;}</p>
         */
        @NameInMap("resource_info")
        public String resourceInfo;

        /**
         * <p>资源类型。</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::VPC::NatGateway</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        /**
         * <p>资源状态。可选值：</p>
         * <ul>
         * <li><code>CREATE_COMPLETE</code>：成功创建资源。</li>
         * <li><code>CREATE_FAILED</code>：创建资源失败。</li>
         * <li><code>CREATE_IN_PROGRESS</code>：创建资源中。</li>
         * <li><code>DELETE_FAILED</code>：删除资源失败。</li>
         * <li><code>DELETE_IN_PROGRESS</code>：删除资源中。</li>
         * <li><code>ROLLBACK_COMPLETE</code>：成功回滚。</li>
         * <li><code>ROLLBACK_FAILED</code>：回滚失败。</li>
         * <li><code>ROLLBACK_IN_PROGRESS</code>：回滚中。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>资源是否由ACK创建：</p>
         * <ul>
         * <li>1：表示由ACK创建。</li>
         * <li>0：表示该资源为已有资源。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_create")
        public Long autoCreate;

        /**
         * <p>依赖资源列表。</p>
         */
        @NameInMap("dependencies")
        public java.util.List<DescribeClusterResourcesResponseBodyDependencies> dependencies;

        /**
         * <p>资源关联的k8s对象。</p>
         */
        @NameInMap("associated_object")
        public DescribeClusterResourcesResponseBodyAssociatedObject associatedObject;

        /**
         * <p>删除集群时该资源的删除行为。</p>
         */
        @NameInMap("delete_behavior")
        public DescribeClusterResourcesResponseBodyDeleteBehavior deleteBehavior;

        /**
         * <p>该资源创建者的类型。可能的取值：</p>
         * <ul>
         * <li>user：由用户自行创建；</li>
         * <li>system：由ACK管控系统创建；</li>
         * <li>addon：由集群组件创建。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addon</p>
         */
        @NameInMap("creator_type")
        public String creatorType;

        /**
         * <p>资源的其他信息。</p>
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
