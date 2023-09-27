// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoSourceCodeRepoRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic image building when code is committed. Valid values:</p>
     * <br>
     * <p>*   `true`: enables automatic image building when code is committed.</p>
     * <p>*   `false`: disables automatic image building when code is committed.</p>
     */
    @NameInMap("AutoBuild")
    public String autoBuild;

    /**
     * <p>The ID of the source code repository.</p>
     */
    @NameInMap("CodeRepoId")
    public String codeRepoId;

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
     * <p>The type of the source code hosting platform. Valid values: GITHUB, GITLAB, GITEE, CODE, and CODEUP.</p>
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
    public String disableCacheBuild;

    /**
     * <p>The ID of the Container Registry Enterprise Edition instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable Build With Servers Deployed Outside Chinese Mainland. Valid values:</p>
     * <br>
     * <p>*   `true`: enables Build With Servers Deployed Outside Chinese Mainland.</p>
     * <p>*   `false`: disables Build With Servers Deployed Outside Chinese Mainland.</p>
     */
    @NameInMap("OverseaBuild")
    public String overseaBuild;

    /**
     * <p>The ID of the image repository.</p>
     */
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

    public UpdateRepoSourceCodeRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
