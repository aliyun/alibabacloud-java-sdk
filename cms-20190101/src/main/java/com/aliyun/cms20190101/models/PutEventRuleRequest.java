// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **PutEventRule**.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EventPattern")
    public java.util.List<PutEventRuleRequestEventPattern> eventPattern;

    /**
     * <p>The type of the cloud service. Valid values of N: 1 to 50.</p>
     * <br>
     * <p>>  You can call the DescribeSystemEventMetaList operation to query the cloud services that support event-triggered alerts. For more information, see [DescribeSystemEventMetaList](~~114972~~).</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The type of the event-triggered alert rule. Valid values of N: 1 to 50. Valid values:</p>
     * <br>
     * <p>*   StatusNotification: fault notifications</p>
     * <p>*   Exception: exceptions</p>
     * <p>*   Maintenance: O\&M</p>
     * <p>*   \*: all types</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The number of event-triggered alert rules that were created or modified.</p>
     */
    @NameInMap("SilenceTime")
    public Long silenceTime;

    /**
     * <p>The status of the event-triggered alert rule. Valid values:</p>
     * <br>
     * <p>*   ENABLED: enabled</p>
     * <p>*   DISABLED: disabled</p>
     */
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
        /**
         * <p>The SQL condition that is used to filter events. If the content of an event meets the specified SQL condition, an alert is automatically triggered.</p>
         * <br>
         * <p>>  The syntax of SQL event filtering is consistent with the query syntax of Log Service.</p>
         */
        @NameInMap("CustomFilters")
        public String customFilters;

        @NameInMap("EventTypeList")
        public java.util.List<String> eventTypeList;

        @NameInMap("LevelList")
        public java.util.List<String> levelList;

        @NameInMap("NameList")
        public java.util.List<String> nameList;

        /**
         * <p>The name of the event-triggered alert rule.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The description of the event-triggered alert rule.</p>
         */
        @NameInMap("SQLFilter")
        public String SQLFilter;

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

        public PutEventRuleRequestEventPattern setSQLFilter(String SQLFilter) {
            this.SQLFilter = SQLFilter;
            return this;
        }
        public String getSQLFilter() {
            return this.SQLFilter;
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
