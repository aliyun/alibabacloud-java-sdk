// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSourceCodeRepoRequest extends TeaModel {
    /**
     * <p>Specifies whether to trigger image building when source code is committed. Valid values:</p>
     * <br>
     * <p>*   `true`: triggers image building when source code is committed.</p>
     * <p>*   `false`: does not trigger image building when source code is committed.</p>
     */
    @NameInMap("AutoBuild")
    public Boolean autoBuild;

    /**
     * <p>The name of the source code repository.</p>
     */
    @NameInMap("CodeRepoName")
    public String codeRepoName;

    /**
     * <p>The namespace to which the source code repository belongs.</p>
     */
    @NameInMap("CodeRepoNamespaceName")
    public String codeRepoNamespaceName;

    /**
     * <p>The type of the source code hosting platform. Valid values: `GITHUB`, `GITLAB`, `GITEE`, `CODE`, and `CODEUP`.</p>
     */
    @NameInMap("CodeRepoType")
    public String codeRepoType;

    /**
     * <p>Specifies whether to disable building caches. Valid values:</p>
     * <br>
     * <p>*   `true`: disables building caches.</p>
     * <p>*   `false`: enables building caches.</p>
     */
    @NameInMap("DisableCacheBuild")
    public Boolean disableCacheBuild;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable Build With Servers Deployed Outside Chinese Mainland. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Build With Servers Deployed Outside Chinese Mainland.</p>
     * <p>*   `false`: does not enable Build With Servers Deployed Outside Chinese Mainland.</p>
     */
    @NameInMap("OverseaBuild")
    public Boolean overseaBuild;

    /**
     * <p>The ID of the image repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    public static CreateRepoSourceCodeRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSourceCodeRepoRequest self = new CreateRepoSourceCodeRepoRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoSourceCodeRepoRequest setAutoBuild(Boolean autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    public CreateRepoSourceCodeRepoRequest setCodeRepoName(String codeRepoName) {
        this.codeRepoName = codeRepoName;
        return this;
    }
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    public CreateRepoSourceCodeRepoRequest setCodeRepoNamespaceName(String codeRepoNamespaceName) {
        this.codeRepoNamespaceName = codeRepoNamespaceName;
        return this;
    }
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    public CreateRepoSourceCodeRepoRequest setCodeRepoType(String codeRepoType) {
        this.codeRepoType = codeRepoType;
        return this;
    }
    public String getCodeRepoType() {
        return this.codeRepoType;
    }

    public CreateRepoSourceCodeRepoRequest setDisableCacheBuild(Boolean disableCacheBuild) {
        this.disableCacheBuild = disableCacheBuild;
        return this;
    }
    public Boolean getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    public CreateRepoSourceCodeRepoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoSourceCodeRepoRequest setOverseaBuild(Boolean overseaBuild) {
        this.overseaBuild = overseaBuild;
        return this;
    }
    public Boolean getOverseaBuild() {
        return this.overseaBuild;
    }

    public CreateRepoSourceCodeRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
