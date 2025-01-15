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
