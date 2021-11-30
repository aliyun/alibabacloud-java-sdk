// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSourceCodeRepoResponseBody extends TeaModel {
    @NameInMap("AutoBuild")
    public String autoBuild;

    @NameInMap("Code")
    public String code;

    @NameInMap("CodeRepoDomain")
    public String codeRepoDomain;

    @NameInMap("CodeRepoName")
    public String codeRepoName;

    @NameInMap("CodeRepoNamespaceName")
    public String codeRepoNamespaceName;

    @NameInMap("CodeRepoType")
    public String codeRepoType;

    @NameInMap("DisableCacheBuild")
    public String disableCacheBuild;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("OverseaBuild")
    public String overseaBuild;

    @NameInMap("RepoId")
    public String repoId;

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
