// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupPlansRequest extends TeaModel {
    /**
     * <p>The filters.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeBackupPlansRequestFilters> filters;

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
     * <li><strong>NAS</strong>: File Storage NAS (NAS) file systems</li>
     * <li><strong>OTS</strong>: Tablestore instances</li>
     * <li><strong>UDM_ECS</strong>: ECS instances</li>
     * <li><strong>SYNC</strong>: data synchronization</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DescribeBackupPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlansRequest self = new DescribeBackupPlansRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlansRequest setFilters(java.util.List<DescribeBackupPlansRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeBackupPlansRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeBackupPlansRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupPlansRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupPlansRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class DescribeBackupPlansRequestFilters extends TeaModel {
        /**
         * <p>The keys in the filter. Valid values:</p>
         * <ul>
         * <li><strong>regionId</strong>: the ID of a region</li>
         * <li><strong>planId</strong>: the ID of a backup plan</li>
         * <li><strong>sourceType</strong>: the type of a data source</li>
         * <li><strong>vaultId</strong>: the ID of a backup vault</li>
         * <li><strong>instanceName</strong>: the name of an instance</li>
         * <li><strong>instanceId</strong>: the ID of an instance</li>
         * <li><strong>planName</strong>: the name of a backup plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vaultId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values that you want to match in the filter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;v-*********************&quot;]</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeBackupPlansRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansRequestFilters self = new DescribeBackupPlansRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupPlansRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
