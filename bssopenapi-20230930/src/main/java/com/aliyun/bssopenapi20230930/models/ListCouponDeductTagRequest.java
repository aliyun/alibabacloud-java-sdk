// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListCouponDeductTagRequest extends TeaModel {
    @NameInMap("CouponId")
    public String couponId;

    @NameInMap("EcIdAccountIds")
    public java.util.List<ListCouponDeductTagRequestEcIdAccountIds> ecIdAccountIds;

    @NameInMap("Nbid")
    public String nbid;

    public static ListCouponDeductTagRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCouponDeductTagRequest self = new ListCouponDeductTagRequest();
        return TeaModel.build(map, self);
    }

    public ListCouponDeductTagRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public ListCouponDeductTagRequest setEcIdAccountIds(java.util.List<ListCouponDeductTagRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<ListCouponDeductTagRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public ListCouponDeductTagRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class ListCouponDeductTagRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static ListCouponDeductTagRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            ListCouponDeductTagRequestEcIdAccountIds self = new ListCouponDeductTagRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public ListCouponDeductTagRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public ListCouponDeductTagRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
