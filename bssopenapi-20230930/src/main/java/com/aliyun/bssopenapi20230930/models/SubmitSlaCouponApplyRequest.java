// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SubmitSlaCouponApplyRequest extends TeaModel {
    /**
     * <p>Optional. Damaged record IDs.</p>
     */
    @NameInMap("DamagedIds")
    public java.util.List<String> damagedIds;

    /**
     * <p>Enterprise and account list. If empty, the current account itself is queried.</p>
     */
    @NameInMap("EcIdAccountIds")
    public java.util.List<SubmitSlaCouponApplyRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <p>Required. Application month in the yyyyMM format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202603</p>
     */
    @NameInMap("Month")
    public Integer month;

    /**
     * <p>Primary marketplace ID. If empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2084210001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static SubmitSlaCouponApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSlaCouponApplyRequest self = new SubmitSlaCouponApplyRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSlaCouponApplyRequest setDamagedIds(java.util.List<String> damagedIds) {
        this.damagedIds = damagedIds;
        return this;
    }
    public java.util.List<String> getDamagedIds() {
        return this.damagedIds;
    }

    public SubmitSlaCouponApplyRequest setEcIdAccountIds(java.util.List<SubmitSlaCouponApplyRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<SubmitSlaCouponApplyRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public SubmitSlaCouponApplyRequest setMonth(Integer month) {
        this.month = month;
        return this;
    }
    public Integer getMonth() {
        return this.month;
    }

    public SubmitSlaCouponApplyRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class SubmitSlaCouponApplyRequestEcIdAccountIds extends TeaModel {
        /**
         * <p>List of accounts to access. If empty, all accounts under the current entity ID are selected.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>Enterprise entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1501603440974415</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static SubmitSlaCouponApplyRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            SubmitSlaCouponApplyRequestEcIdAccountIds self = new SubmitSlaCouponApplyRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public SubmitSlaCouponApplyRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public SubmitSlaCouponApplyRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
