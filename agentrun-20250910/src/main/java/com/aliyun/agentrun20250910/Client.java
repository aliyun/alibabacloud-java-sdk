// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910;

import com.aliyun.tea.*;
import com.aliyun.agentrun20250910.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shenzhen", "agentrun.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai", "agentrun.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "agentrun.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "agentrun.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "agentrun.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agentrun", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>description</b> :
     * <p>After activation, the platform automatically deploys the <code>MCP service</code> <code>function</code> for the specified <code>sandbox</code> <code>template</code>. The <code>MCP service</code> ensures a unique mapping between an <code>mcp-session-id</code> and a <code>SandboxID</code>. When an MCP <code>client</code> invokes a <code>tool</code>, the <code>MCP service</code> automatically creates a <code>sandbox</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Activates the <code>MCP service</code> for a <code>sandbox</code> <code>template</code>. This enables a client to access the <code>sandbox</code> using the MCP protocol.</p>
     * 
     * @param request ActivateTemplateMCPRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateTemplateMCPResponse
     */
    public ActivateTemplateMCPResponse activateTemplateMCPWithOptions(String templateName, ActivateTemplateMCPRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabledTools)) {
            body.put("enabledTools", request.enabledTools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transport)) {
            body.put("transport", request.transport);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateTemplateMCP"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateName) + "/mcp/activate"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateTemplateMCPResponse());
    }

    /**
     * <b>description</b> :
     * <p>After activation, the platform automatically deploys the <code>MCP service</code> <code>function</code> for the specified <code>sandbox</code> <code>template</code>. The <code>MCP service</code> ensures a unique mapping between an <code>mcp-session-id</code> and a <code>SandboxID</code>. When an MCP <code>client</code> invokes a <code>tool</code>, the <code>MCP service</code> automatically creates a <code>sandbox</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Activates the <code>MCP service</code> for a <code>sandbox</code> <code>template</code>. This enables a client to access the <code>sandbox</code> using the MCP protocol.</p>
     * 
     * @param request ActivateTemplateMCPRequest
     * @return ActivateTemplateMCPResponse
     */
    public ActivateTemplateMCPResponse activateTemplateMCP(String templateName, ActivateTemplateMCPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activateTemplateMCPWithOptions(templateName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation converts a third-party workflow DSL, such as Dify or n8n, into an AgentRun Flow definition. It performs compatibility checks, identifies plugins, and extracts metadata. The operation runs in dry-run mode, returning the converted Flow configuration, a compatibility analysis report, and the required Toolset installation configuration without creating a Flow resource.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a Flow DSL.</p>
     * 
     * @param request ConvertFlowDSLRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConvertFlowDSLResponse
     */
    public ConvertFlowDSLResponse convertFlowDSLWithOptions(ConvertFlowDSLRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertFlowDSL"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/action/convertDsl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertFlowDSLResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation converts a third-party workflow DSL, such as Dify or n8n, into an AgentRun Flow definition. It performs compatibility checks, identifies plugins, and extracts metadata. The operation runs in dry-run mode, returning the converted Flow configuration, a compatibility analysis report, and the required Toolset installation configuration without creating a Flow resource.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a Flow DSL.</p>
     * 
     * @param request ConvertFlowDSLRequest
     * @return ConvertFlowDSLResponse
     */
    public ConvertFlowDSLResponse convertFlowDSL(ConvertFlowDSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.convertFlowDSLWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>创建一个新的智能体运行时实例，用于执行AI代理任务。智能体运行时是AgentRun服务的核心组件，提供代码执行、浏览器操作、内存管理等能力。</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an agent runtime.</p>
     * 
     * @param request CreateAgentRuntimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentRuntimeResponse
     */
    public CreateAgentRuntimeResponse createAgentRuntimeWithOptions(CreateAgentRuntimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentRuntime"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentRuntimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>创建一个新的智能体运行时实例，用于执行AI代理任务。智能体运行时是AgentRun服务的核心组件，提供代码执行、浏览器操作、内存管理等能力。</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an agent runtime.</p>
     * 
     * @param request CreateAgentRuntimeRequest
     * @return CreateAgentRuntimeResponse
     */
    public CreateAgentRuntimeResponse createAgentRuntime(CreateAgentRuntimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentRuntimeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a new endpoint for the specified agent runtime, used for external access and invocation. An endpoint serves as the entry point through which an agent runtime provides services externally.</p>
     * 
     * <b>summary</b> : 
     * <p>Create an access endpoint for an agent runtime</p>
     * 
     * @param request CreateAgentRuntimeEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentRuntimeEndpointResponse
     */
    public CreateAgentRuntimeEndpointResponse createAgentRuntimeEndpointWithOptions(String agentRuntimeId, CreateAgentRuntimeEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentRuntimeEndpoint"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + "/endpoints"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentRuntimeEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a new endpoint for the specified agent runtime, used for external access and invocation. An endpoint serves as the entry point through which an agent runtime provides services externally.</p>
     * 
     * <b>summary</b> : 
     * <p>Create an access endpoint for an agent runtime</p>
     * 
     * @param request CreateAgentRuntimeEndpointRequest
     * @return CreateAgentRuntimeEndpointResponse
     */
    public CreateAgentRuntimeEndpointResponse createAgentRuntimeEndpoint(String agentRuntimeId, CreateAgentRuntimeEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentRuntimeEndpointWithOptions(agentRuntimeId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Create a new browser instance for executing web automation tasks. The browser instance provides features such as web browsing, element manipulation, and screenshot recording.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Browser Sandbox</p>
     * 
     * @param request CreateBrowserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBrowserResponse
     */
    public CreateBrowserResponse createBrowserWithOptions(CreateBrowserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBrowser"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/browsers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBrowserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Create a new browser instance for executing web automation tasks. The browser instance provides features such as web browsing, element manipulation, and screenshot recording.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Browser Sandbox</p>
     * 
     * @param request CreateBrowserRequest
     * @return CreateBrowserResponse
     */
    public CreateBrowserResponse createBrowser(CreateBrowserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBrowserWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>创建一个新的代码解释器实例，用于执行代码解释和运行任务。代码解释器提供Python代码执行、数据处理、机器学习等功能。</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a code interpreter.</p>
     * 
     * @param request CreateCodeInterpreterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCodeInterpreterResponse
     */
    public CreateCodeInterpreterResponse createCodeInterpreterWithOptions(CreateCodeInterpreterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCodeInterpreter"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/code-interpreters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCodeInterpreterResponse());
    }

    /**
     * <b>description</b> :
     * <p>创建一个新的代码解释器实例，用于执行代码解释和运行任务。代码解释器提供Python代码执行、数据处理、机器学习等功能。</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a code interpreter.</p>
     * 
     * @param request CreateCodeInterpreterRequest
     * @return CreateCodeInterpreterResponse
     */
    public CreateCodeInterpreterResponse createCodeInterpreter(CreateCodeInterpreterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCodeInterpreterWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a credential for an agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a new credential.</p>
     * 
     * @param request CreateCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCredentialResponse
     */
    public CreateCredentialResponse createCredentialWithOptions(CreateCredentialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCredential"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/credentials"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a credential for an agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a new credential.</p>
     * 
     * @param request CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    public CreateCredentialResponse createCredential(CreateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCredentialWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom domain.</p>
     * 
     * @param request CreateCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomDomainResponse
     */
    public CreateCustomDomainResponse createCustomDomainWithOptions(CreateCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomDomain"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/custom-domains"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom domain.</p>
     * 
     * @param request CreateCustomDomainRequest
     * @return CreateCustomDomainResponse
     */
    public CreateCustomDomainResponse createCustomDomain(CreateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomDomainWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a flow orchestration agent. Flow orchestration is a core component of the AgentRun service that supports visual orchestration and version management.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workflow.</p>
     * 
     * @param request CreateFlowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowResponse
     */
    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlow"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a flow orchestration agent. Flow orchestration is a core component of the AgentRun service that supports visual orchestration and version management.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workflow.</p>
     * 
     * @param request CreateFlowRequest
     * @return CreateFlowResponse
     */
    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>为指定工作流创建一个新的端点，用于对外提供服务访问。</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow endpoint.</p>
     * 
     * @param request CreateFlowEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowEndpointResponse
     */
    public CreateFlowEndpointResponse createFlowEndpointWithOptions(String flowName, CreateFlowEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowEndpoint"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/endpoints"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>为指定工作流创建一个新的端点，用于对外提供服务访问。</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow endpoint.</p>
     * 
     * @param request CreateFlowEndpointRequest
     * @return CreateFlowEndpointResponse
     */
    public CreateFlowEndpointResponse createFlowEndpoint(String flowName, CreateFlowEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowEndpointWithOptions(flowName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A successful request returns an HTTP 201 status code. Once created, an IM Bot\&quot;s status is always <code>running</code>. The response is in a standard format, and its <code>data</code> field contains an <code>IMBotInfo</code> object.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM Bot.</p>
     * 
     * @param request CreateIMBotRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIMBotResponse
     */
    public CreateIMBotResponse createIMBotWithOptions(CreateIMBotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIMBot"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/im-bots"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIMBotResponse());
    }

    /**
     * <b>description</b> :
     * <p>A successful request returns an HTTP 201 status code. Once created, an IM Bot\&quot;s status is always <code>running</code>. The response is in a standard format, and its <code>data</code> field contains an <code>IMBotInfo</code> object.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM Bot.</p>
     * 
     * @param request CreateIMBotRequest
     * @return CreateIMBotResponse
     */
    public CreateIMBotResponse createIMBot(CreateIMBotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIMBotWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a knowledge base.</p>
     * 
     * @param request CreateKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKnowledgeBaseResponse
     */
    public CreateKnowledgeBaseResponse createKnowledgeBaseWithOptions(CreateKnowledgeBaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKnowledgeBase"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/knowledgebases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a knowledge base.</p>
     * 
     * @param request CreateKnowledgeBaseRequest
     * @return CreateKnowledgeBaseResponse
     */
    public CreateKnowledgeBaseResponse createKnowledgeBase(CreateKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKnowledgeBaseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a memory collection.</p>
     * 
     * @param request CreateMemoryCollectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemoryCollectionResponse
     */
    public CreateMemoryCollectionResponse createMemoryCollectionWithOptions(CreateMemoryCollectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemoryCollection"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/memory-collections"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemoryCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a memory collection.</p>
     * 
     * @param request CreateMemoryCollectionRequest
     * @return CreateMemoryCollectionResponse
     */
    public CreateMemoryCollectionResponse createMemoryCollection(CreateMemoryCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMemoryCollectionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a Model Proxy based on the specified configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Model Proxy.</p>
     * 
     * @param request CreateModelProxyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelProxyResponse
     */
    public CreateModelProxyResponse createModelProxyWithOptions(CreateModelProxyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelProxy"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-proxies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelProxyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a Model Proxy based on the specified configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Model Proxy.</p>
     * 
     * @param request CreateModelProxyRequest
     * @return CreateModelProxyResponse
     */
    public CreateModelProxyResponse createModelProxy(CreateModelProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelProxyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a model service, such as a code interpreter, based on the specified configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model service.</p>
     * 
     * @param request CreateModelServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelServiceResponse
     */
    public CreateModelServiceResponse createModelServiceWithOptions(CreateModelServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelService"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a model service, such as a code interpreter, based on the specified configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model service.</p>
     * 
     * @param request CreateModelServiceRequest
     * @return CreateModelServiceResponse
     */
    public CreateModelServiceResponse createModelService(CreateModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a new sandbox instance from a specified template. A sandbox provides an isolated execution environment to run code or launch a browser.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a sandbox.</p>
     * 
     * @param request CreateSandboxRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSandboxResponse
     */
    public CreateSandboxResponse createSandboxWithOptions(CreateSandboxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSandbox"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/sandboxes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSandboxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a new sandbox instance from a specified template. A sandbox provides an isolated execution environment to run code or launch a browser.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a sandbox.</p>
     * 
     * @param request CreateSandboxRequest
     * @return CreateSandboxResponse
     */
    public CreateSandboxResponse createSandbox(CreateSandboxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSandboxWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a template for launching sandboxes. A template defines the runtime environment, resource configuration, and other settings for a sandbox.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a template.</p>
     * 
     * @param request CreateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/templates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a template for launching sandboxes. A template defines the runtime environment, resource configuration, and other settings for a sandbox.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a template.</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates various types of tools, such as MCP, function call, and skill. An Agent can then call a tool to extend its capabilities.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a tool.</p>
     * 
     * @param request CreateToolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateToolResponse
     */
    public CreateToolResponse createToolWithOptions(CreateToolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTool"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/tools"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateToolResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation creates various types of tools, such as MCP, function call, and skill. An Agent can then call a tool to extend its capabilities.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a tool.</p>
     * 
     * @param request CreateToolRequest
     * @return CreateToolResponse
     */
    public CreateToolResponse createTool(CreateToolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createToolWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workspace.</p>
     * 
     * @param request CreateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/workspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workspace.</p>
     * 
     * @param request CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified agent runtime instance, including all associated resources and data. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Agent Runtime</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentRuntimeResponse
     */
    public DeleteAgentRuntimeResponse deleteAgentRuntimeWithOptions(String agentRuntimeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentRuntime"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentRuntimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified agent runtime instance, including all associated resources and data. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Agent Runtime</p>
     * @return DeleteAgentRuntimeResponse
     */
    public DeleteAgentRuntimeResponse deleteAgentRuntime(String agentRuntimeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentRuntimeWithOptions(agentRuntimeId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Agent Runtime Endpoint</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentRuntimeEndpointResponse
     */
    public DeleteAgentRuntimeEndpointResponse deleteAgentRuntimeEndpointWithOptions(String agentRuntimeId, String agentRuntimeEndpointId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentRuntimeEndpoint"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + "/endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeEndpointId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentRuntimeEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Agent Runtime Endpoint</p>
     * @return DeleteAgentRuntimeEndpointResponse
     */
    public DeleteAgentRuntimeEndpointResponse deleteAgentRuntimeEndpoint(String agentRuntimeId, String agentRuntimeEndpointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentRuntimeEndpointWithOptions(agentRuntimeId, agentRuntimeEndpointId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete the specified browser instance, including all its associated resources and data. The deletion is irreversible. Please proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Browser Sandbox</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBrowserResponse
     */
    public DeleteBrowserResponse deleteBrowserWithOptions(String browserId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBrowser"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/browsers/" + com.aliyun.openapiutil.Client.getEncodeParam(browserId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBrowserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete the specified browser instance, including all its associated resources and data. The deletion is irreversible. Please proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Browser Sandbox</p>
     * @return DeleteBrowserResponse
     */
    public DeleteBrowserResponse deleteBrowser(String browserId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBrowserWithOptions(browserId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete a specified code interpreter instance, including all its associated resources and data. This operation is irreversible. Please proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Code Interpreter</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCodeInterpreterResponse
     */
    public DeleteCodeInterpreterResponse deleteCodeInterpreterWithOptions(String codeInterpreterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCodeInterpreter"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/code-interpreters/" + com.aliyun.openapiutil.Client.getEncodeParam(codeInterpreterId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCodeInterpreterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete a specified code interpreter instance, including all its associated resources and data. This operation is irreversible. Please proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Code Interpreter</p>
     * @return DeleteCodeInterpreterResponse
     */
    public DeleteCodeInterpreterResponse deleteCodeInterpreter(String codeInterpreterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCodeInterpreterWithOptions(codeInterpreterId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes the specified credential. This action cannot be undone.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the specified credential.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCredentialResponse
     */
    public DeleteCredentialResponse deleteCredentialWithOptions(String credentialName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCredential"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(credentialName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes the specified credential. This action cannot be undone.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the specified credential.</p>
     * @return DeleteCredentialResponse
     */
    public DeleteCredentialResponse deleteCredential(String credentialName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCredentialWithOptions(credentialName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom domain.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomDomainResponse
     */
    public DeleteCustomDomainResponse deleteCustomDomainWithOptions(String domainName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomDomain"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom domain.</p>
     * @return DeleteCustomDomainResponse
     */
    public DeleteCustomDomainResponse deleteCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCustomDomainWithOptions(domainName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified flow instance, along with all its related resources and data. This operation is irreversible and cannot be undone. Use with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow.</p>
     * 
     * @param request DeleteFlowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlowWithOptions(String flowName, DeleteFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlow"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified flow instance, along with all its related resources and data. This operation is irreversible and cannot be undone. Use with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow.</p>
     * 
     * @param request DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlow(String flowName, DeleteFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowWithOptions(flowName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes the specified flow endpoint. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow endpoint.</p>
     * 
     * @param request DeleteFlowEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowEndpointResponse
     */
    public DeleteFlowEndpointResponse deleteFlowEndpointWithOptions(String flowName, String flowEndpointName, DeleteFlowEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowEndpoint"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(flowEndpointName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes the specified flow endpoint. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow endpoint.</p>
     * 
     * @param request DeleteFlowEndpointRequest
     * @return DeleteFlowEndpointResponse
     */
    public DeleteFlowEndpointResponse deleteFlowEndpoint(String flowName, String flowEndpointName, DeleteFlowEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowEndpointWithOptions(flowName, flowEndpointName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified version of a workflow. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workflow version.</p>
     * 
     * @param request DeleteFlowVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowVersionResponse
     */
    public DeleteFlowVersionResponse deleteFlowVersionWithOptions(String flowName, String flowVersion, DeleteFlowVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowVersion"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(flowVersion) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified version of a workflow. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workflow version.</p>
     * 
     * @param request DeleteFlowVersionRequest
     * @return DeleteFlowVersionResponse
     */
    public DeleteFlowVersionResponse deleteFlowVersion(String flowName, String flowVersion, DeleteFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowVersionWithOptions(flowName, flowVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes an IM bot via a <code>DELETE</code> request to the <code>/2025-09-10/agents/im-bots/{imBotId}</code> endpoint. A successful request returns an HTTP <code>204 No Content</code> status code and an empty response body.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IM bot.</p>
     * 
     * @param request DeleteIMBotRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIMBotResponse
     */
    public DeleteIMBotResponse deleteIMBotWithOptions(String imBotId, DeleteIMBotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIMBot"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/im-bots/" + com.aliyun.openapiutil.Client.getEncodeParam(imBotId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIMBotResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes an IM bot via a <code>DELETE</code> request to the <code>/2025-09-10/agents/im-bots/{imBotId}</code> endpoint. A successful request returns an HTTP <code>204 No Content</code> status code and an empty response body.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IM bot.</p>
     * 
     * @param request DeleteIMBotRequest
     * @return DeleteIMBotResponse
     */
    public DeleteIMBotResponse deleteIMBot(String imBotId, DeleteIMBotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIMBotWithOptions(imBotId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a knowledge base.</p>
     * <blockquote>
     * <p>This operation is permanent and cannot be undone.</p>
     * </blockquote>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKnowledgeBaseResponse
     */
    public DeleteKnowledgeBaseResponse deleteKnowledgeBaseWithOptions(String knowledgeBaseName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKnowledgeBase"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(knowledgeBaseName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a knowledge base.</p>
     * <blockquote>
     * <p>This operation is permanent and cannot be undone.</p>
     * </blockquote>
     * @return DeleteKnowledgeBaseResponse
     */
    public DeleteKnowledgeBaseResponse deleteKnowledgeBase(String knowledgeBaseName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteKnowledgeBaseWithOptions(knowledgeBaseName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a memory collection.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryCollectionResponse
     */
    public DeleteMemoryCollectionResponse deleteMemoryCollectionWithOptions(String memoryCollectionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemoryCollection"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/memory-collections/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryCollectionName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemoryCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a memory collection.</p>
     * @return DeleteMemoryCollectionResponse
     */
    public DeleteMemoryCollectionResponse deleteMemoryCollection(String memoryCollectionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryCollectionWithOptions(memoryCollectionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes the specified model proxy configuration without deleting the underlying models or related resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model proxy.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelProxyResponse
     */
    public DeleteModelProxyResponse deleteModelProxyWithOptions(String modelProxyName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelProxy"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-proxies/" + com.aliyun.openapiutil.Client.getEncodeParam(modelProxyName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelProxyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes the specified model proxy configuration without deleting the underlying models or related resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model proxy.</p>
     * @return DeleteModelProxyResponse
     */
    public DeleteModelProxyResponse deleteModelProxy(String modelProxyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelProxyWithOptions(modelProxyName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes a model service. You must specify the name of the service to delete.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelServiceResponse
     */
    public DeleteModelServiceResponse deleteModelServiceWithOptions(String modelServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelService"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-services/" + com.aliyun.openapiutil.Client.getEncodeParam(modelServiceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes a model service. You must specify the name of the service to delete.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model service.</p>
     * @return DeleteModelServiceResponse
     */
    public DeleteModelServiceResponse deleteModelService(String modelServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelServiceWithOptions(modelServiceName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a sandbox instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a sandbox instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSandboxResponse
     */
    public DeleteSandboxResponse deleteSandboxWithOptions(String sandboxId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSandbox"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/sandboxes/" + com.aliyun.openapiutil.Client.getEncodeParam(sandboxId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSandboxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a sandbox instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a sandbox instance.</p>
     * @return DeleteSandboxResponse
     */
    public DeleteSandboxResponse deleteSandbox(String sandboxId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSandboxWithOptions(sandboxId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes the specified template. After you delete a template, you can no longer use it to create new sandboxes.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(String templateName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes the specified template. After you delete a template, you can no longer use it to create new sandboxes.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(String templateName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(templateName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete the specified tool. The delete operation is irreversible. Proceed with caution. After the tool is deleted, all Agents that reference this tool will no longer be able to use it.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a tool</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteToolResponse
     */
    public DeleteToolResponse deleteToolWithOptions(String toolName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTool"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/tools/" + com.aliyun.openapiutil.Client.getEncodeParam(toolName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteToolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete the specified tool. The delete operation is irreversible. Proceed with caution. After the tool is deleted, all Agents that reference this tool will no longer be able to use it.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a tool</p>
     * @return DeleteToolResponse
     */
    public DeleteToolResponse deleteTool(String toolName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteToolWithOptions(toolName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes the specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workspace.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspace"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes the specified workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workspace.</p>
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(String workspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkspaceWithOptions(workspaceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Obtains a temporary accessToken that is used to authenticate subsequent API requests.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains an access token.</p>
     * 
     * @param request GetAccessTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessTokenResponse
     */
    public GetAccessTokenResponse getAccessTokenWithOptions(GetAccessTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("resourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessToken"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/accessToken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Obtains a temporary accessToken that is used to authenticate subsequent API requests.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains an access token.</p>
     * 
     * @param request GetAccessTokenRequest
     * @return GetAccessTokenResponse
     */
    public GetAccessTokenResponse getAccessToken(GetAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAccessTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves detailed information about a specified agent runtime by its agent runtime ID, including configuration, status, resource usage, and more.</p>
     * 
     * <b>summary</b> : 
     * <p>Get Agent Runtime</p>
     * 
     * @param request GetAgentRuntimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentRuntimeResponse
     */
    public GetAgentRuntimeResponse getAgentRuntimeWithOptions(String agentRuntimeId, GetAgentRuntimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRuntimeVersion)) {
            query.put("agentRuntimeVersion", request.agentRuntimeVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentRuntime"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentRuntimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves detailed information about a specified agent runtime by its agent runtime ID, including configuration, status, resource usage, and more.</p>
     * 
     * <b>summary</b> : 
     * <p>Get Agent Runtime</p>
     * 
     * @param request GetAgentRuntimeRequest
     * @return GetAgentRuntimeResponse
     */
    public GetAgentRuntimeResponse getAgentRuntime(String agentRuntimeId, GetAgentRuntimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentRuntimeWithOptions(agentRuntimeId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Agent Runtime Access Endpoint</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentRuntimeEndpointResponse
     */
    public GetAgentRuntimeEndpointResponse getAgentRuntimeEndpointWithOptions(String agentRuntimeId, String agentRuntimeEndpointId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentRuntimeEndpoint"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + "/endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeEndpointId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentRuntimeEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Agent Runtime Access Endpoint</p>
     * @return GetAgentRuntimeEndpointResponse
     */
    public GetAgentRuntimeEndpointResponse getAgentRuntimeEndpoint(String agentRuntimeId, String agentRuntimeEndpointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentRuntimeEndpointWithOptions(agentRuntimeId, agentRuntimeEndpointId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves detailed information about a specified browser instance by browser ID, including configuration, status, resource usage, and more.</p>
     * 
     * <b>summary</b> : 
     * <p>GetBrowserSandbox</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBrowserResponse
     */
    public GetBrowserResponse getBrowserWithOptions(String browserId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBrowser"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/browsers/" + com.aliyun.openapiutil.Client.getEncodeParam(browserId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBrowserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves detailed information about a specified browser instance by browser ID, including configuration, status, resource usage, and more.</p>
     * 
     * <b>summary</b> : 
     * <p>GetBrowserSandbox</p>
     * @return GetBrowserResponse
     */
    public GetBrowserResponse getBrowser(String browserId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBrowserWithOptions(browserId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>根据代码解释器ID获取指定代码解释器实例的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an interpreter.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCodeInterpreterResponse
     */
    public GetCodeInterpreterResponse getCodeInterpreterWithOptions(String codeInterpreterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCodeInterpreter"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/code-interpreters/" + com.aliyun.openapiutil.Client.getEncodeParam(codeInterpreterId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCodeInterpreterResponse());
    }

    /**
     * <b>description</b> :
     * <p>根据代码解释器ID获取指定代码解释器实例的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an interpreter.</p>
     * @return GetCodeInterpreterResponse
     */
    public GetCodeInterpreterResponse getCodeInterpreter(String codeInterpreterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeInterpreterWithOptions(codeInterpreterId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves detailed information about a specified credential, including its configuration, metadata, and related resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a specific credential.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredentialWithOptions(String credentialName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCredential"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(credentialName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves detailed information about a specified credential, including its configuration, metadata, and related resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a specific credential.</p>
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredential(String credentialName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCredentialWithOptions(credentialName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configuration of a custom domain.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomDomainResponse
     */
    public GetCustomDomainResponse getCustomDomainWithOptions(String domainName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomDomain"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configuration of a custom domain.</p>
     * @return GetCustomDomainResponse
     */
    public GetCustomDomainResponse getCustomDomain(String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomDomainWithOptions(domainName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>根据工作流ID获取指定工作流的详细信息，包括配置、定义、版本信息等。</p>
     * 
     * <b>summary</b> : 
     * <p>Get flow details</p>
     * 
     * @param request GetFlowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowResponse
     */
    public GetFlowResponse getFlowWithOptions(String flowName, GetFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlow"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>根据工作流ID获取指定工作流的详细信息，包括配置、定义、版本信息等。</p>
     * 
     * <b>summary</b> : 
     * <p>Get flow details</p>
     * 
     * @param request GetFlowRequest
     * @return GetFlowResponse
     */
    public GetFlowResponse getFlow(String flowName, GetFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFlowWithOptions(flowName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>获取指定工作流的草稿版本，返回草稿中的配置信息。</p>
     * 
     * <b>summary</b> : 
     * <p>Get the workflow draft.</p>
     * 
     * @param request GetFlowDraftRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowDraftResponse
     */
    public GetFlowDraftResponse getFlowDraftWithOptions(String flowName, GetFlowDraftRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowDraft"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/draft"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowDraftResponse());
    }

    /**
     * <b>description</b> :
     * <p>获取指定工作流的草稿版本，返回草稿中的配置信息。</p>
     * 
     * <b>summary</b> : 
     * <p>Get the workflow draft.</p>
     * 
     * @param request GetFlowDraftRequest
     * @return GetFlowDraftResponse
     */
    public GetFlowDraftResponse getFlowDraft(String flowName, GetFlowDraftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFlowDraftWithOptions(flowName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>根据工作流ID和端点ID获取指定工作流端点的详细信息。</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a workflow endpoint.</p>
     * 
     * @param request GetFlowEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowEndpointResponse
     */
    public GetFlowEndpointResponse getFlowEndpointWithOptions(String flowName, String flowEndpointName, GetFlowEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowEndpoint"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(flowEndpointName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>根据工作流ID和端点ID获取指定工作流端点的详细信息。</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a workflow endpoint.</p>
     * 
     * @param request GetFlowEndpointRequest
     * @return GetFlowEndpointResponse
     */
    public GetFlowEndpointResponse getFlowEndpoint(String flowName, String flowEndpointName, GetFlowEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFlowEndpointWithOptions(flowName, flowEndpointName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a specific workflow version, including a complete configuration snapshot of its definition, environment variables, tracing configuration, and logging configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a workflow version.</p>
     * 
     * @param request GetFlowVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowVersionResponse
     */
    public GetFlowVersionResponse getFlowVersionWithOptions(String flowName, String flowVersion, GetFlowVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowVersion"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(flowVersion) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a specific workflow version, including a complete configuration snapshot of its definition, environment variables, tracing configuration, and logging configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a workflow version.</p>
     * 
     * @param request GetFlowVersionRequest
     * @return GetFlowVersionResponse
     */
    public GetFlowVersionResponse getFlowVersion(String flowName, String flowVersion, GetFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFlowVersionWithOptions(flowName, flowVersion, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>GET /2025-09-10/agents/im-bots/{imBotId}；200 OK，Body 标准包装，data 为 IMBotInfo</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the details of a specific IM Bot.</p>
     * 
     * @param request GetIMBotRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIMBotResponse
     */
    public GetIMBotResponse getIMBotWithOptions(String imBotId, GetIMBotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIMBot"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/im-bots/" + com.aliyun.openapiutil.Client.getEncodeParam(imBotId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIMBotResponse());
    }

    /**
     * <b>description</b> :
     * <p>GET /2025-09-10/agents/im-bots/{imBotId}；200 OK，Body 标准包装，data 为 IMBotInfo</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the details of a specific IM Bot.</p>
     * 
     * @param request GetIMBotRequest
     * @return GetIMBotResponse
     */
    public GetIMBotResponse getIMBot(String imBotId, GetIMBotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIMBotWithOptions(imBotId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets information about a knowledge base.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKnowledgeBaseResponse
     */
    public GetKnowledgeBaseResponse getKnowledgeBaseWithOptions(String knowledgeBaseName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKnowledgeBase"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(knowledgeBaseName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets information about a knowledge base.</p>
     * @return GetKnowledgeBaseResponse
     */
    public GetKnowledgeBaseResponse getKnowledgeBase(String knowledgeBaseName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKnowledgeBaseWithOptions(knowledgeBaseName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details for a specific memory collection.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryCollectionResponse
     */
    public GetMemoryCollectionResponse getMemoryCollectionWithOptions(String memoryCollectionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemoryCollection"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/memory-collections/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryCollectionName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemoryCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details for a specific memory collection.</p>
     * @return GetMemoryCollectionResponse
     */
    public GetMemoryCollectionResponse getMemoryCollection(String memoryCollectionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryCollectionWithOptions(memoryCollectionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves the configuration details of a specific model proxy.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves model governance information.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelProxyResponse
     */
    public GetModelProxyResponse getModelProxyWithOptions(String modelProxyName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelProxy"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-proxies/" + com.aliyun.openapiutil.Client.getEncodeParam(modelProxyName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelProxyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves the configuration details of a specific model proxy.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves model governance information.</p>
     * @return GetModelProxyResponse
     */
    public GetModelProxyResponse getModelProxy(String modelProxyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelProxyWithOptions(modelProxyName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a specified model service.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified model service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelServiceResponse
     */
    public GetModelServiceResponse getModelServiceWithOptions(String modelServiceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelService"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-services/" + com.aliyun.openapiutil.Client.getEncodeParam(modelServiceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a specified model service.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified model service.</p>
     * @return GetModelServiceResponse
     */
    public GetModelServiceResponse getModelService(String modelServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelServiceWithOptions(modelServiceName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a specific sandbox by its <code>sandboxId</code>, including its status and configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a specific sandbox.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSandboxResponse
     */
    public GetSandboxResponse getSandboxWithOptions(String sandboxId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSandbox"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/sandboxes/" + com.aliyun.openapiutil.Client.getEncodeParam(sandboxId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSandboxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a specific sandbox by its <code>sandboxId</code>, including its status and configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a specific sandbox.</p>
     * @return GetSandboxResponse
     */
    public GetSandboxResponse getSandbox(String sandboxId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSandboxWithOptions(sandboxId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a template by its name. The response includes the template\&quot;s configuration and status.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a template.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(String templateName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a template by its name. The response includes the template\&quot;s configuration and status.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a template.</p>
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(String templateName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(templateName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Obtain the complete configuration information of a tool by its name, including basic information, resource configuration, network configuration, running status, and all other detailed information.</p>
     * 
     * <b>summary</b> : 
     * <p>Get a tool</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetToolResponse
     */
    public GetToolResponse getToolWithOptions(String toolName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTool"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/tools/" + com.aliyun.openapiutil.Client.getEncodeParam(toolName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetToolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Obtain the complete configuration information of a tool by its name, including basic information, resource configuration, network configuration, running status, and all other detailed information.</p>
     * 
     * <b>summary</b> : 
     * <p>Get a tool</p>
     * @return GetToolResponse
     */
    public GetToolResponse getTool(String toolName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getToolWithOptions(toolName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a specific workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a specific workspace.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a specific workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a specific workspace.</p>
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspace(String workspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(workspaceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the discovery endpoints for a workspace.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceDiscoveryEndpointsResponse
     */
    public GetWorkspaceDiscoveryEndpointsResponse getWorkspaceDiscoveryEndpointsWithOptions(String workspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspaceDiscoveryEndpoints"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/discovery/endpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceDiscoveryEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the discovery endpoints for a workspace.</p>
     * @return GetWorkspaceDiscoveryEndpointsResponse
     */
    public GetWorkspaceDiscoveryEndpointsResponse getWorkspaceDiscoveryEndpoints(String workspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceDiscoveryEndpointsWithOptions(workspaceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>获取指定智能体运行时的所有端点列表，支持按名称过滤和分页查询。端点用于外部系统访问智能体运行时服务。</p>
     * 
     * <b>summary</b> : 
     * <p>List Agent Runtime Endpoints</p>
     * 
     * @param request ListAgentRuntimeEndpointsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentRuntimeEndpointsResponse
     */
    public ListAgentRuntimeEndpointsResponse listAgentRuntimeEndpointsWithOptions(String agentRuntimeId, ListAgentRuntimeEndpointsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointName)) {
            query.put("endpointName", request.endpointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("searchMode", request.searchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentRuntimeEndpoints"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + "/endpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentRuntimeEndpointsResponse());
    }

    /**
     * <b>description</b> :
     * <p>获取指定智能体运行时的所有端点列表，支持按名称过滤和分页查询。端点用于外部系统访问智能体运行时服务。</p>
     * 
     * <b>summary</b> : 
     * <p>List Agent Runtime Endpoints</p>
     * 
     * @param request ListAgentRuntimeEndpointsRequest
     * @return ListAgentRuntimeEndpointsResponse
     */
    public ListAgentRuntimeEndpointsResponse listAgentRuntimeEndpoints(String agentRuntimeId, ListAgentRuntimeEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentRuntimeEndpointsWithOptions(agentRuntimeId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves agent runtime versions.</p>
     * 
     * @param request ListAgentRuntimeVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentRuntimeVersionsResponse
     */
    public ListAgentRuntimeVersionsResponse listAgentRuntimeVersionsWithOptions(String agentRuntimeId, ListAgentRuntimeVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentRuntimeVersions"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentRuntimeVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves agent runtime versions.</p>
     * 
     * @param request ListAgentRuntimeVersionsRequest
     * @return ListAgentRuntimeVersionsResponse
     */
    public ListAgentRuntimeVersionsResponse listAgentRuntimeVersions(String agentRuntimeId, ListAgentRuntimeVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentRuntimeVersionsWithOptions(agentRuntimeId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of agent runtimes for the current user. You can filter the results based on criteria such as name and tags. This operation supports pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of agent runtimes.</p>
     * 
     * @param request ListAgentRuntimesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentRuntimesResponse
     */
    public ListAgentRuntimesResponse listAgentRuntimesWithOptions(ListAgentRuntimesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRuntimeName)) {
            query.put("agentRuntimeName", request.agentRuntimeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoveryResourceGroupId)) {
            query.put("discoveryResourceGroupId", request.discoveryResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("searchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemTags)) {
            query.put("systemTags", request.systemTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("workspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentRuntimes"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentRuntimesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of agent runtimes for the current user. You can filter the results based on criteria such as name and tags. This operation supports pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of agent runtimes.</p>
     * 
     * @param request ListAgentRuntimesRequest
     * @return ListAgentRuntimesResponse
     */
    public ListAgentRuntimesResponse listAgentRuntimes(ListAgentRuntimesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentRuntimesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of all browser instances for the current user. Supports filtering by conditions such as name and status, and supports paginated queries.</p>
     * 
     * <b>summary</b> : 
     * <p>List Browser Sandboxes</p>
     * 
     * @param request ListBrowsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBrowsersResponse
     */
    public ListBrowsersResponse listBrowsersWithOptions(ListBrowsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.browserName)) {
            query.put("browserName", request.browserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBrowsers"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/browsers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBrowsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of all browser instances for the current user. Supports filtering by conditions such as name and status, and supports paginated queries.</p>
     * 
     * <b>summary</b> : 
     * <p>List Browser Sandboxes</p>
     * 
     * @param request ListBrowsersRequest
     * @return ListBrowsersResponse
     */
    public ListBrowsersResponse listBrowsers(ListBrowsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBrowsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieve a list of all code interpreter instances for the current user, with support for filtering by name and pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>List Code Interpreters</p>
     * 
     * @param request ListCodeInterpretersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCodeInterpretersResponse
     */
    public ListCodeInterpretersResponse listCodeInterpretersWithOptions(ListCodeInterpretersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeInterpreterName)) {
            query.put("codeInterpreterName", request.codeInterpreterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCodeInterpreters"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/code-interpreters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCodeInterpretersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieve a list of all code interpreter instances for the current user, with support for filtering by name and pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>List Code Interpreters</p>
     * 
     * @param request ListCodeInterpretersRequest
     * @return ListCodeInterpretersResponse
     */
    public ListCodeInterpretersResponse listCodeInterpreters(ListCodeInterpretersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCodeInterpretersWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists the credentials in your account. This operation supports filtering and pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all credentials.</p>
     * 
     * @param request ListCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentialsWithOptions(ListCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialAuthType)) {
            query.put("credentialAuthType", request.credentialAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialName)) {
            query.put("credentialName", request.credentialName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialSourceType)) {
            query.put("credentialSourceType", request.credentialSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("workspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCredentials"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/credentials"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCredentialsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists the credentials in your account. This operation supports filtering and pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all credentials.</p>
     * 
     * @param request ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentials(ListCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCredentialsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists custom domains.</p>
     * 
     * @param request ListCustomDomainsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomDomainsResponse
     */
    public ListCustomDomainsResponse listCustomDomainsWithOptions(ListCustomDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("domainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainType)) {
            query.put("domainType", request.domainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("resourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomDomains"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/custom-domains"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists custom domains.</p>
     * 
     * @param request ListCustomDomainsRequest
     * @return ListCustomDomainsResponse
     */
    public ListCustomDomainsResponse listCustomDomains(ListCustomDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCustomDomainsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieve all endpoints for a specified workflow, with pagination support.</p>
     * 
     * <b>summary</b> : 
     * <p>List workflow endpoints.</p>
     * 
     * @param request ListFlowEndpointsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowEndpointsResponse
     */
    public ListFlowEndpointsResponse listFlowEndpointsWithOptions(String flowId, ListFlowEndpointsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowEndpoints"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowId) + "/endpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowEndpointsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieve all endpoints for a specified workflow, with pagination support.</p>
     * 
     * <b>summary</b> : 
     * <p>List workflow endpoints.</p>
     * 
     * @param request ListFlowEndpointsRequest
     * @return ListFlowEndpointsResponse
     */
    public ListFlowEndpointsResponse listFlowEndpoints(String flowId, ListFlowEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowEndpointsWithOptions(flowId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns a paginated list of all versions for a specified flow.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the versions of a flow.</p>
     * 
     * @param request ListFlowVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowVersionsResponse
     */
    public ListFlowVersionsResponse listFlowVersionsWithOptions(String flowName, ListFlowVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowVersions"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowVersionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Returns a paginated list of all versions for a specified flow.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the versions of a flow.</p>
     * 
     * @param request ListFlowVersionsRequest
     * @return ListFlowVersionsResponse
     */
    public ListFlowVersionsResponse listFlowVersions(String flowName, ListFlowVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowVersionsWithOptions(flowName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>获取当前用户的工作流列表，支持按名称、工作空间等条件过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>List flows</p>
     * 
     * @param request ListFlowsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowsResponse
     */
    public ListFlowsResponse listFlowsWithOptions(ListFlowsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            query.put("flowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("workspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlows"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowsResponse());
    }

    /**
     * <b>description</b> :
     * <p>获取当前用户的工作流列表，支持按名称、工作空间等条件过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>List flows</p>
     * 
     * @param request ListFlowsRequest
     * @return ListFlowsResponse
     */
    public ListFlowsResponse listFlows(ListFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Send a GET request to the <code>/2025-09-10/agents/im-bots</code> endpoint to retrieve a paginated list of IM bots. Use the <code>botName</code>, <code>agentRuntimeId</code>, <code>botBizType</code>, and <code>status</code> query parameters to filter the results. For pagination, the <code>pageNumber</code> defaults to 1 and the <code>pageSize</code> defaults to 20, with a maximum of 100.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of IM bots.</p>
     * 
     * @param request ListIMBotsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIMBotsResponse
     */
    public ListIMBotsResponse listIMBotsWithOptions(ListIMBotsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRuntimeId)) {
            query.put("agentRuntimeId", request.agentRuntimeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.botBizType)) {
            query.put("botBizType", request.botBizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.botName)) {
            query.put("botName", request.botName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIMBots"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/im-bots"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIMBotsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Send a GET request to the <code>/2025-09-10/agents/im-bots</code> endpoint to retrieve a paginated list of IM bots. Use the <code>botName</code>, <code>agentRuntimeId</code>, <code>botBizType</code>, and <code>status</code> query parameters to filter the results. For pagination, the <code>pageNumber</code> defaults to 1 and the <code>pageSize</code> defaults to 20, with a maximum of 100.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of IM bots.</p>
     * 
     * @param request ListIMBotsRequest
     * @return ListIMBotsResponse
     */
    public ListIMBotsResponse listIMBots(ListIMBotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIMBotsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the knowledge bases in your account.</p>
     * 
     * @param request ListKnowledgeBasesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKnowledgeBasesResponse
     */
    public ListKnowledgeBasesResponse listKnowledgeBasesWithOptions(ListKnowledgeBasesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("workspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKnowledgeBases"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/knowledgebases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKnowledgeBasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the knowledge bases in your account.</p>
     * 
     * @param request ListKnowledgeBasesRequest
     * @return ListKnowledgeBasesResponse
     */
    public ListKnowledgeBasesResponse listKnowledgeBases(ListKnowledgeBasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKnowledgeBasesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a paginated list of memory collections.</p>
     * 
     * @param request ListMemoryCollectionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemoryCollectionsResponse
     */
    public ListMemoryCollectionsResponse listMemoryCollectionsWithOptions(ListMemoryCollectionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memoryCollectionName)) {
            query.put("memoryCollectionName", request.memoryCollectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("workspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemoryCollections"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/memory-collections"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemoryCollectionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a paginated list of memory collections.</p>
     * 
     * @param request ListMemoryCollectionsRequest
     * @return ListMemoryCollectionsResponse
     */
    public ListMemoryCollectionsResponse listMemoryCollections(ListMemoryCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMemoryCollectionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists the available model providers. This operation supports filtering and pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all model providers.</p>
     * 
     * @param request ListModelProvidersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelProvidersResponse
     */
    public ListModelProvidersResponse listModelProvidersWithOptions(ListModelProvidersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("modelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("provider", request.provider);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelProviders"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-providers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelProvidersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists the available model providers. This operation supports filtering and pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all model providers.</p>
     * 
     * @param request ListModelProvidersRequest
     * @return ListModelProvidersResponse
     */
    public ListModelProvidersResponse listModelProviders(ListModelProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelProvidersWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a paginated list of all Model Proxies for the current user. You can filter the list by status.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all Model Proxies.</p>
     * 
     * @param request ListModelProxiesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelProxiesResponse
     */
    public ListModelProxiesResponse listModelProxiesWithOptions(ListModelProxiesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyMode)) {
            query.put("proxyMode", request.proxyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("workspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelProxies"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-proxies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelProxiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a paginated list of all Model Proxies for the current user. You can filter the list by status.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all Model Proxies.</p>
     * 
     * @param request ListModelProxiesRequest
     * @return ListModelProxiesResponse
     */
    public ListModelProxiesResponse listModelProxies(ListModelProxiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelProxiesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of all models for the current user. You can filter the models by type and paginate the results.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all models.</p>
     * 
     * @param request ListModelServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelServicesResponse
     */
    public ListModelServicesResponse listModelServicesWithOptions(ListModelServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerType)) {
            query.put("providerType", request.providerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("workspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelServices"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelServicesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of all models for the current user. You can filter the models by type and paginate the results.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all models.</p>
     * 
     * @param request ListModelServicesRequest
     * @return ListModelServicesResponse
     */
    public ListModelServicesResponse listModelServices(ListModelServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of sandboxes for the current user. You can filter the results by template name, template type, or status. This operation supports pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns a list of sandboxes.</p>
     * 
     * @param request ListSandboxesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSandboxesResponse
     */
    public ListSandboxesResponse listSandboxesWithOptions(ListSandboxesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sandboxId)) {
            query.put("sandboxId", request.sandboxId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("templateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSandboxes"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/sandboxes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSandboxesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of sandboxes for the current user. You can filter the results by template name, template type, or status. This operation supports pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns a list of sandboxes.</p>
     * 
     * @param request ListSandboxesRequest
     * @return ListSandboxesResponse
     */
    public ListSandboxesResponse listSandboxes(ListSandboxesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSandboxesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists all templates for the current user. You can filter the results by template type and use pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists templates.</p>
     * 
     * @param request ListTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("templateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("workspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists all templates for the current user. You can filter the results by template type and use pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists templates.</p>
     * 
     * @param request ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplatesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query the tool list. Support paged query and conditional filtering by tool type, workspace, and other criteria. Return the list of tools that meet the conditions and paging information.</p>
     * 
     * <b>summary</b> : 
     * <p>List tools</p>
     * 
     * @param request ListToolsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListToolsResponse
     */
    public ListToolsResponse listToolsWithOptions(ListToolsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolName)) {
            query.put("toolName", request.toolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolType)) {
            query.put("toolType", request.toolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("workspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTools"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/tools"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListToolsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query the tool list. Support paged query and conditional filtering by tool type, workspace, and other criteria. Return the list of tools that meet the conditions and paging information.</p>
     * 
     * <b>summary</b> : 
     * <p>List tools</p>
     * 
     * @param request ListToolsRequest
     * @return ListToolsResponse
     */
    public ListToolsResponse listTools(ListToolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listToolsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists all workspaces.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all workspaces in your account.</p>
     * 
     * @param request ListWorkspacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/workspaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists all workspaces.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists all workspaces in your account.</p>
     * 
     * @param request ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is used to pause a sandbox. When invoked, the system takes a snapshot of the sandbox, capturing and persisting the memory and disk states. The user can recover the sandbox at a later time.<br>Note that sandbox snapshots are retained for only 30 days. After 30 days, recovery becomes unavailable.</p>
     * 
     * <b>summary</b> : 
     * <p>Pause the sandbox and retain snapshots of its memory and file system. The sandbox enters the PAUSED state so that it can be recovered later.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseSandboxResponse
     */
    public PauseSandboxResponse pauseSandboxWithOptions(String sandboxId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseSandbox"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/sandboxes/" + com.aliyun.openapiutil.Client.getEncodeParam(sandboxId) + "/pause"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseSandboxResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is used to pause a sandbox. When invoked, the system takes a snapshot of the sandbox, capturing and persisting the memory and disk states. The user can recover the sandbox at a later time.<br>Note that sandbox snapshots are retained for only 30 days. After 30 days, recovery becomes unavailable.</p>
     * 
     * <b>summary</b> : 
     * <p>Pause the sandbox and retain snapshots of its memory and file system. The sandbox enters the PAUSED state so that it can be recovered later.</p>
     * @return PauseSandboxResponse
     */
    public PauseSandboxResponse pauseSandbox(String sandboxId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseSandboxWithOptions(sandboxId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Publishes a new version of a specified workflow. This operation supports version management and rollbacks.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a workflow version.</p>
     * 
     * @param request PublishFlowVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishFlowVersionResponse
     */
    public PublishFlowVersionResponse publishFlowVersionWithOptions(String flowName, PublishFlowVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishFlowVersion"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Publishes a new version of a specified workflow. This operation supports version management and rollbacks.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a workflow version.</p>
     * 
     * @param request PublishFlowVersionRequest
     * @return PublishFlowVersionResponse
     */
    public PublishFlowVersionResponse publishFlowVersion(String flowName, PublishFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishFlowVersionWithOptions(flowName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Publishes a new version for a specified agent runtime for version management and deployment. The new version can include code updates, configuration changes, and other content.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a new version of an agent runtime.</p>
     * 
     * @param request PublishRuntimeVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishRuntimeVersionResponse
     */
    public PublishRuntimeVersionResponse publishRuntimeVersionWithOptions(String agentRuntimeId, PublishRuntimeVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRuntimeVersion"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRuntimeVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Publishes a new version for a specified agent runtime for version management and deployment. The new version can include code updates, configuration changes, and other content.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a new version of an agent runtime.</p>
     * 
     * @param request PublishRuntimeVersionRequest
     * @return PublishRuntimeVersionResponse
     */
    public PublishRuntimeVersionResponse publishRuntimeVersion(String agentRuntimeId, PublishRuntimeVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishRuntimeVersionWithOptions(agentRuntimeId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API resumes a sandbox instance from the paused state to the ready state, allowing the user to invoke it and restore it to the state it was in before being paused.</p>
     * 
     * <b>summary</b> : 
     * <p>Resume a paused sandbox instance to restore it from the PAUSED state to the READY (running) state.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeSandboxResponse
     */
    public ResumeSandboxResponse resumeSandboxWithOptions(String sandboxId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeSandbox"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/sandboxes/" + com.aliyun.openapiutil.Client.getEncodeParam(sandboxId) + "/resume"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeSandboxResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API resumes a sandbox instance from the paused state to the ready state, allowing the user to invoke it and restore it to the state it was in before being paused.</p>
     * 
     * <b>summary</b> : 
     * <p>Resume a paused sandbox instance to restore it from the PAUSED state to the READY (running) state.</p>
     * @return ResumeSandboxResponse
     */
    public ResumeSandboxResponse resumeSandbox(String sandboxId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeSandboxWithOptions(sandboxId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Stops the specified sandbox instance. After the operation, the sandbox enters the TERMINATED state.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a sandbox.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopSandboxResponse
     */
    public StopSandboxResponse stopSandboxWithOptions(String sandboxId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopSandbox"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/sandboxes/" + com.aliyun.openapiutil.Client.getEncodeParam(sandboxId) + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopSandboxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Stops the specified sandbox instance. After the operation, the sandbox enters the TERMINATED state.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a sandbox.</p>
     * @return StopSandboxResponse
     */
    public StopSandboxResponse stopSandbox(String sandboxId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopSandboxWithOptions(sandboxId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Stopping the MCP service deletes the associated MCP resources and makes the endpoint inaccessible.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops the TemplateMCP service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTemplateMCPResponse
     */
    public StopTemplateMCPResponse stopTemplateMCPWithOptions(String templateName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTemplateMCP"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateName) + "/mcp/stop"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTemplateMCPResponse());
    }

    /**
     * <b>description</b> :
     * <p>Stopping the MCP service deletes the associated MCP resources and makes the endpoint inaccessible.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops the TemplateMCP service.</p>
     * @return StopTemplateMCPResponse
     */
    public StopTemplateMCPResponse stopTemplateMCP(String templateName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTemplateMCPWithOptions(templateName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified agent runtime, including resource allocation, network configuration, and environment variables. The update operation triggers a runtime restart.</p>
     * 
     * <b>summary</b> : 
     * <p>UpdateAgentRuntime</p>
     * 
     * @param request UpdateAgentRuntimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentRuntimeResponse
     */
    public UpdateAgentRuntimeResponse updateAgentRuntimeWithOptions(String agentRuntimeId, UpdateAgentRuntimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentRuntime"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentRuntimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified agent runtime, including resource allocation, network configuration, and environment variables. The update operation triggers a runtime restart.</p>
     * 
     * <b>summary</b> : 
     * <p>UpdateAgentRuntime</p>
     * 
     * @param request UpdateAgentRuntimeRequest
     * @return UpdateAgentRuntimeResponse
     */
    public UpdateAgentRuntimeResponse updateAgentRuntime(String agentRuntimeId, UpdateAgentRuntimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentRuntimeWithOptions(agentRuntimeId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Agent Runtime Endpoint</p>
     * 
     * @param request UpdateAgentRuntimeEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentRuntimeEndpointResponse
     */
    public UpdateAgentRuntimeEndpointResponse updateAgentRuntimeEndpointWithOptions(String agentRuntimeId, String agentRuntimeEndpointId, UpdateAgentRuntimeEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentRuntimeEndpoint"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/runtimes/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeId) + "/endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(agentRuntimeEndpointId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentRuntimeEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Agent Runtime Endpoint</p>
     * 
     * @param request UpdateAgentRuntimeEndpointRequest
     * @return UpdateAgentRuntimeEndpointResponse
     */
    public UpdateAgentRuntimeEndpointResponse updateAgentRuntimeEndpoint(String agentRuntimeId, String agentRuntimeEndpointId, UpdateAgentRuntimeEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentRuntimeEndpointWithOptions(agentRuntimeId, agentRuntimeEndpointId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a credential.</p>
     * 
     * @param request UpdateCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCredentialResponse
     */
    public UpdateCredentialResponse updateCredentialWithOptions(String credentialName, UpdateCredentialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCredential"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/credentials/" + com.aliyun.openapiutil.Client.getEncodeParam(credentialName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a credential.</p>
     * 
     * @param request UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    public UpdateCredentialResponse updateCredential(String credentialName, UpdateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCredentialWithOptions(credentialName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom domain.</p>
     * 
     * @param request UpdateCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomDomainResponse
     */
    public UpdateCustomDomainResponse updateCustomDomainWithOptions(String domainName, UpdateCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomDomain"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom domain.</p>
     * 
     * @param request UpdateCustomDomainRequest
     * @return UpdateCustomDomainResponse
     */
    public UpdateCustomDomainResponse updateCustomDomain(String domainName, UpdateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCustomDomainWithOptions(domainName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified workflow, including the definition, execution mode, and environment variables.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a workflow.</p>
     * 
     * @param request UpdateFlowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowResponse
     */
    public UpdateFlowResponse updateFlowWithOptions(String flowName, UpdateFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlow"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified workflow, including the definition, execution mode, and environment variables.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a workflow.</p>
     * 
     * @param request UpdateFlowRequest
     * @return UpdateFlowResponse
     */
    public UpdateFlowResponse updateFlow(String flowName, UpdateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowWithOptions(flowName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>更新指定工作流的草稿版本，草稿更新不影响已发布的工作流版本。</p>
     * 
     * <b>summary</b> : 
     * <p>Update a flow draft.</p>
     * 
     * @param request UpdateFlowDraftRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowDraftResponse
     */
    public UpdateFlowDraftResponse updateFlowDraftWithOptions(String flowName, UpdateFlowDraftRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlowDraft"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/draft"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowDraftResponse());
    }

    /**
     * <b>description</b> :
     * <p>更新指定工作流的草稿版本，草稿更新不影响已发布的工作流版本。</p>
     * 
     * <b>summary</b> : 
     * <p>Update a flow draft.</p>
     * 
     * @param request UpdateFlowDraftRequest
     * @return UpdateFlowDraftResponse
     */
    public UpdateFlowDraftResponse updateFlowDraft(String flowName, UpdateFlowDraftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowDraftWithOptions(flowName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>更新指定工作流端点的配置信息，包括目标版本、路由配置等。</p>
     * 
     * <b>summary</b> : 
     * <p>Update Flow Endpoint</p>
     * 
     * @param request UpdateFlowEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowEndpointResponse
     */
    public UpdateFlowEndpointResponse updateFlowEndpointWithOptions(String flowName, String flowEndpointName, UpdateFlowEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlowEndpoint"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/flows/" + com.aliyun.openapiutil.Client.getEncodeParam(flowName) + "/endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(flowEndpointName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>更新指定工作流端点的配置信息，包括目标版本、路由配置等。</p>
     * 
     * <b>summary</b> : 
     * <p>Update Flow Endpoint</p>
     * 
     * @param request UpdateFlowEndpointRequest
     * @return UpdateFlowEndpointResponse
     */
    public UpdateFlowEndpointResponse updateFlowEndpoint(String flowName, String flowEndpointName, UpdateFlowEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowEndpointWithOptions(flowName, flowEndpointName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>PUT /2025-09-10/agents/im-bots/{imBotId}；成功建议 HTTP 202，Body 标准包装，data 为更新后 IMBotInfo</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an IM bot.</p>
     * 
     * @param request UpdateIMBotRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIMBotResponse
     */
    public UpdateIMBotResponse updateIMBotWithOptions(String imBotId, UpdateIMBotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIMBot"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/im-bots/" + com.aliyun.openapiutil.Client.getEncodeParam(imBotId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIMBotResponse());
    }

    /**
     * <b>description</b> :
     * <p>PUT /2025-09-10/agents/im-bots/{imBotId}；成功建议 HTTP 202，Body 标准包装，data 为更新后 IMBotInfo</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an IM bot.</p>
     * 
     * @param request UpdateIMBotRequest
     * @return UpdateIMBotResponse
     */
    public UpdateIMBotResponse updateIMBot(String imBotId, UpdateIMBotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIMBotWithOptions(imBotId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a knowledge base.</p>
     * 
     * @param request UpdateKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKnowledgeBaseResponse
     */
    public UpdateKnowledgeBaseResponse updateKnowledgeBaseWithOptions(String knowledgeBaseName, UpdateKnowledgeBaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKnowledgeBase"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(knowledgeBaseName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a knowledge base.</p>
     * 
     * @param request UpdateKnowledgeBaseRequest
     * @return UpdateKnowledgeBaseResponse
     */
    public UpdateKnowledgeBaseResponse updateKnowledgeBase(String knowledgeBaseName, UpdateKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKnowledgeBaseWithOptions(knowledgeBaseName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a memory collection.</p>
     * 
     * @param request UpdateMemoryCollectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemoryCollectionResponse
     */
    public UpdateMemoryCollectionResponse updateMemoryCollectionWithOptions(String memoryCollectionName, UpdateMemoryCollectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemoryCollection"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/memory-collections/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryCollectionName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemoryCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a memory collection.</p>
     * 
     * @param request UpdateMemoryCollectionRequest
     * @return UpdateMemoryCollectionResponse
     */
    public UpdateMemoryCollectionResponse updateMemoryCollection(String memoryCollectionName, UpdateMemoryCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMemoryCollectionWithOptions(memoryCollectionName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Use this operation to update the configuration of a specific model proxy.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a model proxy.</p>
     * 
     * @param request UpdateModelProxyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelProxyResponse
     */
    public UpdateModelProxyResponse updateModelProxyWithOptions(String modelProxyName, UpdateModelProxyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelProxy"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-proxies/" + com.aliyun.openapiutil.Client.getEncodeParam(modelProxyName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelProxyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Use this operation to update the configuration of a specific model proxy.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a model proxy.</p>
     * 
     * @param request UpdateModelProxyRequest
     * @return UpdateModelProxyResponse
     */
    public UpdateModelProxyResponse updateModelProxy(String modelProxyName, UpdateModelProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelProxyWithOptions(modelProxyName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation modifies the configuration of an existing model service.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a model service.</p>
     * 
     * @param request UpdateModelServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelServiceResponse
     */
    public UpdateModelServiceResponse updateModelServiceWithOptions(String modelServiceName, UpdateModelServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelService"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/model-services/" + com.aliyun.openapiutil.Client.getEncodeParam(modelServiceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation modifies the configuration of an existing model service.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a model service.</p>
     * 
     * @param request UpdateModelServiceRequest
     * @return UpdateModelServiceResponse
     */
    public UpdateModelServiceResponse updateModelService(String modelServiceName, UpdateModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelServiceWithOptions(modelServiceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates a template\&quot;s configuration, including its resource configuration, network configuration, and environment variables.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a template.</p>
     * 
     * @param request UpdateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplateWithOptions(String templateName, UpdateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates a template\&quot;s configuration, including its resource configuration, network configuration, and environment variables.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a template.</p>
     * 
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(String templateName, UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(templateName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of an existing tool. You can modify its description, resource configuration, network configuration, and more. This operation supports partial updates. You only need to specify the fields that you want to modify.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a tool.</p>
     * 
     * @param request UpdateToolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateToolResponse
     */
    public UpdateToolResponse updateToolWithOptions(String toolName, UpdateToolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTool"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/agents/tools/" + com.aliyun.openapiutil.Client.getEncodeParam(toolName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateToolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of an existing tool. You can modify its description, resource configuration, network configuration, and more. This operation supports partial updates. You only need to specify the fields that you want to modify.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a tool.</p>
     * 
     * @param request UpdateToolRequest
     * @return UpdateToolResponse
     */
    public UpdateToolResponse updateTool(String toolName, UpdateToolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateToolWithOptions(toolName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the properties of a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a workspace.</p>
     * 
     * @param request UpdateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspaceWithOptions(String workspaceId, UpdateWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspace"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the properties of a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a workspace.</p>
     * 
     * @param request UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(String workspaceId, UpdateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkspaceWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the discovery endpoint configuration for a specified workspace.</p>
     * 
     * @param request UpdateWorkspaceDiscoveryEndpointsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceDiscoveryEndpointsResponse
     */
    public UpdateWorkspaceDiscoveryEndpointsResponse updateWorkspaceDiscoveryEndpointsWithOptions(String workspaceId, UpdateWorkspaceDiscoveryEndpointsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspaceDiscoveryEndpoints"),
            new TeaPair("version", "2025-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/2025-09-10/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/discovery/endpoints"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceDiscoveryEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the discovery endpoint configuration for a specified workspace.</p>
     * 
     * @param request UpdateWorkspaceDiscoveryEndpointsRequest
     * @return UpdateWorkspaceDiscoveryEndpointsResponse
     */
    public UpdateWorkspaceDiscoveryEndpointsResponse updateWorkspaceDiscoveryEndpoints(String workspaceId, UpdateWorkspaceDiscoveryEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkspaceDiscoveryEndpointsWithOptions(workspaceId, request, headers, runtime);
    }
}
