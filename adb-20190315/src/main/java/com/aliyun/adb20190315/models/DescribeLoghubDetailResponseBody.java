// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeLoghubDetailResponseBody extends TeaModel {
    /**
     * <p>The queried log collection information.</p>
     */
    @NameInMap("LoghubInfo")
    public DescribeLoghubDetailResponseBodyLoghubInfo loghubInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLoghubDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoghubDetailResponseBody self = new DescribeLoghubDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoghubDetailResponseBody setLoghubInfo(DescribeLoghubDetailResponseBodyLoghubInfo loghubInfo) {
        this.loghubInfo = loghubInfo;
        return this;
    }
    public DescribeLoghubDetailResponseBodyLoghubInfo getLoghubInfo() {
        return this.loghubInfo;
    }

    public DescribeLoghubDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore extends TeaModel {
        /**
         * <p>The value of the log keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>channel_id</p>
         */
        @NameInMap("FieldKey")
        public String fieldKey;

        /**
         * <p>The log keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>put_request</p>
         */
        @NameInMap("LogKey")
        public String logKey;

        public static DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore self = new DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore();
            return TeaModel.build(map, self);
        }

        public DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore setLogKey(String logKey) {
            this.logKey = logKey;
            return this;
        }
        public String getLogKey() {
            return this.logKey;
        }

    }

    public static class DescribeLoghubDetailResponseBodyLoghubInfoLogHubStores extends TeaModel {
        @NameInMap("LogHubStore")
        public java.util.List<DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore> logHubStore;

        public static DescribeLoghubDetailResponseBodyLoghubInfoLogHubStores build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoghubDetailResponseBodyLoghubInfoLogHubStores self = new DescribeLoghubDetailResponseBodyLoghubInfoLogHubStores();
            return TeaModel.build(map, self);
        }

        public DescribeLoghubDetailResponseBodyLoghubInfoLogHubStores setLogHubStore(java.util.List<DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore> logHubStore) {
            this.logHubStore = logHubStore;
            return this;
        }
        public java.util.List<DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore> getLogHubStore() {
            return this.logHubStore;
        }

    }

    public static class DescribeLoghubDetailResponseBodyLoghubInfo extends TeaModel {
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
         * <p>The name of the log shipping job.</p>
         * 
         * <strong>example:</strong>
         * <p>hub-pay-callback-ykt</p>
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
         * <p>aaa</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1p38m2c26s7hpk690650.ads.aliyuncs.com</p>
         */
        @NameInMap("DomainUrl")
        public String domainUrl;

        /**
         * <p>Indicates whether dirty data is filtered.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FilterDirtyData")
        public Boolean filterDirtyData;

        /**
         * <p>The log keywords.</p>
         */
        @NameInMap("LogHubStores")
        public DescribeLoghubDetailResponseBodyLoghubInfoLogHubStores logHubStores;

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>device_login</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

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
         * <p>cn-shenzhen</p>
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
         * <p>test</p>
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

        public static DescribeLoghubDetailResponseBodyLoghubInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoghubDetailResponseBodyLoghubInfo self = new DescribeLoghubDetailResponseBodyLoghubInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setDeliverName(String deliverName) {
            this.deliverName = deliverName;
            return this;
        }
        public String getDeliverName() {
            return this.deliverName;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setDeliverTime(String deliverTime) {
            this.deliverTime = deliverTime;
            return this;
        }
        public String getDeliverTime() {
            return this.deliverTime;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setDomainUrl(String domainUrl) {
            this.domainUrl = domainUrl;
            return this;
        }
        public String getDomainUrl() {
            return this.domainUrl;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setFilterDirtyData(Boolean filterDirtyData) {
            this.filterDirtyData = filterDirtyData;
            return this;
        }
        public Boolean getFilterDirtyData() {
            return this.filterDirtyData;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setLogHubStores(DescribeLoghubDetailResponseBodyLoghubInfoLogHubStores logHubStores) {
            this.logHubStores = logHubStores;
            return this;
        }
        public DescribeLoghubDetailResponseBodyLoghubInfoLogHubStores getLogHubStores() {
            return this.logHubStores;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
