// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceUsageResponseBody extends TeaModel {
    @NameInMap("NamespaceUsage")
    public String namespaceUsage;

    @NameInMap("RepoQuota")
    public String repoQuota;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ChartNamespaceQuota")
    public String chartNamespaceQuota;

    @NameInMap("RepoUsage")
    public String repoUsage;

    @NameInMap("NamespaceQuota")
    public String namespaceQuota;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ChartRepoUsage")
    public String chartRepoUsage;

    @NameInMap("ChartNamespaceUsage")
    public String chartNamespaceUsage;

    @NameInMap("ChartRepoQuota")
    public String chartRepoQuota;

    public static GetInstanceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUsageResponseBody self = new GetInstanceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceUsageResponseBody setNamespaceUsage(String namespaceUsage) {
        this.namespaceUsage = namespaceUsage;
        return this;
    }
    public String getNamespaceUsage() {
        return this.namespaceUsage;
    }

    public GetInstanceUsageResponseBody setRepoQuota(String repoQuota) {
        this.repoQuota = repoQuota;
        return this;
    }
    public String getRepoQuota() {
        return this.repoQuota;
    }

    public GetInstanceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceUsageResponseBody setChartNamespaceQuota(String chartNamespaceQuota) {
        this.chartNamespaceQuota = chartNamespaceQuota;
        return this;
    }
    public String getChartNamespaceQuota() {
        return this.chartNamespaceQuota;
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

    public GetInstanceUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceUsageResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetInstanceUsageResponseBody setChartRepoUsage(String chartRepoUsage) {
        this.chartRepoUsage = chartRepoUsage;
        return this;
    }
    public String getChartRepoUsage() {
        return this.chartRepoUsage;
    }

    public GetInstanceUsageResponseBody setChartNamespaceUsage(String chartNamespaceUsage) {
        this.chartNamespaceUsage = chartNamespaceUsage;
        return this;
    }
    public String getChartNamespaceUsage() {
        return this.chartNamespaceUsage;
    }

    public GetInstanceUsageResponseBody setChartRepoQuota(String chartRepoQuota) {
        this.chartRepoQuota = chartRepoQuota;
        return this;
    }
    public String getChartRepoQuota() {
        return this.chartRepoQuota;
    }

}
