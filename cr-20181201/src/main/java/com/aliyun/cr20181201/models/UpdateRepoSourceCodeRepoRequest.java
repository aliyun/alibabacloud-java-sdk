// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoSourceCodeRepoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("CodeRepoType")
    public String codeRepoType;

    @NameInMap("CodeRepoNamespaceName")
    public String codeRepoNamespaceName;

    @NameInMap("CodeRepoName")
    public String codeRepoName;

    @NameInMap("AutoBuild")
    public String autoBuild;

    @NameInMap("OverseaBuild")
    public String overseaBuild;

    @NameInMap("DisableCacheBuild")
    public String disableCacheBuild;

    @NameInMap("CodeRepoId")
    public String codeRepoId;

    public static UpdateRepoSourceCodeRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoSourceCodeRepoRequest self = new UpdateRepoSourceCodeRepoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRepoSourceCodeRepoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRepoSourceCodeRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public UpdateRepoSourceCodeRepoRequest setCodeRepoType(String codeRepoType) {
        this.codeRepoType = codeRepoType;
        return this;
    }
    public String getCodeRepoType() {
        return this.codeRepoType;
    }

    public UpdateRepoSourceCodeRepoRequest setCodeRepoNamespaceName(String codeRepoNamespaceName) {
        this.codeRepoNamespaceName = codeRepoNamespaceName;
        return this;
    }
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    public UpdateRepoSourceCodeRepoRequest setCodeRepoName(String codeRepoName) {
        this.codeRepoName = codeRepoName;
        return this;
    }
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    public UpdateRepoSourceCodeRepoRequest setAutoBuild(String autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public String getAutoBuild() {
        return this.autoBuild;
    }

    public UpdateRepoSourceCodeRepoRequest setOverseaBuild(String overseaBuild) {
        this.overseaBuild = overseaBuild;
        return this;
    }
    public String getOverseaBuild() {
        return this.overseaBuild;
    }

    public UpdateRepoSourceCodeRepoRequest setDisableCacheBuild(String disableCacheBuild) {
        this.disableCacheBuild = disableCacheBuild;
        return this;
    }
    public String getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    public UpdateRepoSourceCodeRepoRequest setCodeRepoId(String codeRepoId) {
        this.codeRepoId = codeRepoId;
        return this;
    }
    public String getCodeRepoId() {
        return this.codeRepoId;
    }

}
