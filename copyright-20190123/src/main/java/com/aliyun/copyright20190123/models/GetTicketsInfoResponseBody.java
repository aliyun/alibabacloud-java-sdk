// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetTicketsInfoResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetTicketsInfoResponseBodyData> data;

    public static GetTicketsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketsInfoResponseBody self = new GetTicketsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTicketsInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTicketsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTicketsInfoResponseBody setData(java.util.List<GetTicketsInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTicketsInfoResponseBodyData> getData() {
        return this.data;
    }

    public static class GetTicketsInfoResponseBodyData extends TeaModel {
        @NameInMap("InvoiceUrl")
        public String invoiceUrl;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("PatentNo")
        public Long patentNo;

        @NameInMap("InvoiceYear")
        public Integer invoiceYear;

        @NameInMap("Fee")
        public String fee;

        public static GetTicketsInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTicketsInfoResponseBodyData self = new GetTicketsInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTicketsInfoResponseBodyData setInvoiceUrl(String invoiceUrl) {
            this.invoiceUrl = invoiceUrl;
            return this;
        }
        public String getInvoiceUrl() {
            return this.invoiceUrl;
        }

        public GetTicketsInfoResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetTicketsInfoResponseBodyData setPatentNo(Long patentNo) {
            this.patentNo = patentNo;
            return this;
        }
        public Long getPatentNo() {
            return this.patentNo;
        }

        public GetTicketsInfoResponseBodyData setInvoiceYear(Integer invoiceYear) {
            this.invoiceYear = invoiceYear;
            return this;
        }
        public Integer getInvoiceYear() {
            return this.invoiceYear;
        }

        public GetTicketsInfoResponseBodyData setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

    }

}
