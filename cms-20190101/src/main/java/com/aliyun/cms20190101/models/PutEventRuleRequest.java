// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EventPattern")
    public java.util.List<PutEventRuleRequestEventPattern> eventPattern;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SilenceTime")
    public Long silenceTime;

    @NameInMap("State")
    public String state;

    public static PutEventRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEventRuleRequest self = new PutEventRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutEventRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutEventRuleRequest setEventPattern(java.util.List<PutEventRuleRequestEventPattern> eventPattern) {
        this.eventPattern = eventPattern;
        return this;
    }
    public java.util.List<PutEventRuleRequestEventPattern> getEventPattern() {
        return this.eventPattern;
    }

    public PutEventRuleRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public PutEventRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PutEventRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutEventRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutEventRuleRequest setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public PutEventRuleRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public static class PutEventRuleRequestEventPattern extends TeaModel {
        @NameInMap("CustomFilters")
        public String customFilters;

        @NameInMap("EventTypeList")
        public java.util.List<String> eventTypeList;

        @NameInMap("LevelList")
        public java.util.List<String> levelList;

        @NameInMap("NameList")
        public java.util.List<String> nameList;

        @NameInMap("Product")
        public String product;

        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        public static PutEventRuleRequestEventPattern build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleRequestEventPattern self = new PutEventRuleRequestEventPattern();
            return TeaModel.build(map, self);
        }

        public PutEventRuleRequestEventPattern setCustomFilters(String customFilters) {
            this.customFilters = customFilters;
            return this;
        }
        public String getCustomFilters() {
            return this.customFilters;
        }

        public PutEventRuleRequestEventPattern setEventTypeList(java.util.List<String> eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public java.util.List<String> getEventTypeList() {
            return this.eventTypeList;
        }

        public PutEventRuleRequestEventPattern setLevelList(java.util.List<String> levelList) {
            this.levelList = levelList;
            return this;
        }
        public java.util.List<String> getLevelList() {
            return this.levelList;
        }

        public PutEventRuleRequestEventPattern setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public PutEventRuleRequestEventPattern setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public PutEventRuleRequestEventPattern setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

    }

}
