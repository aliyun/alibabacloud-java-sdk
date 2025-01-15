// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    /**
     * <p>The type of cluster resource that you want to delete or retain.</p>
     */
    @NameInMap("delete_options")
    public java.util.List<DeleteClusterRequestDeleteOptions> deleteOptions;

    /**
     * <p>Specifies whether to retain the Server Load Balancer (SLB) resources that are created by the cluster.</p>
     * <ul>
     * <li><code>true</code>: retains the SLB instances that are created by the cluster.</li>
     * <li><code>false</code>: does not retain the SLB instances that are created by the cluster.</li>
     * </ul>
     * <p>Default value: <code>false</code>. Set resource_type to <code>SLB</code> in the <code>delete_options</code> parameter to manage SLB instances.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("keep_slb")
    @Deprecated
    public Boolean keepSlb;

    /**
     * <p>Specifies whether to retain all resources. If you set the parameter to <code>true</code>, the <code>retain_resources</code> parameter is ignored. The cloud resources that are created by the cluster are retained. You can call the <code>DescribeClusterResources</code> operation to query cloud resources created by the cluster. If you set the parameter to <code>false</code>, resources to be retained by default in the <code>delete_options</code> parameter are still retained. To delete these resources, set <code>delete_mode</code> to <code>delete</code> in <code>delete_options</code>.</p>
     * <ul>
     * <li><code>true</code>: retains all resources, including cloud resources created by the cluster.</li>
     * <li><code>false</code>: does not retain all resources. Resources to be retained by default in the <code>delete_options</code> parameter are retained. For example, <code>ALB</code> instances are retained when this parameter is set to <code>false</code>.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("retain_all_resources")
    public Boolean retainAllResources;

    /**
     * <p>The list of resources. To retain resources when you delete a cluster, you need to specify the IDs of the resources to be retained.</p>
     */
    @NameInMap("retain_resources")
    public java.util.List<String> retainResources;

    public static DeleteClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterRequest self = new DeleteClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterRequest setDeleteOptions(java.util.List<DeleteClusterRequestDeleteOptions> deleteOptions) {
        this.deleteOptions = deleteOptions;
        return this;
    }
    public java.util.List<DeleteClusterRequestDeleteOptions> getDeleteOptions() {
        return this.deleteOptions;
    }

    @Deprecated
    public DeleteClusterRequest setKeepSlb(Boolean keepSlb) {
        this.keepSlb = keepSlb;
        return this;
    }
    public Boolean getKeepSlb() {
        return this.keepSlb;
    }

    public DeleteClusterRequest setRetainAllResources(Boolean retainAllResources) {
        this.retainAllResources = retainAllResources;
        return this;
    }
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    public DeleteClusterRequest setRetainResources(java.util.List<String> retainResources) {
        this.retainResources = retainResources;
        return this;
    }
    public java.util.List<String> getRetainResources() {
        return this.retainResources;
    }

    public static class DeleteClusterRequestDeleteOptions extends TeaModel {
        /**
         * <p>The deletion policy for the specified type of resource. Valid values:</p>
         * <ul>
         * <li>delete: deletes the specified type of resource.</li>
         * <li>retain: retains the specified type of resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delete</p>
         */
        @NameInMap("delete_mode")
        public String deleteMode;

        /**
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li>SLB: SLB resources created for Services. By default, the SLB resources are automatically deleted.</li>
         * <li>ALB: Application Load Balancer (ALB) resources created by the ALB Ingress controller. By default, the ALB resources are retained.</li>
         * <li>SLS_Data: Simple Log Service projects used by the cluster logging feature. By default, the Simple Log Service projects are retained.</li>
         * <li>SLS_ControlPlane: Simple Log Service projects used to store the logs of control planes in ACK managed clusters. By default, the Simple Log Service projects are retained.</li>
         * <li>PrivateZone: PrivateZone resources created by ACK Serverless clusters. By default, the PrivateZone resources are retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLS_Data</p>
         */
        @NameInMap("resource_type")
        public String resourceType;

        public static DeleteClusterRequestDeleteOptions build(java.util.Map<String, ?> map) throws Exception {
            DeleteClusterRequestDeleteOptions self = new DeleteClusterRequestDeleteOptions();
            return TeaModel.build(map, self);
        }

        public DeleteClusterRequestDeleteOptions setDeleteMode(String deleteMode) {
            this.deleteMode = deleteMode;
            return this;
        }
        public String getDeleteMode() {
            return this.deleteMode;
        }

        public DeleteClusterRequestDeleteOptions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
