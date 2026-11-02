// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSharedDiskRecordsRequest extends TeaModel {
    /**
     * <p>The list of shared disk IDs.</p>
     */
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

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
    public java.util.List<String> namespaces;

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
    public java.util.List<String> regionIds;

    /**
     * <p>The list of SDG IDs.</p>
     */
    @NameInMap("SdgIds")
    public java.util.List<String> sdgIds;

    /**
     * <p>The billing start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-21T10:22:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSharedDiskRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSharedDiskRecordsRequest self = new DescribeSharedDiskRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSharedDiskRecordsRequest setDiskIds(java.util.List<String> diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public java.util.List<String> getDiskIds() {
        return this.diskIds;
    }

    public DescribeSharedDiskRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSharedDiskRecordsRequest setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public DescribeSharedDiskRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSharedDiskRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSharedDiskRecordsRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public DescribeSharedDiskRecordsRequest setSdgIds(java.util.List<String> sdgIds) {
        this.sdgIds = sdgIds;
        return this;
    }
    public java.util.List<String> getSdgIds() {
        return this.sdgIds;
    }

    public DescribeSharedDiskRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
