// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskExecDetailResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of task executions.</p>
     */
    @NameInMap("Data")
    public GetAiOutboundTaskExecDetailResponseBodyData data;

    /**
     * <p>Status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API was invoked successfully.</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Job batch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchVersion")
        public Integer batchVersion;

        /**
         * <p>Custom business information</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BizData")
        public String bizData;

        /**
         * <p>The number of outbound calls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallCount")
        public Integer callCount;

        /**
         * <p>The activity ID associated with this outbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CaseId")
        public Long caseId;

        /**
         * <p>Number import time. UNIX timestamp format, unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1632289999000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Result of the last outbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>未接通</p>
         */
        @NameInMap("LastCallResult")
        public String lastCallResult;

        /**
         * <p>Outbound phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>150****0000</p>
         */
        @NameInMap("PhoneNum")
        public String phoneNum;

        /**
         * <p>Execution status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Pending call.</li>
         * <li><strong>2</strong>: Calling.</li>
         * <li><strong>3</strong>: Completed.</li>
         * <li><strong>4</strong>: Stopped.</li>
         * <li><strong>5</strong>: Pending retry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Execution status description.</p>
         * 
         * <strong>example:</strong>
         * <p>待呼叫</p>
         */
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
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>Indicates whether a next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        /**
         * <p>List of outbound call executions.</p>
         */
        @NameInMap("List")
        public java.util.List<GetAiOutboundTaskExecDetailResponseBodyDataList> list;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>199</p>
         */
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
