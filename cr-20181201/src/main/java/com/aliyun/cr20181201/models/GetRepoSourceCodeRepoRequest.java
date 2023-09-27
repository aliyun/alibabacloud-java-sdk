// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSourceCodeRepoRequest extends TeaModel {
    /**
     * <p>The ID of the Container Registry instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    public static GetRepoSourceCodeRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoSourceCodeRepoRequest self = new GetRepoSourceCodeRepoRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoSourceCodeRepoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoSourceCodeRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
