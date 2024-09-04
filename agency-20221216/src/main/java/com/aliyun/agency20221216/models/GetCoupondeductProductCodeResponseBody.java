// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCoupondeductProductCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetCoupondeductProductCodeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>210e876f16704666020714468dab35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCoupondeductProductCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCoupondeductProductCodeResponseBody self = new GetCoupondeductProductCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCoupondeductProductCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCoupondeductProductCodeResponseBody setData(java.util.List<GetCoupondeductProductCodeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCoupondeductProductCodeResponseBodyData> getData() {
        return this.data;
    }

    public GetCoupondeductProductCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCoupondeductProductCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCoupondeductProductCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCoupondeductProductCodeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>code1</p>
         */
        @NameInMap("ProductType")
        public Object productType;

        public static GetCoupondeductProductCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCoupondeductProductCodeResponseBodyData self = new GetCoupondeductProductCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCoupondeductProductCodeResponseBodyData setProductType(Object productType) {
            this.productType = productType;
            return this;
        }
        public Object getProductType() {
            return this.productType;
        }

    }

}
