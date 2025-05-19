// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListEventRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Datapoints")
    public ListEventRulesResponseBodyDatapoints datapoints;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListEventRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventRulesResponseBody self = new ListEventRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventRulesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListEventRulesResponseBody setDatapoints(ListEventRulesResponseBodyDatapoints datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public ListEventRulesResponseBodyDatapoints getDatapoints() {
        return this.datapoints;
    }

    public ListEventRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEventRulesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternEventTypeList extends TeaModel {
        @NameInMap("EventTypeList")
        public java.util.List<String> eventTypeList;

        public static ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternEventTypeList build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternEventTypeList self = new ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternEventTypeList();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternEventTypeList setEventTypeList(java.util.List<String> eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public java.util.List<String> getEventTypeList() {
            return this.eventTypeList;
        }

    }

    public static class ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternLevelList extends TeaModel {
        @NameInMap("LevelList")
        public java.util.List<String> levelList;

        public static ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternLevelList build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternLevelList self = new ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternLevelList();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternLevelList setLevelList(java.util.List<String> levelList) {
            this.levelList = levelList;
            return this;
        }
        public java.util.List<String> getLevelList() {
            return this.levelList;
        }

    }

    public static class ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternNameList extends TeaModel {
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        public static ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternNameList build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternNameList self = new ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternNameList();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternNameList setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

    }

    public static class ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternStatusList extends TeaModel {
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        public static ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternStatusList build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternStatusList self = new ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternStatusList();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternStatusList setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

    }

    public static class ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern extends TeaModel {
        @NameInMap("EventTypeList")
        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternEventTypeList eventTypeList;

        @NameInMap("LevelList")
        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternLevelList levelList;

        @NameInMap("NameList")
        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternNameList nameList;

        @NameInMap("Product")
        public String product;

        @NameInMap("StatusList")
        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternStatusList statusList;

        public static ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern self = new ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern setEventTypeList(ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternEventTypeList eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternEventTypeList getEventTypeList() {
            return this.eventTypeList;
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern setLevelList(ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternLevelList levelList) {
            this.levelList = levelList;
            return this;
        }
        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternLevelList getLevelList() {
            return this.levelList;
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern setNameList(ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternNameList nameList) {
            this.nameList = nameList;
            return this;
        }
        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternNameList getNameList() {
            return this.nameList;
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern setStatusList(ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternStatusList statusList) {
            this.statusList = statusList;
            return this;
        }
        public ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPatternStatusList getStatusList() {
            return this.statusList;
        }

    }

    public static class ListEventRulesResponseBodyDatapointsEventRuleEventPattern extends TeaModel {
        @NameInMap("EventPattern")
        public java.util.List<ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern> eventPattern;

        public static ListEventRulesResponseBodyDatapointsEventRuleEventPattern build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDatapointsEventRuleEventPattern self = new ListEventRulesResponseBodyDatapointsEventRuleEventPattern();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDatapointsEventRuleEventPattern setEventPattern(java.util.List<ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern> eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public java.util.List<ListEventRulesResponseBodyDatapointsEventRuleEventPatternEventPattern> getEventPattern() {
            return this.eventPattern;
        }

    }

    public static class ListEventRulesResponseBodyDatapointsEventRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("EventPattern")
        public ListEventRulesResponseBodyDatapointsEventRuleEventPattern eventPattern;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        public static ListEventRulesResponseBodyDatapointsEventRule build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDatapointsEventRule self = new ListEventRulesResponseBodyDatapointsEventRule();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDatapointsEventRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEventRulesResponseBodyDatapointsEventRule setEventPattern(ListEventRulesResponseBodyDatapointsEventRuleEventPattern eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public ListEventRulesResponseBodyDatapointsEventRuleEventPattern getEventPattern() {
            return this.eventPattern;
        }

        public ListEventRulesResponseBodyDatapointsEventRule setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListEventRulesResponseBodyDatapointsEventRule setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListEventRulesResponseBodyDatapointsEventRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEventRulesResponseBodyDatapointsEventRule setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListEventRulesResponseBodyDatapoints extends TeaModel {
        @NameInMap("EventRule")
        public java.util.List<ListEventRulesResponseBodyDatapointsEventRule> eventRule;

        public static ListEventRulesResponseBodyDatapoints build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDatapoints self = new ListEventRulesResponseBodyDatapoints();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDatapoints setEventRule(java.util.List<ListEventRulesResponseBodyDatapointsEventRule> eventRule) {
            this.eventRule = eventRule;
            return this;
        }
        public java.util.List<ListEventRulesResponseBodyDatapointsEventRule> getEventRule() {
            return this.eventRule;
        }

    }

}
