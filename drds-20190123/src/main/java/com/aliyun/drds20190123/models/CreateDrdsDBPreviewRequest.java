// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsDBPreviewRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DbInstType")
    public String dbInstType;

    @NameInMap("DbInstanceIsCreating")
    public Boolean dbInstanceIsCreating;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("InstDbName")
    public java.util.List<CreateDrdsDBPreviewRequestInstDbName> instDbName;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RdsInstance")
    public java.util.List<String> rdsInstance;

    @NameInMap("Type")
    public String type;

    public static CreateDrdsDBPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsDBPreviewRequest self = new CreateDrdsDBPreviewRequest();
        return TeaModel.build(map, self);
    }

    public CreateDrdsDBPreviewRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateDrdsDBPreviewRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public CreateDrdsDBPreviewRequest setDbInstanceIsCreating(Boolean dbInstanceIsCreating) {
        this.dbInstanceIsCreating = dbInstanceIsCreating;
        return this;
    }
    public Boolean getDbInstanceIsCreating() {
        return this.dbInstanceIsCreating;
    }

    public CreateDrdsDBPreviewRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDrdsDBPreviewRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateDrdsDBPreviewRequest setInstDbName(java.util.List<CreateDrdsDBPreviewRequestInstDbName> instDbName) {
        this.instDbName = instDbName;
        return this;
    }
    public java.util.List<CreateDrdsDBPreviewRequestInstDbName> getInstDbName() {
        return this.instDbName;
    }

    public CreateDrdsDBPreviewRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDrdsDBPreviewRequest setRdsInstance(java.util.List<String> rdsInstance) {
        this.rdsInstance = rdsInstance;
        return this;
    }
    public java.util.List<String> getRdsInstance() {
        return this.rdsInstance;
    }

    public CreateDrdsDBPreviewRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateDrdsDBPreviewRequestInstDbName extends TeaModel {
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("ShardDbName")
        public java.util.List<String> shardDbName;

        public static CreateDrdsDBPreviewRequestInstDbName build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsDBPreviewRequestInstDbName self = new CreateDrdsDBPreviewRequestInstDbName();
            return TeaModel.build(map, self);
        }

        public CreateDrdsDBPreviewRequestInstDbName setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public CreateDrdsDBPreviewRequestInstDbName setShardDbName(java.util.List<String> shardDbName) {
            this.shardDbName = shardDbName;
            return this;
        }
        public java.util.List<String> getShardDbName() {
            return this.shardDbName;
        }

    }

}
