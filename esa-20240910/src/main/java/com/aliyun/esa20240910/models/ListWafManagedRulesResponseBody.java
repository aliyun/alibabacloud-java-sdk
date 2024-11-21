// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafManagedRulesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The managed rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListWafManagedRulesResponseBodyRules> rules;

    /**
     * <p>The total number of filtered rules.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWafManagedRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWafManagedRulesResponseBody self = new ListWafManagedRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWafManagedRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWafManagedRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWafManagedRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWafManagedRulesResponseBody setRules(java.util.List<ListWafManagedRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ListWafManagedRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public ListWafManagedRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWafManagedRulesResponseBodyRules extends TeaModel {
        /**
         * <p>The action that WAF performs on requests that match the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The ID of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the managed rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The protection level of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProtectionLevel")
        public Integer protectionLevel;

        /**
         * <p>The status of the protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListWafManagedRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListWafManagedRulesResponseBodyRules self = new ListWafManagedRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public ListWafManagedRulesResponseBodyRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListWafManagedRulesResponseBodyRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWafManagedRulesResponseBodyRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWafManagedRulesResponseBodyRules setProtectionLevel(Integer protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public Integer getProtectionLevel() {
            return this.protectionLevel;
        }

        public ListWafManagedRulesResponseBodyRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
