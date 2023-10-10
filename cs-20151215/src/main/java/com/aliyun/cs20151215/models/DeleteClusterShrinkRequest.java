// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterShrinkRequest extends TeaModel {
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
    public String retainResourcesShrink;

    public static DeleteClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterShrinkRequest self = new DeleteClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterShrinkRequest setKeepSlb(Boolean keepSlb) {
        this.keepSlb = keepSlb;
        return this;
    }
    public Boolean getKeepSlb() {
        return this.keepSlb;
    }

    public DeleteClusterShrinkRequest setRetainAllResources(Boolean retainAllResources) {
        this.retainAllResources = retainAllResources;
        return this;
    }
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    public DeleteClusterShrinkRequest setRetainResourcesShrink(String retainResourcesShrink) {
        this.retainResourcesShrink = retainResourcesShrink;
        return this;
    }
    public String getRetainResourcesShrink() {
        return this.retainResourcesShrink;
    }

}
