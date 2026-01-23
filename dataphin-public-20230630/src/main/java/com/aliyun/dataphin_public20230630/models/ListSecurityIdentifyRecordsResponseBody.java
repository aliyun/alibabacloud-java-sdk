// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityIdentifyRecordsResponseBody extends TeaModel {
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

    @NameInMap("PageResult")
    public ListSecurityIdentifyRecordsResponseBodyPageResult pageResult;

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

    public static ListSecurityIdentifyRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityIdentifyRecordsResponseBody self = new ListSecurityIdentifyRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityIdentifyRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSecurityIdentifyRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSecurityIdentifyRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecurityIdentifyRecordsResponseBody setPageResult(ListSecurityIdentifyRecordsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListSecurityIdentifyRecordsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListSecurityIdentifyRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityIdentifyRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("ActualIdentifyRate")
        public Double actualIdentifyRate;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>test_abc</p>
         */
        @NameInMap("BizUnitDisplayName")
        public String bizUnitDisplayName;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>1</p>
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
         * <p>ENABLE</p>
         */
        @NameInMap("ClassifyStatus")
        public String classifyStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
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

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IsBetterMatch")
        public Boolean isBetterMatch;

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
         * <p>test_abc</p>
         */
        @NameInMap("ProjectDisplayName")
        public String projectDisplayName;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
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
         * <p>LOGIC_TABLE</p>
         */
        @NameInMap("TableType")
        public String tableType;

        public static ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList self = new ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList();
            return TeaModel.build(map, self);
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setActualIdentifyRate(Double actualIdentifyRate) {
            this.actualIdentifyRate = actualIdentifyRate;
            return this;
        }
        public Double getActualIdentifyRate() {
            return this.actualIdentifyRate;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setBizUnitDisplayName(String bizUnitDisplayName) {
            this.bizUnitDisplayName = bizUnitDisplayName;
            return this;
        }
        public String getBizUnitDisplayName() {
            return this.bizUnitDisplayName;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setClassifyAbbreviation(String classifyAbbreviation) {
            this.classifyAbbreviation = classifyAbbreviation;
            return this;
        }
        public String getClassifyAbbreviation() {
            return this.classifyAbbreviation;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setClassifyId(Long classifyId) {
            this.classifyId = classifyId;
            return this;
        }
        public Long getClassifyId() {
            return this.classifyId;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setClassifyName(String classifyName) {
            this.classifyName = classifyName;
            return this;
        }
        public String getClassifyName() {
            return this.classifyName;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setClassifyStatus(String classifyStatus) {
            this.classifyStatus = classifyStatus;
            return this;
        }
        public String getClassifyStatus() {
            return this.classifyStatus;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setDatasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setFieldDescription(String fieldDescription) {
            this.fieldDescription = fieldDescription;
            return this;
        }
        public String getFieldDescription() {
            return this.fieldDescription;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setFieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }
        public String getFieldId() {
            return this.fieldId;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setIsBetterMatch(Boolean isBetterMatch) {
            this.isBetterMatch = isBetterMatch;
            return this;
        }
        public Boolean getIsBetterMatch() {
            return this.isBetterMatch;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setIsCustomIdentify(Boolean isCustomIdentify) {
            this.isCustomIdentify = isCustomIdentify;
            return this;
        }
        public Boolean getIsCustomIdentify() {
            return this.isCustomIdentify;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setIsLocked(Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Boolean getIsLocked() {
            return this.isLocked;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setLevelAbbreviation(String levelAbbreviation) {
            this.levelAbbreviation = levelAbbreviation;
            return this;
        }
        public String getLevelAbbreviation() {
            return this.levelAbbreviation;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setLevelIndex(Long levelIndex) {
            this.levelIndex = levelIndex;
            return this;
        }
        public Long getLevelIndex() {
            return this.levelIndex;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setProjectDisplayName(String projectDisplayName) {
            this.projectDisplayName = projectDisplayName;
            return this;
        }
        public String getProjectDisplayName() {
            return this.projectDisplayName;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setTableDescription(String tableDescription) {
            this.tableDescription = tableDescription;
            return this;
        }
        public String getTableDescription() {
            return this.tableDescription;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setTableEnv(String tableEnv) {
            this.tableEnv = tableEnv;
            return this;
        }
        public String getTableEnv() {
            return this.tableEnv;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

    }

    public static class ListSecurityIdentifyRecordsResponseBodyPageResult extends TeaModel {
        @NameInMap("IdentifyRecordList")
        public java.util.List<ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList> identifyRecordList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSecurityIdentifyRecordsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityIdentifyRecordsResponseBodyPageResult self = new ListSecurityIdentifyRecordsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResult setIdentifyRecordList(java.util.List<ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList> identifyRecordList) {
            this.identifyRecordList = identifyRecordList;
            return this;
        }
        public java.util.List<ListSecurityIdentifyRecordsResponseBodyPageResultIdentifyRecordList> getIdentifyRecordList() {
            return this.identifyRecordList;
        }

        public ListSecurityIdentifyRecordsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
