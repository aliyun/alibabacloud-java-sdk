// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupJobs2Request extends TeaModel {
    /**
     * <p>The keys that you want to match in the filter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeBackupJobs2RequestFilters> filters;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The order in which you want to sort the results. Valid values:</p>
     * <ul>
     * <li><strong>ASCEND</strong>: sorts the results in ascending order</li>
     * <li><strong>DESCEND</strong> (default value): sorts the results in descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESCEND</p>
     */
    @NameInMap("SortDirection")
    public String sortDirection;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: Elastic Compute Service (ECS) files</li>
     * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets</li>
     * <li><strong>NAS</strong>: Apsara File Storage NAS file systems</li>
     * <li><strong>OTS</strong>: Tablestore instances</li>
     * <li><strong>UDM_ECS</strong>: ECS instances</li>
     * <li><strong>UDM_ECS_DISK</strong>: ECS disks</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
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
         * <p>The keys in the filter. Valid values:</p>
         * <ul>
         * <li><strong>RegionId</strong>: the ID of a region</li>
         * <li><strong>PlanId</strong>: the ID of a backup plan</li>
         * <li><strong>JobId</strong>: the ID of a backup job</li>
         * <li><strong>VaultId</strong>: the ID of a backup vault</li>
         * <li><strong>InstanceId</strong>: the ID of an ECS instance</li>
         * <li><strong>Bucket</strong>: the name of an OSS bucket</li>
         * <li><strong>FileSystemId</strong>: the ID of a file system</li>
         * <li><strong>Status</strong>: the status of a backup job</li>
         * <li><strong>CreatedTime</strong>: the start time of a backup job</li>
         * <li><strong>CompleteTime</strong>: the end time of a backup job</li>
         * <li><strong>instanceName</strong>: the name of a Tablestore instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VaultId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching method. Default value: IN. This parameter specifies the operator that you want to use to match a key and a value in the filter. Valid values:</p>
         * <ul>
         * <li><strong>EQUAL</strong>: equal to</li>
         * <li><strong>NOT_EQUAL</strong>: not equal to</li>
         * <li><strong>GREATER_THAN</strong>: greater than</li>
         * <li><strong>GREATER_THAN_OR_EQUAL</strong>: greater than or equal to</li>
         * <li><strong>LESS_THAN</strong>: less than</li>
         * <li><strong>LESS_THAN_OR_EQUAL</strong>: less than or equal to</li>
         * <li><strong>BETWEEN</strong>: specifies a JSON array as a range. The results must fall within the range in the <code>[Minimum value,maximum value]</code> format.</li>
         * <li><strong>IN</strong>: specifies an array as a collection. The results must fall within the collection.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify <strong>CompleteTime</strong> as a key to query backup jobs, you cannot use the IN operator to perform a match.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The values that you want to match in the filter.</p>
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
