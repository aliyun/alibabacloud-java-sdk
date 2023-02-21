// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcFinancingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcFinancingResponseBodyData> data;

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

    public static GetOcFinancingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcFinancingResponseBody self = new GetOcFinancingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcFinancingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcFinancingResponseBody setData(java.util.List<GetOcFinancingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcFinancingResponseBodyData> getData() {
        return this.data;
    }

    public GetOcFinancingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcFinancingResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcFinancingResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcFinancingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcFinancingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcFinancingResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcFinancingResponseBodyData extends TeaModel {
        @NameInMap("EntName")
        public String entName;

        @NameInMap("FinAmount")
        public String finAmount;

        @NameInMap("FinDate")
        public String finDate;

        @NameInMap("FinTurn")
        public String finTurn;

        @NameInMap("Investors")
        public String investors;

        public static GetOcFinancingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcFinancingResponseBodyData self = new GetOcFinancingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcFinancingResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcFinancingResponseBodyData setFinAmount(String finAmount) {
            this.finAmount = finAmount;
            return this;
        }
        public String getFinAmount() {
            return this.finAmount;
        }

        public GetOcFinancingResponseBodyData setFinDate(String finDate) {
            this.finDate = finDate;
            return this;
        }
        public String getFinDate() {
            return this.finDate;
        }

        public GetOcFinancingResponseBodyData setFinTurn(String finTurn) {
            this.finTurn = finTurn;
            return this;
        }
        public String getFinTurn() {
            return this.finTurn;
        }

        public GetOcFinancingResponseBodyData setInvestors(String investors) {
            this.investors = investors;
            return this;
        }
        public String getInvestors() {
            return this.investors;
        }

    }

}
