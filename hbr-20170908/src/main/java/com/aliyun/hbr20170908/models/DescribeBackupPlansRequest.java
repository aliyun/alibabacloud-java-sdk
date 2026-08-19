// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupPlansRequest extends TeaModel {
    /**
     * <p>The edition type. Valid values: BASIC and STANDARD. Default value: STANDARD.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The query filters.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeBackupPlansRequestFilters> filters;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Minimum value: 1. Maximum value: 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the data source. Valid values:</p>
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

    public DescribeBackupPlansRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
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
         * <p>The key of the query filter. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>vaultId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values to match in the query filter.</p>
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
