// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAttachInfoResponseBody extends TeaModel {
    /**
     * <p>The list of mount information.</p>
     */
    @NameInMap("AttachInfos")
    public java.util.List<ListKVCacheStoreAttachInfoResponseBodyAttachInfos> attachInfos;

    /**
     * <p>The pagination token used to query the next batch of data.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3NUkN7qf+fcWj7joK8M6tU</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID. A request ID is returned regardless of whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>B127704C-ECB1-5B0A-AA9C-8F394A6F179F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned for the paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListKVCacheStoreAttachInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoreAttachInfoResponseBody self = new ListKVCacheStoreAttachInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoreAttachInfoResponseBody setAttachInfos(java.util.List<ListKVCacheStoreAttachInfoResponseBodyAttachInfos> attachInfos) {
        this.attachInfos = attachInfos;
        return this;
    }
    public java.util.List<ListKVCacheStoreAttachInfoResponseBodyAttachInfos> getAttachInfos() {
        return this.attachInfos;
    }

    public ListKVCacheStoreAttachInfoResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKVCacheStoreAttachInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKVCacheStoreAttachInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKVCacheStoreAttachInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKVCacheStoreAttachInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListKVCacheStoreAttachInfoResponseBodyAttachInfos extends TeaModel {
        /**
         * <p>The time of the most recent attach operation, in ISO 8601 format. The value is null if the instance has not been attached.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-20T08:30:00Z</p>
         */
        @NameInMap("AttachedAt")
        public String attachedAt;

        /**
         * <p>The file system capacity, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>KVCacheStore KvcsId</p>
         * 
         * <strong>example:</strong>
         * <p>kvcs-xxxxx</p>
         */
        @NameInMap("KvcsId")
        public String kvcsId;

        /**
         * <p>The mount point ID at the file system level.</p>
         * 
         * <strong>example:</strong>
         * <p>mp-xxxxx</p>
         */
        @NameInMap("MountPointId")
        public String mountPointId;

        /**
         * <p>The region where the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The attach status. Valid values:</p>
         * <ul>
         * <li>Attaching: The instance is being mounted.</li>
         * <li>Attached: The instance is mounted.</li>
         * <li>Detaching: The instance is being unmounted.</li>
         * </ul>
         * <p>After unmounting is complete, the record is deleted and not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ATTACHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>kvcs: KVCacheStore (CPFS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preview</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The VSC ID on the compute side.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-001</p>
         */
        @NameInMap("VscId")
        public String vscId;

        /**
         * <p>The zone where the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListKVCacheStoreAttachInfoResponseBodyAttachInfos build(java.util.Map<String, ?> map) throws Exception {
            ListKVCacheStoreAttachInfoResponseBodyAttachInfos self = new ListKVCacheStoreAttachInfoResponseBodyAttachInfos();
            return TeaModel.build(map, self);
        }

        public ListKVCacheStoreAttachInfoResponseBodyAttachInfos setAttachedAt(String attachedAt) {
            this.attachedAt = attachedAt;
            return this;
        }
        public String getAttachedAt() {
            return this.attachedAt;
        }

        public ListKVCacheStoreAttachInfoResponseBodyAttachInfos setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public ListKVCacheStoreAttachInfoResponseBodyAttachInfos setKvcsId(String kvcsId) {
            this.kvcsId = kvcsId;
            return this;
        }
        public String getKvcsId() {
            return this.kvcsId;
        }

        public ListKVCacheStoreAttachInfoResponseBodyAttachInfos setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

        public ListKVCacheStoreAttachInfoResponseBodyAttachInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListKVCacheStoreAttachInfoResponseBodyAttachInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListKVCacheStoreAttachInfoResponseBodyAttachInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListKVCacheStoreAttachInfoResponseBodyAttachInfos setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

        public ListKVCacheStoreAttachInfoResponseBodyAttachInfos setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
