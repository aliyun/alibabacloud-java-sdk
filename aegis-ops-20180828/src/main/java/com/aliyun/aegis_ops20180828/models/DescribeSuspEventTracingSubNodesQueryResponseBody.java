// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingSubNodesQueryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSuspEventTracingSubNodesQueryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TimeCost")
    public Long timeCost;

    public static DescribeSuspEventTracingSubNodesQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingSubNodesQueryResponseBody self = new DescribeSuspEventTracingSubNodesQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingSubNodesQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSuspEventTracingSubNodesQueryResponseBody setData(DescribeSuspEventTracingSubNodesQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSuspEventTracingSubNodesQueryResponseBodyData getData() {
        return this.data;
    }

    public DescribeSuspEventTracingSubNodesQueryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeSuspEventTracingSubNodesQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSuspEventTracingSubNodesQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventTracingSubNodesQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSuspEventTracingSubNodesQueryResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("EndId")
        public String endId;

        @NameInMap("EndType")
        public String endType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Origin")
        public String origin;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("ShowType")
        public String showType;

        @NameInMap("StartId")
        public String startId;

        @NameInMap("StartType")
        public String startType;

        @NameInMap("Time")
        public String time;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Type")
        public String type;

        @NameInMap("TypeName")
        public String typeName;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList self = new DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setEndId(String endId) {
            this.endId = endId;
            return this;
        }
        public String getEndId() {
            return this.endId;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setEndType(String endType) {
            this.endType = endType;
            return this;
        }
        public String getEndType() {
            return this.endType;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setStartId(String startId) {
            this.startId = startId;
            return this;
        }
        public String getStartId() {
            return this.startId;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setStartType(String startType) {
            this.startType = startType;
            return this;
        }
        public String getStartType() {
            return this.startType;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListDisplayInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListDisplayInfo self = new DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListDisplayInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListDisplayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListDisplayInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList self = new DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("DisplayInfo")
        public java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListDisplayInfo> displayInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList> neighborList;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Time")
        public String time;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList self = new DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setDisplayInfo(java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListDisplayInfo> displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListDisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setNeighborList(java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexListNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeSuspEventTracingSubNodesQueryResponseBodyData extends TeaModel {
        @NameInMap("EdgeList")
        public java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList> edgeList;

        @NameInMap("VertexList")
        public java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList> vertexList;

        public static DescribeSuspEventTracingSubNodesQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingSubNodesQueryResponseBodyData self = new DescribeSuspEventTracingSubNodesQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyData setEdgeList(java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public DescribeSuspEventTracingSubNodesQueryResponseBodyData setVertexList(java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList> vertexList) {
            this.vertexList = vertexList;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingSubNodesQueryResponseBodyDataVertexList> getVertexList() {
            return this.vertexList;
        }

    }

}
