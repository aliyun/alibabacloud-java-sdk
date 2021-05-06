// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class TaskListResponseBody extends TeaModel {
    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // data
    @NameInMap("Data")
    public TaskListResponseBodyData data;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // success
    @NameInMap("Success")
    public Boolean success;

    // exception
    @NameInMap("Exception")
    public java.util.Map<String, ?> exception;

    @NameInMap("RequestId")
    public String requestId;

    public static TaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaskListResponseBody self = new TaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public TaskListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TaskListResponseBody setData(TaskListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TaskListResponseBodyData getData() {
        return this.data;
    }

    public TaskListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TaskListResponseBody setException(java.util.Map<String, ?> exception) {
        this.exception = exception;
        return this;
    }
    public java.util.Map<String, ?> getException() {
        return this.exception;
    }

    public TaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TaskListResponseBodyDataRows extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("ApplyOrderId")
        public String applyOrderId;

        @NameInMap("RequirementId")
        public String requirementId;

        @NameInMap("BpId")
        public String bpId;

        @NameInMap("ArticleSpecCode")
        public String articleSpecCode;

        @NameInMap("ArticleSpecDesc")
        public String articleSpecDesc;

        @NameInMap("PoId")
        public String poId;

        @NameInMap("PrLineId")
        public String prLineId;

        @NameInMap("PrNo")
        public String prNo;

        @NameInMap("Status")
        public String status;

        @NameInMap("PreShipTime")
        public Long preShipTime;

        @NameInMap("ShipTime")
        public Long shipTime;

        @NameInMap("SignTime")
        public Long signTime;

        @NameInMap("InstallTime")
        public Long installTime;

        @NameInMap("AcceptedTime")
        public Long acceptedTime;

        @NameInMap("BpidName")
        public String bpidName;

        public static TaskListResponseBodyDataRows build(java.util.Map<String, ?> map) throws Exception {
            TaskListResponseBodyDataRows self = new TaskListResponseBodyDataRows();
            return TeaModel.build(map, self);
        }

        public TaskListResponseBodyDataRows setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public TaskListResponseBodyDataRows setApplyOrderId(String applyOrderId) {
            this.applyOrderId = applyOrderId;
            return this;
        }
        public String getApplyOrderId() {
            return this.applyOrderId;
        }

        public TaskListResponseBodyDataRows setRequirementId(String requirementId) {
            this.requirementId = requirementId;
            return this;
        }
        public String getRequirementId() {
            return this.requirementId;
        }

        public TaskListResponseBodyDataRows setBpId(String bpId) {
            this.bpId = bpId;
            return this;
        }
        public String getBpId() {
            return this.bpId;
        }

        public TaskListResponseBodyDataRows setArticleSpecCode(String articleSpecCode) {
            this.articleSpecCode = articleSpecCode;
            return this;
        }
        public String getArticleSpecCode() {
            return this.articleSpecCode;
        }

        public TaskListResponseBodyDataRows setArticleSpecDesc(String articleSpecDesc) {
            this.articleSpecDesc = articleSpecDesc;
            return this;
        }
        public String getArticleSpecDesc() {
            return this.articleSpecDesc;
        }

        public TaskListResponseBodyDataRows setPoId(String poId) {
            this.poId = poId;
            return this;
        }
        public String getPoId() {
            return this.poId;
        }

        public TaskListResponseBodyDataRows setPrLineId(String prLineId) {
            this.prLineId = prLineId;
            return this;
        }
        public String getPrLineId() {
            return this.prLineId;
        }

        public TaskListResponseBodyDataRows setPrNo(String prNo) {
            this.prNo = prNo;
            return this;
        }
        public String getPrNo() {
            return this.prNo;
        }

        public TaskListResponseBodyDataRows setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public TaskListResponseBodyDataRows setPreShipTime(Long preShipTime) {
            this.preShipTime = preShipTime;
            return this;
        }
        public Long getPreShipTime() {
            return this.preShipTime;
        }

        public TaskListResponseBodyDataRows setShipTime(Long shipTime) {
            this.shipTime = shipTime;
            return this;
        }
        public Long getShipTime() {
            return this.shipTime;
        }

        public TaskListResponseBodyDataRows setSignTime(Long signTime) {
            this.signTime = signTime;
            return this;
        }
        public Long getSignTime() {
            return this.signTime;
        }

        public TaskListResponseBodyDataRows setInstallTime(Long installTime) {
            this.installTime = installTime;
            return this;
        }
        public Long getInstallTime() {
            return this.installTime;
        }

        public TaskListResponseBodyDataRows setAcceptedTime(Long acceptedTime) {
            this.acceptedTime = acceptedTime;
            return this;
        }
        public Long getAcceptedTime() {
            return this.acceptedTime;
        }

        public TaskListResponseBodyDataRows setBpidName(String bpidName) {
            this.bpidName = bpidName;
            return this;
        }
        public String getBpidName() {
            return this.bpidName;
        }

    }

    public static class TaskListResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public java.util.List<TaskListResponseBodyDataRows> rows;

        @NameInMap("Total")
        public Long total;

        public static TaskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TaskListResponseBodyData self = new TaskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TaskListResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public TaskListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public TaskListResponseBodyData setRows(java.util.List<TaskListResponseBodyDataRows> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<TaskListResponseBodyDataRows> getRows() {
            return this.rows;
        }

        public TaskListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
