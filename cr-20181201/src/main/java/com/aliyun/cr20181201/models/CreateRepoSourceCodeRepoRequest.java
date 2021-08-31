// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSourceCodeRepoRequest extends TeaModel {
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
    public Boolean autoBuild;

    @NameInMap("OverseaBuild")
    public Boolean overseaBuild;

    @NameInMap("DisableCacheBuild")
    public Boolean disableCacheBuild;

    public static CreateRepoSourceCodeRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSourceCodeRepoRequest self = new CreateRepoSourceCodeRepoRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoSourceCodeRepoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoSourceCodeRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CreateRepoSourceCodeRepoRequest setCodeRepoType(String codeRepoType) {
        this.codeRepoType = codeRepoType;
        return this;
    }
    public String getCodeRepoType() {
        return this.codeRepoType;
    }

    public CreateRepoSourceCodeRepoRequest setCodeRepoNamespaceName(String codeRepoNamespaceName) {
        this.codeRepoNamespaceName = codeRepoNamespaceName;
        return this;
    }
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    public CreateRepoSourceCodeRepoRequest setCodeRepoName(String codeRepoName) {
        this.codeRepoName = codeRepoName;
        return this;
    }
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    public CreateRepoSourceCodeRepoRequest setAutoBuild(Boolean autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    public CreateRepoSourceCodeRepoRequest setOverseaBuild(Boolean overseaBuild) {
        this.overseaBuild = overseaBuild;
        return this;
    }
    public Boolean getOverseaBuild() {
        return this.overseaBuild;
    }

    public CreateRepoSourceCodeRepoRequest setDisableCacheBuild(Boolean disableCacheBuild) {
        this.disableCacheBuild = disableCacheBuild;
        return this;
    }
    public Boolean getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

}
