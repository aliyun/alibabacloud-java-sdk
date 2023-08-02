// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeDcdnWafGroupResponseBodyRules> rules;

    @NameInMap("Subscribe")
    public String subscribe;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDcdnWafGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafGroupResponseBody self = new DescribeDcdnWafGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafGroupResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeDcdnWafGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDcdnWafGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafGroupResponseBody setRules(java.util.List<DescribeDcdnWafGroupResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeDcdnWafGroupResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeDcdnWafGroupResponseBody setSubscribe(String subscribe) {
        this.subscribe = subscribe;
        return this;
    }
    public String getSubscribe() {
        return this.subscribe;
    }

    public DescribeDcdnWafGroupResponseBody setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public DescribeDcdnWafGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnWafGroupResponseBodyRules extends TeaModel {
        @NameInMap("ApplicationType")
        public Integer applicationType;

        /**
         * <p>CVE ID。</p>
         */
        @NameInMap("CveId")
        public String cveId;

        @NameInMap("CveUrl")
        public String cveUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProtectionType")
        public Integer protectionType;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static DescribeDcdnWafGroupResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafGroupResponseBodyRules self = new DescribeDcdnWafGroupResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafGroupResponseBodyRules setApplicationType(Integer applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public Integer getApplicationType() {
            return this.applicationType;
        }

        public DescribeDcdnWafGroupResponseBodyRules setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeDcdnWafGroupResponseBodyRules setCveUrl(String cveUrl) {
            this.cveUrl = cveUrl;
            return this;
        }
        public String getCveUrl() {
            return this.cveUrl;
        }

        public DescribeDcdnWafGroupResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnWafGroupResponseBodyRules setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnWafGroupResponseBodyRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDcdnWafGroupResponseBodyRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDcdnWafGroupResponseBodyRules setProtectionType(Integer protectionType) {
            this.protectionType = protectionType;
            return this;
        }
        public Integer getProtectionType() {
            return this.protectionType;
        }

        public DescribeDcdnWafGroupResponseBodyRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

}
