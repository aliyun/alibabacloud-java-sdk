// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Policies")
        public java.util.List<DescribeDcdnWafGroupsResponseBodyWafGroupsPolicies> policies;

        @NameInMap("RuleCount")
        public Integer ruleCount;

        @NameInMap("Subscribe")
        public String subscribe;

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
