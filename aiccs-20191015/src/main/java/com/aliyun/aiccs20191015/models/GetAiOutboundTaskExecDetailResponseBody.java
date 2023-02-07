// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskExecDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAiOutboundTaskExecDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAiOutboundTaskExecDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskExecDetailResponseBody self = new GetAiOutboundTaskExecDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskExecDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiOutboundTaskExecDetailResponseBody setData(GetAiOutboundTaskExecDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiOutboundTaskExecDetailResponseBodyData getData() {
        return this.data;
    }

    public GetAiOutboundTaskExecDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiOutboundTaskExecDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiOutboundTaskExecDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAiOutboundTaskExecDetailResponseBodyDataList extends TeaModel {
        @NameInMap("BatchVersion")
        public Integer batchVersion;

        @NameInMap("BizData")
        public String bizData;

        @NameInMap("CallCount")
        public Integer callCount;

        @NameInMap("CaseId")
        public Long caseId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LastCallResult")
        public String lastCallResult;

        @NameInMap("PhoneNum")
        public String phoneNum;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusDesc")
        public Integer statusDesc;

        public static GetAiOutboundTaskExecDetailResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskExecDetailResponseBodyDataList self = new GetAiOutboundTaskExecDetailResponseBodyDataList();
            return TeaModel.build(map, self);
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

        public GetAiOutboundTaskExecDetailResponseBodyDataList setCallCount(Integer callCount) {
            this.callCount = callCount;
            return this;
        }
        public Integer getCallCount() {
            return this.callCount;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setCaseId(Long caseId) {
            this.caseId = caseId;
            return this;
        }
        public Long getCaseId() {
            return this.caseId;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setLastCallResult(String lastCallResult) {
            this.lastCallResult = lastCallResult;
            return this;
        }
        public String getLastCallResult() {
            return this.lastCallResult;
        }

        public GetAiOutboundTaskExecDetailResponseBodyDataList setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
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

    }

    public static class GetAiOutboundTaskExecDetailResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        @NameInMap("List")
        public java.util.List<GetAiOutboundTaskExecDetailResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalResults")
        public Integer totalResults;

        public static GetAiOutboundTaskExecDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskExecDetailResponseBodyData self = new GetAiOutboundTaskExecDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setList(java.util.List<GetAiOutboundTaskExecDetailResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetAiOutboundTaskExecDetailResponseBodyDataList> getList() {
            return this.list;
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAiOutboundTaskExecDetailResponseBodyData setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Integer getTotalResults() {
            return this.totalResults;
        }

    }

}
