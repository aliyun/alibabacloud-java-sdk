// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
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
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of WAF rule groups.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of WAF rule groups.</p>
     */
    @NameInMap("WafGroups")
    public java.util.List<DescribeDcdnWafGroupsResponseBodyWafGroups> wafGroups;

    public static DescribeDcdnWafGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafGroupsResponseBody self = new DescribeDcdnWafGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDcdnWafGroupsResponseBody setWafGroups(java.util.List<DescribeDcdnWafGroupsResponseBodyWafGroups> wafGroups) {
        this.wafGroups = wafGroups;
        return this;
    }
    public java.util.List<DescribeDcdnWafGroupsResponseBodyWafGroups> getWafGroups() {
        return this.wafGroups;
    }

    public static class DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies extends TeaModel {
        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>30000165</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>wasm-testmaster</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong>: a custom policy</li>
         * <li><strong>default</strong>: the default policy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies self = new DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDcdnWafGroupsResponseBodyWafGroups extends TeaModel {
        /**
         * <p>The time when the WAF rule group was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-12 22:25:11</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the custom WAF rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>30000156</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the WAF rule.</p>
         * 
         * <strong>example:</strong>
         * <p>DCDN-test-operation-reports-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The policy that is associated with the WAF rule group.</p>
         */
        @NameInMap("Policies")
        public java.util.List<DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies> policies;

        /**
         * <p>The number of WAF rules.</p>
         * 
         * <strong>example:</strong>
         * <p>452</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>Indicates whether to enable subscription. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Subscribe")
        public String subscribe;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>1012</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static DescribeDcdnWafGroupsResponseBodyWafGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafGroupsResponseBodyWafGroups self = new DescribeDcdnWafGroupsResponseBodyWafGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroups setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroups setPolicies(java.util.List<DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies> getPolicies() {
            return this.policies;
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroups setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroups setSubscribe(String subscribe) {
            this.subscribe = subscribe;
            return this;
        }
        public String getSubscribe() {
            return this.subscribe;
        }

        public DescribeDcdnWafGroupsResponseBodyWafGroups setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
