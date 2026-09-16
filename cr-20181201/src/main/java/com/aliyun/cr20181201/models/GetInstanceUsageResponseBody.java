// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceUsageResponseBody extends TeaModel {
    /**
     * <p>The quota of Chart namespaces.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ChartNamespaceQuota")
    public String chartNamespaceQuota;

    /**
     * <p>The number of Chart namespaces created.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChartNamespaceUsage")
    public String chartNamespaceUsage;

    /**
     * <p>The quota of Chart repositories.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("ChartRepoQuota")
    public String chartRepoQuota;

    /**
     * <p>The number of Chart repositories created.</p>
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
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The call was successful.</p>
     * </li>
     * <li><p><code>false</code>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The quota of image namespaces.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NamespaceQuota")
    public String namespaceQuota;

    /**
     * <p>The number of image namespaces used.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NamespaceUsage")
    public String namespaceUsage;

    /**
     * <p>The number of performance units, which indicates the additional instance capacity purchased on top of the Advanced Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PerformanceUnits")
    public Integer performanceUnits;

    /**
     * <p>The quota of image repositories.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RepoQuota")
    public String repoQuota;

    /**
     * <p>The number of image repositories used.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RepoUsage")
    public String repoUsage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A726E801-7FCF-43F9-AF1C-51B3E65D3E7A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The VPC quota.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("VpcQuota")
    public String vpcQuota;

    /**
     * <p>The number of bound VPCs.</p>
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

    public GetInstanceUsageResponseBody setPerformanceUnits(Integer performanceUnits) {
        this.performanceUnits = performanceUnits;
        return this;
    }
    public Integer getPerformanceUnits() {
        return this.performanceUnits;
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
