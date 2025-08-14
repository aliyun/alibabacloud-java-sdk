// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterShareRuleRequest extends TeaModel {
    @NameInMap("EcIdAccountIds")
    public java.util.List<QueryCostCenterShareRuleRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nYCisJwqt18pP5E9yb47iu</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1529600453335198</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

    public static QueryCostCenterShareRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterShareRuleRequest self = new QueryCostCenterShareRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterShareRuleRequest setEcIdAccountIds(java.util.List<QueryCostCenterShareRuleRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<QueryCostCenterShareRuleRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public QueryCostCenterShareRuleRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryCostCenterShareRuleRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public QueryCostCenterShareRuleRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryCostCenterShareRuleRequest setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public static class QueryCostCenterShareRuleRequestEcIdAccountIds extends TeaModel {
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

        public static QueryCostCenterShareRuleRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterShareRuleRequestEcIdAccountIds self = new QueryCostCenterShareRuleRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterShareRuleRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public QueryCostCenterShareRuleRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
