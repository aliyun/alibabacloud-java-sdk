// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>6868E9A1-56E6-5FD7-9684-E2963BBAFB5F</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to precheck only this request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request and does not associate a security group with the instance. The check items include whether the required parameters are specified, the request format is valid, and the service limits are met. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): sends a regular request. If the check succeeds, an HTTP 2xx status code is returned and the operation is directly performed.</li>
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
     * <p>Valid values of N: 1 to 100.</p>
     * <p>For more information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ab05733c97b7ce239fb1b53393dc1697c123****</p>
     */
    @NameInMap("RuleId")
    public java.util.List<String> ruleId;

    public static EnableMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRulesRequest self = new EnableMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public EnableMetricRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableMetricRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableMetricRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableMetricRulesRequest setRuleId(java.util.List<String> ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public java.util.List<String> getRuleId() {
        return this.ruleId;
    }

}
