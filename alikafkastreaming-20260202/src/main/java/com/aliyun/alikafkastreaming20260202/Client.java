// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202;

import com.aliyun.tea.*;
import com.aliyun.alikafkastreaming20260202.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "AlikafkaStreaming";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alikafkastreaming", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>You can invoke this operation by using the GET or POST method.</li>
     * <li>You must specify the <code>InstanceId</code>, <code>JobName</code>, and <code>SqlContent</code> parameters. The <code>SqlContent</code> parameter specifies the Flink SQL statement to be validated.</li>
     * <li>In the response, the <code>Data.Valid</code> field indicates whether the SQL statement passed the validation. If the validation fails, the fault details are returned in the <code>Data.ErrorList</code> field.</li>
     * <li>The current version requires both the instance ID (<code>InstanceId</code>) and the job name (<code>JobName</code>) to build the job context.</li>
     * <li>A successful response only indicates that the system starts to execute the validation flow. It does not directly indicate whether the SQL statement is valid. Check the <code>Data.Valid</code> field to determine whether the SQL statement is valid.</li>
     * <li>For error codes and exception handling, refer to the Error codes section in the References.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Validates whether a specified Flink SQL statement complies with the specifications.</p>
     * 
     * @param request CheckSqlContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSqlContentResponse
     */
    public CheckSqlContentResponse checkSqlContentWithOptions(CheckSqlContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlContent)) {
            query.put("SqlContent", request.sqlContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSqlContent"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSqlContentResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>You can invoke this operation by using the GET or POST method.</li>
     * <li>You must specify the <code>InstanceId</code>, <code>JobName</code>, and <code>SqlContent</code> parameters. The <code>SqlContent</code> parameter specifies the Flink SQL statement to be validated.</li>
     * <li>In the response, the <code>Data.Valid</code> field indicates whether the SQL statement passed the validation. If the validation fails, the fault details are returned in the <code>Data.ErrorList</code> field.</li>
     * <li>The current version requires both the instance ID (<code>InstanceId</code>) and the job name (<code>JobName</code>) to build the job context.</li>
     * <li>A successful response only indicates that the system starts to execute the validation flow. It does not directly indicate whether the SQL statement is valid. Check the <code>Data.Valid</code> field to determine whether the SQL statement is valid.</li>
     * <li>For error codes and exception handling, refer to the Error codes section in the References.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Validates whether a specified Flink SQL statement complies with the specifications.</p>
     * 
     * @param request CheckSqlContentRequest
     * @return CheckSqlContentResponse
     */
    public CheckSqlContentResponse checkSqlContent(CheckSqlContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSqlContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a compute instance. This operation only completes the purchase phase. After the instance is created, call StartComputeInstance to complete network configuration and deployment.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: CreateComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a compute instance. This operation only completes the purchase phase. After the instance is created, call StartComputeInstance to complete network configuration and deployment.</p>
     * 
     * @param request CreateComputeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComputeInstanceResponse
     */
    public CreateComputeInstanceResponse createComputeInstanceWithOptions(CreateComputeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComputeInstance"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a compute instance. This operation only completes the purchase phase. After the instance is created, call StartComputeInstance to complete network configuration and deployment.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: CreateComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a compute instance. This operation only completes the purchase phase. After the instance is created, call StartComputeInstance to complete network configuration and deployment.</p>
     * 
     * @param request CreateComputeInstanceRequest
     * @return CreateComputeInstanceResponse
     */
    public CreateComputeInstanceResponse createComputeInstance(CreateComputeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComputeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates a new Flink SQL job on a specified running compute instance.</li>
     * <li>The created job is in the <code>INIT</code> state.</li>
     * <li>You can control the resource usage of the job by setting <code>CuLimit</code> and <code>CuReserved</code>.</li>
     * <li>The <code>Remark</code> field allows you to add remarks to the job for easier management and identification.</li>
     * <li>Make sure that the <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are accurate. Otherwise, the request may fail.</li>
     * <li>If you attempt to create a job with a duplicate name, an error is returned.</li>
     * <li>The compute instance must be in the running state to successfully create a job.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Flink SQL job on a running compute instance.</p>
     * 
     * @param request CreateComputeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComputeJobResponse
     */
    public CreateComputeJobResponse createComputeJobWithOptions(CreateComputeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cuLimit)) {
            query.put("CuLimit", request.cuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cuReserved)) {
            query.put("CuReserved", request.cuReserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComputeJob"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates a new Flink SQL job on a specified running compute instance.</li>
     * <li>The created job is in the <code>INIT</code> state.</li>
     * <li>You can control the resource usage of the job by setting <code>CuLimit</code> and <code>CuReserved</code>.</li>
     * <li>The <code>Remark</code> field allows you to add remarks to the job for easier management and identification.</li>
     * <li>Make sure that the <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are accurate. Otherwise, the request may fail.</li>
     * <li>If you attempt to create a job with a duplicate name, an error is returned.</li>
     * <li>The compute instance must be in the running state to successfully create a job.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Flink SQL job on a running compute instance.</p>
     * 
     * @param request CreateComputeJobRequest
     * @return CreateComputeJobResponse
     */
    public CreateComputeJobResponse createComputeJob(CreateComputeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComputeJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a compute instance that is in the pending deployment, stopped, or released state.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: DeleteComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a compute instance that is in the pending deployment, stopped, or released state.</p>
     * 
     * @param request DeleteComputeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComputeInstanceResponse
     */
    public DeleteComputeInstanceResponse deleteComputeInstanceWithOptions(DeleteComputeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComputeInstance"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComputeInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a compute instance that is in the pending deployment, stopped, or released state.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: DeleteComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a compute instance that is in the pending deployment, stopped, or released state.</p>
     * 
     * @param request DeleteComputeInstanceRequest
     * @return DeleteComputeInstanceResponse
     */
    public DeleteComputeInstanceResponse deleteComputeInstance(DeleteComputeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteComputeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation deletes a specific compute job.</li>
     * <li>A successful call to this operation only indicates that the deletion request has been accepted by the system. The deletion is not completed immediately.</li>
     * <li>Make sure that the <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are accurate. Otherwise, the request may fail.</li>
     * <li>If the compute instance or job is in a state that does not allow deletion, such as a non-running state, an error message is returned.</li>
     * <li>The deletion operation is irreversible. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified compute job. A successful request indicates that the deletion request has been accepted.</p>
     * 
     * @param request DeleteComputeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComputeJobResponse
     */
    public DeleteComputeJobResponse deleteComputeJobWithOptions(DeleteComputeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComputeJob"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComputeJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation deletes a specific compute job.</li>
     * <li>A successful call to this operation only indicates that the deletion request has been accepted by the system. The deletion is not completed immediately.</li>
     * <li>Make sure that the <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are accurate. Otherwise, the request may fail.</li>
     * <li>If the compute instance or job is in a state that does not allow deletion, such as a non-running state, an error message is returned.</li>
     * <li>The deletion operation is irreversible. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified compute job. A successful request indicates that the deletion request has been accepted.</p>
     * 
     * @param request DeleteComputeJobRequest
     * @return DeleteComputeJobResponse
     */
    public DeleteComputeJobResponse deleteComputeJob(DeleteComputeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteComputeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified compute instance.</p>
     * 
     * @param request GetComputeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComputeInstanceResponse
     */
    public GetComputeInstanceResponse getComputeInstanceWithOptions(GetComputeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComputeInstance"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified compute instance.</p>
     * 
     * @param request GetComputeInstanceRequest
     * @return GetComputeInstanceResponse
     */
    public GetComputeInstanceResponse getComputeInstance(GetComputeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getComputeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the details of a specified compute job.</li>
     * <li>You can use the GET or POST method to send requests.</li>
     * <li>The <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are required.</li>
     * <li>The authorization action is <code>alikafkastreaming:GetComputeJob</code>, and the access level is Read.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a compute job in Alikafka Streaming by using a parameter query.</p>
     * 
     * @param request GetComputeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComputeJobResponse
     */
    public GetComputeJobResponse getComputeJobWithOptions(GetComputeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComputeJob"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the details of a specified compute job.</li>
     * <li>You can use the GET or POST method to send requests.</li>
     * <li>The <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are required.</li>
     * <li>The authorization action is <code>alikafkastreaming:GetComputeJob</code>, and the access level is Read.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a compute job in Alikafka Streaming by using a parameter query.</p>
     * 
     * @param request GetComputeJobRequest
     * @return GetComputeJobResponse
     */
    public GetComputeJobResponse getComputeJob(GetComputeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getComputeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取debug信息</p>
     * 
     * @param request GetJobDebugDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobDebugDataResponse
     */
    public GetJobDebugDataResponse getJobDebugDataWithOptions(GetJobDebugDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobDebugData"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobDebugDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取debug信息</p>
     * 
     * @param request GetJobDebugDataRequest
     * @return GetJobDebugDataResponse
     */
    public GetJobDebugDataResponse getJobDebugData(GetJobDebugDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobDebugDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例列表（分页）</p>
     * 
     * @param tmpReq ListComputeInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComputeInstancesResponse
     */
    public ListComputeInstancesResponse listComputeInstancesWithOptions(ListComputeInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListComputeInstancesShrinkRequest request = new ListComputeInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComputeInstances"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例列表（分页）</p>
     * 
     * @param request ListComputeInstancesRequest
     * @return ListComputeInstancesResponse
     */
    public ListComputeInstancesResponse listComputeInstances(ListComputeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComputeInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries compute instances under the current account by using paging.</p>
     * 
     * @param tmpReq ListComputeInstancesInPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComputeInstancesInPageResponse
     */
    public ListComputeInstancesInPageResponse listComputeInstancesInPageWithOptions(ListComputeInstancesInPageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListComputeInstancesInPageShrinkRequest request = new ListComputeInstancesInPageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComputeInstancesInPage"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeInstancesInPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries compute instances under the current account by using paging.</p>
     * 
     * @param request ListComputeInstancesInPageRequest
     * @return ListComputeInstancesInPageResponse
     */
    public ListComputeInstancesInPageResponse listComputeInstancesInPage(ListComputeInstancesInPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComputeInstancesInPageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports a cursor-based paged query by using the <code>MaxResults</code> and <code>NextToken</code> parameters.</li>
     * <li>You do not need to specify <code>NextToken</code> in the first request. For subsequent requests, use the <code>NextToken</code> value returned in the previous response.</li>
     * <li>You can search by job name or remark, and specify different sorting fields and directions.</li>
     * <li>The authorization action is <code>alikafkastreaming:ListComputeJobs</code>. The access level is List, which applies to all resources.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all job information under a specified compute instance by using paging.</p>
     * 
     * @param request ListComputeJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComputeJobsResponse
     */
    public ListComputeJobsResponse listComputeJobsWithOptions(ListComputeJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComputeJobs"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeJobsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports a cursor-based paged query by using the <code>MaxResults</code> and <code>NextToken</code> parameters.</li>
     * <li>You do not need to specify <code>NextToken</code> in the first request. For subsequent requests, use the <code>NextToken</code> value returned in the previous response.</li>
     * <li>You can search by job name or remark, and specify different sorting fields and directions.</li>
     * <li>The authorization action is <code>alikafkastreaming:ListComputeJobs</code>. The access level is List, which applies to all resources.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all job information under a specified compute instance by using paging.</p>
     * 
     * @param request ListComputeJobsRequest
     * @return ListComputeJobsResponse
     */
    public ListComputeJobsResponse listComputeJobs(ListComputeJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComputeJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询创建 SQL 任务时支持的连接器列表</p>
     * 
     * @param request ListSupportedConnectorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSupportedConnectorsResponse
     */
    public ListSupportedConnectorsResponse listSupportedConnectorsWithOptions(ListSupportedConnectorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSupportedConnectors"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSupportedConnectorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询创建 SQL 任务时支持的连接器列表</p>
     * 
     * @param request ListSupportedConnectorsRequest
     * @return ListSupportedConnectorsResponse
     */
    public ListSupportedConnectorsResponse listSupportedConnectors(ListSupportedConnectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSupportedConnectorsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Re-enables a stopped pay-as-you-go compute instance. A successful response indicates that the re-enablement request has been accepted.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: ReopenComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Re-enables a stopped pay-as-you-go compute instance. A successful response indicates that the re-enablement request has been accepted.</p>
     * 
     * @param request ReopenComputeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReopenComputeInstanceResponse
     */
    public ReopenComputeInstanceResponse reopenComputeInstanceWithOptions(ReopenComputeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReopenComputeInstance"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReopenComputeInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Re-enables a stopped pay-as-you-go compute instance. A successful response indicates that the re-enablement request has been accepted.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: ReopenComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Re-enables a stopped pay-as-you-go compute instance. A successful response indicates that the re-enablement request has been accepted.</p>
     * 
     * @param request ReopenComputeInstanceRequest
     * @return ReopenComputeInstanceResponse
     */
    public ReopenComputeInstanceResponse reopenComputeInstance(ReopenComputeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reopenComputeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重启 JOB</p>
     * 
     * @param request RestartComputeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartComputeJobResponse
     */
    public RestartComputeJobResponse restartComputeJobWithOptions(RestartComputeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartComputeJob"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartComputeJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重启 JOB</p>
     * 
     * @param request RestartComputeJobRequest
     * @return RestartComputeJobResponse
     */
    public RestartComputeJobResponse restartComputeJob(RestartComputeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartComputeJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Configures the network and deploys a compute instance in the pending deployment state.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: StartComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures the network and deploys a compute instance in the pending deployment state.</p>
     * 
     * @param tmpReq StartComputeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartComputeInstanceResponse
     */
    public StartComputeInstanceResponse startComputeInstanceWithOptions(StartComputeInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartComputeInstanceShrinkRequest request = new StartComputeInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vSwitchIds)) {
            request.vSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vSwitchIds, "VSwitchIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdsShrink)) {
            query.put("VSwitchIds", request.vSwitchIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartComputeInstance"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartComputeInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Configures the network and deploys a compute instance in the pending deployment state.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: StartComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures the network and deploys a compute instance in the pending deployment state.</p>
     * 
     * @param request StartComputeInstanceRequest
     * @return StartComputeInstanceResponse
     */
    public StartComputeInstanceResponse startComputeInstance(StartComputeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startComputeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><code>RecoveryMode</code> supports two modes: <code>savepoint</code> and <code>stateless</code>. If you select the <code>savepoint</code> mode but no savepoint is available, an error is returned.</li>
     * <li>The <code>CuLimit</code> and <code>CuReserved</code> parameters are used to set the CU limit and the number of reserved CUs for the job, respectively. Integers and decimals are supported.</li>
     * <li>Make sure that the values of the <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are correct and exist. Otherwise, the request fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts, resumes, or debugs a compute job.</p>
     * 
     * @param request StartComputeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartComputeJobResponse
     */
    public StartComputeJobResponse startComputeJobWithOptions(StartComputeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cuLimit)) {
            query.put("CuLimit", request.cuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cuReserved)) {
            query.put("CuReserved", request.cuReserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draftSql)) {
            query.put("DraftSql", request.draftSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMode)) {
            query.put("RecoveryMode", request.recoveryMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartComputeJob"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartComputeJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><code>RecoveryMode</code> supports two modes: <code>savepoint</code> and <code>stateless</code>. If you select the <code>savepoint</code> mode but no savepoint is available, an error is returned.</li>
     * <li>The <code>CuLimit</code> and <code>CuReserved</code> parameters are used to set the CU limit and the number of reserved CUs for the job, respectively. Integers and decimals are supported.</li>
     * <li>Make sure that the values of the <code>RegionId</code>, <code>InstanceId</code>, and <code>JobName</code> parameters are correct and exist. Otherwise, the request fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts, resumes, or debugs a compute job.</p>
     * 
     * @param request StartComputeJobRequest
     * @return StartComputeJobResponse
     */
    public StartComputeJobResponse startComputeJob(StartComputeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startComputeJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Stops a running pay-as-you-go compute instance. A successful response indicates that the stop request has been accepted.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: StopComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a running pay-as-you-go compute instance. A successful response indicates that the stop request has been accepted.</p>
     * 
     * @param request StopComputeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopComputeInstanceResponse
     */
    public StopComputeInstanceResponse stopComputeInstanceWithOptions(StopComputeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopComputeInstance"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopComputeInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Stops a running pay-as-you-go compute instance. A successful response indicates that the stop request has been accepted.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: StopComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a running pay-as-you-go compute instance. A successful response indicates that the stop request has been accepted.</p>
     * 
     * @param request StopComputeInstanceRequest
     * @return StopComputeInstanceResponse
     */
    public StopComputeInstanceResponse stopComputeInstance(StopComputeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopComputeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation stops the production or debug runtime instance of a specified compute job.</li>
     * <li>A successful response indicates that the stop request has been accepted, but it does not mean that the job stops immediately.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a compute job in a specified region and instance.</p>
     * 
     * @param request StopComputeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopComputeJobResponse
     */
    public StopComputeJobResponse stopComputeJobWithOptions(StopComputeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopComputeJob"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopComputeJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation stops the production or debug runtime instance of a specified compute job.</li>
     * <li>A successful response indicates that the stop request has been accepted, but it does not mean that the job stops immediately.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a compute job in a specified region and instance.</p>
     * 
     * @param request StopComputeJobRequest
     * @return StopComputeJobResponse
     */
    public StopComputeJobResponse stopComputeJob(StopComputeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopComputeJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the name of a compute instance. The instance must be in the deployment preparation or running state.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: UpdateComputeInstanceName</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the name of a compute instance. The instance must be in the deployment preparation or running state.</p>
     * 
     * @param request UpdateComputeInstanceNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComputeInstanceNameResponse
     */
    public UpdateComputeInstanceNameResponse updateComputeInstanceNameWithOptions(UpdateComputeInstanceNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComputeInstanceName"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeInstanceNameResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the name of a compute instance. The instance must be in the deployment preparation or running state.</p>
     * <ul>
     * <li>API version: 2026-02-02</li>
     * <li>Action: UpdateComputeInstanceName</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the name of a compute instance. The instance must be in the deployment preparation or running state.</p>
     * 
     * @param request UpdateComputeInstanceNameRequest
     * @return UpdateComputeInstanceNameResponse
     */
    public UpdateComputeInstanceNameResponse updateComputeInstanceName(UpdateComputeInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateComputeInstanceNameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Ensure that the provided <code>InstanceId</code> and <code>JobName</code> are valid. Otherwise, an error is returned.</li>
     * <li>You cannot execute this operation if the instance is not in the running state.</li>
     * <li>Modifications are not supported if the current job is running as a debug node or undergoing changes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the remarks of a specified compute job.</p>
     * 
     * @param request UpdateComputeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComputeJobResponse
     */
    public UpdateComputeJobResponse updateComputeJobWithOptions(UpdateComputeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComputeJob"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Ensure that the provided <code>InstanceId</code> and <code>JobName</code> are valid. Otherwise, an error is returned.</li>
     * <li>You cannot execute this operation if the instance is not in the running state.</li>
     * <li>Modifications are not supported if the current job is running as a debug node or undergoing changes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the remarks of a specified compute job.</p>
     * 
     * @param request UpdateComputeJobRequest
     * @return UpdateComputeJobResponse
     */
    public UpdateComputeJobResponse updateComputeJob(UpdateComputeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateComputeJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation allows you to modify the compute unit (CU) limit and the number of reserved CUs for a specific compute job. Before calling this operation, ensure that the specified <code>InstanceId</code> and <code>JobName</code> are correct and that the instance is in the running state. Additionally, verify the validity and reasonableness of the <code>CuLimit</code> and <code>CuReserved</code> parameters to prevent request failures caused by exceeding limits or violating business logic.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the compute unit (CU) limit and the number of reserved CUs for a specified compute job.</p>
     * 
     * @param request UpdateComputeJobCuRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComputeJobCuResponse
     */
    public UpdateComputeJobCuResponse updateComputeJobCuWithOptions(UpdateComputeJobCuRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cuLimit)) {
            query.put("CuLimit", request.cuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cuReserved)) {
            query.put("CuReserved", request.cuReserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComputeJobCu"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeJobCuResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation allows you to modify the compute unit (CU) limit and the number of reserved CUs for a specific compute job. Before calling this operation, ensure that the specified <code>InstanceId</code> and <code>JobName</code> are correct and that the instance is in the running state. Additionally, verify the validity and reasonableness of the <code>CuLimit</code> and <code>CuReserved</code> parameters to prevent request failures caused by exceeding limits or violating business logic.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the compute unit (CU) limit and the number of reserved CUs for a specified compute job.</p>
     * 
     * @param request UpdateComputeJobCuRequest
     * @return UpdateComputeJobCuResponse
     */
    public UpdateComputeJobCuResponse updateComputeJobCu(UpdateComputeJobCuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateComputeJobCuWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation updates the Flink SQL draft saved for a specific compute job under a given compute instance. Make sure that the provided <code>InstanceId</code> and <code>JobName</code> are accurate, and the current status of the job supports SQL modification.</p>
     * <ul>
     * <li><strong>Precautions</strong>:<ul>
     * <li>Make sure that the target instance is in the running state.</li>
     * <li>The current job status must allow SQL modification. The job must not be undergoing debugging or modification.</li>
     * <li>The <code>DraftSql</code> parameter must contain a complete and correctly formatted Flink SQL statement.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the Flink SQL draft saved for a specified compute job.</p>
     * 
     * @param request UpdateComputeJobDraftSqlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComputeJobDraftSqlResponse
     */
    public UpdateComputeJobDraftSqlResponse updateComputeJobDraftSqlWithOptions(UpdateComputeJobDraftSqlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.draftSql)) {
            query.put("DraftSql", request.draftSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComputeJobDraftSql"),
            new TeaPair("version", "2026-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeJobDraftSqlResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation updates the Flink SQL draft saved for a specific compute job under a given compute instance. Make sure that the provided <code>InstanceId</code> and <code>JobName</code> are accurate, and the current status of the job supports SQL modification.</p>
     * <ul>
     * <li><strong>Precautions</strong>:<ul>
     * <li>Make sure that the target instance is in the running state.</li>
     * <li>The current job status must allow SQL modification. The job must not be undergoing debugging or modification.</li>
     * <li>The <code>DraftSql</code> parameter must contain a complete and correctly formatted Flink SQL statement.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the Flink SQL draft saved for a specified compute job.</p>
     * 
     * @param request UpdateComputeJobDraftSqlRequest
     * @return UpdateComputeJobDraftSqlResponse
     */
    public UpdateComputeJobDraftSqlResponse updateComputeJobDraftSql(UpdateComputeJobDraftSqlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateComputeJobDraftSqlWithOptions(request, runtime);
    }
}
