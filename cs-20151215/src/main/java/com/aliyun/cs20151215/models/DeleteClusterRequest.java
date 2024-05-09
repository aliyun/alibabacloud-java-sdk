// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    @NameInMap("delete_options")
    public java.util.List<DeleteClusterRequestDeleteOptions> deleteOptions;

    /**
     * <p>Specifies whether to retain the Server Load Balancer (SLB) resources that are created by the cluster.</p>
     * <br>
     * <p>*   `true`: retains the SLB resources that are created by the cluster.</p>
     * <p>*   `false`: does not retain the SLB resources that are created by the cluster.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("keep_slb")
    @Deprecated
    public Boolean keepSlb;

    /**
     * <p>Specifies whether to retain all resources. If you set the parameter to `true`, the `retain_resources` parameter is ignored.</p>
     * <br>
     * <p>*   `true`: retains all resources.</p>
     * <p>*   `false`: does not retain all resources.</p>
     * <br>
     * <p>Default value: `false`.</p>
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
        @NameInMap("delete_mode")
        public String deleteMode;

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
