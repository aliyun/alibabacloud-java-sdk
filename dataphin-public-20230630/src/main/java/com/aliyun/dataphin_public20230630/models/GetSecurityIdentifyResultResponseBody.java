// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSecurityIdentifyResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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

    @NameInMap("SecurityIdentifyResultInfo")
    public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo securityIdentifyResultInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetSecurityIdentifyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityIdentifyResultResponseBody self = new GetSecurityIdentifyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityIdentifyResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecurityIdentifyResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSecurityIdentifyResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecurityIdentifyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityIdentifyResultResponseBody setSecurityIdentifyResultInfo(GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo securityIdentifyResultInfo) {
        this.securityIdentifyResultInfo = securityIdentifyResultInfo;
        return this;
    }
    public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo getSecurityIdentifyResultInfo() {
        return this.securityIdentifyResultInfo;
    }

    public GetSecurityIdentifyResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>LD_test</p>
         */
        @NameInMap("BizUnitDisplayName")
        public String bizUnitDisplayName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>LD_test</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClassifyAbbreviation")
        public String classifyAbbreviation;

        /**
         * <strong>example:</strong>
         * <p>33</p>
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
         * <p>2025-06-30 10:30:30</p>
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
         * <p>101121</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        /**
         * <strong>example:</strong>
         * <p>ds1</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FieldDescription")
        public String fieldDescription;

        /**
         * <strong>example:</strong>
         * <p>t_test.col1</p>
         */
        @NameInMap("FieldId")
        public String fieldId;

        /**
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("HasBetterRule")
        public Boolean hasBetterRule;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("IdentifyRecordId")
        public Long identifyRecordId;

        @NameInMap("IsCustomIdentify")
        public Boolean isCustomIdentify;

        @NameInMap("IsLocked")
        public Boolean isLocked;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LevelAbbreviation")
        public String levelAbbreviation;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelColor")
        public Long levelColor;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelIndex")
        public Long levelIndex;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LevelName")
        public String levelName;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 10:30:30</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectDisplayName")
        public String projectDisplayName;

        /**
         * <strong>example:</strong>
         * <p>101121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ScanTaskId")
        public Long scanTaskId;

        /**
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("TableCatalog")
        public String tableCatalog;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableDescription")
        public String tableDescription;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("TableEnv")
        public String tableEnv;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <strong>example:</strong>
         * <p>t_test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TableTaskId")
        public Long tableTaskId;

        /**
         * <strong>example:</strong>
         * <p>LOGIC_TABLE</p>
         */
        @NameInMap("TableType")
        public String tableType;

        public static GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo self = new GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo();
            return TeaModel.build(map, self);
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setBizUnitDisplayName(String bizUnitDisplayName) {
            this.bizUnitDisplayName = bizUnitDisplayName;
            return this;
        }
        public String getBizUnitDisplayName() {
            return this.bizUnitDisplayName;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setClassifyAbbreviation(String classifyAbbreviation) {
            this.classifyAbbreviation = classifyAbbreviation;
            return this;
        }
        public String getClassifyAbbreviation() {
            return this.classifyAbbreviation;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setClassifyId(Long classifyId) {
            this.classifyId = classifyId;
            return this;
        }
        public Long getClassifyId() {
            return this.classifyId;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setClassifyName(String classifyName) {
            this.classifyName = classifyName;
            return this;
        }
        public String getClassifyName() {
            return this.classifyName;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setDatasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setFieldDescription(String fieldDescription) {
            this.fieldDescription = fieldDescription;
            return this;
        }
        public String getFieldDescription() {
            return this.fieldDescription;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setFieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }
        public String getFieldId() {
            return this.fieldId;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setHasBetterRule(Boolean hasBetterRule) {
            this.hasBetterRule = hasBetterRule;
            return this;
        }
        public Boolean getHasBetterRule() {
            return this.hasBetterRule;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setIdentifyRecordId(Long identifyRecordId) {
            this.identifyRecordId = identifyRecordId;
            return this;
        }
        public Long getIdentifyRecordId() {
            return this.identifyRecordId;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setIsCustomIdentify(Boolean isCustomIdentify) {
            this.isCustomIdentify = isCustomIdentify;
            return this;
        }
        public Boolean getIsCustomIdentify() {
            return this.isCustomIdentify;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setIsLocked(Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Boolean getIsLocked() {
            return this.isLocked;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setLevelAbbreviation(String levelAbbreviation) {
            this.levelAbbreviation = levelAbbreviation;
            return this;
        }
        public String getLevelAbbreviation() {
            return this.levelAbbreviation;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setLevelColor(Long levelColor) {
            this.levelColor = levelColor;
            return this;
        }
        public Long getLevelColor() {
            return this.levelColor;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setLevelIndex(Long levelIndex) {
            this.levelIndex = levelIndex;
            return this;
        }
        public Long getLevelIndex() {
            return this.levelIndex;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setProjectDisplayName(String projectDisplayName) {
            this.projectDisplayName = projectDisplayName;
            return this;
        }
        public String getProjectDisplayName() {
            return this.projectDisplayName;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setScanTaskId(Long scanTaskId) {
            this.scanTaskId = scanTaskId;
            return this;
        }
        public Long getScanTaskId() {
            return this.scanTaskId;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setTableCatalog(String tableCatalog) {
            this.tableCatalog = tableCatalog;
            return this;
        }
        public String getTableCatalog() {
            return this.tableCatalog;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setTableDescription(String tableDescription) {
            this.tableDescription = tableDescription;
            return this;
        }
        public String getTableDescription() {
            return this.tableDescription;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setTableEnv(String tableEnv) {
            this.tableEnv = tableEnv;
            return this;
        }
        public String getTableEnv() {
            return this.tableEnv;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setTableTaskId(Long tableTaskId) {
            this.tableTaskId = tableTaskId;
            return this;
        }
        public Long getTableTaskId() {
            return this.tableTaskId;
        }

        public GetSecurityIdentifyResultResponseBodySecurityIdentifyResultInfo setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

    }

}
