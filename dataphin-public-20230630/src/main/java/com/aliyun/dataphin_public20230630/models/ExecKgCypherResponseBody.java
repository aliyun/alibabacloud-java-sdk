// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecKgCypherResponseBody extends TeaModel {
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
    public ExecKgCypherResponseBodyData data;

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

    public static ExecKgCypherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecKgCypherResponseBody self = new ExecKgCypherResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecKgCypherResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecKgCypherResponseBody setData(ExecKgCypherResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecKgCypherResponseBodyData getData() {
        return this.data;
    }

    public ExecKgCypherResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecKgCypherResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecKgCypherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecKgCypherResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecKgCypherResponseBodyDataEdgeListProperties extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExecKgCypherResponseBodyDataEdgeListProperties build(java.util.Map<String, ?> map) throws Exception {
            ExecKgCypherResponseBodyDataEdgeListProperties self = new ExecKgCypherResponseBodyDataEdgeListProperties();
            return TeaModel.build(map, self);
        }

        public ExecKgCypherResponseBodyDataEdgeListProperties setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecKgCypherResponseBodyDataEdgeListProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecKgCypherResponseBodyDataEdgeList extends TeaModel {
        /**
         * <p>The data ID of the relationship record.</p>
         * 
         * <strong>example:</strong>
         * <p>bcd-456</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The list of relationship record properties.</p>
         */
        @NameInMap("Properties")
        public java.util.List<ExecKgCypherResponseBodyDataEdgeListProperties> properties;

        /**
         * <p>The relationship type.</p>
         * 
         * <strong>example:</strong>
         * <p>SALE</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The data ID of the source entity record.</p>
         * 
         * <strong>example:</strong>
         * <p>source-123</p>
         */
        @NameInMap("SourceEntityDataId")
        public String sourceEntityDataId;

        /**
         * <p>The source entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>Product</p>
         */
        @NameInMap("SourceEntityType")
        public String sourceEntityType;

        /**
         * <p>The data ID of the target entity record.</p>
         * 
         * <strong>example:</strong>
         * <p>target-345</p>
         */
        @NameInMap("TargetEntityDataId")
        public String targetEntityDataId;

        /**
         * <p>The target entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>Shop</p>
         */
        @NameInMap("TargetEntityType")
        public String targetEntityType;

        public static ExecKgCypherResponseBodyDataEdgeList build(java.util.Map<String, ?> map) throws Exception {
            ExecKgCypherResponseBodyDataEdgeList self = new ExecKgCypherResponseBodyDataEdgeList();
            return TeaModel.build(map, self);
        }

        public ExecKgCypherResponseBodyDataEdgeList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ExecKgCypherResponseBodyDataEdgeList setProperties(java.util.List<ExecKgCypherResponseBodyDataEdgeListProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<ExecKgCypherResponseBodyDataEdgeListProperties> getProperties() {
            return this.properties;
        }

        public ExecKgCypherResponseBodyDataEdgeList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public ExecKgCypherResponseBodyDataEdgeList setSourceEntityDataId(String sourceEntityDataId) {
            this.sourceEntityDataId = sourceEntityDataId;
            return this;
        }
        public String getSourceEntityDataId() {
            return this.sourceEntityDataId;
        }

        public ExecKgCypherResponseBodyDataEdgeList setSourceEntityType(String sourceEntityType) {
            this.sourceEntityType = sourceEntityType;
            return this;
        }
        public String getSourceEntityType() {
            return this.sourceEntityType;
        }

        public ExecKgCypherResponseBodyDataEdgeList setTargetEntityDataId(String targetEntityDataId) {
            this.targetEntityDataId = targetEntityDataId;
            return this;
        }
        public String getTargetEntityDataId() {
            return this.targetEntityDataId;
        }

        public ExecKgCypherResponseBodyDataEdgeList setTargetEntityType(String targetEntityType) {
            this.targetEntityType = targetEntityType;
            return this;
        }
        public String getTargetEntityType() {
            return this.targetEntityType;
        }

    }

    public static class ExecKgCypherResponseBodyDataNodeListProperties extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExecKgCypherResponseBodyDataNodeListProperties build(java.util.Map<String, ?> map) throws Exception {
            ExecKgCypherResponseBodyDataNodeListProperties self = new ExecKgCypherResponseBodyDataNodeListProperties();
            return TeaModel.build(map, self);
        }

        public ExecKgCypherResponseBodyDataNodeListProperties setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecKgCypherResponseBodyDataNodeListProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecKgCypherResponseBodyDataNodeList extends TeaModel {
        /**
         * <p>The data ID of the entity record.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-123</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>Product</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The list of entity record properties.</p>
         */
        @NameInMap("Properties")
        public java.util.List<ExecKgCypherResponseBodyDataNodeListProperties> properties;

        public static ExecKgCypherResponseBodyDataNodeList build(java.util.Map<String, ?> map) throws Exception {
            ExecKgCypherResponseBodyDataNodeList self = new ExecKgCypherResponseBodyDataNodeList();
            return TeaModel.build(map, self);
        }

        public ExecKgCypherResponseBodyDataNodeList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ExecKgCypherResponseBodyDataNodeList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ExecKgCypherResponseBodyDataNodeList setProperties(java.util.List<ExecKgCypherResponseBodyDataNodeListProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<ExecKgCypherResponseBodyDataNodeListProperties> getProperties() {
            return this.properties;
        }

    }

    public static class ExecKgCypherResponseBodyDataRowListColumns extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExecKgCypherResponseBodyDataRowListColumns build(java.util.Map<String, ?> map) throws Exception {
            ExecKgCypherResponseBodyDataRowListColumns self = new ExecKgCypherResponseBodyDataRowListColumns();
            return TeaModel.build(map, self);
        }

        public ExecKgCypherResponseBodyDataRowListColumns setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecKgCypherResponseBodyDataRowListColumns setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecKgCypherResponseBodyDataRowList extends TeaModel {
        /**
         * <p>The list of columns in the row.</p>
         */
        @NameInMap("Columns")
        public java.util.List<ExecKgCypherResponseBodyDataRowListColumns> columns;

        public static ExecKgCypherResponseBodyDataRowList build(java.util.Map<String, ?> map) throws Exception {
            ExecKgCypherResponseBodyDataRowList self = new ExecKgCypherResponseBodyDataRowList();
            return TeaModel.build(map, self);
        }

        public ExecKgCypherResponseBodyDataRowList setColumns(java.util.List<ExecKgCypherResponseBodyDataRowListColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ExecKgCypherResponseBodyDataRowListColumns> getColumns() {
            return this.columns;
        }

    }

    public static class ExecKgCypherResponseBodyData extends TeaModel {
        /**
         * <p>The list of edges.</p>
         */
        @NameInMap("EdgeList")
        public java.util.List<ExecKgCypherResponseBodyDataEdgeList> edgeList;

        /**
         * <p>The transformed execution statement.</p>
         * 
         * <strong>example:</strong>
         * <p>MATCH p=()-[:Product]-&gt;() RETURN p, count(*) LIMIT 25</p>
         */
        @NameInMap("ExecuteCypher")
        public String executeCypher;

        /**
         * <p>The list of nodes.</p>
         */
        @NameInMap("NodeList")
        public java.util.List<ExecKgCypherResponseBodyDataNodeList> nodeList;

        /**
         * <p>The list of rows.</p>
         */
        @NameInMap("RowList")
        public java.util.List<ExecKgCypherResponseBodyDataRowList> rowList;

        public static ExecKgCypherResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecKgCypherResponseBodyData self = new ExecKgCypherResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecKgCypherResponseBodyData setEdgeList(java.util.List<ExecKgCypherResponseBodyDataEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<ExecKgCypherResponseBodyDataEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public ExecKgCypherResponseBodyData setExecuteCypher(String executeCypher) {
            this.executeCypher = executeCypher;
            return this;
        }
        public String getExecuteCypher() {
            return this.executeCypher;
        }

        public ExecKgCypherResponseBodyData setNodeList(java.util.List<ExecKgCypherResponseBodyDataNodeList> nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public java.util.List<ExecKgCypherResponseBodyDataNodeList> getNodeList() {
            return this.nodeList;
        }

        public ExecKgCypherResponseBodyData setRowList(java.util.List<ExecKgCypherResponseBodyDataRowList> rowList) {
            this.rowList = rowList;
            return this;
        }
        public java.util.List<ExecKgCypherResponseBodyDataRowList> getRowList() {
            return this.rowList;
        }

    }

}
