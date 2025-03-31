// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceUsageResponseBody extends TeaModel {
    /**
     * <p>The quota of chart namespaces.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ChartNamespaceQuota")
    public String chartNamespaceQuota;

    /**
     * <p>The number of chart namespaces that are created in the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChartNamespaceUsage")
    public String chartNamespaceUsage;

    /**
     * <p>The quota of chart repositories for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("ChartRepoQuota")
    public String chartRepoQuota;

    /**
     * <p>The number of chart repositories that are created.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ChartRepoUsage")
    public String chartRepoUsage;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The quota of image namespaces for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NamespaceQuota")
    public String namespaceQuota;

    /**
     * <p>The number of image namespaces that are created in the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NamespaceUsage")
    public String namespaceUsage;

    /**
     * <p>The quota of image repositories for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RepoQuota")
    public String repoQuota;

    /**
     * <p>The number of image repositories that are created in the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RepoUsage")
    public String repoUsage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A726E801-7FCF-43F9-AF1C-51B3E65D3E7A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>VPC quota</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("VpcQuota")
    public String vpcQuota;

    /**
     * <p>Number of bound VPCs</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("VpcUsage")
    public String vpcUsage;

    public static GetInstanceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUsageResponseBody self = new GetInstanceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceUsageResponseBody setChartNamespaceQuota(String chartNamespaceQuota) {
        this.chartNamespaceQuota = chartNamespaceQuota;
        return this;
    }
    public String getChartNamespaceQuota() {
        return this.chartNamespaceQuota;
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

    public GetInstanceUsageResponseBody setChartRepoUsage(String chartRepoUsage) {
        this.chartRepoUsage = chartRepoUsage;
        return this;
    }
    public String getChartRepoUsage() {
        return this.chartRepoUsage;
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

    public GetInstanceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceUsageResponseBody setVpcQuota(String vpcQuota) {
        this.vpcQuota = vpcQuota;
        return this;
    }
    public String getVpcQuota() {
        return this.vpcQuota;
    }

    public GetInstanceUsageResponseBody setVpcUsage(String vpcUsage) {
        this.vpcUsage = vpcUsage;
        return this;
    }
    public String getVpcUsage() {
        return this.vpcUsage;
    }

}
