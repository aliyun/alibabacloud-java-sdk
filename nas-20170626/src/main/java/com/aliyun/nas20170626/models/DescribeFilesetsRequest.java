// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesetsRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>CPFS: Must start with <code>cpfs-</code>, such as cpfs-099394bd928c****.</p>
     * </li>
     * <li><p>CPFS for Lingjun: Must start with <code>bmcpfs-</code>, such as bmcpfs-290w65p03ok64ya****.</p>
     * <blockquote>
     * <p>This operation supports only CPFS file systems (with an ID prefix of cpfs-* or bmcpfs-*). Standard NAS and Extreme NAS file systems are not supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64ya****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The filter conditions for the filesets to query.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeFilesetsRequestFilters> filters;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. If the returned results are truncated, you can use this token to initiate another request to retrieve the remaining results.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort field.</p>
     * <ul>
     * <li>FileCountLimit: The file count limit of the quota.</li>
     * <li>SizeLimit: The capacity limit of the quota.</li>
     * <li>FileCountUsage: The file count usage.</li>
     * <li>SpaceUsage: The capacity usage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FileCountLimit</p>
     */
    @NameInMap("OrderByField")
    public String orderByField;

    /**
     * <p>The sort order.</p>
     * <ul>
     * <li>asc (default): Ascending order. Results are sorted from smallest to largest.</li>
     * <li>desc: Descending order. Results are sorted from largest to smallest.<blockquote>
     * <p>This parameter takes effect only when the OrderByField parameter is specified.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static DescribeFilesetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesetsRequest self = new DescribeFilesetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFilesetsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeFilesetsRequest setFilters(java.util.List<DescribeFilesetsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeFilesetsRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeFilesetsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeFilesetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFilesetsRequest setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public DescribeFilesetsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class DescribeFilesetsRequestFilters extends TeaModel {
        /**
         * <p>The name of the filter key. Valid values:</p>
         * <ul>
         * <li>FsetIds: Filters by fileset ID.</li>
         * <li>FileSystemPath: Filters by the path of the fileset in the CPFS file system.</li>
         * <li>Description: Filters by the description of the fileset.</li>
         * <li>QuotaExists: Filters by whether a quota exists.<blockquote>
         * <p>Only CPFS for Lingjun 2.7.0 and later support filtering by the QuotaExists parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FsetIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter key. This parameter does not support wildcards.</p>
         * <ul>
         * <li>When Key is set to FsetIds, Value is set to the fileset ID. You can specify one or more fileset IDs. You can specify up to 10 fileset IDs. Separate multiple values with commas (,). Example: <code>fset-1902718ea0ae****</code> or <code>fset-1902718ea0ae****,fset-3212718ea0ae****</code>.</li>
         * <li>When Key is set to FileSystemPath, Value is set to the path or a part of the path of the fileset in the CPFS file system. The value must be 2 to 1,024 characters in length and encoded in UTF-8.</li>
         * <li>When Key is set to Description, Value is set to the description or a part of the description of the fileset.</li>
         * <li>When Key is set to QuotaExists, Value is set to true or false. If you do not specify this parameter, all filesets are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFilesetsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesetsRequestFilters self = new DescribeFilesetsRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeFilesetsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFilesetsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
