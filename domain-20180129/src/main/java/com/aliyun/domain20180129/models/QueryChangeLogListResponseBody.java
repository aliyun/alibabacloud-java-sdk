// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryChangeLogListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryChangeLogListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <strong>example:</strong>
     * <p>2DEDFF32-7827-46B1-BE90-3DB8ABD91A58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResultLimit")
    public Boolean resultLimit;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryChangeLogListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryChangeLogListResponseBody self = new QueryChangeLogListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryChangeLogListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryChangeLogListResponseBody setData(QueryChangeLogListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryChangeLogListResponseBodyData getData() {
        return this.data;
    }

    public QueryChangeLogListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryChangeLogListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryChangeLogListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryChangeLogListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public QueryChangeLogListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryChangeLogListResponseBodyDataChangeLog extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dns1;dns2 -&gt; dns3;dns4</p>
         */
        @NameInMap("Details")
        public String details;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>DNS modification</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("OperationIPAddress")
        public String operationIPAddress;

        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>Failed</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>2017-12-26 12:00:00</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryChangeLogListResponseBodyDataChangeLog build(java.util.Map<String, ?> map) throws Exception {
            QueryChangeLogListResponseBodyDataChangeLog self = new QueryChangeLogListResponseBodyDataChangeLog();
            return TeaModel.build(map, self);
        }

        public QueryChangeLogListResponseBodyDataChangeLog setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setOperationIPAddress(String operationIPAddress) {
            this.operationIPAddress = operationIPAddress;
            return this;
        }
        public String getOperationIPAddress() {
            return this.operationIPAddress;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryChangeLogListResponseBodyDataChangeLog setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
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
