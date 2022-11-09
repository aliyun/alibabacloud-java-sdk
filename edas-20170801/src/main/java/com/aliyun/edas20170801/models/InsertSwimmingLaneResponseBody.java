// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public InsertSwimmingLaneResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static InsertSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneResponseBody self = new InsertSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertSwimmingLaneResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InsertSwimmingLaneResponseBody setData(InsertSwimmingLaneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertSwimmingLaneResponseBodyData getData() {
        return this.data;
    }

    public InsertSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("LaneId")
        public Long laneId;

        @NameInMap("Rules")
        public String rules;

        public static InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList build(java.util.Map<String, ?> map) throws Exception {
            InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList self = new InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList();
            return TeaModel.build(map, self);
        }

        public InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setLaneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }
        public Long getLaneId() {
            return this.laneId;
        }

        public InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setRules(String rules) {
            this.rules = rules;
            return this;
        }
        public String getRules() {
            return this.rules;
        }

    }

    public static class InsertSwimmingLaneResponseBodyData extends TeaModel {
        @NameInMap("AppInfos")
        public String appInfos;

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

        @NameInMap("SwimmingLaneAppRelationShipList")
        public java.util.List<InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        @NameInMap("Tag")
        public String tag;

        public static InsertSwimmingLaneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertSwimmingLaneResponseBodyData self = new InsertSwimmingLaneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertSwimmingLaneResponseBodyData setAppInfos(String appInfos) {
            this.appInfos = appInfos;
            return this;
        }
        public String getAppInfos() {
            return this.appInfos;
        }

        public InsertSwimmingLaneResponseBodyData setEntryRule(String entryRule) {
            this.entryRule = entryRule;
            return this;
        }
        public String getEntryRule() {
            return this.entryRule;
        }

        public InsertSwimmingLaneResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public InsertSwimmingLaneResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public InsertSwimmingLaneResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InsertSwimmingLaneResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public InsertSwimmingLaneResponseBodyData setSwimmingLaneAppRelationShipList(java.util.List<InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList) {
            this.swimmingLaneAppRelationShipList = swimmingLaneAppRelationShipList;
            return this;
        }
        public java.util.List<InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> getSwimmingLaneAppRelationShipList() {
            return this.swimmingLaneAppRelationShipList;
        }

        public InsertSwimmingLaneResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
