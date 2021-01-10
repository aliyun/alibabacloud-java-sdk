// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpImportResultResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public QueryFpImportResultResponseBodyPageInfo pageInfo;

    @NameInMap("FpResultLogInfoList")
    public QueryFpImportResultResponseBodyFpResultLogInfoList fpResultLogInfoList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LogCount")
    public Long logCount;

    public static QueryFpImportResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFpImportResultResponseBody self = new QueryFpImportResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFpImportResultResponseBody setPageInfo(QueryFpImportResultResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public QueryFpImportResultResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public QueryFpImportResultResponseBody setFpResultLogInfoList(QueryFpImportResultResponseBodyFpResultLogInfoList fpResultLogInfoList) {
        this.fpResultLogInfoList = fpResultLogInfoList;
        return this;
    }
    public QueryFpImportResultResponseBodyFpResultLogInfoList getFpResultLogInfoList() {
        return this.fpResultLogInfoList;
    }

    public QueryFpImportResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFpImportResultResponseBody setLogCount(Long logCount) {
        this.logCount = logCount;
        return this;
    }
    public Long getLogCount() {
        return this.logCount;
    }

    public static class QueryFpImportResultResponseBodyPageInfo extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static QueryFpImportResultResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryFpImportResultResponseBodyPageInfo self = new QueryFpImportResultResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public QueryFpImportResultResponseBodyPageInfo setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public QueryFpImportResultResponseBodyPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryFpImportResultResponseBodyPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo extends TeaModel {
        @NameInMap("LogStartTime")
        public Long logStartTime;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LogSize")
        public Long logSize;

        @NameInMap("LogName")
        public String logName;

        @NameInMap("LogEndTime")
        public Long logEndTime;

        public static QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo self = new QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo();
            return TeaModel.build(map, self);
        }

        public QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo setLogStartTime(Long logStartTime) {
            this.logStartTime = logStartTime;
            return this;
        }
        public Long getLogStartTime() {
            return this.logStartTime;
        }

        public QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo setLogEndTime(Long logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public Long getLogEndTime() {
            return this.logEndTime;
        }

    }

    public static class QueryFpImportResultResponseBodyFpResultLogInfoList extends TeaModel {
        @NameInMap("FpResultLogInfo")
        public java.util.List<QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo> fpResultLogInfo;

        public static QueryFpImportResultResponseBodyFpResultLogInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryFpImportResultResponseBodyFpResultLogInfoList self = new QueryFpImportResultResponseBodyFpResultLogInfoList();
            return TeaModel.build(map, self);
        }

        public QueryFpImportResultResponseBodyFpResultLogInfoList setFpResultLogInfo(java.util.List<QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo> fpResultLogInfo) {
            this.fpResultLogInfo = fpResultLogInfo;
            return this;
        }
        public java.util.List<QueryFpImportResultResponseBodyFpResultLogInfoListFpResultLogInfo> getFpResultLogInfo() {
            return this.fpResultLogInfo;
        }

    }

}
