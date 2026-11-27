// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowTasksRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>General-purpose CPFS: must start with <code>cpfs-</code>, for example, cpfs-099394bd928c****.</p>
     * </li>
     * <li><p>CPFS for Lingjun: must start with <code>bmcpfs-</code>, for example, bmcpfs-290w65p03ok64ya****.</p>
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
     * <p>The collection of filter keys.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeDataFlowTasksRequestFilters> filters;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <p>Valid values: 10 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The next token. If the returned results of a request are truncated, you can use NextToken to initiate another request and obtain the remaining results.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to query report information.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>True: Queries reports. This is the default value.</li>
     * <li>False: Does not query reports.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Setting this parameter to false can accelerate the query speed.</li>
     * <li>Only CPFS for Lingjun supports this parameter.</li>
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
         * <p>The name of the filter key.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DataFlowIds: Filters by data flow ID.</li>
         * <li>TaskIds: Filters by data flow task ID.</li>
         * <li>Originator: Filters by the originator of the data flow task.</li>
         * <li>TaskActions: Filters by the type of the data flow task.</li>
         * <li>DataTypes: Filters by the data type of the data flow task.</li>
         * <li>Status: Filters by the data flow status.</li>
         * <li>CreateTimeBegin: Filters data flow tasks created after a specified time.</li>
         * <li>CreateTimeEnd: Filters data flow tasks created before a specified time.</li>
         * <li>StartTimeBegin: Filters data flow tasks started after a specified time.</li>
         * <li>StartTimeEnd: Filters data flow tasks started before a specified time.</li>
         * <li>EndTimeBegin: Filters data flow tasks ended after a specified time.</li>
         * <li>EndTimeEnd: Filters data flow tasks ended before a specified time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataFlowIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter key. This parameter does not support wildcards.</p>
         * <ul>
         * <li>When Key is set to DataFlowIds, Value is set to the data flow ID or a part of the data flow ID. It can be a single DataFlowId or a list of DataFlowIds. You can specify up to 10 data flow IDs. Example: <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</li>
         * <li>When Key is set to TaskIds, Value is set to the data flow task ID or a part of the data flow task ID. It can be a single task ID or a list of task IDs. You can specify up to 10 data flow task IDs. Example: <code>task-38aa8e890f45****</code> or <code>task-38aa8e890f45****,task-29ae8e890f45****</code>.</li>
         * <li>When Key is set to TaskActions, Value is set to the task type of the data flow. Valid values: <strong>Import</strong>, <strong>Export</strong>, <strong>Evict</strong>, <strong>Inventory</strong>, <strong>StreamImport</strong>, and <strong>StreamExport</strong>. Combined queries are supported. Currently, CPFS for Lingjun only supports Import, Export, StreamImport, and StreamExport. StreamImport and StreamExport are supported only in CPFS for Lingjun 2.6.0 and later.</li>
         * <li>When Key is set to DataTypes, Value is set to the data type of the data flow task. Valid values: MetaAndData, Metadata, and Data. Combined queries are supported.</li>
         * <li>When Key is set to Originator, Value is set to the originator of the data flow task. Valid values: User and System.</li>
         * <li>When Key is set to Status, Value is set to the status of the data flow task. Valid values: Pending, Executing, Failed, Completed, Canceling, and Canceled. Combined queries are supported.</li>
         * <li>When Key is set to CreateTimeBegin, Value is set to the minimum creation time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>When Key is set to CreateTimeEnd, Value is set to the maximum creation time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>When Key is set to StartTimeBegin, Value is set to the minimum start time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>When Key is set to StartTimeEnd, Value is set to the maximum start time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>When Key is set to EndTimeBegin, Value is set to the minimum end time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>When Key is set to EndTimeEnd, Value is set to the maximum end time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
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
