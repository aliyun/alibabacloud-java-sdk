// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgNeighborResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public GetKgNeighborResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetKgNeighborResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKgNeighborResponseBody self = new GetKgNeighborResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKgNeighborResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKgNeighborResponseBody setData(GetKgNeighborResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKgNeighborResponseBodyData getData() {
        return this.data;
    }

    public GetKgNeighborResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetKgNeighborResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKgNeighborResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKgNeighborResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKgNeighborResponseBodyDataEdgeListPropertyList extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property data type. Valid values: STRING (string), INTEGER (integer), FLOAT (float), BOOLEAN (Boolean), DATE (date), LIST (list), and others.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetKgNeighborResponseBodyDataEdgeListPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetKgNeighborResponseBodyDataEdgeListPropertyList self = new GetKgNeighborResponseBodyDataEdgeListPropertyList();
            return TeaModel.build(map, self);
        }

        public GetKgNeighborResponseBodyDataEdgeListPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetKgNeighborResponseBodyDataEdgeListPropertyList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetKgNeighborResponseBodyDataEdgeListPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetKgNeighborResponseBodyDataEdgeList extends TeaModel {
        /**
         * <p>The relation record property list.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<GetKgNeighborResponseBodyDataEdgeListPropertyList> propertyList;

        /**
         * <p>The relation record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("RelationId")
        public String relationId;

        /**
         * <p>The relation type code.</p>
         * 
         * <strong>example:</strong>
         * <p>BELONG_TO</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The source entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("SourceEntityId")
        public String sourceEntityId;

        /**
         * <p>The target entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abd-xxx</p>
         */
        @NameInMap("TargetEntityId")
        public String targetEntityId;

        public static GetKgNeighborResponseBodyDataEdgeList build(java.util.Map<String, ?> map) throws Exception {
            GetKgNeighborResponseBodyDataEdgeList self = new GetKgNeighborResponseBodyDataEdgeList();
            return TeaModel.build(map, self);
        }

        public GetKgNeighborResponseBodyDataEdgeList setPropertyList(java.util.List<GetKgNeighborResponseBodyDataEdgeListPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<GetKgNeighborResponseBodyDataEdgeListPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public GetKgNeighborResponseBodyDataEdgeList setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public GetKgNeighborResponseBodyDataEdgeList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public GetKgNeighborResponseBodyDataEdgeList setSourceEntityId(String sourceEntityId) {
            this.sourceEntityId = sourceEntityId;
            return this;
        }
        public String getSourceEntityId() {
            return this.sourceEntityId;
        }

        public GetKgNeighborResponseBodyDataEdgeList setTargetEntityId(String targetEntityId) {
            this.targetEntityId = targetEntityId;
            return this;
        }
        public String getTargetEntityId() {
            return this.targetEntityId;
        }

    }

    public static class GetKgNeighborResponseBodyDataNodeListPropertyList extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property data type. Valid values: STRING (string), INTEGER (integer), FLOAT (float), BOOLEAN (Boolean), DATE (date), LIST (list), and others.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetKgNeighborResponseBodyDataNodeListPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetKgNeighborResponseBodyDataNodeListPropertyList self = new GetKgNeighborResponseBodyDataNodeListPropertyList();
            return TeaModel.build(map, self);
        }

        public GetKgNeighborResponseBodyDataNodeListPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetKgNeighborResponseBodyDataNodeListPropertyList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetKgNeighborResponseBodyDataNodeListPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetKgNeighborResponseBodyDataNodeList extends TeaModel {
        /**
         * <p>The entity record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity type code.</p>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The entity record property list.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<GetKgNeighborResponseBodyDataNodeListPropertyList> propertyList;

        public static GetKgNeighborResponseBodyDataNodeList build(java.util.Map<String, ?> map) throws Exception {
            GetKgNeighborResponseBodyDataNodeList self = new GetKgNeighborResponseBodyDataNodeList();
            return TeaModel.build(map, self);
        }

        public GetKgNeighborResponseBodyDataNodeList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetKgNeighborResponseBodyDataNodeList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public GetKgNeighborResponseBodyDataNodeList setPropertyList(java.util.List<GetKgNeighborResponseBodyDataNodeListPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<GetKgNeighborResponseBodyDataNodeListPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

    public static class GetKgNeighborResponseBodyData extends TeaModel {
        /**
         * <p>The edge list.</p>
         */
        @NameInMap("EdgeList")
        public java.util.List<GetKgNeighborResponseBodyDataEdgeList> edgeList;

        /**
         * <p>The node list.</p>
         */
        @NameInMap("NodeList")
        public java.util.List<GetKgNeighborResponseBodyDataNodeList> nodeList;

        public static GetKgNeighborResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKgNeighborResponseBodyData self = new GetKgNeighborResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKgNeighborResponseBodyData setEdgeList(java.util.List<GetKgNeighborResponseBodyDataEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<GetKgNeighborResponseBodyDataEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public GetKgNeighborResponseBodyData setNodeList(java.util.List<GetKgNeighborResponseBodyDataNodeList> nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public java.util.List<GetKgNeighborResponseBodyDataNodeList> getNodeList() {
            return this.nodeList;
        }

    }

}
