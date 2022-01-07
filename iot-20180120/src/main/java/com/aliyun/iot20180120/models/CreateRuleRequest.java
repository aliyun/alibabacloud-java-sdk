// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RuleDesc")
    public String ruleDesc;

    @NameInMap("Select")
    public String select;

    @NameInMap("ShortTopic")
    public String shortTopic;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("TopicType")
    public Integer topicType;

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
