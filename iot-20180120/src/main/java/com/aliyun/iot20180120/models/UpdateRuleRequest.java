// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateRuleRequest extends TeaModel {
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
     * <p>The name of the rule. The rule name must be 1 to 30 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The **ProductKey** of the product to which the rule applies.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The description of the rule. The description can be up to 100 characters in length.</p>
     */
    @NameInMap("RuleDesc")
    public String ruleDesc;

    /**
     * <p>The ID of the rule that you want to modify. You can log on to the IoT Platform console and choose **Rules** > **Data Forwarding** to view the rule ID. You can also call the [ListRule](~~69486~~) operation and view the rule ID in the response.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The SQL SELECT statement to be executed. For more information, see [SQL expressions](~~30554~~).</p>
     * <br>
     * <p>>  Specify the content that follows the SELECT keyword for this parameter. For example, if the SELECT statement is `SELECT a,b,c`, specify `a,b,c` for this parameter.</p>
     */
    @NameInMap("Select")
    public String select;

    /**
     * <p>The topic to which this rule is applied. Syntax: `${deviceName}/topicShortName`. `${deviceName}` specifies the name of the device, and `topicShortName` specifies the custom name of the topic.</p>
     * <br>
     * <p>*   Basic communication topics or Thing Specification Language (TSL)-based communication topics. Syntax: `${deviceName}/topicShortName`. You can replace `${deviceName}` with the `+` wildcard. The wildcard indicates that the topic applies to all devices under the product. Valid values of `topicShortName`:</p>
     * <br>
     * <p>    *   `/thing/event/property/post`: submits the property data of a device.</p>
     * <br>
     * <p>    *   `/thing/event/${tsl.event.identifier}/post`: submits the event data of a device. `${tsl.event.identifier}` specifies the identifier of an event in the TSL model.</p>
     * <br>
     * <p>    *   `/thing/lifecycle`: submits device lifecycle changes.</p>
     * <br>
     * <p>    *   `/thing/downlink/reply/message`: sends a response to a request from IoT Platform.</p>
     * <br>
     * <p>    *   `/thing/list/found`: submits the data when a gateway detects a new sub-device.</p>
     * <br>
     * <p>    *   `/thing/topo/lifecycle`: submits device topology changes.</p>
     * <br>
     * <p>    *   `/thing/event/property/history/post`: submits historical property data of a device.</p>
     * <br>
     * <p>    *   `/thing/event/${tsl.event.identifier}/post`: submits the historical event data of a device. `${tsl.event.identifier}` specifies the identifier of an event in the TSL.</p>
     * <br>
     * <p>    *   `/ota/upgrade`: submits OTA update statuses.</p>
     * <br>
     * <p>    *   `/ota/version/post`: submits OTA module versions.</p>
     * <br>
     * <p>    *   `/thing/deviceinfo/update`: submits device tag changes.</p>
     * <br>
     * <p>    *   `/edge/driver/${driver_id}/point_post`: submits pass-through data from Link IoT Edge. `${driver_id}` specifies the ID of the driver that a device uses to access Link IoT Edge.</p>
     * <br>
     * <p>        `${packageId}/${jobId}/ota/job/status`: submits the statuses of OTA update batches. This topic is a basic communication topic. `${packageId}` specifies the ID of the update package. `${jobId}` specifies the ID of the update batch.</p>
     * <br>
     * <p>*   Custom topics. Example: `${deviceName}/user/get`.</p>
     * <br>
     * <p>    You can call the [QueryProductTopic](~~69647~~) operation to view all custom topics of the product.</p>
     * <br>
     * <p>    When you specify a custom topic, you can use the `+` and `#` wildcards.</p>
     * <br>
     * <p>    *   You can replace `${deviceName}` with the `+` wildcard. The wildcard indicates that the topic applies to all devices under the product.</p>
     * <br>
     * <p>    *   You can replace the fields that follow ${deviceName} with `/user/#`. The `#` wildcard indicates that the topic applies whatever values are specified for the fields that follow`/user`.</p>
     * <br>
     * <p>        For more information about how to use wildcards, see [Wildcards in topics](~~85539~~).</p>
     * <br>
     * <p>*   Topic that is used to submit device status changes: `${deviceName}`.</p>
     * <br>
     * <p>    You can use the `+` wildcard. In this case, the status changes of all devices under the product are submitted.</p>
     */
    @NameInMap("ShortTopic")
    public String shortTopic;

    /**
     * <p>The complete topic to which the rule applies.</p>
     * <br>
     * <p>If you specify this parameter, you do not need to specify the **ProductKey**, **ShortTopic**, and **TopicType** parameters.</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>*   **0**: The topic is a basic communication topic or TSL-based communication topic.****</p>
     * <p>*   **1**: The topic is a custom topic.</p>
     * <p>*   **2**: The topic is used to submit device status changes. Syntax: `/as/mqtt/status/${productKey}/${deviceName}`.</p>
     */
    @NameInMap("TopicType")
    public Integer topicType;

    /**
     * <p>The condition that is used to trigger the rule. For more information, see [SQL expressions](~~30554~~).</p>
     * <br>
     * <p>>  Specify the content that follows the WHERE keyword for this parameter. For example, if the WHERE statement is `WHERE a>10`, specify `a>10` for this parameter.</p>
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
