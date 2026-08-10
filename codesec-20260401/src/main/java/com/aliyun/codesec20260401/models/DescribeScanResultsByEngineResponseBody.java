// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScanResultsByEngineResponseBody extends TeaModel {
    @NameInMap("engine")
    public String engine;

    @NameInMap("items")
    public java.util.List<DescribeScanResultsByEngineResponseBodyItems> items;

    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("projectId")
    public Long projectId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scanId")
    public Long scanId;

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
        @NameInMap("cveId")
        public String cveId;

        @NameInMap("cvss")
        public Double cvss;

        @NameInMap("cvssVersion")
        public String cvssVersion;

        @NameInMap("description")
        public String description;

        @NameInMap("references")
        public java.util.List<String> references;

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

        public DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

    public static class DescribeScanResultsByEngineResponseBodyItemsScaComponent extends TeaModel {
        @NameInMap("cveCount")
        public Long cveCount;

        @NameInMap("cveDetails")
        public java.util.List<DescribeScanResultsByEngineResponseBodyItemsScaComponentCveDetails> cveDetails;

        @NameInMap("introPaths")
        public java.util.List<String> introPaths;

        @NameInMap("isDirect")
        public Boolean isDirect;

        @NameInMap("packageName")
        public String packageName;

        @NameInMap("remediation")
        public String remediation;

        @NameInMap("version")
        public String version;

        public static DescribeScanResultsByEngineResponseBodyItemsScaComponent build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanResultsByEngineResponseBodyItemsScaComponent self = new DescribeScanResultsByEngineResponseBodyItemsScaComponent();
            return TeaModel.build(map, self);
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

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeScanResultsByEngineResponseBodyItemsScaComponent setRemediation(String remediation) {
            this.remediation = remediation;
            return this;
        }
        public String getRemediation() {
            return this.remediation;
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
        @NameInMap("code")
        public String code;

        @NameInMap("file")
        public String file;

        @NameInMap("kind")
        public String kind;

        @NameInMap("line")
        public Integer line;

        @NameInMap("note")
        public String note;

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
        @NameInMap("baselineState")
        public String baselineState;

        @NameInMap("category")
        public String category;

        @NameInMap("codeSnippet")
        public String codeSnippet;

        @NameInMap("confidence")
        public Double confidence;

        /**
         * <p>发现记录创建时间（RFC3339）</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("cweId")
        public String cweId;

        @NameInMap("description")
        public String description;

        @NameInMap("endLine")
        public Long endLine;

        @NameInMap("filePath")
        public String filePath;

        @NameInMap("id")
        public Long id;

        @NameInMap("itemSummary")
        public String itemSummary;

        @NameInMap("owaspCategory")
        public String owaspCategory;

        @NameInMap("projectName")
        public String projectName;

        @NameInMap("remediationCodeExample")
        public String remediationCodeExample;

        @NameInMap("remediationSuggestion")
        public String remediationSuggestion;

        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("scaComponent")
        public DescribeScanResultsByEngineResponseBodyItemsScaComponent scaComponent;

        @NameInMap("scanId")
        public Long scanId;

        @NameInMap("severity")
        public String severity;

        @NameInMap("source")
        public String source;

        @NameInMap("startLine")
        public Long startLine;

        @NameInMap("status")
        public String status;

        @NameInMap("taintFlow")
        public java.util.List<DescribeScanResultsByEngineResponseBodyItemsTaintFlow> taintFlow;

        @NameInMap("taintFlowSummary")
        public String taintFlowSummary;

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
