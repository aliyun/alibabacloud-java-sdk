// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartRepositoryRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the repository.</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the namespace to which the repository belongs.</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The default repository type. Valid values:</p>
     * <br>
     * <p>*   `PUBLIC`: a public repository.</p>
     * <p>*   `PRIVATE`: a private repository.</p>
     * <br>
     * <p>You can specify the RepoType or Summary parameter. The RepoType parameter is optional.</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
     * <p>The summary of the repository.</p>
     */
    @NameInMap("Summary")
    public String summary;

    public static CreateChartRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChartRepositoryRequest self = new CreateChartRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateChartRepositoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateChartRepositoryRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateChartRepositoryRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public CreateChartRepositoryRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public CreateChartRepositoryRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
