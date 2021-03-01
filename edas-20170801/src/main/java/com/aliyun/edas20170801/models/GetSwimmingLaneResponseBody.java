// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSwimmingLaneResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetSwimmingLaneResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    public static GetSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwimmingLaneResponseBody self = new GetSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwimmingLaneResponseBody setData(GetSwimmingLaneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSwimmingLaneResponseBodyData getData() {
        return this.data;
    }

    public GetSwimmingLaneResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Rules")
        public String rules;

        @NameInMap("LaneId")
        public Long laneId;

        public static GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList build(java.util.Map<String, ?> map) throws Exception {
            GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList self = new GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList();
            return TeaModel.build(map, self);
        }

        public GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setRules(String rules) {
            this.rules = rules;
            return this;
        }
        public String getRules() {
            return this.rules;
        }

        public GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setLaneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }
        public Long getLaneId() {
            return this.laneId;
        }

    }

    public static class GetSwimmingLaneResponseBodyData extends TeaModel {
        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("ScenarioSign")
        public String scenarioSign;

        @NameInMap("EntryRule")
        public String entryRule;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("EnableRules")
        public Boolean enableRules;

        @NameInMap("Name")
        public String name;

        @NameInMap("SwimmingLaneAppRelationShipList")
        public java.util.List<GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        @NameInMap("Id")
        public String id;

        public static GetSwimmingLaneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSwimmingLaneResponseBodyData self = new GetSwimmingLaneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSwimmingLaneResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetSwimmingLaneResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetSwimmingLaneResponseBodyData setScenarioSign(String scenarioSign) {
            this.scenarioSign = scenarioSign;
            return this;
        }
        public String getScenarioSign() {
            return this.scenarioSign;
        }

        public GetSwimmingLaneResponseBodyData setEntryRule(String entryRule) {
            this.entryRule = entryRule;
            return this;
        }
        public String getEntryRule() {
            return this.entryRule;
        }

        public GetSwimmingLaneResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetSwimmingLaneResponseBodyData setEnableRules(Boolean enableRules) {
            this.enableRules = enableRules;
            return this;
        }
        public Boolean getEnableRules() {
            return this.enableRules;
        }

        public GetSwimmingLaneResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSwimmingLaneResponseBodyData setSwimmingLaneAppRelationShipList(java.util.List<GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList) {
            this.swimmingLaneAppRelationShipList = swimmingLaneAppRelationShipList;
            return this;
        }
        public java.util.List<GetSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> getSwimmingLaneAppRelationShipList() {
            return this.swimmingLaneAppRelationShipList;
        }

        public GetSwimmingLaneResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
