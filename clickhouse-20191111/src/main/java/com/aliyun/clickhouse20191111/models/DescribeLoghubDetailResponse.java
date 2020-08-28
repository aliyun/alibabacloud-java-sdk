// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLoghubDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LoghubInfo")
    @Validation(required = true)
    public DescribeLoghubDetailResponseLoghubInfo loghubInfo;

    public static DescribeLoghubDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoghubDetailResponse self = new DescribeLoghubDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoghubDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoghubDetailResponse setLoghubInfo(DescribeLoghubDetailResponseLoghubInfo loghubInfo) {
        this.loghubInfo = loghubInfo;
        return this;
    }
    public DescribeLoghubDetailResponseLoghubInfo getLoghubInfo() {
        return this.loghubInfo;
    }

    public static class DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore extends TeaModel {
        @NameInMap("LogKey")
        @Validation(required = true)
        public String logKey;

        @NameInMap("FieldKey")
        @Validation(required = true)
        public String fieldKey;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore self = new DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore();
            return TeaModel.build(map, self);
        }

        public DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore setLogKey(String logKey) {
            this.logKey = logKey;
            return this;
        }
        public String getLogKey() {
            return this.logKey;
        }

        public DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeLoghubDetailResponseLoghubInfoLogHubStores extends TeaModel {
        @NameInMap("LogHubStore")
        @Validation(required = true)
        public java.util.List<DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore> logHubStore;

        public static DescribeLoghubDetailResponseLoghubInfoLogHubStores build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoghubDetailResponseLoghubInfoLogHubStores self = new DescribeLoghubDetailResponseLoghubInfoLogHubStores();
            return TeaModel.build(map, self);
        }

        public DescribeLoghubDetailResponseLoghubInfoLogHubStores setLogHubStore(java.util.List<DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore> logHubStore) {
            this.logHubStore = logHubStore;
            return this;
        }
        public java.util.List<DescribeLoghubDetailResponseLoghubInfoLogHubStoresLogHubStore> getLogHubStore() {
            return this.logHubStore;
        }

    }

    public static class DescribeLoghubDetailResponseLoghubInfo extends TeaModel {
        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("LogStoreName")
        @Validation(required = true)
        public String logStoreName;

        @NameInMap("DeliverName")
        @Validation(required = true)
        public String deliverName;

        @NameInMap("DeliverTime")
        @Validation(required = true)
        public String deliverTime;

        @NameInMap("DomainUrl")
        @Validation(required = true)
        public String domainUrl;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        @NameInMap("FilterDirtyData")
        @Validation(required = true)
        public Boolean filterDirtyData;

        @NameInMap("AccessKey")
        @Validation(required = true)
        public String accessKey;

        @NameInMap("AccessSecret")
        @Validation(required = true)
        public String accessSecret;

        @NameInMap("DBType")
        @Validation(required = true)
        public String DBType;

        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("LogHubStores")
        @Validation(required = true)
        public DescribeLoghubDetailResponseLoghubInfoLogHubStores logHubStores;

        public static DescribeLoghubDetailResponseLoghubInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoghubDetailResponseLoghubInfo self = new DescribeLoghubDetailResponseLoghubInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLoghubDetailResponseLoghubInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeLoghubDetailResponseLoghubInfo setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeLoghubDetailResponseLoghubInfo setDeliverName(String deliverName) {
            this.deliverName = deliverName;
            return this;
        }
        public String getDeliverName() {
            return this.deliverName;
        }

        public DescribeLoghubDetailResponseLoghubInfo setDeliverTime(String deliverTime) {
            this.deliverTime = deliverTime;
            return this;
        }
        public String getDeliverTime() {
            return this.deliverTime;
        }

        public DescribeLoghubDetailResponseLoghubInfo setDomainUrl(String domainUrl) {
            this.domainUrl = domainUrl;
            return this;
        }
        public String getDomainUrl() {
            return this.domainUrl;
        }

        public DescribeLoghubDetailResponseLoghubInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoghubDetailResponseLoghubInfo setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeLoghubDetailResponseLoghubInfo setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeLoghubDetailResponseLoghubInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLoghubDetailResponseLoghubInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeLoghubDetailResponseLoghubInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeLoghubDetailResponseLoghubInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeLoghubDetailResponseLoghubInfo setFilterDirtyData(Boolean filterDirtyData) {
            this.filterDirtyData = filterDirtyData;
            return this;
        }
        public Boolean getFilterDirtyData() {
            return this.filterDirtyData;
        }

        public DescribeLoghubDetailResponseLoghubInfo setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public DescribeLoghubDetailResponseLoghubInfo setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public DescribeLoghubDetailResponseLoghubInfo setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeLoghubDetailResponseLoghubInfo setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeLoghubDetailResponseLoghubInfo setLogHubStores(DescribeLoghubDetailResponseLoghubInfoLogHubStores logHubStores) {
            this.logHubStores = logHubStores;
            return this;
        }
        public DescribeLoghubDetailResponseLoghubInfoLogHubStores getLogHubStores() {
            return this.logHubStores;
        }

    }

}
