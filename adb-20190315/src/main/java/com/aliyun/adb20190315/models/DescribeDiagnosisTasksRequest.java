// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisTasksRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The IP address from which the query was initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The order in which to sort the tasks by field. Specify the value in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;CreateTime&quot;, &quot;Type&quot;:&quot;desc&quot;}]</code>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p><code>Field</code> specifies the field that is used to sort the tasks. Valid values of Field: <code>State</code>, <code>CreateTime</code>, <code>DBName</code>, <code>ProcessID</code>, <code>UpdateTime</code>, <code>JobName</code>, and <code>ProcessRows</code>.</p>
     * </li>
     * <li><p><code>Type</code> specifies the sort order. Valid values of Type: <code>Desc</code> and <code>Asc</code>. The values are case-insensitive.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;StartTime&quot;, &quot;Type&quot;: &quot;desc&quot; }]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li>30 (default)</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/190092.html">DescribeProcessList</a> operation to query the IDs of queries that are being executed.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202011191048151921681492420315100****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of a stage in the query that is specified by the <code>ProcessId</code> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Stage[26]</p>
     */
    @NameInMap("StageId")
    public String stageId;

    /**
     * <p>The state of the asynchronous import or export task to be queried. Valid values:</p>
     * <ul>
     * <li><strong>RUNNING</strong></li>
     * <li><strong>FINISHED</strong></li>
     * <li><strong>FAILED</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeDiagnosisTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisTasksRequest self = new DescribeDiagnosisTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisTasksRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDiagnosisTasksRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeDiagnosisTasksRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeDiagnosisTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnosisTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiagnosisTasksRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public DescribeDiagnosisTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosisTasksRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public DescribeDiagnosisTasksRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
