// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeLensMonitorDisksRequest extends TeaModel {
    /**
     * <p>The cloud disk type. Valid values:</p>
     * <ul>
     * <li>cloud: basic cloud disk.</li>
     * <li>cloud_efficiency: ultra cloud disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>cloud_essd: Enterprise SSD (ESSD).</li>
     * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
     * <li>cloud_essd_entry: ESSD Entry disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The regular expression pattern used for fuzzy match filtering of cloud disk IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>d-cd40hxfu0v*</p>
     */
    @NameInMap("DiskIdPattern")
    public String diskIdPattern;

    /**
     * <p>The list of cloud disk IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;d-1\&quot;, \&quot;d-2\&quot;]</p>
     */
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    /**
     * <p>The ECS instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zedroc0yv8z19ubnyos</p>
     */
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    /**
     * <p>The list of cloud disk event tags, used to filter cloud disks that have experienced these event types within the last 24 hours. Valid values:</p>
     * <ul>
     * <li>NoSnapshot: data protection</li>
     * <li>BurstIOTriggered: burst I/O</li>
     * <li>CostOptimizationNeeded: cost optimization</li>
     * <li>DiskSpecNotMatchedWithInstance: instance and cloud disk specifications do not match</li>
     * <li>DiskIONo4kAligned: non-4K aligned read/write</li>
     * <li>DiskIOHang: I/O hang occurred on the cloud disk</li>
     * <li>InstanceIOPSExceedInstanceMaxLimit: instance IOPS reached the upper limit</li>
     * <li>InstanceBPSExceedInstanceMaxLimit: instance BPS reached the upper limit</li>
     * <li>DiskIOPSExceedInstanceMaxLimit: cloud disk IOPS reached the instance upper limit</li>
     * <li>DiskBPSExceedInstanceMaxLimit: cloud disk BPS reached the instance upper limit</li>
     * <li>DiskIOPSExceedDiskMaxLimit: cloud disk IOPS reached the disk upper limit</li>
     * <li>DiskBPSExceedDiskMaxLimit: cloud disk BPS reached the disk upper limit</li>
     * </ul>
     */
    @NameInMap("LensTags")
    public java.util.List<String> lensTags;

    /**
     * <p>The maximum number of entries per page for a paged query. Maximum value: 100.
     * Default value:</p>
     * <ul>
     * <li><p>The default value is 10.</p>
     * </li>
     * <li><p>If the specified value is greater than 100, the default value of 100 is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call DescribeRegions to query the list of regions supported by EBS Lens.</p>
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

    public DescribeLensMonitorDisksRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
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
