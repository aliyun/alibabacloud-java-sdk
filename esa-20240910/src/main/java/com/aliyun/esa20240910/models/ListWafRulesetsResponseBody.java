// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceUsage")
    public Long instanceUsage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rulesets")
    public java.util.List<ListWafRulesetsResponseBodyRulesets> rulesets;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SiteUsage")
    public Long siteUsage;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWafRulesetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWafRulesetsResponseBody self = new ListWafRulesetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWafRulesetsResponseBody setInstanceUsage(Long instanceUsage) {
        this.instanceUsage = instanceUsage;
        return this;
    }
    public Long getInstanceUsage() {
        return this.instanceUsage;
    }

    public ListWafRulesetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWafRulesetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWafRulesetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWafRulesetsResponseBody setRulesets(java.util.List<ListWafRulesetsResponseBodyRulesets> rulesets) {
        this.rulesets = rulesets;
        return this;
    }
    public java.util.List<ListWafRulesetsResponseBodyRulesets> getRulesets() {
        return this.rulesets;
    }

    public ListWafRulesetsResponseBody setSiteUsage(Long siteUsage) {
        this.siteUsage = siteUsage;
        return this;
    }
    public Long getSiteUsage() {
        return this.siteUsage;
    }

    public ListWafRulesetsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWafRulesetsResponseBodyRulesets extends TeaModel {
        @NameInMap("Fields")
        public java.util.List<String> fields;

        /**
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("Target")
        public String target;

        @NameInMap("Types")
        public java.util.List<String> types;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListWafRulesetsResponseBodyRulesets build(java.util.Map<String, ?> map) throws Exception {
            ListWafRulesetsResponseBodyRulesets self = new ListWafRulesetsResponseBodyRulesets();
            return TeaModel.build(map, self);
        }

        public ListWafRulesetsResponseBodyRulesets setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public ListWafRulesetsResponseBodyRulesets setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWafRulesetsResponseBodyRulesets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWafRulesetsResponseBodyRulesets setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListWafRulesetsResponseBodyRulesets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWafRulesetsResponseBodyRulesets setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListWafRulesetsResponseBodyRulesets setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

        public ListWafRulesetsResponseBodyRulesets setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
