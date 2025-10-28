// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSwimmingLaneResponseBodyData> data;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C2CDBBF9-9C9A-5AA1-9F39-094ADEB3****</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>3b615783-01f1-4569-baa3-cb71bdb6****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-app-58846</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>edas-canary</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The ID of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>348</p>
         */
        @NameInMap("LaneId")
        public Long laneId;

        /**
         * <p>The association rule.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
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

        public ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
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
        /**
         * <p>Indicates whether the throttling rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRules")
        public Boolean enableRules;

        /**
         * <p>The conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;condition\&quot;:\&quot;AND\&quot;,\&quot;enable\&quot;:true,\&quot;path\&quot;:\&quot;/\&quot;,\&quot;priority\&quot;:1,\&quot;restItems\&quot;:[{\&quot;cond\&quot;:\&quot;==\&quot;,\&quot;datum\&quot;:\&quot;value\&quot;,\&quot;name\&quot;:\&quot;tags\&quot;,\&quot;operator\&quot;:\&quot;rawvalue\&quot;,\&quot;type\&quot;:\&quot;header\&quot;,\&quot;value\&quot;:\&quot;value\&quot;}]}]</p>
         */
        @NameInMap("EntryRule")
        public String entryRule;

        /**
         * <p>The ID of the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>156</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The ID of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>348</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the microservices namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:pre2</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The expected tag.</p>
         * 
         * <strong>example:</strong>
         * <p>d0ad1052</p>
         */
        @NameInMap("ScenarioSign")
        public String scenarioSign;

        /**
         * <p>The applications that are related to the lane.</p>
         */
        @NameInMap("SwimmingLaneAppRelationShipList")
        public java.util.List<ListSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>2cb6b8a</p>
         */
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
