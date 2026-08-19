// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupJobs2Request extends TeaModel {
    /**
     * <p>The edition. Valid values: BASIC and STANDARD. The default value is STANDARD.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The key-value pairs of the filter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeBackupJobs2RequestFilters> filters;

    /**
     * <p>The page number. Pages start from page 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li><p><strong>ASCEND</strong>: Ascending order.</p>
     * </li>
     * <li><p><strong>DESCEND</strong> (Default): Descending order.</p>
     * </li>
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
     * <li><p><strong>ECS_FILE</strong>: Backs up Elastic Compute Service (ECS) files.</p>
     * </li>
     * <li><p><strong>OSS</strong>: Backs up Alibaba Cloud Object Storage Service (OSS) buckets.</p>
     * </li>
     * <li><p><strong>NAS</strong>: Backs up Alibaba Cloud Apsara File Storage NAS (NAS) file systems.</p>
     * </li>
     * <li><p><strong>OTS</strong>: Backs up Alibaba Cloud Tablestore instances.</p>
     * </li>
     * <li><p><strong>UDM_ECS</strong>: Backs up entire ECS instances.</p>
     * </li>
     * <li><p><strong>UDM_ECS_DISK</strong>: A sub-task for disk backup in an ECS instance backup job.</p>
     * </li>
     * <li><p><strong>COMMON_NAS</strong>: A generic NAS data source. This includes archive NAS and on-premises NAS data sources. Use the Values parameter of Filters to specify the data source type.</p>
     * </li>
     * <li><p><strong>File</strong>: Backs up on-premises files.</p>
     * </li>
     * <li><p><strong>SYNC</strong>: Data synchronization.</p>
     * </li>
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

    public DescribeBackupJobs2Request setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
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
         * <p>The key of the filter. Valid values:</p>
         * <ul>
         * <li><p><strong>RegionId</strong>: The region ID.</p>
         * </li>
         * <li><p><strong>PlanId</strong>: The backup plan ID.</p>
         * </li>
         * <li><p><strong>JobId</strong>: The backup job ID.</p>
         * </li>
         * <li><p><strong>VaultId</strong>: The repository ID.</p>
         * </li>
         * <li><p><strong>InstanceId</strong>: The ECS instance ID.</p>
         * </li>
         * <li><p><strong>Bucket</strong>: The name of the OSS bucket.</p>
         * </li>
         * <li><p><strong>FileSystemId</strong>: The file system ID.</p>
         * </li>
         * <li><p><strong>Status</strong>: The job status.</p>
         * </li>
         * <li><p><strong>CreatedTime</strong>: The start time of the job.</p>
         * </li>
         * <li><p><strong>CompleteTime</strong>: The end time of the job.</p>
         * </li>
         * <li><p><strong>InstanceName</strong>: The name of the Tablestore instance.</p>
         * </li>
         * <li><p><strong>BackupType</strong>: The backup job. This parameter is required only when SourceType is set to COMMON_NAS.</p>
         * </li>
         * <li><p><strong>ParentId</strong>: The ID of the parent job. This parameter is required when you query sub-tasks. For example, if you set SourceType to UDM_ECS_DISK, you must specify the ID of the UDM_ECS job.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VaultId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching operator. The default value is IN. This parameter specifies the operator to use for matching the Key and Value. Valid values:</p>
         * <ul>
         * <li><p><strong>EQUAL</strong>: Equal to.</p>
         * </li>
         * <li><p><strong>NOT_EQUAL</strong>: Not equal to.</p>
         * </li>
         * <li><p><strong>GREATER_THAN</strong>: Greater than.</p>
         * </li>
         * <li><p><strong>GREATER_THAN_OR_EQUAL</strong>: Greater than or equal to.</p>
         * </li>
         * <li><p><strong>LESS_THAN</strong>: Less than.</p>
         * </li>
         * <li><p><strong>LESS_THAN_OR_EQUAL</strong>: Less than or equal to.</p>
         * </li>
         * <li><p><strong>BETWEEN</strong>: The value is a JSON array in the format of <code>[start,end]</code>.</p>
         * </li>
         * <li><p><strong>IN</strong>: The value is an array.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The IN operator is not supported when you use <strong>CompleteTime</strong> as the key for a query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value of the filter.</p>
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
