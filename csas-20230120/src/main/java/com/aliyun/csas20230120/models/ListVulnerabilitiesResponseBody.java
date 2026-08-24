// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVulnerabilitiesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of vulnerabilities that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>37</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <p>The list of vulnerabilities.</p>
     */
    @NameInMap("Vulnerabilities")
    public java.util.List<ListVulnerabilitiesResponseBodyVulnerabilities> vulnerabilities;

    public static ListVulnerabilitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVulnerabilitiesResponseBody self = new ListVulnerabilitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVulnerabilitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVulnerabilitiesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public ListVulnerabilitiesResponseBody setVulnerabilities(java.util.List<ListVulnerabilitiesResponseBodyVulnerabilities> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }
    public java.util.List<ListVulnerabilitiesResponseBodyVulnerabilities> getVulnerabilities() {
        return this.vulnerabilities;
    }

    public static class ListVulnerabilitiesResponseBodyVulnerabilities extends TeaModel {
        /**
         * <p>The list of CVE IDs corresponding to the vulnerability. An empty list is returned if no CVE is associated.</p>
         */
        @NameInMap("CveList")
        public java.util.List<String> cveList;

        /**
         * <p>The English description of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>This update fixes several remote code execution and privilege escalation vulnerabilities.</p>
         */
        @NameInMap("DescriptionEn")
        public String descriptionEn;

        /**
         * <p>The Chinese description of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>该更新修复了若干远程代码执行与权限提升漏洞</p>
         */
        @NameInMap("DescriptionZh")
        public String descriptionZh;

        /**
         * <p>The list of Knowledge Base (KB) numbers corresponding to the vulnerability.</p>
         */
        @NameInMap("Kbs")
        public java.util.List<String> kbs;

        /**
         * <p>The name of the product affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows 11 Home</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The release time of the vulnerability, in seconds as a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1786291200</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The English title of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08 Cumulative Update for Windows 11</p>
         */
        @NameInMap("TitleEn")
        public String titleEn;

        /**
         * <p>The Chinese title of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08 适用于 Windows 11 的累积更新</p>
         */
        @NameInMap("TitleZh")
        public String titleZh;

        /**
         * <p>The patch ID corresponding to the vulnerability. For Windows vulnerabilities, this is the Microsoft patch Update ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9f8c1d2e-4b7a-4c31-9e05-6d2f8a71****</p>
         */
        @NameInMap("UpdateId")
        public String updateId;

        /**
         * <p>The number of user endpoint devices affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("VulDeviceCount")
        public Long vulDeviceCount;

        /**
         * <p>The vulnerability risk level, mapped from the vendor risk level: Critical is mapped to High, Important is mapped to Mid, and others are mapped to Low. Valid values:</p>
         * <ul>
         * <li><strong>High</strong>: high risk.</li>
         * <li><strong>Mid</strong>: medium risk.</li>
         * <li><strong>Low</strong>: low risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("VulLevel")
        public String vulLevel;

        /**
         * <p>The vulnerability type. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows system vulnerability.</li>
         * <li><strong>ai_agent</strong>: AI Agent vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("VulType")
        public String vulType;

        public static ListVulnerabilitiesResponseBodyVulnerabilities build(java.util.Map<String, ?> map) throws Exception {
            ListVulnerabilitiesResponseBodyVulnerabilities self = new ListVulnerabilitiesResponseBodyVulnerabilities();
            return TeaModel.build(map, self);
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setCveList(java.util.List<String> cveList) {
            this.cveList = cveList;
            return this;
        }
        public java.util.List<String> getCveList() {
            return this.cveList;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setDescriptionZh(String descriptionZh) {
            this.descriptionZh = descriptionZh;
            return this;
        }
        public String getDescriptionZh() {
            return this.descriptionZh;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setKbs(java.util.List<String> kbs) {
            this.kbs = kbs;
            return this;
        }
        public java.util.List<String> getKbs() {
            return this.kbs;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setTitleEn(String titleEn) {
            this.titleEn = titleEn;
            return this;
        }
        public String getTitleEn() {
            return this.titleEn;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setTitleZh(String titleZh) {
            this.titleZh = titleZh;
            return this;
        }
        public String getTitleZh() {
            return this.titleZh;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setUpdateId(String updateId) {
            this.updateId = updateId;
            return this;
        }
        public String getUpdateId() {
            return this.updateId;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setVulDeviceCount(Long vulDeviceCount) {
            this.vulDeviceCount = vulDeviceCount;
            return this;
        }
        public Long getVulDeviceCount() {
            return this.vulDeviceCount;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

        public ListVulnerabilitiesResponseBodyVulnerabilities setVulType(String vulType) {
            this.vulType = vulType;
            return this;
        }
        public String getVulType() {
            return this.vulType;
        }

    }

}
