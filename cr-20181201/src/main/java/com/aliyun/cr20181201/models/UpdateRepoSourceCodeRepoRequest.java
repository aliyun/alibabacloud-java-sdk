// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoSourceCodeRepoRequest extends TeaModel {
    @NameInMap("AutoBuild")
    public String autoBuild;

    @NameInMap("CodeRepoId")
    public String codeRepoId;

    @NameInMap("CodeRepoName")
    public String codeRepoName;

    @NameInMap("CodeRepoNamespaceName")
    public String codeRepoNamespaceName;

    @NameInMap("CodeRepoType")
    public String codeRepoType;

    @NameInMap("DisableCacheBuild")
    public String disableCacheBuild;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OverseaBuild")
    public String overseaBuild;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoId")
    public String repoId;

    public static UpdateRepoSourceCodeRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoSourceCodeRepoRequest self = new UpdateRepoSourceCodeRepoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRepoSourceCodeRepoRequest setAutoBuild(String autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public String getAutoBuild() {
        return this.autoBuild;
    }

    public UpdateRepoSourceCodeRepoRequest setCodeRepoId(String codeRepoId) {
        this.codeRepoId = codeRepoId;
        return this;
    }
    public String getCodeRepoId() {
        return this.codeRepoId;
    }

    public UpdateRepoSourceCodeRepoRequest setCodeRepoName(String codeRepoName) {
        this.codeRepoName = codeRepoName;
        return this;
    }
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    public UpdateRepoSourceCodeRepoRequest setCodeRepoNamespaceName(String codeRepoNamespaceName) {
        this.codeRepoNamespaceName = codeRepoNamespaceName;
        return this;
    }
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    public UpdateRepoSourceCodeRepoRequest setCodeRepoType(String codeRepoType) {
        this.codeRepoType = codeRepoType;
        return this;
    }
    public String getCodeRepoType() {
        return this.codeRepoType;
    }

    public UpdateRepoSourceCodeRepoRequest setDisableCacheBuild(String disableCacheBuild) {
        this.disableCacheBuild = disableCacheBuild;
        return this;
    }
    public String getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    public UpdateRepoSourceCodeRepoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRepoSourceCodeRepoRequest setOverseaBuild(String overseaBuild) {
        this.overseaBuild = overseaBuild;
        return this;
    }
    public String getOverseaBuild() {
        return this.overseaBuild;
    }

    public UpdateRepoSourceCodeRepoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateRepoSourceCodeRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
