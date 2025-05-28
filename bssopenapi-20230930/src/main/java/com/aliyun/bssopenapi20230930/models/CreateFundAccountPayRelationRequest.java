// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateFundAccountPayRelationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EcIdAccountIds")
    public java.util.List<CreateFundAccountPayRelationRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12332112</p>
     */
    @NameInMap("FundAccountId")
    public String fundAccountId;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static CreateFundAccountPayRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFundAccountPayRelationRequest self = new CreateFundAccountPayRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateFundAccountPayRelationRequest setEcIdAccountIds(java.util.List<CreateFundAccountPayRelationRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<CreateFundAccountPayRelationRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public CreateFundAccountPayRelationRequest setFundAccountId(String fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public String getFundAccountId() {
        return this.fundAccountId;
    }

    public CreateFundAccountPayRelationRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class CreateFundAccountPayRelationRequestEcIdAccountIds extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <strong>example:</strong>
         * <p>1501603440974415</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static CreateFundAccountPayRelationRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            CreateFundAccountPayRelationRequestEcIdAccountIds self = new CreateFundAccountPayRelationRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public CreateFundAccountPayRelationRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public CreateFundAccountPayRelationRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
