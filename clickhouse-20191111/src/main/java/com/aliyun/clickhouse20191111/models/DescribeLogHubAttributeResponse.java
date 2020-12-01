// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLogHubAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LoghubInfo")
    @Validation(required = true)
    public DescribeLogHubAttributeResponseLoghubInfo loghubInfo;

    public static DescribeLogHubAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogHubAttributeResponse self = new DescribeLogHubAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogHubAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogHubAttributeResponse setLoghubInfo(DescribeLogHubAttributeResponseLoghubInfo loghubInfo) {
        this.loghubInfo = loghubInfo;
        return this;
    }
    public DescribeLogHubAttributeResponseLoghubInfo getLoghubInfo() {
        return this.loghubInfo;
    }

    public static class DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore extends TeaModel {
        @NameInMap("LogKey")
        @Validation(required = true)
        public String logKey;

        @NameInMap("FieldKey")
        @Validation(required = true)
        public String fieldKey;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore self = new DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore();
            return TeaModel.build(map, self);
        }

        public DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore setLogKey(String logKey) {
            this.logKey = logKey;
            return this;
        }
        public String getLogKey() {
            return this.logKey;
        }

        public DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeLogHubAttributeResponseLoghubInfoLogHubStores extends TeaModel {
        @NameInMap("LogHubStore")
        @Validation(required = true)
        public java.util.List<DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore> logHubStore;

        public static DescribeLogHubAttributeResponseLoghubInfoLogHubStores build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogHubAttributeResponseLoghubInfoLogHubStores self = new DescribeLogHubAttributeResponseLoghubInfoLogHubStores();
            return TeaModel.build(map, self);
        }

        public DescribeLogHubAttributeResponseLoghubInfoLogHubStores setLogHubStore(java.util.List<DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore> logHubStore) {
            this.logHubStore = logHubStore;
            return this;
        }
        public java.util.List<DescribeLogHubAttributeResponseLoghubInfoLogHubStoresLogHubStore> getLogHubStore() {
            return this.logHubStore;
        }

    }

    public static class DescribeLogHubAttributeResponseLoghubInfo extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("DeliverName")
        @Validation(required = true)
        public String deliverName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("LogStoreName")
        @Validation(required = true)
        public String logStoreName;

        @NameInMap("DBType")
        @Validation(required = true)
        public String DBType;

        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("FilterDirtyData")
        @Validation(required = true)
        public String filterDirtyData;

        @NameInMap("DeliverTime")
        @Validation(required = true)
        public String deliverTime;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        @NameInMap("DomainUrl")
        @Validation(required = true)
        public String domainUrl;

        @NameInMap("LogHubStores")
        @Validation(required = true)
        public DescribeLogHubAttributeResponseLoghubInfoLogHubStores logHubStores;

        public static DescribeLogHubAttributeResponseLoghubInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogHubAttributeResponseLoghubInfo self = new DescribeLogHubAttributeResponseLoghubInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLogHubAttributeResponseLoghubInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setDeliverName(String deliverName) {
            this.deliverName = deliverName;
            return this;
        }
        public String getDeliverName() {
            return this.deliverName;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setFilterDirtyData(String filterDirtyData) {
            this.filterDirtyData = filterDirtyData;
            return this;
        }
        public String getFilterDirtyData() {
            return this.filterDirtyData;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setDeliverTime(String deliverTime) {
            this.deliverTime = deliverTime;
            return this;
        }
        public String getDeliverTime() {
            return this.deliverTime;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setDomainUrl(String domainUrl) {
            this.domainUrl = domainUrl;
            return this;
        }
        public String getDomainUrl() {
            return this.domainUrl;
        }

        public DescribeLogHubAttributeResponseLoghubInfo setLogHubStores(DescribeLogHubAttributeResponseLoghubInfoLogHubStores logHubStores) {
            this.logHubStores = logHubStores;
            return this;
        }
        public DescribeLogHubAttributeResponseLoghubInfoLogHubStores getLogHubStores() {
            return this.logHubStores;
        }

    }

}
