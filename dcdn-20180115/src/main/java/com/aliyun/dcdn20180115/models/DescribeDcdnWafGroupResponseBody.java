// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the custom WAF rule group.</p>
     * 
     * <strong>example:</strong>
     * <p>1012</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the WAF rule group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number of the page returned.</p>
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
     * <p>The configurations of the rule.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeDcdnWafGroupResponseBodyRules> rules;

    /**
     * <p>Indicates whether to enable subscription. Valid values:</p>
     * <ul>
     * <li><strong>on:</strong></li>
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

    /**
     * <p>The total number of rules that are filtered out.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
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
         * <ul>
         * <li><strong>0</strong>: Common</li>
         * <li><strong>1</strong>: WordPress</li>
         * <li><strong>2</strong>: DedeCMS</li>
         * <li><strong>3</strong>: Discuz</li>
         * <li><strong>4</strong>: PHP CMS</li>
         * <li><strong>5</strong>: ECShop</li>
         * <li><strong>6</strong>: ShopEX</li>
         * <li><strong>7</strong>: Drupal</li>
         * <li><strong>8</strong>: Joomla</li>
         * <li><strong>9</strong>: MetInfo</li>
         * <li><strong>10</strong>: Struts2</li>
         * <li><strong>11</strong>: Spring Boot</li>
         * <li><strong>12</strong>: JBoss</li>
         * <li><strong>13</strong>: WebLogic</li>
         * <li><strong>14</strong>: WebSphere</li>
         * <li><strong>15</strong>: Tomcat</li>
         * <li><strong>16</strong>: Elastic Search</li>
         * <li><strong>18</strong>: ThinkPHP</li>
         * <li><strong>19</strong>: Fastjson</li>
         * <li><strong>20</strong>: ImageMagick</li>
         * <li><strong>21</strong>: PHPWind</li>
         * <li><strong>22</strong>: phpMyAdmin</li>
         * <li><strong>23</strong>: Resin</li>
         * <li><strong>24</strong>: IIS</li>
         * <li><strong>99</strong>: Others</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApplicationType")
        public Integer applicationType;

        /**
         * <p>The Common Vulnerabilities and Exposures (CVE) ID of the related vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2021-22945</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The CVE link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://nxx.nxxx.gov/vuln/detail/CVE-2022-XXXX">https://nxx.nxxx.gov/vuln/detail/CVE-2022-XXXX</a></p>
         */
        @NameInMap("CveUrl")
        public String cveUrl;

        /**
         * <p>The description of the WAF rule.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the rule was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-29T17:08:45Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the custom WAF rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the WAF rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Protection type Valid values:</p>
         * <ul>
         * <li><strong>11</strong>: SQL injection</li>
         * <li><strong>12</strong>: cross-site scripting (XSS)</li>
         * <li><strong>13</strong>: code execution</li>
         * <li><strong>14</strong>: carriage return line feeds (CRLF)</li>
         * <li><strong>15</strong>: local file inclusion</li>
         * <li><strong>16</strong>: remote file inclusion</li>
         * <li><strong>17</strong>: webshells</li>
         * <li><strong>19</strong>: cross-site request forgery</li>
         * <li><strong>20</strong>: others</li>
         * <li><strong>21</strong>: SEMA</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ProtectionType")
        public Integer protectionType;

        /**
         * <p>The risk level of the resources that do not comply with the managed rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: high risk</li>
         * <li><strong>2</strong>: medium risk</li>
         * <li><strong>3</strong>: low risk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
