// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeRemediationRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-3184626622af003****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The ID of the remediation configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-f381cf0c1c2f004e****</p>
     */
    @NameInMap("RemediationId")
    public String remediationId;

    public static DescribeRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRemediationRequest self = new DescribeRemediationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRemediationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public DescribeRemediationRequest setRemediationId(String remediationId) {
        this.remediationId = remediationId;
        return this;
    }
    public String getRemediationId() {
        return this.remediationId;
    }

}
