// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626;

import com.aliyun.tea.*;
import com.aliyun.hcs_mgw20240626.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "hcs-mgw";
        com.aliyun.gateway.oss.Client gatewayClient = new com.aliyun.gateway.oss.Client();
        this._spi = gatewayClient;
        this._endpointRule = "";
    }


    /**
     * <b>description</b> :
     * <p>  To create a data address, you must have the permission on mgw:CreateImportAddress.</p>
     * <ul>
     * <li>If you want to use an agent to migrate data, you must create an agent first and then associate the agent with a data address when you create the data address.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data address.</p>
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
     * <b>description</b> :
     * <p>  To create a data address, you must have the permission on mgw:CreateImportAddress.</p>
     * <ul>
     * <li>If you want to use an agent to migrate data, you must create an agent first and then associate the agent with a data address when you create the data address.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data address.</p>
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
     * <b>description</b> :
     * <p>  To create an agent, you must have the permission on mgw:CreateImportAgent.</p>
     * <ul>
     * <li>If you want to migrate data to Alibaba Cloud over an Express Connect circuit or a VPN gateway, or migrate data from a self-managed storage space to Alibaba Cloud, you can deploy an agent.</li>
     * <li>Before you create an agent, you must create a tunnel. An agent must be associated with a tunnel.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The request boy for creating the agent.</p>
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
     * <b>description</b> :
     * <p>  To create an agent, you must have the permission on mgw:CreateImportAgent.</p>
     * <ul>
     * <li>If you want to migrate data to Alibaba Cloud over an Express Connect circuit or a VPN gateway, or migrate data from a self-managed storage space to Alibaba Cloud, you can deploy an agent.</li>
     * <li>Before you create an agent, you must create a tunnel. An agent must be associated with a tunnel.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The request boy for creating the agent.</p>
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
     * <b>description</b> :
     * <p>  To create a migration task, you must have the permission on mgw:CreateImportJob.</p>
     * <ul>
     * <li>Before you create a migration task, you must create data addresses.</li>
     * <li>A migration task can run multiple rounds. Each round has an execution ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a migration task.</p>
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
     * <b>description</b> :
     * <p>  To create a migration task, you must have the permission on mgw:CreateImportJob.</p>
     * <ul>
     * <li>Before you create a migration task, you must create data addresses.</li>
     * <li>A migration task can run multiple rounds. Each round has an execution ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a migration task.</p>
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
     * <b>description</b> :
     * <p>  To create a migration report, you must have the permission on mgw:CreateImportReport.</p>
     * <ul>
     * <li>If you specify that a migration report is to be generated when you create a migration task, you do not need to call this operation. If you do not specify that a migration report is to be generated when you create a migration task, you can call this operation to create a migration report for an execution with the specified ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a migration report.</p>
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
     * <b>description</b> :
     * <p>  To create a migration report, you must have the permission on mgw:CreateImportReport.</p>
     * <ul>
     * <li>If you specify that a migration report is to be generated when you create a migration task, you do not need to call this operation. If you do not specify that a migration report is to be generated when you create a migration task, you can call this operation to create a migration report for an execution with the specified ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a migration report.</p>
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
     * <b>description</b> :
     * <p>  To create a tunnel, you must have the permission on mgw:CreateImportTunnel.</p>
     * <ul>
     * <li>When you use an agent to migrate data, the agent must be associated with a tunnel.</li>
     * <li>A tunnel can be associated with multiple agents. You can throttle the traffic of the agents that are associated with the same tunnel by setting the bandwidth and the number of requests per second for the tunnel.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a tunnel.</p>
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
     * <b>description</b> :
     * <p>  To create a tunnel, you must have the permission on mgw:CreateImportTunnel.</p>
     * <ul>
     * <li>When you use an agent to migrate data, the agent must be associated with a tunnel.</li>
     * <li>A tunnel can be associated with multiple agents. You can throttle the traffic of the agents that are associated with the same tunnel by setting the bandwidth and the number of requests per second for the tunnel.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a tunnel.</p>
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
     * <b>description</b> :
     * <p>  To delete a data address, you must have the permission on mgw:DeleteImportAddress.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data address.</p>
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
     * <b>description</b> :
     * <p>  To delete a data address, you must have the permission on mgw:DeleteImportAddress.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data address.</p>
     * @return DeleteAddressResponse
     */
    public DeleteAddressResponse deleteAddress(String userid, String addressName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAddressWithOptions(userid, addressName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  To delete an agent, you must have the permission on mgw:DeleteImportAgent.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an agent.</p>
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
     * <b>description</b> :
     * <p>  To delete an agent, you must have the permission on mgw:DeleteImportAgent.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an agent.</p>
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(String userid, String agentName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentWithOptions(userid, agentName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  To delete a migration task, you must have the permission on mgw:DeleteImportJob.</p>
     * <ul>
     * <li>The operation to delete a migration task is asynchronous. The migration task remains in the Deleting state until it is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a migration task.</p>
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
     * <b>description</b> :
     * <p>  To delete a migration task, you must have the permission on mgw:DeleteImportJob.</p>
     * <ul>
     * <li>The operation to delete a migration task is asynchronous. The migration task remains in the Deleting state until it is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a migration task.</p>
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
     * <b>description</b> :
     * <p>  To delete a tunnel, you must have the permission on mgw:DeleteImportTunnel.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a tunnel.</p>
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
     * <b>description</b> :
     * <p>  To delete a tunnel, you must have the permission on mgw:DeleteImportTunnel.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a tunnel.</p>
     * @return DeleteTunnelResponse
     */
    public DeleteTunnelResponse deleteTunnel(String userid, String tunnelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTunnelWithOptions(userid, tunnelId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  To query the information about a data address, you must have the permission on mgw:GetImportAddress.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of a data address.</p>
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
     * <b>description</b> :
     * <p>  To query the information about a data address, you must have the permission on mgw:GetImportAddress.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of a data address.</p>
     * @return GetAddressResponse
     */
    public GetAddressResponse getAddress(String userid, String addressName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAddressWithOptions(userid, addressName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  To query the information about an agent, you must have the permission on mgw:GetImportAgent.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of an agent.</p>
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
     * <b>description</b> :
     * <p>  To query the information about an agent, you must have the permission on mgw:GetImportAgent.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of an agent.</p>
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(String userid, String agentName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentWithOptions(userid, agentName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  To query the status of an agent, you must have the permission on mgw:GetImportAgent.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the running status of an agent.</p>
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
     * <b>description</b> :
     * <p>  To query the status of an agent, you must have the permission on mgw:GetImportAgent.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the running status of an agent.</p>
     * @return GetAgentStatusResponse
     */
    public GetAgentStatusResponse getAgentStatus(String userid, String agentName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentStatusWithOptions(userid, agentName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  To query the information about a migration task, you must have the permission on mgw:GetImportJob.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of a migration task.</p>
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
     * <b>description</b> :
     * <p>  To query the information about a migration task, you must have the permission on mgw:GetImportJob.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of a migration task.</p>
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
     * <b>description</b> :
     * <p>  To query the retry information about a migration task, you must have the permission on mgw:GetImportJobResult.</p>
     * <ul>
     * <li>If files fail to be migrated during a migration task, a list of files that fail to be migrated is generated. You can call this operation to query this list. You can create a data address based on this list and create a subtask. This way, you can migrate these files again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the list of files that fail to be migrated when files fail to be migrated during a migration task.</p>
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
     * <b>description</b> :
     * <p>  To query the retry information about a migration task, you must have the permission on mgw:GetImportJobResult.</p>
     * <ul>
     * <li>If files fail to be migrated during a migration task, a list of files that fail to be migrated is generated. You can call this operation to query this list. You can create a data address based on this list and create a subtask. This way, you can migrate these files again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the list of files that fail to be migrated when files fail to be migrated during a migration task.</p>
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
     * <b>description</b> :
     * <p>  To query the information about a migration report, you must have the permission on mgw:GetImportReport.</p>
     * <ul>
     * <li>The migration report is pushed to the destination data address. For more information, see the &quot;View a migration report&quot; section of the &quot;Subsequent operations&quot; topic in migration tutorials.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of a migration report.</p>
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
     * <b>description</b> :
     * <p>  To query the information about a migration report, you must have the permission on mgw:GetImportReport.</p>
     * <ul>
     * <li>The migration report is pushed to the destination data address. For more information, see the &quot;View a migration report&quot; section of the &quot;Subsequent operations&quot; topic in migration tutorials.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of a migration report.</p>
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
     * <b>description</b> :
     * <p>  To query the information about a tunnel, you must have the permission on mgw:GetImportTunnel.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of a tunnel.</p>
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
     * <b>description</b> :
     * <p>  To query the information about a tunnel, you must have the permission on mgw:GetImportTunnel.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of a tunnel.</p>
     * @return GetTunnelResponse
     */
    public GetTunnelResponse getTunnel(String userid, String tunnelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTunnelWithOptions(userid, tunnelId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  To query a list of data addresses, you must have the permission on mgw:ListImportAddress.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the data addresses created by a user in the specific region.</p>
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
     * <b>description</b> :
     * <p>  To query a list of data addresses, you must have the permission on mgw:ListImportAddress.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the data addresses created by a user in the specific region.</p>
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
     * <b>description</b> :
     * <p>  To query a list of agents, you must have the permission on mgw:ListImportAgent.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the agents created by a user in the specific region.</p>
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
     * <b>description</b> :
     * <p>  To query a list of agents, you must have the permission on mgw:ListImportAgent.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the agents created by a user in the specific region.</p>
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
     * <b>description</b> :
     * <p>  To query a list of migration tasks, you must have the permission on mgw:ListImportJob.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the migration tasks created by a user in the specific region.</p>
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
     * <b>description</b> :
     * <p>  To query a list of migration tasks, you must have the permission on mgw:ListImportJob.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the migration tasks created by a user in the specific region.</p>
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
     * <b>description</b> :
     * <p>  To query the execution history of a migration task, you must have the permission on mgw:ListImportJobHistory.</p>
     * <ul>
     * <li>A migration task can run multiple rounds. A unique execution ID is generated for each round.</li>
     * <li>The execution history of a migration task records the change history of the task status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the running history of a migration task.</p>
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
     * <b>description</b> :
     * <p>  To query the execution history of a migration task, you must have the permission on mgw:ListImportJobHistory.</p>
     * <ul>
     * <li>A migration task can run multiple rounds. A unique execution ID is generated for each round.</li>
     * <li>The execution history of a migration task records the change history of the task status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the running history of a migration task.</p>
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
     * <b>description</b> :
     * <p>  To query a list of tunnels, you must have the permission on mgw:ListImportTunnel.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists tunnels.</p>
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
     * <b>description</b> :
     * <p>  To query a list of tunnels, you must have the permission on mgw:ListImportTunnel.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists tunnels.</p>
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
     * <b>description</b> :
     * <p>  To update a data address, you must have the permission on mgw:UpdateImportAddress.</p>
     * <ul>
     * <li>If the data address is associated with an agent, you can scale up or down the agent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a data address.</p>
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
     * <b>description</b> :
     * <p>  To update a data address, you must have the permission on mgw:UpdateImportAddress.</p>
     * <ul>
     * <li>If the data address is associated with an agent, you can scale up or down the agent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a data address.</p>
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
     * <b>description</b> :
     * <p>  To update a migration task, you must have the permission on mgw:UpdateImportJob.</p>
     * <ul>
     * <li>You can update only the status or throttling settings of a task in a single request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the status or throttling of a task.</p>
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
     * <b>description</b> :
     * <p>  To update a migration task, you must have the permission on mgw:UpdateImportJob.</p>
     * <ul>
     * <li>You can update only the status or throttling settings of a task in a single request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the status or throttling of a task.</p>
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
     * <b>description</b> :
     * <p>  To update a tunnel, you must have the permission on mgw:UpdateImportTunnel.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a tunnel.</p>
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
     * <b>description</b> :
     * <p>  To update a tunnel, you must have the permission on mgw:UpdateImportTunnel.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a tunnel.</p>
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
     * <b>description</b> :
     * <p>  To verify a data address, you must have the permission on mgw:VerifyImportAddress.</p>
     * <ul>
     * <li>A data address may not be available even if the data address passes the availability verification. The data migration results prevail.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether a data address is available.</p>
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
     * <b>description</b> :
     * <p>  To verify a data address, you must have the permission on mgw:VerifyImportAddress.</p>
     * <ul>
     * <li>A data address may not be available even if the data address passes the availability verification. The data migration results prevail.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether a data address is available.</p>
     * @return VerifyAddressResponse
     */
    public VerifyAddressResponse verifyAddress(String userid, String addressName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyAddressWithOptions(userid, addressName, headers, runtime);
    }
}
