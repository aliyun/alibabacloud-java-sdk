// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkAppsRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The filter conditions defined as a JSON-formatted string. The following valid KEY values and their meanings are supported in the JSON string:</p>
     * <ul>
     * <li>SubmittedTimeRange: the start time.</li>
     * <li>TerminatedTimeRange: the end time.</li>
     * <li>AppStates: the status of the Spark job.</li>
     * <li>AppId: the ID of the Spark job.</li>
     * <li>AppNameRegex: the regular expression for the name of the Spark job.</li>
     * <li>Tag: the tag information.</li>
     * <li>ResourceGroupName: the name of the resource group.</li>
     * </ul>
     * <p>For the start time and end time filter conditions, specify the range by using the following substructure:</p>
     * <ul>
     * <li>Min: the lower bound of the time range. A value of null indicates no limit.</li>
     * <li>Max: the upper bound of the time range. A value of null indicates no limit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;SubmittedTimeRang&quot;: {
     *     &quot;Max&quot;: 10000,
     *     &quot;Min&quot;: 0
     *   },
     *   &quot;TerminatedTimeRange&quot;: {
     *     &quot;Max&quot;: 10000,
     *     &quot;Min&quot;: 0
     *   },
     *   &quot;AppStates&quot;: [&quot;STARTING&quot;],
     *   &quot;AppId&quot;: &quot;adc&quot;,
     *   &quot;AppNameRegex&quot;: &quot;cde&quot;,
     *   &quot;AttemptId&quot;: &quot;abc-001&quot;
     * }</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>The page number. The value must be a positive integer. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>10</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of the job resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test_instance</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static ListSparkAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSparkAppsRequest self = new ListSparkAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListSparkAppsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListSparkAppsRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public ListSparkAppsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSparkAppsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSparkAppsRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
