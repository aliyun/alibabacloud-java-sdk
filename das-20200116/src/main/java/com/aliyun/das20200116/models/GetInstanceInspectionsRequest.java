// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1655427625000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>Redis</strong></li>
     * <li><strong>PolarDBMySQL</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The type of the instance on which the database is deployed. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: an Alibaba Cloud database instance.</li>
     * <li><strong>ECS</strong>: an ECS instance on which a self-managed database is deployed.</li>
     * <li><strong>IDC</strong>: a self-managed database instance that is not deployed on Alibaba Cloud.</li>
     * </ul>
     * <blockquote>
     * <p> The value IDC specifies that the instance is deployed in a data center.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceArea")
    public String instanceArea;

    /**
     * <p>The page number. The value must be a positive integer. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2eil6npi****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The filter condition, which can be specified in one of the following formats:</p>
     * <ul>
     * <li>Specify the ID of a single instance in the {&quot;InstanceId&quot;:&quot;Instance ID&quot;} format.</li>
     * <li>Specify the IDs of multiple instances in the {&quot;InstanceIds&quot;:[&quot;Instance ID1&quot;,&quot;Instance ID2&quot;]} format. Separate the instance IDs with commas (,).</li>
     * <li>Specify the region in which the instance resides in the {&quot;region&quot;:&quot;Region of the instance&quot;} format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;InstanceId&quot;:&quot;rm-bp10usoc1erj7****&quot;}</p>
     */
    @NameInMap("SearchMap")
    public String searchMap;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1655416825000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetInstanceInspectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionsRequest self = new GetInstanceInspectionsRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetInstanceInspectionsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetInstanceInspectionsRequest setInstanceArea(String instanceArea) {
        this.instanceArea = instanceArea;
        return this;
    }
    public String getInstanceArea() {
        return this.instanceArea;
    }

    public GetInstanceInspectionsRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetInstanceInspectionsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetInstanceInspectionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetInstanceInspectionsRequest setSearchMap(String searchMap) {
        this.searchMap = searchMap;
        return this;
    }
    public String getSearchMap() {
        return this.searchMap;
    }

    public GetInstanceInspectionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
