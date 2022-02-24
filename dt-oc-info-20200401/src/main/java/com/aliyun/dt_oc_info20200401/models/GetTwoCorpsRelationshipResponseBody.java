// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetTwoCorpsRelationshipResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetTwoCorpsRelationshipResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static GetTwoCorpsRelationshipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTwoCorpsRelationshipResponseBody self = new GetTwoCorpsRelationshipResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTwoCorpsRelationshipResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTwoCorpsRelationshipResponseBody setData(java.util.List<GetTwoCorpsRelationshipResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTwoCorpsRelationshipResponseBodyData> getData() {
        return this.data;
    }

    public GetTwoCorpsRelationshipResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTwoCorpsRelationshipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTwoCorpsRelationshipResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetTwoCorpsRelationshipResponseBodyDataNodes extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

        public static GetTwoCorpsRelationshipResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetTwoCorpsRelationshipResponseBodyDataNodes self = new GetTwoCorpsRelationshipResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetTwoCorpsRelationshipResponseBodyDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTwoCorpsRelationshipResponseBodyDataNodes setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetTwoCorpsRelationshipResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTwoCorpsRelationshipResponseBodyDataRelationships extends TeaModel {
        @NameInMap("EndNode")
        public String endNode;

        @NameInMap("Id")
        public String id;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("StartNode")
        public String startNode;

        @NameInMap("Type")
        public String type;

        public static GetTwoCorpsRelationshipResponseBodyDataRelationships build(java.util.Map<String, ?> map) throws Exception {
            GetTwoCorpsRelationshipResponseBodyDataRelationships self = new GetTwoCorpsRelationshipResponseBodyDataRelationships();
            return TeaModel.build(map, self);
        }

        public GetTwoCorpsRelationshipResponseBodyDataRelationships setEndNode(String endNode) {
            this.endNode = endNode;
            return this;
        }
        public String getEndNode() {
            return this.endNode;
        }

        public GetTwoCorpsRelationshipResponseBodyDataRelationships setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTwoCorpsRelationshipResponseBodyDataRelationships setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public GetTwoCorpsRelationshipResponseBodyDataRelationships setStartNode(String startNode) {
            this.startNode = startNode;
            return this;
        }
        public String getStartNode() {
            return this.startNode;
        }

        public GetTwoCorpsRelationshipResponseBodyDataRelationships setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTwoCorpsRelationshipResponseBodyData extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<GetTwoCorpsRelationshipResponseBodyDataNodes> nodes;

        @NameInMap("RelationLevel")
        public Integer relationLevel;

        @NameInMap("RelationRank")
        public Integer relationRank;

        @NameInMap("Relationships")
        public java.util.List<GetTwoCorpsRelationshipResponseBodyDataRelationships> relationships;

        @NameInMap("Strength")
        public Float strength;

        public static GetTwoCorpsRelationshipResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTwoCorpsRelationshipResponseBodyData self = new GetTwoCorpsRelationshipResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTwoCorpsRelationshipResponseBodyData setNodes(java.util.List<GetTwoCorpsRelationshipResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetTwoCorpsRelationshipResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public GetTwoCorpsRelationshipResponseBodyData setRelationLevel(Integer relationLevel) {
            this.relationLevel = relationLevel;
            return this;
        }
        public Integer getRelationLevel() {
            return this.relationLevel;
        }

        public GetTwoCorpsRelationshipResponseBodyData setRelationRank(Integer relationRank) {
            this.relationRank = relationRank;
            return this;
        }
        public Integer getRelationRank() {
            return this.relationRank;
        }

        public GetTwoCorpsRelationshipResponseBodyData setRelationships(java.util.List<GetTwoCorpsRelationshipResponseBodyDataRelationships> relationships) {
            this.relationships = relationships;
            return this;
        }
        public java.util.List<GetTwoCorpsRelationshipResponseBodyDataRelationships> getRelationships() {
            return this.relationships;
        }

        public GetTwoCorpsRelationshipResponseBodyData setStrength(Float strength) {
            this.strength = strength;
            return this;
        }
        public Float getStrength() {
            return this.strength;
        }

    }

}
