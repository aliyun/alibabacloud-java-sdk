// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupJobs2Request extends TeaModel {
    /**
     * <p>The keys in the filter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeBackupJobs2RequestFilters> filters;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The order in which you want to sort the results. Valid values:</p>
     * <br>
     * <p>*   **ASCEND**: sorts the results in ascending order</p>
     * <p>*   **DESCEND** (default value): sorts the results in descending order</p>
     */
    @NameInMap("SortDirection")
    public String sortDirection;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: Elastic Compute Service (ECS) files</p>
     * <p>*   **OSS**: Object Storage Service (OSS) buckets</p>
     * <p>*   **NAS**: Apsara File Storage NAS file systems</p>
     * <p>*   **OTS**: Tablestore instances</p>
     * <p>*   **UDM_ECS**: ECS instances</p>
     * <p>*   **UDM_ECS_DISK**: ECS disks</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DescribeBackupJobs2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupJobs2Request self = new DescribeBackupJobs2Request();
        return TeaModel.build(map, self);
    }

    public DescribeBackupJobs2Request setFilters(java.util.List<DescribeBackupJobs2RequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeBackupJobs2RequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeBackupJobs2Request setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupJobs2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupJobs2Request setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

    public DescribeBackupJobs2Request setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class DescribeBackupJobs2RequestFilters extends TeaModel {
        /**
         * <p>The key in the filter. Valid values:</p>
         * <br>
         * <p>*   **RegionId**: the ID of a region</p>
         * <p>*   **PlanId**: the ID of a backup plan</p>
         * <p>*   **JobId**: the ID of a backup job</p>
         * <p>*   **VaultId**: the ID of a backup vault</p>
         * <p>*   **InstanceId**: the ID of an ECS instance</p>
         * <p>*   **Bucket**: the name of an OSS bucket</p>
         * <p>*   **FileSystemId**: the ID of a file system</p>
         * <p>*   **Status**: the status of a backup job</p>
         * <p>*   **CreatedTime**: the start time of a backup job</p>
         * <p>*   **CompleteTime**: the end time of a backup job</p>
         * <p>*   **InstanceName**: the name of a Tablestore instance</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching method. Default value: IN. This parameter specifies the operator that you want to use to match a key and a value in the filter. Valid values:</p>
         * <br>
         * <p>*   **EQUAL**: equal to</p>
         * <p>*   **NOT_EQUAL**: not equal to</p>
         * <p>*   **GREATER_THAN**: greater than</p>
         * <p>*   **GREATER_THAN_OR_EQUAL**: greater than or equal to</p>
         * <p>*   **LESS_THAN**: less than</p>
         * <p>*   **LESS_THAN_OR_EQUAL**: less than or equal to</p>
         * <p>*   **BETWEEN**: specifies a JSON array as a range. The results must fall within the range in the `[Minimum value,Maximum value]` format.</p>
         * <p>*   **IN**: specifies an array as a collection. The results must fall within the collection.</p>
         * <br>
         * <p>> If you specify the **CompleteTime** parameter as a key to query backup jobs, you cannot use the IN operator to perform a match.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The variable values of the filter.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeBackupJobs2RequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupJobs2RequestFilters self = new DescribeBackupJobs2RequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeBackupJobs2RequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupJobs2RequestFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeBackupJobs2RequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
