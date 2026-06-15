// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowTasksRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>CPFS General-purpose: The ID must start with <code>cpfs-</code>, such as cpfs-099394bd928c\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>CPFS for AI Computing: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-290w65p03ok64ya\<em>\</em>\<em>\</em>.</p>
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
     * <p>A collection of filters.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeDataFlowTasksRequestFilters> filters;

    /**
     * <p>The maximum number of results to return per page.</p>
     * <p>Valid values: 10 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token for the next page of results. If the response is truncated, use this token in your next request to retrieve the subsequent page.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to return report information.</p>
     * <ul>
     * <li><p>True (default): Includes reports in the response.</p>
     * </li>
     * <li><p>False: Excludes reports from the response.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Set this parameter to False to speed up the query.</p>
     * </li>
     * <li><p>This parameter is supported only in CPFS for AI Computing.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("WithReports")
    public Boolean withReports;

    public static DescribeDataFlowTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowTasksRequest self = new DescribeDataFlowTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowTasksRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeDataFlowTasksRequest setFilters(java.util.List<DescribeDataFlowTasksRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeDataFlowTasksRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeDataFlowTasksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDataFlowTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDataFlowTasksRequest setWithReports(Boolean withReports) {
        this.withReports = withReports;
        return this;
    }
    public Boolean getWithReports() {
        return this.withReports;
    }

    public static class DescribeDataFlowTasksRequestFilters extends TeaModel {
        /**
         * <p>The filter key.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>DataFlowIds: Filters by data flow ID.</p>
         * </li>
         * <li><p>TaskIds: Filters by data flow task ID.</p>
         * </li>
         * <li><p>Originator: Filters by originator.</p>
         * </li>
         * <li><p>TaskActions: Filters by data flow task type.</p>
         * </li>
         * <li><p>DataTypes: Filters by data type.</p>
         * </li>
         * <li><p>Status: Filters by status.</p>
         * </li>
         * <li><p>CreateTimeBegin: Filters data flow tasks created after the specified time.</p>
         * </li>
         * <li><p>CreateTimeEnd: Filters data flow tasks created before the specified time.</p>
         * </li>
         * <li><p>StartTimeBegin: Filters data flow tasks that started after the specified time.</p>
         * </li>
         * <li><p>StartTimeEnd: Filters data flow tasks that started before the specified time.</p>
         * </li>
         * <li><p>EndTimeBegin: Filters data flow tasks that ended after the specified time.</p>
         * </li>
         * <li><p>EndTimeEnd: Filters data flow tasks that ended before the specified time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataFlowIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value. This parameter does not support wildcards.</p>
         * <ul>
         * <li><p>When <code>Key</code> is <code>DataFlowIds</code>, specify one or more data flow IDs. You can specify up to 10 data flow IDs, separated by commas. For example, <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>TaskId</code>, specify one or more data flow task IDs. You can specify up to 10 data flow task IDs, separated by commas. For example, <code>task-38aa8e890f45****</code> or <code>task-38aa8e890f45****,task-29ae8e890f45****</code>.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>TaskActions</code>, specify the data flow task type. Valid values are <strong>Import</strong>, <strong>Export</strong>, <strong>Evict</strong>, <strong>Inventory</strong>, <strong>StreamImport</strong>, and <strong>StreamExport</strong>. You can specify multiple values. CPFS for AI Computing supports only Import, Export, StreamImport, and StreamExport. StreamImport and StreamExport are available only in CPFS for AI Computing 2.6.0 and later.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>DataTypes</code>, specify the data type of the data flow task. Valid values are MetaAndData, Metadata, and Data. You can specify multiple values.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>Originator</code>, specify the originator of the data flow task. Valid values are User and System.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>Status</code>, specify the status of the data flow task. Valid values are Pending, Executing, Failed, Completed, Canceling, and Canceled. You can specify multiple values.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>CreateTimeBegin</code>, specify the earliest creation time. Use the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>CreateTimeEnd</code>, specify the latest creation time. Use the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>StartTimeBegin</code>, specify the earliest start time. Use the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>StartTimeEnd</code>, specify the latest start time. Use the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>EndTimeBegin</code>, specify the earliest end time. Use the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
         * </li>
         * <li><p>When <code>Key</code> is <code>EndTimeEnd</code>, specify the latest end time. Use the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>df-194433a5be31****</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDataFlowTasksRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowTasksRequestFilters self = new DescribeDataFlowTasksRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowTasksRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDataFlowTasksRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
