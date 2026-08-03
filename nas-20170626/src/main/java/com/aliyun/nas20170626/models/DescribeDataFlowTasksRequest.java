// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowTasksRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>General-purpose CPFS: must start with <code>cpfs-</code>, such as cpfs-099394bd928c****.</p>
     * </li>
     * <li><p>CPFS for Lingjun: must start with <code>bmcpfs-</code>, such as bmcpfs-290w65p03ok64ya****.</p>
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
     * <p>The filter conditions.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeDataFlowTasksRequestFilters> filters;

    /**
     * <p>The number of results for each query.</p>
     * <p>Valid values: 10 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the return results are truncated, you can use NextToken to initiate a new request to retrieve the content after the truncation point.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to query report information.</p>
     * <ul>
     * <li>True (default): queries reports.</li>
     * <li>False: does not query reports.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Setting this parameter to False can speed up queries.</li>
     * <li>Only CPFS for Lingjun is supported.</li>
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
         * <li>DataFlowIds: filters by data flow ID.</li>
         * <li>TaskIds: filters by data flow task ID.</li>
         * <li>Originator: filters by the initiator of the data flow task.</li>
         * <li>TaskActions: filters by the type of the data flow task.</li>
         * <li>DataTypes: filters by the data type of the data flow task.</li>
         * <li>Status: filters by data flow status.</li>
         * <li>CreateTimeBegin: filters data flow tasks created after the specified time.</li>
         * <li>CreateTimeEnd: filters data flow tasks created before the specified time.</li>
         * <li>StartTimeBegin: filters data flow tasks started after the specified time.</li>
         * <li>StartTimeEnd: filters data flow tasks started before the specified time.</li>
         * <li>EndTimeBegin: filters data flow tasks ended after the specified time.</li>
         * <li>EndTimeEnd: filters data flow tasks ended before the specified time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataFlowIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter key. Wildcards are not supported.</p>
         * <ul>
         * <li>If Key is set to DataFlowIds, Value is set to a data flow ID or part of a data flow ID. You can specify one or more data flow IDs. A maximum of 10 data flow IDs can be specified. Example: <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</li>
         * <li>If Key is set to TaskId, Value is set to a data flow task ID or part of a data flow task ID. You can specify one or more data flow task IDs. A maximum of 10 data flow task IDs can be specified. Example: <code>task-38aa8e890f45****</code> or <code>task-38aa8e890f45****,task-29ae8e890f45****</code>.</li>
         * <li>If Key is set to TaskActions, Value is set to the type of the data flow task, including <strong>Import</strong>, <strong>Export</strong>, <strong>Evict</strong>, <strong>Inventory</strong>, <strong>StreamImport</strong>, and <strong>StreamExport</strong>. Combined queries are supported. CPFS for Lingjun supports only Import, Export, StreamImport, and StreamExport. StreamImport and StreamExport are supported only by CPFS for Lingjun 2.6.0 and later.</li>
         * <li>If Key is set to DataTypes, Value is set to the data type of the data flow task, including MetaAndData, Metadata, and Data. Combined queries are supported.</li>
         * <li>If Key is set to Originator, Value is set to the initiator of the data flow task, including User and System.</li>
         * <li>If Key is set to Status, Value is set to the status of the data flow task, including Pending, Executing, Failed, Completed, Canceling, and Canceled. Combined queries are supported.</li>
         * <li>If Key is set to CreateTimeBegin, Value is set to the earliest creation time of data flow tasks. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to CreateTimeEnd, Value is set to the latest creation time of data flow tasks. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to StartTimeBegin, Value is set to the earliest start time of data flow tasks. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to StartTimeEnd, Value is set to the latest start time of data flow tasks. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to EndTimeBegin, Value is set to the earliest end time of data flow tasks. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to EndTimeEnd, Value is set to the latest end time of data flow tasks. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
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
