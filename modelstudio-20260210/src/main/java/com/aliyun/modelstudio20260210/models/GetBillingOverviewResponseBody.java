// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingOverviewResponseBody extends TeaModel {
    /**
     * <p>The request result code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The bill overview data.</p>
     */
    @NameInMap("data")
    public GetBillingOverviewResponseBodyData data;

    /**
     * <p>The request result message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BB521414-5D38-5E66-AA66-963B2B4200E2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetBillingOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBillingOverviewResponseBody self = new GetBillingOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBillingOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBillingOverviewResponseBody setData(GetBillingOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBillingOverviewResponseBodyData getData() {
        return this.data;
    }

    public GetBillingOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBillingOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBillingOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBillingOverviewResponseBodyDataGroups extends TeaModel {
        /**
         * <p>The amount of the current group.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>The list of commodity codes associated with the current group.</p>
         */
        @NameInMap("articleCodes")
        public java.util.List<String> articleCodes;

        /**
         * <p>The grouping dimension value. A null value is returned as DIMENSION_FILTER_NULL_VALUE.</p>
         * 
         * <strong>example:</strong>
         * <p>inference</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The display name of the group, which is affected by the locale parameter. A null value is displayed as -.</p>
         * 
         * <strong>example:</strong>
         * <p>Model invocation</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ratio of the group amount to the total amount of the top N groups.</p>
         * 
         * <strong>example:</strong>
         * <p>0.10</p>
         */
        @NameInMap("percentage")
        public String percentage;

        public static GetBillingOverviewResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            GetBillingOverviewResponseBodyDataGroups self = new GetBillingOverviewResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public GetBillingOverviewResponseBodyDataGroups setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetBillingOverviewResponseBodyDataGroups setArticleCodes(java.util.List<String> articleCodes) {
            this.articleCodes = articleCodes;
            return this;
        }
        public java.util.List<String> getArticleCodes() {
            return this.articleCodes;
        }

        public GetBillingOverviewResponseBodyDataGroups setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBillingOverviewResponseBodyDataGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBillingOverviewResponseBodyDataGroups setPercentage(String percentage) {
            this.percentage = percentage;
            return this;
        }
        public String getPercentage() {
            return this.percentage;
        }

    }

    public static class GetBillingOverviewResponseBodyData extends TeaModel {
        /**
         * <p>The currency of the amount.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("currency")
        public String currency;

        /**
         * <p>The top N groups sorted by amount in descending order.</p>
         */
        @NameInMap("groups")
        public java.util.List<GetBillingOverviewResponseBodyDataGroups> groups;

        /**
         * <p>The total pretax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>28729.32</p>
         */
        @NameInMap("pretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The total tax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>2499.28</p>
         */
        @NameInMap("taxAmount")
        public String taxAmount;

        /**
         * <p>The total amount.</p>
         * 
         * <strong>example:</strong>
         * <p>31228.60</p>
         */
        @NameInMap("totalAmount")
        public String totalAmount;

        public static GetBillingOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBillingOverviewResponseBodyData self = new GetBillingOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBillingOverviewResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetBillingOverviewResponseBodyData setGroups(java.util.List<GetBillingOverviewResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<GetBillingOverviewResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

        public GetBillingOverviewResponseBodyData setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetBillingOverviewResponseBodyData setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public GetBillingOverviewResponseBodyData setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

    }

}
