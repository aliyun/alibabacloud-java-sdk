// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRuleActionRequest extends TeaModel {
    /**
     * <p>The configurations of the rule action. You must specify a JSON string. The configurations vary based on the types of rule actions. For more information about required syntax and examples, see the following tables.</p>
     */
    @NameInMap("Configuration")
    public String configuration;

    /**
     * <p>Specifies whether the rule action forwards error operation data. Error operation data is generated when the rules engine failed to forward data from the IoT Platform topic to the destination cloud service. A data forwarding failure indicates that forwarding retries also fail. Valid values:</p>
     * <br>
     * <p>*   **true**: forwards error operation data.</p>
     * <p>*   **false**: forwards normal data instead of error operation data.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("ErrorActionFlag")
    public Boolean errorActionFlag;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the rule for which you want to create an action. You can log on to the IoT Platform console, and choose **Rules** > **Data Forwarding** to view the rule ID. You can also call the [ListRule](~~69486~~) operation and view the rule ID in the response.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The type of the rule action. Valid values:</p>
     * <br>
     * <p>*   **REPUBLISH**: forwards topic data that is processed by the rules engine to another IoT Platform topic.</p>
     * <p>*   **AMQP**: forwards data to an AMQP consumer group.</p>
     * <p>*   **MNS**: forwards data that is processed by the rules engine to Message Service (MNS).</p>
     * <p>*   **FC**: forwards topic data that is processed by the rules engine to Function Compute for event computing.</p>
     * <p>*   **OTS**: forwards data that is processed by the rules engine to OTS for NoSQL data storage.</p>
     * <br>
     * <p>>  If you set the **DataType** parameter to **BINARY**, rules are created in the binary format. These rules cannot be used to forward data to Tablestore.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleActionRequest self = new CreateRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleActionRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CreateRuleActionRequest setErrorActionFlag(Boolean errorActionFlag) {
        this.errorActionFlag = errorActionFlag;
        return this;
    }
    public Boolean getErrorActionFlag() {
        return this.errorActionFlag;
    }

    public CreateRuleActionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateRuleActionRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public CreateRuleActionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
