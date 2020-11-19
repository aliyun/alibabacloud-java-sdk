// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeMyCatReportInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("EvaluateReportInfo")
    @Validation(required = true)
    public DescribeMyCatReportInfoResponseEvaluateReportInfo evaluateReportInfo;

    public static DescribeMyCatReportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyCatReportInfoResponse self = new DescribeMyCatReportInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMyCatReportInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMyCatReportInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMyCatReportInfoResponse setEvaluateReportInfo(DescribeMyCatReportInfoResponseEvaluateReportInfo evaluateReportInfo) {
        this.evaluateReportInfo = evaluateReportInfo;
        return this;
    }
    public DescribeMyCatReportInfoResponseEvaluateReportInfo getEvaluateReportInfo() {
        return this.evaluateReportInfo;
    }

    public static class DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("MycatShardAlgorithm")
        @Validation(required = true)
        public String mycatShardAlgorithm;

        @NameInMap("DbShardColumn")
        @Validation(required = true)
        public String dbShardColumn;

        @NameInMap("DbShardAlgorithm")
        @Validation(required = true)
        public String dbShardAlgorithm;

        @NameInMap("TbShardColumn")
        @Validation(required = true)
        public String tbShardColumn;

        @NameInMap("TbShardAlgorithm")
        @Validation(required = true)
        public String tbShardAlgorithm;

        @NameInMap("TbShardNum")
        @Validation(required = true)
        public Integer tbShardNum;

        @NameInMap("Shard")
        @Validation(required = true)
        public Boolean shard;

        @NameInMap("Broadcast")
        @Validation(required = true)
        public Boolean broadcast;

        @NameInMap("CreateTableSql")
        @Validation(required = true)
        public String createTableSql;

        public static DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList self = new DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setMycatShardAlgorithm(String mycatShardAlgorithm) {
            this.mycatShardAlgorithm = mycatShardAlgorithm;
            return this;
        }
        public String getMycatShardAlgorithm() {
            return this.mycatShardAlgorithm;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setDbShardColumn(String dbShardColumn) {
            this.dbShardColumn = dbShardColumn;
            return this;
        }
        public String getDbShardColumn() {
            return this.dbShardColumn;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setDbShardAlgorithm(String dbShardAlgorithm) {
            this.dbShardAlgorithm = dbShardAlgorithm;
            return this;
        }
        public String getDbShardAlgorithm() {
            return this.dbShardAlgorithm;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setTbShardColumn(String tbShardColumn) {
            this.tbShardColumn = tbShardColumn;
            return this;
        }
        public String getTbShardColumn() {
            return this.tbShardColumn;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setTbShardAlgorithm(String tbShardAlgorithm) {
            this.tbShardAlgorithm = tbShardAlgorithm;
            return this;
        }
        public String getTbShardAlgorithm() {
            return this.tbShardAlgorithm;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setTbShardNum(Integer tbShardNum) {
            this.tbShardNum = tbShardNum;
            return this;
        }
        public Integer getTbShardNum() {
            return this.tbShardNum;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setShard(Boolean shard) {
            this.shard = shard;
            return this;
        }
        public Boolean getShard() {
            return this.shard;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setBroadcast(Boolean broadcast) {
            this.broadcast = broadcast;
            return this;
        }
        public Boolean getBroadcast() {
            return this.broadcast;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList setCreateTableSql(String createTableSql) {
            this.createTableSql = createTableSql;
            return this;
        }
        public String getCreateTableSql() {
            return this.createTableSql;
        }

    }

    public static class DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfo extends TeaModel {
        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("TableInfoList")
        @Validation(required = true)
        public java.util.List<DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList> tableInfoList;

        public static DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfo self = new DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfo();
            return TeaModel.build(map, self);
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfo setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfo setTableInfoList(java.util.List<DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList> tableInfoList) {
            this.tableInfoList = tableInfoList;
            return this;
        }
        public java.util.List<DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfoTableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

    }

    public static class DescribeMyCatReportInfoResponseEvaluateReportInfo extends TeaModel {
        @NameInMap("ErrorSqlCount")
        @Validation(required = true)
        public Integer errorSqlCount;

        @NameInMap("DrdsSpecs")
        @Validation(required = true)
        public String drdsSpecs;

        @NameInMap("DrdsNodeCount")
        @Validation(required = true)
        public Integer drdsNodeCount;

        @NameInMap("RdsSpecs")
        @Validation(required = true)
        public String rdsSpecs;

        @NameInMap("RdsCount")
        @Validation(required = true)
        public Integer rdsCount;

        @NameInMap("RdsDiskCapacity")
        @Validation(required = true)
        public String rdsDiskCapacity;

        @NameInMap("DbInfo")
        @Validation(required = true)
        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfo dbInfo;

        public static DescribeMyCatReportInfoResponseEvaluateReportInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyCatReportInfoResponseEvaluateReportInfo self = new DescribeMyCatReportInfoResponseEvaluateReportInfo();
            return TeaModel.build(map, self);
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfo setErrorSqlCount(Integer errorSqlCount) {
            this.errorSqlCount = errorSqlCount;
            return this;
        }
        public Integer getErrorSqlCount() {
            return this.errorSqlCount;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfo setDrdsSpecs(String drdsSpecs) {
            this.drdsSpecs = drdsSpecs;
            return this;
        }
        public String getDrdsSpecs() {
            return this.drdsSpecs;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfo setDrdsNodeCount(Integer drdsNodeCount) {
            this.drdsNodeCount = drdsNodeCount;
            return this;
        }
        public Integer getDrdsNodeCount() {
            return this.drdsNodeCount;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfo setRdsSpecs(String rdsSpecs) {
            this.rdsSpecs = rdsSpecs;
            return this;
        }
        public String getRdsSpecs() {
            return this.rdsSpecs;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfo setRdsCount(Integer rdsCount) {
            this.rdsCount = rdsCount;
            return this;
        }
        public Integer getRdsCount() {
            return this.rdsCount;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfo setRdsDiskCapacity(String rdsDiskCapacity) {
            this.rdsDiskCapacity = rdsDiskCapacity;
            return this;
        }
        public String getRdsDiskCapacity() {
            return this.rdsDiskCapacity;
        }

        public DescribeMyCatReportInfoResponseEvaluateReportInfo setDbInfo(DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfo dbInfo) {
            this.dbInfo = dbInfo;
            return this;
        }
        public DescribeMyCatReportInfoResponseEvaluateReportInfoDbInfo getDbInfo() {
            return this.dbInfo;
        }

    }

}
