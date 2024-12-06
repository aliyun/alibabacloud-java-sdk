// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSyncAvailableDBClusterListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FBD1DD96-AD1D-516C-9D9A-60BA081F66EE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SyncAvailableDBClusters")
    public java.util.List<DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters> syncAvailableDBClusters;

    public static DescribeSyncAvailableDBClusterListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncAvailableDBClusterListResponseBody self = new DescribeSyncAvailableDBClusterListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncAvailableDBClusterListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyncAvailableDBClusterListResponseBody setSyncAvailableDBClusters(java.util.List<DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters> syncAvailableDBClusters) {
        this.syncAvailableDBClusters = syncAvailableDBClusters;
        return this;
    }
    public java.util.List<DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters> getSyncAvailableDBClusters() {
        return this.syncAvailableDBClusters;
    }

    public static class DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DB1</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <strong>example:</strong>
         * <p>rm-bp1l3yh04y7us147n</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("StorageSize")
        public Float storageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TableNumber")
        public Integer tableNumber;

        public static DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters self = new DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters();
            return TeaModel.build(map, self);
        }

        public DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters setStorageSize(Float storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Float getStorageSize() {
            return this.storageSize;
        }

        public DescribeSyncAvailableDBClusterListResponseBodySyncAvailableDBClusters setTableNumber(Integer tableNumber) {
            this.tableNumber = tableNumber;
            return this;
        }
        public Integer getTableNumber() {
            return this.tableNumber;
        }

    }

}
