// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterShrinkRequest extends TeaModel {
    /**
     * <p>The options for deleting the resources that are associated with the cluster.</p>
     */
    @NameInMap("delete_options")
    public String deleteOptionsShrink;

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
