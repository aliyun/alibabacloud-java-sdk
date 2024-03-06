// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListNetworkRulesResponseBody extends TeaModel {
    /**
     * <p>A list of access control rules.</p>
     */
    @NameInMap("NetworkRules")
    public ListNetworkRulesResponseBodyNetworkRules networkRules;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNetworkRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkRulesResponseBody self = new ListNetworkRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkRulesResponseBody setNetworkRules(ListNetworkRulesResponseBodyNetworkRules networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public ListNetworkRulesResponseBodyNetworkRules getNetworkRules() {
        return this.networkRules;
    }

    public ListNetworkRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNetworkRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNetworkRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNetworkRulesResponseBodyNetworkRulesNetworkRule extends TeaModel {
        /**
         * <p>The name of the access control rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network type. The value is fixed as Private. Self-managed applications can access KMS instances only over a private virtual private cloud (VPC).</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListNetworkRulesResponseBodyNetworkRulesNetworkRule build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkRulesResponseBodyNetworkRulesNetworkRule self = new ListNetworkRulesResponseBodyNetworkRulesNetworkRule();
            return TeaModel.build(map, self);
        }

        public ListNetworkRulesResponseBodyNetworkRulesNetworkRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNetworkRulesResponseBodyNetworkRulesNetworkRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListNetworkRulesResponseBodyNetworkRules extends TeaModel {
        @NameInMap("NetworkRule")
        public java.util.List<ListNetworkRulesResponseBodyNetworkRulesNetworkRule> networkRule;

        public static ListNetworkRulesResponseBodyNetworkRules build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkRulesResponseBodyNetworkRules self = new ListNetworkRulesResponseBodyNetworkRules();
            return TeaModel.build(map, self);
        }

        public ListNetworkRulesResponseBodyNetworkRules setNetworkRule(java.util.List<ListNetworkRulesResponseBodyNetworkRulesNetworkRule> networkRule) {
            this.networkRule = networkRule;
            return this;
        }
        public java.util.List<ListNetworkRulesResponseBodyNetworkRulesNetworkRule> getNetworkRule() {
            return this.networkRule;
        }

    }

}
