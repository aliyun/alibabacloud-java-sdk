// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterShrinkRequest extends TeaModel {
    /**
     * <p>The type of cluster resource that you want to delete or retain.</p>
     */
    @NameInMap("delete_options")
    public String deleteOptionsShrink;

    /**
     * <p>Specifies whether to retain the Server Load Balancer (SLB) instances that are created by the cluster.</p>
     * <ul>
     * <li><code>true</code>: retains the SLB instances that are created by the cluster.</li>
     * <li><code>false</code>: does not retain the SLB instances that are created by the cluster.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("keep_slb")
    @Deprecated
    public Boolean keepSlb;

    /**
     * <p>Specifies whether to retain all resources. If you set the parameter to <code>true</code>, the <code>retain_resources</code> parameter is ignored.</p>
     * <ul>
     * <li><code>true</code>: retains all resources.</li>
     * <li><code>false</code>: does not retain all resources.</li>
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
    public String retainResourcesShrink;

    public static DeleteClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterShrinkRequest self = new DeleteClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterShrinkRequest setDeleteOptionsShrink(String deleteOptionsShrink) {
        this.deleteOptionsShrink = deleteOptionsShrink;
        return this;
    }
    public String getDeleteOptionsShrink() {
        return this.deleteOptionsShrink;
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
