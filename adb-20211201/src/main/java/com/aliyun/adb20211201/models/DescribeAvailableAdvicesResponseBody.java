// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAvailableAdvicesResponseBody extends TeaModel {
    /**
     * <p>The details.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAvailableAdvicesResponseBodyItems> items;

    /**
     * <p>The page number. Valid values: greater than 0 and up to the maximum value of the Integer data type. Default value: 1.</p>
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
     * <p>96A55627-28E9-5E47-B8F6-D786BE551349</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The concatenated string of the database name and table name.</p>
     */
    @NameInMap("SchemaTableNames")
    public java.util.List<String> schemaTableNames;

    /**
     * <p>The total number of returned results. Valid values: greater than or equal to 0 and up to the maximum value of the Integer data type. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>10192</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAvailableAdvicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableAdvicesResponseBody self = new DescribeAvailableAdvicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableAdvicesResponseBody setItems(java.util.List<DescribeAvailableAdvicesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAvailableAdvicesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAvailableAdvicesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAvailableAdvicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAvailableAdvicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableAdvicesResponseBody setSchemaTableNames(java.util.List<String> schemaTableNames) {
        this.schemaTableNames = schemaTableNames;
        return this;
    }
    public java.util.List<String> getSchemaTableNames() {
        return this.schemaTableNames;
    }

    public DescribeAvailableAdvicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAvailableAdvicesResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the suggestion was generated, in the yyyyMMdd format.</p>
         * 
         * <strong>example:</strong>
         * <p>20221124</p>
         */
        @NameInMap("AdviceDate")
        public String adviceDate;

        /**
         * <p>The suggestion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dcd04135-0925-4aed-a5a7-e7d92cb1****</p>
         */
        @NameInMap("AdviceId")
        public String adviceId;

        /**
         * <p>The type of the suggestion. Valid values:</p>
         * <ul>
         * <li><strong>INDEX</strong>: Index optimization.</li>
         * <li><strong>TIERING</strong>: Hot and cold data optimization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INDEX</p>
         */
        @NameInMap("AdviceType")
        public String adviceType;

        /**
         * <p>The benefit of the suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>Saves 0.4 GB of storage space</p>
         */
        @NameInMap("Benefit")
        public String benefit;

        /**
         * <p>The index fields.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        @NameInMap("IndexFields")
        public String indexFields;

        /**
         * <p>The page number. Valid values: greater than 0 and up to the maximum value of the Integer data type. Default value: 1.</p>
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
         * <p>The reason for generating optimization suggestions.</p>
         * 
         * <strong>example:</strong>
         * <p>Not used for 15 days, and the historical usage probability is less than 1%</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The SQL statement to apply the suggestion.</p>
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
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total number of returned results. Valid values: greater than or equal to 0 and up to the maximum value of the Integer data type. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10192</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAvailableAdvicesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableAdvicesResponseBodyItems self = new DescribeAvailableAdvicesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableAdvicesResponseBodyItems setAdviceDate(String adviceDate) {
            this.adviceDate = adviceDate;
            return this;
        }
        public String getAdviceDate() {
            return this.adviceDate;
        }

        public DescribeAvailableAdvicesResponseBodyItems setAdviceId(String adviceId) {
            this.adviceId = adviceId;
            return this;
        }
        public String getAdviceId() {
            return this.adviceId;
        }

        public DescribeAvailableAdvicesResponseBodyItems setAdviceType(String adviceType) {
            this.adviceType = adviceType;
            return this;
        }
        public String getAdviceType() {
            return this.adviceType;
        }

        public DescribeAvailableAdvicesResponseBodyItems setBenefit(String benefit) {
            this.benefit = benefit;
            return this;
        }
        public String getBenefit() {
            return this.benefit;
        }

        public DescribeAvailableAdvicesResponseBodyItems setIndexFields(String indexFields) {
            this.indexFields = indexFields;
            return this;
        }
        public String getIndexFields() {
            return this.indexFields;
        }

        public DescribeAvailableAdvicesResponseBodyItems setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAvailableAdvicesResponseBodyItems setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAvailableAdvicesResponseBodyItems setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeAvailableAdvicesResponseBodyItems setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeAvailableAdvicesResponseBodyItems setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAvailableAdvicesResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAvailableAdvicesResponseBodyItems setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
