// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSourceCodeRepoRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic building. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: enables automatic building.</p>
     * </li>
     * <li><p><code>false</code>: disables automatic building.</p>
     * </li>
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
     * <p>The namespace name of the source code repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace</p>
     */
    @NameInMap("CodeRepoNamespaceName")
    public String codeRepoNamespaceName;

    /**
     * <p>The type of the source code platform. Valid values: <code>GITHUB</code>, <code>GITLAB</code>, <code>GITEE</code>, <code>CODE</code>, and <code>CODEUP</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GITHUB</p>
     */
    @NameInMap("CodeRepoType")
    public String codeRepoType;

    /**
     * <p>Specifies whether to disable the build cache. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: disables the build cache.</p>
     * </li>
     * <li><p><code>false</code>: enables the build cache.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableCacheBuild")
    public Boolean disableCacheBuild;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-shac42yvqzvq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable intelligent build acceleration for overseas sources. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: enables intelligent build acceleration for overseas sources.</p>
     * </li>
     * <li><p><code>false</code>: disables intelligent build acceleration for overseas sources.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OverseaBuild")
    public Boolean overseaBuild;

    /**
     * <p>The image repository ID.</p>
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
