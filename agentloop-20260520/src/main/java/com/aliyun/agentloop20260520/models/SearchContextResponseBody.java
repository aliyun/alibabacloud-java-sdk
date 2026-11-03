// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class SearchContextResponseBody extends TeaModel {
    /**
     * <p>The audit write status. Valid values: ok and degraded.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("auditStatus")
    public String auditStatus;

    /**
     * <p>The call ID for the multi-strategy recall of the experience store.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("callId")
    public String callId;

    /**
     * <p>The diagnostics information for the current experience recall, including duration, model call volume, and filtering. The actual diagnostics items are determined by the running mode.</p>
     */
    @NameInMap("diagnostics")
    public java.util.Map<String, ?> diagnostics;

    /**
     * <p>The actual experience recall mode used for the current request. Valid values: direct, agentic, and hybrid.</p>
     * 
     * <strong>example:</strong>
     * <p>agentic</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The ID of the recall event. You can use this ID to call the GetContextStoreRecall operation to view audit details.</p>
     * 
     * <strong>example:</strong>
     * <p>0190f1c2-7d3e-7a1b-9c4d-2e5f6a7b8c9d</p>
     */
    @NameInMap("recallEventId")
    public String recallEventId;

    /**
     * <p>The list of relevance judgment results for candidate experiences.</p>
     */
    @NameInMap("relevance")
    public java.util.List<java.util.Map<String, ?>> relevance;

    /**
     * <p>The ID of the request. You can use this ID to locate the request for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of retrieval results, sorted by similarity in descending order.</p>
     */
    @NameInMap("results")
    public java.util.List<java.util.Map<String, ?>> results;

    /**
     * <p>The list of rewritten queries generated based on the original retrieval query. The original query is not included.</p>
     */
    @NameInMap("rewrittenQueries")
    public java.util.List<String> rewrittenQueries;

    /**
     * <p>The processing status of the current experience recall call. Valid values: success, degraded, failed, and error.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The strategy implementation version used for the current experience recall. This is used for auditing and result tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>experience-recall-20261031-v5</p>
     */
    @NameInMap("strategyVersion")
    public String strategyVersion;

    public static SearchContextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchContextResponseBody self = new SearchContextResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchContextResponseBody setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public SearchContextResponseBody setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SearchContextResponseBody setDiagnostics(java.util.Map<String, ?> diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }
    public java.util.Map<String, ?> getDiagnostics() {
        return this.diagnostics;
    }

    public SearchContextResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SearchContextResponseBody setRecallEventId(String recallEventId) {
        this.recallEventId = recallEventId;
        return this;
    }
    public String getRecallEventId() {
        return this.recallEventId;
    }

    public SearchContextResponseBody setRelevance(java.util.List<java.util.Map<String, ?>> relevance) {
        this.relevance = relevance;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getRelevance() {
        return this.relevance;
    }

    public SearchContextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchContextResponseBody setResults(java.util.List<java.util.Map<String, ?>> results) {
        this.results = results;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResults() {
        return this.results;
    }

    public SearchContextResponseBody setRewrittenQueries(java.util.List<String> rewrittenQueries) {
        this.rewrittenQueries = rewrittenQueries;
        return this;
    }
    public java.util.List<String> getRewrittenQueries() {
        return this.rewrittenQueries;
    }

    public SearchContextResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SearchContextResponseBody setStrategyVersion(String strategyVersion) {
        this.strategyVersion = strategyVersion;
        return this;
    }
    public String getStrategyVersion() {
        return this.strategyVersion;
    }

}
