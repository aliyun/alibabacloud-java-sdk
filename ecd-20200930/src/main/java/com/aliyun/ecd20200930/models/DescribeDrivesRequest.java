// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDrivesRequest extends TeaModel {
    /**
     * <p>The IDs of the storage resources.</p>
     */
    @NameInMap("DomainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Maximum value: 500.</li>
     * <li>Default value: 20.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAA****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the storage resource.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>NAS: NAS storage</li>
     * <li>PDS: PDS storage</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NAS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeDrivesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrivesRequest self = new DescribeDrivesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrivesRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public DescribeDrivesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDrivesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDrivesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDrivesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeDrivesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
