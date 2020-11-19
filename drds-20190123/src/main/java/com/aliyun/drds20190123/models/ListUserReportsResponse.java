// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ListUserReportsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("sqlComparisonReport")
    @Validation(required = true)
    public ListUserReportsResponseSqlComparisonReport sqlComparisonReport;

    public static ListUserReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserReportsResponse self = new ListUserReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserReportsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserReportsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserReportsResponse setSqlComparisonReport(ListUserReportsResponseSqlComparisonReport sqlComparisonReport) {
        this.sqlComparisonReport = sqlComparisonReport;
        return this;
    }
    public ListUserReportsResponseSqlComparisonReport getSqlComparisonReport() {
        return this.sqlComparisonReport;
    }

    public static class ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail extends TeaModel {
        @NameInMap("ExecDetailMsg")
        @Validation(required = true)
        public String execDetailMsg;

        @NameInMap("Execute")
        @Validation(required = true)
        public String execute;

        @NameInMap("SqlContent")
        @Validation(required = true)
        public String sqlContent;

        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        public static ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail build(java.util.Map<String, ?> map) throws Exception {
            ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail self = new ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail();
            return TeaModel.build(map, self);
        }

        public ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail setExecDetailMsg(String execDetailMsg) {
            this.execDetailMsg = execDetailMsg;
            return this;
        }
        public String getExecDetailMsg() {
            return this.execDetailMsg;
        }

        public ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail setExecute(String execute) {
            this.execute = execute;
            return this;
        }
        public String getExecute() {
            return this.execute;
        }

        public ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail setSqlContent(String sqlContent) {
            this.sqlContent = sqlContent;
            return this;
        }
        public String getSqlContent() {
            return this.sqlContent;
        }

        public ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

    }

    public static class ListUserReportsResponseSqlComparisonReportExecuteDetailList extends TeaModel {
        @NameInMap("executeDetail")
        @Validation(required = true)
        public java.util.List<ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail> executeDetail;

        public static ListUserReportsResponseSqlComparisonReportExecuteDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListUserReportsResponseSqlComparisonReportExecuteDetailList self = new ListUserReportsResponseSqlComparisonReportExecuteDetailList();
            return TeaModel.build(map, self);
        }

        public ListUserReportsResponseSqlComparisonReportExecuteDetailList setExecuteDetail(java.util.List<ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail> executeDetail) {
            this.executeDetail = executeDetail;
            return this;
        }
        public java.util.List<ListUserReportsResponseSqlComparisonReportExecuteDetailListExecuteDetail> getExecuteDetail() {
            return this.executeDetail;
        }

    }

    public static class ListUserReportsResponseSqlComparisonReport extends TeaModel {
        @NameInMap("SqlPassFailNum")
        @Validation(required = true)
        public Long sqlPassFailNum;

        @NameInMap("SqlPassRate")
        @Validation(required = true)
        public String sqlPassRate;

        @NameInMap("SqlPassSuccNum")
        @Validation(required = true)
        public Long sqlPassSuccNum;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("executeDetailList")
        @Validation(required = true)
        public ListUserReportsResponseSqlComparisonReportExecuteDetailList executeDetailList;

        public static ListUserReportsResponseSqlComparisonReport build(java.util.Map<String, ?> map) throws Exception {
            ListUserReportsResponseSqlComparisonReport self = new ListUserReportsResponseSqlComparisonReport();
            return TeaModel.build(map, self);
        }

        public ListUserReportsResponseSqlComparisonReport setSqlPassFailNum(Long sqlPassFailNum) {
            this.sqlPassFailNum = sqlPassFailNum;
            return this;
        }
        public Long getSqlPassFailNum() {
            return this.sqlPassFailNum;
        }

        public ListUserReportsResponseSqlComparisonReport setSqlPassRate(String sqlPassRate) {
            this.sqlPassRate = sqlPassRate;
            return this;
        }
        public String getSqlPassRate() {
            return this.sqlPassRate;
        }

        public ListUserReportsResponseSqlComparisonReport setSqlPassSuccNum(Long sqlPassSuccNum) {
            this.sqlPassSuccNum = sqlPassSuccNum;
            return this;
        }
        public Long getSqlPassSuccNum() {
            return this.sqlPassSuccNum;
        }

        public ListUserReportsResponseSqlComparisonReport setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListUserReportsResponseSqlComparisonReport setExecuteDetailList(ListUserReportsResponseSqlComparisonReportExecuteDetailList executeDetailList) {
            this.executeDetailList = executeDetailList;
            return this;
        }
        public ListUserReportsResponseSqlComparisonReportExecuteDetailList getExecuteDetailList() {
            return this.executeDetailList;
        }

    }

}
