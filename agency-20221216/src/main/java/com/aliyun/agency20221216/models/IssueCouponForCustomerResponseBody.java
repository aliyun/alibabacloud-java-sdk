// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class IssueCouponForCustomerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("data")
    public IssueCouponForCustomerResponseBodyData data;

    public static IssueCouponForCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IssueCouponForCustomerResponseBody self = new IssueCouponForCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public IssueCouponForCustomerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IssueCouponForCustomerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IssueCouponForCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IssueCouponForCustomerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IssueCouponForCustomerResponseBody setData(IssueCouponForCustomerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IssueCouponForCustomerResponseBodyData getData() {
        return this.data;
    }

    public static class IssueCouponForCustomerResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5075915</p>
         */
        @NameInMap("CouponTemplateId")
        public Long couponTemplateId;

        /**
         * <strong>example:</strong>
         * <p>2024-03-05 18:24:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>111,2222</p>
         */
        @NameInMap("Uidlist")
        public String uidlist;

        public static IssueCouponForCustomerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IssueCouponForCustomerResponseBodyData self = new IssueCouponForCustomerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IssueCouponForCustomerResponseBodyData setCouponTemplateId(Long couponTemplateId) {
            this.couponTemplateId = couponTemplateId;
            return this;
        }
        public Long getCouponTemplateId() {
            return this.couponTemplateId;
        }

        public IssueCouponForCustomerResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public IssueCouponForCustomerResponseBodyData setUidlist(String uidlist) {
            this.uidlist = uidlist;
            return this;
        }
        public String getUidlist() {
            return this.uidlist;
        }

    }

}
