// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202;

import com.aliyun.tea.*;
import com.aliyun.alikafkastreaming20260202.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过 GET 或 POST 方法调用。</li>
     * <li>必须提供 <code>InstanceId</code>、<code>JobName</code> 和 <code>SqlContent</code> 参数，其中 <code>SqlContent</code> 是待校验的 Flink SQL 语句。</li>
     * <li>返回结果中，<code>Data.Valid</code> 字段指示 SQL 是否通过校验；若未通过，则错误详情位于 <code>Data.ErrorList</code> 中。</li>
     * <li>当前版本要求同时传入实例 ID (<code>InstanceId</code>) 和作业名称 (<code>JobName</code>) 以构建作业上下文。</li>
     * <li>接口返回成功仅表示校验流程执行完成，并不直接反映 SQL 的有效性，请检查 <code>Data.Valid</code> 字段来确定 SQL 是否有效。</li>
     * <li>错误码和异常处理请参考文档中的“错误码”部分。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>检查sql语法</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过 GET 或 POST 方法调用。</li>
     * <li>必须提供 <code>InstanceId</code>、<code>JobName</code> 和 <code>SqlContent</code> 参数，其中 <code>SqlContent</code> 是待校验的 Flink SQL 语句。</li>
     * <li>返回结果中，<code>Data.Valid</code> 字段指示 SQL 是否通过校验；若未通过，则错误详情位于 <code>Data.ErrorList</code> 中。</li>
     * <li>当前版本要求同时传入实例 ID (<code>InstanceId</code>) 和作业名称 (<code>JobName</code>) 以构建作业上下文。</li>
     * <li>接口返回成功仅表示校验流程执行完成，并不直接反映 SQL 的有效性，请检查 <code>Data.Valid</code> 字段来确定 SQL 是否有效。</li>
     * <li>错误码和异常处理请参考文档中的“错误码”部分。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>检查sql语法</p>
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
     * <p>创建一个计算实例。接口只完成购买阶段；创建成功后需调用 StartComputeInstance 完成网络配置和部署。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：CreateComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建 流计算实例</p>
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
     * <p>创建一个计算实例。接口只完成购买阶段；创建成功后需调用 StartComputeInstance 完成网络配置和部署。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：CreateComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建 流计算实例</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于在指定的运行中的计算实例上创建一个新的Flink SQL作业。</li>
     * <li>创建后的作业将处于<code>INIT</code>状态。</li>
     * <li>用户可以通过设置<code>CuLimit</code>和<code>CuReserved</code>来控制作业的资源使用情况。</li>
     * <li><code>Remark</code>字段允许用户为作业添加备注信息，便于管理和识别。</li>
     * <li>确保提供的<code>RegionId</code>、<code>InstanceId</code>以及<code>JobName</code>参数准确无误，否则可能导致请求失败。</li>
     * <li>如果尝试创建同名作业，则会返回错误提示。</li>
     * <li>计算实例必须处于运行状态才能成功创建作业。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建 JOB</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于在指定的运行中的计算实例上创建一个新的Flink SQL作业。</li>
     * <li>创建后的作业将处于<code>INIT</code>状态。</li>
     * <li>用户可以通过设置<code>CuLimit</code>和<code>CuReserved</code>来控制作业的资源使用情况。</li>
     * <li><code>Remark</code>字段允许用户为作业添加备注信息，便于管理和识别。</li>
     * <li>确保提供的<code>RegionId</code>、<code>InstanceId</code>以及<code>JobName</code>参数准确无误，否则可能导致请求失败。</li>
     * <li>如果尝试创建同名作业，则会返回错误提示。</li>
     * <li>计算实例必须处于运行状态才能成功创建作业。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建 JOB</p>
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
     * <p>删除处于待部署、已停止或已释放状态的计算实例。</p>
     * <ul>
     * <li>API版本：2026-02-02</li>
     * <li>Action：DeleteComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除实例</p>
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
     * <p>删除处于待部署、已停止或已释放状态的计算实例。</p>
     * <ul>
     * <li>API版本：2026-02-02</li>
     * <li>Action：DeleteComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除实例</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于删除一个特定的计算作业。</li>
     * <li>成功调用此接口仅表示删除请求已被系统接受，并非立即完成删除操作。</li>
     * <li>确保提供的<code>RegionId</code>、<code>InstanceId</code>以及<code>JobName</code>参数准确无误，否则可能导致请求失败。</li>
     * <li>如果计算实例或作业处于不允许删除的状态（例如：非运行状态），则会返回相应的错误信息。</li>
     * <li>删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除 JOB</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于删除一个特定的计算作业。</li>
     * <li>成功调用此接口仅表示删除请求已被系统接受，并非立即完成删除操作。</li>
     * <li>确保提供的<code>RegionId</code>、<code>InstanceId</code>以及<code>JobName</code>参数准确无误，否则可能导致请求失败。</li>
     * <li>如果计算实例或作业处于不允许删除的状态（例如：非运行状态），则会返回相应的错误信息。</li>
     * <li>删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除 JOB</p>
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
     * <p>查询单个实例</p>
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
     * <p>查询单个实例</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于查询指定计算作业的详情。</li>
     * <li>支持使用 GET 或 POST 方法进行请求。</li>
     * <li>所有时间字段以 Unix 时间戳形式返回，单位为毫秒。</li>
     * <li>必须提供 <code>RegionId</code>、<code>InstanceId</code> 和 <code>JobName</code> 参数。</li>
     * <li>授权操作为 <code>alikafkastreaming:GetComputeJob</code>，访问级别为读取（Read）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询 JOB 详情</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于查询指定计算作业的详情。</li>
     * <li>支持使用 GET 或 POST 方法进行请求。</li>
     * <li>所有时间字段以 Unix 时间戳形式返回，单位为毫秒。</li>
     * <li>必须提供 <code>RegionId</code>、<code>InstanceId</code> 和 <code>JobName</code> 参数。</li>
     * <li>授权操作为 <code>alikafkastreaming:GetComputeJob</code>，访问级别为读取（Read）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询 JOB 详情</p>
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
     * <p>查询实例列表（分页）</p>
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
     * <p>查询实例列表（分页）</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过 <code>MaxResults</code> 和 <code>NextToken</code> 参数进行游标分页查询。</li>
     * <li>首次请求时不需要传递 <code>NextToken</code>，后续请求需使用上一次响应中返回的 <code>NextToken</code> 值。</li>
     * <li>支持按作业名称或备注搜索，并可选择不同的排序字段和方向。</li>
     * <li>返回的时间字段均为 Unix 时间戳（单位：毫秒）。</li>
     * <li>授权操作为 <code>alikafkastreaming:ListComputeJobs</code>，访问级别为列出（List），适用于全部资源。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>分页查询 JOB 列表</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过 <code>MaxResults</code> 和 <code>NextToken</code> 参数进行游标分页查询。</li>
     * <li>首次请求时不需要传递 <code>NextToken</code>，后续请求需使用上一次响应中返回的 <code>NextToken</code> 值。</li>
     * <li>支持按作业名称或备注搜索，并可选择不同的排序字段和方向。</li>
     * <li>返回的时间字段均为 Unix 时间戳（单位：毫秒）。</li>
     * <li>授权操作为 <code>alikafkastreaming:ListComputeJobs</code>，访问级别为列出（List），适用于全部资源。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>分页查询 JOB 列表</p>
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
     * <p>重新启用一个已停止的后付费计算实例。接口返回成功表示启用请求已受理。</p>
     * <ul>
     * <li>API版本：2026-02-02</li>
     * <li>Action：ReopenComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>重新启动后付费实例</p>
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
     * <p>重新启用一个已停止的后付费计算实例。接口返回成功表示启用请求已受理。</p>
     * <ul>
     * <li>API版本：2026-02-02</li>
     * <li>Action：ReopenComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>重新启动后付费实例</p>
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
     * <p>为处于待部署状态的计算实例配置网络并发起部署。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：StartComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>部署实例</p>
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
     * <p>为处于待部署状态的计算实例配置网络并发起部署。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：StartComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>部署实例</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>RecoveryMode</code> 支持两种模式：<code>savepoint</code> 和 <code>stateless</code>。如果选择 <code>savepoint</code> 模式但没有可用的 savepoint，则会返回错误。</li>
     * <li><code>CuLimit</code> 和 <code>CuReserved</code> 参数分别用来设定作业的 CU 上限和预留 CU 数量，支持整数或小数形式输入。</li>
     * <li>确保提供的 <code>RegionId</code>, <code>InstanceId</code>, 和 <code>JobName</code> 参数值正确且存在，否则将导致请求失败。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建 JOB</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>RecoveryMode</code> 支持两种模式：<code>savepoint</code> 和 <code>stateless</code>。如果选择 <code>savepoint</code> 模式但没有可用的 savepoint，则会返回错误。</li>
     * <li><code>CuLimit</code> 和 <code>CuReserved</code> 参数分别用来设定作业的 CU 上限和预留 CU 数量，支持整数或小数形式输入。</li>
     * <li>确保提供的 <code>RegionId</code>, <code>InstanceId</code>, 和 <code>JobName</code> 参数值正确且存在，否则将导致请求失败。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建 JOB</p>
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
     * <p>停止一个正在运行的后付费计算实例。接口返回成功表示停止请求已受理。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：StopComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>停用/释放后付费实例</p>
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
     * <p>停止一个正在运行的后付费计算实例。接口返回成功表示停止请求已受理。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：StopComputeInstance</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>停用/释放后付费实例</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于停止指定的计算作业生产或 Debug 运行实例。</li>
     * <li>接口返回成功表示停止请求已被受理，但并不意味着作业立即停止。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>停止 JOB</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于停止指定的计算作业生产或 Debug 运行实例。</li>
     * <li>接口返回成功表示停止请求已被受理，但并不意味着作业立即停止。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>停止 JOB</p>
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
     * <p>修改计算实例名称。实例需处于部署准备阶段或运行中状态。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：UpdateComputeInstanceName</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新实例名称</p>
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
     * <p>修改计算实例名称。实例需处于部署准备阶段或运行中状态。</p>
     * <ul>
     * <li>API 版本：2026-02-02</li>
     * <li>Action：UpdateComputeInstanceName</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新实例名称</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>确保提供的 <code>InstanceId</code> 和 <code>JobName</code> 是有效的，否则将返回错误。</li>
     * <li>如果实例状态不在运行中，则不允许执行此操作。</li>
     * <li>当前作业状态如果为调试任务正在运行或变更中，则不支持修改。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新 JOB</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>确保提供的 <code>InstanceId</code> 和 <code>JobName</code> 是有效的，否则将返回错误。</li>
     * <li>如果实例状态不在运行中，则不允许执行此操作。</li>
     * <li>当前作业状态如果为调试任务正在运行或变更中，则不支持修改。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新 JOB</p>
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
     * <h2>请求说明</h2>
     * <p>本API允许用户修改特定计算作业的计算单元（CU）上限和预留CU数量。在调用此接口前，请确保提供的<code>InstanceId</code>和<code>JobName</code>正确无误，并且实例处于运行状态。此外，注意检查<code>CuLimit</code>与<code>CuReserved</code>参数的有效性和合理性，避免因超出限制或不符合业务逻辑导致请求失败。</p>
     * 
     * <b>summary</b> : 
     * <p>更新 JOB 的 CU 配额</p>
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
     * <h2>请求说明</h2>
     * <p>本API允许用户修改特定计算作业的计算单元（CU）上限和预留CU数量。在调用此接口前，请确保提供的<code>InstanceId</code>和<code>JobName</code>正确无误，并且实例处于运行状态。此外，注意检查<code>CuLimit</code>与<code>CuReserved</code>参数的有效性和合理性，避免因超出限制或不符合业务逻辑导致请求失败。</p>
     * 
     * <b>summary</b> : 
     * <p>更新 JOB 的 CU 配额</p>
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
     * <h2>请求说明</h2>
     * <p>本接口用于更新特定计算实例下的某个计算作业所保存的Flink SQL草稿内容。请确保提供的<code>InstanceId</code>和<code>JobName</code>准确无误，并且该作业当前状态支持进行SQL修改操作。</p>
     * <ul>
     * <li><strong>注意事项</strong>：<ul>
     * <li>确保目标实例处于运行状态。</li>
     * <li>当前作业状态需允许修改SQL，即作业不应处于调试或变更过程中。</li>
     * <li><code>DraftSql</code>参数应包含完整的、格式正确的Flink SQL语句。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新 JOB 的 SQL</p>
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
     * <h2>请求说明</h2>
     * <p>本接口用于更新特定计算实例下的某个计算作业所保存的Flink SQL草稿内容。请确保提供的<code>InstanceId</code>和<code>JobName</code>准确无误，并且该作业当前状态支持进行SQL修改操作。</p>
     * <ul>
     * <li><strong>注意事项</strong>：<ul>
     * <li>确保目标实例处于运行状态。</li>
     * <li>当前作业状态需允许修改SQL，即作业不应处于调试或变更过程中。</li>
     * <li><code>DraftSql</code>参数应包含完整的、格式正确的Flink SQL语句。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新 JOB 的 SQL</p>
     * 
     * @param request UpdateComputeJobDraftSqlRequest
     * @return UpdateComputeJobDraftSqlResponse
     */
    public UpdateComputeJobDraftSqlResponse updateComputeJobDraftSql(UpdateComputeJobDraftSqlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateComputeJobDraftSqlWithOptions(request, runtime);
    }
}
