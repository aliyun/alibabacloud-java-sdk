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
     * <p>The call ID for multi-strategy recall in the experience store.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("callId")
    public String callId;

    /**
     * <p>The diagnostics information for the current experience recall, including duration, model call volume, and filtering. The actual diagnostics items are determined by the running mode.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;durationMs&quot;: 386.5,
     *     &quot;modelCalls&quot;: 2,
     *     &quot;relevanceValidation&quot;: &quot;semantic&quot;,
     *     &quot;candidateCount&quot;: 1,
     *     &quot;filtering&quot;: {
     *         &quot;model_not_relevant&quot;: 0
     *     }
     * }</p>
     */
    @NameInMap("diagnostics")
    public java.util.Map<String, ?> diagnostics;

    /**
     * <p>The experience recall mode actually used for the current request. Valid values: direct, agentic, and hybrid.</p>
     * 
     * <strong>example:</strong>
     * <p>agentic</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The ID of the recall event. You can use this ID to call GetContextStoreRecall to view audit details.</p>
     * 
     * <strong>example:</strong>
     * <p>0190f1c2-7d3e-7a1b-9c4d-2e5f6a7b8c9d</p>
     */
    @NameInMap("recallEventId")
    public String recallEventId;

    /**
     * <p>The list of relevance judgment results for candidate experiences.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;contextId&quot;: &quot;a:1&quot;,
     *     &quot;judgment&quot;: &quot;relevant&quot;,
     *     &quot;reason&quot;: &quot;This experience explains how to skip tasks with unchanged inputs, which is relevant to the search query.&quot;
     *   }
     * ]</p>
     */
    @NameInMap("relevance")
    public java.util.List<java.util.Map<String, ?>> relevance;

    /**
     * <p>The ID of the request. You can use this ID to locate the request when troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of retrieval results, sorted by similarity in descending order. Each item contains contextId, context, metadata, score, rank, revision, strategyVersion, and strategyId.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;contextId&quot;:&quot;01a1cf08-c368-7c83******&quot;,&quot;strategyId&quot;:&quot;default&quot;,&quot;context&quot;:&quot;The assistant recommends steamed seafood because it is fresh and not spicy, which aligns with the user\&quot;s preference for seafood and constraint against spicy food.&quot;,&quot;metadata&quot;:{&quot;contextType&quot;:&quot;memory&quot;,&quot;memoryType&quot;:&quot;long&quot;,&quot;userId&quot;:&quot;test_user_002&quot;,&quot;agentId&quot;:&quot;95273000000000&quot;,&quot;appId&quot;:&quot;mm_480d961******&quot;,&quot;runId&quot;:&quot;jr-80ded1d6******&quot;,&quot;strategyId&quot;:&quot;default&quot;,&quot;category&quot;:&quot;recommendation&quot;,&quot;kind&quot;:&quot;state&quot;,&quot;sourceKind&quot;:&quot;api&quot;,&quot;sourceId&quot;:&quot;addctx:75395808-cb81-54cd******&quot;,&quot;revision&quot;:1,&quot;reviewStatus&quot;:&quot;unreviewed&quot;,&quot;sourceState&quot;:&quot;active&quot;,&quot;factKey&quot;:&quot;assistant:recommendation:dish******&quot;,&quot;sessionId&quot;:&quot;test_session_001&quot;},&quot;score&quot;:0.6617179,&quot;rank&quot;:1,&quot;revision&quot;:1,&quot;strategyVersion&quot;:1}]</p>
     */
    @NameInMap("results")
    public java.util.List<java.util.Map<String, ?>> results;

    /**
     * <p>The list of rewritten queries generated based on the original retrieval query. The original query is not included.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;How to avoid repeatedly executing unchanged inputs&quot;]</p>
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
     * <p>The implementation version of the strategy used for the current experience recall. This is used for auditing and result tracing.</p>
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
