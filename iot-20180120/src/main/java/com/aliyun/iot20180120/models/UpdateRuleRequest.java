// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateRuleRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RuleDesc")
    public String ruleDesc;

    @NameInMap("RuleId")
    public Long ruleId;

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
