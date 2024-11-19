// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateRuleActionRequest extends TeaModel {
    /**
     * <p>The ID of the rule action to be modified.</p>
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/69586.html">CreateRuleAction</a> operation to create a rule action, the rule action ID is returned. You can call the <a href="https://help.aliyun.com/document_detail/69517.html">ListRuleActions</a> operation to view the rule action ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000003</p>
     */
    @NameInMap("ActionId")
    public Long actionId;

    /**
     * <p>The configurations of the rule action. The configurations for different rule action types are different. For more information about the configurations for different rule action types, see <a href="https://help.aliyun.com/document_detail/69586.html">CreateRuleAction</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Configuration")
    public String configuration;

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
     * <p>The type of the rule action. Valid values:</p>
     * <ul>
     * <li><strong>MNS</strong>: forwards topic data that is processed by the rules engine to MNS.</li>
     * <li><strong>FC</strong>: forwards topic data that is processed by the rules engine to Function Compute for event computing.</li>
     * <li><strong>REPUBLISH</strong>: forwards topic data that is processed by the rules engine to another IoT Platform topic.</li>
     * <li><strong>AMQP</strong>: forwards data to an AMQP consumer group.</li>
     * <li><strong>OTS</strong>: forwards topic data that is processed by the rules engine to Tablestore for NoSQL data storage.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you set the <strong>DataType</strong> parameter to <strong>BINARY</strong>, rules are created in the binary format. These rules cannot be used to forward data to Tablestore.</li>
     * <li>Destination Alibaba Cloud services that are supported by the rules engine vary based on regions. For more information about the regions and destination cloud services that are supported by the rules engine, see <a href="https://help.aliyun.com/document_detail/85669.html">Regions and zones</a>.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPUBLISH</p>
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
