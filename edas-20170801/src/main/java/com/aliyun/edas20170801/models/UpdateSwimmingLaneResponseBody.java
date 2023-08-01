// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The list of associations between the lane and the related application.</p>
         */
        @NameInMap("SwimmingLaneAppRelationShipList")
        public java.util.List<UpdateSwimmingLaneResponseBodyDataSwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        /**
         * <p>The tag of the lane.</p>
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
