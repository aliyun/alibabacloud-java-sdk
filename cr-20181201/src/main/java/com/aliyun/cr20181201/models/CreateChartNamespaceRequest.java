// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartNamespaceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically create repositories in the namespace. Valid values:</p>
     * <br>
     * <p>\-`  true `: automatically creates repositories in the namespace.</p>
     * <br>
     * <p>\-`  false `: does not automatically create repositories in the namespace.</p>
     */
    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    /**
     * <p>The default repository type. Valid values:</p>
     * <br>
     * <p>*   `PUBLIC`: a public repository</p>
     * <p>*   `PRIVATE`: a private repository</p>
     */
    @NameInMap("DefaultRepoType")
    public String defaultRepoType;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the namespace.</p>
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
