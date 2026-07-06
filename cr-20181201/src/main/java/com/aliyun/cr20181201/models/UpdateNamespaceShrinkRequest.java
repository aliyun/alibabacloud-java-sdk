// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateNamespaceShrinkRequest extends TeaModel {
    /**
     * <p>Whether to automatically create a repository when an image is pushed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    /**
     * <p>The default configuration for automatically created repositories.</p>
     */
    @NameInMap("DefaultRepoConfiguration")
    public String defaultRepoConfigurationShrink;

    /**
     * <p>The default type for automatically created repositories. This parameter applies only if <code>AutoCreateRepo</code> is set to <code>true</code>. Valid values:</p>
     * <ul>
     * <li><p><code>PUBLIC</code>: a public repository</p>
     * </li>
     * <li><p><code>PRIVATE</code>: a private repository</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("DefaultRepoType")
    @Deprecated
    public String defaultRepoType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    public static UpdateNamespaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceShrinkRequest self = new UpdateNamespaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceShrinkRequest setAutoCreateRepo(Boolean autoCreateRepo) {
        this.autoCreateRepo = autoCreateRepo;
        return this;
    }
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    public UpdateNamespaceShrinkRequest setDefaultRepoConfigurationShrink(String defaultRepoConfigurationShrink) {
        this.defaultRepoConfigurationShrink = defaultRepoConfigurationShrink;
        return this;
    }
    public String getDefaultRepoConfigurationShrink() {
        return this.defaultRepoConfigurationShrink;
    }

    @Deprecated
    public UpdateNamespaceShrinkRequest setDefaultRepoType(String defaultRepoType) {
        this.defaultRepoType = defaultRepoType;
        return this;
    }
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    public UpdateNamespaceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNamespaceShrinkRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
