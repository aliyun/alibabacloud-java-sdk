// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImageModifiedRecordsRequest extends TeaModel {
    /**
     * <p>The cloud desktop ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-bd53sfmysz8ir****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>Number of entries per page for paged queries.</p>
     * <ul>
     * <li><p>Maximum: 100.</p>
     * </li>
     * <li><p>Default: 10.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Pagination token. Set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l3d+SWeOobbIlDLjwhjkTk</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to list regions that support WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeImageModifiedRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageModifiedRecordsRequest self = new DescribeImageModifiedRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageModifiedRecordsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeImageModifiedRecordsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImageModifiedRecordsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageModifiedRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
