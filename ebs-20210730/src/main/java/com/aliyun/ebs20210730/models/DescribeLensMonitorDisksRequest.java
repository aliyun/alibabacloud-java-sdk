// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeLensMonitorDisksRequest extends TeaModel {
    /**
     * <p>The type of the disk. Valid values:</p>
     * <p>- cloud</p>
     * <p>- cloud_efficiency</p>
     * <p>- cloud_ssd</p>
     * <p>- cloud_essd</p>
     * <p>- cloud_auto</p>
     * <p>- cloud_essd_entry</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The list of disks.</p>
     */
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    /**
     * <p>Lens event tag list to filter cloud disks that have experienced these event types within 24 hours. Valid values:</p>
     * <br>
     * <p>- NoSnapshot</p>
     * <p>- BurstIOTriggered</p>
     * <p>- CostOptimizationNeeded</p>
     * <p>- DiskSpecNotMatchedWithInstance</p>
     * <p>- DiskIONo4kAligned</p>
     * <p>- DiskIOHang</p>
     * <p>- InstanceIOPSExceedInstanceMaxLimit</p>
     * <p>- InstanceBPSExceedInstanceMaxLimit</p>
     * <p>- DiskIOPSExceedInstanceMaxLimit</p>
     * <p>- DiskBPSExceedInstanceMaxLimit</p>
     * <p>- DiskIOPSExceedDiskMaxLimit</p>
     * <p>- DiskBPSExceedDiskMaxLimit</p>
     * <p>- DiskSlowIOTriggerred</p>
     */
    @NameInMap("LensTags")
    public java.util.List<String> lensTags;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query to retrieve more results.</p>
     * <br>
     * <p>>  This parameter is not required in the first query. If not all results are returned in one query, you can pass in the NextToken value returned in the previous query to perform the query again.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeLensMonitorDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLensMonitorDisksRequest self = new DescribeLensMonitorDisksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLensMonitorDisksRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public DescribeLensMonitorDisksRequest setDiskIds(java.util.List<String> diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public java.util.List<String> getDiskIds() {
        return this.diskIds;
    }

    public DescribeLensMonitorDisksRequest setLensTags(java.util.List<String> lensTags) {
        this.lensTags = lensTags;
        return this;
    }
    public java.util.List<String> getLensTags() {
        return this.lensTags;
    }

    public DescribeLensMonitorDisksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLensMonitorDisksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLensMonitorDisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
