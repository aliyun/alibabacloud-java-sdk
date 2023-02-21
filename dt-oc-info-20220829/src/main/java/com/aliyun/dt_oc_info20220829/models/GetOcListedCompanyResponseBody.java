// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcListedCompanyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcListedCompanyResponseBodyData> data;

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

    public static GetOcListedCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcListedCompanyResponseBody self = new GetOcListedCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcListedCompanyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcListedCompanyResponseBody setData(java.util.List<GetOcListedCompanyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcListedCompanyResponseBodyData> getData() {
        return this.data;
    }

    public GetOcListedCompanyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcListedCompanyResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcListedCompanyResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcListedCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcListedCompanyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcListedCompanyResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcListedCompanyResponseBodyData extends TeaModel {
        @NameInMap("CirculationMarketValue")
        public String circulationMarketValue;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("EntNameEng")
        public String entNameEng;

        @NameInMap("ListDate")
        public String listDate;

        @NameInMap("SecuritiesCode")
        public String securitiesCode;

        @NameInMap("SecuritiesMarket")
        public String securitiesMarket;

        @NameInMap("SecuritiesName")
        public String securitiesName;

        @NameInMap("TotalFlowShares")
        public String totalFlowShares;

        @NameInMap("TotalShares")
        public String totalShares;

        public static GetOcListedCompanyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcListedCompanyResponseBodyData self = new GetOcListedCompanyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcListedCompanyResponseBodyData setCirculationMarketValue(String circulationMarketValue) {
            this.circulationMarketValue = circulationMarketValue;
            return this;
        }
        public String getCirculationMarketValue() {
            return this.circulationMarketValue;
        }

        public GetOcListedCompanyResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcListedCompanyResponseBodyData setEntNameEng(String entNameEng) {
            this.entNameEng = entNameEng;
            return this;
        }
        public String getEntNameEng() {
            return this.entNameEng;
        }

        public GetOcListedCompanyResponseBodyData setListDate(String listDate) {
            this.listDate = listDate;
            return this;
        }
        public String getListDate() {
            return this.listDate;
        }

        public GetOcListedCompanyResponseBodyData setSecuritiesCode(String securitiesCode) {
            this.securitiesCode = securitiesCode;
            return this;
        }
        public String getSecuritiesCode() {
            return this.securitiesCode;
        }

        public GetOcListedCompanyResponseBodyData setSecuritiesMarket(String securitiesMarket) {
            this.securitiesMarket = securitiesMarket;
            return this;
        }
        public String getSecuritiesMarket() {
            return this.securitiesMarket;
        }

        public GetOcListedCompanyResponseBodyData setSecuritiesName(String securitiesName) {
            this.securitiesName = securitiesName;
            return this;
        }
        public String getSecuritiesName() {
            return this.securitiesName;
        }

        public GetOcListedCompanyResponseBodyData setTotalFlowShares(String totalFlowShares) {
            this.totalFlowShares = totalFlowShares;
            return this;
        }
        public String getTotalFlowShares() {
            return this.totalFlowShares;
        }

        public GetOcListedCompanyResponseBodyData setTotalShares(String totalShares) {
            this.totalShares = totalShares;
            return this;
        }
        public String getTotalShares() {
            return this.totalShares;
        }

    }

}
