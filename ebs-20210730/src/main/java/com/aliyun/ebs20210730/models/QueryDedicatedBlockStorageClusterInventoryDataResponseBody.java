// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class QueryDedicatedBlockStorageClusterInventoryDataResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData> data;

    /**
     * <p>The ID of the dedicated block storage cluster.</p>
     */
    @NameInMap("DbscId")
    public String dbscId;

    /**
     * <p>The name of the dedicated block storage cluster.</p>
     */
    @NameInMap("DbscName")
    public String dbscName;

    /**
     * <p>The type of the disk. Valid values:</p>
     * <br>
     * <p>*   cloud_essd: enhanced SSD (ESSD).</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryDedicatedBlockStorageClusterInventoryDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDedicatedBlockStorageClusterInventoryDataResponseBody self = new QueryDedicatedBlockStorageClusterInventoryDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDedicatedBlockStorageClusterInventoryDataResponseBody setData(java.util.List<QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataResponseBody setDbscId(String dbscId) {
        this.dbscId = dbscId;
        return this;
    }
    public String getDbscId() {
        return this.dbscId;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataResponseBody setDbscName(String dbscName) {
        this.dbscName = dbscName;
        return this;
    }
    public String getDbscName() {
        return this.dbscName;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataResponseBody setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryDedicatedBlockStorageClusterInventoryDataResponseBodyDataMonitorItems extends TeaModel {
        /**
         * <p>Available capacity size of the dedicated block storage cluster.</p>
         */
        @NameInMap("AvailableSize")
        public Long availableSize;

        /**
         * <p>Total capacity size of the dedicated block storage cluster.</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static QueryDedicatedBlockStorageClusterInventoryDataResponseBodyDataMonitorItems build(java.util.Map<String, ?> map) throws Exception {
            QueryDedicatedBlockStorageClusterInventoryDataResponseBodyDataMonitorItems self = new QueryDedicatedBlockStorageClusterInventoryDataResponseBodyDataMonitorItems();
            return TeaModel.build(map, self);
        }

        public QueryDedicatedBlockStorageClusterInventoryDataResponseBodyDataMonitorItems setAvailableSize(Long availableSize) {
            this.availableSize = availableSize;
            return this;
        }
        public Long getAvailableSize() {
            return this.availableSize;
        }

        public QueryDedicatedBlockStorageClusterInventoryDataResponseBodyDataMonitorItems setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData extends TeaModel {
        /**
         * <p>The returned metrics.</p>
         */
        @NameInMap("MonitorItems")
        public QueryDedicatedBlockStorageClusterInventoryDataResponseBodyDataMonitorItems monitorItems;

        /**
         * <p>The ID list of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The timestamp when the data is collected.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData self = new QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData setMonitorItems(QueryDedicatedBlockStorageClusterInventoryDataResponseBodyDataMonitorItems monitorItems) {
            this.monitorItems = monitorItems;
            return this;
        }
        public QueryDedicatedBlockStorageClusterInventoryDataResponseBodyDataMonitorItems getMonitorItems() {
            return this.monitorItems;
        }

        public QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryDedicatedBlockStorageClusterInventoryDataResponseBodyData setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
