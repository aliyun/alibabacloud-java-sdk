// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingGraphResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSuspEventTracingGraphResponseBodyData data;

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

    public static DescribeSuspEventTracingGraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingGraphResponseBody self = new DescribeSuspEventTracingGraphResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingGraphResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSuspEventTracingGraphResponseBody setData(DescribeSuspEventTracingGraphResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSuspEventTracingGraphResponseBodyData getData() {
        return this.data;
    }

    public DescribeSuspEventTracingGraphResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeSuspEventTracingGraphResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSuspEventTracingGraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventTracingGraphResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSuspEventTracingGraphResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class DescribeSuspEventTracingGraphResponseBodyDataEdgeList extends TeaModel {
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

        public static DescribeSuspEventTracingGraphResponseBodyDataEdgeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingGraphResponseBodyDataEdgeList self = new DescribeSuspEventTracingGraphResponseBodyDataEdgeList();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setEndId(String endId) {
            this.endId = endId;
            return this;
        }
        public String getEndId() {
            return this.endId;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setEndType(String endType) {
            this.endType = endType;
            return this;
        }
        public String getEndType() {
            return this.endType;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setStartId(String startId) {
            this.startId = startId;
            return this;
        }
        public String getStartId() {
            return this.startId;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setStartType(String startType) {
            this.startType = startType;
            return this;
        }
        public String getStartType() {
            return this.startType;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataEdgeList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeSuspEventTracingGraphResponseBodyDataVertexListDisplayInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeSuspEventTracingGraphResponseBodyDataVertexListDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingGraphResponseBodyDataVertexListDisplayInfo self = new DescribeSuspEventTracingGraphResponseBodyDataVertexListDisplayInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexListDisplayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexListDisplayInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList self = new DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSuspEventTracingGraphResponseBodyDataVertexList extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("DisplayInfo")
        public java.util.List<DescribeSuspEventTracingGraphResponseBodyDataVertexListDisplayInfo> displayInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList> neighborList;

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

        public static DescribeSuspEventTracingGraphResponseBodyDataVertexList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingGraphResponseBodyDataVertexList self = new DescribeSuspEventTracingGraphResponseBodyDataVertexList();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setDisplayInfo(java.util.List<DescribeSuspEventTracingGraphResponseBodyDataVertexListDisplayInfo> displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingGraphResponseBodyDataVertexListDisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setNeighborList(java.util.List<DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingGraphResponseBodyDataVertexListNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSuspEventTracingGraphResponseBodyDataVertexList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeSuspEventTracingGraphResponseBodyData extends TeaModel {
        @NameInMap("EdgeList")
        public java.util.List<DescribeSuspEventTracingGraphResponseBodyDataEdgeList> edgeList;

        @NameInMap("VertexList")
        public java.util.List<DescribeSuspEventTracingGraphResponseBodyDataVertexList> vertexList;

        public static DescribeSuspEventTracingGraphResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventTracingGraphResponseBodyData self = new DescribeSuspEventTracingGraphResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventTracingGraphResponseBodyData setEdgeList(java.util.List<DescribeSuspEventTracingGraphResponseBodyDataEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingGraphResponseBodyDataEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public DescribeSuspEventTracingGraphResponseBodyData setVertexList(java.util.List<DescribeSuspEventTracingGraphResponseBodyDataVertexList> vertexList) {
            this.vertexList = vertexList;
            return this;
        }
        public java.util.List<DescribeSuspEventTracingGraphResponseBodyDataVertexList> getVertexList() {
            return this.vertexList;
        }

    }

}
