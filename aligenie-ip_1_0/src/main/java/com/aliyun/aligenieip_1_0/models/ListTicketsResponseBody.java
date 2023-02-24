// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListTicketsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public ListTicketsResponseBodyPage page;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListTicketsResponseBodyResult> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static ListTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsResponseBody self = new ListTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTicketsResponseBody setPage(ListTicketsResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListTicketsResponseBodyPage getPage() {
        return this.page;
    }

    public ListTicketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTicketsResponseBody setResult(java.util.List<ListTicketsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListTicketsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListTicketsResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class ListTicketsResponseBodyPage extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListTicketsResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsResponseBodyPage self = new ListTicketsResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public ListTicketsResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTicketsResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTicketsResponseBodyPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListTicketsResponseBodyResultDialogs extends TeaModel {
        @NameInMap("Answer")
        public String answer;

        @NameInMap("Question")
        public String question;

        public static ListTicketsResponseBodyResultDialogs build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsResponseBodyResultDialogs self = new ListTicketsResponseBodyResultDialogs();
            return TeaModel.build(map, self);
        }

        public ListTicketsResponseBodyResultDialogs setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public ListTicketsResponseBodyResultDialogs setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

    }

    public static class ListTicketsResponseBodyResult extends TeaModel {
        @NameInMap("Action")
        public Boolean action;

        @NameInMap("AssignedHandler")
        public String assignedHandler;

        @NameInMap("ChargesRemark")
        public String chargesRemark;

        @NameInMap("CompleteRemark")
        public String completeRemark;

        @NameInMap("Dialogs")
        public java.util.List<ListTicketsResponseBodyResultDialogs> dialogs;

        @NameInMap("GmtCalled")
        public String gmtCalled;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtDelayed")
        public String gmtDelayed;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupKey")
        public String groupKey;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsAcceptedCharges")
        public Boolean isAcceptedCharges;

        @NameInMap("IsDelayed")
        public Boolean isDelayed;

        @NameInMap("IsNeedCallback")
        public Boolean isNeedCallback;

        @NameInMap("IsNeedCharges")
        public Boolean isNeedCharges;

        @NameInMap("Operations")
        public java.util.List<java.util.Map<String, ?>> operations;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RoomNo")
        public String roomNo;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListTicketsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsResponseBodyResult self = new ListTicketsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListTicketsResponseBodyResult setAction(Boolean action) {
            this.action = action;
            return this;
        }
        public Boolean getAction() {
            return this.action;
        }

        public ListTicketsResponseBodyResult setAssignedHandler(String assignedHandler) {
            this.assignedHandler = assignedHandler;
            return this;
        }
        public String getAssignedHandler() {
            return this.assignedHandler;
        }

        public ListTicketsResponseBodyResult setChargesRemark(String chargesRemark) {
            this.chargesRemark = chargesRemark;
            return this;
        }
        public String getChargesRemark() {
            return this.chargesRemark;
        }

        public ListTicketsResponseBodyResult setCompleteRemark(String completeRemark) {
            this.completeRemark = completeRemark;
            return this;
        }
        public String getCompleteRemark() {
            return this.completeRemark;
        }

        public ListTicketsResponseBodyResult setDialogs(java.util.List<ListTicketsResponseBodyResultDialogs> dialogs) {
            this.dialogs = dialogs;
            return this;
        }
        public java.util.List<ListTicketsResponseBodyResultDialogs> getDialogs() {
            return this.dialogs;
        }

        public ListTicketsResponseBodyResult setGmtCalled(String gmtCalled) {
            this.gmtCalled = gmtCalled;
            return this;
        }
        public String getGmtCalled() {
            return this.gmtCalled;
        }

        public ListTicketsResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTicketsResponseBodyResult setGmtDelayed(String gmtDelayed) {
            this.gmtDelayed = gmtDelayed;
            return this;
        }
        public String getGmtDelayed() {
            return this.gmtDelayed;
        }

        public ListTicketsResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListTicketsResponseBodyResult setGroupKey(String groupKey) {
            this.groupKey = groupKey;
            return this;
        }
        public String getGroupKey() {
            return this.groupKey;
        }

        public ListTicketsResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTicketsResponseBodyResult setIsAcceptedCharges(Boolean isAcceptedCharges) {
            this.isAcceptedCharges = isAcceptedCharges;
            return this;
        }
        public Boolean getIsAcceptedCharges() {
            return this.isAcceptedCharges;
        }

        public ListTicketsResponseBodyResult setIsDelayed(Boolean isDelayed) {
            this.isDelayed = isDelayed;
            return this;
        }
        public Boolean getIsDelayed() {
            return this.isDelayed;
        }

        public ListTicketsResponseBodyResult setIsNeedCallback(Boolean isNeedCallback) {
            this.isNeedCallback = isNeedCallback;
            return this;
        }
        public Boolean getIsNeedCallback() {
            return this.isNeedCallback;
        }

        public ListTicketsResponseBodyResult setIsNeedCharges(Boolean isNeedCharges) {
            this.isNeedCharges = isNeedCharges;
            return this;
        }
        public Boolean getIsNeedCharges() {
            return this.isNeedCharges;
        }

        public ListTicketsResponseBodyResult setOperations(java.util.List<java.util.Map<String, ?>> operations) {
            this.operations = operations;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getOperations() {
            return this.operations;
        }

        public ListTicketsResponseBodyResult setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListTicketsResponseBodyResult setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public ListTicketsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTicketsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
