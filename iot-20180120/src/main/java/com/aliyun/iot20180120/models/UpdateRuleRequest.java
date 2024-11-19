// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateRuleRequest extends TeaModel {
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
     * <p>The name of the rule. The rule name must be 1 to 30 characters in length, and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test_2</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the rule applies.</p>
     * 
     * <strong>example:</strong>
     * <p>aladaeW****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The description of the rule. The description can be up to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleDesc")
    public String ruleDesc;

    /**
     * <p>The ID of the rule that you want to modify. You can log on to the IoT Platform console and choose <strong>Rules</strong> &gt; <strong>Data Forwarding</strong> to view the rule ID. You can also call the <a href="https://help.aliyun.com/document_detail/69486.html">ListRule</a> operation and view the rule ID in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The SQL SELECT statement to be executed. For more information, see <a href="https://help.aliyun.com/document_detail/30554.html">SQL expressions</a>.</p>
     * <blockquote>
     * <p> Specify the content that follows the SELECT keyword for this parameter. For example, if the SELECT statement is <code>SELECT a,b,c</code>, specify <code>a,b,c</code> for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>deviceName() as deviceName, items.Humidity.value as Humidity, items.Temperature.value as Temperature</p>
     */
    @NameInMap("Select")
    public String select;

    /**
     * <p>The topic to which this rule is applied. Syntax: <code>${deviceName}/topicShortName</code>. <code>${deviceName}</code> specifies the name of the device, and <code>topicShortName</code> specifies the custom name of the topic.</p>
     * <ul>
     * <li><p>Basic communication topics or Thing Specification Language (TSL)-based communication topics. Syntax: <code>${deviceName}/topicShortName</code>. You can replace <code>${deviceName}</code> with the <code>+</code> wildcard. The wildcard indicates that the topic applies to all devices under the product. Valid values of <code>topicShortName</code>:</p>
     * <ul>
     * <li><p><code>/thing/event/property/post</code>: submits the property data of a device.</p>
     * </li>
     * <li><p><code>/thing/event/${tsl.event.identifier}/post</code>: submits the event data of a device. <code>${tsl.event.identifier}</code> specifies the identifier of an event in the TSL model.</p>
     * </li>
     * <li><p><code>/thing/lifecycle</code>: submits device lifecycle changes.</p>
     * </li>
     * <li><p><code>/thing/downlink/reply/message</code>: sends a response to a request from IoT Platform.</p>
     * </li>
     * <li><p><code>/thing/list/found</code>: submits the data when a gateway detects a new sub-device.</p>
     * </li>
     * <li><p><code>/thing/topo/lifecycle</code>: submits device topology changes.</p>
     * </li>
     * <li><p><code>/thing/event/property/history/post</code>: submits historical property data of a device.</p>
     * </li>
     * <li><p><code>/thing/event/${tsl.event.identifier}/post</code>: submits the historical event data of a device. <code>${tsl.event.identifier}</code> specifies the identifier of an event in the TSL.</p>
     * </li>
     * <li><p><code>/ota/upgrade</code>: submits OTA update statuses.</p>
     * </li>
     * <li><p><code>/ota/version/post</code>: submits OTA module versions.</p>
     * </li>
     * <li><p><code>/thing/deviceinfo/update</code>: submits device tag changes.</p>
     * </li>
     * <li><p><code>/edge/driver/${driver_id}/point_post</code>: submits pass-through data from Link IoT Edge. <code>${driver_id}</code> specifies the ID of the driver that a device uses to access Link IoT Edge.</p>
     * <p><code>${packageId}/${jobId}/ota/job/status</code>: submits the statuses of OTA update batches. This topic is a basic communication topic. <code>${packageId}</code> specifies the ID of the update package. <code>${jobId}</code> specifies the ID of the update batch.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Custom topics. Example: <code>${deviceName}/user/get</code>.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69647.html">QueryProductTopic</a> operation to view all custom topics of the product.</p>
     * <p>When you specify a custom topic, you can use the <code>+</code> and <code>#</code> wildcards.</p>
     * <ul>
     * <li><p>You can replace <code>${deviceName}</code> with the <code>+</code> wildcard. The wildcard indicates that the topic applies to all devices under the product.</p>
     * </li>
     * <li><p>You can replace the fields that follow ${deviceName} with <code>/user/#</code>. The <code>#</code> wildcard indicates that the topic applies whatever values are specified for the fields that follow<code>/user</code>.</p>
     * <p>For more information about how to use wildcards, see <a href="https://help.aliyun.com/document_detail/85539.html">Wildcards in topics</a>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Topic that is used to submit device status changes: <code>${deviceName}</code>.</p>
     * <p>You can use the <code>+</code> wildcard. In this case, the status changes of all devices under the product are submitted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>+/thing/event/property/post</p>
     */
    @NameInMap("ShortTopic")
    public String shortTopic;

    /**
     * <p>The complete topic to which the rule applies.</p>
     * <p>If you specify this parameter, you do not need to specify the <strong>ProductKey</strong>, <strong>ShortTopic</strong>, and <strong>TopicType</strong> parameters.</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <ul>
     * <li><strong>0</strong>: The topic is a basic communication topic or TSL-based communication topic.****</li>
     * <li><strong>1</strong>: The topic is a custom topic.</li>
     * <li><strong>2</strong>: The topic is used to submit device status changes. Syntax: <code>/as/mqtt/status/${productKey}/${deviceName}</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TopicType")
    public Integer topicType;

    /**
     * <p>The condition that is used to trigger the rule. For more information, see <a href="https://help.aliyun.com/document_detail/30554.html">SQL expressions</a>.</p>
     * <blockquote>
     * <p> Specify the content that follows the WHERE keyword for this parameter. For example, if the WHERE statement is <code>WHERE a&gt;10</code>, specify <code>a&gt;10</code> for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Temperature&gt;35</p>
     */
    @NameInMap("Where")
    public String where;

    public static UpdateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleRequest self = new UpdateRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRuleRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateRuleRequest setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    public UpdateRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public UpdateRuleRequest setSelect(String select) {
        this.select = select;
        return this;
    }
    public String getSelect() {
        return this.select;
    }

    public UpdateRuleRequest setShortTopic(String shortTopic) {
        this.shortTopic = shortTopic;
        return this;
    }
    public String getShortTopic() {
        return this.shortTopic;
    }

    public UpdateRuleRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public UpdateRuleRequest setTopicType(Integer topicType) {
        this.topicType = topicType;
        return this;
    }
    public Integer getTopicType() {
        return this.topicType;
    }

    public UpdateRuleRequest setWhere(String where) {
        this.where = where;
        return this;
    }
    public String getWhere() {
        return this.where;
    }

}
