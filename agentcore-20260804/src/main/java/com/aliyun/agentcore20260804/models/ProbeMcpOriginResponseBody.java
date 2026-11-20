// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ProbeMcpOriginResponseBody extends TeaModel {
    /**
     * <p>The status code of the API operation. SUCCESS indicates that the operation completed normally. For the origin server result, see data.status.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The read-only, one-time, and bounded probe result. It is not persisted and is not associated with subsequently created MCPs.</p>
     */
    @NameInMap("data")
    public ProbeMcpOriginResponseBodyData data;

    /**
     * <p>The HTTP status code of the POP API request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The processing result of the API operation, excluding the original response from the origin server.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID used to correlate this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>8F7A9D02-8E5B-4376-8D2B-6A9CB3A42B16</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API operation was processed successfully. This means that authorization, parameter validation, and execution mechanisms completed normally, which does not equate to a successful origin server check.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ProbeMcpOriginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProbeMcpOriginResponseBody self = new ProbeMcpOriginResponseBody();
        return TeaModel.build(map, self);
    }

    public ProbeMcpOriginResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProbeMcpOriginResponseBody setData(ProbeMcpOriginResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ProbeMcpOriginResponseBodyData getData() {
        return this.data;
    }

    public ProbeMcpOriginResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ProbeMcpOriginResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProbeMcpOriginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProbeMcpOriginResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ProbeMcpOriginResponseBodyDataCoverage extends TeaModel {
        /**
         * <p>The evidence-verified legacy or modern protocol. This field is empty during HTTP interface checks.</p>
         * 
         * <strong>example:</strong>
         * <p>modern</p>
         */
        @NameInMap("backendMcpProtocol")
        public String backendMcpProtocol;

        /**
         * <p>Returns only non-sensitive names and excludes internal platform routing or network identities.</p>
         */
        @NameInMap("headerNames")
        public java.util.List<String> headerNames;

        /**
         * <p>The selected HTTP method for this check. This field is empty for direct connections.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The redacted summary of the selected HTTP path for this check. This field is empty for direct connections.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The evidence-verified MCP transport. This field is empty during HTTP interface checks.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamableHTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The summary of the origin server target for this check. It does not contain sensitive query parameters or credentials.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mcp.example.com/mcp">https://mcp.example.com/mcp</a></p>
         */
        @NameInMap("target")
        public String target;

        /**
         * <p>The origin server check before creation is fixed to false, which does not indicate that the resource is ready.</p>
         */
        @NameInMap("viaGateway")
        public Boolean viaGateway;

        public static ProbeMcpOriginResponseBodyDataCoverage build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginResponseBodyDataCoverage self = new ProbeMcpOriginResponseBodyDataCoverage();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginResponseBodyDataCoverage setBackendMcpProtocol(String backendMcpProtocol) {
            this.backendMcpProtocol = backendMcpProtocol;
            return this;
        }
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        public ProbeMcpOriginResponseBodyDataCoverage setHeaderNames(java.util.List<String> headerNames) {
            this.headerNames = headerNames;
            return this;
        }
        public java.util.List<String> getHeaderNames() {
            return this.headerNames;
        }

        public ProbeMcpOriginResponseBodyDataCoverage setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ProbeMcpOriginResponseBodyDataCoverage setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ProbeMcpOriginResponseBodyDataCoverage setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ProbeMcpOriginResponseBodyDataCoverage setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ProbeMcpOriginResponseBodyDataCoverage setViaGateway(Boolean viaGateway) {
            this.viaGateway = viaGateway;
            return this;
        }
        public Boolean getViaGateway() {
            return this.viaGateway;
        }

    }

    public static class ProbeMcpOriginResponseBodyDataError extends TeaModel {
        /**
         * <p>Returns only bounded diagnostic codes. The original error body from the origin server is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>PROBE_TIMEOUT</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The trimmed and redacted diagnostic information. This excludes credentials or original responses.</p>
         * 
         * <strong>example:</strong>
         * <p>The probe deadline was exceeded.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Indicates whether the operation is suitable for retry under a restricted policy. This does not trigger automatic retries.</p>
         */
        @NameInMap("retryable")
        public Boolean retryable;

        /**
         * <p>The error source, which can be MAGIC, ROUTER, NETWORK, ORIGIN, or UNKNOWN. This is determined solely based on actual evidence.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The detection or publishing stage where the error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>INITIALIZE</p>
         */
        @NameInMap("stage")
        public String stage;

        public static ProbeMcpOriginResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginResponseBodyDataError self = new ProbeMcpOriginResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ProbeMcpOriginResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ProbeMcpOriginResponseBodyDataError setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

        public ProbeMcpOriginResponseBodyDataError setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ProbeMcpOriginResponseBodyDataError setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

    public static class ProbeMcpOriginResponseBodyDataHttpResult extends TeaModel {
        /**
         * <p>The connection status of the target. Valid values: PASSED, FAILED, NOT_RUN, or UNKNOWN. This is judged only based on the actual target connection evidence for this check.</p>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("connectionStatus")
        public String connectionStatus;

        /**
         * <p>The check result of the API definition. Valid values: PASSED, FAILED, or NOT_RUN. The value is NOT_RUN when no OpenAPI specification is available.</p>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("definitionStatus")
        public String definitionStatus;

        /**
         * <p>The actual HTTP status code received. This is empty if the request was not executed or no response was received.</p>
         * 
         * <strong>example:</strong>
         * <p>405</p>
         */
        @NameInMap("httpStatusCode")
        public Integer httpStatusCode;

        public static ProbeMcpOriginResponseBodyDataHttpResult build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginResponseBodyDataHttpResult self = new ProbeMcpOriginResponseBodyDataHttpResult();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginResponseBodyDataHttpResult setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ProbeMcpOriginResponseBodyDataHttpResult setDefinitionStatus(String definitionStatus) {
            this.definitionStatus = definitionStatus;
            return this;
        }
        public String getDefinitionStatus() {
            return this.definitionStatus;
        }

        public ProbeMcpOriginResponseBodyDataHttpResult setHttpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

    }

    public static class ProbeMcpOriginResponseBodyDataObservations extends TeaModel {
        /**
         * <p>The backend MCP protocol policy. Valid values: legacy or modern.</p>
         * 
         * <strong>example:</strong>
         * <p>modern</p>
         */
        @NameInMap("backendMcpProtocol")
        public String backendMcpProtocol;

        /**
         * <p>Indicates whether the origin server declares support for this combination. This is empty when there is no declaration evidence.</p>
         */
        @NameInMap("declared")
        public Boolean declared;

        /**
         * <p>The list of declared versions. It retains only the date versions actually declared by the origin server and does not infer the full set from a single negotiation.</p>
         */
        @NameInMap("declaredVersions")
        public java.util.List<String> declaredVersions;

        /**
         * <p>The desensitized origin server or controlled subsequent endpoint. Sensitive query parameters are not returned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mcp.example.com/mcp">https://mcp.example.com/mcp</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The negotiated version. For legacy, it is the negotiated version. For modern, it is the selected and verified date version. This is empty when not confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26</p>
         */
        @NameInMap("negotiatedVersion")
        public String negotiatedVersion;

        /**
         * <p>The protocol. Valid values: SSE or StreamableHTTP. The modern policy is only combined with StreamableHTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamableHTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The session mode. Valid values: STATEFUL, STATELESS, NOT_APPLICABLE, or UNKNOWN. A direct legacy connection without a session is not automatically judged as failed.</p>
         * 
         * <strong>example:</strong>
         * <p>STATELESS</p>
         */
        @NameInMap("sessionMode")
        public String sessionMode;

        /**
         * <p>The protocol verification status. Valid values: VERIFIED, UNSUPPORTED, FAILED, or UNKNOWN. UNSUPPORTED requires protocol evidence.</p>
         * 
         * <strong>example:</strong>
         * <p>VERIFIED</p>
         */
        @NameInMap("verificationStatus")
        public String verificationStatus;

        public static ProbeMcpOriginResponseBodyDataObservations build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginResponseBodyDataObservations self = new ProbeMcpOriginResponseBodyDataObservations();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginResponseBodyDataObservations setBackendMcpProtocol(String backendMcpProtocol) {
            this.backendMcpProtocol = backendMcpProtocol;
            return this;
        }
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        public ProbeMcpOriginResponseBodyDataObservations setDeclared(Boolean declared) {
            this.declared = declared;
            return this;
        }
        public Boolean getDeclared() {
            return this.declared;
        }

        public ProbeMcpOriginResponseBodyDataObservations setDeclaredVersions(java.util.List<String> declaredVersions) {
            this.declaredVersions = declaredVersions;
            return this;
        }
        public java.util.List<String> getDeclaredVersions() {
            return this.declaredVersions;
        }

        public ProbeMcpOriginResponseBodyDataObservations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ProbeMcpOriginResponseBodyDataObservations setNegotiatedVersion(String negotiatedVersion) {
            this.negotiatedVersion = negotiatedVersion;
            return this;
        }
        public String getNegotiatedVersion() {
            return this.negotiatedVersion;
        }

        public ProbeMcpOriginResponseBodyDataObservations setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ProbeMcpOriginResponseBodyDataObservations setSessionMode(String sessionMode) {
            this.sessionMode = sessionMode;
            return this;
        }
        public String getSessionMode() {
            return this.sessionMode;
        }

        public ProbeMcpOriginResponseBodyDataObservations setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class ProbeMcpOriginResponseBodyDataRecommendation extends TeaModel {
        /**
         * <p>The backend MCP protocol policy. Valid values: legacy or modern.</p>
         * 
         * <strong>example:</strong>
         * <p>modern</p>
         */
        @NameInMap("backendMcpProtocol")
        public String backendMcpProtocol;

        /**
         * <p>The actual negotiated or selected and verified origin server MCP date version in YYYY-MM-DD format. This is null when not confirmed. It only displays the origin server protocol date metadata. It can be specified during creation and modified during updates. If omitted during an update, the current value is retained. It does not control backend requests or the external protocol of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26</p>
         */
        @NameInMap("originProtocolVersion")
        public String originProtocolVersion;

        /**
         * <p>The protocol. Valid values: SSE or StreamableHTTP. The modern policy is only combined with StreamableHTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamableHTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static ProbeMcpOriginResponseBodyDataRecommendation build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginResponseBodyDataRecommendation self = new ProbeMcpOriginResponseBodyDataRecommendation();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginResponseBodyDataRecommendation setBackendMcpProtocol(String backendMcpProtocol) {
            this.backendMcpProtocol = backendMcpProtocol;
            return this;
        }
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        public ProbeMcpOriginResponseBodyDataRecommendation setOriginProtocolVersion(String originProtocolVersion) {
            this.originProtocolVersion = originProtocolVersion;
            return this;
        }
        public String getOriginProtocolVersion() {
            return this.originProtocolVersion;
        }

        public ProbeMcpOriginResponseBodyDataRecommendation setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ProbeMcpOriginResponseBodyDataSelectedConfiguration extends TeaModel {
        /**
         * <p>The backend MCP protocol policy. Valid values: legacy or modern.</p>
         * 
         * <strong>example:</strong>
         * <p>modern</p>
         */
        @NameInMap("backendMcpProtocol")
        public String backendMcpProtocol;

        /**
         * <p>The actual negotiated or selected and verified origin server MCP date version in YYYY-MM-DD format. This is null when not confirmed. It only displays the origin server protocol date metadata. It can be specified during creation and modified during updates. If omitted during an update, the current value is retained. It does not control backend requests or the external protocol of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26</p>
         */
        @NameInMap("originProtocolVersion")
        public String originProtocolVersion;

        /**
         * <p>The protocol. Valid values: SSE or StreamableHTTP. The modern policy is only combined with StreamableHTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamableHTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static ProbeMcpOriginResponseBodyDataSelectedConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginResponseBodyDataSelectedConfiguration self = new ProbeMcpOriginResponseBodyDataSelectedConfiguration();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginResponseBodyDataSelectedConfiguration setBackendMcpProtocol(String backendMcpProtocol) {
            this.backendMcpProtocol = backendMcpProtocol;
            return this;
        }
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        public ProbeMcpOriginResponseBodyDataSelectedConfiguration setOriginProtocolVersion(String originProtocolVersion) {
            this.originProtocolVersion = originProtocolVersion;
            return this;
        }
        public String getOriginProtocolVersion() {
            return this.originProtocolVersion;
        }

        public ProbeMcpOriginResponseBodyDataSelectedConfiguration setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ProbeMcpOriginResponseBodyDataTools extends TeaModel {
        /**
         * <p>The input schema defined by the protocol, represented as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{}}</p>
         */
        @NameInMap("inputSchema")
        public String inputSchema;

        /**
         * <p>The output schema defined by the protocol, represented as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;total&quot;:{&quot;type&quot;:&quot;integer&quot;}}}</p>
         */
        @NameInMap("outputSchema")
        public String outputSchema;

        /**
         * <p>The untrusted description text returned by the origin server. It is escaped when displayed and is not executed as an instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>List inventory items</p>
         */
        @NameInMap("toolDescription")
        public String toolDescription;

        /**
         * <p>The declared name of the tool. Only metadata is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>list_inventory</p>
         */
        @NameInMap("toolName")
        public String toolName;

        public static ProbeMcpOriginResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginResponseBodyDataTools self = new ProbeMcpOriginResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginResponseBodyDataTools setInputSchema(String inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public String getInputSchema() {
            return this.inputSchema;
        }

        public ProbeMcpOriginResponseBodyDataTools setOutputSchema(String outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }
        public String getOutputSchema() {
            return this.outputSchema;
        }

        public ProbeMcpOriginResponseBodyDataTools setToolDescription(String toolDescription) {
            this.toolDescription = toolDescription;
            return this;
        }
        public String getToolDescription() {
            return this.toolDescription;
        }

        public ProbeMcpOriginResponseBodyDataTools setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

    }

    public static class ProbeMcpOriginResponseBodyDataWarnings extends TeaModel {
        /**
         * <p>The structured identifier for the detection limitation.</p>
         * 
         * <strong>example:</strong>
         * <p>TOOLS_TRUNCATED</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Explains limitations such as UNKNOWN, not executed, or truncated. This excludes credentials and original responses.</p>
         * 
         * <strong>example:</strong>
         * <p>The tool preview limit was reached; protocol verification succeeded.</p>
         */
        @NameInMap("message")
        public String message;

        public static ProbeMcpOriginResponseBodyDataWarnings build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginResponseBodyDataWarnings self = new ProbeMcpOriginResponseBodyDataWarnings();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginResponseBodyDataWarnings setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ProbeMcpOriginResponseBodyDataWarnings setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ProbeMcpOriginResponseBodyData extends TeaModel {
        /**
         * <p>The check coverage. It describes the target, protocol, or HTTP request conditions for this check and does not prove that the formal gateway and other APIs are available.</p>
         */
        @NameInMap("coverage")
        public ProbeMcpOriginResponseBodyDataCoverage coverage;

        /**
         * <p>Indicates origin server failures. This field is empty upon success. Origin server 401 errors or connection failures are not uniformly mapped to API exceptions.</p>
         */
        @NameInMap("error")
        public ProbeMcpOriginResponseBodyDataError error;

        /**
         * <p>The HTTP check result. This is returned only for the HTTP type. The definition and actual request status are separated. This is null for direct connections. A 2xx status code only proves the success of this request and does not prove that business functions or other APIs are available.</p>
         */
        @NameInMap("httpResult")
        public ProbeMcpOriginResponseBodyDataHttpResult httpResult;

        /**
         * <p>The declared and actual test results for controlled endpoints of a single origin server. This is an empty array for the HTTP type.</p>
         */
        @NameInMap("observations")
        public java.util.List<ProbeMcpOriginResponseBodyDataObservations> observations;

        /**
         * <p>The ID used only to correlate desensitized logs. It is not used for queries, authorization, binding MCPs, or reusing check evidence.</p>
         * 
         * <strong>example:</strong>
         * <p>mcpprobe-8f7a9d02-8e5b-4376-8d2b-6a9cb3a42b16</p>
         */
        @NameInMap("probeId")
        public String probeId;

        /**
         * <p>The observation time in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-19T08:30:00Z</p>
         */
        @NameInMap("probedAt")
        public String probedAt;

        /**
         * <p>The recommended protocol combination. It only includes verified combinations that the platform can access. This is empty when no combinations are available or for the HTTP type.</p>
         */
        @NameInMap("recommendation")
        public ProbeMcpOriginResponseBodyDataRecommendation recommendation;

        /**
         * <p>The combination actually used for tool queries. Specifying this does not mean verification passed. This is empty for the HTTP type.</p>
         */
        @NameInMap("selectedConfiguration")
        public ProbeMcpOriginResponseBodyDataSelectedConfiguration selectedConfiguration;

        /**
         * <p>The stage of the check. Valid values: AUTHORIZE, VALIDATE, RATE_LIMIT, NETWORK, NETWORK_CONTEXT, CONNECT, DISCOVER, INITIALIZE, SESSION_CHECK, TOOLS_LIST, HTTP_DEFINITION, HTTP_REQUEST, CLEANUP, EXECUTION, or COMPLETE.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("stage")
        public String stage;

        /**
         * <p>The check result of the origin server. Valid values: SUCCESS, PARTIAL, or FAILED. SUCCESS indicates that the protocol check passed but no capabilities were declared or no tools capability exists. A completely empty tool list also passes. PARTIAL indicates that the tool query failed or was truncated. For HTTP, PARTIAL indicates that only the definition was checked or required evidence is unknown.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The restricted metadata list for this check. Tools are not executed. An empty array is returned if tools are not declared, the list is completely empty, or the type is HTTP. Refer to toolsStatus and toolsComplete for judgment.</p>
         */
        @NameInMap("tools")
        public java.util.List<ProbeMcpOriginResponseBodyDataTools> tools;

        /**
         * <p>Indicates whether the tool list is complete. The value is true for COMPLETE or EMPTY, and false for TRUNCATED. The value is null if not queried, not declared, or failed. Completeness cannot be determined solely by an empty array.</p>
         */
        @NameInMap("toolsComplete")
        public Boolean toolsComplete;

        /**
         * <p>The tool query status. Valid values: NOT_RUN, NOT_DECLARED, EMPTY, COMPLETE, TRUNCATED, or FAILED. If tools are not declared, the value is NOT_DECLARED and tools/list is not executed. For the HTTP type, the value is NOT_RUN.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("toolsStatus")
        public String toolsStatus;

        /**
         * <p>The coverage and completeness limitations of this check.</p>
         */
        @NameInMap("warnings")
        public java.util.List<ProbeMcpOriginResponseBodyDataWarnings> warnings;

        public static ProbeMcpOriginResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ProbeMcpOriginResponseBodyData self = new ProbeMcpOriginResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ProbeMcpOriginResponseBodyData setCoverage(ProbeMcpOriginResponseBodyDataCoverage coverage) {
            this.coverage = coverage;
            return this;
        }
        public ProbeMcpOriginResponseBodyDataCoverage getCoverage() {
            return this.coverage;
        }

        public ProbeMcpOriginResponseBodyData setError(ProbeMcpOriginResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public ProbeMcpOriginResponseBodyDataError getError() {
            return this.error;
        }

        public ProbeMcpOriginResponseBodyData setHttpResult(ProbeMcpOriginResponseBodyDataHttpResult httpResult) {
            this.httpResult = httpResult;
            return this;
        }
        public ProbeMcpOriginResponseBodyDataHttpResult getHttpResult() {
            return this.httpResult;
        }

        public ProbeMcpOriginResponseBodyData setObservations(java.util.List<ProbeMcpOriginResponseBodyDataObservations> observations) {
            this.observations = observations;
            return this;
        }
        public java.util.List<ProbeMcpOriginResponseBodyDataObservations> getObservations() {
            return this.observations;
        }

        public ProbeMcpOriginResponseBodyData setProbeId(String probeId) {
            this.probeId = probeId;
            return this;
        }
        public String getProbeId() {
            return this.probeId;
        }

        public ProbeMcpOriginResponseBodyData setProbedAt(String probedAt) {
            this.probedAt = probedAt;
            return this;
        }
        public String getProbedAt() {
            return this.probedAt;
        }

        public ProbeMcpOriginResponseBodyData setRecommendation(ProbeMcpOriginResponseBodyDataRecommendation recommendation) {
            this.recommendation = recommendation;
            return this;
        }
        public ProbeMcpOriginResponseBodyDataRecommendation getRecommendation() {
            return this.recommendation;
        }

        public ProbeMcpOriginResponseBodyData setSelectedConfiguration(ProbeMcpOriginResponseBodyDataSelectedConfiguration selectedConfiguration) {
            this.selectedConfiguration = selectedConfiguration;
            return this;
        }
        public ProbeMcpOriginResponseBodyDataSelectedConfiguration getSelectedConfiguration() {
            return this.selectedConfiguration;
        }

        public ProbeMcpOriginResponseBodyData setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public ProbeMcpOriginResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProbeMcpOriginResponseBodyData setTools(java.util.List<ProbeMcpOriginResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<ProbeMcpOriginResponseBodyDataTools> getTools() {
            return this.tools;
        }

        public ProbeMcpOriginResponseBodyData setToolsComplete(Boolean toolsComplete) {
            this.toolsComplete = toolsComplete;
            return this;
        }
        public Boolean getToolsComplete() {
            return this.toolsComplete;
        }

        public ProbeMcpOriginResponseBodyData setToolsStatus(String toolsStatus) {
            this.toolsStatus = toolsStatus;
            return this;
        }
        public String getToolsStatus() {
            return this.toolsStatus;
        }

        public ProbeMcpOriginResponseBodyData setWarnings(java.util.List<ProbeMcpOriginResponseBodyDataWarnings> warnings) {
            this.warnings = warnings;
            return this;
        }
        public java.util.List<ProbeMcpOriginResponseBodyDataWarnings> getWarnings() {
            return this.warnings;
        }

    }

}
