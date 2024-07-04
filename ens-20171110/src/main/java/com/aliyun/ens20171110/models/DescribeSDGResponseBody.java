// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SDGs")
    public java.util.List<DescribeSDGResponseBodySDGs> SDGs;

    /**
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGResponseBody self = new DescribeSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDGResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSDGResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDGResponseBody setSDGs(java.util.List<DescribeSDGResponseBodySDGs> SDGs) {
        this.SDGs = SDGs;
        return this;
    }
    public java.util.List<DescribeSDGResponseBodySDGs> getSDGs() {
        return this.SDGs;
    }

    public DescribeSDGResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSDGResponseBodySDGsAvaliableRegionIds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-02-27 15:13:26</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-26</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>sp-517qu0tgznrg622he7nf4wd7n</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSDGResponseBodySDGsAvaliableRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDGResponseBodySDGsAvaliableRegionIds self = new DescribeSDGResponseBodySDGsAvaliableRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeSDGResponseBodySDGsAvaliableRegionIds setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSDGResponseBodySDGsAvaliableRegionIds setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSDGResponseBodySDGsAvaliableRegionIds setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSDGResponseBodySDGsAvaliableRegionIds setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSDGResponseBodySDGsPreloadInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-02-16T06:18:40Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>test-20000</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RedundantNum")
        public Integer redundantNum;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>2021-01-22T08:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeSDGResponseBodySDGsPreloadInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDGResponseBodySDGsPreloadInfos self = new DescribeSDGResponseBodySDGsPreloadInfos();
            return TeaModel.build(map, self);
        }

        public DescribeSDGResponseBodySDGsPreloadInfos setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSDGResponseBodySDGsPreloadInfos setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeSDGResponseBodySDGsPreloadInfos setRedundantNum(Integer redundantNum) {
            this.redundantNum = redundantNum;
            return this;
        }
        public Integer getRedundantNum() {
            return this.redundantNum;
        }

        public DescribeSDGResponseBodySDGsPreloadInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSDGResponseBodySDGsPreloadInfos setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeSDGResponseBodySDGs extends TeaModel {
        @NameInMap("AvaliableRegionIds")
        public java.util.List<DescribeSDGResponseBodySDGsAvaliableRegionIds> avaliableRegionIds;

        /**
         * <strong>example:</strong>
         * <p>aic-5x20dyeos****</p>
         */
        @NameInMap("CreationInstanceId")
        public String creationInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-26</p>
         */
        @NameInMap("CreationRegionId")
        public String creationRegionId;

        /**
         * <strong>example:</strong>
         * <p>2023-02-27 15:07:21</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>sdg-xxxxx</p>
         */
        @NameInMap("ParentSDGId")
        public String parentSDGId;

        @NameInMap("PreloadInfos")
        public java.util.List<DescribeSDGResponseBodySDGsPreloadInfos> preloadInfos;

        /**
         * <strong>example:</strong>
         * <p>sdg-30e1fdba7196bc****</p>
         */
        @NameInMap("SDGId")
        public String SDGId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2023-02-27 16:04:39</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeSDGResponseBodySDGs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDGResponseBodySDGs self = new DescribeSDGResponseBodySDGs();
            return TeaModel.build(map, self);
        }

        public DescribeSDGResponseBodySDGs setAvaliableRegionIds(java.util.List<DescribeSDGResponseBodySDGsAvaliableRegionIds> avaliableRegionIds) {
            this.avaliableRegionIds = avaliableRegionIds;
            return this;
        }
        public java.util.List<DescribeSDGResponseBodySDGsAvaliableRegionIds> getAvaliableRegionIds() {
            return this.avaliableRegionIds;
        }

        public DescribeSDGResponseBodySDGs setCreationInstanceId(String creationInstanceId) {
            this.creationInstanceId = creationInstanceId;
            return this;
        }
        public String getCreationInstanceId() {
            return this.creationInstanceId;
        }

        public DescribeSDGResponseBodySDGs setCreationRegionId(String creationRegionId) {
            this.creationRegionId = creationRegionId;
            return this;
        }
        public String getCreationRegionId() {
            return this.creationRegionId;
        }

        public DescribeSDGResponseBodySDGs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSDGResponseBodySDGs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSDGResponseBodySDGs setParentSDGId(String parentSDGId) {
            this.parentSDGId = parentSDGId;
            return this;
        }
        public String getParentSDGId() {
            return this.parentSDGId;
        }

        public DescribeSDGResponseBodySDGs setPreloadInfos(java.util.List<DescribeSDGResponseBodySDGsPreloadInfos> preloadInfos) {
            this.preloadInfos = preloadInfos;
            return this;
        }
        public java.util.List<DescribeSDGResponseBodySDGsPreloadInfos> getPreloadInfos() {
            return this.preloadInfos;
        }

        public DescribeSDGResponseBodySDGs setSDGId(String SDGId) {
            this.SDGId = SDGId;
            return this;
        }
        public String getSDGId() {
            return this.SDGId;
        }

        public DescribeSDGResponseBodySDGs setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeSDGResponseBodySDGs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSDGResponseBodySDGs setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
