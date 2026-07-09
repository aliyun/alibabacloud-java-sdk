// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterResourceRequest extends TeaModel {
    /**
     * <p>The ID of the cost center.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CostCenterId")
    public Long costCenterId;

    /**
     * <p>The list of enterprises and accounts. An empty value indicates querying the current account.</p>
     */
    @NameInMap("EcIdAccountIds")
    public java.util.List<QueryCostCenterResourceRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <p>The maximum number of records per query.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The first-level marketplace ID. If empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The token for the next query. An empty NextToken indicates that there are no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCmd</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The owner user ID of the cost center.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567812345678</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

    public static QueryCostCenterResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterResourceRequest self = new QueryCostCenterResourceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterResourceRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public QueryCostCenterResourceRequest setEcIdAccountIds(java.util.List<QueryCostCenterResourceRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<QueryCostCenterResourceRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public QueryCostCenterResourceRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryCostCenterResourceRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public QueryCostCenterResourceRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryCostCenterResourceRequest setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public static class QueryCostCenterResourceRequestEcIdAccountIds extends TeaModel {
        /**
         * <p>The list of accessed accounts. An empty value indicates that all accounts under the current entity ID are selected.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>The enterprise entity ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1501603440974415</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static QueryCostCenterResourceRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterResourceRequestEcIdAccountIds self = new QueryCostCenterResourceRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterResourceRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public QueryCostCenterResourceRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
