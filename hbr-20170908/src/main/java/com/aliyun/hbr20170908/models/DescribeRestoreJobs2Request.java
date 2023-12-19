// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobs2Request extends TeaModel {
    /**
     * <p>The keys in the filter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeRestoreJobs2RequestFilters> filters;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: Elastic Compute Service (ECS) files</p>
     * <p>*   **OSS**: Object Storage Service (OSS) buckets</p>
     * <p>*   **NAS**: Apsara File Storage NAS file systems</p>
     * <p>*   **OTS_TABLE**: Tablestore instances</p>
     * <p>*   **UDM_ECS_ROLLBACK**: ECS instances</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    public static DescribeRestoreJobs2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreJobs2Request self = new DescribeRestoreJobs2Request();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreJobs2Request setFilters(java.util.List<DescribeRestoreJobs2RequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeRestoreJobs2RequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeRestoreJobs2Request setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRestoreJobs2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreJobs2Request setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public static class DescribeRestoreJobs2RequestFilters extends TeaModel {
        /**
         * <p>The key in the filter. Valid values:</p>
         * <br>
         * <p>*   **RegionId**: the region ID</p>
         * <p>*   **PlanId**: the ID of a backup plan</p>
         * <p>*   **JobId**: the ID of a backup job</p>
         * <p>*   **VaultId**: the ID of a backup vault</p>
         * <p>*   **InstanceId**: the ID of an ECS instance</p>
         * <p>*   **Bucket**: the name of an OSS bucket</p>
         * <p>*   **FileSystemId**: the ID of a file system</p>
         * <p>*   **Status**: the status of a backup job</p>
         * <p>*   **CompleteTime**: the end time of a backup job</p>
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
         * <p>The values that you want to match in the filter.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeRestoreJobs2RequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreJobs2RequestFilters self = new DescribeRestoreJobs2RequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreJobs2RequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRestoreJobs2RequestFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeRestoreJobs2RequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
