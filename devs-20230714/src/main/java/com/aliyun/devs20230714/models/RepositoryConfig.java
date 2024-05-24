// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RepositoryConfig extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("branchName")
    public String branchName;

    @NameInMap("manifest")
    public String manifest;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("repositoryName")
    public String repositoryName;

    public static RepositoryConfig build(java.util.Map<String, ?> map) throws Exception {
        RepositoryConfig self = new RepositoryConfig();
        return TeaModel.build(map, self);
    }

    public RepositoryConfig setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public RepositoryConfig setManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }
    public String getManifest() {
        return this.manifest;
    }

    public RepositoryConfig setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }
    public String getRepositoryName() {
        return this.repositoryName;
    }

}
