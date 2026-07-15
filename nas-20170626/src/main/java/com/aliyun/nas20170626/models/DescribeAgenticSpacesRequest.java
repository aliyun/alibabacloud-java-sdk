// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAgenticSpacesRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The collection of filter key information.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeAgenticSpacesRequestFilters> filters;

    /**
     * <p>The number of results per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The query token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>MTc3OTkzNTA0Mjg0NTc1MDI4OCM0MDQ0MzA****=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeAgenticSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticSpacesRequest self = new DescribeAgenticSpacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticSpacesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeAgenticSpacesRequest setFilters(java.util.List<DescribeAgenticSpacesRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeAgenticSpacesRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeAgenticSpacesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeAgenticSpacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class DescribeAgenticSpacesRequestFilters extends TeaModel {
        /**
         * <p>The name of the filter key. Valid values:</p>
         * <ul>
         * <li>AgenticSpaceIds</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AgenticSpaceIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter key. Wildcards are not supported.</p>
         * <ul>
         * <li>AgenticSpaceIds: only a single ID is supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>06229oypxjgox0u****</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAgenticSpacesRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticSpacesRequestFilters self = new DescribeAgenticSpacesRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticSpacesRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAgenticSpacesRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
