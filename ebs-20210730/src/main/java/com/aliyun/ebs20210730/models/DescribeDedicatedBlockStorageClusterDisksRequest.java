// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClusterDisksRequest extends TeaModel {
    /**
     * <p>The ID of the dedicated block storage cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsc-cn-od43bf****</p>
     */
    @NameInMap("DbscId")
    public String dbscId;

    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 500.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value returned in the previous call to the DescribeDedicatedBlockStorageClusterDisks operation. Leave this parameter empty the first time you call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the dedicated block storage cluster resides. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-heyuan</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDedicatedBlockStorageClusterDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedBlockStorageClusterDisksRequest self = new DescribeDedicatedBlockStorageClusterDisksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedBlockStorageClusterDisksRequest setDbscId(String dbscId) {
        this.dbscId = dbscId;
        return this;
    }
    public String getDbscId() {
        return this.dbscId;
    }

    public DescribeDedicatedBlockStorageClusterDisksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDedicatedBlockStorageClusterDisksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDedicatedBlockStorageClusterDisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
