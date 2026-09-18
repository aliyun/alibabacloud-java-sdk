// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScanResultsByEngineResponseBody extends TeaModel {
    /**
     * <p>The engine type. Valid values:</p>
     * <ul>
     * <li>sast</li>
     * <li>sca</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("engine")
    public String engine;

    /**
     * <p>The result list.</p>
     */
    @NameInMap("items")
    public java.util.List<DescribeScanResultsByEngineResponseBodyItems> items;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter for the first page or set it to an empty string. For subsequent pages, pass the nextToken value from the previous response without any modification. If the nextToken value in the response is empty, the last page has been reached.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0IjoiMjAyNi0wNy0xNlQwNzo1MzozOC4wMjFaIiwiaSI6MTAwMDQ0OH0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76851f2b5bf0187fbc29e8bca4</p>
     */
    @NameInMap("projectId")
    public Long projectId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3088795</p>
     */
    @NameInMap("scanId")
    public Long scanId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static DescribeScanResultsByEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanResultsByEngineResponseBody self = new DescribeScanResultsByEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScanResultsByEngineResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeScanResultsByEngineResponseBody setItems(java.util.List<DescribeScanResultsByEngineResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeScanResultsByEngineResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeScanResultsByEngineResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeScanResultsByEngineResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeScanResultsByEngineResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DescribeScanResultsByEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScanResultsByEngineResponseBody setScanId(Long scanId) {
        this.scanId = scanId;
        return this;
    }
    public Long getScanId() {
        return this.scanId;
    }

    public DescribeScanResultsByEngineResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails extends TeaModel {
        /**
         * <p>The associated CWE ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2021-44228</p>
         */
        @NameInMap("cveId")
        public String cveId;

        /**
         * <p>The CVSS score.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cvss")
        public Double cvss;

        /**
         * <p>The CVSS version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2.0</p>
         */
        @NameInMap("cvssVersion")
        public String cvssVersion;

        /**
         * <p>The associated CWE ID. This value can be absent or an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>CWE-79</p>
         */
        @NameInMap("cweId")
        public String cweId;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Apache Log4j2 JNDI features do not protect against attacker-controlled LDAP and other JNDI-related endpoints.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The target version for the fix. This value can be absent or an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fixedVersion")
        public String fixedVersion;

        /**
         * <p>The reference information.</p>
         */
        @NameInMap("references")
        public java.util.List<String> references;

        /**
         * <p>The severity level. Valid values:</p>
         * <ul>
         * <li>critical</li>
         * <li>high</li>
         * <li>medium</li>
         * <li>low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>critical</p>
         */
        @NameInMap("severity")
        public String severity;

        public static DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails self = new DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails();
            return TeaModel.build(map, self);
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails setCvss(Double cvss) {
            this.cvss = cvss;
            return this;
        }
        public Double getCvss() {
            return this.cvss;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails setCvssVersion(String cvssVersion) {
            this.cvssVersion = cvssVersion;
            return this;
        }
        public String getCvssVersion() {
            return this.cvssVersion;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails setCweId(String cweId) {
            this.cweId = cweId;
            return this;
        }
        public String getCweId() {
            return this.cweId;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails setFixedVersion(String fixedVersion) {
            this.fixedVersion = fixedVersion;
            return this;
        }
        public String getFixedVersion() {
            return this.fixedVersion;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails setReferences(java.util.List<String> references) {
            this.references = references;
            return this;
        }
        public java.util.List<String> getReferences() {
            return this.references;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected extends TeaModel {
        /**
         * <p>Indicates whether the license is listed as a free license by the FSF. If this key is absent, it means the license is not annotated, which differs from an explicit false value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isFsfLibre")
        public Boolean isFsfLibre;

        /**
         * <p>Indicates whether the license is OSI-approved.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOsiApproved")
        public Boolean isOsiApproved;

        /**
         * <p>The full name of the license.</p>
         * 
         * <strong>example:</strong>
         * <p>ISC License</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The SPDX license identifier. If the license cannot be determined, the value is NOASSERTION. The value may be in a non-standard format, such as Apache 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>AFL-2.1</p>
         */
        @NameInMap("spdxId")
        public String spdxId;

        public static DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected self = new DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected();
            return TeaModel.build(map, self);
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected setIsFsfLibre(Boolean isFsfLibre) {
            this.isFsfLibre = isFsfLibre;
            return this;
        }
        public Boolean getIsFsfLibre() {
            return this.isFsfLibre;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected setIsOsiApproved(Boolean isOsiApproved) {
            this.isOsiApproved = isOsiApproved;
            return this;
        }
        public Boolean getIsOsiApproved() {
            return this.isOsiApproved;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected setSpdxId(String spdxId) {
            this.spdxId = spdxId;
            return this;
        }
        public String getSpdxId() {
            return this.spdxId;
        }

    }

    public static class DescribeScanResultsByEngineResponseBodyItemsScaComponentLicense extends TeaModel {
        /**
         * <p>The concluded license expression (SPDX expression, which may contain OR or AND). This is an identifier string only, without full names or OSI/FSF annotations.</p>
         * 
         * <strong>example:</strong>
         * <p>AFL-2.1 OR BSD-3-Clause</p>
         */
        @NameInMap("concluded")
        public String concluded;

        /**
         * <p>The list of detected licenses.</p>
         */
        @NameInMap("detected")
        public java.util.List<DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected> detected;

        public static DescribeScanResultsByEngineResponseBodyItemsScaComponentLicense build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanResultsByEngineResponseBodyItemsScaComponentLicense self = new DescribeScanResultsByEngineResponseBodyItemsScaComponentLicense();
            return TeaModel.build(map, self);
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentLicense setConcluded(String concluded) {
            this.concluded = concluded;
            return this;
        }
        public String getConcluded() {
            return this.concluded;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentLicense setDetected(java.util.List<DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected> detected) {
            this.detected = detected;
            return this;
        }
        public java.util.List<DescribeScanResultsByEngineResponseBodyItemsScaComponentLicenseDetected> getDetected() {
            return this.detected;
        }

    }

    public static class DescribeScanResultsByEngineResponseBodyItemsScaComponent extends TeaModel {
        /**
         * <p>The component type, such as library, application, or framework.</p>
         * 
         * <strong>example:</strong>
         * <p>library</p>
         */
        @NameInMap("componentType")
        public String componentType;

        /**
         * <p>The number of CVEs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cveCount")
        public Long cveCount;

        /**
         * <p>The list of CVE details associated with a component in the SCA finding.</p>
         */
        @NameInMap("cveDetails")
        public java.util.List<DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails> cveDetails;

        /**
         * <p>The manifest file in which the dependency is declared.</p>
         * 
         * <strong>example:</strong>
         * <p>node_modules/semver</p>
         */
        @NameInMap("declaredIn")
        public String declaredIn;

        /**
         * <p>The component ecosystem, such as npm, maven, pypi, or go.</p>
         * 
         * <strong>example:</strong>
         * <p>maven</p>
         */
        @NameInMap("ecosystem")
        public String ecosystem;

        /**
         * <p>The list of dependency introduction paths in the SCA component information. This is returned only when engine is set to sca.</p>
         */
        @NameInMap("introPaths")
        public java.util.List<String> introPaths;

        /**
         * <p>Indicates whether the dependency is a direct dependency.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isDirect")
        public Boolean isDirect;

        /**
         * <p>The license determination result.</p>
         */
        @NameInMap("license")
        public DescribeScanResultsByEngineResponseBodyItemsScaComponentLicense license;

        /**
         * <p>The component coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.logging.log4j:log4j-core</p>
         */
        @NameInMap("packageName")
        public String packageName;

        /**
         * <p>The Package URL, which serves as the unique coordinate of the component within the scan.</p>
         * 
         * <strong>example:</strong>
         * <p>pkg:npm/<a href="mailto:glob-parent@3.1.0">glob-parent@3.1.0</a></p>
         */
        @NameInMap("purl")
        public String purl;

        /**
         * <p>The component-level remediation suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade log4j-core to version 2.17.1 or later</p>
         */
        @NameInMap("remediation")
        public String remediation;

        /**
         * <p>The dependency scope, such as runtime, required, optional, or dev.</p>
         * 
         * <strong>example:</strong>
         * <p>runtime</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The component version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.14.1</p>
         */
        @NameInMap("version")
        public String version;

        public static DescribeScanResultsByEngineResponseBodyItemsScaComponent build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanResultsByEngineResponseBodyItemsScaComponent self = new DescribeScanResultsByEngineResponseBodyItemsScaComponent();
            return TeaModel.build(map, self);
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setCveCount(Long cveCount) {
            this.cveCount = cveCount;
            return this;
        }
        public Long getCveCount() {
            return this.cveCount;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setCveDetails(java.util.List<DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails> cveDetails) {
            this.cveDetails = cveDetails;
            return this;
        }
        public java.util.List<DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails> getCveDetails() {
            return this.cveDetails;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setDeclaredIn(String declaredIn) {
            this.declaredIn = declaredIn;
            return this;
        }
        public String getDeclaredIn() {
            return this.declaredIn;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setEcosystem(String ecosystem) {
            this.ecosystem = ecosystem;
            return this;
        }
        public String getEcosystem() {
            return this.ecosystem;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setIntroPaths(java.util.List<String> introPaths) {
            this.introPaths = introPaths;
            return this;
        }
        public java.util.List<String> getIntroPaths() {
            return this.introPaths;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setIsDirect(Boolean isDirect) {
            this.isDirect = isDirect;
            return this;
        }
        public Boolean getIsDirect() {
            return this.isDirect;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setLicense(DescribeScanResultsByEngineResponseBodyItemsScaComponentLicense license) {
            this.license = license;
            return this;
        }
        public DescribeScanResultsByEngineResponseBodyItemsScaComponentLicense getLicense() {
            return this.license;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setPurl(String purl) {
            this.purl = purl;
            return this;
        }
        public String getPurl() {
            return this.purl;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setRemediation(String remediation) {
            this.remediation = remediation;
            return this;
        }
        public String getRemediation() {
            return this.remediation;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeScanResultsByEngineResponseBodyItemsTaintFlow extends TeaModel {
        /**
         * <p>The code.</p>
         * 
         * <strong>example:</strong>
         * <p>stmt.executeQuery(sql);</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>src/main/java/com/example/UserService.java</p>
         */
        @NameInMap("file")
        public String file;

        /**
         * <p>The role type in the taint propagation chain. Valid values:</p>
         * <ul>
         * <li>source: taint source</li>
         * <li>propagator: propagation node	</li>
         * <li>validation: validation or scrubbing center	</li>
         * <li>sink: dangerous sink</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>source</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The line number.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("line")
        public Integer line;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Sink: SQL query executed</p>
         */
        @NameInMap("note")
        public String note;

        /**
         * <p>The step sequence number, starting from 0 and incrementing.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("step")
        public Integer step;

        public static DescribeScanResultsByEngineResponseBodyItemsTaintFlow build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanResultsByEngineResponseBodyItemsTaintFlow self = new DescribeScanResultsByEngineResponseBodyItemsTaintFlow();
            return TeaModel.build(map, self);
        }

        public DescribeScanResultsByEngineResponseBodyItemsTaintFlow setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeScanResultsByEngineResponseBodyItemsTaintFlow setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public DescribeScanResultsByEngineResponseBodyItemsTaintFlow setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public DescribeScanResultsByEngineResponseBodyItemsTaintFlow setLine(Integer line) {
            this.line = line;
            return this;
        }
        public Integer getLine() {
            return this.line;
        }

        public DescribeScanResultsByEngineResponseBodyItemsTaintFlow setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeScanResultsByEngineResponseBodyItemsTaintFlow setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeScanResultsByEngineResponseBodyItems extends TeaModel {
        /**
         * <p>Filters results by the baseline state of incremental scans. Valid values: new, unchanged, absent, and updated.</p>
         * 
         * <strong>example:</strong>
         * <p>new</p>
         */
        @NameInMap("baselineState")
        public String baselineState;

        /**
         * <p>The category. PDS classifies files based on their file name extensions and MIME types. Main categories include doc, image, audio, and video.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL Injection</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The code snippet near the primary location (SAST).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("codeSnippet")
        public String codeSnippet;

        /**
         * <p>The rule confidence level, ranging from 0 to 1. This is common in SAST results and is omitted if not available.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("confidence")
        public Double confidence;

        /**
         * <p>The time when the finding record was created, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T03:36:31.573Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The associated CWE ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CWE-601</p>
         */
        @NameInMap("cweId")
        public String cweId;

        /**
         * <p>The issue description.</p>
         * 
         * <strong>example:</strong>
         * <p>User input is directly concatenated into an SQL statement, which may lead to SQL injection.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The end line number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("endLine")
        public Long endLine;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>aone2/2247063/1767838276141/Artifacts_EBookingApps_Pipeline_V2_Staging_131.tgz</p>
         */
        @NameInMap("filePath")
        public String filePath;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>934</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The brief summary of the finding. Unlike description, this is more of a conclusion statement.</p>
         * 
         * <strong>example:</strong>
         * <p>User input is used to construct SQL queries without sanitization</p>
         */
        @NameInMap("itemSummary")
        public String itemSummary;

        /**
         * <p>The OWASP category.</p>
         * 
         * <strong>example:</strong>
         * <p>A01:2021-Broken Access Control</p>
         */
        @NameInMap("owaspCategory")
        public String owaspCategory;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>cdp2cdl_cdp_sha_nprd</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The remediation code example.</p>
         * 
         * <strong>example:</strong>
         * <p>String sql = \&quot;SELECT * FROM users WHERE name = ?\&quot;;\nPreparedStatement ps = conn.prepareStatement(sql);\nps.setString(1, username);\nResultSet rs = ps.executeQuery();</p>
         */
        @NameInMap("remediationCodeExample")
        public String remediationCodeExample;

        /**
         * <p>The remediation suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>Use PreparedStatement with parameterized queries instead of string concatenation</p>
         */
        @NameInMap("remediationSuggestion")
        public String remediationSuggestion;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>java-sqli-001</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The SCA component information. This is returned only when engine is set to sca.</p>
         */
        @NameInMap("scaComponent")
        public DescribeScanResultsByEngineResponseBodyItemsScaComponent scaComponent;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3176</p>
         */
        @NameInMap("scanId")
        public Long scanId;

        /**
         * <p>The severity level. Valid values:</p>
         * <ul>
         * <li>critical </li>
         * <li>high </li>
         * <li>medium </li>
         * <li>low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>todo_open_dingoj06pvqfeayy3lkr</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The start line number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("startLine")
        public Long startLine;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>running: Running.</li>
         * <li>completed: Completed.</li>
         * <li>failed: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The SAST taint analysis call chain, which describes the complete propagation path of sensitive data from the taint source to the dangerous sink. This is returned only when engine is set to sast.</p>
         */
        @NameInMap("taintFlow")
        public java.util.List<DescribeScanResultsByEngineResponseBodyItemsTaintFlow> taintFlow;

        /**
         * <p>The text summary of the taint call chain. This is returned only when engine is set to sast.</p>
         * 
         * <strong>example:</strong>
         * <p>User input flows from HTTP parameter into SQL query executio</p>
         */
        @NameInMap("taintFlowSummary")
        public String taintFlowSummary;

        /**
         * <p>The issue title.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL Injection Risk</p>
         */
        @NameInMap("title")
        public String title;

        public static DescribeScanResultsByEngineResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanResultsByEngineResponseBodyItems self = new DescribeScanResultsByEngineResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeScanResultsByEngineResponseBodyItems setBaselineState(String baselineState) {
            this.baselineState = baselineState;
            return this;
        }
        public String getBaselineState() {
            return this.baselineState;
        }

        public DescribeScanResultsByEngineResponseBodyItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeScanResultsByEngineResponseBodyItems setCodeSnippet(String codeSnippet) {
            this.codeSnippet = codeSnippet;
            return this;
        }
        public String getCodeSnippet() {
            return this.codeSnippet;
        }

        public DescribeScanResultsByEngineResponseBodyItems setConfidence(Double confidence) {
            this.confidence = confidence;
            return this;
        }
        public Double getConfidence() {
            return this.confidence;
        }

        public DescribeScanResultsByEngineResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeScanResultsByEngineResponseBodyItems setCweId(String cweId) {
            this.cweId = cweId;
            return this;
        }
        public String getCweId() {
            return this.cweId;
        }

        public DescribeScanResultsByEngineResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScanResultsByEngineResponseBodyItems setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public DescribeScanResultsByEngineResponseBodyItems setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeScanResultsByEngineResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeScanResultsByEngineResponseBodyItems setItemSummary(String itemSummary) {
            this.itemSummary = itemSummary;
            return this;
        }
        public String getItemSummary() {
            return this.itemSummary;
        }

        public DescribeScanResultsByEngineResponseBodyItems setOwaspCategory(String owaspCategory) {
            this.owaspCategory = owaspCategory;
            return this;
        }
        public String getOwaspCategory() {
            return this.owaspCategory;
        }

        public DescribeScanResultsByEngineResponseBodyItems setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeScanResultsByEngineResponseBodyItems setRemediationCodeExample(String remediationCodeExample) {
            this.remediationCodeExample = remediationCodeExample;
            return this;
        }
        public String getRemediationCodeExample() {
            return this.remediationCodeExample;
        }

        public DescribeScanResultsByEngineResponseBodyItems setRemediationSuggestion(String remediationSuggestion) {
            this.remediationSuggestion = remediationSuggestion;
            return this;
        }
        public String getRemediationSuggestion() {
            return this.remediationSuggestion;
        }

        public DescribeScanResultsByEngineResponseBodyItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeScanResultsByEngineResponseBodyItems setScaComponent(DescribeScanResultsByEngineResponseBodyItemsScaComponent scaComponent) {
            this.scaComponent = scaComponent;
            return this;
        }
        public DescribeScanResultsByEngineResponseBodyItemsScaComponent getScaComponent() {
            return this.scaComponent;
        }

        public DescribeScanResultsByEngineResponseBodyItems setScanId(Long scanId) {
            this.scanId = scanId;
            return this;
        }
        public Long getScanId() {
            return this.scanId;
        }

        public DescribeScanResultsByEngineResponseBodyItems setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribeScanResultsByEngineResponseBodyItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeScanResultsByEngineResponseBodyItems setStartLine(Long startLine) {
            this.startLine = startLine;
            return this;
        }
        public Long getStartLine() {
            return this.startLine;
        }

        public DescribeScanResultsByEngineResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScanResultsByEngineResponseBodyItems setTaintFlow(java.util.List<DescribeScanResultsByEngineResponseBodyItemsTaintFlow> taintFlow) {
            this.taintFlow = taintFlow;
            return this;
        }
        public java.util.List<DescribeScanResultsByEngineResponseBodyItemsTaintFlow> getTaintFlow() {
            return this.taintFlow;
        }

        public DescribeScanResultsByEngineResponseBodyItems setTaintFlowSummary(String taintFlowSummary) {
            this.taintFlowSummary = taintFlowSummary;
            return this;
        }
        public String getTaintFlowSummary() {
            return this.taintFlowSummary;
        }

        public DescribeScanResultsByEngineResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
