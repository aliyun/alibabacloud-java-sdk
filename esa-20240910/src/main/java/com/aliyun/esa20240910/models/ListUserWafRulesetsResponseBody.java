// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserWafRulesetsResponseBody extends TeaModel {
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
    public java.util.List<ListUserWafRulesetsResponseBodyRulesets> rulesets;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListUserWafRulesetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserWafRulesetsResponseBody self = new ListUserWafRulesetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserWafRulesetsResponseBody setInstanceUsage(Long instanceUsage) {
        this.instanceUsage = instanceUsage;
        return this;
    }
    public Long getInstanceUsage() {
        return this.instanceUsage;
    }

    public ListUserWafRulesetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserWafRulesetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserWafRulesetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserWafRulesetsResponseBody setRulesets(java.util.List<ListUserWafRulesetsResponseBodyRulesets> rulesets) {
        this.rulesets = rulesets;
        return this;
    }
    public java.util.List<ListUserWafRulesetsResponseBodyRulesets> getRulesets() {
        return this.rulesets;
    }

    public ListUserWafRulesetsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserWafRulesetsResponseBodyRulesets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>http_custom</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Position")
        public Long position;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListUserWafRulesetsResponseBodyRulesets build(java.util.Map<String, ?> map) throws Exception {
            ListUserWafRulesetsResponseBodyRulesets self = new ListUserWafRulesetsResponseBodyRulesets();
            return TeaModel.build(map, self);
        }

        public ListUserWafRulesetsResponseBodyRulesets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserWafRulesetsResponseBodyRulesets setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUserWafRulesetsResponseBodyRulesets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserWafRulesetsResponseBodyRulesets setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListUserWafRulesetsResponseBodyRulesets setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public ListUserWafRulesetsResponseBodyRulesets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
