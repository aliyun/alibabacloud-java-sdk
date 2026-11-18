// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableMetricRulesRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length. For more information, see Ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>6868E9A1-56E6-5FD7-9684-E2963BBAFB5F</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and service limits, but does not bind a security group to the instance. If the request fails the check, an error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleId")
    public java.util.List<String> ruleId;

    public static DisableMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMetricRulesRequest self = new DisableMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public DisableMetricRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableMetricRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisableMetricRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableMetricRulesRequest setRuleId(java.util.List<String> ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public java.util.List<String> getRuleId() {
        return this.ruleId;
    }

}
