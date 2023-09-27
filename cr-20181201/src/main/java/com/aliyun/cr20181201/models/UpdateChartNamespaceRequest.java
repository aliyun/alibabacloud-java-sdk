// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateChartNamespaceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically create repositories in the namespace. Valid values:</p>
     * <br>
     * <p>*   `true`: automatically creates repositories in the namespace.</p>
     * <p>*   `false`: does not automatically create repositories in the namespace.</p>
     */
    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    /**
     * <p>The default type of the repository. Valid values:</p>
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
     * <p>The name of the namespace to which the repository belongs.</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    public static UpdateChartNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChartNamespaceRequest self = new UpdateChartNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChartNamespaceRequest setAutoCreateRepo(Boolean autoCreateRepo) {
        this.autoCreateRepo = autoCreateRepo;
        return this;
    }
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    public UpdateChartNamespaceRequest setDefaultRepoType(String defaultRepoType) {
        this.defaultRepoType = defaultRepoType;
        return this;
    }
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    public UpdateChartNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateChartNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
