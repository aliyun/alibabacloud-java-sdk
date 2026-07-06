// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateNamespaceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether a repository is automatically created when an image is pushed to a repository that does not yet exist in the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    @NameInMap("DefaultRepoConfiguration")
    public String defaultRepoConfigurationShrink;

    /**
     * <p>The default type of automatically created repositories. Valid values:</p>
     * <ul>
     * <li><p><code>PUBLIC</code>: public</p>
     * </li>
     * <li><p><code>PRIVATE</code>: private</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("DefaultRepoType")
    @Deprecated
    public String defaultRepoType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the namespace. The name must be 2 to 120 characters long and can contain only lowercase letters, digits, and the following separators: underscores (_), hyphens (-), and periods (.). A separator cannot be used as the first or last character.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace1</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    public static CreateNamespaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceShrinkRequest self = new CreateNamespaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceShrinkRequest setAutoCreateRepo(Boolean autoCreateRepo) {
        this.autoCreateRepo = autoCreateRepo;
        return this;
    }
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    public CreateNamespaceShrinkRequest setDefaultRepoConfigurationShrink(String defaultRepoConfigurationShrink) {
        this.defaultRepoConfigurationShrink = defaultRepoConfigurationShrink;
        return this;
    }
    public String getDefaultRepoConfigurationShrink() {
        return this.defaultRepoConfigurationShrink;
    }

    @Deprecated
    public CreateNamespaceShrinkRequest setDefaultRepoType(String defaultRepoType) {
        this.defaultRepoType = defaultRepoType;
        return this;
    }
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    public CreateNamespaceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNamespaceShrinkRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
