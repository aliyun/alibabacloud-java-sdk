// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class OperateLogHubRequest extends TeaModel {
    @NameInMap("Create")
    @Validation(required = true)
    public Boolean create;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

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

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("DomainUrl")
    @Validation(required = true)
    public String domainUrl;

    @NameInMap("SchemaName")
    @Validation(required = true)
    public String schemaName;

    @NameInMap("TableName")
    @Validation(required = true)
    public String tableName;

    @NameInMap("UserName")
    @Validation(required = true)
    public String userName;

    @NameInMap("Password")
    @Validation(required = true)
    public String password;

    @NameInMap("FilterDirty")
    public Boolean filterDirty;

    @NameInMap("LogHubStores")
    @Validation(required = true)
    public java.util.List<OperateLogHubRequestLogHubStores> logHubStores;

    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("AccessSecret")
    public String accessSecret;

    public static OperateLogHubRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateLogHubRequest self = new OperateLogHubRequest();
        return TeaModel.build(map, self);
    }

    public OperateLogHubRequest setCreate(Boolean create) {
        this.create = create;
        return this;
    }
    public Boolean getCreate() {
        return this.create;
    }

    public OperateLogHubRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public OperateLogHubRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public OperateLogHubRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public OperateLogHubRequest setDeliverName(String deliverName) {
        this.deliverName = deliverName;
        return this;
    }
    public String getDeliverName() {
        return this.deliverName;
    }

    public OperateLogHubRequest setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
        return this;
    }
    public String getDeliverTime() {
        return this.deliverTime;
    }

    public OperateLogHubRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OperateLogHubRequest setDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
        return this;
    }
    public String getDomainUrl() {
        return this.domainUrl;
    }

    public OperateLogHubRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public OperateLogHubRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public OperateLogHubRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public OperateLogHubRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public OperateLogHubRequest setFilterDirty(Boolean filterDirty) {
        this.filterDirty = filterDirty;
        return this;
    }
    public Boolean getFilterDirty() {
        return this.filterDirty;
    }

    public OperateLogHubRequest setLogHubStores(java.util.List<OperateLogHubRequestLogHubStores> logHubStores) {
        this.logHubStores = logHubStores;
        return this;
    }
    public java.util.List<OperateLogHubRequestLogHubStores> getLogHubStores() {
        return this.logHubStores;
    }

    public OperateLogHubRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public OperateLogHubRequest setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public static class OperateLogHubRequestLogHubStores extends TeaModel {
        @NameInMap("LogKey")
        @Validation(required = true)
        public String logKey;

        @NameInMap("FieldKey")
        @Validation(required = true)
        public String fieldKey;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static OperateLogHubRequestLogHubStores build(java.util.Map<String, ?> map) throws Exception {
            OperateLogHubRequestLogHubStores self = new OperateLogHubRequestLogHubStores();
            return TeaModel.build(map, self);
        }

        public OperateLogHubRequestLogHubStores setLogKey(String logKey) {
            this.logKey = logKey;
            return this;
        }
        public String getLogKey() {
            return this.logKey;
        }

        public OperateLogHubRequestLogHubStores setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public OperateLogHubRequestLogHubStores setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
