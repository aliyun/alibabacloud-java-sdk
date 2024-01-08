// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the custom WAF rule group.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the WAF rule group.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number of the page returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of the rule.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeDcdnWafGroupResponseBodyRules> rules;

    /**
     * <p>Indicates whether to enable subscription. Valid values:</p>
     * <br>
     * <p>*   **on:**</p>
     * <p>*   **off**</p>
     */
    @NameInMap("Subscribe")
    public String subscribe;

    /**
     * <p>The ID of the template.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The total number of rules that are filtered out.</p>
     */
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
        /**
         * <p>The type of the application. Valid values:</p>
         * <br>
         * <p>*   **0**: Common</p>
         * <p>*   **1**: WordPress</p>
         * <p>*   **2**: DedeCMS</p>
         * <p>*   **3**: Discuz</p>
         * <p>*   **4**: PHP CMS</p>
         * <p>*   **5**: ECShop</p>
         * <p>*   **6**: ShopEX</p>
         * <p>*   **7**: Drupal</p>
         * <p>*   **8**: Joomla</p>
         * <p>*   **9**: MetInfo</p>
         * <p>*   **10**: Struts2</p>
         * <p>*   **11**: Spring Boot</p>
         * <p>*   **12**: JBoss</p>
         * <p>*   **13**: WebLogic</p>
         * <p>*   **14**: WebSphere</p>
         * <p>*   **15**: Tomcat</p>
         * <p>*   **16**: Elastic Search</p>
         * <p>*   **18**: ThinkPHP</p>
         * <p>*   **19**: Fastjson</p>
         * <p>*   **20**: ImageMagick</p>
         * <p>*   **21**: PHPWind</p>
         * <p>*   **22**: phpMyAdmin</p>
         * <p>*   **23**: Resin</p>
         * <p>*   **24**: IIS</p>
         * <p>*   **99**: Others</p>
         */
        @NameInMap("ApplicationType")
        public Integer applicationType;

        /**
         * <p>The Common Vulnerabilities and Exposures (CVE) ID of the related vulnerability.</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The CVE link.</p>
         */
        @NameInMap("CveUrl")
        public String cveUrl;

        /**
         * <p>The description of the WAF rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the rule was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the custom WAF rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the WAF rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Protection type Valid values:</p>
         * <br>
         * <p>*   **11**: SQL injection</p>
         * <p>*   **12**: cross-site scripting (XSS)</p>
         * <p>*   **13**: code execution</p>
         * <p>*   **14**: carriage return line feeds (CRLF)</p>
         * <p>*   **15**: local file inclusion</p>
         * <p>*   **16**: remote file inclusion</p>
         * <p>*   **17**: webshells</p>
         * <p>*   **19**: cross-site request forgery</p>
         * <p>*   **20**: others</p>
         * <p>*   **21**: SEMA</p>
         */
        @NameInMap("ProtectionType")
        public Integer protectionType;

        /**
         * <p>The risk level of the resources that do not comply with the managed rule. Valid values:</p>
         * <br>
         * <p>*   **1**: high risk</p>
         * <p>*   **2**: medium risk</p>
         * <p>*   **3**: low risk</p>
         */
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
