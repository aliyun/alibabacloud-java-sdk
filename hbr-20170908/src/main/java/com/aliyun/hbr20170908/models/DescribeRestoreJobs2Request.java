// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobs2Request extends TeaModel {
    /**
     * <p>The edition. Valid values: <code>BASIC</code> and <code>STANDARD</code>. Default value: <code>STANDARD</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeRestoreJobs2RequestFilters> filters;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
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
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li><p><strong>ECS_FILE</strong>: Restores ECS files.</p>
     * </li>
     * <li><p><strong>OSS</strong>: Restores OSS objects.</p>
     * </li>
     * <li><p><strong>NAS</strong>: Restores NAS files.</p>
     * </li>
     * <li><p><strong>COMMON_FILE_SYSTEM</strong>: Restores data to a CPFS file system.</p>
     * </li>
     * <li><p><strong>OTS_TABLE</strong>: Restores an OTS table.</p>
     * </li>
     * <li><p><strong>UDM_ECS_ROLLBACK</strong>: Restores an entire ECS instance.</p>
     * </li>
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
         * <p>The filter key. Valid values:</p>
         * <ul>
         * <li><p><strong>RegionId</strong>: region ID</p>
         * </li>
         * <li><p><strong>PlanId</strong>: backup plan ID</p>
         * </li>
         * <li><p><strong>JobId</strong>: backup job ID</p>
         * </li>
         * <li><p><strong>VaultId</strong>: vault ID</p>
         * </li>
         * <li><p><strong>InstanceId</strong>: ECS instance ID</p>
         * </li>
         * <li><p><strong>Bucket</strong>: OSS bucket name</p>
         * </li>
         * <li><p><strong>FileSystemId</strong>: file system ID</p>
         * </li>
         * <li><p><strong>Status</strong>: job status</p>
         * </li>
         * <li><p><strong>CompleteTime</strong>: completion time</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VaultId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching method. The default value is IN. Valid values:</p>
         * <ul>
         * <li><p><strong>EQUAL</strong>: Equal to</p>
         * </li>
         * <li><p><strong>NOT_EQUAL</strong>: Not equal to</p>
         * </li>
         * <li><p><strong>GREATER_THAN</strong>: Greater than</p>
         * </li>
         * <li><p><strong>GREATER_THAN_OR_EQUAL</strong>: Greater than or equal to</p>
         * </li>
         * <li><p><strong>LESS_THAN</strong>: Less than</p>
         * </li>
         * <li><p><strong>LESS_THAN_OR_EQUAL</strong>: Less than or equal to</p>
         * </li>
         * <li><p><strong>BETWEEN</strong>: The value is within a specified range. The <code>Values</code> parameter must be a JSON array in the <code>[min, max]</code> format.</p>
         * </li>
         * <li><p><strong>IN</strong>: The value is in a specified set. The <code>Values</code> parameter must be an array.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The IN operator is not supported when <code>Key</code> is <strong>CompleteTime</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>An array of values for the specified filter key.</p>
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
