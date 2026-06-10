// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    /**
     * <p>The options for deleting the resources that are associated with the cluster.</p>
     */
    @NameInMap("delete_options")
    public java.util.List<DeleteClusterRequestDeleteOptions> deleteOptions;

    /**
     * <p>Whether to retain SLB resources. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Retains the SLB resources that are created for the cluster.</p>
     * </li>
     * <li><p><code>false</code>: Does not retain the SLB resources that are created for the cluster.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.
     * Use the <code>delete_options</code> parameter to manage <code>SLB</code> resources instead.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("keep_slb")
    @Deprecated
    public Boolean keepSlb;

    /**
     * <p>Whether to retain all associated resources. If you set this parameter to <code>true</code>, the <code>retain_resources</code> parameter is ignored, and all cloud resources that are created with the cluster and can be queried by calling <code>DescribeClusterResources</code> are retained. If you set this parameter to <code>false</code>, note that resources that are configured to be retained by default in the <code>delete_options</code> parameter are still retained. To delete these resources, you must explicitly set the <code>delete_mode</code> parameter to <code>delete</code> for them in <code>delete_options</code>.</p>
     * <ul>
     * <li><p><code>true</code>: Retains all associated cloud resources that are created with the cluster.</p>
     * </li>
     * <li><p><code>false</code>: Does not retain all associated cloud resources. Resources that are configured to be retained by default in the <code>delete_options</code> parameter, such as <code>ALB</code>, are still retained when this parameter is set to <code>false</code>.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("retain_all_resources")
    public Boolean retainAllResources;

    /**
     * <p>The IDs of resources to retain when the cluster is deleted.</p>
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
         * <p>The deletion policy for the specified resource type. Valid values:</p>
         * <ul>
         * <li><p>delete: Deletes the resources.</p>
         * </li>
         * <li><p>retain: Retains the resources.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delete</p>
         */
        @NameInMap("delete_mode")
        public String deleteMode;

        /**
         * <p>The type of resource. Valid values:</p>
         * <ul>
         * <li><p>SLB: the SLB resources created for Services. These resources are deleted by default, but you can choose to retain them.</p>
         * </li>
         * <li><p>ALB: the ALB resources created by the ALB Ingress controller. These resources are retained by default, but you can choose to delete them.</p>
         * </li>
         * <li><p>SLS_Data: the SLS project used for cluster logs. This resource is retained by default, but you can choose to delete it.</p>
         * </li>
         * <li><p>SLS_ControlPlane: the SLS project used for control plane logs in a managed cluster. This resource is retained by default, but you can choose to delete it.</p>
         * </li>
         * <li><p>PrivateZone: the PrivateZone resource created by an ACK Serverless cluster. This resource is retained by default, but you can choose to delete it.</p>
         * </li>
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
