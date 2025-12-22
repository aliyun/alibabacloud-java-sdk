// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesetsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-099394bd928c\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64ya****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The filter that is used to query filesets.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeFilesetsRequestFilters> filters;

    /**
     * <p>The number of results for each query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The condition by which the results are sorted. Valid values:</p>
     * <ul>
     * <li>FileCountLimit: the file quantity quota</li>
     * <li>SizeLimit: the capacity quota</li>
     * <li>FileCountUsage: the usage of the file quantity quota</li>
     * <li>SpaceUsage: the capacity usage</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FileCountLimit</p>
     */
    @NameInMap("OrderByField")
    public String orderByField;

    /**
     * <p>The order in which you want to sort the results. Valid values:</p>
     * <ul>
     * <li>asc (default): ascending order</li>
     * <li>desc: descending order</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only if you specify the OrderByField parameter.</p>
     * </blockquote>
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
         * <p>The filter name. Valid values:</p>
         * <ul>
         * <li>FsetIds: filters filesets by fileset ID.</li>
         * <li>FileSystemPath: filters filesets based on the path of a fileset in a CPFS file system.</li>
         * <li>Description: filters filesets based on the fileset description.</li>
         * <li>QuotaExists: filters filesets based on whether quotas exist.</li>
         * </ul>
         * <blockquote>
         * <p> Only CPFS for LINGJUN V2.7.0 and later support the QuotaExists parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FsetIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value. This parameter does not support wildcards.</p>
         * <ul>
         * <li>If Key is set to FsetIds, set Value to a fileset ID or a part of the fileset ID. You can specify a fileset ID or a group of fileset IDs. You can specify a maximum of 10 fileset IDs. Example: <code>fset-1902718ea0ae****</code> or <code>fset-1902718ea0ae****,fset-3212718ea0ae****</code>.</li>
         * <li>If Key is set to FileSystemPath, set Value to the path or a part of the path of a fileset in a CPFS file system. The value must be 2 to 1024 characters in length. The value must be encoded in UTF-8.</li>
         * <li>If Key is set to Description, set Value to a fileset description or a part of the fileset description.</li>
         * <li>If Key is set to QuotaExists, set Value to true or false. If you do not specify the parameter, all filesets are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****,fset-3212718ea0ae****</p>
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
