// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceUsageResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RepoQuota")
    public String repoQuota;

    @NameInMap("RepoUsage")
    public String repoUsage;

    @NameInMap("NamespaceQuota")
    public String namespaceQuota;

    @NameInMap("NamespaceUsage")
    public String namespaceUsage;

    @NameInMap("Code")
    public String code;

    public static GetInstanceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUsageResponseBody self = new GetInstanceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceUsageResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetInstanceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceUsageResponseBody setRepoQuota(String repoQuota) {
        this.repoQuota = repoQuota;
        return this;
    }
    public String getRepoQuota() {
        return this.repoQuota;
    }

    public GetInstanceUsageResponseBody setRepoUsage(String repoUsage) {
        this.repoUsage = repoUsage;
        return this;
    }
    public String getRepoUsage() {
        return this.repoUsage;
    }

    public GetInstanceUsageResponseBody setNamespaceQuota(String namespaceQuota) {
        this.namespaceQuota = namespaceQuota;
        return this;
    }
    public String getNamespaceQuota() {
        return this.namespaceQuota;
    }

    public GetInstanceUsageResponseBody setNamespaceUsage(String namespaceUsage) {
        this.namespaceUsage = namespaceUsage;
        return this;
    }
    public String getNamespaceUsage() {
        return this.namespaceUsage;
    }

    public GetInstanceUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
