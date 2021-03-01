// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListOperationLogsResponseBody extends TeaModel {
    @NameInMap("LogList")
    public java.util.List<ListOperationLogsResponseBodyLogList> logList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("TotalSize")
    public Integer totalSize;

    @NameInMap("Code")
    public Integer code;

    public static ListOperationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationLogsResponseBody self = new ListOperationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationLogsResponseBody setLogList(java.util.List<ListOperationLogsResponseBodyLogList> logList) {
        this.logList = logList;
        return this;
    }
    public java.util.List<ListOperationLogsResponseBodyLogList> getLogList() {
        return this.logList;
    }

    public ListOperationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOperationLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOperationLogsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOperationLogsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public ListOperationLogsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListOperationLogsResponseBodyLogList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ActionGroup")
        public String actionGroup;

        @NameInMap("OperatorId")
        public String operatorId;

        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("ExtraParameters")
        public String extraParameters;

        @NameInMap("Source")
        public String source;

        public static ListOperationLogsResponseBodyLogList build(java.util.Map<String, ?> map) throws Exception {
            ListOperationLogsResponseBodyLogList self = new ListOperationLogsResponseBodyLogList();
            return TeaModel.build(map, self);
        }

        public ListOperationLogsResponseBodyLogList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOperationLogsResponseBodyLogList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListOperationLogsResponseBodyLogList setActionGroup(String actionGroup) {
            this.actionGroup = actionGroup;
            return this;
        }
        public String getActionGroup() {
            return this.actionGroup;
        }

        public ListOperationLogsResponseBodyLogList setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public ListOperationLogsResponseBodyLogList setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ListOperationLogsResponseBodyLogList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListOperationLogsResponseBodyLogList setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListOperationLogsResponseBodyLogList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListOperationLogsResponseBodyLogList setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public ListOperationLogsResponseBodyLogList setExtraParameters(String extraParameters) {
            this.extraParameters = extraParameters;
            return this;
        }
        public String getExtraParameters() {
            return this.extraParameters;
        }

        public ListOperationLogsResponseBodyLogList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
