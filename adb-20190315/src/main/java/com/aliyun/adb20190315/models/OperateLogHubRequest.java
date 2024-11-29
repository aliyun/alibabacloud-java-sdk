// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class OperateLogHubRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Create")
    public Boolean create;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-uf6rtqaj25491628z</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xhxsblz_limited_gift_pay</p>
     */
    @NameInMap("DeliverName")
    public String deliverName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-24\&quot;T\&quot;13:10\&quot;Z\&quot;</p>
     */
    @NameInMap("DeliverTime")
    public String deliverTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FilterDirtyData")
    public Boolean filterDirtyData;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LogHubStores")
    public java.util.List<OperateLogHubRequestLogHubStores> logHubStores;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>beta-game-mjxb-ham-pool-export</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ads_123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-adb</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("Provider")
    public String provider;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wddata</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rest_action_latest</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("UserName")
    public String userName;

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

    public OperateLogHubRequest setFilterDirtyData(Boolean filterDirtyData) {
        this.filterDirtyData = filterDirtyData;
        return this;
    }
    public Boolean getFilterDirtyData() {
        return this.filterDirtyData;
    }

    public OperateLogHubRequest setLogHubStores(java.util.List<OperateLogHubRequestLogHubStores> logHubStores) {
        this.logHubStores = logHubStores;
        return this;
    }
    public java.util.List<OperateLogHubRequestLogHubStores> getLogHubStores() {
        return this.logHubStores;
    }

    public OperateLogHubRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public OperateLogHubRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public OperateLogHubRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OperateLogHubRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public OperateLogHubRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public OperateLogHubRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
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

    public static class OperateLogHubRequestLogHubStores extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("FieldKey")
        public String fieldKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("LogKey")
        public String logKey;

        public static OperateLogHubRequestLogHubStores build(java.util.Map<String, ?> map) throws Exception {
            OperateLogHubRequestLogHubStores self = new OperateLogHubRequestLogHubStores();
            return TeaModel.build(map, self);
        }

        public OperateLogHubRequestLogHubStores setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public OperateLogHubRequestLogHubStores setLogKey(String logKey) {
            this.logKey = logKey;
            return this;
        }
        public String getLogKey() {
            return this.logKey;
        }

    }

}
