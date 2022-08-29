// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccApprovalStatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetCsccApprovalStatsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCsccApprovalStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCsccApprovalStatsResponseBody self = new GetCsccApprovalStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCsccApprovalStatsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetCsccApprovalStatsResponseBody setData(GetCsccApprovalStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCsccApprovalStatsResponseBodyData getData() {
        return this.data;
    }

    public GetCsccApprovalStatsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCsccApprovalStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCsccApprovalStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCsccApprovalStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCsccApprovalStatsResponseBodyData extends TeaModel {
        @NameInMap("DoneNum")
        public Integer doneNum;

        @NameInMap("PendingNum")
        public Integer pendingNum;

        @NameInMap("ProposedNum")
        public Integer proposedNum;

        public static GetCsccApprovalStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCsccApprovalStatsResponseBodyData self = new GetCsccApprovalStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCsccApprovalStatsResponseBodyData setDoneNum(Integer doneNum) {
            this.doneNum = doneNum;
            return this;
        }
        public Integer getDoneNum() {
            return this.doneNum;
        }

        public GetCsccApprovalStatsResponseBodyData setPendingNum(Integer pendingNum) {
            this.pendingNum = pendingNum;
            return this;
        }
        public Integer getPendingNum() {
            return this.pendingNum;
        }

        public GetCsccApprovalStatsResponseBodyData setProposedNum(Integer proposedNum) {
            this.proposedNum = proposedNum;
            return this;
        }
        public Integer getProposedNum() {
            return this.proposedNum;
        }

    }

}
