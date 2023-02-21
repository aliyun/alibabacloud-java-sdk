// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxClassAResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcTaxClassAResponseBodyData> data;

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

    public static GetOcTaxClassAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxClassAResponseBody self = new GetOcTaxClassAResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcTaxClassAResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcTaxClassAResponseBody setData(java.util.List<GetOcTaxClassAResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcTaxClassAResponseBodyData> getData() {
        return this.data;
    }

    public GetOcTaxClassAResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcTaxClassAResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcTaxClassAResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcTaxClassAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcTaxClassAResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcTaxClassAResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcTaxClassAResponseBodyData extends TeaModel {
        @NameInMap("EntName")
        public String entName;

        @NameInMap("TaxLevel")
        public String taxLevel;

        @NameInMap("TaxpayerNum")
        public String taxpayerNum;

        @NameInMap("Year")
        public String year;

        public static GetOcTaxClassAResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcTaxClassAResponseBodyData self = new GetOcTaxClassAResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcTaxClassAResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcTaxClassAResponseBodyData setTaxLevel(String taxLevel) {
            this.taxLevel = taxLevel;
            return this;
        }
        public String getTaxLevel() {
            return this.taxLevel;
        }

        public GetOcTaxClassAResponseBodyData setTaxpayerNum(String taxpayerNum) {
            this.taxpayerNum = taxpayerNum;
            return this;
        }
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

        public GetOcTaxClassAResponseBodyData setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

    }

}
