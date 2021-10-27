// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ListUserReportsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("sqlComparisonReport")
    public ListUserReportsResponseBodySqlComparisonReport sqlComparisonReport;

    public static ListUserReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserReportsResponseBody self = new ListUserReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserReportsResponseBody setSqlComparisonReport(ListUserReportsResponseBodySqlComparisonReport sqlComparisonReport) {
        this.sqlComparisonReport = sqlComparisonReport;
        return this;
    }
    public ListUserReportsResponseBodySqlComparisonReport getSqlComparisonReport() {
        return this.sqlComparisonReport;
    }

    public static class ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("ExecDetailMsg")
        public String execDetailMsg;

        @NameInMap("Execute")
        public String execute;

        @NameInMap("SqlContent")
        public String sqlContent;

        public static ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail build(java.util.Map<String, ?> map) throws Exception {
            ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail self = new ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail();
            return TeaModel.build(map, self);
        }

        public ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail setExecDetailMsg(String execDetailMsg) {
            this.execDetailMsg = execDetailMsg;
            return this;
        }
        public String getExecDetailMsg() {
            return this.execDetailMsg;
        }

        public ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail setExecute(String execute) {
            this.execute = execute;
            return this;
        }
        public String getExecute() {
            return this.execute;
        }

        public ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail setSqlContent(String sqlContent) {
            this.sqlContent = sqlContent;
            return this;
        }
        public String getSqlContent() {
            return this.sqlContent;
        }

    }

    public static class ListUserReportsResponseBodySqlComparisonReportExecuteDetailList extends TeaModel {
        @NameInMap("executeDetail")
        public java.util.List<ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail> executeDetail;

        public static ListUserReportsResponseBodySqlComparisonReportExecuteDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListUserReportsResponseBodySqlComparisonReportExecuteDetailList self = new ListUserReportsResponseBodySqlComparisonReportExecuteDetailList();
            return TeaModel.build(map, self);
        }

        public ListUserReportsResponseBodySqlComparisonReportExecuteDetailList setExecuteDetail(java.util.List<ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail> executeDetail) {
            this.executeDetail = executeDetail;
            return this;
        }
        public java.util.List<ListUserReportsResponseBodySqlComparisonReportExecuteDetailListExecuteDetail> getExecuteDetail() {
            return this.executeDetail;
        }

    }

    public static class ListUserReportsResponseBodySqlComparisonReport extends TeaModel {
        @NameInMap("SqlPassFailNum")
        public Long sqlPassFailNum;

        @NameInMap("SqlPassRate")
        public String sqlPassRate;

        @NameInMap("SqlPassSuccNum")
        public Long sqlPassSuccNum;

        @NameInMap("Version")
        public String version;

        @NameInMap("executeDetailList")
        public ListUserReportsResponseBodySqlComparisonReportExecuteDetailList executeDetailList;

        public static ListUserReportsResponseBodySqlComparisonReport build(java.util.Map<String, ?> map) throws Exception {
            ListUserReportsResponseBodySqlComparisonReport self = new ListUserReportsResponseBodySqlComparisonReport();
            return TeaModel.build(map, self);
        }

        public ListUserReportsResponseBodySqlComparisonReport setSqlPassFailNum(Long sqlPassFailNum) {
            this.sqlPassFailNum = sqlPassFailNum;
            return this;
        }
        public Long getSqlPassFailNum() {
            return this.sqlPassFailNum;
        }

        public ListUserReportsResponseBodySqlComparisonReport setSqlPassRate(String sqlPassRate) {
            this.sqlPassRate = sqlPassRate;
            return this;
        }
        public String getSqlPassRate() {
            return this.sqlPassRate;
        }

        public ListUserReportsResponseBodySqlComparisonReport setSqlPassSuccNum(Long sqlPassSuccNum) {
            this.sqlPassSuccNum = sqlPassSuccNum;
            return this;
        }
        public Long getSqlPassSuccNum() {
            return this.sqlPassSuccNum;
        }

        public ListUserReportsResponseBodySqlComparisonReport setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListUserReportsResponseBodySqlComparisonReport setExecuteDetailList(ListUserReportsResponseBodySqlComparisonReportExecuteDetailList executeDetailList) {
            this.executeDetailList = executeDetailList;
            return this;
        }
        public ListUserReportsResponseBodySqlComparisonReportExecuteDetailList getExecuteDetailList() {
            return this.executeDetailList;
        }

    }

}
