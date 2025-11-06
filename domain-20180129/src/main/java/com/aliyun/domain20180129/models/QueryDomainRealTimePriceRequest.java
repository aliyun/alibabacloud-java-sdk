// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainRealTimePriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USD</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainItem")
    public java.util.List<QueryDomainRealTimePriceRequestDomainItem> domainItem;

    public static QueryDomainRealTimePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainRealTimePriceRequest self = new QueryDomainRealTimePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainRealTimePriceRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryDomainRealTimePriceRequest setDomainItem(java.util.List<QueryDomainRealTimePriceRequestDomainItem> domainItem) {
        this.domainItem = domainItem;
        return this;
    }
    public java.util.List<QueryDomainRealTimePriceRequestDomainItem> getDomainItem() {
        return this.domainItem;
    }

    public static class QueryDomainRealTimePriceRequestDomainItem extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>renew</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <strong>example:</strong>
         * <p>com</p>
         */
        @NameInMap("Suffix")
        public String suffix;

        public static QueryDomainRealTimePriceRequestDomainItem build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainRealTimePriceRequestDomainItem self = new QueryDomainRealTimePriceRequestDomainItem();
            return TeaModel.build(map, self);
        }

        public QueryDomainRealTimePriceRequestDomainItem setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryDomainRealTimePriceRequestDomainItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainRealTimePriceRequestDomainItem setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public QueryDomainRealTimePriceRequestDomainItem setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

    }

}
