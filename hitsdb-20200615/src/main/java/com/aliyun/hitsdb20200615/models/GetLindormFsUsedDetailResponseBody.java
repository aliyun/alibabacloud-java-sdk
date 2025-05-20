// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormFsUsedDetailResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why the access was denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The total storage space of the cluster. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>85899345920</p>
     */
    @NameInMap("FsCapacity")
    public String fsCapacity;

    /**
     * <p>The cold storage space of the cluster. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>85899345920</p>
     */
    @NameInMap("FsCapacityCold")
    public String fsCapacityCold;

    /**
     * <p>The hot storage space of the cluster. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>85899345920</p>
     */
    @NameInMap("FsCapacityHot")
    public String fsCapacityHot;

    /**
     * <p>The cold storage usage of the cluster. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedCold")
    public String fsUsedCold;

    /**
     * <p>The cold storage usage of the table data of the search engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedColdOnLindormSearch")
    public String fsUsedColdOnLindormSearch;

    /**
     * <p>The cold storage usage of the table data of the time series engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedColdOnLindormTSDB")
    public String fsUsedColdOnLindormTSDB;

    /**
     * <p>The cold storage usage of the table data of the wide table engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedColdOnLindormTable")
    public String fsUsedColdOnLindormTable;

    /**
     * <p>The hot storage usage of the cluster. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedHot")
    public String fsUsedHot;

    /**
     * <p>The hot storage usage of the table data of the search engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedHotOnLindormSearch")
    public String fsUsedHotOnLindormSearch;

    /**
     * <p>The hot storage usage of the table data of the time series engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedHotOnLindormTSDB")
    public String fsUsedHotOnLindormTSDB;

    /**
     * <p>The hot storage usage of the table data of the wide table engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedHotOnLindormTable")
    public String fsUsedHotOnLindormTable;

    /**
     * <p>The storage usage of the search engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedOnLindormSearch")
    public String fsUsedOnLindormSearch;

    /**
     * <p>The storage usage of the time series engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedOnLindormTSDB")
    public String fsUsedOnLindormTSDB;

    /**
     * <p>The space usage of the wide table engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedOnLindormTable")
    public String fsUsedOnLindormTable;

    /**
     * <p>The storage usage of the table data of the wide table engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedOnLindormTableData")
    public String fsUsedOnLindormTableData;

    /**
     * <p>The storage usage of the log data of the wide table engine. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>33269</p>
     */
    @NameInMap("FsUsedOnLindormTableWAL")
    public String fsUsedOnLindormTableWAL;

    /**
     * <p>If the version of the underlying storage engine is 4.1.9 or later, the storage usage values returned for the LStorageUsageList parameter prevail. Storage details are returned based on the storage type.</p>
     */
    @NameInMap("LStorageUsageList")
    public java.util.List<GetLindormFsUsedDetailResponseBodyLStorageUsageList> LStorageUsageList;

    /**
     * <p>The request ID. Each request has a unique ID. You can use the request ID to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4F23D50C-400C-592C-9486-9D1E10179065</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the return value is valid. Valid values: true and false. If a value of false is returned, you must provide the request ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Valid")
    public String valid;

    public static GetLindormFsUsedDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormFsUsedDetailResponseBody self = new GetLindormFsUsedDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormFsUsedDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLindormFsUsedDetailResponseBody setFsCapacity(String fsCapacity) {
        this.fsCapacity = fsCapacity;
        return this;
    }
    public String getFsCapacity() {
        return this.fsCapacity;
    }

    public GetLindormFsUsedDetailResponseBody setFsCapacityCold(String fsCapacityCold) {
        this.fsCapacityCold = fsCapacityCold;
        return this;
    }
    public String getFsCapacityCold() {
        return this.fsCapacityCold;
    }

    public GetLindormFsUsedDetailResponseBody setFsCapacityHot(String fsCapacityHot) {
        this.fsCapacityHot = fsCapacityHot;
        return this;
    }
    public String getFsCapacityHot() {
        return this.fsCapacityHot;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedCold(String fsUsedCold) {
        this.fsUsedCold = fsUsedCold;
        return this;
    }
    public String getFsUsedCold() {
        return this.fsUsedCold;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedColdOnLindormSearch(String fsUsedColdOnLindormSearch) {
        this.fsUsedColdOnLindormSearch = fsUsedColdOnLindormSearch;
        return this;
    }
    public String getFsUsedColdOnLindormSearch() {
        return this.fsUsedColdOnLindormSearch;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedColdOnLindormTSDB(String fsUsedColdOnLindormTSDB) {
        this.fsUsedColdOnLindormTSDB = fsUsedColdOnLindormTSDB;
        return this;
    }
    public String getFsUsedColdOnLindormTSDB() {
        return this.fsUsedColdOnLindormTSDB;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedColdOnLindormTable(String fsUsedColdOnLindormTable) {
        this.fsUsedColdOnLindormTable = fsUsedColdOnLindormTable;
        return this;
    }
    public String getFsUsedColdOnLindormTable() {
        return this.fsUsedColdOnLindormTable;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedHot(String fsUsedHot) {
        this.fsUsedHot = fsUsedHot;
        return this;
    }
    public String getFsUsedHot() {
        return this.fsUsedHot;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedHotOnLindormSearch(String fsUsedHotOnLindormSearch) {
        this.fsUsedHotOnLindormSearch = fsUsedHotOnLindormSearch;
        return this;
    }
    public String getFsUsedHotOnLindormSearch() {
        return this.fsUsedHotOnLindormSearch;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedHotOnLindormTSDB(String fsUsedHotOnLindormTSDB) {
        this.fsUsedHotOnLindormTSDB = fsUsedHotOnLindormTSDB;
        return this;
    }
    public String getFsUsedHotOnLindormTSDB() {
        return this.fsUsedHotOnLindormTSDB;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedHotOnLindormTable(String fsUsedHotOnLindormTable) {
        this.fsUsedHotOnLindormTable = fsUsedHotOnLindormTable;
        return this;
    }
    public String getFsUsedHotOnLindormTable() {
        return this.fsUsedHotOnLindormTable;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedOnLindormSearch(String fsUsedOnLindormSearch) {
        this.fsUsedOnLindormSearch = fsUsedOnLindormSearch;
        return this;
    }
    public String getFsUsedOnLindormSearch() {
        return this.fsUsedOnLindormSearch;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedOnLindormTSDB(String fsUsedOnLindormTSDB) {
        this.fsUsedOnLindormTSDB = fsUsedOnLindormTSDB;
        return this;
    }
    public String getFsUsedOnLindormTSDB() {
        return this.fsUsedOnLindormTSDB;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedOnLindormTable(String fsUsedOnLindormTable) {
        this.fsUsedOnLindormTable = fsUsedOnLindormTable;
        return this;
    }
    public String getFsUsedOnLindormTable() {
        return this.fsUsedOnLindormTable;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedOnLindormTableData(String fsUsedOnLindormTableData) {
        this.fsUsedOnLindormTableData = fsUsedOnLindormTableData;
        return this;
    }
    public String getFsUsedOnLindormTableData() {
        return this.fsUsedOnLindormTableData;
    }

    public GetLindormFsUsedDetailResponseBody setFsUsedOnLindormTableWAL(String fsUsedOnLindormTableWAL) {
        this.fsUsedOnLindormTableWAL = fsUsedOnLindormTableWAL;
        return this;
    }
    public String getFsUsedOnLindormTableWAL() {
        return this.fsUsedOnLindormTableWAL;
    }

    public GetLindormFsUsedDetailResponseBody setLStorageUsageList(java.util.List<GetLindormFsUsedDetailResponseBodyLStorageUsageList> LStorageUsageList) {
        this.LStorageUsageList = LStorageUsageList;
        return this;
    }
    public java.util.List<GetLindormFsUsedDetailResponseBodyLStorageUsageList> getLStorageUsageList() {
        return this.LStorageUsageList;
    }

    public GetLindormFsUsedDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormFsUsedDetailResponseBody setValid(String valid) {
        this.valid = valid;
        return this;
    }
    public String getValid() {
        return this.valid;
    }

    public static class GetLindormFsUsedDetailResponseBodyLStorageUsageList extends TeaModel {
        /**
         * <p>The total storage capacity. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>85899345920</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <p>The storage type of the cluster. Valid values:</p>
         * <ul>
         * <li>StandardCloudStorage</li>
         * <li>PerformanceCloudStorage</li>
         * <li>CapacityCloudStorage</li>
         * <li>LocalSsdStorage</li>
         * <li>LocalHddStorage</li>
         * <li>LocalEbsStorage</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StandardCloudStorage</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The storage usage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        @NameInMap("Used")
        public String used;

        /**
         * <p>The storage usage of the search engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        @NameInMap("UsedLindormSearch")
        public String usedLindormSearch;

        /**
         * <p>The storage usage of the compute engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        @NameInMap("UsedLindormSpark")
        public String usedLindormSpark;

        /**
         * <p>The storage usage of the wide table engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        @NameInMap("UsedLindormTable")
        public String usedLindormTable;

        /**
         * <p>The storage usage of the time series engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        @NameInMap("UsedLindormTsdb")
        public String usedLindormTsdb;

        /**
         * <p>The storage usage of other resources, such as logs and recycle bins. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        @NameInMap("UsedOther")
        public String usedOther;

        public static GetLindormFsUsedDetailResponseBodyLStorageUsageList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormFsUsedDetailResponseBodyLStorageUsageList self = new GetLindormFsUsedDetailResponseBodyLStorageUsageList();
            return TeaModel.build(map, self);
        }

        public GetLindormFsUsedDetailResponseBodyLStorageUsageList setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public GetLindormFsUsedDetailResponseBodyLStorageUsageList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetLindormFsUsedDetailResponseBodyLStorageUsageList setUsed(String used) {
            this.used = used;
            return this;
        }
        public String getUsed() {
            return this.used;
        }

        public GetLindormFsUsedDetailResponseBodyLStorageUsageList setUsedLindormSearch(String usedLindormSearch) {
            this.usedLindormSearch = usedLindormSearch;
            return this;
        }
        public String getUsedLindormSearch() {
            return this.usedLindormSearch;
        }

        public GetLindormFsUsedDetailResponseBodyLStorageUsageList setUsedLindormSpark(String usedLindormSpark) {
            this.usedLindormSpark = usedLindormSpark;
            return this;
        }
        public String getUsedLindormSpark() {
            return this.usedLindormSpark;
        }

        public GetLindormFsUsedDetailResponseBodyLStorageUsageList setUsedLindormTable(String usedLindormTable) {
            this.usedLindormTable = usedLindormTable;
            return this;
        }
        public String getUsedLindormTable() {
            return this.usedLindormTable;
        }

        public GetLindormFsUsedDetailResponseBodyLStorageUsageList setUsedLindormTsdb(String usedLindormTsdb) {
            this.usedLindormTsdb = usedLindormTsdb;
            return this;
        }
        public String getUsedLindormTsdb() {
            return this.usedLindormTsdb;
        }

        public GetLindormFsUsedDetailResponseBodyLStorageUsageList setUsedOther(String usedOther) {
            this.usedOther = usedOther;
            return this;
        }
        public String getUsedOther() {
            return this.usedOther;
        }

    }

}
