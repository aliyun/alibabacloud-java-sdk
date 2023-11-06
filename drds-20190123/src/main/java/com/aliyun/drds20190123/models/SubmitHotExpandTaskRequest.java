// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitHotExpandTaskRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The information about the database on which you want to perform hot-spot scale-out.</p>
     */
    @NameInMap("ExtendedMapping")
    public java.util.List<SubmitHotExpandTaskRequestExtendedMapping> extendedMapping;

    /**
     * <p>The information about the instance to which the hot-spot database belongs.</p>
     */
    @NameInMap("InstanceDbMapping")
    public java.util.List<SubmitHotExpandTaskRequestInstanceDbMapping> instanceDbMapping;

    /**
     * <p>The information about the hot-spot database.</p>
     */
    @NameInMap("Mapping")
    public java.util.List<SubmitHotExpandTaskRequestMapping> mapping;

    /**
     * <p>The information about the privileged account.</p>
     */
    @NameInMap("SupperAccountMapping")
    public java.util.List<SubmitHotExpandTaskRequestSupperAccountMapping> supperAccountMapping;

    /**
     * <p>The description of the task.</p>
     */
    @NameInMap("TaskDesc")
    public String taskDesc;

    /**
     * <p>The name of the task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static SubmitHotExpandTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotExpandTaskRequest self = new SubmitHotExpandTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHotExpandTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitHotExpandTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitHotExpandTaskRequest setExtendedMapping(java.util.List<SubmitHotExpandTaskRequestExtendedMapping> extendedMapping) {
        this.extendedMapping = extendedMapping;
        return this;
    }
    public java.util.List<SubmitHotExpandTaskRequestExtendedMapping> getExtendedMapping() {
        return this.extendedMapping;
    }

    public SubmitHotExpandTaskRequest setInstanceDbMapping(java.util.List<SubmitHotExpandTaskRequestInstanceDbMapping> instanceDbMapping) {
        this.instanceDbMapping = instanceDbMapping;
        return this;
    }
    public java.util.List<SubmitHotExpandTaskRequestInstanceDbMapping> getInstanceDbMapping() {
        return this.instanceDbMapping;
    }

    public SubmitHotExpandTaskRequest setMapping(java.util.List<SubmitHotExpandTaskRequestMapping> mapping) {
        this.mapping = mapping;
        return this;
    }
    public java.util.List<SubmitHotExpandTaskRequestMapping> getMapping() {
        return this.mapping;
    }

    public SubmitHotExpandTaskRequest setSupperAccountMapping(java.util.List<SubmitHotExpandTaskRequestSupperAccountMapping> supperAccountMapping) {
        this.supperAccountMapping = supperAccountMapping;
        return this;
    }
    public java.util.List<SubmitHotExpandTaskRequestSupperAccountMapping> getSupperAccountMapping() {
        return this.supperAccountMapping;
    }

    public SubmitHotExpandTaskRequest setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }
    public String getTaskDesc() {
        return this.taskDesc;
    }

    public SubmitHotExpandTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class SubmitHotExpandTaskRequestExtendedMapping extends TeaModel {
        /**
         * <p>The name of the source physical database.</p>
         */
        @NameInMap("SrcDb")
        public String srcDb;

        /**
         * <p>The ID of the ApsaraDB RDS instance to which the source physical database belongs.</p>
         */
        @NameInMap("SrcInstanceId")
        public String srcInstanceId;

        public static SubmitHotExpandTaskRequestExtendedMapping build(java.util.Map<String, ?> map) throws Exception {
            SubmitHotExpandTaskRequestExtendedMapping self = new SubmitHotExpandTaskRequestExtendedMapping();
            return TeaModel.build(map, self);
        }

        public SubmitHotExpandTaskRequestExtendedMapping setSrcDb(String srcDb) {
            this.srcDb = srcDb;
            return this;
        }
        public String getSrcDb() {
            return this.srcDb;
        }

        public SubmitHotExpandTaskRequestExtendedMapping setSrcInstanceId(String srcInstanceId) {
            this.srcInstanceId = srcInstanceId;
            return this;
        }
        public String getSrcInstanceId() {
            return this.srcInstanceId;
        }

    }

    public static class SubmitHotExpandTaskRequestInstanceDbMapping extends TeaModel {
        /**
         * <p>The name of the hot-spot database.</p>
         */
        @NameInMap("DbList")
        public String dbList;

        /**
         * <p>The name of the ApsaraDB RDS instance to which the hot-spot database belongs.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static SubmitHotExpandTaskRequestInstanceDbMapping build(java.util.Map<String, ?> map) throws Exception {
            SubmitHotExpandTaskRequestInstanceDbMapping self = new SubmitHotExpandTaskRequestInstanceDbMapping();
            return TeaModel.build(map, self);
        }

        public SubmitHotExpandTaskRequestInstanceDbMapping setDbList(String dbList) {
            this.dbList = dbList;
            return this;
        }
        public String getDbList() {
            return this.dbList;
        }

        public SubmitHotExpandTaskRequestInstanceDbMapping setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

    public static class SubmitHotExpandTaskRequestMapping extends TeaModel {
        /**
         * <p>The shard key used to split the database to which the associated table belongs.</p>
         */
        @NameInMap("DbShardColumn")
        public String dbShardColumn;

        /**
         * <p>The name of the hot-spot database.</p>
         */
        @NameInMap("HotDbName")
        public String hotDbName;

        /**
         * <p>The name of the hot-spot table. The name must be prefixed with the name of a logical table.</p>
         */
        @NameInMap("HotTableName")
        public String hotTableName;

        /**
         * <p>The name of the logical table on which you want to perform hot-spot scale-out.</p>
         */
        @NameInMap("LogicTable")
        public String logicTable;

        /**
         * <p>The value of the shard key used to split a database.</p>
         */
        @NameInMap("ShardDbValue")
        public String shardDbValue;

        /**
         * <p>The value of the shard key used to split a table.</p>
         */
        @NameInMap("ShardTbValue")
        public String shardTbValue;

        /**
         * <p>The shard key used to split an associated table.</p>
         */
        @NameInMap("TbShardColumn")
        public String tbShardColumn;

        public static SubmitHotExpandTaskRequestMapping build(java.util.Map<String, ?> map) throws Exception {
            SubmitHotExpandTaskRequestMapping self = new SubmitHotExpandTaskRequestMapping();
            return TeaModel.build(map, self);
        }

        public SubmitHotExpandTaskRequestMapping setDbShardColumn(String dbShardColumn) {
            this.dbShardColumn = dbShardColumn;
            return this;
        }
        public String getDbShardColumn() {
            return this.dbShardColumn;
        }

        public SubmitHotExpandTaskRequestMapping setHotDbName(String hotDbName) {
            this.hotDbName = hotDbName;
            return this;
        }
        public String getHotDbName() {
            return this.hotDbName;
        }

        public SubmitHotExpandTaskRequestMapping setHotTableName(String hotTableName) {
            this.hotTableName = hotTableName;
            return this;
        }
        public String getHotTableName() {
            return this.hotTableName;
        }

        public SubmitHotExpandTaskRequestMapping setLogicTable(String logicTable) {
            this.logicTable = logicTable;
            return this;
        }
        public String getLogicTable() {
            return this.logicTable;
        }

        public SubmitHotExpandTaskRequestMapping setShardDbValue(String shardDbValue) {
            this.shardDbValue = shardDbValue;
            return this;
        }
        public String getShardDbValue() {
            return this.shardDbValue;
        }

        public SubmitHotExpandTaskRequestMapping setShardTbValue(String shardTbValue) {
            this.shardTbValue = shardTbValue;
            return this;
        }
        public String getShardTbValue() {
            return this.shardTbValue;
        }

        public SubmitHotExpandTaskRequestMapping setTbShardColumn(String tbShardColumn) {
            this.tbShardColumn = tbShardColumn;
            return this;
        }
        public String getTbShardColumn() {
            return this.tbShardColumn;
        }

    }

    public static class SubmitHotExpandTaskRequestSupperAccountMapping extends TeaModel {
        /**
         * <p>The ID of the ApsaraDB RDS instance that has the privileged account.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The name of the privileged account of the ApsaraDB RDS instance.</p>
         */
        @NameInMap("SupperAccount")
        public String supperAccount;

        /**
         * <p>The password of the privileged account of the ApsaraDB RDS instance.</p>
         */
        @NameInMap("SupperPassword")
        public String supperPassword;

        public static SubmitHotExpandTaskRequestSupperAccountMapping build(java.util.Map<String, ?> map) throws Exception {
            SubmitHotExpandTaskRequestSupperAccountMapping self = new SubmitHotExpandTaskRequestSupperAccountMapping();
            return TeaModel.build(map, self);
        }

        public SubmitHotExpandTaskRequestSupperAccountMapping setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public SubmitHotExpandTaskRequestSupperAccountMapping setSupperAccount(String supperAccount) {
            this.supperAccount = supperAccount;
            return this;
        }
        public String getSupperAccount() {
            return this.supperAccount;
        }

        public SubmitHotExpandTaskRequestSupperAccountMapping setSupperPassword(String supperPassword) {
            this.supperPassword = supperPassword;
            return this;
        }
        public String getSupperPassword() {
            return this.supperPassword;
        }

    }

}
