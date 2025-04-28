// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeLogHubAttributeResponseBody extends TeaModel {
    /**
     * <p>The log collection information.</p>
     */
    @NameInMap("LoghubInfo")
    public DescribeLogHubAttributeResponseBodyLoghubInfo loghubInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8A564B7F-8C00-43C0-8EC5-919FBB70573</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogHubAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogHubAttributeResponseBody self = new DescribeLogHubAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogHubAttributeResponseBody setLoghubInfo(DescribeLogHubAttributeResponseBodyLoghubInfo loghubInfo) {
        this.loghubInfo = loghubInfo;
        return this;
    }
    public DescribeLogHubAttributeResponseBodyLoghubInfo getLoghubInfo() {
        return this.loghubInfo;
    }

    public DescribeLogHubAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore extends TeaModel {
        /**
         * <p>The value of the log keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>255311</p>
         */
        @NameInMap("FieldKey")
        public String fieldKey;

        /**
         * <p>The log keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>taskid</p>
         */
        @NameInMap("LogKey")
        public String logKey;

        public static DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore self = new DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore();
            return TeaModel.build(map, self);
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore setLogKey(String logKey) {
            this.logKey = logKey;
            return this;
        }
        public String getLogKey() {
            return this.logKey;
        }

    }

    public static class DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStores extends TeaModel {
        @NameInMap("LogHubStore")
        public java.util.List<DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore> logHubStore;

        public static DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStores build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStores self = new DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStores();
            return TeaModel.build(map, self);
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStores setLogHubStore(java.util.List<DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore> logHubStore) {
            this.logHubStore = logHubStore;
            return this;
        }
        public java.util.List<DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore> getLogHubStore() {
            return this.logHubStore;
        }

    }

    public static class DescribeLogHubAttributeResponseBodyLoghubInfo extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-8vbs48m7553du1gz2</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The synchronization latency, which is the latency between the latest update time of the synchronization job and the current system time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>361</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <p>The name of the log shipping job.</p>
         * 
         * <strong>example:</strong>
         * <p>loghub-web-login-new</p>
         */
        @NameInMap("DeliverName")
        public String deliverName;

        /**
         * <p>The log shipping time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-06\&quot;T\&quot;10:15\&quot;Z\&quot;</p>
         */
        @NameInMap("DeliverTime")
        public String deliverTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether dirty data is filtered.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FilterDirtyData")
        public Boolean filterDirtyData;

        /**
         * <p>The names of the Logstores.</p>
         */
        @NameInMap("LogHubStores")
        public DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStores logHubStores;

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>device_login</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>test-adb</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>cbd_bi</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The synchronization status.</p>
         * 
         * <strong>example:</strong>
         * <p>processing</p>
         */
        @NameInMap("SyncStatus")
        public String syncStatus;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeLogHubAttributeResponseBodyLoghubInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogHubAttributeResponseBodyLoghubInfo self = new DescribeLogHubAttributeResponseBodyLoghubInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setDeliverName(String deliverName) {
            this.deliverName = deliverName;
            return this;
        }
        public String getDeliverName() {
            return this.deliverName;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setDeliverTime(String deliverTime) {
            this.deliverTime = deliverTime;
            return this;
        }
        public String getDeliverTime() {
            return this.deliverTime;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setFilterDirtyData(Boolean filterDirtyData) {
            this.filterDirtyData = filterDirtyData;
            return this;
        }
        public Boolean getFilterDirtyData() {
            return this.filterDirtyData;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setLogHubStores(DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStores logHubStores) {
            this.logHubStores = logHubStores;
            return this;
        }
        public DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStores getLogHubStores() {
            return this.logHubStores;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
