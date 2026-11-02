// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSharedDiskRecordsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68B85217-03B8-5141-9216-EA4D7C496B9A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of shared disk billing records.</p>
     */
    @NameInMap("SharedDisks")
    public java.util.List<DescribeSharedDiskRecordsResponseBodySharedDisks> sharedDisks;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSharedDiskRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSharedDiskRecordsResponseBody self = new DescribeSharedDiskRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSharedDiskRecordsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSharedDiskRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSharedDiskRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSharedDiskRecordsResponseBody setSharedDisks(java.util.List<DescribeSharedDiskRecordsResponseBodySharedDisks> sharedDisks) {
        this.sharedDisks = sharedDisks;
        return this;
    }
    public java.util.List<DescribeSharedDiskRecordsResponseBodySharedDisks> getSharedDisks() {
        return this.sharedDisks;
    }

    public DescribeSharedDiskRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSharedDiskRecordsResponseBodySharedDisks extends TeaModel {
        /**
         * <p>The creation time of the shared disk.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01 10:00:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The shared disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-57kvvpuj1rk2ghumlgs6</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The disk size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DiskSize")
        public Long diskSize;

        /**
         * <p>The instance from which the shared disk was last detached.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("LastDetachInstanceId")
        public String lastDetachInstanceId;

        /**
         * <p>The time when the shared disk was last detached.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-14 18:00:00</p>
         */
        @NameInMap("LastDetachTime")
        public String lastDetachTime;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The SDG sharing ratio parameter, which supports cloud disks with different maximum sharing ratios.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PerformanceLevel")
        public Long performanceLevel;

        /**
         * <p>The recycle time of the shared disk.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-15 14:30:00</p>
         */
        @NameInMap("RecycleTime")
        public String recycleTime;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The SDG ID of the shared disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-fqehhfdjv</p>
         */
        @NameInMap("SdgId")
        public String sdgId;

        public static DescribeSharedDiskRecordsResponseBodySharedDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSharedDiskRecordsResponseBodySharedDisks self = new DescribeSharedDiskRecordsResponseBodySharedDisks();
            return TeaModel.build(map, self);
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setDiskSize(Long diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Long getDiskSize() {
            return this.diskSize;
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setLastDetachInstanceId(String lastDetachInstanceId) {
            this.lastDetachInstanceId = lastDetachInstanceId;
            return this;
        }
        public String getLastDetachInstanceId() {
            return this.lastDetachInstanceId;
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setLastDetachTime(String lastDetachTime) {
            this.lastDetachTime = lastDetachTime;
            return this;
        }
        public String getLastDetachTime() {
            return this.lastDetachTime;
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setPerformanceLevel(Long performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public Long getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setRecycleTime(String recycleTime) {
            this.recycleTime = recycleTime;
            return this;
        }
        public String getRecycleTime() {
            return this.recycleTime;
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSharedDiskRecordsResponseBodySharedDisks setSdgId(String sdgId) {
            this.sdgId = sdgId;
            return this;
        }
        public String getSdgId() {
            return this.sdgId;
        }

    }

}
