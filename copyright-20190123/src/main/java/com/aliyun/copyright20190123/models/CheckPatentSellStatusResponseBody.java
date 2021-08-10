// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class CheckPatentSellStatusResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<CheckPatentSellStatusResponseBodyData> data;

    public static CheckPatentSellStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckPatentSellStatusResponseBody self = new CheckPatentSellStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckPatentSellStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckPatentSellStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckPatentSellStatusResponseBody setData(java.util.List<CheckPatentSellStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CheckPatentSellStatusResponseBodyData> getData() {
        return this.data;
    }

    public static class CheckPatentSellStatusResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ApplyNumber")
        public String applyNumber;

        @NameInMap("Discount")
        public String discount;

        @NameInMap("Age")
        public String age;

        @NameInMap("Fee")
        public Float fee;

        public static CheckPatentSellStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckPatentSellStatusResponseBodyData self = new CheckPatentSellStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckPatentSellStatusResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CheckPatentSellStatusResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public CheckPatentSellStatusResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CheckPatentSellStatusResponseBodyData setApplyNumber(String applyNumber) {
            this.applyNumber = applyNumber;
            return this;
        }
        public String getApplyNumber() {
            return this.applyNumber;
        }

        public CheckPatentSellStatusResponseBodyData setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public CheckPatentSellStatusResponseBodyData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public CheckPatentSellStatusResponseBodyData setFee(Float fee) {
            this.fee = fee;
            return this;
        }
        public Float getFee() {
            return this.fee;
        }

    }

}
