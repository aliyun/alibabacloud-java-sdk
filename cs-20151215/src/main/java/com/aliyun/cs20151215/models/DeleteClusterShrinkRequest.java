// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterShrinkRequest extends TeaModel {
    /**
     * <p>The deletion options for cluster-associated resources.</p>
     */
    @NameInMap("delete_options")
    public String deleteOptionsShrink;

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

    @Deprecated
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
