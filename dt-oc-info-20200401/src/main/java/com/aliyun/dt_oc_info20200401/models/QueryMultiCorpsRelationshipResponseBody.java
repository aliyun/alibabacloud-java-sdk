// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryMultiCorpsRelationshipResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryMultiCorpsRelationshipResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static QueryMultiCorpsRelationshipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMultiCorpsRelationshipResponseBody self = new QueryMultiCorpsRelationshipResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMultiCorpsRelationshipResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryMultiCorpsRelationshipResponseBody setData(QueryMultiCorpsRelationshipResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMultiCorpsRelationshipResponseBodyData getData() {
        return this.data;
    }

    public QueryMultiCorpsRelationshipResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMultiCorpsRelationshipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMultiCorpsRelationshipResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        public static QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes build(java.util.Map<String, ?> map) throws Exception {
            QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes self = new QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes();
            return TeaModel.build(map, self);
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

    }

    public static class QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships extends TeaModel {
        @NameInMap("EndNode")
        public String endNode;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("StartNode")
        public String startNode;

        @NameInMap("Type")
        public String type;

        public static QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships build(java.util.Map<String, ?> map) throws Exception {
            QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships self = new QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships();
            return TeaModel.build(map, self);
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships setEndNode(String endNode) {
            this.endNode = endNode;
            return this;
        }
        public String getEndNode() {
            return this.endNode;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships setStartNode(String startNode) {
            this.startNode = startNode;
            return this;
        }
        public String getStartNode() {
            return this.startNode;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes> nodes;

        @NameInMap("RelationLevel")
        public Long relationLevel;

        @NameInMap("RelationRank")
        public Long relationRank;

        @NameInMap("Relationships")
        public java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships> relationships;

        @NameInMap("Strength")
        public Float strength;

        public static QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths build(java.util.Map<String, ?> map) throws Exception {
            QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths self = new QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths();
            return TeaModel.build(map, self);
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths setNodes(java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsNodes> getNodes() {
            return this.nodes;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths setRelationLevel(Long relationLevel) {
            this.relationLevel = relationLevel;
            return this;
        }
        public Long getRelationLevel() {
            return this.relationLevel;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths setRelationRank(Long relationRank) {
            this.relationRank = relationRank;
            return this;
        }
        public Long getRelationRank() {
            return this.relationRank;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths setRelationships(java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships> relationships) {
            this.relationships = relationships;
            return this;
        }
        public java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPathsRelationships> getRelationships() {
            return this.relationships;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths setStrength(Float strength) {
            this.strength = strength;
            return this;
        }
        public Float getStrength() {
            return this.strength;
        }

    }

    public static class QueryMultiCorpsRelationshipResponseBodyDataGraphPaths extends TeaModel {
        @NameInMap("EndNodeName")
        public String endNodeName;

        @NameInMap("Paths")
        public java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths> paths;

        @NameInMap("StartNodeName")
        public String startNodeName;

        public static QueryMultiCorpsRelationshipResponseBodyDataGraphPaths build(java.util.Map<String, ?> map) throws Exception {
            QueryMultiCorpsRelationshipResponseBodyDataGraphPaths self = new QueryMultiCorpsRelationshipResponseBodyDataGraphPaths();
            return TeaModel.build(map, self);
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPaths setEndNodeName(String endNodeName) {
            this.endNodeName = endNodeName;
            return this;
        }
        public String getEndNodeName() {
            return this.endNodeName;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPaths setPaths(java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPathsPaths> getPaths() {
            return this.paths;
        }

        public QueryMultiCorpsRelationshipResponseBodyDataGraphPaths setStartNodeName(String startNodeName) {
            this.startNodeName = startNodeName;
            return this;
        }
        public String getStartNodeName() {
            return this.startNodeName;
        }

    }

    public static class QueryMultiCorpsRelationshipResponseBodyData extends TeaModel {
        @NameInMap("GraphPaths")
        public java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPaths> graphPaths;

        @NameInMap("Group")
        public Integer group;

        @NameInMap("GroupCorps")
        public java.util.List<java.util.Map<String, ?>> groupCorps;

        @NameInMap("PathTotal")
        public Integer pathTotal;

        public static QueryMultiCorpsRelationshipResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMultiCorpsRelationshipResponseBodyData self = new QueryMultiCorpsRelationshipResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMultiCorpsRelationshipResponseBodyData setGraphPaths(java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPaths> graphPaths) {
            this.graphPaths = graphPaths;
            return this;
        }
        public java.util.List<QueryMultiCorpsRelationshipResponseBodyDataGraphPaths> getGraphPaths() {
            return this.graphPaths;
        }

        public QueryMultiCorpsRelationshipResponseBodyData setGroup(Integer group) {
            this.group = group;
            return this;
        }
        public Integer getGroup() {
            return this.group;
        }

        public QueryMultiCorpsRelationshipResponseBodyData setGroupCorps(java.util.List<java.util.Map<String, ?>> groupCorps) {
            this.groupCorps = groupCorps;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getGroupCorps() {
            return this.groupCorps;
        }

        public QueryMultiCorpsRelationshipResponseBodyData setPathTotal(Integer pathTotal) {
            this.pathTotal = pathTotal;
            return this;
        }
        public Integer getPathTotal() {
            return this.pathTotal;
        }

    }

}
