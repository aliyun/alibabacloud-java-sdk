// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAppliedAdvicesResponseBody extends TeaModel {
    /**
     * <p>The details.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAppliedAdvicesResponseBodyItems> items;

    /**
     * <p>The page number. The value must be greater than 0 and no more than the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84489769-3065-5A28-A4CB-977CD426F1C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The concatenated string of the database name and table name.</p>
     */
    @NameInMap("SchemaTableNames")
    public java.util.List<String> schemaTableNames;

    /**
     * <p>The total number of returned results. The value must be greater than or equal to 0 and no more than the maximum value of the Integer data type. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAppliedAdvicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppliedAdvicesResponseBody self = new DescribeAppliedAdvicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppliedAdvicesResponseBody setItems(java.util.List<DescribeAppliedAdvicesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAppliedAdvicesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAppliedAdvicesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppliedAdvicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAppliedAdvicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppliedAdvicesResponseBody setSchemaTableNames(java.util.List<String> schemaTableNames) {
        this.schemaTableNames = schemaTableNames;
        return this;
    }
    public java.util.List<String> getSchemaTableNames() {
        return this.schemaTableNames;
    }

    public DescribeAppliedAdvicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppliedAdvicesResponseBodyItems extends TeaModel {
        /**
         * <p>The suggestion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7417db9c-914d-43f3-a123-4d0e448f****</p>
         */
        @NameInMap("AdviceId")
        public String adviceId;

        /**
         * <p>The benefit of the suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>Saves 0.4 GB of storage space</p>
         */
        @NameInMap("Benefit")
        public String benefit;

        /**
         * <p>The SQL statement used to execute the build task.</p>
         * 
         * <strong>example:</strong>
         * <p>build table <code>schema1</code>.<code>table1</code></p>
         */
        @NameInMap("BuildSQL")
        public String buildSQL;

        /**
         * <p>The index fields.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        @NameInMap("IndexFields")
        public String indexFields;

        /**
         * <p>The status of the task that executes the suggestion. Valid values:</p>
         * <ul>
         * <li><strong>SUCCEED</strong>: Succeeded.</li>
         * <li><strong>FAILED</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The page number. The value must be greater than 0 and no more than the maximum value of the Integer data type. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The rollback SQL statement for the suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>alter table <code>schema1</code>.<code>table1</code> add key col1_1_idx(col1)</p>
         */
        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        /**
         * <p>The SQL statement used to apply the suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>alter table <code>schema1</code>.<code>table1</code> drop key col1_1_idx</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The delivery status of the suggestion. Valid values:</p>
         * <ul>
         * <li><strong>SUCCEED</strong>: Succeeded.</li>
         * <li><strong>FAILED</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        @NameInMap("SubmitStatus")
        public String submitStatus;

        /**
         * <p>The time when the suggestion was issued. Format: yyMMddHHmm (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2208131600</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total number of returned results. The value must be greater than or equal to 0 and no more than the maximum value of the Integer data type. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAppliedAdvicesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppliedAdvicesResponseBodyItems self = new DescribeAppliedAdvicesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAppliedAdvicesResponseBodyItems setAdviceId(String adviceId) {
            this.adviceId = adviceId;
            return this;
        }
        public String getAdviceId() {
            return this.adviceId;
        }

        public DescribeAppliedAdvicesResponseBodyItems setBenefit(String benefit) {
            this.benefit = benefit;
            return this;
        }
        public String getBenefit() {
            return this.benefit;
        }

        public DescribeAppliedAdvicesResponseBodyItems setBuildSQL(String buildSQL) {
            this.buildSQL = buildSQL;
            return this;
        }
        public String getBuildSQL() {
            return this.buildSQL;
        }

        public DescribeAppliedAdvicesResponseBodyItems setIndexFields(String indexFields) {
            this.indexFields = indexFields;
            return this;
        }
        public String getIndexFields() {
            return this.indexFields;
        }

        public DescribeAppliedAdvicesResponseBodyItems setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public DescribeAppliedAdvicesResponseBodyItems setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAppliedAdvicesResponseBodyItems setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAppliedAdvicesResponseBodyItems setRollbackSQL(String rollbackSQL) {
            this.rollbackSQL = rollbackSQL;
            return this;
        }
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        public DescribeAppliedAdvicesResponseBodyItems setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeAppliedAdvicesResponseBodyItems setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAppliedAdvicesResponseBodyItems setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public DescribeAppliedAdvicesResponseBodyItems setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public DescribeAppliedAdvicesResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAppliedAdvicesResponseBodyItems setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
