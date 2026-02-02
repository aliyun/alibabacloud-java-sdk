// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteQosRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QosRuleId")
    public java.util.List<String> qosRuleId;

    public static DeleteQosRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosRulesRequest self = new DeleteQosRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQosRulesRequest setQosRuleId(java.util.List<String> qosRuleId) {
        this.qosRuleId = qosRuleId;
        return this;
    }
    public java.util.List<String> getQosRuleId() {
        return this.qosRuleId;
    }

}
