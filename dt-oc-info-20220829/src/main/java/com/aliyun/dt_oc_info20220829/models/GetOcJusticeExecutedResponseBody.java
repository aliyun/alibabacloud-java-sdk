// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeExecutedResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcJusticeExecutedResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcJusticeExecutedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeExecutedResponseBody self = new GetOcJusticeExecutedResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeExecutedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcJusticeExecutedResponseBody setData(java.util.List<GetOcJusticeExecutedResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcJusticeExecutedResponseBodyData> getData() {
        return this.data;
    }

    public GetOcJusticeExecutedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcJusticeExecutedResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcJusticeExecutedResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcJusticeExecutedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcJusticeExecutedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcJusticeExecutedResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcJusticeExecutedResponseBodyData extends TeaModel {
        @NameInMap("Amount")
        public String amount;

        @NameInMap("CaseNum")
        public String caseNum;

        @NameInMap("Court")
        public String court;

        @NameInMap("FilingDate")
        public String filingDate;

        public static GetOcJusticeExecutedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcJusticeExecutedResponseBodyData self = new GetOcJusticeExecutedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcJusticeExecutedResponseBodyData setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetOcJusticeExecutedResponseBodyData setCaseNum(String caseNum) {
            this.caseNum = caseNum;
            return this;
        }
        public String getCaseNum() {
            return this.caseNum;
        }

        public GetOcJusticeExecutedResponseBodyData setCourt(String court) {
            this.court = court;
            return this;
        }
        public String getCourt() {
            return this.court;
        }

        public GetOcJusticeExecutedResponseBodyData setFilingDate(String filingDate) {
            this.filingDate = filingDate;
            return this;
        }
        public String getFilingDate() {
            return this.filingDate;
        }

    }

}
