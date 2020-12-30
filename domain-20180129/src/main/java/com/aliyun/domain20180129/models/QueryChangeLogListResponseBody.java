// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryChangeLogListResponseBody extends TeaModel {
    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public QueryChangeLogListResponseBodyData data;

    @NameInMap("ResultLimit")
    public Boolean resultLimit;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("NextPage")
    public Boolean nextPage;

    public static QueryChangeLogListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryChangeLogListResponseBody self = new QueryChangeLogListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryChangeLogListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryChangeLogListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryChangeLogListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryChangeLogListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryChangeLogListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryChangeLogListResponseBody setData(QueryChangeLogListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryChangeLogListResponseBodyData getData() {
        return this.data;
    }

    public QueryChangeLogListResponseBody setResultLimit(Boolean resultLimit) {
        this.resultLimit = resultLimit;
        return this;
    }
    public Boolean getResultLimit() {
        return this.resultLimit;
    }

    public QueryChangeLogListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryChangeLogListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public static class QueryChangeLogListResponseBodyDataChangeLog extends TeaModel {
        @NameInMap("Operation")
        public String operation;

        @NameInMap("Time")
        public String time;

        @NameInMap("Result")
        public String result;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("OperationIPAddress")
        public String operationIPAddress;

        @NameInMap("Details")
        public String details;

        public static QueryChangeLogListResponseBodyDataChangeLog build(java.util.Map<String, ?> map) throws Exception {
            QueryChangeLogListResponseBodyDataChangeLog self = new QueryChangeLogListResponseBodyDataChangeLog();
            return TeaModel.build(map, self);
        }

        public QueryChangeLogListResponseBodyDataChangeLog setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setOperationIPAddress(String operationIPAddress) {
            this.operationIPAddress = operationIPAddress;
            return this;
        }
        public String getOperationIPAddress() {
            return this.operationIPAddress;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

    }

    public static class QueryChangeLogListResponseBodyData extends TeaModel {
        @NameInMap("ChangeLog")
        public java.util.List<QueryChangeLogListResponseBodyDataChangeLog> changeLog;

        public static QueryChangeLogListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryChangeLogListResponseBodyData self = new QueryChangeLogListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryChangeLogListResponseBodyData setChangeLog(java.util.List<QueryChangeLogListResponseBodyDataChangeLog> changeLog) {
            this.changeLog = changeLog;
            return this;
        }
        public java.util.List<QueryChangeLogListResponseBodyDataChangeLog> getChangeLog() {
            return this.changeLog;
        }

    }

}
