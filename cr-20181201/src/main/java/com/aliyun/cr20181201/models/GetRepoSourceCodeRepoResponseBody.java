// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSourceCodeRepoResponseBody extends TeaModel {
    /**
     * <p>Indicates whether image building is automatically triggered when source code is committed. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Image building is automatically triggered when source code is committed.</li>
     * <li><code>false</code>: Image building is not triggered when source code is committed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoBuild")
    public String autoBuild;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The address of the source code repository.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://github.com">https://github.com</a></p>
     */
    @NameInMap("CodeRepoDomain")
    public String codeRepoDomain;

    /**
     * <p>The name of the source code repository.</p>
     * 
     * <strong>example:</strong>
     * <p>repo</p>
     */
    @NameInMap("CodeRepoName")
    public String codeRepoName;

    /**
     * <p>The namespace to which the source code repository belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace</p>
     */
    @NameInMap("CodeRepoNamespaceName")
    public String codeRepoNamespaceName;

    /**
     * <p>The type of the code hosting platform. Valid values: <code>GITHUB</code>, <code>GITLAB</code>, <code>GITEE</code>, <code>CODE</code>, and <code>CODEUP</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>GITHUB</p>
     */
    @NameInMap("CodeRepoType")
    public String codeRepoType;

    /**
     * <p>Indicates whether build cache is disabled. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Build cache is disabled.</li>
     * <li><code>false</code>: Build cache is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableCacheBuild")
    public String disableCacheBuild;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: successful</li>
     * <li><code>false</code>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>Indicates whether image building is accelerated for servers outside the Chinese mainland. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Image building is accelerated for servers outside the Chinese mainland.</li>
     * <li><code>false</code>: Image building is not accelerated for servers outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OverseaBuild")
    public String overseaBuild;

    /**
     * <p>The ID of the repository.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-gzsrlevmvoaq****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4CE1F661-75DD-4EBD-A4AD-057B26834ABB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRepoSourceCodeRepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoSourceCodeRepoResponseBody self = new GetRepoSourceCodeRepoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoSourceCodeRepoResponseBody setAutoBuild(String autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public String getAutoBuild() {
        return this.autoBuild;
    }

    public GetRepoSourceCodeRepoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoSourceCodeRepoResponseBody setCodeRepoDomain(String codeRepoDomain) {
        this.codeRepoDomain = codeRepoDomain;
        return this;
    }
    public String getCodeRepoDomain() {
        return this.codeRepoDomain;
    }

    public GetRepoSourceCodeRepoResponseBody setCodeRepoName(String codeRepoName) {
        this.codeRepoName = codeRepoName;
        return this;
    }
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    public GetRepoSourceCodeRepoResponseBody setCodeRepoNamespaceName(String codeRepoNamespaceName) {
        this.codeRepoNamespaceName = codeRepoNamespaceName;
        return this;
    }
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    public GetRepoSourceCodeRepoResponseBody setCodeRepoType(String codeRepoType) {
        this.codeRepoType = codeRepoType;
        return this;
    }
    public String getCodeRepoType() {
        return this.codeRepoType;
    }

    public GetRepoSourceCodeRepoResponseBody setDisableCacheBuild(String disableCacheBuild) {
        this.disableCacheBuild = disableCacheBuild;
        return this;
    }
    public String getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    public GetRepoSourceCodeRepoResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoSourceCodeRepoResponseBody setOverseaBuild(String overseaBuild) {
        this.overseaBuild = overseaBuild;
        return this;
    }
    public String getOverseaBuild() {
        return this.overseaBuild;
    }

    public GetRepoSourceCodeRepoResponseBody setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetRepoSourceCodeRepoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
