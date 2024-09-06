// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626;

import com.aliyun.tea.*;
import com.aliyun.hcs_mgw20240626.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        com.aliyun.gateway.oss.Client gatewayClient = new com.aliyun.gateway.oss.Client();
        this._spi = gatewayClient;
        this._endpointRule = "";
    }


    /**
     * <b>summary</b> : 
     * <p>创建数据地址。</p>
     * 
     * @param request CreateAddressRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAddressResponse
     */
    public CreateAddressResponse createAddressWithOptions(String userid, CreateAddressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.importAddress)) {
            body.put("ImportAddress", request.importAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAddress"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/address"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据地址。</p>
     * 
     * @param request CreateAddressRequest
     * @return CreateAddressResponse
     */
    public CreateAddressResponse createAddress(String userid, CreateAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAddressWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建代理。</p>
     * 
     * @param request CreateAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgentWithOptions(String userid, CreateAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.importAgent)) {
            body.put("ImportAgent", request.importAgent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgent"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建代理。</p>
     * 
     * @param request CreateAgentRequest
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgent(String userid, CreateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建迁移任务。</p>
     * 
     * @param request CreateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(String userid, CreateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.importJob)) {
            body.put("ImportJob", request.importJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/job"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建迁移任务。</p>
     * 
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(String userid, CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建迁移报告。</p>
     * 
     * @param request CreateReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReportResponse
     */
    public CreateReportResponse createReportWithOptions(String userid, CreateReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createReport)) {
            body.put("CreateReport", request.createReport);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReport"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/report"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建迁移报告。</p>
     * 
     * @param request CreateReportRequest
     * @return CreateReportResponse
     */
    public CreateReportResponse createReport(String userid, CreateReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createReportWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建通道。</p>
     * 
     * @param request CreateTunnelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTunnelResponse
     */
    public CreateTunnelResponse createTunnelWithOptions(String userid, CreateTunnelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.importTunnel)) {
            body.put("ImportTunnel", request.importTunnel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTunnel"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tunnel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateTunnelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建通道。</p>
     * 
     * @param request CreateTunnelRequest
     * @return CreateTunnelResponse
     */
    public CreateTunnelResponse createTunnel(String userid, CreateTunnelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTunnelWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据地址。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAddressResponse
     */
    public DeleteAddressResponse deleteAddressWithOptions(String userid, String addressName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAddress"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/address/" + addressName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据地址。</p>
     * @return DeleteAddressResponse
     */
    public DeleteAddressResponse deleteAddress(String userid, String addressName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAddressWithOptions(userid, addressName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除代理。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgentWithOptions(String userid, String agentName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgent"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agent/" + agentName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除代理。</p>
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(String userid, String agentName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentWithOptions(userid, agentName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除迁移任务。</p>
     * 
     * @param request DeleteJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJobWithOptions(String userid, String jobName, DeleteJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDelete)) {
            query.put("forceDelete", request.forceDelete);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJob"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/job/" + jobName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除迁移任务。</p>
     * 
     * @param request DeleteJobRequest
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(String userid, String jobName, DeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteJobWithOptions(userid, jobName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除通道。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTunnelResponse
     */
    public DeleteTunnelResponse deleteTunnelWithOptions(String userid, String tunnelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTunnel"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tunnel/" + tunnelId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTunnelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除通道。</p>
     * @return DeleteTunnelResponse
     */
    public DeleteTunnelResponse deleteTunnel(String userid, String tunnelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTunnelWithOptions(userid, tunnelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据地址信息。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAddressResponse
     */
    public GetAddressResponse getAddressWithOptions(String userid, String addressName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAddress"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/address/" + addressName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据地址信息。</p>
     * @return GetAddressResponse
     */
    public GetAddressResponse getAddress(String userid, String addressName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAddressWithOptions(userid, addressName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取代理信息。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgentWithOptions(String userid, String agentName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgent"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agent/" + agentName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取代理信息。</p>
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(String userid, String agentName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentWithOptions(userid, agentName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取代理状态。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentStatusResponse
     */
    public GetAgentStatusResponse getAgentStatusWithOptions(String userid, String agentName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentStatus"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agent/" + agentName + "?status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAgentStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取代理状态。</p>
     * @return GetAgentStatusResponse
     */
    public GetAgentStatusResponse getAgentStatus(String userid, String agentName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentStatusWithOptions(userid, agentName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取迁移任务信息。</p>
     * 
     * @param request GetJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(String userid, String jobName, GetJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.byVersion)) {
            query.put("byVersion", request.byVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/job/" + jobName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取迁移任务信息。</p>
     * 
     * @param request GetJobRequest
     * @return GetJobResponse
     */
    public GetJobResponse getJob(String userid, String jobName, GetJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(userid, jobName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取迁移任务失败文件清单信息。</p>
     * 
     * @param request GetJobResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResultResponse
     */
    public GetJobResultResponse getJobResultWithOptions(String userid, String jobName, GetJobResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.runtimeId)) {
            query.put("runtimeId", request.runtimeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobResult"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/job/" + jobName + "?jobResult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetJobResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取迁移任务失败文件清单信息。</p>
     * 
     * @param request GetJobResultRequest
     * @return GetJobResultResponse
     */
    public GetJobResultResponse getJobResult(String userid, String jobName, GetJobResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobResultWithOptions(userid, jobName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取迁移报告。</p>
     * 
     * @param request GetReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReportResponse
     */
    public GetReportResponse getReportWithOptions(String userid, GetReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.runtimeId)) {
            query.put("runtimeId", request.runtimeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReport"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取迁移报告。</p>
     * 
     * @param request GetReportRequest
     * @return GetReportResponse
     */
    public GetReportResponse getReport(String userid, GetReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getReportWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取通道信息。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTunnelResponse
     */
    public GetTunnelResponse getTunnelWithOptions(String userid, String tunnelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTunnel"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tunnel/" + tunnelId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetTunnelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取通道信息。</p>
     * @return GetTunnelResponse
     */
    public GetTunnelResponse getTunnel(String userid, String tunnelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTunnelWithOptions(userid, tunnelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举数据地址。</p>
     * 
     * @param request ListAddressRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddressResponse
     */
    public ListAddressResponse listAddressWithOptions(String userid, ListAddressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddress"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/addresslist"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举数据地址。</p>
     * 
     * @param request ListAddressRequest
     * @return ListAddressResponse
     */
    public ListAddressResponse listAddress(String userid, ListAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAddressWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举代理。</p>
     * 
     * @param request ListAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentResponse
     */
    public ListAgentResponse listAgentWithOptions(String userid, ListAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgent"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentlist"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举代理。</p>
     * 
     * @param request ListAgentRequest
     * @return ListAgentResponse
     */
    public ListAgentResponse listAgent(String userid, ListAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举迁移任务。</p>
     * 
     * @param request ListJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobResponse
     */
    public ListJobResponse listJobWithOptions(String userid, ListJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentName)) {
            query.put("parentName", request.parentName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJob"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/joblist"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举迁移任务。</p>
     * 
     * @param request ListJobRequest
     * @return ListJobResponse
     */
    public ListJobResponse listJob(String userid, ListJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举迁移任务运行历史。</p>
     * 
     * @param request ListJobHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobHistoryResponse
     */
    public ListJobHistoryResponse listJobHistoryWithOptions(String userid, String jobName, ListJobHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeId)) {
            query.put("runtimeId", request.runtimeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobHistory"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/jobhistory/" + jobName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListJobHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举迁移任务运行历史。</p>
     * 
     * @param request ListJobHistoryRequest
     * @return ListJobHistoryResponse
     */
    public ListJobHistoryResponse listJobHistory(String userid, String jobName, ListJobHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobHistoryWithOptions(userid, jobName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举通道。</p>
     * 
     * @param request ListTunnelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTunnelResponse
     */
    public ListTunnelResponse listTunnelWithOptions(String userid, ListTunnelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTunnel"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tunnellist"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListTunnelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举通道。</p>
     * 
     * @param request ListTunnelRequest
     * @return ListTunnelResponse
     */
    public ListTunnelResponse listTunnel(String userid, ListTunnelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTunnelWithOptions(userid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据地址。</p>
     * 
     * @param request UpdateAddressRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAddressResponse
     */
    public UpdateAddressResponse updateAddressWithOptions(String userid, String addressName, UpdateAddressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.importAddress)) {
            body.put("ImportAddress", request.importAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAddress"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/address/" + addressName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据地址。</p>
     * 
     * @param request UpdateAddressRequest
     * @return UpdateAddressResponse
     */
    public UpdateAddressResponse updateAddress(String userid, String addressName, UpdateAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAddressWithOptions(userid, addressName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新迁移任务。</p>
     * 
     * @param request UpdateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJobWithOptions(String userid, String jobName, UpdateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.importJob)) {
            body.put("ImportJob", request.importJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJob"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/job/" + jobName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新迁移任务。</p>
     * 
     * @param request UpdateJobRequest
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(String userid, String jobName, UpdateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateJobWithOptions(userid, jobName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新通道。</p>
     * 
     * @param request UpdateTunnelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTunnelResponse
     */
    public UpdateTunnelResponse updateTunnelWithOptions(String userid, String tunnelId, UpdateTunnelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.importTunnel)) {
            body.put("ImportTunnel", request.importTunnel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTunnel"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tunnel/" + tunnelId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTunnelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新通道。</p>
     * 
     * @param request UpdateTunnelRequest
     * @return UpdateTunnelResponse
     */
    public UpdateTunnelResponse updateTunnel(String userid, String tunnelId, UpdateTunnelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTunnelWithOptions(userid, tunnelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验数据地址是否可用。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyAddressResponse
     */
    public VerifyAddressResponse verifyAddressWithOptions(String userid, String addressName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("userid", userid);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyAddress"),
            new TeaPair("version", "2024-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/address/" + addressName + "?verify"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new VerifyAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验数据地址是否可用。</p>
     * @return VerifyAddressResponse
     */
    public VerifyAddressResponse verifyAddress(String userid, String addressName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyAddressWithOptions(userid, addressName, headers, runtime);
    }
}
