// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeGraph4InvestigationOnlineResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeGraph4InvestigationOnlineResponseBodyData data;

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

    public static DescribeGraph4InvestigationOnlineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4InvestigationOnlineResponseBody self = new DescribeGraph4InvestigationOnlineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4InvestigationOnlineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setData(DescribeGraph4InvestigationOnlineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeGraph4InvestigationOnlineResponseBodyData getData() {
        return this.data;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList extends TeaModel {
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

        public static DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList self = new DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setEndId(String endId) {
            this.endId = endId;
            return this;
        }
        public String getEndId() {
            return this.endId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setEndType(String endType) {
            this.endType = endType;
            return this;
        }
        public String getEndType() {
            return this.endType;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setStartId(String startId) {
            this.startId = startId;
            return this;
        }
        public String getStartId() {
            return this.startId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setStartType(String startType) {
            this.startType = startType;
            return this;
        }
        public String getStartType() {
            return this.startType;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList extends TeaModel {
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

        public static DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList self = new DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setCurrentVersionId(String currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setIsVirtualNode(Integer isVirtualNode) {
            this.isVirtualNode = isVirtualNode;
            return this;
        }
        public Integer getIsVirtualNode() {
            return this.isVirtualNode;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setSyncId(Integer syncId) {
            this.syncId = syncId;
            return this;
        }
        public Integer getSyncId() {
            return this.syncId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setTraceSuccessFlag(Integer traceSuccessFlag) {
            this.traceSuccessFlag = traceSuccessFlag;
            return this;
        }
        public Integer getTraceSuccessFlag() {
            return this.traceSuccessFlag;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList extends TeaModel {
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

        public static DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList self = new DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setCurrentVersionId(String currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setDirected(Integer directed) {
            this.directed = directed;
            return this;
        }
        public Integer getDirected() {
            return this.directed;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setSyncId(Integer syncId) {
            this.syncId = syncId;
            return this;
        }
        public Integer getSyncId() {
            return this.syncId;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataVertexListDisplayInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeGraph4InvestigationOnlineResponseBodyDataVertexListDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataVertexListDisplayInfo self = new DescribeGraph4InvestigationOnlineResponseBodyDataVertexListDisplayInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexListDisplayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexListDisplayInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList self = new DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataVertexList extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("DisplayInfo")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListDisplayInfo> displayInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList> neighborList;

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

        public static DescribeGraph4InvestigationOnlineResponseBodyDataVertexList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataVertexList self = new DescribeGraph4InvestigationOnlineResponseBodyDataVertexList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setDisplayInfo(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListDisplayInfo> displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListDisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setNeighborList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyData extends TeaModel {
        @NameInMap("EdgeList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList> edgeList;

        @NameInMap("EntityTypeList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList> entityTypeList;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("RelationTypeList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList> relationTypeList;

        @NameInMap("VertexList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexList> vertexList;

        public static DescribeGraph4InvestigationOnlineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyData self = new DescribeGraph4InvestigationOnlineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyData setEdgeList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyData setEntityTypeList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList> entityTypeList) {
            this.entityTypeList = entityTypeList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList> getEntityTypeList() {
            return this.entityTypeList;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyData setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyData setRelationTypeList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList> relationTypeList) {
            this.relationTypeList = relationTypeList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList> getRelationTypeList() {
            return this.relationTypeList;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyData setVertexList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexList> vertexList) {
            this.vertexList = vertexList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexList> getVertexList() {
            return this.vertexList;
        }

    }

}
