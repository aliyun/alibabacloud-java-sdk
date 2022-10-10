// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetCouponSaleStdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Models")
    public java.util.List<GetCouponSaleStdResponseBodyModels> models;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCouponSaleStdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCouponSaleStdResponseBody self = new GetCouponSaleStdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCouponSaleStdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCouponSaleStdResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetCouponSaleStdResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetCouponSaleStdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCouponSaleStdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCouponSaleStdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCouponSaleStdResponseBody setModels(java.util.List<GetCouponSaleStdResponseBodyModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<GetCouponSaleStdResponseBodyModels> getModels() {
        return this.models;
    }

    public GetCouponSaleStdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCouponSaleStdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCouponSaleStdResponseBodyModels extends TeaModel {
        @NameInMap("CostEfficiencyRate")
        public String costEfficiencyRate;

        @NameInMap("CouponAmtStd")
        public String couponAmtStd;

        @NameInMap("CouponItemCntStd")
        public Long couponItemCntStd;

        @NameInMap("CouponNewCusCntStd")
        public Long couponNewCusCntStd;

        @NameInMap("CouponOldCusCntStd")
        public Long couponOldCusCntStd;

        @NameInMap("CouponOrderSaleAmtStd")
        public String couponOrderSaleAmtStd;

        @NameInMap("CouponTemplateCd")
        public String couponTemplateCd;

        @NameInMap("CouponUnitPrice")
        public String couponUnitPrice;

        public static GetCouponSaleStdResponseBodyModels build(java.util.Map<String, ?> map) throws Exception {
            GetCouponSaleStdResponseBodyModels self = new GetCouponSaleStdResponseBodyModels();
            return TeaModel.build(map, self);
        }

        public GetCouponSaleStdResponseBodyModels setCostEfficiencyRate(String costEfficiencyRate) {
            this.costEfficiencyRate = costEfficiencyRate;
            return this;
        }
        public String getCostEfficiencyRate() {
            return this.costEfficiencyRate;
        }

        public GetCouponSaleStdResponseBodyModels setCouponAmtStd(String couponAmtStd) {
            this.couponAmtStd = couponAmtStd;
            return this;
        }
        public String getCouponAmtStd() {
            return this.couponAmtStd;
        }

        public GetCouponSaleStdResponseBodyModels setCouponItemCntStd(Long couponItemCntStd) {
            this.couponItemCntStd = couponItemCntStd;
            return this;
        }
        public Long getCouponItemCntStd() {
            return this.couponItemCntStd;
        }

        public GetCouponSaleStdResponseBodyModels setCouponNewCusCntStd(Long couponNewCusCntStd) {
            this.couponNewCusCntStd = couponNewCusCntStd;
            return this;
        }
        public Long getCouponNewCusCntStd() {
            return this.couponNewCusCntStd;
        }

        public GetCouponSaleStdResponseBodyModels setCouponOldCusCntStd(Long couponOldCusCntStd) {
            this.couponOldCusCntStd = couponOldCusCntStd;
            return this;
        }
        public Long getCouponOldCusCntStd() {
            return this.couponOldCusCntStd;
        }

        public GetCouponSaleStdResponseBodyModels setCouponOrderSaleAmtStd(String couponOrderSaleAmtStd) {
            this.couponOrderSaleAmtStd = couponOrderSaleAmtStd;
            return this;
        }
        public String getCouponOrderSaleAmtStd() {
            return this.couponOrderSaleAmtStd;
        }

        public GetCouponSaleStdResponseBodyModels setCouponTemplateCd(String couponTemplateCd) {
            this.couponTemplateCd = couponTemplateCd;
            return this;
        }
        public String getCouponTemplateCd() {
            return this.couponTemplateCd;
        }

        public GetCouponSaleStdResponseBodyModels setCouponUnitPrice(String couponUnitPrice) {
            this.couponUnitPrice = couponUnitPrice;
            return this;
        }
        public String getCouponUnitPrice() {
            return this.couponUnitPrice;
        }

    }

}
