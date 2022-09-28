// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetMonthBillListResponseBody extends TeaModel {
    @NameInMap("BigBillJson")
    public GetMonthBillListResponseBodyBigBillJson bigBillJson;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static GetMonthBillListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMonthBillListResponseBody self = new GetMonthBillListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMonthBillListResponseBody setBigBillJson(GetMonthBillListResponseBodyBigBillJson bigBillJson) {
        this.bigBillJson = bigBillJson;
        return this;
    }
    public GetMonthBillListResponseBodyBigBillJson getBigBillJson() {
        return this.bigBillJson;
    }

    public GetMonthBillListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMonthBillListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMonthBillListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMonthBillListResponseBodyBigBillJson extends TeaModel {
        @NameInMap("BillLinkCSV")
        public String billLinkCSV;

        @NameInMap("BillLinkXLSX")
        public String billLinkXLSX;

        @NameInMap("BillTime")
        public String billTime;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("InvoiceLink")
        public String invoiceLink;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("RefundInvoiceFlag")
        public Boolean refundInvoiceFlag;

        @NameInMap("RefundInvoiceLink")
        public String refundInvoiceLink;

        @NameInMap("UserType")
        public String userType;

        public static GetMonthBillListResponseBodyBigBillJson build(java.util.Map<String, ?> map) throws Exception {
            GetMonthBillListResponseBodyBigBillJson self = new GetMonthBillListResponseBodyBigBillJson();
            return TeaModel.build(map, self);
        }

        public GetMonthBillListResponseBodyBigBillJson setBillLinkCSV(String billLinkCSV) {
            this.billLinkCSV = billLinkCSV;
            return this;
        }
        public String getBillLinkCSV() {
            return this.billLinkCSV;
        }

        public GetMonthBillListResponseBodyBigBillJson setBillLinkXLSX(String billLinkXLSX) {
            this.billLinkXLSX = billLinkXLSX;
            return this;
        }
        public String getBillLinkXLSX() {
            return this.billLinkXLSX;
        }

        public GetMonthBillListResponseBodyBigBillJson setBillTime(String billTime) {
            this.billTime = billTime;
            return this;
        }
        public String getBillTime() {
            return this.billTime;
        }

        public GetMonthBillListResponseBodyBigBillJson setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public GetMonthBillListResponseBodyBigBillJson setInvoiceLink(String invoiceLink) {
            this.invoiceLink = invoiceLink;
            return this;
        }
        public String getInvoiceLink() {
            return this.invoiceLink;
        }

        public GetMonthBillListResponseBodyBigBillJson setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetMonthBillListResponseBodyBigBillJson setRefundInvoiceFlag(Boolean refundInvoiceFlag) {
            this.refundInvoiceFlag = refundInvoiceFlag;
            return this;
        }
        public Boolean getRefundInvoiceFlag() {
            return this.refundInvoiceFlag;
        }

        public GetMonthBillListResponseBodyBigBillJson setRefundInvoiceLink(String refundInvoiceLink) {
            this.refundInvoiceLink = refundInvoiceLink;
            return this;
        }
        public String getRefundInvoiceLink() {
            return this.refundInvoiceLink;
        }

        public GetMonthBillListResponseBodyBigBillJson setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
