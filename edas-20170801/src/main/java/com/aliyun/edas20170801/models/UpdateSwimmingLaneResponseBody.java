// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneResponseBody extends TeaModel {
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
    public UpdateSwimmingLaneResponseBodyData data;

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
     * <p>6CB46AEA-309C-5041-9EC7-FCF4478F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneResponseBody self = new UpdateSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateSwimmingLaneResponseBody setData(UpdateSwimmingLaneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSwimmingLaneResponseBodyData getData() {
        return this.data;
    }

    public UpdateSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>476d26d9-b54c-40b8-8af9-d898cdc2****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>321</p>
         */
        @NameInMap("LaneId")
        public Long laneId;

        /**
         * <p>The association rule.</p>
         * 
         * <strong>example:</strong>
         * <p>dubbo</p>
         */
        @NameInMap("Rules")
        public String rules;

        public static UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList self = new UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList();
            return TeaModel.build(map, self);
        }

        public UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setLaneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }
        public Long getLaneId() {
            return this.laneId;
        }

        public UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList setRules(String rules) {
            this.rules = rules;
            return this;
        }
        public String getRules() {
            return this.rules;
        }

    }

    public static class UpdateSwimmingLaneResponseBodyData extends TeaModel {
        /**
         * <p>The rule of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;condition\&quot;:\&quot;AND\&quot;,\&quot;enable\&quot;:true,\&quot;path\&quot;:\&quot;/traffictest\&quot;,\&quot;priority\&quot;:1,\&quot;restItems\&quot;:[{\&quot;cond\&quot;:\&quot;==\&quot;,\&quot;datum\&quot;:\&quot;testheadervalue\&quot;,\&quot;name\&quot;:\&quot;testheader\&quot;,\&quot;operator\&quot;:\&quot;rawvalue\&quot;,\&quot;type\&quot;:\&quot;header\&quot;,\&quot;value\&quot;:\&quot;testheadervalue\&quot;}]}]&quot;</p>
         */
        @NameInMap("EntryRule")
        public String entryRule;

        /**
         * <p>The ID of the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>171</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The ID of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>321</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>test-swimlane</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:qa</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The list of associations between the lane and the related application.</p>
         */
        @NameInMap("SwimmingLaneAppRelationShipList")
        public java.util.List<UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        /**
         * <p>The tag of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>2cb6b8a</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static UpdateSwimmingLaneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSwimmingLaneResponseBodyData self = new UpdateSwimmingLaneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSwimmingLaneResponseBodyData setEntryRule(String entryRule) {
            this.entryRule = entryRule;
            return this;
        }
        public String getEntryRule() {
            return this.entryRule;
        }

        public UpdateSwimmingLaneResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public UpdateSwimmingLaneResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateSwimmingLaneResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSwimmingLaneResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public UpdateSwimmingLaneResponseBodyData setSwimmingLaneAppRelationShipList(java.util.List<UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList) {
            this.swimmingLaneAppRelationShipList = swimmingLaneAppRelationShipList;
            return this;
        }
        public java.util.List<UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> getSwimmingLaneAppRelationShipList() {
            return this.swimmingLaneAppRelationShipList;
        }

        public UpdateSwimmingLaneResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
