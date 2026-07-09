// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryMonthlySlaListRequest extends TeaModel {
    /**
     * <p>The current page number. Default value: 1, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of enterprise entities and accounts. If this parameter is left empty, the current account is queried.</p>
     */
    @NameInMap("EcIdAccountIds")
    public java.util.List<QueryMonthlySlaListRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <p>Optional. Filter by instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;instance_1&quot;,&quot;instance_2&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>Optional. Month list in yyyyMM format.</p>
     * 
     * <strong>example:</strong>
     * <p>[202602,202603]</p>
     */
    @NameInMap("Months")
    public java.util.List<Integer> months;

    /**
     * <p>The level-1 marketplace ID. If this parameter is left empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Optional. Filter by compensation status. Valid values: 0 and 1.</p>
     */
    @NameInMap("PayStatuses")
    public java.util.List<Integer> payStatuses;

    /**
     * <p>Optional. Filter by product code.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ecs&quot;,&quot;oss&quot;]</p>
     */
    @NameInMap("ProductCodes")
    public java.util.List<String> productCodes;

    public static QueryMonthlySlaListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlySlaListRequest self = new QueryMonthlySlaListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMonthlySlaListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMonthlySlaListRequest setEcIdAccountIds(java.util.List<QueryMonthlySlaListRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<QueryMonthlySlaListRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public QueryMonthlySlaListRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public QueryMonthlySlaListRequest setMonths(java.util.List<Integer> months) {
        this.months = months;
        return this;
    }
    public java.util.List<Integer> getMonths() {
        return this.months;
    }

    public QueryMonthlySlaListRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public QueryMonthlySlaListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMonthlySlaListRequest setPayStatuses(java.util.List<Integer> payStatuses) {
        this.payStatuses = payStatuses;
        return this;
    }
    public java.util.List<Integer> getPayStatuses() {
        return this.payStatuses;
    }

    public QueryMonthlySlaListRequest setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

    public static class QueryMonthlySlaListRequestEcIdAccountIds extends TeaModel {
        /**
         * <p>The list of accounts to query. If this parameter is left empty, all accounts under the current entity ID are selected.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>The enterprise entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1501603440974415</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static QueryMonthlySlaListRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlySlaListRequestEcIdAccountIds self = new QueryMonthlySlaListRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public QueryMonthlySlaListRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public QueryMonthlySlaListRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
