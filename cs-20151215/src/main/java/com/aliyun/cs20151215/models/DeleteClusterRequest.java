// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to retain the Server Load Balancer (SLB) resources that are created by the cluster.</p>
     * <br>
     * <p>*   `true`: retains the SLB resources that are created by the cluster.</p>
     * <p>*   `false`: does not retain the SLB resources that are created by the cluster.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("keep_slb")
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

}
