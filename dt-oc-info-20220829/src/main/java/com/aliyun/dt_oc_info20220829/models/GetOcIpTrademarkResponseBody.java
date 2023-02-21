// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpTrademarkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIpTrademarkResponseBodyData> data;

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

    public static GetOcIpTrademarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpTrademarkResponseBody self = new GetOcIpTrademarkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIpTrademarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIpTrademarkResponseBody setData(java.util.List<GetOcIpTrademarkResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIpTrademarkResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIpTrademarkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIpTrademarkResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIpTrademarkResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIpTrademarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIpTrademarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIpTrademarkResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIpTrademarkResponseBodyData extends TeaModel {
        @NameInMap("Agent")
        public String agent;

        @NameInMap("ApplyDate")
        public String applyDate;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("FirstPubDate")
        public String firstPubDate;

        @NameInMap("FirstPubNo")
        public String firstPubNo;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("Period")
        public String period;

        @NameInMap("RegNum")
        public String regNum;

        @NameInMap("RegPubDate")
        public String regPubDate;

        @NameInMap("RegPubNo")
        public String regPubNo;

        @NameInMap("TrademarkForm")
        public String trademarkForm;

        @NameInMap("TrademarkName")
        public String trademarkName;

        @NameInMap("TrademarkStatus")
        public String trademarkStatus;

        @NameInMap("TrademarkType")
        public String trademarkType;

        @NameInMap("TypeName")
        public String typeName;

        public static GetOcIpTrademarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIpTrademarkResponseBodyData self = new GetOcIpTrademarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIpTrademarkResponseBodyData setAgent(String agent) {
            this.agent = agent;
            return this;
        }
        public String getAgent() {
            return this.agent;
        }

        public GetOcIpTrademarkResponseBodyData setApplyDate(String applyDate) {
            this.applyDate = applyDate;
            return this;
        }
        public String getApplyDate() {
            return this.applyDate;
        }

        public GetOcIpTrademarkResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIpTrademarkResponseBodyData setFirstPubDate(String firstPubDate) {
            this.firstPubDate = firstPubDate;
            return this;
        }
        public String getFirstPubDate() {
            return this.firstPubDate;
        }

        public GetOcIpTrademarkResponseBodyData setFirstPubNo(String firstPubNo) {
            this.firstPubNo = firstPubNo;
            return this;
        }
        public String getFirstPubNo() {
            return this.firstPubNo;
        }

        public GetOcIpTrademarkResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetOcIpTrademarkResponseBodyData setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public GetOcIpTrademarkResponseBodyData setRegNum(String regNum) {
            this.regNum = regNum;
            return this;
        }
        public String getRegNum() {
            return this.regNum;
        }

        public GetOcIpTrademarkResponseBodyData setRegPubDate(String regPubDate) {
            this.regPubDate = regPubDate;
            return this;
        }
        public String getRegPubDate() {
            return this.regPubDate;
        }

        public GetOcIpTrademarkResponseBodyData setRegPubNo(String regPubNo) {
            this.regPubNo = regPubNo;
            return this;
        }
        public String getRegPubNo() {
            return this.regPubNo;
        }

        public GetOcIpTrademarkResponseBodyData setTrademarkForm(String trademarkForm) {
            this.trademarkForm = trademarkForm;
            return this;
        }
        public String getTrademarkForm() {
            return this.trademarkForm;
        }

        public GetOcIpTrademarkResponseBodyData setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public GetOcIpTrademarkResponseBodyData setTrademarkStatus(String trademarkStatus) {
            this.trademarkStatus = trademarkStatus;
            return this;
        }
        public String getTrademarkStatus() {
            return this.trademarkStatus;
        }

        public GetOcIpTrademarkResponseBodyData setTrademarkType(String trademarkType) {
            this.trademarkType = trademarkType;
            return this;
        }
        public String getTrademarkType() {
            return this.trademarkType;
        }

        public GetOcIpTrademarkResponseBodyData setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
