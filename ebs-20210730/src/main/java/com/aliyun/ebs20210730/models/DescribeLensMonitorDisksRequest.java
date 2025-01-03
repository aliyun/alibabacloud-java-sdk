// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeLensMonitorDisksRequest extends TeaModel {
    /**
     * <p>The type of the disk. Valid values:</p>
     * <ul>
     * <li>cloud</li>
     * <li>cloud_efficiency</li>
     * <li>cloud_ssd</li>
     * <li>cloud_essd</li>
     * <li>cloud_auto</li>
     * <li>cloud_essd_entry</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("DiskIdPattern")
    public String diskIdPattern;

    /**
     * <p>The list of disks.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;d-1\&quot;, \&quot;d-2\&quot;]</p>
     */
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    /**
     * <p>Event tags of the disk, which are used to filter the disks on which the events associated with the specified tags occurred in the previous 24 hours. Valid values:</p>
     * <ul>
     * <li>NoSnapshot: specifies the event that is triggered because no snapshot is created for the disk to protect data on the disk.</li>
     * <li>BurstIOTriggered: specifies the event that is triggered when a burst I/O operation is performed on the disk.</li>
     * <li>CostOptimizationNeeded: specifies the event that is triggered when cost optimization is required.</li>
     * <li>DiskSpecNotMatchedWithInstance: specifies the event that is triggered if the disk specifications do not match the instance to which the disk is attached.</li>
     * <li>DiskIONo4kAligned: specifies the event that is triggered if the physical and logical sectors involved in a read or write operation are not 4K aligned.</li>
     * <li>DiskIOHang: specifies the event that is triggered when an I/O hang occurs on the disk.</li>
     * <li>InstanceIOPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of IOPS on the instance reaches the upper limit.</li>
     * <li>InstanceBPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of BPS on the instance reaches the upper limit.</li>
     * <li>DiskIOPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of IOPS on the disk reaches the upper limit of the instance.</li>
     * <li>DiskBPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of BPS on the disk reaches the upper limit of the instance.</li>
     * <li>DiskIOPSExceedDiskMaxLimit: specifies the event that is triggered when the number of IOPS on the disk reaches the upper limit of the disk.</li>
     * <li>DiskBPSExceedDiskMaxLimit: specifies the event that is triggered when the number of BPS on the disk reaches the upper limit of the disk.</li>
     * <li>DiskSlowIOTriggerred: specifies the event that is triggered when the I/O speed on the disk is slow.</li>
     * </ul>
     */
    @NameInMap("LensTags")
    public java.util.List<String> lensTags;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query to retrieve more results.</p>
     * <blockquote>
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

    public DescribeLensMonitorDisksRequest setDiskIdPattern(String diskIdPattern) {
        this.diskIdPattern = diskIdPattern;
        return this;
    }
    public String getDiskIdPattern() {
        return this.diskIdPattern;
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
