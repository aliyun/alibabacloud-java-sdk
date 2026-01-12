// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910;

import com.aliyun.tea.*;
import com.aliyun.agentrun20250910.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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
     * <b>summary</b> : 
     * <p>启动模板的MCP服务器</p>
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
     * <b>summary</b> : 
     * <p>启动模板的MCP服务器</p>
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
     * <p>创建一个新的智能体运行时实例，用于执行AI代理任务。智能体运行时是AgentRun服务的核心组件，提供代码执行、浏览器操作、内存管理等能力。</p>
     * 
     * <b>summary</b> : 
     * <p>Create an agent runtime</p>
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
     * <p>Create an agent runtime</p>
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
     * <p>为指定的智能体运行时创建新的端点，用于外部访问和调用。端点是智能体运行时对外提供服务的入口。</p>
     * 
     * <b>summary</b> : 
     * <p>创建智能体运行时端点</p>
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
     * <p>为指定的智能体运行时创建新的端点，用于外部访问和调用。端点是智能体运行时对外提供服务的入口。</p>
     * 
     * <b>summary</b> : 
     * <p>创建智能体运行时端点</p>
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
     * <p>创建一个新的浏览器实例，用于执行网页自动化任务。浏览器实例提供网页浏览、元素操作、截图录制等功能。</p>
     * 
     * <b>summary</b> : 
     * <p>创建浏览器实例</p>
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
     * <p>创建一个新的浏览器实例，用于执行网页自动化任务。浏览器实例提供网页浏览、元素操作、截图录制等功能。</p>
     * 
     * <b>summary</b> : 
     * <p>创建浏览器实例</p>
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
     * <p>创建代码解释器</p>
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
     * <p>创建代码解释器</p>
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
     * <b>summary</b> : 
     * <p>Create a credential</p>
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
     * <b>summary</b> : 
     * <p>Create a credential</p>
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
     * <p>创建知识库</p>
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
     * <p>创建知识库</p>
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
     * <p>添加记忆存储</p>
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
     * <p>添加记忆存储</p>
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
     * <b>summary</b> : 
     * <p>新增模型</p>
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
     * <b>summary</b> : 
     * <p>新增模型</p>
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
     * <b>summary</b> : 
     * <p>新增模型</p>
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
     * <b>summary</b> : 
     * <p>新增模型</p>
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
     * <p>根据模板创建一个新的沙箱实例。沙箱是运行时的执行环境，可以执行代码或运行浏览器。</p>
     * 
     * <b>summary</b> : 
     * <p>创建沙箱</p>
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
     * <p>根据模板创建一个新的沙箱实例。沙箱是运行时的执行环境，可以执行代码或运行浏览器。</p>
     * 
     * <b>summary</b> : 
     * <p>创建沙箱</p>
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
     * <p>创建一个新的模板，用于后续创建沙箱。模板定义了沙箱的运行时环境、资源配置等。</p>
     * 
     * <b>summary</b> : 
     * <p>创建模板</p>
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
     * <p>创建一个新的模板，用于后续创建沙箱。模板定义了沙箱的运行时环境、资源配置等。</p>
     * 
     * <b>summary</b> : 
     * <p>创建模板</p>
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
     * <p>删除指定的智能体运行时实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * <b>summary</b> : 
     * <p>删除智能体运行时</p>
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
     * <p>删除指定的智能体运行时实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * <b>summary</b> : 
     * <p>删除智能体运行时</p>
     * @return DeleteAgentRuntimeResponse
     */
    public DeleteAgentRuntimeResponse deleteAgentRuntime(String agentRuntimeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentRuntimeWithOptions(agentRuntimeId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete an agent runtime endpoint</p>
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
     * <p>Delete an agent runtime endpoint</p>
     * @return DeleteAgentRuntimeEndpointResponse
     */
    public DeleteAgentRuntimeEndpointResponse deleteAgentRuntimeEndpoint(String agentRuntimeId, String agentRuntimeEndpointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentRuntimeEndpointWithOptions(agentRuntimeId, agentRuntimeEndpointId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>删除指定的浏览器实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * <b>summary</b> : 
     * <p>删除浏览器实例</p>
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
     * <p>删除指定的浏览器实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * <b>summary</b> : 
     * <p>删除浏览器实例</p>
     * @return DeleteBrowserResponse
     */
    public DeleteBrowserResponse deleteBrowser(String browserId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBrowserWithOptions(browserId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>删除指定的代码解释器实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * <b>summary</b> : 
     * <p>删除代码解释器</p>
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
     * <p>删除指定的代码解释器实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * <b>summary</b> : 
     * <p>删除代码解释器</p>
     * @return DeleteCodeInterpreterResponse
     */
    public DeleteCodeInterpreterResponse deleteCodeInterpreter(String codeInterpreterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCodeInterpreterWithOptions(codeInterpreterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a credential</p>
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
     * <b>summary</b> : 
     * <p>Delete a credential</p>
     * @return DeleteCredentialResponse
     */
    public DeleteCredentialResponse deleteCredential(String credentialName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCredentialWithOptions(credentialName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除知识库</p>
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
     * <p>删除知识库</p>
     * @return DeleteKnowledgeBaseResponse
     */
    public DeleteKnowledgeBaseResponse deleteKnowledgeBase(String knowledgeBaseName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteKnowledgeBaseWithOptions(knowledgeBaseName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除记忆存储</p>
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
     * <p>删除记忆存储</p>
     * @return DeleteMemoryCollectionResponse
     */
    public DeleteMemoryCollectionResponse deleteMemoryCollection(String memoryCollectionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryCollectionWithOptions(memoryCollectionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型</p>
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
     * <b>summary</b> : 
     * <p>删除模型</p>
     * @return DeleteModelProxyResponse
     */
    public DeleteModelProxyResponse deleteModelProxy(String modelProxyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelProxyWithOptions(modelProxyName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模型</p>
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
     * <b>summary</b> : 
     * <p>删除模型</p>
     * @return DeleteModelServiceResponse
     */
    public DeleteModelServiceResponse deleteModelService(String modelServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelServiceWithOptions(modelServiceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Sandbox</p>
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
     * <b>summary</b> : 
     * <p>删除Sandbox</p>
     * @return DeleteSandboxResponse
     */
    public DeleteSandboxResponse deleteSandbox(String sandboxId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSandboxWithOptions(sandboxId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>删除指定的模板。删除后，该模板将无法再用于创建新的沙箱。</p>
     * 
     * <b>summary</b> : 
     * <p>删除模板</p>
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
     * <p>删除指定的模板。删除后，该模板将无法再用于创建新的沙箱。</p>
     * 
     * <b>summary</b> : 
     * <p>删除模板</p>
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(String templateName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(templateName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get access token for a resource</p>
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
     * <b>summary</b> : 
     * <p>Get access token for a resource</p>
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
     * <p>根据智能体运行时ID获取指定智能体运行时的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * <b>summary</b> : 
     * <p>获取智能体运行时详情</p>
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
     * <p>根据智能体运行时ID获取指定智能体运行时的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * <b>summary</b> : 
     * <p>获取智能体运行时详情</p>
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
     * <p>Get an agent runtime endpoint</p>
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
     * <p>Get an agent runtime endpoint</p>
     * @return GetAgentRuntimeEndpointResponse
     */
    public GetAgentRuntimeEndpointResponse getAgentRuntimeEndpoint(String agentRuntimeId, String agentRuntimeEndpointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentRuntimeEndpointWithOptions(agentRuntimeId, agentRuntimeEndpointId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>根据浏览器ID获取指定浏览器实例的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * <b>summary</b> : 
     * <p>获取浏览器实例详情</p>
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
     * <p>根据浏览器ID获取指定浏览器实例的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * <b>summary</b> : 
     * <p>获取浏览器实例详情</p>
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
     * <p>获取代码解释器详情</p>
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
     * <p>获取代码解释器详情</p>
     * @return GetCodeInterpreterResponse
     */
    public GetCodeInterpreterResponse getCodeInterpreter(String codeInterpreterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeInterpreterWithOptions(codeInterpreterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get a credential</p>
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
     * <b>summary</b> : 
     * <p>Get a credential</p>
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredential(String credentialName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCredentialWithOptions(credentialName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库</p>
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
     * <p>获取知识库</p>
     * @return GetKnowledgeBaseResponse
     */
    public GetKnowledgeBaseResponse getKnowledgeBase(String knowledgeBaseName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKnowledgeBaseWithOptions(knowledgeBaseName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询记忆存储详情</p>
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
     * <p>查询记忆存储详情</p>
     * @return GetMemoryCollectionResponse
     */
    public GetMemoryCollectionResponse getMemoryCollection(String memoryCollectionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryCollectionWithOptions(memoryCollectionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看model</p>
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
     * <b>summary</b> : 
     * <p>查看model</p>
     * @return GetModelProxyResponse
     */
    public GetModelProxyResponse getModelProxy(String modelProxyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelProxyWithOptions(modelProxyName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看model</p>
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
     * <b>summary</b> : 
     * <p>查看model</p>
     * @return GetModelServiceResponse
     */
    public GetModelServiceResponse getModelService(String modelServiceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelServiceWithOptions(modelServiceName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>根据沙箱ID获取指定沙箱的详细信息，包括状态、配置等。</p>
     * 
     * <b>summary</b> : 
     * <p>获取沙箱</p>
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
     * <p>根据沙箱ID获取指定沙箱的详细信息，包括状态、配置等。</p>
     * 
     * <b>summary</b> : 
     * <p>获取沙箱</p>
     * @return GetSandboxResponse
     */
    public GetSandboxResponse getSandbox(String sandboxId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSandboxWithOptions(sandboxId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>根据模板名称获取指定模板的详细信息，包括配置、状态等。</p>
     * 
     * <b>summary</b> : 
     * <p>获取模板</p>
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
     * <p>根据模板名称获取指定模板的详细信息，包括配置、状态等。</p>
     * 
     * <b>summary</b> : 
     * <p>获取模板</p>
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(String templateName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(templateName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>获取指定智能体运行时的所有端点列表，支持按名称过滤和分页查询。端点用于外部系统访问智能体运行时服务。</p>
     * 
     * <b>summary</b> : 
     * <p>列出智能体运行时端点</p>
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
     * <p>列出智能体运行时端点</p>
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
     * <p>List agent runtime versions</p>
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
     * <p>List agent runtime versions</p>
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
     * <p>获取当前用户的所有智能体运行时列表，支持按名称、标签等条件过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出智能体运行时</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("searchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
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
     * <p>获取当前用户的所有智能体运行时列表，支持按名称、标签等条件过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出智能体运行时</p>
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
     * <p>获取当前用户的所有浏览器实例列表，支持按名称、状态等条件过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出浏览器实例</p>
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
     * <p>获取当前用户的所有浏览器实例列表，支持按名称、状态等条件过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出浏览器实例</p>
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
     * <p>获取当前用户的所有代码解释器实例列表，支持按名称等条件过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出代码解释器</p>
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
     * <p>获取当前用户的所有代码解释器实例列表，支持按名称等条件过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出代码解释器</p>
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
     * <b>summary</b> : 
     * <p>List credentials</p>
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
     * <b>summary</b> : 
     * <p>List credentials</p>
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
     * <p>列出知识库</p>
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
     * <p>列出知识库</p>
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
     * <p>查询记忆存储列表</p>
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
     * <p>查询记忆存储列表</p>
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
     * <b>summary</b> : 
     * <p>查询支持的模型提供商及其模型</p>
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
     * <b>summary</b> : 
     * <p>查询支持的模型提供商及其模型</p>
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
     * <b>summary</b> : 
     * <p>model列表</p>
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
     * <b>summary</b> : 
     * <p>model列表</p>
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
     * <b>summary</b> : 
     * <p>model列表</p>
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
     * <b>summary</b> : 
     * <p>model列表</p>
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
     * <p>获取当前用户的所有沙箱列表，支持按模板名称过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出沙箱</p>
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
     * <p>获取当前用户的所有沙箱列表，支持按模板名称过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出沙箱</p>
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
     * <p>获取当前用户的所有模板列表，支持按模板类型过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出模板</p>
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
     * <p>获取当前用户的所有模板列表，支持按模板类型过滤，支持分页查询。</p>
     * 
     * <b>summary</b> : 
     * <p>列出模板</p>
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
     * <p>为指定的智能体运行时发布新版本，用于版本管理和部署。新版本可以包含代码更新、配置变更等内容。</p>
     * 
     * <b>summary</b> : 
     * <p>发布运行时版本</p>
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
     * <p>为指定的智能体运行时发布新版本，用于版本管理和部署。新版本可以包含代码更新、配置变更等内容。</p>
     * 
     * <b>summary</b> : 
     * <p>发布运行时版本</p>
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
     * <p>停止指定的沙箱实例。停止后，沙箱将进入TERMINATED状态。</p>
     * 
     * <b>summary</b> : 
     * <p>删除沙箱</p>
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
     * <p>停止指定的沙箱实例。停止后，沙箱将进入TERMINATED状态。</p>
     * 
     * <b>summary</b> : 
     * <p>删除沙箱</p>
     * @return StopSandboxResponse
     */
    public StopSandboxResponse stopSandbox(String sandboxId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopSandboxWithOptions(sandboxId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止模板的MCP服务器</p>
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
     * <b>summary</b> : 
     * <p>停止模板的MCP服务器</p>
     * @return StopTemplateMCPResponse
     */
    public StopTemplateMCPResponse stopTemplateMCP(String templateName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTemplateMCPWithOptions(templateName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>更新指定智能体运行时的配置信息，包括资源分配、网络配置、环境变量等。更新操作会触发运行时重启。</p>
     * 
     * <b>summary</b> : 
     * <p>更新智能体运行时</p>
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
     * <p>更新指定智能体运行时的配置信息，包括资源分配、网络配置、环境变量等。更新操作会触发运行时重启。</p>
     * 
     * <b>summary</b> : 
     * <p>更新智能体运行时</p>
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
     * <p>Update an agent runtime endpoint</p>
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
     * <p>Update an agent runtime endpoint</p>
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
     * <b>summary</b> : 
     * <p>Update a credential</p>
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
     * <b>summary</b> : 
     * <p>Update a credential</p>
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
     * <p>更新知识库</p>
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
     * <p>更新知识库</p>
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
     * <p>修改记忆存储信息</p>
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
     * <p>修改记忆存储信息</p>
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
     * <b>summary</b> : 
     * <p>更新模型</p>
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
     * <b>summary</b> : 
     * <p>更新模型</p>
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
     * <b>summary</b> : 
     * <p>更新模型</p>
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
     * <b>summary</b> : 
     * <p>更新模型</p>
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
     * <p>更新指定模板的配置信息，包括资源配置、网络配置、环境变量等。</p>
     * 
     * <b>summary</b> : 
     * <p>更新模板</p>
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
     * <p>更新指定模板的配置信息，包括资源配置、网络配置、环境变量等。</p>
     * 
     * <b>summary</b> : 
     * <p>更新模板</p>
     * 
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(String templateName, UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(templateName, request, headers, runtime);
    }
}
