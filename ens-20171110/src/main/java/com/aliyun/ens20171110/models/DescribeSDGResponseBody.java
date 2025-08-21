// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the SDGs.</p>
     */
    @NameInMap("SDGs")
    public java.util.List<DescribeSDGResponseBodySDGs> SDGs;

    /**
     * <p>The total number of returned entries.</p>
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
         * <p>The time when the SDG was created on the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-27 15:13:26</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-26</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-517qu0tgznrg622he7nf4wd7n</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The status of the SDG on the node. Valid values:</p>
         * <ul>
         * <li><strong>sdg_making</strong></li>
         * <li><strong>sdg_saving</strong></li>
         * <li><strong>sdg_copying</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>success</strong></li>
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
         * <p>The time when the SDG was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-16T06:18:40Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

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
         * <p>The number of redundant replicas to quickly respond to shared mounts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RedundantNum")
        public Integer redundantNum;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the status was last updated.</p>
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
         * <p>SDGs that have snapshots.</p>
         */
        @NameInMap("AvaliableRegionIds")
        public java.util.List<DescribeSDGResponseBodySDGsAvaliableRegionIds> avaliableRegionIds;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("CreationDiskType")
        public String creationDiskType;

        /**
         * <p>The ID of the instance on which the SDG is created.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-5x20dyeos****</p>
         */
        @NameInMap("CreationInstanceId")
        public String creationInstanceId;

        /**
         * <p>The ID of the node on which the SDG is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-26</p>
         */
        @NameInMap("CreationRegionId")
        public String creationRegionId;

        /**
         * <p>The time when the first SDG in the node was created.</p>
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
         * <p>Testing SDGs</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the source SDG from which you want to create an SDG. The value of this parameter is the value of the <strong>FromSDGId</strong> parameter that you need to specify when you call the <a href="https://help.aliyun.com/document_detail/608128.html">CreateSDG</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxxx</p>
         */
        @NameInMap("ParentSDGId")
        public String parentSDGId;

        /**
         * <p>The preload information.</p>
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
         * <p>The status of the SDG creation. Valid values:</p>
         * <ul>
         * <li><strong>sdg_making</strong></li>
         * <li><strong>sdg_saving</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>success</strong></li>
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
