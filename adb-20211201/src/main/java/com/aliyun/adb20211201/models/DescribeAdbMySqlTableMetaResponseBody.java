// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlTableMetaResponseBody extends TeaModel {
    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>If the request was successful, a success message is returned.****</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The queried table metadata.</p>
     */
    @NameInMap("TableMeta")
    public DescribeAdbMySqlTableMetaResponseBodyTableMeta tableMeta;

    public static DescribeAdbMySqlTableMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlTableMetaResponseBody self = new DescribeAdbMySqlTableMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlTableMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdbMySqlTableMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdbMySqlTableMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAdbMySqlTableMetaResponseBody setTableMeta(DescribeAdbMySqlTableMetaResponseBodyTableMeta tableMeta) {
        this.tableMeta = tableMeta;
        return this;
    }
    public DescribeAdbMySqlTableMetaResponseBodyTableMeta getTableMeta() {
        return this.tableMeta;
    }

    public static class DescribeAdbMySqlTableMetaResponseBodyTableMeta extends TeaModel {
        /**
         * <p>The time when the table was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-14 02:18:08.0</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The distribution key column.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_id</p>
         */
        @NameInMap("DistributeColumn")
        public String distributeColumn;

        /**
         * <p>The distribution type.</p>
         * 
         * <strong>example:</strong>
         * <p>hash</p>
         */
        @NameInMap("DistributeType")
        public String distributeType;

        /**
         * <p>Indicates whether full-column indexes are used.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAllIndex")
        public Boolean isAllIndex;

        /**
         * <p>Indicates whether dictionary encoding is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDictEncode")
        public Boolean isDictEncode;

        /**
         * <p>Indicates whether full-text indexes are used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFullTextDict")
        public Boolean isFullTextDict;

        /**
         * <p>Indicates whether pages are hidden.</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsHidden")
        public Boolean isHidden;

        /**
         * <p>The partition key column.</p>
         * 
         * <strong>example:</strong>
         * <p>DATE_FORMAT(login_time, \&quot;%Y%m%d\&quot;)</p>
         */
        @NameInMap("PartitionColumn")
        public String partitionColumn;

        /**
         * <p>The type of the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("PartitionType")
        public String partitionType;

        /**
         * <p>The primary key column.</p>
         * 
         * <strong>example:</strong>
         * <p>login_time,customer_id,phone_num</p>
         */
        @NameInMap("PrimaryKeyColumn")
        public String primaryKeyColumn;

        /**
         * <p>The table engine.</p>
         * 
         * <strong>example:</strong>
         * <p>XUANWU</p>
         */
        @NameInMap("TableEngine")
        public String tableEngine;

        /**
         * <p>The name of the table.</p>
         * <p>**</p>
         * <hr>
         * 
         * <strong>example:</strong>
         * <p>external_supplier</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The database to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>tpch</p>
         */
        @NameInMap("TableSchema")
        public String tableSchema;

        /**
         * <p>The type of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>fact_table</p>
         */
        @NameInMap("TableType")
        public String tableType;

        /**
         * <p>The time when the table was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-25 02:07:23.0</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeAdbMySqlTableMetaResponseBodyTableMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdbMySqlTableMetaResponseBodyTableMeta self = new DescribeAdbMySqlTableMetaResponseBodyTableMeta();
            return TeaModel.build(map, self);
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setDistributeColumn(String distributeColumn) {
            this.distributeColumn = distributeColumn;
            return this;
        }
        public String getDistributeColumn() {
            return this.distributeColumn;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setDistributeType(String distributeType) {
            this.distributeType = distributeType;
            return this;
        }
        public String getDistributeType() {
            return this.distributeType;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setIsAllIndex(Boolean isAllIndex) {
            this.isAllIndex = isAllIndex;
            return this;
        }
        public Boolean getIsAllIndex() {
            return this.isAllIndex;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setIsDictEncode(Boolean isDictEncode) {
            this.isDictEncode = isDictEncode;
            return this;
        }
        public Boolean getIsDictEncode() {
            return this.isDictEncode;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setIsFullTextDict(Boolean isFullTextDict) {
            this.isFullTextDict = isFullTextDict;
            return this;
        }
        public Boolean getIsFullTextDict() {
            return this.isFullTextDict;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setIsHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            return this;
        }
        public Boolean getIsHidden() {
            return this.isHidden;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setPartitionColumn(String partitionColumn) {
            this.partitionColumn = partitionColumn;
            return this;
        }
        public String getPartitionColumn() {
            return this.partitionColumn;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setPrimaryKeyColumn(String primaryKeyColumn) {
            this.primaryKeyColumn = primaryKeyColumn;
            return this;
        }
        public String getPrimaryKeyColumn() {
            return this.primaryKeyColumn;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setTableEngine(String tableEngine) {
            this.tableEngine = tableEngine;
            return this;
        }
        public String getTableEngine() {
            return this.tableEngine;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setTableSchema(String tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public String getTableSchema() {
            return this.tableSchema;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

        public DescribeAdbMySqlTableMetaResponseBodyTableMeta setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
