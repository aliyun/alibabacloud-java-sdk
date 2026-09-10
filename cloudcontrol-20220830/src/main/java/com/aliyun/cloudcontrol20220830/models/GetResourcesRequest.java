// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetResourcesRequest extends TeaModel {
    /**
     * <p>The filter conditions for resources.</p>
     * <p>Specify multiple key-value pairs in JSON format to filter resources. If a List or Get operation for a cloud product supports filtering by specific properties, you can use those properties as filter conditions for this parameter.</p>
     * <blockquote>
     * <p>The supported filter fields may vary for different resource types. For more information about the supported fields, see the OpenAPI documentation for the specific resource.</p>
     * </blockquote>
     * <p>For example, DBInstance resources support filtering by the <code>EditionType</code> and <code>PaymentType</code> fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;EditionType&quot;: &quot;Community&quot;,
     *   &quot;PaymentType&quot;: &quot;PostPaid&quot;
     * }</p>
     */
    @NameInMap("filter")
    public java.util.Map<String, ?> filter;

    /**
     * <p>The maximum number of records to return on each page for a paged query. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * <ul>
     * <li><p>You do not need to specify this parameter for the first query. The system returns data from the first page.</p>
     * </li>
     * <li><p>For subsequent queries, set this parameter to the nextToken value returned from the previous call.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter contains only digits, Cloud Control API treats it as the <code>PageNumber</code> for paging.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The region ID. This parameter is required if the cloud product is region-specific.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GetResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcesRequest self = new GetResourcesRequest();
        return TeaModel.build(map, self);
    }

    public GetResourcesRequest setFilter(java.util.Map<String, ?> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
    }

    public GetResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
