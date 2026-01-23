// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ColumnList")
    public java.util.List<GetTableColumnsResponseBodyColumnList> columnList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
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

    @NameInMap("Success")
    public Boolean success;

    public static GetTableColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnsResponseBody self = new GetTableColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableColumnsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableColumnsResponseBody setColumnList(java.util.List<GetTableColumnsResponseBodyColumnList> columnList) {
        this.columnList = columnList;
        return this;
    }
    public java.util.List<GetTableColumnsResponseBodyColumnList> getColumnList() {
        return this.columnList;
    }

    public GetTableColumnsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTableColumnsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableColumnsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableColumnsResponseBodyColumnList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ClassifyId")
        public Long classifyId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClassifyName")
        public String classifyName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>3301</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>1121.col1</p>
         */
        @NameInMap("Guid")
        public String guid;

        @NameInMap("IsForeignKey")
        public Boolean isForeignKey;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        @NameInMap("IsPrimaryKey")
        public Boolean isPrimaryKey;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <strong>example:</strong>
         * <p>L1</p>
         */
        @NameInMap("LevelAbbreviation")
        public String levelAbbreviation;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Nullable")
        public Boolean nullable;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNumber")
        public Integer seqNumber;

        /**
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <strong>example:</strong>
         * <p>t_test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("VisitCount30d")
        public Long visitCount30d;

        public static GetTableColumnsResponseBodyColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetTableColumnsResponseBodyColumnList self = new GetTableColumnsResponseBodyColumnList();
            return TeaModel.build(map, self);
        }

        public GetTableColumnsResponseBodyColumnList setClassifyId(Long classifyId) {
            this.classifyId = classifyId;
            return this;
        }
        public Long getClassifyId() {
            return this.classifyId;
        }

        public GetTableColumnsResponseBodyColumnList setClassifyName(String classifyName) {
            this.classifyName = classifyName;
            return this;
        }
        public String getClassifyName() {
            return this.classifyName;
        }

        public GetTableColumnsResponseBodyColumnList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableColumnsResponseBodyColumnList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTableColumnsResponseBodyColumnList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetTableColumnsResponseBodyColumnList setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetTableColumnsResponseBodyColumnList setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public GetTableColumnsResponseBodyColumnList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTableColumnsResponseBodyColumnList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetTableColumnsResponseBodyColumnList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTableColumnsResponseBodyColumnList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetTableColumnsResponseBodyColumnList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetTableColumnsResponseBodyColumnList setIsForeignKey(Boolean isForeignKey) {
            this.isForeignKey = isForeignKey;
            return this;
        }
        public Boolean getIsForeignKey() {
            return this.isForeignKey;
        }

        public GetTableColumnsResponseBodyColumnList setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

        public GetTableColumnsResponseBodyColumnList setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public GetTableColumnsResponseBodyColumnList setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetTableColumnsResponseBodyColumnList setLevelAbbreviation(String levelAbbreviation) {
            this.levelAbbreviation = levelAbbreviation;
            return this;
        }
        public String getLevelAbbreviation() {
            return this.levelAbbreviation;
        }

        public GetTableColumnsResponseBodyColumnList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetTableColumnsResponseBodyColumnList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableColumnsResponseBodyColumnList setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public GetTableColumnsResponseBodyColumnList setSeqNumber(Integer seqNumber) {
            this.seqNumber = seqNumber;
            return this;
        }
        public Integer getSeqNumber() {
            return this.seqNumber;
        }

        public GetTableColumnsResponseBodyColumnList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetTableColumnsResponseBodyColumnList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetTableColumnsResponseBodyColumnList setVisitCount30d(Long visitCount30d) {
            this.visitCount30d = visitCount30d;
            return this;
        }
        public Long getVisitCount30d() {
            return this.visitCount30d;
        }

    }

}
