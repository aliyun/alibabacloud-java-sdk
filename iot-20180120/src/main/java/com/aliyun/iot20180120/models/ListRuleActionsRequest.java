// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleActionsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. On the **Overview** page in the IoT Platform console, you can view the **ID** of the instance.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>>*   If the **Overview** page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information about the instance, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>You can log on to the IoT Platform console and go to the details page of the instance that you want to manage. On the instance details page, choose **Rules Engine** > **Data Forwarding** to obtain the rule ID. Alternatively, you can call the [ListRule](~~69486~~) operation to view the value of the **Id** parameter in the response.</p>
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
