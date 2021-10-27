// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsDBPreCheckRequest extends TeaModel {
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

    @NameInMap("Encode")
    public String encode;

    @NameInMap("InstDbName")
    public java.util.List<CreateDrdsDBPreCheckRequestInstDbName> instDbName;

    @NameInMap("Password")
    public String password;

    @NameInMap("RdsInstance")
    public java.util.List<String> rdsInstance;

    @NameInMap("RdsSuperAccount")
    public java.util.List<CreateDrdsDBPreCheckRequestRdsSuperAccount> rdsSuperAccount;

    @NameInMap("Type")
    public String type;

    public static CreateDrdsDBPreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsDBPreCheckRequest self = new CreateDrdsDBPreCheckRequest();
        return TeaModel.build(map, self);
    }

    public CreateDrdsDBPreCheckRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateDrdsDBPreCheckRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public CreateDrdsDBPreCheckRequest setDbInstanceIsCreating(Boolean dbInstanceIsCreating) {
        this.dbInstanceIsCreating = dbInstanceIsCreating;
        return this;
    }
    public Boolean getDbInstanceIsCreating() {
        return this.dbInstanceIsCreating;
    }

    public CreateDrdsDBPreCheckRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDrdsDBPreCheckRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateDrdsDBPreCheckRequest setEncode(String encode) {
        this.encode = encode;
        return this;
    }
    public String getEncode() {
        return this.encode;
    }

    public CreateDrdsDBPreCheckRequest setInstDbName(java.util.List<CreateDrdsDBPreCheckRequestInstDbName> instDbName) {
        this.instDbName = instDbName;
        return this;
    }
    public java.util.List<CreateDrdsDBPreCheckRequestInstDbName> getInstDbName() {
        return this.instDbName;
    }

    public CreateDrdsDBPreCheckRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDrdsDBPreCheckRequest setRdsInstance(java.util.List<String> rdsInstance) {
        this.rdsInstance = rdsInstance;
        return this;
    }
    public java.util.List<String> getRdsInstance() {
        return this.rdsInstance;
    }

    public CreateDrdsDBPreCheckRequest setRdsSuperAccount(java.util.List<CreateDrdsDBPreCheckRequestRdsSuperAccount> rdsSuperAccount) {
        this.rdsSuperAccount = rdsSuperAccount;
        return this;
    }
    public java.util.List<CreateDrdsDBPreCheckRequestRdsSuperAccount> getRdsSuperAccount() {
        return this.rdsSuperAccount;
    }

    public CreateDrdsDBPreCheckRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateDrdsDBPreCheckRequestInstDbName extends TeaModel {
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("ShardDbName")
        public java.util.List<String> shardDbName;

        public static CreateDrdsDBPreCheckRequestInstDbName build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsDBPreCheckRequestInstDbName self = new CreateDrdsDBPreCheckRequestInstDbName();
            return TeaModel.build(map, self);
        }

        public CreateDrdsDBPreCheckRequestInstDbName setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public CreateDrdsDBPreCheckRequestInstDbName setShardDbName(java.util.List<String> shardDbName) {
            this.shardDbName = shardDbName;
            return this;
        }
        public java.util.List<String> getShardDbName() {
            return this.shardDbName;
        }

    }

    public static class CreateDrdsDBPreCheckRequestRdsSuperAccount extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("Password")
        public String password;

        public static CreateDrdsDBPreCheckRequestRdsSuperAccount build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsDBPreCheckRequestRdsSuperAccount self = new CreateDrdsDBPreCheckRequestRdsSuperAccount();
            return TeaModel.build(map, self);
        }

        public CreateDrdsDBPreCheckRequestRdsSuperAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateDrdsDBPreCheckRequestRdsSuperAccount setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public CreateDrdsDBPreCheckRequestRdsSuperAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
