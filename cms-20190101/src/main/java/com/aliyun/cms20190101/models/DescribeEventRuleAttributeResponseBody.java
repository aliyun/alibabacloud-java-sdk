// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleAttributeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The alert does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AA3F210-C03D-4C86-8DB6-21C84FF692A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the event-triggered alert rule.</p>
     */
    @NameInMap("Result")
    public DescribeEventRuleAttributeResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeEventRuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleAttributeResponseBody self = new DescribeEventRuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventRuleAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventRuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventRuleAttributeResponseBody setResult(DescribeEventRuleAttributeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeEventRuleAttributeResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeEventRuleAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPatternEventTypeList extends TeaModel {
        @NameInMap("EventTypeList")
        public java.util.List<String> eventTypeList;

        public static DescribeEventRuleAttributeResponseBodyResultEventPatternEventTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPatternEventTypeList self = new DescribeEventRuleAttributeResponseBodyResultEventPatternEventTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternEventTypeList setEventTypeList(java.util.List<String> eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public java.util.List<String> getEventTypeList() {
            return this.eventTypeList;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObjKeywords extends TeaModel {
        @NameInMap("keyword")
        public java.util.List<String> keyword;

        public static DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObjKeywords build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObjKeywords self = new DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObjKeywords();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObjKeywords setKeyword(java.util.List<String> keyword) {
            this.keyword = keyword;
            return this;
        }
        public java.util.List<String> getKeyword() {
            return this.keyword;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObj extends TeaModel {
        /**
         * <p>The keywords that are used to match events.</p>
         */
        @NameInMap("Keywords")
        public DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObjKeywords keywords;

        /**
         * <p>The relationship between multiple keywords in a condition. Valid values:</p>
         * <ul>
         * <li>OR: The relationship between keywords is OR.</li>
         * <li>NOT: The keyword is excluded. The value NOT indicates that all events that do not contain the keywords are matched.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("Relation")
        public String relation;

        public static DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObj build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObj self = new DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObj();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObj setKeywords(DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObjKeywords keywords) {
            this.keywords = keywords;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObjKeywords getKeywords() {
            return this.keywords;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObj setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList extends TeaModel {
        @NameInMap("LevelList")
        public java.util.List<String> levelList;

        public static DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList self = new DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList setLevelList(java.util.List<String> levelList) {
            this.levelList = levelList;
            return this;
        }
        public java.util.List<String> getLevelList() {
            return this.levelList;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPatternNameList extends TeaModel {
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        public static DescribeEventRuleAttributeResponseBodyResultEventPatternNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPatternNameList self = new DescribeEventRuleAttributeResponseBodyResultEventPatternNameList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternNameList setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList extends TeaModel {
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        public static DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList self = new DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPattern extends TeaModel {
        /**
         * <p>The types of the event-triggered alert rules.</p>
         */
        @NameInMap("EventTypeList")
        public DescribeEventRuleAttributeResponseBodyResultEventPatternEventTypeList eventTypeList;

        /**
         * <p>The keyword for filtering.</p>
         */
        @NameInMap("KeywordFilterObj")
        public DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObj keywordFilterObj;

        @NameInMap("LevelList")
        public DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList levelList;

        @NameInMap("NameList")
        public DescribeEventRuleAttributeResponseBodyResultEventPatternNameList nameList;

        /**
         * <p>The name of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudMonitor</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>Indicates that logs are filtered based on the specified SQL statement. If the specified conditions are met, an alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>ycccluster1 and (i-23ij0o82612 or Executed1) or Asimulated not 222</p>
         */
        @NameInMap("SQLFilter")
        public String SQLFilter;

        @NameInMap("StatusList")
        public DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList statusList;

        public static DescribeEventRuleAttributeResponseBodyResultEventPattern build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPattern self = new DescribeEventRuleAttributeResponseBodyResultEventPattern();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setEventTypeList(DescribeEventRuleAttributeResponseBodyResultEventPatternEventTypeList eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPatternEventTypeList getEventTypeList() {
            return this.eventTypeList;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setKeywordFilterObj(DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObj keywordFilterObj) {
            this.keywordFilterObj = keywordFilterObj;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPatternKeywordFilterObj getKeywordFilterObj() {
            return this.keywordFilterObj;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setLevelList(DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList levelList) {
            this.levelList = levelList;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList getLevelList() {
            return this.levelList;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setNameList(DescribeEventRuleAttributeResponseBodyResultEventPatternNameList nameList) {
            this.nameList = nameList;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPatternNameList getNameList() {
            return this.nameList;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setSQLFilter(String SQLFilter) {
            this.SQLFilter = SQLFilter;
            return this;
        }
        public String getSQLFilter() {
            return this.SQLFilter;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setStatusList(DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList statusList) {
            this.statusList = statusList;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList getStatusList() {
            return this.statusList;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResult extends TeaModel {
        /**
         * <p>The description of the event-triggered alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Default group event rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The event pattern. This parameter describes the trigger conditions of an event.</p>
         */
        @NameInMap("EventPattern")
        public DescribeEventRuleAttributeResponseBodyResultEventPattern eventPattern;

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li>SYSTEM: system event</li>
         * <li>CUSTOM: custom event</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>3607****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the event-triggered alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test_DefaultEventRule_7378****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the event-triggered alert rule. Valid values:</p>
         * <ul>
         * <li>ENABLED</li>
         * <li>DISABLED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeEventRuleAttributeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResult self = new DescribeEventRuleAttributeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventRuleAttributeResponseBodyResult setEventPattern(DescribeEventRuleAttributeResponseBodyResultEventPattern eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPattern getEventPattern() {
            return this.eventPattern;
        }

        public DescribeEventRuleAttributeResponseBodyResult setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventRuleAttributeResponseBodyResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeEventRuleAttributeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventRuleAttributeResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
