// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityIdentifyResultsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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
     * <p>The paging query result.</p>
     */
    @NameInMap("PageResult")
    public ListSecurityIdentifyResultsResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSecurityIdentifyResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityIdentifyResultsResponseBody self = new ListSecurityIdentifyResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityIdentifyResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSecurityIdentifyResultsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSecurityIdentifyResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecurityIdentifyResultsResponseBody setPageResult(ListSecurityIdentifyResultsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListSecurityIdentifyResultsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListSecurityIdentifyResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityIdentifyResultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList extends TeaModel {
        /**
         * <p>The business date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The Chinese name of the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>LD_test</p>
         */
        @NameInMap("BizUnitDisplayName")
        public String bizUnitDisplayName;

        /**
         * <p>The ID of the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The names of the business units.</p>
         * 
         * <strong>example:</strong>
         * <p>LD_test</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <p>The abbreviation of the classification.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClassifyAbbreviation")
        public String classifyAbbreviation;

        /**
         * <p>The ID of the classification.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("ClassifyId")
        public Long classifyId;

        /**
         * <p>The name of the classification.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClassifyName")
        public String classifyName;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 10:30:30</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>101121</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        /**
         * <p>The names of the data sources.</p>
         * 
         * <strong>example:</strong>
         * <p>ds1</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <p>The description of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FieldDescription")
        public String fieldDescription;

        /**
         * <p>The ID of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>t_test.col1</p>
         */
        @NameInMap("FieldId")
        public String fieldId;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>Indicates whether a better match exists.</p>
         */
        @NameInMap("HasBetterRule")
        public Boolean hasBetterRule;

        /**
         * <p>The ID of the identification result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the identification record.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("IdentifyRecordId")
        public Long identifyRecordId;

        /**
         * <p>Indicates whether a custom identification rule is used.</p>
         */
        @NameInMap("IsCustomIdentify")
        public Boolean isCustomIdentify;

        /**
         * <p>Specifies whether the item is locked.</p>
         */
        @NameInMap("IsLocked")
        public Boolean isLocked;

        /**
         * <p>The abbreviation of the classification level.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LevelAbbreviation")
        public String levelAbbreviation;

        /**
         * <p>The color of the classification level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelColor")
        public Long levelColor;

        /**
         * <p>The classification level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelIndex")
        public Long levelIndex;

        /**
         * <p>The name of the classification level.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LevelName")
        public String levelName;

        /**
         * <p>The modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 10:30:30</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The Chinese name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectDisplayName")
        public String projectDisplayName;

        /**
         * <p>The ID of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>101121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The names of the projects.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The ID of the scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ScanTaskId")
        public Long scanTaskId;

        /**
         * <p>The status. Valid values: ENABLE (enabled) and DISABLE (disabled).</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The catalog of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("TableCatalog")
        public String tableCatalog;

        /**
         * <p>The description of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableDescription")
        public String tableDescription;

        /**
         * <p>The environment of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("TableEnv")
        public String tableEnv;

        /**
         * <p>The ID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>t_test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The ID of the table identification task.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TableTaskId")
        public Long tableTaskId;

        /**
         * <p>The table type. Valid values: LOGIC_TABLE (logical table), LOGIC_DIM_TABLE (logical dimension table), LOGIC_FACT_TABLE (logical fact table), LOGIC_SUM_TABLE (logical aggregate table), LOGIC_ODM_SOURCE (source table), LOGIC_LABEL_TABLE (logical tag table), PHYSICAL_TABLE (physical table), and REAL_TIME_LOGIC_TABLE (real-time configured logical table).</p>
         * 
         * <strong>example:</strong>
         * <p>LOGIC_TABLE</p>
         */
        @NameInMap("TableType")
        public String tableType;

        public static ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList self = new ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList();
            return TeaModel.build(map, self);
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setBizUnitDisplayName(String bizUnitDisplayName) {
            this.bizUnitDisplayName = bizUnitDisplayName;
            return this;
        }
        public String getBizUnitDisplayName() {
            return this.bizUnitDisplayName;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setClassifyAbbreviation(String classifyAbbreviation) {
            this.classifyAbbreviation = classifyAbbreviation;
            return this;
        }
        public String getClassifyAbbreviation() {
            return this.classifyAbbreviation;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setClassifyId(Long classifyId) {
            this.classifyId = classifyId;
            return this;
        }
        public Long getClassifyId() {
            return this.classifyId;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setClassifyName(String classifyName) {
            this.classifyName = classifyName;
            return this;
        }
        public String getClassifyName() {
            return this.classifyName;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setDatasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setFieldDescription(String fieldDescription) {
            this.fieldDescription = fieldDescription;
            return this;
        }
        public String getFieldDescription() {
            return this.fieldDescription;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setFieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }
        public String getFieldId() {
            return this.fieldId;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setHasBetterRule(Boolean hasBetterRule) {
            this.hasBetterRule = hasBetterRule;
            return this;
        }
        public Boolean getHasBetterRule() {
            return this.hasBetterRule;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setIdentifyRecordId(Long identifyRecordId) {
            this.identifyRecordId = identifyRecordId;
            return this;
        }
        public Long getIdentifyRecordId() {
            return this.identifyRecordId;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setIsCustomIdentify(Boolean isCustomIdentify) {
            this.isCustomIdentify = isCustomIdentify;
            return this;
        }
        public Boolean getIsCustomIdentify() {
            return this.isCustomIdentify;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setIsLocked(Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Boolean getIsLocked() {
            return this.isLocked;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setLevelAbbreviation(String levelAbbreviation) {
            this.levelAbbreviation = levelAbbreviation;
            return this;
        }
        public String getLevelAbbreviation() {
            return this.levelAbbreviation;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setLevelColor(Long levelColor) {
            this.levelColor = levelColor;
            return this;
        }
        public Long getLevelColor() {
            return this.levelColor;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setLevelIndex(Long levelIndex) {
            this.levelIndex = levelIndex;
            return this;
        }
        public Long getLevelIndex() {
            return this.levelIndex;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setProjectDisplayName(String projectDisplayName) {
            this.projectDisplayName = projectDisplayName;
            return this;
        }
        public String getProjectDisplayName() {
            return this.projectDisplayName;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setScanTaskId(Long scanTaskId) {
            this.scanTaskId = scanTaskId;
            return this;
        }
        public Long getScanTaskId() {
            return this.scanTaskId;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setTableCatalog(String tableCatalog) {
            this.tableCatalog = tableCatalog;
            return this;
        }
        public String getTableCatalog() {
            return this.tableCatalog;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setTableDescription(String tableDescription) {
            this.tableDescription = tableDescription;
            return this;
        }
        public String getTableDescription() {
            return this.tableDescription;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setTableEnv(String tableEnv) {
            this.tableEnv = tableEnv;
            return this;
        }
        public String getTableEnv() {
            return this.tableEnv;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setTableTaskId(Long tableTaskId) {
            this.tableTaskId = tableTaskId;
            return this;
        }
        public Long getTableTaskId() {
            return this.tableTaskId;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

    }

    public static class ListSecurityIdentifyResultsResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paginated list of identification results.</p>
         */
        @NameInMap("SecurityIdentifyResultList")
        public java.util.List<ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList> securityIdentifyResultList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSecurityIdentifyResultsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityIdentifyResultsResponseBodyPageResult self = new ListSecurityIdentifyResultsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListSecurityIdentifyResultsResponseBodyPageResult setSecurityIdentifyResultList(java.util.List<ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList> securityIdentifyResultList) {
            this.securityIdentifyResultList = securityIdentifyResultList;
            return this;
        }
        public java.util.List<ListSecurityIdentifyResultsResponseBodyPageResultSecurityIdentifyResultList> getSecurityIdentifyResultList() {
            return this.securityIdentifyResultList;
        }

        public ListSecurityIdentifyResultsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
