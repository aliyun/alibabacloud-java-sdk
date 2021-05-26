// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryTicketActionResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryTicketActionResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTicketActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketActionResponseBody self = new QueryTicketActionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTicketActionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTicketActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTicketActionResponseBody setData(QueryTicketActionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTicketActionResponseBodyData getData() {
        return this.data;
    }

    public QueryTicketActionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTicketActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTicketActionResponseBodyDataList extends TeaModel {
        @NameInMap("BizTenantId")
        public Long bizTenantId;

        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("BizId")
        public Long bizId;

        @NameInMap("AcceptorRole")
        public Integer acceptorRole;

        @NameInMap("HideType")
        public Integer hideType;

        @NameInMap("BuyerId")
        public Long buyerId;

        @NameInMap("BizType")
        public Integer bizType;

        @NameInMap("BuId")
        public Integer buId;

        @NameInMap("ActionCode")
        public Integer actionCode;

        @NameInMap("BizIdStr")
        public String bizIdStr;

        @NameInMap("OperatorRole")
        public Integer operatorRole;

        @NameInMap("Acceptor")
        public Long acceptor;

        @NameInMap("Operator")
        public Long operator;

        @NameInMap("TaskId")
        public Long taskId;

        public static QueryTicketActionResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryTicketActionResponseBodyDataList self = new QueryTicketActionResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryTicketActionResponseBodyDataList setBizTenantId(Long bizTenantId) {
            this.bizTenantId = bizTenantId;
            return this;
        }
        public Long getBizTenantId() {
            return this.bizTenantId;
        }

        public QueryTicketActionResponseBodyDataList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public QueryTicketActionResponseBodyDataList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryTicketActionResponseBodyDataList setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public QueryTicketActionResponseBodyDataList setAcceptorRole(Integer acceptorRole) {
            this.acceptorRole = acceptorRole;
            return this;
        }
        public Integer getAcceptorRole() {
            return this.acceptorRole;
        }

        public QueryTicketActionResponseBodyDataList setHideType(Integer hideType) {
            this.hideType = hideType;
            return this;
        }
        public Integer getHideType() {
            return this.hideType;
        }

        public QueryTicketActionResponseBodyDataList setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public Long getBuyerId() {
            return this.buyerId;
        }

        public QueryTicketActionResponseBodyDataList setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public QueryTicketActionResponseBodyDataList setBuId(Integer buId) {
            this.buId = buId;
            return this;
        }
        public Integer getBuId() {
            return this.buId;
        }

        public QueryTicketActionResponseBodyDataList setActionCode(Integer actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public Integer getActionCode() {
            return this.actionCode;
        }

        public QueryTicketActionResponseBodyDataList setBizIdStr(String bizIdStr) {
            this.bizIdStr = bizIdStr;
            return this;
        }
        public String getBizIdStr() {
            return this.bizIdStr;
        }

        public QueryTicketActionResponseBodyDataList setOperatorRole(Integer operatorRole) {
            this.operatorRole = operatorRole;
            return this;
        }
        public Integer getOperatorRole() {
            return this.operatorRole;
        }

        public QueryTicketActionResponseBodyDataList setAcceptor(Long acceptor) {
            this.acceptor = acceptor;
            return this;
        }
        public Long getAcceptor() {
            return this.acceptor;
        }

        public QueryTicketActionResponseBodyDataList setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public QueryTicketActionResponseBodyDataList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryTicketActionResponseBodyData extends TeaModel {
        @NameInMap("TotalResults")
        public Integer totalResults;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("List")
        public java.util.List<QueryTicketActionResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static QueryTicketActionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTicketActionResponseBodyData self = new QueryTicketActionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTicketActionResponseBodyData setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Integer getTotalResults() {
            return this.totalResults;
        }

        public QueryTicketActionResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryTicketActionResponseBodyData setList(java.util.List<QueryTicketActionResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryTicketActionResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryTicketActionResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
