// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowSubTasksRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-370lx1ev9ss27o0****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The filter that is used to query data streaming tasks.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeDataFlowSubTasksRequestFilters> filters;

    /**
     * <p>The number of results for each query.</p>
     * <ul>
     * <li>Valid values: 20 to 100.</li>
     * <li>Default value: 20.</li>
     * </ul>
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
     * <p>iWk0AQAAAAAvY2FzZS8=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeDataFlowSubTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowSubTasksRequest self = new DescribeDataFlowSubTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowSubTasksRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeDataFlowSubTasksRequest setFilters(java.util.List<DescribeDataFlowSubTasksRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeDataFlowSubTasksRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeDataFlowSubTasksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDataFlowSubTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class DescribeDataFlowSubTasksRequestFilters extends TeaModel {
        /**
         * <p>The filter name.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DataFlowIds: filters data flow subtasks by data flow ID.</li>
         * <li>DataFlowTaskIds: filters data flow subtasks by data flow task ID.</li>
         * <li>DataFlowSubTaskIds: filters data flow subtasks by data streaming task ID.</li>
         * <li>Status: filters data flow subtasks by status.</li>
         * <li>SrcFilePath: filters data flow subtasks by source file path.</li>
         * <li>DstFilePath: filters data flow subtasks by destination file path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataFlowSubTaskIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value. This parameter does not support wildcards.</p>
         * <ul>
         * <li>If Key is set to DataFlowIds, set Value to a data flow ID or a part of the data flow ID. You can specify a data flow ID or a group of data flow IDs. You can specify a maximum of 10 data flow IDs. Example: <code>df-194433a5be31****</code> or <code>df-194433a5be31****,df-244433a5be31****</code>.</li>
         * <li>If Key is set to DataFlowTaskIds, set Value to a data flow task ID or a part of the data flow task ID. You can specify a data flow task ID or a group of data flow task IDs. You can specify a maximum of 10 data flow task IDs. Example:  <code>task-38aa8e890f45****</code> or <code>task-38aa8e890f45****,task-27aa8e890f45****</code>.</li>
         * <li>If Key is set to DataFlowSubTaskIds, set Value to a data streaming task ID or a part of the data streaming task ID. You can specify a data streaming task ID or a group of data streaming task IDs. You can specify a maximum of 10 data streaming task IDs. Example: <code>subTaskId-370kyfmyknxcyzw**** </code>or <code>subTaskId-370kyfmyknxcyzw****,subTaskId-280kyfmyknxcyzw****</code>.</li>
         * <li>If Key is set to Status, set Value to the status of the data flow task. The status can be EXPIRED, CREATED, RUNNING, COMPLETE, CANCELING, FAILED, or CANCELED. Combined query is supported.</li>
         * <li>If Key is set to SrcFilePath, set Value to the path of the source file. The path can be up to 1,023 characters in length.</li>
         * <li>If Key is set to DstFilePath, set Value to the path of the destination file. The path can be up to 1,023 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>subTaskId-370kyfmyknxcyzw****</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDataFlowSubTasksRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowSubTasksRequestFilters self = new DescribeDataFlowSubTasksRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowSubTasksRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDataFlowSubTasksRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
