// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeGraph4IncidentOnlineResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeGraph4IncidentOnlineResponseBodyData data;

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

    public static DescribeGraph4IncidentOnlineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4IncidentOnlineResponseBody self = new DescribeGraph4IncidentOnlineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4IncidentOnlineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGraph4IncidentOnlineResponseBody setData(DescribeGraph4IncidentOnlineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeGraph4IncidentOnlineResponseBodyData getData() {
        return this.data;
    }

    public DescribeGraph4IncidentOnlineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeGraph4IncidentOnlineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGraph4IncidentOnlineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGraph4IncidentOnlineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGraph4IncidentOnlineResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class DescribeGraph4IncidentOnlineResponseBodyDataEdgeList extends TeaModel {
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

        public static DescribeGraph4IncidentOnlineResponseBodyDataEdgeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4IncidentOnlineResponseBodyDataEdgeList self = new DescribeGraph4IncidentOnlineResponseBodyDataEdgeList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setEndId(String endId) {
            this.endId = endId;
            return this;
        }
        public String getEndId() {
            return this.endId;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setEndType(String endType) {
            this.endType = endType;
            return this;
        }
        public String getEndType() {
            return this.endType;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setStartId(String startId) {
            this.startId = startId;
            return this;
        }
        public String getStartId() {
            return this.startId;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setStartType(String startType) {
            this.startType = startType;
            return this;
        }
        public String getStartType() {
            return this.startType;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEdgeList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList extends TeaModel {
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        @NameInMap("DisplayColor")
        public String displayColor;

        @NameInMap("DisplayIcon")
        public String displayIcon;

        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsVirtualNode")
        public Integer isVirtualNode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("SyncId")
        public Integer syncId;

        @NameInMap("TraceSuccessFlag")
        public Integer traceSuccessFlag;

        public static DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList self = new DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setCurrentVersionId(String currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setIsVirtualNode(Integer isVirtualNode) {
            this.isVirtualNode = isVirtualNode;
            return this;
        }
        public Integer getIsVirtualNode() {
            return this.isVirtualNode;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setSyncId(Integer syncId) {
            this.syncId = syncId;
            return this;
        }
        public Integer getSyncId() {
            return this.syncId;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList setTraceSuccessFlag(Integer traceSuccessFlag) {
            this.traceSuccessFlag = traceSuccessFlag;
            return this;
        }
        public Integer getTraceSuccessFlag() {
            return this.traceSuccessFlag;
        }

    }

    public static class DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList extends TeaModel {
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        @NameInMap("Directed")
        public Integer directed;

        @NameInMap("DisplayColor")
        public String displayColor;

        @NameInMap("DisplayIcon")
        public String displayIcon;

        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ShowType")
        public String showType;

        @NameInMap("SyncId")
        public Integer syncId;

        public static DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList self = new DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setCurrentVersionId(String currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setDirected(Integer directed) {
            this.directed = directed;
            return this;
        }
        public Integer getDirected() {
            return this.directed;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList setSyncId(Integer syncId) {
            this.syncId = syncId;
            return this;
        }
        public Integer getSyncId() {
            return this.syncId;
        }

    }

    public static class DescribeGraph4IncidentOnlineResponseBodyDataVertexListDisplayInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeGraph4IncidentOnlineResponseBodyDataVertexListDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4IncidentOnlineResponseBodyDataVertexListDisplayInfo self = new DescribeGraph4IncidentOnlineResponseBodyDataVertexListDisplayInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexListDisplayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexListDisplayInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList self = new DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeGraph4IncidentOnlineResponseBodyDataVertexList extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("DisplayInfo")
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataVertexListDisplayInfo> displayInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList> neighborList;

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

        public static DescribeGraph4IncidentOnlineResponseBodyDataVertexList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4IncidentOnlineResponseBodyDataVertexList self = new DescribeGraph4IncidentOnlineResponseBodyDataVertexList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setDisplayInfo(java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataVertexListDisplayInfo> displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataVertexListDisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setNeighborList(java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataVertexListNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGraph4IncidentOnlineResponseBodyDataVertexList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeGraph4IncidentOnlineResponseBodyData extends TeaModel {
        @NameInMap("EdgeList")
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataEdgeList> edgeList;

        @NameInMap("EntityTypeList")
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList> entityTypeList;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("RelationTypeList")
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList> relationTypeList;

        @NameInMap("VertexList")
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataVertexList> vertexList;

        public static DescribeGraph4IncidentOnlineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4IncidentOnlineResponseBodyData self = new DescribeGraph4IncidentOnlineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4IncidentOnlineResponseBodyData setEdgeList(java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public DescribeGraph4IncidentOnlineResponseBodyData setEntityTypeList(java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList> entityTypeList) {
            this.entityTypeList = entityTypeList;
            return this;
        }
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataEntityTypeList> getEntityTypeList() {
            return this.entityTypeList;
        }

        public DescribeGraph4IncidentOnlineResponseBodyData setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeGraph4IncidentOnlineResponseBodyData setRelationTypeList(java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList> relationTypeList) {
            this.relationTypeList = relationTypeList;
            return this;
        }
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataRelationTypeList> getRelationTypeList() {
            return this.relationTypeList;
        }

        public DescribeGraph4IncidentOnlineResponseBodyData setVertexList(java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataVertexList> vertexList) {
            this.vertexList = vertexList;
            return this;
        }
        public java.util.List<DescribeGraph4IncidentOnlineResponseBodyDataVertexList> getVertexList() {
            return this.vertexList;
        }

    }

}
