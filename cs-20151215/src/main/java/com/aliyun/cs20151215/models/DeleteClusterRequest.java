// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    /**
     * <p>The deletion options for the resources associated with the cluster.</p>
     */
    @NameInMap("delete_options")
    public java.util.List<DeleteClusterRequestDeleteOptions> deleteOptions;

    /**
     * <p>Specifies whether to retain the Server Load Balancer (SLB) instances created by using Services.
     * Valid values:</p>
     * <ul>
     * <li><code>true</code>: retains the created SLB resources.</li>
     * <li><code>false</code>: does not retain the created SLB resources.</li>
     * </ul>
     * <p>Default value: <code>false</code>.
     * <strong>[Deprecated]</strong> Use <code>SLB</code> in <code>delete_options</code> instead.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("keep_slb")
    @Deprecated
    public Boolean keepSlb;

    /**
     * <p>Specifies whether to retain all resources. If you set this parameter to <code>true</code>, the <code>retain_resources</code> parameter is ignored, and all cloud resources created by the cluster that are queried by calling the <code>DescribeClusterResources</code> operation are retained. If you set this parameter to <code>false</code>, note that the resources that are retained by default in <code>delete_options</code> are still retained. To delete these resources, set <code>delete_mode</code> to <code>delete</code> in <code>delete_options</code>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>true</code>: retains all resources, including all cloud resources created by the cluster.</li>
     * <li><code>false</code>: does not retain all resources, except for the resources that are retained by default in <code>delete_options</code>. For example, ALB resources are still retained even if this parameter is set to <code>false</code>.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("retain_all_resources")
    public Boolean retainAllResources;

    /**
     * <p>The list of resources. To retain resources when you delete the cluster, specify the IDs of the corresponding resources.</p>
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
         * <p>The deletion mode for this type of resource. Valid values:</p>
         * <ul>
         * <li><code>delete</code>: deletes this type of resource.</li>
         * <li><code>retain</code>: retains this type of resource.</li>
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
         * <li><code>SLB</code>: the SLB resources created by using Services. By default, these resources are deleted. You can choose to retain them.</li>
         * <li><code>ALB</code>: the ALB resources created by the ALB Ingress controller. By default, these resources are retained. You can choose to delete them.</li>
         * <li><code>SLS_Data</code>: the SLS projects used for the cluster log feature. By default, these resources are retained. You can choose to delete them.</li>
         * <li><code>SLS_ControlPlane</code>: the SLS projects used for the control plane logs of managed clusters. By default, these resources are retained. You can choose to delete them.</li>
         * <li><code>PrivateZone</code>: the PrivateZone resources created by ACK Serverless clusters. By default, these resources are retained. You can choose to delete them.</li>
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
