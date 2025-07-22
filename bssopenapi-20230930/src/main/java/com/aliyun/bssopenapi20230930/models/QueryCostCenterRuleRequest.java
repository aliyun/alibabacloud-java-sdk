// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>597745</p>
     */
    @NameInMap("CostCenterId")
    public Long costCenterId;

    @NameInMap("EcIdAccountIds")
    public java.util.List<QueryCostCenterRuleRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static QueryCostCenterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterRuleRequest self = new QueryCostCenterRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterRuleRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public QueryCostCenterRuleRequest setEcIdAccountIds(java.util.List<QueryCostCenterRuleRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<QueryCostCenterRuleRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public QueryCostCenterRuleRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class QueryCostCenterRuleRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1004064243473974</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static QueryCostCenterRuleRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterRuleRequestEcIdAccountIds self = new QueryCostCenterRuleRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterRuleRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public QueryCostCenterRuleRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
