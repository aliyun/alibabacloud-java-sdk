// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of SDG information.</p>
     */
    @NameInMap("SDGs")
    public java.util.List<DescribeSDGResponseBodySDGs> SDGs;

    /**
     * <p>The total number of entries.</p>
     * 
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
         * <p>The creation time of the SDG in the edge zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-27 15:13:26</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The edge zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-26</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-517qu0tgznrg622he7nf4wd7n</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The status of the SDG in the edge zone. Valid values:</p>
         * <ul>
         * <li><strong>sdg_making</strong>: Being created.</li>
         * <li><strong>sdg_saving</strong>: Being saved.</li>
         * <li><strong>sdg_copying</strong>: Being synchronized across edge zones.</li>
         * <li><strong>failed</strong>: Creation failed.</li>
         * <li><strong>success</strong>: Creation succeeded.</li>
         * </ul>
         * 
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
         * <p>The creation time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-16T06:18:40Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The disk type of the redundant shared disks.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-20000</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The number of redundant copies for fast shared mounting response.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RedundantNum")
        public Integer redundantNum;

        /**
         * <p>The edge zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The most recent status update time.</p>
         * 
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

        public DescribeSDGResponseBodySDGsPreloadInfos setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
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
        /**
         * <p>The list of edge zones where SDG snapshots exist.</p>
         */
        @NameInMap("AvaliableRegionIds")
        public java.util.List<DescribeSDGResponseBodySDGsAvaliableRegionIds> avaliableRegionIds;

        /**
         * <p>The billing cycle of the shared disk.</p>
         * 
         * <strong>example:</strong>
         * <p>Day</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("BillingType")
        public String billingType;

        /**
         * <p>The disk type of the source disk used to create the SDG.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("CreationDiskType")
        public String creationDiskType;

        /**
         * <p>The instance ID of the instance from which the SDG was created.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-5x20dyeos****</p>
         */
        @NameInMap("CreationInstanceId")
        public String creationInstanceId;

        /**
         * <p>The ID of the edge zone where the SDG was created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-26</p>
         */
        @NameInMap("CreationRegionId")
        public String creationRegionId;

        /**
         * <p>The time when the SDG was first created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-27 15:07:21</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the SDG.</p>
         * 
         * <strong>example:</strong>
         * <p>Test SDG</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the source SDG for incremental creation. This is the FromSDGId parameter specified when you called <a href="https://help.aliyun.com/document_detail/608128.html">CreateSDG</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxxx</p>
         */
        @NameInMap("ParentSDGId")
        public String parentSDGId;

        /**
         * <p>The sharing ratio of the SDG.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The preload configuration information.</p>
         */
        @NameInMap("PreloadInfos")
        public java.util.List<DescribeSDGResponseBodySDGsPreloadInfos> preloadInfos;

        /**
         * <p>The ID of the SDG.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-30e1fdba7196bc****</p>
         */
        @NameInMap("SDGId")
        public String SDGId;

        /**
         * <p>The size of the SDG. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The creation status of the SDG. Valid values:</p>
         * <ul>
         * <li><strong>sdg_making</strong>: Being created.</li>
         * <li><strong>sdg_saving</strong>: Being saved.</li>
         * <li><strong>failed</strong>: Creation failed.</li>
         * <li><strong>success</strong>: Creation succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the SDG was last updated.</p>
         * 
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

        public DescribeSDGResponseBodySDGs setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public DescribeSDGResponseBodySDGs setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public DescribeSDGResponseBodySDGs setCreationDiskType(String creationDiskType) {
            this.creationDiskType = creationDiskType;
            return this;
        }
        public String getCreationDiskType() {
            return this.creationDiskType;
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

        public DescribeSDGResponseBodySDGs setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
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
