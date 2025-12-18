// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DryRunConfigRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>COMPLIANT</p>
     */
    @NameInMap("ComplianceType")
    public String complianceType;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C32EEAD7-BF64-5927-977A-AFF9342B7275</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{
     *             &quot;result&quot;:&quot;NON_COMPLIANT&quot;,
     *             &quot;children&quot;:[
     *                 {
     *                     &quot;featureValue&quot;:&quot;1&quot;,
     *                     &quot;featureSource&quot;:&quot;CONFIGURATION&quot;,
     *                     &quot;result&quot;:&quot;NON_COMPLIANT&quot;,
     *                     &quot;desired&quot;:&quot;4&quot;,
     *                     &quot;children&quot;:[],
     *                     &quot;operator&quot;:&quot;StringEquals&quot;,
     *                     &quot;featurePath&quot;:&quot;$.Cpu&quot;
     *                 }
     *             ],
     *             &quot;operator&quot;:&quot;and&quot;
     *         }
     *     }</p>
     */
    @NameInMap("RuleConditionContext")
    public String ruleConditionContext;

    public static DryRunConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DryRunConfigRuleResponseBody self = new DryRunConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DryRunConfigRuleResponseBody setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public DryRunConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DryRunConfigRuleResponseBody setRuleConditionContext(String ruleConditionContext) {
        this.ruleConditionContext = ruleConditionContext;
        return this;
    }
    public String getRuleConditionContext() {
        return this.ruleConditionContext;
    }

}
