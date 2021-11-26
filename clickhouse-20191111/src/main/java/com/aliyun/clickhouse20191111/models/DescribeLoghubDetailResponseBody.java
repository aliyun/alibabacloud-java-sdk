// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLoghubDetailResponseBody extends TeaModel {
    @NameInMap("LoghubInfo")
    public DescribeLoghubDetailResponseBodyLoghubInfo loghubInfo;

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
        @NameInMap("FieldKey")
        public String fieldKey;

        @NameInMap("LogKey")
        public String logKey;

        @NameInMap("Type")
        public String type;

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

        public DescribeLoghubDetailResponseBodyLoghubInfoLogHubStoresLogHubStore setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AccessSecret")
        public String accessSecret;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DeliverName")
        public String deliverName;

        @NameInMap("DeliverTime")
        public String deliverTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainUrl")
        public String domainUrl;

        @NameInMap("FilterDirtyData")
        public Boolean filterDirtyData;

        @NameInMap("LogHubStores")
        public DescribeLoghubDetailResponseBodyLoghubInfoLogHubStores logHubStores;

        @NameInMap("LogStoreName")
        public String logStoreName;

        @NameInMap("Password")
        public String password;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeLoghubDetailResponseBodyLoghubInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoghubDetailResponseBodyLoghubInfo self = new DescribeLoghubDetailResponseBodyLoghubInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public DescribeLoghubDetailResponseBodyLoghubInfo setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
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

        public DescribeLoghubDetailResponseBodyLoghubInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
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
