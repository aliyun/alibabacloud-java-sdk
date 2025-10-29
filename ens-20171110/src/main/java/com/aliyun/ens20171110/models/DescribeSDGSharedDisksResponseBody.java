// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGSharedDisksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>xxxsxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SharedDisks")
    public java.util.List<DescribeSDGSharedDisksResponseBodySharedDisks> sharedDisks;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSDGSharedDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGSharedDisksResponseBody self = new DescribeSDGSharedDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDGSharedDisksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSDGSharedDisksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSDGSharedDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDGSharedDisksResponseBody setSharedDisks(java.util.List<DescribeSDGSharedDisksResponseBodySharedDisks> sharedDisks) {
        this.sharedDisks = sharedDisks;
        return this;
    }
    public java.util.List<DescribeSDGSharedDisksResponseBodySharedDisks> getSharedDisks() {
        return this.sharedDisks;
    }

    public DescribeSDGSharedDisksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSDGSharedDisksResponseBodySharedDisks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-10-09T15:13:21+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>d-57kvvpuj1rk2ghumlgs6</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>sdg-fqehhfdjv</p>
         */
        @NameInMap("SdgId")
        public String sdgId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SharedNum")
        public Integer sharedNum;

        /**
         * <strong>example:</strong>
         * <p>avaliable</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSDGSharedDisksResponseBodySharedDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDGSharedDisksResponseBodySharedDisks self = new DescribeSDGSharedDisksResponseBodySharedDisks();
            return TeaModel.build(map, self);
        }

        public DescribeSDGSharedDisksResponseBodySharedDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSDGSharedDisksResponseBodySharedDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeSDGSharedDisksResponseBodySharedDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeSDGSharedDisksResponseBodySharedDisks setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeSDGSharedDisksResponseBodySharedDisks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSDGSharedDisksResponseBodySharedDisks setSdgId(String sdgId) {
            this.sdgId = sdgId;
            return this;
        }
        public String getSdgId() {
            return this.sdgId;
        }

        public DescribeSDGSharedDisksResponseBodySharedDisks setSharedNum(Integer sharedNum) {
            this.sharedNum = sharedNum;
            return this;
        }
        public Integer getSharedNum() {
            return this.sharedNum;
        }

        public DescribeSDGSharedDisksResponseBodySharedDisks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
