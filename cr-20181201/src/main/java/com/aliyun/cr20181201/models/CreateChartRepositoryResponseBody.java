// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartRepositoryResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("Code")
    public String code;

    public static CreateChartRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChartRepositoryResponseBody self = new CreateChartRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChartRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateChartRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChartRepositoryResponseBody setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CreateChartRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
