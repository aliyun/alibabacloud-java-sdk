// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListAlertAggregationsResponseBody extends TeaModel {
    @NameInMap("AlertAggregations")
    public java.util.List<ListAlertAggregationsResponseBodyAlertAggregations> alertAggregations;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAlertAggregationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertAggregationsResponseBody self = new ListAlertAggregationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertAggregationsResponseBody setAlertAggregations(java.util.List<ListAlertAggregationsResponseBodyAlertAggregations> alertAggregations) {
        this.alertAggregations = alertAggregations;
        return this;
    }
    public java.util.List<ListAlertAggregationsResponseBodyAlertAggregations> getAlertAggregations() {
        return this.alertAggregations;
    }

    public ListAlertAggregationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertAggregationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertAggregationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertAggregationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertAggregationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertAggregationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlertAggregationsResponseBodyAlertAggregationsDefenseActionCounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>accesstoken</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>测试-前途系统AI</p>
         */
        @NameInMap("Value")
        public Long value;

        public static ListAlertAggregationsResponseBodyAlertAggregationsDefenseActionCounts build(java.util.Map<String, ?> map) throws Exception {
            ListAlertAggregationsResponseBodyAlertAggregationsDefenseActionCounts self = new ListAlertAggregationsResponseBodyAlertAggregationsDefenseActionCounts();
            return TeaModel.build(map, self);
        }

        public ListAlertAggregationsResponseBodyAlertAggregationsDefenseActionCounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertAggregationsResponseBodyAlertAggregationsDefenseActionCounts setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class ListAlertAggregationsResponseBodyAlertAggregationsStatusCounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://domain.com/">http://domain.com/</a></p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>123.123.123.123</p>
         */
        @NameInMap("Value")
        public Long value;

        public static ListAlertAggregationsResponseBodyAlertAggregationsStatusCounts build(java.util.Map<String, ?> map) throws Exception {
            ListAlertAggregationsResponseBodyAlertAggregationsStatusCounts self = new ListAlertAggregationsResponseBodyAlertAggregationsStatusCounts();
            return TeaModel.build(map, self);
        }

        public ListAlertAggregationsResponseBodyAlertAggregationsStatusCounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertAggregationsResponseBodyAlertAggregationsStatusCounts setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class ListAlertAggregationsResponseBodyAlertAggregations extends TeaModel {
        @NameInMap("AccountDisplayValues")
        public java.util.List<String> accountDisplayValues;

        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

        /**
         * <strong>example:</strong>
         * <p>vendor_product:alibaba_cloud:sas</p>
         */
        @NameInMap("AggregationKey")
        public String aggregationKey;

        /**
         * <strong>example:</strong>
         * <p>5m-avg</p>
         */
        @NameInMap("AggregationType")
        public String aggregationType;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("AlertCount")
        public Long alertCount;

        @NameInMap("AttackStages")
        public java.util.List<String> attackStages;

        @NameInMap("DefenseActionCounts")
        public java.util.List<ListAlertAggregationsResponseBodyAlertAggregationsDefenseActionCounts> defenseActionCounts;

        /**
         * <strong>example:</strong>
         * <p>1785290308</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <strong>example:</strong>
         * <p>1785293908000</p>
         */
        @NameInMap("LatestTime")
        public Long latestTime;

        /**
         * <strong>example:</strong>
         * <p>Test incident</p>
         */
        @NameInMap("PrimaryDisplayValue")
        public String primaryDisplayValue;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("PrimaryValue")
        public String primaryValue;

        /**
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("SecondaryValue")
        public String secondaryValue;

        @NameInMap("SourceCodes")
        public java.util.List<String> sourceCodes;

        @NameInMap("StatusCounts")
        public java.util.List<ListAlertAggregationsResponseBodyAlertAggregationsStatusCounts> statusCounts;

        public static ListAlertAggregationsResponseBodyAlertAggregations build(java.util.Map<String, ?> map) throws Exception {
            ListAlertAggregationsResponseBodyAlertAggregations self = new ListAlertAggregationsResponseBodyAlertAggregations();
            return TeaModel.build(map, self);
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setAccountDisplayValues(java.util.List<String> accountDisplayValues) {
            this.accountDisplayValues = accountDisplayValues;
            return this;
        }
        public java.util.List<String> getAccountDisplayValues() {
            return this.accountDisplayValues;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setAccountIds(java.util.List<String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setAggregationKey(String aggregationKey) {
            this.aggregationKey = aggregationKey;
            return this;
        }
        public String getAggregationKey() {
            return this.aggregationKey;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setAggregationType(String aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }
        public String getAggregationType() {
            return this.aggregationType;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setAlertCount(Long alertCount) {
            this.alertCount = alertCount;
            return this;
        }
        public Long getAlertCount() {
            return this.alertCount;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setAttackStages(java.util.List<String> attackStages) {
            this.attackStages = attackStages;
            return this;
        }
        public java.util.List<String> getAttackStages() {
            return this.attackStages;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setDefenseActionCounts(java.util.List<ListAlertAggregationsResponseBodyAlertAggregationsDefenseActionCounts> defenseActionCounts) {
            this.defenseActionCounts = defenseActionCounts;
            return this;
        }
        public java.util.List<ListAlertAggregationsResponseBodyAlertAggregationsDefenseActionCounts> getDefenseActionCounts() {
            return this.defenseActionCounts;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setLatestTime(Long latestTime) {
            this.latestTime = latestTime;
            return this;
        }
        public Long getLatestTime() {
            return this.latestTime;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setPrimaryDisplayValue(String primaryDisplayValue) {
            this.primaryDisplayValue = primaryDisplayValue;
            return this;
        }
        public String getPrimaryDisplayValue() {
            return this.primaryDisplayValue;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setPrimaryValue(String primaryValue) {
            this.primaryValue = primaryValue;
            return this;
        }
        public String getPrimaryValue() {
            return this.primaryValue;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setSecondaryValue(String secondaryValue) {
            this.secondaryValue = secondaryValue;
            return this;
        }
        public String getSecondaryValue() {
            return this.secondaryValue;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setSourceCodes(java.util.List<String> sourceCodes) {
            this.sourceCodes = sourceCodes;
            return this;
        }
        public java.util.List<String> getSourceCodes() {
            return this.sourceCodes;
        }

        public ListAlertAggregationsResponseBodyAlertAggregations setStatusCounts(java.util.List<ListAlertAggregationsResponseBodyAlertAggregationsStatusCounts> statusCounts) {
            this.statusCounts = statusCounts;
            return this;
        }
        public java.util.List<ListAlertAggregationsResponseBodyAlertAggregationsStatusCounts> getStatusCounts() {
            return this.statusCounts;
        }

    }

}
