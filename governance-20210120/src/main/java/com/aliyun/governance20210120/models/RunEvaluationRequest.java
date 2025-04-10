// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class RunEvaluationRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member. This parameter takes effect only when a multi-account governance maturity check is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>176618589410****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The IDs of the check items to be checked.</p>
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
     * <p>The check range of the governance maturity check. Valid values:</p>
     * <ul>
     * <li>Account (default): A single-account governance maturity check is performed to check only the Alibaba Cloud account that you use to access Cloud Governance Center.</li>
     * <li>ResourceDirectory: A multi-account governance maturity check is performed to check all members within a resource directory. Before you perform a multi-account governance maturity check, you must enable the multi-account governance maturity check feature.</li>
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
