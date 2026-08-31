// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecKgGremlinResponseBody extends TeaModel {
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
    public ExecKgGremlinResponseBodyData data;

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

    public static ExecKgGremlinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecKgGremlinResponseBody self = new ExecKgGremlinResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecKgGremlinResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecKgGremlinResponseBody setData(ExecKgGremlinResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecKgGremlinResponseBodyData getData() {
        return this.data;
    }

    public ExecKgGremlinResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecKgGremlinResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecKgGremlinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecKgGremlinResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecKgGremlinResponseBodyDataEdgeListProperties extends TeaModel {
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

        public static ExecKgGremlinResponseBodyDataEdgeListProperties build(java.util.Map<String, ?> map) throws Exception {
            ExecKgGremlinResponseBodyDataEdgeListProperties self = new ExecKgGremlinResponseBodyDataEdgeListProperties();
            return TeaModel.build(map, self);
        }

        public ExecKgGremlinResponseBodyDataEdgeListProperties setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecKgGremlinResponseBodyDataEdgeListProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecKgGremlinResponseBodyDataEdgeList extends TeaModel {
        /**
         * <p>The data ID of the relationship record.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd-1235-xc</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The list of relationship record properties.</p>
         */
        @NameInMap("Properties")
        public java.util.List<ExecKgGremlinResponseBodyDataEdgeListProperties> properties;

        /**
         * <p>The relationship type.</p>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The data ID of the source entity record.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd-1234</p>
         */
        @NameInMap("SourceEntityDataId")
        public String sourceEntityDataId;

        /**
         * <p>The source entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>Shop</p>
         */
        @NameInMap("SourceEntityType")
        public String sourceEntityType;

        /**
         * <p>The data ID of the target entity record.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd-2234</p>
         */
        @NameInMap("TargetEntityDataId")
        public String targetEntityDataId;

        /**
         * <p>The target entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>Product</p>
         */
        @NameInMap("TargetEntityType")
        public String targetEntityType;

        public static ExecKgGremlinResponseBodyDataEdgeList build(java.util.Map<String, ?> map) throws Exception {
            ExecKgGremlinResponseBodyDataEdgeList self = new ExecKgGremlinResponseBodyDataEdgeList();
            return TeaModel.build(map, self);
        }

        public ExecKgGremlinResponseBodyDataEdgeList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ExecKgGremlinResponseBodyDataEdgeList setProperties(java.util.List<ExecKgGremlinResponseBodyDataEdgeListProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<ExecKgGremlinResponseBodyDataEdgeListProperties> getProperties() {
            return this.properties;
        }

        public ExecKgGremlinResponseBodyDataEdgeList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public ExecKgGremlinResponseBodyDataEdgeList setSourceEntityDataId(String sourceEntityDataId) {
            this.sourceEntityDataId = sourceEntityDataId;
            return this;
        }
        public String getSourceEntityDataId() {
            return this.sourceEntityDataId;
        }

        public ExecKgGremlinResponseBodyDataEdgeList setSourceEntityType(String sourceEntityType) {
            this.sourceEntityType = sourceEntityType;
            return this;
        }
        public String getSourceEntityType() {
            return this.sourceEntityType;
        }

        public ExecKgGremlinResponseBodyDataEdgeList setTargetEntityDataId(String targetEntityDataId) {
            this.targetEntityDataId = targetEntityDataId;
            return this;
        }
        public String getTargetEntityDataId() {
            return this.targetEntityDataId;
        }

        public ExecKgGremlinResponseBodyDataEdgeList setTargetEntityType(String targetEntityType) {
            this.targetEntityType = targetEntityType;
            return this;
        }
        public String getTargetEntityType() {
            return this.targetEntityType;
        }

    }

    public static class ExecKgGremlinResponseBodyDataNodeListProperties extends TeaModel {
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

        public static ExecKgGremlinResponseBodyDataNodeListProperties build(java.util.Map<String, ?> map) throws Exception {
            ExecKgGremlinResponseBodyDataNodeListProperties self = new ExecKgGremlinResponseBodyDataNodeListProperties();
            return TeaModel.build(map, self);
        }

        public ExecKgGremlinResponseBodyDataNodeListProperties setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecKgGremlinResponseBodyDataNodeListProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecKgGremlinResponseBodyDataNodeList extends TeaModel {
        /**
         * <p>The data ID of the entity record.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd-1234-xx</p>
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
        public java.util.List<ExecKgGremlinResponseBodyDataNodeListProperties> properties;

        public static ExecKgGremlinResponseBodyDataNodeList build(java.util.Map<String, ?> map) throws Exception {
            ExecKgGremlinResponseBodyDataNodeList self = new ExecKgGremlinResponseBodyDataNodeList();
            return TeaModel.build(map, self);
        }

        public ExecKgGremlinResponseBodyDataNodeList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ExecKgGremlinResponseBodyDataNodeList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ExecKgGremlinResponseBodyDataNodeList setProperties(java.util.List<ExecKgGremlinResponseBodyDataNodeListProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<ExecKgGremlinResponseBodyDataNodeListProperties> getProperties() {
            return this.properties;
        }

    }

    public static class ExecKgGremlinResponseBodyDataRowListColumns extends TeaModel {
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

        public static ExecKgGremlinResponseBodyDataRowListColumns build(java.util.Map<String, ?> map) throws Exception {
            ExecKgGremlinResponseBodyDataRowListColumns self = new ExecKgGremlinResponseBodyDataRowListColumns();
            return TeaModel.build(map, self);
        }

        public ExecKgGremlinResponseBodyDataRowListColumns setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecKgGremlinResponseBodyDataRowListColumns setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecKgGremlinResponseBodyDataRowList extends TeaModel {
        /**
         * <p>The list of columns in the row.</p>
         */
        @NameInMap("Columns")
        public java.util.List<ExecKgGremlinResponseBodyDataRowListColumns> columns;

        public static ExecKgGremlinResponseBodyDataRowList build(java.util.Map<String, ?> map) throws Exception {
            ExecKgGremlinResponseBodyDataRowList self = new ExecKgGremlinResponseBodyDataRowList();
            return TeaModel.build(map, self);
        }

        public ExecKgGremlinResponseBodyDataRowList setColumns(java.util.List<ExecKgGremlinResponseBodyDataRowListColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ExecKgGremlinResponseBodyDataRowListColumns> getColumns() {
            return this.columns;
        }

    }

    public static class ExecKgGremlinResponseBodyData extends TeaModel {
        /**
         * <p>The list of edges.</p>
         */
        @NameInMap("EdgeList")
        public java.util.List<ExecKgGremlinResponseBodyDataEdgeList> edgeList;

        /**
         * <p>The transformed execution statement.</p>
         * 
         * <strong>example:</strong>
         * <p>g.v().limit(100)</p>
         */
        @NameInMap("ExecQuery")
        public String execQuery;

        /**
         * <p>The list of nodes.</p>
         */
        @NameInMap("NodeList")
        public java.util.List<ExecKgGremlinResponseBodyDataNodeList> nodeList;

        /**
         * <p>The list of rows.</p>
         */
        @NameInMap("RowList")
        public java.util.List<ExecKgGremlinResponseBodyDataRowList> rowList;

        public static ExecKgGremlinResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecKgGremlinResponseBodyData self = new ExecKgGremlinResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecKgGremlinResponseBodyData setEdgeList(java.util.List<ExecKgGremlinResponseBodyDataEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<ExecKgGremlinResponseBodyDataEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public ExecKgGremlinResponseBodyData setExecQuery(String execQuery) {
            this.execQuery = execQuery;
            return this;
        }
        public String getExecQuery() {
            return this.execQuery;
        }

        public ExecKgGremlinResponseBodyData setNodeList(java.util.List<ExecKgGremlinResponseBodyDataNodeList> nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public java.util.List<ExecKgGremlinResponseBodyDataNodeList> getNodeList() {
            return this.nodeList;
        }

        public ExecKgGremlinResponseBodyData setRowList(java.util.List<ExecKgGremlinResponseBodyDataRowList> rowList) {
            this.rowList = rowList;
            return this;
        }
        public java.util.List<ExecKgGremlinResponseBodyDataRowList> getRowList() {
            return this.rowList;
        }

    }

}
