// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDataBloatResponseBody extends TeaModel {
    /**
     * <p>Details of data bloat.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceDataBloatResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDBInstanceDataBloatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDataBloatResponseBody self = new DescribeDBInstanceDataBloatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDataBloatResponseBody setItems(java.util.List<DescribeDBInstanceDataBloatResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBInstanceDataBloatResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBInstanceDataBloatResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceDataBloatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceDataBloatResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBInstanceDataBloatResponseBodyItems extends TeaModel {
        /**
         * <p>The coefficient of data bloat. It is calculated by using the following formula:</p>
         * <p>Bloat coefficient = Number of dead rows/Number of active rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1.03</p>
         */
        @NameInMap("BloatCeoff")
        public String bloatCeoff;

        /**
         * <p>The bloat size of the table. It indicates the amount of space that can be released.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2MB</p>
         */
        @NameInMap("BloatSize")
        public String bloatSize;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adbtest</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The expected size of the table.</p>
         * <p>It indicates the size of the table that has no data bloat.</p>
         * 
         * <strong>example:</strong>
         * <p>1MB</p>
         */
        @NameInMap("ExpectTableSize")
        public String expectTableSize;

        /**
         * <p>The actual size of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2MB</p>
         */
        @NameInMap("RealTableSize")
        public String realTableSize;

        /**
         * <p>The name of the schema.</p>
         * 
         * <strong>example:</strong>
         * <p>schema1</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The storage type of the table. Valid values:</p>
         * <ul>
         * <li><strong>Heap Table</strong></li>
         * <li><strong>Append-Only Heap Table</strong></li>
         * <li><strong>Append-Only Columnar Table</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Heap Table</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>This parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("SuggestedAction")
        public String suggestedAction;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>tab1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The time when the table was last deleted, inserted, or updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-08T20:00:00Z</p>
         */
        @NameInMap("TimeLastUpdated")
        public String timeLastUpdated;

        /**
         * <p>The time when the table was last vacuumed. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-08T16:00:00Z</p>
         */
        @NameInMap("TimeLastVacuumed")
        public String timeLastVacuumed;

        public static DescribeDBInstanceDataBloatResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceDataBloatResponseBodyItems self = new DescribeDBInstanceDataBloatResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setBloatCeoff(String bloatCeoff) {
            this.bloatCeoff = bloatCeoff;
            return this;
        }
        public String getBloatCeoff() {
            return this.bloatCeoff;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setBloatSize(String bloatSize) {
            this.bloatSize = bloatSize;
            return this;
        }
        public String getBloatSize() {
            return this.bloatSize;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setExpectTableSize(String expectTableSize) {
            this.expectTableSize = expectTableSize;
            return this;
        }
        public String getExpectTableSize() {
            return this.expectTableSize;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setRealTableSize(String realTableSize) {
            this.realTableSize = realTableSize;
            return this;
        }
        public String getRealTableSize() {
            return this.realTableSize;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setSuggestedAction(String suggestedAction) {
            this.suggestedAction = suggestedAction;
            return this;
        }
        public String getSuggestedAction() {
            return this.suggestedAction;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setTimeLastUpdated(String timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            return this;
        }
        public String getTimeLastUpdated() {
            return this.timeLastUpdated;
        }

        public DescribeDBInstanceDataBloatResponseBodyItems setTimeLastVacuumed(String timeLastVacuumed) {
            this.timeLastVacuumed = timeLastVacuumed;
            return this;
        }
        public String getTimeLastVacuumed() {
            return this.timeLastVacuumed;
        }

    }

}
