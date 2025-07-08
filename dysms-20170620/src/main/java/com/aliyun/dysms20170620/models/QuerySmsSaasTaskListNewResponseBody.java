// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSaasTaskListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySmsSaasTaskListNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QuerySmsSaasTaskListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSaasTaskListNewResponseBody self = new QuerySmsSaasTaskListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSaasTaskListNewResponseBody setList(QuerySmsSaasTaskListNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySmsSaasTaskListNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySmsSaasTaskListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsSaasTaskListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsSaasTaskListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsSaasTaskListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams extends TeaModel {
        @NameInMap("AliyunUid")
        public Long aliyunUid;

        @NameInMap("CustId")
        public Long custId;

        @NameInMap("CycleNum")
        public Integer cycleNum;

        @NameInMap("PartnerId")
        public Long partnerId;

        public static QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams self = new QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams();
            return TeaModel.build(map, self);
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams setAliyunUid(Long aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams setCustId(Long custId) {
            this.custId = custId;
            return this;
        }
        public Long getCustId() {
            return this.custId;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams setCycleNum(Integer cycleNum) {
            this.cycleNum = cycleNum;
            return this;
        }
        public Integer getCycleNum() {
            return this.cycleNum;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams setPartnerId(Long partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public Long getPartnerId() {
            return this.partnerId;
        }

    }

    public static class QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("CommParams")
        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams commParams;

        @NameInMap("DetailDownloadUrl")
        public String detailDownloadUrl;

        @NameInMap("DetailDownloadUrlForSuccess")
        public String detailDownloadUrlForSuccess;

        @NameInMap("ExtParams")
        public String extParams;

        @NameInMap("FailCount")
        public Integer failCount;

        @NameInMap("FireTime")
        public String fireTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("IsPermitOrder")
        public Boolean isPermitOrder;

        @NameInMap("IsPermitOrderForSuccess")
        public Boolean isPermitOrderForSuccess;

        @NameInMap("OssFilePath")
        public String ossFilePath;

        @NameInMap("ScheduleType")
        public String scheduleType;

        @NameInMap("Status")
        public String status;

        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO self = new QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO();
            return TeaModel.build(map, self);
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setCommParams(QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams commParams) {
            this.commParams = commParams;
            return this;
        }
        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTOCommParams getCommParams() {
            return this.commParams;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setDetailDownloadUrl(String detailDownloadUrl) {
            this.detailDownloadUrl = detailDownloadUrl;
            return this;
        }
        public String getDetailDownloadUrl() {
            return this.detailDownloadUrl;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setDetailDownloadUrlForSuccess(String detailDownloadUrlForSuccess) {
            this.detailDownloadUrlForSuccess = detailDownloadUrlForSuccess;
            return this;
        }
        public String getDetailDownloadUrlForSuccess() {
            return this.detailDownloadUrlForSuccess;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setExtParams(String extParams) {
            this.extParams = extParams;
            return this;
        }
        public String getExtParams() {
            return this.extParams;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setFireTime(String fireTime) {
            this.fireTime = fireTime;
            return this;
        }
        public String getFireTime() {
            return this.fireTime;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setIsPermitOrder(Boolean isPermitOrder) {
            this.isPermitOrder = isPermitOrder;
            return this;
        }
        public Boolean getIsPermitOrder() {
            return this.isPermitOrder;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setIsPermitOrderForSuccess(Boolean isPermitOrderForSuccess) {
            this.isPermitOrderForSuccess = isPermitOrderForSuccess;
            return this;
        }
        public Boolean getIsPermitOrderForSuccess() {
            return this.isPermitOrderForSuccess;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setOssFilePath(String ossFilePath) {
            this.ossFilePath = ossFilePath;
            return this;
        }
        public String getOssFilePath() {
            return this.ossFilePath;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class QuerySmsSaasTaskListNewResponseBodyList extends TeaModel {
        @NameInMap("FcSaasTaskDTO")
        public java.util.List<QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO> fcSaasTaskDTO;

        public static QuerySmsSaasTaskListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSaasTaskListNewResponseBodyList self = new QuerySmsSaasTaskListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSaasTaskListNewResponseBodyList setFcSaasTaskDTO(java.util.List<QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO> fcSaasTaskDTO) {
            this.fcSaasTaskDTO = fcSaasTaskDTO;
            return this;
        }
        public java.util.List<QuerySmsSaasTaskListNewResponseBodyListFcSaasTaskDTO> getFcSaasTaskDTO() {
            return this.fcSaasTaskDTO;
        }

    }

}
