// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartNamespaceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically create repositories in the namespace. Valid values:</p>
     * <p>\-<code> true</code>: automatically creates repositories in the namespace.</p>
     * <p>\-<code> false</code>: does not automatically create repositories in the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    /**
     * <p>The default repository type. Valid values:</p>
     * <ul>
     * <li><code>PUBLIC</code>: a public repository</li>
     * <li><code>PRIVATE</code>: a private repository</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("DefaultRepoType")
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
     * <p>The name of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace01</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    public static CreateChartNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChartNamespaceRequest self = new CreateChartNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateChartNamespaceRequest setAutoCreateRepo(Boolean autoCreateRepo) {
        this.autoCreateRepo = autoCreateRepo;
        return this;
    }
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    public CreateChartNamespaceRequest setDefaultRepoType(String defaultRepoType) {
        this.defaultRepoType = defaultRepoType;
        return this;
    }
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    public CreateChartNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateChartNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
