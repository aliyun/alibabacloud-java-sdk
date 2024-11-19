// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleActionsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the <strong>ID</strong> of the instance.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If the <strong>Overview</strong> page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information about the instance, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the rule.</p>
     * <p>You can log on to the IoT Platform console and go to the details page of the instance that you want to manage. On the instance details page, choose <strong>Rules Engine</strong> &gt; <strong>Data Forwarding</strong> to obtain the rule ID. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/69486.html">ListRule</a> operation to view the value of the <strong>Id</strong> parameter in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static ListRuleActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuleActionsRequest self = new ListRuleActionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRuleActionsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListRuleActionsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
