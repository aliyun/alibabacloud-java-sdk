// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a specific region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1rqvm70uh2****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time. The specified time range must be less than seven days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-27T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The order in which to sort the retrieved entries by field. Specify this parameter in the JSON format. The value is an ordered array that uses the order of the input array and contains <code>Field</code> and <code>Type</code>. Example: <code>[{&quot;Field&quot;:&quot;ExecutionStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;ScanRows&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>.</p>
     * <ul>
     * <li><p><code>Field</code>: the field that is used to sort the retrieved entries. Valid values:</p>
     * <ul>
     * <li><strong>HostAddress</strong>: the IP address of the client that is used to connect to the database.</li>
     * <li><strong>UserName</strong>: the username.</li>
     * <li><strong>ExecutionStartTime</strong>: the start time of the query execution.</li>
     * <li><strong>QueryTime</strong>: the amount of time consumed to execute the SQL statement.</li>
     * <li><strong>PeakMemoryUsage</strong>: the maximum memory usage when the SQL statement is executed.</li>
     * <li><strong>ScanRows</strong>: the number of rows to be scanned from a data source in the task.</li>
     * <li><strong>ScanSize</strong>: the amount of data to be scanned.</li>
     * <li><strong>ScanTime</strong>: the total amount of time consumed to scan data.</li>
     * <li><strong>PlanningTime</strong>: the amount of time consumed to generate execution plans.</li>
     * <li><strong>WallTime</strong>: the accumulated CPU Time values of all operators in the query on each node.</li>
     * <li><strong>ProcessID</strong>: the ID of the process.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code>: the sorting type of the retrieved entries. Valid values:</p>
     * <ul>
     * <li><strong>Desc</strong>: descending order</li>
     * <li><strong>Asc</strong>: ascending order</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;ExecutionStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;ScanRows&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the process.</p>
     * 
     * <strong>example:</strong>
     * <p>2021052716044317201616624903453******</p>
     */
    @NameInMap("ProcessID")
    public String processID;

    /**
     * <p>The range conditions used to filter specified fields, including <code>Max</code> and <code>Min</code>. Specify this parameter in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;ScanSize&quot;,&quot;Min&quot;:&quot;1000000&quot;,&quot;Max&quot;:&quot;10000000&quot;},{&quot;Field&quot;:&quot;QueryTime&quot;,&quot;Min&quot;:&quot;1000&quot;,&quot;Max&quot;:&quot;10000&quot;}]</code>.</p>
     * <p><code>Field</code>: the field to be filtered. Valid values:</p>
     * <ul>
     * <li><strong>ScanSize</strong>: the amount of data to be scanned. Unit: KB.</li>
     * <li><strong>QueryTime</strong>: the amount of time consumed to execute the statement. Unit: milliseconds.</li>
     * <li><strong>PeakMemoryUsage</strong>: the maximum memory usage when the SQL statement is executed. Unit: KB.</li>
     * </ul>
     * <blockquote>
     * <p> <code>Min</code> indicates the minimum value of the query range (left operand). <code>Max</code> indicates the maximum value of the query range (right operand). Max and Min are both of the String type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;ScanSize&quot;,&quot;Min&quot;:&quot;1000000&quot;,&quot;Max&quot;:&quot;10000000&quot;},{&quot;Field&quot;:&quot;QueryTime&quot;,&quot;Min&quot;:&quot;1000&quot;,&quot;Max&quot;:&quot;10000&quot;}]</p>
     */
    @NameInMap("Range")
    public String range;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The state of the query. Valid values:</p>
     * <ul>
     * <li><strong>Successed</strong>: successful</li>
     * <li><strong>Failed</strong>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Successed</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeSlowLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsRequest self = new DescribeSlowLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSlowLogRecordsRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeSlowLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogRecordsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSlowLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSlowLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSlowLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowLogRecordsRequest setProcessID(String processID) {
        this.processID = processID;
        return this;
    }
    public String getProcessID() {
        return this.processID;
    }

    public DescribeSlowLogRecordsRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public DescribeSlowLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSlowLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSlowLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowLogRecordsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
