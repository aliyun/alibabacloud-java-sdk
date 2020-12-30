// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChartRepositoryRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    @NameInMap("RepoName")
    public String repoName;

    public static DeleteChartRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChartRepositoryRequest self = new DeleteChartRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChartRepositoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteChartRepositoryRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public DeleteChartRepositoryRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

}
