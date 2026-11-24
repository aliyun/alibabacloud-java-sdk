// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateNamespaceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether automatic creation of an image repository is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    @NameInMap("DefaultRepoConfiguration")
    public String defaultRepoConfigurationShrink;

    /**
     * <p>The default repository type for automatic creation. Valid values:</p>
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
     * <p>The name of the namespace. The name must be 2 to 120 characters in length and can contain lowercase letters and digits. The following separators are supported: underscores (_), hyphens (-), and periods (.). A separator cannot be placed at the beginning or end of the name.</p>
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
