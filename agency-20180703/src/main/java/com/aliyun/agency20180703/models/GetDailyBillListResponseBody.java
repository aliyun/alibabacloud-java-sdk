// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetDailyBillListResponseBody extends TeaModel {
    @NameInMap("BigBillJson")
    public GetDailyBillListResponseBodyBigBillJson bigBillJson;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static GetDailyBillListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDailyBillListResponseBody self = new GetDailyBillListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDailyBillListResponseBody setBigBillJson(GetDailyBillListResponseBodyBigBillJson bigBillJson) {
        this.bigBillJson = bigBillJson;
        return this;
    }
    public GetDailyBillListResponseBodyBigBillJson getBigBillJson() {
        return this.bigBillJson;
    }

    public GetDailyBillListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDailyBillListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDailyBillListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDailyBillListResponseBodyBigBillJson extends TeaModel {
        @NameInMap("BillLinkCSV")
        public String billLinkCSV;

        @NameInMap("BillLinkXLSX")
        public String billLinkXLSX;

        @NameInMap("BillTime")
        public String billTime;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("UserType")
        public String userType;

        public static GetDailyBillListResponseBodyBigBillJson build(java.util.Map<String, ?> map) throws Exception {
            GetDailyBillListResponseBodyBigBillJson self = new GetDailyBillListResponseBodyBigBillJson();
            return TeaModel.build(map, self);
        }

        public GetDailyBillListResponseBodyBigBillJson setBillLinkCSV(String billLinkCSV) {
            this.billLinkCSV = billLinkCSV;
            return this;
        }
        public String getBillLinkCSV() {
            return this.billLinkCSV;
        }

        public GetDailyBillListResponseBodyBigBillJson setBillLinkXLSX(String billLinkXLSX) {
            this.billLinkXLSX = billLinkXLSX;
            return this;
        }
        public String getBillLinkXLSX() {
            return this.billLinkXLSX;
        }

        public GetDailyBillListResponseBodyBigBillJson setBillTime(String billTime) {
            this.billTime = billTime;
            return this;
        }
        public String getBillTime() {
            return this.billTime;
        }

        public GetDailyBillListResponseBodyBigBillJson setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public GetDailyBillListResponseBodyBigBillJson setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetDailyBillListResponseBodyBigBillJson setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
