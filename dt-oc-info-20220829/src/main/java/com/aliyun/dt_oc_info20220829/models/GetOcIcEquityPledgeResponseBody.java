// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcEquityPledgeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcEquityPledgeResponseBodyData> data;

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

    public static GetOcIcEquityPledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcEquityPledgeResponseBody self = new GetOcIcEquityPledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcEquityPledgeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcEquityPledgeResponseBody setData(java.util.List<GetOcIcEquityPledgeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcEquityPledgeResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcEquityPledgeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcEquityPledgeResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcEquityPledgeResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcEquityPledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcEquityPledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcEquityPledgeResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcEquityPledgeResponseBodyData extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("Pawnee")
        public String pawnee;

        @NameInMap("PawneeIdentifyNo")
        public String pawneeIdentifyNo;

        @NameInMap("Pledgor")
        public String pledgor;

        @NameInMap("PledgorAmount")
        public String pledgorAmount;

        @NameInMap("PledgorIdentifyNo")
        public String pledgorIdentifyNo;

        @NameInMap("PublicDate")
        public String publicDate;

        @NameInMap("RegDate")
        public String regDate;

        @NameInMap("RelatedComp")
        public String relatedComp;

        @NameInMap("Status")
        public String status;

        public static GetOcIcEquityPledgeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcEquityPledgeResponseBodyData self = new GetOcIcEquityPledgeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcEquityPledgeResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetOcIcEquityPledgeResponseBodyData setPawnee(String pawnee) {
            this.pawnee = pawnee;
            return this;
        }
        public String getPawnee() {
            return this.pawnee;
        }

        public GetOcIcEquityPledgeResponseBodyData setPawneeIdentifyNo(String pawneeIdentifyNo) {
            this.pawneeIdentifyNo = pawneeIdentifyNo;
            return this;
        }
        public String getPawneeIdentifyNo() {
            return this.pawneeIdentifyNo;
        }

        public GetOcIcEquityPledgeResponseBodyData setPledgor(String pledgor) {
            this.pledgor = pledgor;
            return this;
        }
        public String getPledgor() {
            return this.pledgor;
        }

        public GetOcIcEquityPledgeResponseBodyData setPledgorAmount(String pledgorAmount) {
            this.pledgorAmount = pledgorAmount;
            return this;
        }
        public String getPledgorAmount() {
            return this.pledgorAmount;
        }

        public GetOcIcEquityPledgeResponseBodyData setPledgorIdentifyNo(String pledgorIdentifyNo) {
            this.pledgorIdentifyNo = pledgorIdentifyNo;
            return this;
        }
        public String getPledgorIdentifyNo() {
            return this.pledgorIdentifyNo;
        }

        public GetOcIcEquityPledgeResponseBodyData setPublicDate(String publicDate) {
            this.publicDate = publicDate;
            return this;
        }
        public String getPublicDate() {
            return this.publicDate;
        }

        public GetOcIcEquityPledgeResponseBodyData setRegDate(String regDate) {
            this.regDate = regDate;
            return this;
        }
        public String getRegDate() {
            return this.regDate;
        }

        public GetOcIcEquityPledgeResponseBodyData setRelatedComp(String relatedComp) {
            this.relatedComp = relatedComp;
            return this;
        }
        public String getRelatedComp() {
            return this.relatedComp;
        }

        public GetOcIcEquityPledgeResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
