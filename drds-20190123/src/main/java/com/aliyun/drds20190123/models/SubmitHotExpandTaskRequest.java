// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitHotExpandTaskRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskDesc")
    public String taskDesc;

    @NameInMap("InstanceDbMapping")
    public java.util.List<SubmitHotExpandTaskRequestInstanceDbMapping> instanceDbMapping;

    @NameInMap("Mapping")
    public java.util.List<SubmitHotExpandTaskRequestMapping> mapping;

    @NameInMap("SupperAccountMapping")
    public java.util.List<SubmitHotExpandTaskRequestSupperAccountMapping> supperAccountMapping;

    @NameInMap("ExtendedMapping")
    public java.util.List<SubmitHotExpandTaskRequestExtendedMapping> extendedMapping;

    public static SubmitHotExpandTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotExpandTaskRequest self = new SubmitHotExpandTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHotExpandTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitHotExpandTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitHotExpandTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public SubmitHotExpandTaskRequest setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }
    public String getTaskDesc() {
        return this.taskDesc;
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

    public SubmitHotExpandTaskRequest setExtendedMapping(java.util.List<SubmitHotExpandTaskRequestExtendedMapping> extendedMapping) {
        this.extendedMapping = extendedMapping;
        return this;
    }
    public java.util.List<SubmitHotExpandTaskRequestExtendedMapping> getExtendedMapping() {
        return this.extendedMapping;
    }

    public static class SubmitHotExpandTaskRequestInstanceDbMapping extends TeaModel {
        @NameInMap("DbList")
        public String dbList;

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
        @NameInMap("HotDbName")
        public String hotDbName;

        @NameInMap("ShardTbValue")
        public String shardTbValue;

        @NameInMap("HotTableName")
        public String hotTableName;

        @NameInMap("ShardDbValue")
        public String shardDbValue;

        @NameInMap("TbShardColumn")
        public String tbShardColumn;

        @NameInMap("DbShardColumn")
        public String dbShardColumn;

        @NameInMap("LogicTable")
        public String logicTable;

        public static SubmitHotExpandTaskRequestMapping build(java.util.Map<String, ?> map) throws Exception {
            SubmitHotExpandTaskRequestMapping self = new SubmitHotExpandTaskRequestMapping();
            return TeaModel.build(map, self);
        }

        public SubmitHotExpandTaskRequestMapping setHotDbName(String hotDbName) {
            this.hotDbName = hotDbName;
            return this;
        }
        public String getHotDbName() {
            return this.hotDbName;
        }

        public SubmitHotExpandTaskRequestMapping setShardTbValue(String shardTbValue) {
            this.shardTbValue = shardTbValue;
            return this;
        }
        public String getShardTbValue() {
            return this.shardTbValue;
        }

        public SubmitHotExpandTaskRequestMapping setHotTableName(String hotTableName) {
            this.hotTableName = hotTableName;
            return this;
        }
        public String getHotTableName() {
            return this.hotTableName;
        }

        public SubmitHotExpandTaskRequestMapping setShardDbValue(String shardDbValue) {
            this.shardDbValue = shardDbValue;
            return this;
        }
        public String getShardDbValue() {
            return this.shardDbValue;
        }

        public SubmitHotExpandTaskRequestMapping setTbShardColumn(String tbShardColumn) {
            this.tbShardColumn = tbShardColumn;
            return this;
        }
        public String getTbShardColumn() {
            return this.tbShardColumn;
        }

        public SubmitHotExpandTaskRequestMapping setDbShardColumn(String dbShardColumn) {
            this.dbShardColumn = dbShardColumn;
            return this;
        }
        public String getDbShardColumn() {
            return this.dbShardColumn;
        }

        public SubmitHotExpandTaskRequestMapping setLogicTable(String logicTable) {
            this.logicTable = logicTable;
            return this;
        }
        public String getLogicTable() {
            return this.logicTable;
        }

    }

    public static class SubmitHotExpandTaskRequestSupperAccountMapping extends TeaModel {
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("SupperAccount")
        public String supperAccount;

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

    public static class SubmitHotExpandTaskRequestExtendedMapping extends TeaModel {
        @NameInMap("SrcDb")
        public String srcDb;

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

}
