// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupPlansRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeBackupPlansRequestFilters> filters;

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
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: Elastic Compute Service (ECS) files</p>
     * <p>*   **OSS**: Object Storage Service (OSS) buckets</p>
     * <p>*   **NAS**: Apsara File Storage NAS file systems</p>
     * <p>*   **OTS**: Tablestore instances</p>
     * <p>*   **UDM_ECS**: ECS instances</p>
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
         * <br>
         * <p>*   **regionId**: the ID of a region</p>
         * <p>*   **planId**: the ID of a backup plan</p>
         * <p>*   **sourceType**: the type of a data source</p>
         * <p>*   **vaultId**: the ID of a backup vault</p>
         * <p>*   **instanceName**: the name of an instance</p>
         * <p>*   **instanceId**: the ID of an instance</p>
         * <p>*   **planName**: the name of a backup plan</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values that you want to match in the filter.</p>
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
