// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutAlertStrategyShrinkRequest extends TeaModel {
    @NameInMap("ChannelMapRule")
    public String channelMapRuleShrink;

    @NameInMap("Describe")
    public String describe;

    @NameInMap("EscalationRule")
    public String escalationRuleShrink;

    @NameInMap("FilterRule")
    public String filterRuleShrink;

    @NameInMap("GroupingRule")
    public String groupingRuleShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("PushingRule")
    public String pushingRuleShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StrategyId")
    public String strategyId;

    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    public static PutAlertStrategyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertStrategyShrinkRequest self = new PutAlertStrategyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertStrategyShrinkRequest setChannelMapRuleShrink(String channelMapRuleShrink) {
        this.channelMapRuleShrink = channelMapRuleShrink;
        return this;
    }
    public String getChannelMapRuleShrink() {
        return this.channelMapRuleShrink;
    }

    public PutAlertStrategyShrinkRequest setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

    public PutAlertStrategyShrinkRequest setEscalationRuleShrink(String escalationRuleShrink) {
        this.escalationRuleShrink = escalationRuleShrink;
        return this;
    }
    public String getEscalationRuleShrink() {
        return this.escalationRuleShrink;
    }

    public PutAlertStrategyShrinkRequest setFilterRuleShrink(String filterRuleShrink) {
        this.filterRuleShrink = filterRuleShrink;
        return this;
    }
    public String getFilterRuleShrink() {
        return this.filterRuleShrink;
    }

    public PutAlertStrategyShrinkRequest setGroupingRuleShrink(String groupingRuleShrink) {
        this.groupingRuleShrink = groupingRuleShrink;
        return this;
    }
    public String getGroupingRuleShrink() {
        return this.groupingRuleShrink;
    }

    public PutAlertStrategyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PutAlertStrategyShrinkRequest setPushingRuleShrink(String pushingRuleShrink) {
        this.pushingRuleShrink = pushingRuleShrink;
        return this;
    }
    public String getPushingRuleShrink() {
        return this.pushingRuleShrink;
    }

    public PutAlertStrategyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutAlertStrategyShrinkRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public PutAlertStrategyShrinkRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

}
