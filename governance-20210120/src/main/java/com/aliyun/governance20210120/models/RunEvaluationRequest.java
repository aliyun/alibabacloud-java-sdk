// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class RunEvaluationRequest extends TeaModel {
    /**
     * <p>The ID of the member account. This parameter is applicable only to the multi-account check pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>176618589410****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("EvaluationDomain")
    public String evaluationDomain;

    /**
     * <p>The list of check item IDs to check.</p>
     */
    @NameInMap("MetricIds")
    public java.util.List<String> metricIds;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scope of the governance maturity check. Valid values:</p>
     * <ul>
     * <li>Account (default): runs a single-account governance maturity check that checks only the current account.</li>
     * <li>ResourceDirectory: runs a multi-account governance maturity check that checks all member accounts in the resource directory. Before you perform this operation, upgrade to the multi-account governance maturity check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ResourceDirectory</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static RunEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunEvaluationRequest self = new RunEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public RunEvaluationRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public RunEvaluationRequest setEvaluationDomain(String evaluationDomain) {
        this.evaluationDomain = evaluationDomain;
        return this;
    }
    public String getEvaluationDomain() {
        return this.evaluationDomain;
    }

    public RunEvaluationRequest setMetricIds(java.util.List<String> metricIds) {
        this.metricIds = metricIds;
        return this;
    }
    public java.util.List<String> getMetricIds() {
        return this.metricIds;
    }

    public RunEvaluationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunEvaluationRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
