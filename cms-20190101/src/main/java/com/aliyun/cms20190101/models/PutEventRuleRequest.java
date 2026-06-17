// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleRequest extends TeaModel {
    /**
     * <p>The description of the Event-triggered Alert Rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Event alert test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The pattern of the Event-triggered Alert Rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventPattern")
    public java.util.List<PutEventRuleRequestEventPattern> eventPattern;

    /**
     * <p>The type of the Event-triggered Alert Rule. Valid values:</p>
     * <ul>
     * <li>SYSTEM: system event.</li>
     * <li>CUSTOM: custom event.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the application group to which the Event-triggered Alert Rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>7378****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the Event-triggered Alert Rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myRuleName</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The mute period. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("SilenceTime")
    public Long silenceTime;

    /**
     * <p>The status of the Event-triggered Alert Rule. Valid values:</p>
     * <ul>
     * <li>ENABLED: enabled.</li>
     * <li>DISABLED: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLED</p>
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
         * <p>The keyword for event filtering. When the event content contains this keyword, an alert is automatically triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>Stopping</p>
         */
        @NameInMap("CustomFilters")
        public String customFilters;

        /**
         * <p>The type of the Event-triggered Alert Rule. Valid values of N: 1 to 50. Valid values:</p>
         * <ul>
         * <li><p>StatusNotification: fault notification.</p>
         * </li>
         * <li><p>Exception: exception.</p>
         * </li>
         * <li><p>Maintenance: O&amp;M.</p>
         * </li>
         * <li><p>\*: unlimited.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exception</p>
         */
        @NameInMap("EventTypeList")
        public java.util.List<String> eventTypeList;

        /**
         * <p>The level of the Event-triggered Alert Rule. Valid values of N: 1 to 50. Valid values:</p>
         * <ul>
         * <li><p>CRITICAL: critical.</p>
         * </li>
         * <li><p>WARN: warning.</p>
         * </li>
         * <li><p>INFO: information.</p>
         * </li>
         * <li><p>\*: all levels.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("LevelList")
        public java.util.List<String> levelList;

        /**
         * <p>The name of the Event-triggered Alert Rule. Valid values of N: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent_Status_Stopped</p>
         */
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        /**
         * <p>The Alibaba Cloud service type. Valid values of N: 1 to 50.</p>
         * <blockquote>
         * <p>For information about the Alibaba Cloud services supported by Event-triggered Alert Rules, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The SQL filter for events. When the event content meets the SQL condition, an alert is automatically triggered.</p>
         * <blockquote>
         * <p>The syntax of the SQL event filter is consistent with the query syntax of Simple Log Service (SLS).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX and Executed</p>
         */
        @NameInMap("SQLFilter")
        public String SQLFilter;

        /**
         * <p>The status of the Event-triggered Alert Rule. Valid values of N: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed</p>
         */
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
