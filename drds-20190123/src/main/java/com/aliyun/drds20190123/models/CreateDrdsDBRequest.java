// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsDBRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("Encode")
    public String encode;

    @NameInMap("Password")
    public String password;

    @NameInMap("RdsInstance")
    public java.util.List<String> rdsInstance;

    @NameInMap("Type")
    public String type;

    @NameInMap("DbInstType")
    public String dbInstType;

    @NameInMap("RdsSuperAccount")
    public java.util.List<CreateDrdsDBRequestRdsSuperAccount> rdsSuperAccount;

    @NameInMap("InstDbName")
    public java.util.List<CreateDrdsDBRequestInstDbName> instDbName;

    @NameInMap("DbInstanceIsCreating")
    public Boolean dbInstanceIsCreating;

    @NameInMap("AccountName")
    public String accountName;

    public static CreateDrdsDBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsDBRequest self = new CreateDrdsDBRequest();
        return TeaModel.build(map, self);
    }

    public CreateDrdsDBRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateDrdsDBRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDrdsDBRequest setEncode(String encode) {
        this.encode = encode;
        return this;
    }
    public String getEncode() {
        return this.encode;
    }

    public CreateDrdsDBRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDrdsDBRequest setRdsInstance(java.util.List<String> rdsInstance) {
        this.rdsInstance = rdsInstance;
        return this;
    }
    public java.util.List<String> getRdsInstance() {
        return this.rdsInstance;
    }

    public CreateDrdsDBRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDrdsDBRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public CreateDrdsDBRequest setRdsSuperAccount(java.util.List<CreateDrdsDBRequestRdsSuperAccount> rdsSuperAccount) {
        this.rdsSuperAccount = rdsSuperAccount;
        return this;
    }
    public java.util.List<CreateDrdsDBRequestRdsSuperAccount> getRdsSuperAccount() {
        return this.rdsSuperAccount;
    }

    public CreateDrdsDBRequest setInstDbName(java.util.List<CreateDrdsDBRequestInstDbName> instDbName) {
        this.instDbName = instDbName;
        return this;
    }
    public java.util.List<CreateDrdsDBRequestInstDbName> getInstDbName() {
        return this.instDbName;
    }

    public CreateDrdsDBRequest setDbInstanceIsCreating(Boolean dbInstanceIsCreating) {
        this.dbInstanceIsCreating = dbInstanceIsCreating;
        return this;
    }
    public Boolean getDbInstanceIsCreating() {
        return this.dbInstanceIsCreating;
    }

    public CreateDrdsDBRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public static class CreateDrdsDBRequestRdsSuperAccount extends TeaModel {
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Password")
        public String password;

        public static CreateDrdsDBRequestRdsSuperAccount build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsDBRequestRdsSuperAccount self = new CreateDrdsDBRequestRdsSuperAccount();
            return TeaModel.build(map, self);
        }

        public CreateDrdsDBRequestRdsSuperAccount setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public CreateDrdsDBRequestRdsSuperAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateDrdsDBRequestRdsSuperAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

    public static class CreateDrdsDBRequestInstDbName extends TeaModel {
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("ShardDbName")
        public java.util.List<String> shardDbName;

        public static CreateDrdsDBRequestInstDbName build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsDBRequestInstDbName self = new CreateDrdsDBRequestInstDbName();
            return TeaModel.build(map, self);
        }

        public CreateDrdsDBRequestInstDbName setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public CreateDrdsDBRequestInstDbName setShardDbName(java.util.List<String> shardDbName) {
            this.shardDbName = shardDbName;
            return this;
        }
        public java.util.List<String> getShardDbName() {
            return this.shardDbName;
        }

    }

}
