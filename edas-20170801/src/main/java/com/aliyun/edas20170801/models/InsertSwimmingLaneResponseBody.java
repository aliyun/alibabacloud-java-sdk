// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public InsertSwimmingLaneResponseBodyData data;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the lane.</p>
         */
        @NameInMap("LaneId")
        public Long laneId;

        /**
         * <p>The association rule.</p>
         */
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
        /**
         * <p>The applications that are associated with lanes.</p>
         */
        @NameInMap("AppInfos")
        public String appInfos;

        /**
         * <p>The throttling rule for the lane.</p>
         * <br>
         * <p>priority: the priority of the throttling rule for the lane. Valid values: 1 to 100.</p>
         * <br>
         * <p>path: the path that is matched by the throttling rule for the lane.</p>
         * <br>
         * <p>restItems: conditions to be met.</p>
         * <br>
         * <p>condition: the relationship among the conditions to be met.</p>
         * <br>
         * <p>*   AND: all conditions</p>
         * <p>*   OR: one of the conditions</p>
         * <br>
         * <p>restItems.type: the type of the rule. Valid values:</p>
         * <br>
         * <p>*   header: matches by request header.</p>
         * <p>*   cookie: matches by request cookie.</p>
         * <p>*   param: matches by request parameters.</p>
         * <br>
         * <p>restItems.name: the key that matches the rule.</p>
         * <br>
         * <p>restItems.value: the value that matches the rule.</p>
         * <br>
         * <p>restItems.cond: the condition that matches the rule. Valid values:</p>
         * <br>
         * <p>*   "==": The parameter value is equal to the value that you enter in the Value field.</p>
         * <p>*   "!=": The parameter value is not equal to the value that you enter in the Value field.</p>
         * <p>*   ">": The parameter value is greater than the value that you enter in the Value field.</p>
         * <p>*   "<": The parameter value is less than the value that you enter in the Value field.</p>
         * <p>*   ">=": The parameter value is greater than or equal to the value that you enter in the Value field.</p>
         * <p>*   "<=": The parameter value is less than or equal to the value that you enter in the Value field.</p>
         * <p>*   "in": The parameter value is within the values that you enter in the Value field.</p>
         * <br>
         * <p>restItems.operator: the type of the value. Valid values:</p>
         * <br>
         * <p>*   rawvalue: the initial value</p>
         * <p>*   mod: the reminder obtained by performing modulo operation</p>
         * <p>*   list: the value from the list</p>
         */
        @NameInMap("EntryRule")
        public String entryRule;

        /**
         * <p>The ID of the lane group.</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The ID of the lane.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the lane.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The association relationships between lanes and applications.</p>
         */
        @NameInMap("SwimmingLaneAppRelationShipList")
        public java.util.List<InsertSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        /**
         * <p>The tag of the lane.</p>
         */
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
