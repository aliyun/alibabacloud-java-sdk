// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSourceCodeRepoRequest extends TeaModel {
    /**
     * <p>Specifies whether to trigger image building when source code is committed. Valid values:</p>
     * <ul>
     * <li><code>true</code>: triggers image building when source code is committed.</li>
     * <li><code>false</code>: does not trigger image building when source code is committed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoBuild")
    public Boolean autoBuild;

    /**
     * <p>The name of the source code repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>repo</p>
     */
    @NameInMap("CodeRepoName")
    public String codeRepoName;

    /**
     * <p>The namespace to which the source code repository belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace</p>
     */
    @NameInMap("CodeRepoNamespaceName")
    public String codeRepoNamespaceName;

    /**
     * <p>The type of the source code hosting platform. Valid values: <code>GITHUB</code>, <code>GITLAB</code>, <code>GITEE</code>, <code>CODE</code>, and <code>CODEUP</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GITHUB</p>
     */
    @NameInMap("CodeRepoType")
    public String codeRepoType;

    /**
     * <p>Specifies whether to disable building caches. Valid values:</p>
     * <ul>
     * <li><code>true</code>: disables building caches.</li>
     * <li><code>false</code>: enables building caches.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableCacheBuild")
    public Boolean disableCacheBuild;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-shac42yvqzvq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable Build With Servers Deployed Outside Chinese Mainland. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables Build With Servers Deployed Outside Chinese Mainland.</li>
     * <li><code>false</code>: does not enable Build With Servers Deployed Outside Chinese Mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OverseaBuild")
    public Boolean overseaBuild;

    /**
     * <p>The ID of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-gzsrlevmvoaq****</p>
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
