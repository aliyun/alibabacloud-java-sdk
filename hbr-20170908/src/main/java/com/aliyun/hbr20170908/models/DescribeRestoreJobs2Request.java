// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobs2Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The keys in the filter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeRestoreJobs2RequestFilters> filters;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: Elastic Compute Service (ECS) files</li>
     * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets</li>
     * <li><strong>NAS</strong>: Apsara File Storage NAS file systems</li>
     * <li><strong>OTS_TABLE</strong>: Tablestore instances</li>
     * <li><strong>UDM_ECS_ROLLBACK</strong>: ECS instances</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    public static DescribeRestoreJobs2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreJobs2Request self = new DescribeRestoreJobs2Request();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreJobs2Request setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
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
         * <ul>
         * <li><strong>RegionId</strong>: the region ID</li>
         * <li><strong>PlanId</strong>: the ID of a backup plan</li>
         * <li><strong>JobId</strong>: the ID of a backup job</li>
         * <li><strong>VaultId</strong>: the ID of a backup vault</li>
         * <li><strong>InstanceId</strong>: the ID of an ECS instance</li>
         * <li><strong>Bucket</strong>: the name of an OSS bucket</li>
         * <li><strong>FileSystemId</strong>: the ID of a file system</li>
         * <li><strong>Status</strong>: the status of a backup job</li>
         * <li><strong>CompleteTime</strong>: the end time of a backup job</li>
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
         * <li><strong>BETWEEN</strong>: specifies a JSON array as a range. The results must fall within the range in the <code>[Minimum value,Maximum value]</code> format.</li>
         * <li><strong>IN</strong>: specifies an array as a collection. The results must fall within the collection.</li>
         * </ul>
         * <blockquote>
         * <p>If you specify the <strong>CompleteTime</strong> parameter as a key to query backup jobs, you cannot use the IN operator to perform a match.</p>
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
