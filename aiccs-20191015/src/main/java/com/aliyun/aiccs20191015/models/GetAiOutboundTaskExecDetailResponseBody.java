// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskExecDetailResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    // 任务执行列表
    @NameInMap("Data")
    public GetAiOutboundTaskExecDetailResponseBodyData data;

    public static GetAiOutboundTaskExecDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskExecDetailResponseBody self = new GetAiOutboundTaskExecDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskExecDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiOutboundTaskExecDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiOutboundTaskExecDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiOutboundTaskExecDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAiOutboundTaskExecDetailResponseBody setData(GetAiOutboundTaskExecDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiOutboundTaskExecDetailResponseBodyData getData() {
        return this.data;
    }

    public static class GetAiOutboundTaskExecDetailResponseBodyDataList extends TeaModel {
        // id
        @NameInMap("CaseId")
        public Long caseId;

        // 任务批次
        @NameInMap("BatchVersion")
        public Integer batchVersion;

        // 业务自定义信息
        @NameInMap("BizData")
        public String bizData;

        // 手机号
        @NameInMap("PhoneNum")
        public String phoneNum;

        // 外呼次数
        @NameInMap("CallCount")
        public Integer callCount;

        // 执行状态（1：待呼叫，2:呼叫中，3:已完成，4:已终止，5:待重呼）
        @NameInMap("Status")
        public Integer status;

        // 执行状态描述
        @NameInMap("StatusDesc")
        public Integer statusDesc;

        // 最后一次外呼结果
        @NameInMap("LastCallResult")
        public String lastCallResult;

        // 号码导入时间戳（毫秒）
        @NameInMap("CreateTime")
        public Long createTime;

        public static GetAiOutboundTaskExecDetailResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskExecDetailResponseBodyDataList self = new GetAiOutboundTaskExecDetailResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setCaseId(Long caseId) {
            this.caseId = caseId;
            return this;
        }
        public Long getCaseId() {
            return this.caseId;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setBatchVersion(Integer batchVersion) {
            this.batchVersion = batchVersion;
            return this;
        }
        public Integer getBatchVersion() {
            return this.batchVersion;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setBizData(String bizData) {
            this.bizData = bizData;
            return this;
        }
        public String getBizData() {
            return this.bizData;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setCallCount(Integer callCount) {
            this.callCount = callCount;
            return this;
        }
        public Integer getCallCount() {
            return this.callCount;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setStatusDesc(Integer statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public Integer getStatusDesc() {
            return this.statusDesc;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setLastCallResult(String lastCallResult) {
            this.lastCallResult = lastCallResult;
            return this;
        }
        public String getLastCallResult() {
            return this.lastCallResult;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

    public static class GetAiOutboundTaskExecDetailResponseBodyData extends TeaModel {
        // 分页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 是否有下一页
        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        // 总数
        @NameInMap("TotalResults")
        public Integer totalResults;

        // 当前页数
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // 外呼号码执行列表
        @NameInMap("List")
        public java.util.List<GetAiOutboundTaskExecDetailResponseBodyDataList> list;

        public static GetAiOutboundTaskExecDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskExecDetailResponseBodyData self = new GetAiOutboundTaskExecDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Integer getTotalResults() {
            return this.totalResults;
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setList(java.util.List<GetAiOutboundTaskExecDetailResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetAiOutboundTaskExecDetailResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
