// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryMonthlySlaListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EcIdAccountIds")
    public java.util.List<QueryMonthlySlaListRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <strong>example:</strong>
     * <p>[&quot;instance_1&quot;,&quot;instance_2&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>[202602,202603]</p>
     */
    @NameInMap("Months")
    public java.util.List<Integer> months;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PayStatuses")
    public java.util.List<Integer> payStatuses;

    /**
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
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
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
