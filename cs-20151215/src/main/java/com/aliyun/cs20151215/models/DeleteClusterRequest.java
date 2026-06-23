// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    /**
     * <p>The deletion options for cluster-associated resources.</p>
     */
    @NameInMap("delete_options")
    public java.util.List<DeleteClusterRequestDeleteOptions> deleteOptions;

    /**
     * <p>Specifies whether to retain SLB resources. Valid values:</p>
     * <ul>
     * <li><code>true</code>: retains the created SLB resources.</li>
     * <li><code>false</code>: does not retain the created SLB resources.</li>
     * </ul>
     * <p>Default value: <code>false</code>.
     * Use <code>SLB</code> in <code>delete_options</code> to manage this setting.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("keep_slb")
    @Deprecated
    public Boolean keepSlb;

    /**
     * <p>Specifies whether to retain all resources. If this parameter is set to <code>true</code>, <code>retain_resources</code> is ignored, and cloud resources created through the cluster that are queried by the <code>DescribeClusterResources</code> operation are retained. If this parameter is set to <code>false</code>, resources that are retained by default in <code>delete_options</code> are still retained. To delete these resources, set <code>delete_mode</code> to <code>delete</code> in <code>delete_options</code>.</p>
     * <ul>
     * <li><code>true</code>: retains all resources, including all cloud resources created through the cluster.</li>
     * <li><code>false</code>: does not retain all resources, except resources defined as retained by default in <code>delete_options</code>. For example, <code>ALB</code> resources are still retained when this parameter is set to <code>false</code>.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("retain_all_resources")
    public Boolean retainAllResources;

    /**
     * <p>The resource list. To retain resources when you delete a cluster, specify the IDs of the resources to retain.</p>
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
         * <p>The deletion policy for this resource type. Valid values:</p>
         * <ul>
         * <li>delete: deletes resources of this type.</li>
         * <li>retain: retains resources of this type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delete</p>
         */
        @NameInMap("delete_mode")
        public String deleteMode;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>SLB: SLB resources created through services. Deleted by default. You can choose to retain them.</li>
         * <li>ALB: ALB resources created by ALB Ingress Controller. Retained by default. You can choose to delete them.</li>
         * <li>SLS_Data: the SLS project used by the cluster logging feature. Retained by default. You can choose to delete it.</li>
         * <li>SLS_ControlPlane: the SLS project used by the control plane logs of managed clusters. Retained by default. You can choose to delete it.</li>
         * <li>PrivateZone: PrivateZone resources created by ACK Serverless clusters. Retained by default. You can choose to delete them.</li>
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
