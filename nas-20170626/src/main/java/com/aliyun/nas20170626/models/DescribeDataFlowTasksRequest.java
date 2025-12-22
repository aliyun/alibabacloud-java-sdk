// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowTasksRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-099394bd928c\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of CPFS for Lingjun file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya\<em>\</em>\<em>\</em>. .</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The details about filters.</p>
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
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Whether to query report information.</p>
     * <ul>
     * <li>True (default)</li>
     * <li>False</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Set it to False to speed up the query.</p>
     * </li>
     * <li><p>Only CPFS for Lingjun supports this parameter.</p>
     * </li>
     * </ul>
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
         * <p>The filter name.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>DataFlowIds: filters dataflow tasks by dataflow ID.</li>
         * <li>TaskIds: filters dataflow tasks by task ID.</li>
         * <li>Originator: filters dataflow tasks by task initiator.</li>
         * <li>TaskActions: filters dataflow tasks by task type.</li>
         * <li>DataTypes: filters dataflow tasks by data type.</li>
         * <li>Status: filters dataflow tasks by dataflow status.</li>
         * <li>CreateTimeBegin: filters dataflow tasks that are created after a specified time.</li>
         * <li>CreateTimeEnd: filters dataflow tasks that are created before a specified time.</li>
         * <li>StartTimeBegin: filters dataflow tasks that are started after a specified time.</li>
         * <li>StartTimeEnd: filters dataflow tasks that are started before a specified time.</li>
         * <li>EndTimeBegin: filters dataflow tasks that are stopped after a specified time.</li>
         * <li>EndTimeEnd: filters dataflow tasks that are stopped before a specified time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataFlowIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter. This parameter does not support wildcards.</p>
         * <ul>
         * <li>If Key is set to DataFlowIds, set Value to a dataflow ID or a part of the dataflow ID. You can specify a dataflow ID or a group of dataflow IDs. You can specify a maximum of 10 dataflow IDs. Example: <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</li>
         * <li>If Key is set to TaskId, set Value to a dataflow task ID or a part of the dataflow task ID. You can specify a dataflow task ID or a group of dataflow task IDs. You can specify a maximum of 10 dataflow task IDs. Example: <code>task-38aa8e890f45****</code> or <code>task-38aa8e890f45****,task-29ae8e890f45****</code>.</li>
         * <li>If Key is set to TaskActions, set Value to the type of dataflow task. The task type can be <strong>Import</strong>, <strong>Export</strong>, <strong>Evict</strong>, <strong>Inventory</strong>, <strong>StreamImport</strong>, or <strong>StreamExport</strong>. Combined query is supported. CPFS for Lingjun supports only the Import, Export, StreamImport, and StreamExport tasks. Only CPFS for Lingjun V2.6.0 and later support the StreamImport and StreamExport tasks.</li>
         * <li>If Key is set to DataTypes, set Value to the data type of the dataflow task. The data type can be MetaAndData, Metadata, or Data. Combined query is supported.</li>
         * <li>If Key is set to Originator, set Value to the initiator of the dataflow task. The initiator can be User or System.</li>
         * <li>If Key is set to Status, set Value to the status of the dataflow task. The status can be Pending, Executing, Failed, Completed, Canceling, or Canceled. Combined query is supported.</li>
         * <li>If Key is set to CreateTimeBegin, set Value to the beginning of the time range to create the dataflow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to CreateTimeEnd, set Value to the end of the time range to create the dataflow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to StartTimeBegin, set Value to the beginning of the time range to start the dataflow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to StartTimeEnd, set Value to the end of the time range to start the dataflow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to EndTimeBegin, set Value to the beginning of the time range to stop the dataflow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * <li>If Key is set to EndTimeEnd, set Value to the end of the time range to stop the dataflow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dfid-12345678</p>
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
