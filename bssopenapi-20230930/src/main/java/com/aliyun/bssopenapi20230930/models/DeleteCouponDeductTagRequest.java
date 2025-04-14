// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteCouponDeductTagRequest extends TeaModel {
    @NameInMap("CouponId")
    public String couponId;

    @NameInMap("EcIdAccountIds")
    public java.util.List<DeleteCouponDeductTagRequestEcIdAccountIds> ecIdAccountIds;

    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

    public static DeleteCouponDeductTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCouponDeductTagRequest self = new DeleteCouponDeductTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCouponDeductTagRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public DeleteCouponDeductTagRequest setEcIdAccountIds(java.util.List<DeleteCouponDeductTagRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<DeleteCouponDeductTagRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public DeleteCouponDeductTagRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DeleteCouponDeductTagRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

    public static class DeleteCouponDeductTagRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static DeleteCouponDeductTagRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteCouponDeductTagRequestEcIdAccountIds self = new DeleteCouponDeductTagRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public DeleteCouponDeductTagRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public DeleteCouponDeductTagRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
