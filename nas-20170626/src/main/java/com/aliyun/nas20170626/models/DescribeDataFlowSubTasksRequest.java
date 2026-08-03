// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowSubTasksRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-370lx1ev9ss27o0****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The filter keys for querying data flow streaming tasks.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeDataFlowSubTasksRequestFilters> filters;

    /**
     * <p>The maximum number of results per query.</p>
     * <ul>
     * <li><p>Valid values: 20 to 100.</p>
     * </li>
     * <li><p>Default value: 20.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>If the returned results are truncated, you can use NextToken to initiate a new request to retrieve the content after the current truncation point.</p>
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
         * <p>The name of the filter key.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DataFlowIds: filters by data flow ID.</li>
         * <li>DataFlowTaskIds: filters by data flow task ID.</li>
         * <li>DataFlowSubTaskIds: filters by data flow streaming task ID.</li>
         * <li>Status: filters by data flow status.</li>
         * <li>SrcFilePath: filters by source file path.</li>
         * <li>DstFilePath: filters by destination file path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataFlowSubTaskIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter key. Wildcards are not supported for this parameter.</p>
         * <ul>
         * <li>If Key is set to DataFlowIds, Value is set to a data flow ID or part of a data flow ID. You can specify one or more data flow IDs. A maximum of 10 data flow IDs can be specified. Example: <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</li>
         * <li>If Key is set to DataFlowTaskIds, Value is set to a data flow task ID or part of a data flow task ID. You can specify one or more data flow task IDs. A maximum of 10 data flow task IDs can be specified. Example: <code>task-29ee8e890f45****</code> or <code>task-29ee8e890f45****,task-38ae8e890f45****</code>.</li>
         * <li>If Key is set to DataFlowSubTaskIds, Value is set to a data flow streaming task ID or part of a data flow streaming task ID. You can specify one or more data flow streaming task IDs. A maximum of 10 data flow streaming task IDs can be specified. Example: <code>subTaskId-370kyfmyknxcyzw****</code> or <code>subTaskId-247kyfmyknxcyzw****,subTaskId-256kyfmyknxcyzw****</code>.</li>
         * <li>If Key is set to Status, Value is set to the status of the data flow task, including EXPIRED, CREATED, RUNNING, COMPLETE, CANCELING, FAILED, and CANCELED. Combined queries are supported.</li>
         * <li>If Key is set to SrcFilePath, Value is set to the source file path. The maximum length is 1023 characters.</li>
         * <li>If Key is set to DstFilePath, Value is set to the destination file path. The maximum length is 1023 characters.</li>
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
