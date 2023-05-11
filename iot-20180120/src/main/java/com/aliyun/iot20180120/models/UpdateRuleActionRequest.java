// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateRuleActionRequest extends TeaModel {
    /**
     * <p>The ID of the rule action to be modified.</p>
     * <br>
     * <p>After you call the [CreateRuleAction](~~69586~~) operation to create a rule action, the rule action ID is returned. You can call the [ListRuleActions](~~69517~~) operation to view the rule action ID.</p>
     */
    @NameInMap("ActionId")
    public Long actionId;

    /**
     * <p>The configurations of the rule action. The configurations for different rule action types are different. For more information about the configurations for different rule action types, see [CreateRuleAction](~~69586~~).</p>
     */
    @NameInMap("Configuration")
    public String configuration;

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
     * <p>The type of the rule action. Valid values:</p>
     * <br>
     * <p>*   **MNS**: forwards topic data that is processed by the rules engine to MNS.</p>
     * <p>*   **FC**: forwards topic data that is processed by the rules engine to Function Compute for event computing.</p>
     * <p>*   **REPUBLISH**: forwards topic data that is processed by the rules engine to another IoT Platform topic.</p>
     * <p>*   **AMQP**: forwards data to an AMQP consumer group.</p>
     * <p>*   **OTS**: forwards topic data that is processed by the rules engine to Tablestore for NoSQL data storage.</p>
     * <br>
     * <p>> *   If you set the **DataType** parameter to **BINARY**, rules are created in the binary format. These rules cannot be used to forward data to Tablestore.</p>
     * <p>>*   Destination Alibaba Cloud services that are supported by the rules engine vary based on regions. For more information about the regions and destination cloud services that are supported by the rules engine, see [Regions and zones](~~85669~~).</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleActionRequest self = new UpdateRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public UpdateRuleActionRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public UpdateRuleActionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateRuleActionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
