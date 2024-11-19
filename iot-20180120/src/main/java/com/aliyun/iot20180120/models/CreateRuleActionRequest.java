// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRuleActionRequest extends TeaModel {
    /**
     * <p>The configurations of the rule action. You must specify a JSON string. The configurations vary based on the types of rule actions. For more information about required syntax and examples, see the following tables.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Configuration")
    public String configuration;

    /**
     * <p>Specifies whether the rule action forwards error operation data. Error operation data is generated when the rules engine failed to forward data from the IoT Platform topic to the destination cloud service. A data forwarding failure indicates that forwarding retries also fail. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: forwards error operation data.</li>
     * <li><strong>false</strong>: forwards normal data instead of error operation data.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ErrorActionFlag")
    public Boolean errorActionFlag;

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
     * <p>The ID of the rule for which you want to create an action. You can log on to the IoT Platform console, and choose <strong>Rules</strong> &gt; <strong>Data Forwarding</strong> to view the rule ID. You can also call the <a href="https://help.aliyun.com/document_detail/69486.html">ListRule</a> operation and view the rule ID in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The type of the rule action. Valid values:</p>
     * <ul>
     * <li><strong>REPUBLISH</strong>: forwards topic data that is processed by the rules engine to another IoT Platform topic.</li>
     * <li><strong>AMQP</strong>: forwards data to an AMQP consumer group.</li>
     * <li><strong>MNS</strong>: forwards data that is processed by the rules engine to Message Service (MNS).</li>
     * <li><strong>FC</strong>: forwards topic data that is processed by the rules engine to Function Compute for event computing.</li>
     * <li><strong>OTS</strong>: forwards data that is processed by the rules engine to OTS for NoSQL data storage.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the <strong>DataType</strong> parameter to <strong>BINARY</strong>, rules are created in the binary format. These rules cannot be used to forward data to Tablestore.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPUBLISH</p>
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
