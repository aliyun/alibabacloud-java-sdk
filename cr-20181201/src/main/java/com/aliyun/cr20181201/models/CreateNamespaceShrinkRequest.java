// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateNamespaceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically create an image repository in the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    @NameInMap("DefaultRepoConfiguration")
    public String defaultRepoConfigurationShrink;

    /**
     * <p>The default type of the repositories that are automatically created in the namespace. Valid values:</p>
     * <ul>
     * <li><code>PUBLIC</code>: public repositories</li>
     * <li><code>PRIVATE</code>: private repositories.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("DefaultRepoType")
    @Deprecated
    public String defaultRepoType;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the namespace. The name must be 2 to 120 characters in length, and can contain lowercase letters, digits, and the following delimiters: underscores (_), hyphens (-), and periods (.). The name cannot start or end with a delimiter.</p>
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
