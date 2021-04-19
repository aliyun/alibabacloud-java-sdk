// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class OperateLogHubRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("Create")
    public Boolean create;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("DeliverName")
    public String deliverName;

    @NameInMap("DeliverTime")
    public String deliverTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainUrl")
    public String domainUrl;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Password")
    public String password;

    @NameInMap("FilterDirtyData")
    public Boolean filterDirtyData;

    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("AccessSecret")
    public String accessSecret;

    @NameInMap("UseLorne")
    public Boolean useLorne;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("LogHubStores")
    public java.util.List<OperateLogHubRequestLogHubStores> logHubStores;

    public static OperateLogHubRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateLogHubRequest self = new OperateLogHubRequest();
        return TeaModel.build(map, self);
    }

    public OperateLogHubRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OperateLogHubRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public OperateLogHubRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public OperateLogHubRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
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

    public OperateLogHubRequest setFilterDirtyData(Boolean filterDirtyData) {
        this.filterDirtyData = filterDirtyData;
        return this;
    }
    public Boolean getFilterDirtyData() {
        return this.filterDirtyData;
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

    public OperateLogHubRequest setUseLorne(Boolean useLorne) {
        this.useLorne = useLorne;
        return this;
    }
    public Boolean getUseLorne() {
        return this.useLorne;
    }

    public OperateLogHubRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OperateLogHubRequest setLogHubStores(java.util.List<OperateLogHubRequestLogHubStores> logHubStores) {
        this.logHubStores = logHubStores;
        return this;
    }
    public java.util.List<OperateLogHubRequestLogHubStores> getLogHubStores() {
        return this.logHubStores;
    }

    public static class OperateLogHubRequestLogHubStores extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("LogKey")
        public String logKey;

        @NameInMap("FieldKey")
        public String fieldKey;

        public static OperateLogHubRequestLogHubStores build(java.util.Map<String, ?> map) throws Exception {
            OperateLogHubRequestLogHubStores self = new OperateLogHubRequestLogHubStores();
            return TeaModel.build(map, self);
        }

        public OperateLogHubRequestLogHubStores setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    }

}
