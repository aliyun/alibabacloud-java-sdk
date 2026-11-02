// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSharedDiskRecordsShrinkRequest extends TeaModel {
    /**
     * <p>The list of shared disk IDs.</p>
     */
    @NameInMap("DiskIds")
    public String diskIdsShrink;

    /**
     * <p>The billing end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-30T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of namespaces.</p>
     */
    @NameInMap("Namespaces")
    public String namespacesShrink;

    /**
     * <p>The page number used for paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of region IDs.</p>
     */
    @NameInMap("RegionIds")
    public String regionIdsShrink;

    /**
     * <p>The list of SDG IDs.</p>
     */
    @NameInMap("SdgIds")
    public String sdgIdsShrink;

    /**
     * <p>The billing start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-21T10:22:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSharedDiskRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSharedDiskRecordsShrinkRequest self = new DescribeSharedDiskRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSharedDiskRecordsShrinkRequest setDiskIdsShrink(String diskIdsShrink) {
        this.diskIdsShrink = diskIdsShrink;
        return this;
    }
    public String getDiskIdsShrink() {
        return this.diskIdsShrink;
    }

    public DescribeSharedDiskRecordsShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSharedDiskRecordsShrinkRequest setNamespacesShrink(String namespacesShrink) {
        this.namespacesShrink = namespacesShrink;
        return this;
    }
    public String getNamespacesShrink() {
        return this.namespacesShrink;
    }

    public DescribeSharedDiskRecordsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSharedDiskRecordsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSharedDiskRecordsShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public DescribeSharedDiskRecordsShrinkRequest setSdgIdsShrink(String sdgIdsShrink) {
        this.sdgIdsShrink = sdgIdsShrink;
        return this;
    }
    public String getSdgIdsShrink() {
        return this.sdgIdsShrink;
    }

    public DescribeSharedDiskRecordsShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
