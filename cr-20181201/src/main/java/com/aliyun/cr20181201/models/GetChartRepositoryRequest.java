// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChartRepositoryRequest extends TeaModel {
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
     * <p>The repository name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    public static GetChartRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChartRepositoryRequest self = new GetChartRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public GetChartRepositoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetChartRepositoryRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public GetChartRepositoryRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

}
