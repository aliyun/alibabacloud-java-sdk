// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListSwimmingLaneResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneResponseBody self = new ListSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSwimmingLaneResponseBody setData(java.util.List<ListSwimmingLaneResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSwimmingLaneResponseBodyData> getData() {
        return this.data;
    }

    public ListSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("LaneId")
        public Long laneId;

        @NameInMap("Rules")
        public String rules;

        public static ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList self = new ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setLaneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }
        public Long getLaneId() {
            return this.laneId;
        }

        public ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setRules(String rules) {
            this.rules = rules;
            return this;
        }
        public String getRules() {
            return this.rules;
        }

    }

    public static class ListSwimmingLaneResponseBodyData extends TeaModel {
        @NameInMap("EnableRules")
        public Boolean enableRules;

        @NameInMap("EntryRule")
        public String entryRule;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("ScenarioSign")
        public String scenarioSign;

        @NameInMap("SwimmingLaneAppRelationShipList")
        public java.util.List<ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        @NameInMap("Tag")
        public String tag;

        public static ListSwimmingLaneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneResponseBodyData self = new ListSwimmingLaneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneResponseBodyData setEnableRules(Boolean enableRules) {
            this.enableRules = enableRules;
            return this;
        }
        public Boolean getEnableRules() {
            return this.enableRules;
        }

        public ListSwimmingLaneResponseBodyData setEntryRule(String entryRule) {
            this.entryRule = entryRule;
            return this;
        }
        public String getEntryRule() {
            return this.entryRule;
        }

        public ListSwimmingLaneResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListSwimmingLaneResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSwimmingLaneResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSwimmingLaneResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListSwimmingLaneResponseBodyData setScenarioSign(String scenarioSign) {
            this.scenarioSign = scenarioSign;
            return this;
        }
        public String getScenarioSign() {
            return this.scenarioSign;
        }

        public ListSwimmingLaneResponseBodyData setSwimmingLaneAppRelationShipList(java.util.List<ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList) {
            this.swimmingLaneAppRelationShipList = swimmingLaneAppRelationShipList;
            return this;
        }
        public java.util.List<ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> getSwimmingLaneAppRelationShipList() {
            return this.swimmingLaneAppRelationShipList;
        }

        public ListSwimmingLaneResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
