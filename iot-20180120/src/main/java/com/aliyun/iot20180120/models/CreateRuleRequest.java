// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>The format of the data that is processed based on the rule. The value of this parameter must be consistent with the format of device data that you want to process. Valid values:</p>
     * <br>
     * <p>*   **JSON**: JSON data. This is the default value.</p>
     * <p>*   **BINARY**: binary data.</p>
     * <br>
     * <p>>  If this parameter is set to **BINARY**, you cannot set the **TopicType** parameter to 0 and cannot forward data to Tablestore and ApsaraDB RDS.</p>
     */
    @NameInMap("DataType")
    public String dataType;

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
     * <p>The name of the data forwarding rule. The rule name must be 1 to 30 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ProductKey of the product to which the rule applies.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the resource group to which the rule is assigned. You can view the resource group information in the [Resource Management console](https://resourcemanager.console.aliyun.com/resource-groups).</p>
     * <br>
     * <p>>You can specify a value for this parameter only if you have activated Resource Management.</p>
     * <br>
     * <p>If you do not specify this parameter, the rule is assigned to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The description of the rule. The description can be up to 100 characters in length.</p>
     */
    @NameInMap("RuleDesc")
    public String ruleDesc;

    /**
     * <p>The SQL SELECT statement that you want to execute. For more information about the syntax, see [SQL statements](~~30554~~).</p>
     * <br>
     * <p>>  This parameter specifies the fields in SELECT statements. For example, if the SELECT statement is `SELECT a,b,c`, specify `a,b,c` for this parameter.</p>
     */
    @NameInMap("Select")
    public String select;

    /**
     * <p>The topic to which this rule is applied. Format: `${deviceName}/topicShortName`. `${deviceName}` specifies the name of the device, and `topicShortName` specifies the custom name of the topic.</p>
     * <br>
     * <p>*   Basic communication topics or Thing Specification Language (TSL)-based communication topics. Format: `${deviceName}/topicShortName`. You can replace `${deviceName}` with the `+` wildcard character. The wildcard character indicates that the topic applies to all devices under the product. Valid values of `topicShortName`:</p>
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
     * <p>    *   `/thing/event/property/history/post`: submits the historical property data of a device.</p>
     * <br>
     * <p>    *   `/thing/event/${tsl.event.identifier}/post`: submits the historical event data of a device. `${tsl.event.identifier}` specifies the identifier of an event in the TSL model.</p>
     * <br>
     * <p>    *   `/ota/upgrade`: submits the OTA update status.</p>
     * <br>
     * <p>    *   `/ota/version/post`: submits OTA module versions.</p>
     * <br>
     * <p>    *   `/thing/deviceinfo/update`: submits device tag changes.</p>
     * <br>
     * <p>    *   `/edge/driver/${driver_id}/point_post`: submits pass-through data from Link IoT Edge. `${driver_id}` specifies the ID of the driver that a device uses to access Link IoT Edge.</p>
     * <br>
     * <p>        The `${packageId}/${jobId}/ota/job/status` topic submits the status of OTA update batches. This topic is a basic communication topic. `${packageId}` specifies the ID of the update package. `${jobId}` specifies the ID of the update batch.</p>
     * <br>
     * <p>*   Custom topics. Example: `${deviceName}/user/get`.</p>
     * <br>
     * <p>    You can call the [QueryProductTopic](~~69647~~) operation to view all custom topics of the product.</p>
     * <br>
     * <p>    When you specify a custom topic, you can use the `+` and `#` wildcard characters.</p>
     * <br>
     * <p>    *   You can replace `${deviceName}` with the `+` wildcard character. The wildcard character specifies that the topic applies to all devices in the product.</p>
     * <br>
     * <p>    *   You can add `/user/#` after ${deviceName}. The `#` wildcard character can match all field values at the levels that follow `/user`.</p>
     * <br>
     * <p>        For more information about how to use wildcard characters, see [Custom topics with one or more wildcard characters](~~85539~~).</p>
     * <br>
     * <p>*   Topics that are used to submit device status changes. The topic name is in the `${deviceName}` format.</p>
     * <br>
     * <p>    You can use the `+` wildcard character. In this case, the status changes of all devices under the product are submitted.</p>
     */
    @NameInMap("ShortTopic")
    public String shortTopic;

    /**
     * <p>The complete topic to which the rule applies.</p>
     * <br>
     * <p>If you specify this parameter, you do not need to specify the **ShortTopic** and **TopicType** parameters.</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>*   **0**: The topic is a basic communication topic or TSL-based communication topic. The topic that is used to submit the status of OTA update batches belongs to the basic communication topics.****</p>
     * <p>*   **1**: a custom topic.</p>
     * <p>*   **2**: The topic is used to submit device status changes. Format: `/as/mqtt/status/${productKey}/${deviceName}`.</p>
     */
    @NameInMap("TopicType")
    public Integer topicType;

    /**
     * <p>The condition that is used to trigger the rule. For more information about the rule, see [SQL statements](~~30554~~).</p>
     * <br>
     * <p>>  This parameter specifies the fields in the **WHERE** clause. For example, if the **WHERE** clause is `WHERE a > 10`, you must specify `a > 10` for this parameter.</p>
     */
    @NameInMap("Where")
    public String where;

    public static CreateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleRequest self = new CreateRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRuleRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRuleRequest setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    public CreateRuleRequest setSelect(String select) {
        this.select = select;
        return this;
    }
    public String getSelect() {
        return this.select;
    }

    public CreateRuleRequest setShortTopic(String shortTopic) {
        this.shortTopic = shortTopic;
        return this;
    }
    public String getShortTopic() {
        return this.shortTopic;
    }

    public CreateRuleRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public CreateRuleRequest setTopicType(Integer topicType) {
        this.topicType = topicType;
        return this;
    }
    public Integer getTopicType() {
        return this.topicType;
    }

    public CreateRuleRequest setWhere(String where) {
        this.where = where;
        return this;
    }
    public String getWhere() {
        return this.where;
    }

}
