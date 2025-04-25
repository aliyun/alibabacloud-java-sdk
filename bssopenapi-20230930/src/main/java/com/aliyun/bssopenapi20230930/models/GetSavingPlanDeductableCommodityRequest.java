// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanDeductableCommodityRequest extends TeaModel {
    @NameInMap("EcIdAccountIds")
    public java.util.List<GetSavingPlanDeductableCommodityRequestEcIdAccountIds> ecIdAccountIds;

    @NameInMap("Nbid")
    public String nbid;

    public static GetSavingPlanDeductableCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanDeductableCommodityRequest self = new GetSavingPlanDeductableCommodityRequest();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanDeductableCommodityRequest setEcIdAccountIds(java.util.List<GetSavingPlanDeductableCommodityRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<GetSavingPlanDeductableCommodityRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public GetSavingPlanDeductableCommodityRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class GetSavingPlanDeductableCommodityRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static GetSavingPlanDeductableCommodityRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityRequestEcIdAccountIds self = new GetSavingPlanDeductableCommodityRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public GetSavingPlanDeductableCommodityRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
