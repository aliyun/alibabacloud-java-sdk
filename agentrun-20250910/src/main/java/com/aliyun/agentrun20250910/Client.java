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
}
