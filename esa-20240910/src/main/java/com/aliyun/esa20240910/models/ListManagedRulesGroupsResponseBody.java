// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListManagedRulesGroupsResponseBody extends TeaModel {
    /**
     * <p>List of managed rule group information.</p>
     */
    @NameInMap("ManagedRulesGroups")
    public java.util.List<ListManagedRulesGroupsResponseBodyManagedRulesGroups> managedRulesGroups;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of records after filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListManagedRulesGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListManagedRulesGroupsResponseBody self = new ListManagedRulesGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListManagedRulesGroupsResponseBody setManagedRulesGroups(java.util.List<ListManagedRulesGroupsResponseBodyManagedRulesGroups> managedRulesGroups) {
        this.managedRulesGroups = managedRulesGroups;
        return this;
    }
    public java.util.List<ListManagedRulesGroupsResponseBodyManagedRulesGroups> getManagedRulesGroups() {
        return this.managedRulesGroups;
    }

    public ListManagedRulesGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListManagedRulesGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListManagedRulesGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListManagedRulesGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListManagedRulesGroupsResponseBodyManagedRulesGroups extends TeaModel {
        /**
         * <p>Name of the managed rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Number of rules within the managed rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RuleCount")
        public Long ruleCount;

        public static ListManagedRulesGroupsResponseBodyManagedRulesGroups build(java.util.Map<String, ?> map) throws Exception {
            ListManagedRulesGroupsResponseBodyManagedRulesGroups self = new ListManagedRulesGroupsResponseBodyManagedRulesGroups();
            return TeaModel.build(map, self);
        }

        public ListManagedRulesGroupsResponseBodyManagedRulesGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListManagedRulesGroupsResponseBodyManagedRulesGroups setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

    }

}
