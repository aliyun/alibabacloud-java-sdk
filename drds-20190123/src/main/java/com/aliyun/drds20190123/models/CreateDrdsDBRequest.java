// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsDBRequest extends TeaModel {
    /**
     * <p>The name of the account that has permissions to access all databases on the ApsaraDB RDS for MySQL instance.</p>
     * <br>
     * <p>This parameter is required only when the Type parameter is set to VERTICAL.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The type of the storage instances that are used by the PolarDB-X 1.0 database. Set the value to RDS.</p>
     */
    @NameInMap("DbInstType")
    public String dbInstType;

    /**
     * <p>Specifies whether the required ApsaraDB RDS for MySQL instance is being created.</p>
     */
    @NameInMap("DbInstanceIsCreating")
    public Boolean dbInstanceIsCreating;

    /**
     * <p>The name of the PolarDB-X 1.0 database you want to create.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance on which you want to create the database.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The encoding method that is used by the database.</p>
     */
    @NameInMap("Encode")
    public String encode;

    @NameInMap("InstDbName")
    public java.util.List<CreateDrdsDBRequestInstDbName> instDbName;

    /**
     * <p>The password that is used to log on to the database.</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("RdsInstance")
    public java.util.List<String> rdsInstance;

    @NameInMap("RdsSuperAccount")
    public java.util.List<CreateDrdsDBRequestRdsSuperAccount> rdsSuperAccount;

    /**
     * <p>The partitioning mode of the database. Valid values:</p>
     * <br>
     * <p>*   **HORIZONTAL**: The database is horizontally partitioned (sharded).</p>
     * <p>*   **VERTICAL**: The database is vertically partitioned.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateDrdsDBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsDBRequest self = new CreateDrdsDBRequest();
        return TeaModel.build(map, self);
    }

    public CreateDrdsDBRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateDrdsDBRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public CreateDrdsDBRequest setDbInstanceIsCreating(Boolean dbInstanceIsCreating) {
        this.dbInstanceIsCreating = dbInstanceIsCreating;
        return this;
    }
    public Boolean getDbInstanceIsCreating() {
        return this.dbInstanceIsCreating;
    }

    public CreateDrdsDBRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDrdsDBRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateDrdsDBRequest setEncode(String encode) {
        this.encode = encode;
        return this;
    }
    public String getEncode() {
        return this.encode;
    }

    public CreateDrdsDBRequest setInstDbName(java.util.List<CreateDrdsDBRequestInstDbName> instDbName) {
        this.instDbName = instDbName;
        return this;
    }
    public java.util.List<CreateDrdsDBRequestInstDbName> getInstDbName() {
        return this.instDbName;
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

    public CreateDrdsDBRequest setRdsSuperAccount(java.util.List<CreateDrdsDBRequestRdsSuperAccount> rdsSuperAccount) {
        this.rdsSuperAccount = rdsSuperAccount;
        return this;
    }
    public java.util.List<CreateDrdsDBRequestRdsSuperAccount> getRdsSuperAccount() {
        return this.rdsSuperAccount;
    }

    public CreateDrdsDBRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateDrdsDBRequestInstDbName extends TeaModel {
        /**
         * <p>The ID of the ApsaraDB RDS for MySQL instance on which the databases need to be vertically partitioned. This parameter is required only when the Type parameter is set to VERTICAL.</p>
         */
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

    public static class CreateDrdsDBRequestRdsSuperAccount extends TeaModel {
        /**
         * <p>The account name of the super administrator that is used to connect to the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The ID of ApsaraDB RDS instance.</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>The password of the super administrator account that is used to connect to the ApsaraDB RDS instance.</p>
         */
        @NameInMap("Password")
        public String password;

        public static CreateDrdsDBRequestRdsSuperAccount build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsDBRequestRdsSuperAccount self = new CreateDrdsDBRequestRdsSuperAccount();
            return TeaModel.build(map, self);
        }

        public CreateDrdsDBRequestRdsSuperAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateDrdsDBRequestRdsSuperAccount setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public CreateDrdsDBRequestRdsSuperAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
