// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLogHubAttributeResponseBody extends TeaModel {
    @NameInMap("LoghubInfo")
    public DescribeLogHubAttributeResponseBodyLoghubInfo loghubInfo;

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
        @NameInMap("FieldKey")
        public String fieldKey;

        @NameInMap("LogKey")
        public String logKey;

        @NameInMap("Type")
        public String type;

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

        public DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStoresLogHubStore setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
        public String filterDirtyData;

        @NameInMap("Id")
        public String id;

        @NameInMap("LogHubStores")
        public DescribeLogHubAttributeResponseBodyLoghubInfoLogHubStores logHubStores;

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

        public DescribeLogHubAttributeResponseBodyLoghubInfo setDomainUrl(String domainUrl) {
            this.domainUrl = domainUrl;
            return this;
        }
        public String getDomainUrl() {
            return this.domainUrl;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setFilterDirtyData(String filterDirtyData) {
            this.filterDirtyData = filterDirtyData;
            return this;
        }
        public String getFilterDirtyData() {
            return this.filterDirtyData;
        }

        public DescribeLogHubAttributeResponseBodyLoghubInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

        public DescribeLogHubAttributeResponseBodyLoghubInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
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
