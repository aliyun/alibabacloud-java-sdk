// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AddCouponDeductTagRequest extends TeaModel {
    @NameInMap("CouponId")
    public String couponId;

    @NameInMap("EcIdAccountIds")
    public java.util.List<AddCouponDeductTagRequestEcIdAccountIds> ecIdAccountIds;

    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("Tags")
    public java.util.List<AddCouponDeductTagRequestTags> tags;

    public static AddCouponDeductTagRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCouponDeductTagRequest self = new AddCouponDeductTagRequest();
        return TeaModel.build(map, self);
    }

    public AddCouponDeductTagRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public AddCouponDeductTagRequest setEcIdAccountIds(java.util.List<AddCouponDeductTagRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<AddCouponDeductTagRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public AddCouponDeductTagRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public AddCouponDeductTagRequest setTags(java.util.List<AddCouponDeductTagRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<AddCouponDeductTagRequestTags> getTags() {
        return this.tags;
    }

    public static class AddCouponDeductTagRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static AddCouponDeductTagRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            AddCouponDeductTagRequestEcIdAccountIds self = new AddCouponDeductTagRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public AddCouponDeductTagRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public AddCouponDeductTagRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

    public static class AddCouponDeductTagRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static AddCouponDeductTagRequestTags build(java.util.Map<String, ?> map) throws Exception {
            AddCouponDeductTagRequestTags self = new AddCouponDeductTagRequestTags();
            return TeaModel.build(map, self);
        }

        public AddCouponDeductTagRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddCouponDeductTagRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
