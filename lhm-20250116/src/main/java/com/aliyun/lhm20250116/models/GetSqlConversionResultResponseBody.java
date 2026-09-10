// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlConversionResultResponseBody extends TeaModel {
    /**
     * <p>The data list returned by the operation. For the structure of each element, see the child parameters.</p>
     */
    @NameInMap("data")
    public java.util.List<GetSqlConversionResultResponseBodyData> data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The page size, which is the number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for troubleshooting.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that meet the query conditions. This value is used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static GetSqlConversionResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConversionResultResponseBody self = new GetSqlConversionResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlConversionResultResponseBody setData(java.util.List<GetSqlConversionResultResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSqlConversionResultResponseBodyData> getData() {
        return this.data;
    }

    public GetSqlConversionResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetSqlConversionResultResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetSqlConversionResultResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetSqlConversionResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSqlConversionResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlConversionResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSqlConversionResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetSqlConversionResultResponseBodyDataTableMappingList extends TeaModel {
        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The source type. Valid values: DB and Schema.</p>
         * 
         * <strong>example:</strong>
         * <p>db_demo</p>
         */
        @NameInMap("sourceSchema")
        public String sourceSchema;

        /**
         * <p>The source table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("sourceTableName")
        public String sourceTableName;

        /**
         * <p>The target table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("targetTableName")
        public String targetTableName;

        /**
         * <p>The target type. Valid values: DB and Schema.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <p>The SQL conversion task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("uid")
        public String uid;

        public static GetSqlConversionResultResponseBodyDataTableMappingList build(java.util.Map<String, ?> map) throws Exception {
            GetSqlConversionResultResponseBodyDataTableMappingList self = new GetSqlConversionResultResponseBodyDataTableMappingList();
            return TeaModel.build(map, self);
        }

        public GetSqlConversionResultResponseBodyDataTableMappingList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSqlConversionResultResponseBodyDataTableMappingList setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public GetSqlConversionResultResponseBodyDataTableMappingList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public GetSqlConversionResultResponseBodyDataTableMappingList setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public GetSqlConversionResultResponseBodyDataTableMappingList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetSqlConversionResultResponseBodyDataTableMappingList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetSqlConversionResultResponseBodyDataTableMappingList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetSqlConversionResultResponseBodyDataTableMappingList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class GetSqlConversionResultResponseBodyData extends TeaModel {
        /**
         * <p>The error reason.</p>
         * 
         * <strong>example:</strong>
         * <p>connection timeout</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("finishTime")
        public String finishTime;

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("scriptId")
        public Long scriptId;

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>node_script_demo</p>
         */
        @NameInMap("scriptName")
        public String scriptName;

        /**
         * <p>The script conversion status. In conversion job scenarios: pass for conversion succeeded, turning for converting, and fail for conversion failed. In some scenarios: success for succeeded, failed for failed, and skipped for skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("scriptTransformStatus")
        public String scriptTransformStatus;

        /**
         * <p>The converted script content.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        @NameInMap("sqlResultContent")
        public String sqlResultContent;

        /**
         * <p>The original script content.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        @NameInMap("sqlSourceContent")
        public String sqlSourceContent;

        /**
         * <p>The table name mapping.</p>
         */
        @NameInMap("tableMappingList")
        public java.util.List<GetSqlConversionResultResponseBodyDataTableMappingList> tableMappingList;

        public static GetSqlConversionResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSqlConversionResultResponseBodyData self = new GetSqlConversionResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSqlConversionResultResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetSqlConversionResultResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetSqlConversionResultResponseBodyData setScriptId(Long scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public Long getScriptId() {
            return this.scriptId;
        }

        public GetSqlConversionResultResponseBodyData setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public GetSqlConversionResultResponseBodyData setScriptTransformStatus(String scriptTransformStatus) {
            this.scriptTransformStatus = scriptTransformStatus;
            return this;
        }
        public String getScriptTransformStatus() {
            return this.scriptTransformStatus;
        }

        public GetSqlConversionResultResponseBodyData setSqlResultContent(String sqlResultContent) {
            this.sqlResultContent = sqlResultContent;
            return this;
        }
        public String getSqlResultContent() {
            return this.sqlResultContent;
        }

        public GetSqlConversionResultResponseBodyData setSqlSourceContent(String sqlSourceContent) {
            this.sqlSourceContent = sqlSourceContent;
            return this;
        }
        public String getSqlSourceContent() {
            return this.sqlSourceContent;
        }

        public GetSqlConversionResultResponseBodyData setTableMappingList(java.util.List<GetSqlConversionResultResponseBodyDataTableMappingList> tableMappingList) {
            this.tableMappingList = tableMappingList;
            return this;
        }
        public java.util.List<GetSqlConversionResultResponseBodyDataTableMappingList> getTableMappingList() {
            return this.tableMappingList;
        }

    }

}
