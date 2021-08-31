// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSourceCodeRepoResponseBody extends TeaModel {
    @NameInMap("CodeRepoType")
    public String codeRepoType;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CodeRepoNamespaceName")
    public String codeRepoNamespaceName;

    @NameInMap("OverseaBuild")
    public String overseaBuild;

    @NameInMap("Code")
    public String code;

    @NameInMap("CodeRepoName")
    public String codeRepoName;

    @NameInMap("AutoBuild")
    public String autoBuild;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("DisableCacheBuild")
    public String disableCacheBuild;

    @NameInMap("CodeRepoDomain")
    public String codeRepoDomain;

    public static GetRepoSourceCodeRepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoSourceCodeRepoResponseBody self = new GetRepoSourceCodeRepoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoSourceCodeRepoResponseBody setCodeRepoType(String codeRepoType) {
        this.codeRepoType = codeRepoType;
        return this;
    }
    public String getCodeRepoType() {
        return this.codeRepoType;
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

    public GetRepoSourceCodeRepoResponseBody setCodeRepoNamespaceName(String codeRepoNamespaceName) {
        this.codeRepoNamespaceName = codeRepoNamespaceName;
        return this;
    }
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    public GetRepoSourceCodeRepoResponseBody setOverseaBuild(String overseaBuild) {
        this.overseaBuild = overseaBuild;
        return this;
    }
    public String getOverseaBuild() {
        return this.overseaBuild;
    }

    public GetRepoSourceCodeRepoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoSourceCodeRepoResponseBody setCodeRepoName(String codeRepoName) {
        this.codeRepoName = codeRepoName;
        return this;
    }
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    public GetRepoSourceCodeRepoResponseBody setAutoBuild(String autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public String getAutoBuild() {
        return this.autoBuild;
    }

    public GetRepoSourceCodeRepoResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoSourceCodeRepoResponseBody setDisableCacheBuild(String disableCacheBuild) {
        this.disableCacheBuild = disableCacheBuild;
        return this;
    }
    public String getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    public GetRepoSourceCodeRepoResponseBody setCodeRepoDomain(String codeRepoDomain) {
        this.codeRepoDomain = codeRepoDomain;
        return this;
    }
    public String getCodeRepoDomain() {
        return this.codeRepoDomain;
    }

}
