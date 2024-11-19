// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the rule that you want to query. You can log on to the IoT Platform console and choose <strong>Rules</strong> &gt; <strong>Data Forwarding</strong> to view the rule ID. You can also call the <a href="https://help.aliyun.com/document_detail/69486.html">ListRule</a> operation and view the rule ID in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleRequest self = new GetRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
