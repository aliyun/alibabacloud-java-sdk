// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101;

import com.aliyun.tea.*;
import com.aliyun.aisc20260101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-zhangjiakou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-nanjing", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-beijing", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "aisc.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aisc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates an attack target (agent or model) and saves its connection configuration for subsequent connectivity tests and scan tasks.
     * This is a synchronous call. Upon success, the system-generated TargetId is returned in Data. You can use this TargetId as a parameter in subsequent calls such as TestConnectivity and scan task creation.
     * Metric description:</p>
     * <ul>
     * <li>When ConnectionMethod is set to enterprise_relay (access through a corporate internal network agent), the values of Endpoint and ModelName are ignored. The platform uses fixed internal network values. The actual target endpoint and credentials are held by the corporate internal network agent.</li>
     * <li>After ApiKey is submitted, it is encrypted and stored. Subsequent queries do not return the plaintext value.</li>
     * <li>ConnectionConfig is a JSON character string in JSON format that specifies advanced connection settings. For common provider templates, refer to the metric description of this parameter.
     * After the target is created, its initial connectivity status is verified. You can call TestConnectivity at any time to re-verify.
     * Internal network access (enterprise_relay) workflow:</li>
     * <li>After the target is created, invoke GenerateRelayPollerScript to obtain an installation script (Linux only) and run it on a machine within the corporate internal network. The actual target endpoint and credentials are entered interactively during installation. The platform does not retain them.</li>
     * <li>After installation, the poller automatically registers and enters a polling loop. No manual registration or polling invocations are required.</li>
     * <li>After invoking TestConnectivity to authenticate end-to-end connectivity, you can use CreateTargetScanTask to initiate a scan.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an AI Red Teaming scan target (agent or model) and saves its connection configuration for subsequent connectivity tests and scan tasks.</p>
     * 
     * @param request CreateAttackTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAttackTargetResponse
     */
    public CreateAttackTargetResponse createAttackTargetWithOptions(CreateAttackTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionConfig)) {
            query.put("ConnectionConfig", request.connectionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionMethod)) {
            query.put("ConnectionMethod", request.connectionMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetName)) {
            query.put("TargetName", request.targetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAttackTarget"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAttackTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an attack target (agent or model) and saves its connection configuration for subsequent connectivity tests and scan tasks.
     * This is a synchronous call. Upon success, the system-generated TargetId is returned in Data. You can use this TargetId as a parameter in subsequent calls such as TestConnectivity and scan task creation.
     * Metric description:</p>
     * <ul>
     * <li>When ConnectionMethod is set to enterprise_relay (access through a corporate internal network agent), the values of Endpoint and ModelName are ignored. The platform uses fixed internal network values. The actual target endpoint and credentials are held by the corporate internal network agent.</li>
     * <li>After ApiKey is submitted, it is encrypted and stored. Subsequent queries do not return the plaintext value.</li>
     * <li>ConnectionConfig is a JSON character string in JSON format that specifies advanced connection settings. For common provider templates, refer to the metric description of this parameter.
     * After the target is created, its initial connectivity status is verified. You can call TestConnectivity at any time to re-verify.
     * Internal network access (enterprise_relay) workflow:</li>
     * <li>After the target is created, invoke GenerateRelayPollerScript to obtain an installation script (Linux only) and run it on a machine within the corporate internal network. The actual target endpoint and credentials are entered interactively during installation. The platform does not retain them.</li>
     * <li>After installation, the poller automatically registers and enters a polling loop. No manual registration or polling invocations are required.</li>
     * <li>After invoking TestConnectivity to authenticate end-to-end connectivity, you can use CreateTargetScanTask to initiate a scan.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an AI Red Teaming scan target (agent or model) and saves its connection configuration for subsequent connectivity tests and scan tasks.</p>
     * 
     * @param request CreateAttackTargetRequest
     * @return CreateAttackTargetResponse
     */
    public CreateAttackTargetResponse createAttackTarget(CreateAttackTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAttackTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates batch detection for user-defined skills.</p>
     * 
     * @param request CreateSkillFileCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillFileCheckResponse
     */
    public CreateSkillFileCheckResponse createSkillFileCheckWithOptions(CreateSkillFileCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            query.put("Files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillFileCheck"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillFileCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates batch detection for user-defined skills.</p>
     * 
     * @param request CreateSkillFileCheckRequest
     * @return CreateSkillFileCheckResponse
     */
    public CreateSkillFileCheckResponse createSkillFileCheck(CreateSkillFileCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillFileCheckWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/asc/user-guide/ai-red-teaming#aefbf9b5b4noh">pricing</a> of AI Red Teaming.</em>*
     * Initiates a security scan (AI Red Teaming detection) task against a specified scan target.
     * Before you begin:</p>
     * <ul>
     * <li>The account must have a normal subscription status. Otherwise, a 403 error is returned.</li>
     * <li>The TargetId must exist and belong to the current tenant.</li>
     * <li>The connectivity verification status of the target must be verified. You can call TestConnectivity to verify the target first. Otherwise, a 400 error is returned.</li>
     * <li>Available attack samples must exist within the current scan scope. Otherwise, a 400 error is returned.
     * Execution mode:</li>
     * <li>The call synchronously returns a TaskId. The initial task status is PREPARING. Sample preparation and scan execution are performed asynchronously. You can call ListScanTasksByTarget to query the task status and progress.
     * Sample selection:</li>
     * <li>The sample scope is determined based on the target type (agent/model) plus general-purpose samples. SampleLevel determines the detection intensity and derives the technique level. Lang is used to filter samples by language.</li>
     * <li>If no sample intent is specified, the system automatically derives all available intents based on the scope described above.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a security scan task against a scan target that has passed connectivity verification. After the task is created, it is asynchronously prepared and executed.</p>
     * 
     * @param request CreateTargetScanTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTargetScanTaskResponse
     */
    public CreateTargetScanTaskResponse createTargetScanTaskWithOptions(CreateTargetScanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleLevel)) {
            query.put("SampleLevel", request.sampleLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTargetScanTask"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTargetScanTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/asc/user-guide/ai-red-teaming#aefbf9b5b4noh">pricing</a> of AI Red Teaming.</em>*
     * Initiates a security scan (AI Red Teaming detection) task against a specified scan target.
     * Before you begin:</p>
     * <ul>
     * <li>The account must have a normal subscription status. Otherwise, a 403 error is returned.</li>
     * <li>The TargetId must exist and belong to the current tenant.</li>
     * <li>The connectivity verification status of the target must be verified. You can call TestConnectivity to verify the target first. Otherwise, a 400 error is returned.</li>
     * <li>Available attack samples must exist within the current scan scope. Otherwise, a 400 error is returned.
     * Execution mode:</li>
     * <li>The call synchronously returns a TaskId. The initial task status is PREPARING. Sample preparation and scan execution are performed asynchronously. You can call ListScanTasksByTarget to query the task status and progress.
     * Sample selection:</li>
     * <li>The sample scope is determined based on the target type (agent/model) plus general-purpose samples. SampleLevel determines the detection intensity and derives the technique level. Lang is used to filter samples by language.</li>
     * <li>If no sample intent is specified, the system automatically derives all available intents based on the scope described above.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a security scan task against a scan target that has passed connectivity verification. After the task is created, it is asynchronously prepared and executed.</p>
     * 
     * @param request CreateTargetScanTaskRequest
     * @return CreateTargetScanTaskResponse
     */
    public CreateTargetScanTaskResponse createTargetScanTask(CreateTargetScanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTargetScanTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified scan target by TargetId. The target is physically deleted.</p>
     * <ul>
     * <li>You can delete only targets that belong to the current tenant. If the target does not exist or belongs to another tenant, a 400 error is returned. This prevents exposing whether the resource exists.</li>
     * <li>Physical deletion: The target cannot be recovered after deletion. Confirm before you proceed.</li>
     * <li>This operation deletes only the target record. It does not stop scan tasks that are in progress for the target or delete historical scan task records. To stop or clean up tasks, call StopScannerTask or DeleteScannerTask first.</li>
     * <li>After deletion, the connection configurations of the target, including encrypted credentials and connectivity verification results, are also removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified scan target by TargetId in AI Red Teaming. The target is physically deleted and cannot be recovered. This operation does not stop scan tasks that are in progress.</p>
     * 
     * @param request DeleteAttackTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAttackTargetResponse
     */
    public DeleteAttackTargetResponse deleteAttackTargetWithOptions(DeleteAttackTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAttackTarget"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAttackTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified scan target by TargetId. The target is physically deleted.</p>
     * <ul>
     * <li>You can delete only targets that belong to the current tenant. If the target does not exist or belongs to another tenant, a 400 error is returned. This prevents exposing whether the resource exists.</li>
     * <li>Physical deletion: The target cannot be recovered after deletion. Confirm before you proceed.</li>
     * <li>This operation deletes only the target record. It does not stop scan tasks that are in progress for the target or delete historical scan task records. To stop or clean up tasks, call StopScannerTask or DeleteScannerTask first.</li>
     * <li>After deletion, the connection configurations of the target, including encrypted credentials and connectivity verification results, are also removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified scan target by TargetId in AI Red Teaming. The target is physically deleted and cannot be recovered. This operation does not stop scan tasks that are in progress.</p>
     * 
     * @param request DeleteAttackTargetRequest
     * @return DeleteAttackTargetResponse
     */
    public DeleteAttackTargetResponse deleteAttackTarget(DeleteAttackTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAttackTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Physically deletes a specified scan task by ScannerTaskId.</p>
     * <ul>
     * <li>Only tasks that belong to the current tenant can be deleted. If the task does not exist or belongs to another tenant, a 400 error is returned without exposing whether the resource exists.</li>
     * <li>If the task is in progress (sample preparation, waiting, processing, or report generation), the task is automatically canceled before deletion. A cancellation failure does not block the deletion.</li>
     * <li>Physical deletion: After deletion, the task record and its status and progress information cannot be queried or recovered. Confirm before you delete.</li>
     * <li>Deleting a task record does not affect the scan target itself.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Physically deletes a specified scan task by ScannerTaskId in AI Red Teaming.</p>
     * 
     * @param request DeleteScannerTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScannerTaskResponse
     */
    public DeleteScannerTaskResponse deleteScannerTaskWithOptions(DeleteScannerTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scannerTaskId)) {
            query.put("ScannerTaskId", request.scannerTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScannerTask"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScannerTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Physically deletes a specified scan task by ScannerTaskId.</p>
     * <ul>
     * <li>Only tasks that belong to the current tenant can be deleted. If the task does not exist or belongs to another tenant, a 400 error is returned without exposing whether the resource exists.</li>
     * <li>If the task is in progress (sample preparation, waiting, processing, or report generation), the task is automatically canceled before deletion. A cancellation failure does not block the deletion.</li>
     * <li>Physical deletion: After deletion, the task record and its status and progress information cannot be queried or recovered. Confirm before you delete.</li>
     * <li>Deleting a task record does not affect the scan target itself.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Physically deletes a specified scan task by ScannerTaskId in AI Red Teaming.</p>
     * 
     * @param request DeleteScannerTaskRequest
     * @return DeleteScannerTaskResponse
     */
    public DeleteScannerTaskResponse deleteScannerTask(DeleteScannerTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScannerTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Generates an installation script for the internal network agent (relay-poller) for a specified scan target.</p>
     * <ul>
     * <li>The target must use the enterprise_relay connection method (see CreateAttackTarget). Otherwise, HTTP status code 400 is returned. If the target does not exist or belongs to another tenant, HTTP status code 400 is returned without exposing whether the resource exists.</li>
     * <li>Only Linux is supported for the platform. The Platform parameter uses the &quot;operating system-architecture&quot; format and accepts only linux-amd64 and linux-arm64. Compatible architecture values include amd64, x86_64, x86, arm64, and aarch64. If only the architecture is specified, the operating system defaults to linux. Other operating systems such as macOS and Windows return HTTP status code 400. If this parameter is not specified, the default value is linux-amd64.</li>
     * <li>The script contains a one-time access code. Each call issues a new access code, and the previous code automatically expires. Re-downloading the script generates a new access code. Use the latest generated script for installation.</li>
     * <li>The script contains a temporary download link (a signed link valid for 1 hour) and a checksum for the poller binary. The binary is available only for Linux in both architectures.</li>
     * <li>The script does not contain the actual endpoint or credentials of the target. The installer interactively enters these values when running the script. The platform does not store them.</li>
     * <li>After installation, the poller automatically completes registration and enters a polling cycle. The registration and polling operations are automatically called by the script and do not require manual invocation. You can call TestConnectivity to verify end-to-end connectivity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a one-time installation script for a scan target of the enterprise_relay type in AI Red Teaming. Only Linux platforms are supported. The script contains a one-time access code.</p>
     * 
     * @param request GenerateRelayPollerScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateRelayPollerScriptResponse
     */
    public GenerateRelayPollerScriptResponse generateRelayPollerScriptWithOptions(GenerateRelayPollerScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateRelayPollerScript"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateRelayPollerScriptResponse());
    }

    /**
     * <b>description</b> :
     * <p>Generates an installation script for the internal network agent (relay-poller) for a specified scan target.</p>
     * <ul>
     * <li>The target must use the enterprise_relay connection method (see CreateAttackTarget). Otherwise, HTTP status code 400 is returned. If the target does not exist or belongs to another tenant, HTTP status code 400 is returned without exposing whether the resource exists.</li>
     * <li>Only Linux is supported for the platform. The Platform parameter uses the &quot;operating system-architecture&quot; format and accepts only linux-amd64 and linux-arm64. Compatible architecture values include amd64, x86_64, x86, arm64, and aarch64. If only the architecture is specified, the operating system defaults to linux. Other operating systems such as macOS and Windows return HTTP status code 400. If this parameter is not specified, the default value is linux-amd64.</li>
     * <li>The script contains a one-time access code. Each call issues a new access code, and the previous code automatically expires. Re-downloading the script generates a new access code. Use the latest generated script for installation.</li>
     * <li>The script contains a temporary download link (a signed link valid for 1 hour) and a checksum for the poller binary. The binary is available only for Linux in both architectures.</li>
     * <li>The script does not contain the actual endpoint or credentials of the target. The installer interactively enters these values when running the script. The platform does not store them.</li>
     * <li>After installation, the poller automatically completes registration and enters a polling cycle. The registration and polling operations are automatically called by the script and do not require manual invocation. You can call TestConnectivity to verify end-to-end connectivity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a one-time installation script for a scan target of the enterprise_relay type in AI Red Teaming. Only Linux platforms are supported. The script contains a one-time access code.</p>
     * 
     * @param request GenerateRelayPollerScriptRequest
     * @return GenerateRelayPollerScriptResponse
     */
    public GenerateRelayPollerScriptResponse generateRelayPollerScript(GenerateRelayPollerScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateRelayPollerScriptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a scan target by TargetId.</p>
     * <ul>
     * <li>Only targets that belong to the current tenant can be queried. If the target does not exist or belongs to another tenant, a 400 error is returned to avoid exposing whether the resource exists.</li>
     * <li>The response includes basic target information, advanced connection configuration (ConnectionConfig), and scan task configuration (ScanTaskConfig).</li>
     * <li>The following six aggregate fields are not populated by this operation and return empty values: cumulative scan count (ScanCount), last scan status (LastScanStatus), risk level (RiskLevel), first scan time (FirstScanTime), last scan time (LastScanTime), and last scan failure reason (LastScanFailMessage). Query these fields by calling ListAttackTargets or ListScanTasksByTarget.</li>
     * <li>The response does not include sensitive credentials such as ApiKey in plaintext.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a scan target by TargetId for AI Red Teaming, including connection configuration and scan task configuration.</p>
     * 
     * @param request GetAttackTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAttackTargetResponse
     */
    public GetAttackTargetResponse getAttackTargetWithOptions(GetAttackTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAttackTarget"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAttackTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a scan target by TargetId.</p>
     * <ul>
     * <li>Only targets that belong to the current tenant can be queried. If the target does not exist or belongs to another tenant, a 400 error is returned to avoid exposing whether the resource exists.</li>
     * <li>The response includes basic target information, advanced connection configuration (ConnectionConfig), and scan task configuration (ScanTaskConfig).</li>
     * <li>The following six aggregate fields are not populated by this operation and return empty values: cumulative scan count (ScanCount), last scan status (LastScanStatus), risk level (RiskLevel), first scan time (FirstScanTime), last scan time (LastScanTime), and last scan failure reason (LastScanFailMessage). Query these fields by calling ListAttackTargets or ListScanTasksByTarget.</li>
     * <li>The response does not include sensitive credentials such as ApiKey in plaintext.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a scan target by TargetId for AI Red Teaming, including connection configuration and scan task configuration.</p>
     * 
     * @param request GetAttackTargetRequest
     * @return GetAttackTargetResponse
     */
    public GetAttackTargetResponse getAttackTarget(GetAttackTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAttackTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary download URL for the attack hit data (hits.csv) of a specified scan task.</p>
     * <ul>
     * <li>ScannerTaskId is required in practice. An empty value returns HTTP status code 400.</li>
     * <li>You can query only tasks that belong to the current tenant. If the task does not exist or belongs to another tenant, HTTP status code 400 is returned uniformly to avoid exposing whether the resource exists.</li>
     * <li>The download URL is a signed temporary URL of Object Storage Service (OSS) that is valid for 2 hours (7,200 seconds). After the URL expires, call this operation again to obtain a new URL.</li>
     * <li>If the attack hit data has not been generated (for existing tasks or when the agent execution mode does not produce hit data), the download URL in the response is an empty string. No error is returned.</li>
     * <li>This operation is a read-only action (with the Get prefix). A RAM user with read-only permissions can call this operation. The behavior is consistent with the deprecated GenerateScannerTaskHitDataUrl operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a temporary download URL for the attack hit data (hits.csv) of a specified scan task in AI Red Teaming. The URL is valid for 2 hours. An empty string is returned if the data has not been generated.</p>
     * 
     * @param request GetScannerTaskHitDataUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScannerTaskHitDataUrlResponse
     */
    public GetScannerTaskHitDataUrlResponse getScannerTaskHitDataUrlWithOptions(GetScannerTaskHitDataUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scannerTaskId)) {
            query.put("ScannerTaskId", request.scannerTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScannerTaskHitDataUrl"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScannerTaskHitDataUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary download URL for the attack hit data (hits.csv) of a specified scan task.</p>
     * <ul>
     * <li>ScannerTaskId is required in practice. An empty value returns HTTP status code 400.</li>
     * <li>You can query only tasks that belong to the current tenant. If the task does not exist or belongs to another tenant, HTTP status code 400 is returned uniformly to avoid exposing whether the resource exists.</li>
     * <li>The download URL is a signed temporary URL of Object Storage Service (OSS) that is valid for 2 hours (7,200 seconds). After the URL expires, call this operation again to obtain a new URL.</li>
     * <li>If the attack hit data has not been generated (for existing tasks or when the agent execution mode does not produce hit data), the download URL in the response is an empty string. No error is returned.</li>
     * <li>This operation is a read-only action (with the Get prefix). A RAM user with read-only permissions can call this operation. The behavior is consistent with the deprecated GenerateScannerTaskHitDataUrl operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a temporary download URL for the attack hit data (hits.csv) of a specified scan task in AI Red Teaming. The URL is valid for 2 hours. An empty string is returned if the data has not been generated.</p>
     * 
     * @param request GetScannerTaskHitDataUrlRequest
     * @return GetScannerTaskHitDataUrlResponse
     */
    public GetScannerTaskHitDataUrlResponse getScannerTaskHitDataUrl(GetScannerTaskHitDataUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScannerTaskHitDataUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary download URL for the HTML result report of a specified scan task.</p>
     * <ul>
     * <li>You can only query tasks that belong to the current tenant. If the task does not exist or belongs to another tenant, a 400 error is returned to avoid exposing whether the resource exists.</li>
     * <li>The download URL is a signed temporary URL from object storage, valid for 2 hours (7,200 seconds). After the URL expires, call this operation again to obtain a new URL.</li>
     * <li>If the task result report has not been generated (the task is not complete or the report has not been produced), the download URL in the response is an empty string and no error is returned. Call this operation after the task status changes to completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a temporary download URL for the HTML result report of an AI Red Teaming scan task. The URL is valid for 2 hours. An empty string is returned if the report has not been generated.</p>
     * 
     * @param request GetScannerTaskResultHtmlUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScannerTaskResultHtmlUrlResponse
     */
    public GetScannerTaskResultHtmlUrlResponse getScannerTaskResultHtmlUrlWithOptions(GetScannerTaskResultHtmlUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scannerTaskId)) {
            query.put("ScannerTaskId", request.scannerTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScannerTaskResultHtmlUrl"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScannerTaskResultHtmlUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary download URL for the HTML result report of a specified scan task.</p>
     * <ul>
     * <li>You can only query tasks that belong to the current tenant. If the task does not exist or belongs to another tenant, a 400 error is returned to avoid exposing whether the resource exists.</li>
     * <li>The download URL is a signed temporary URL from object storage, valid for 2 hours (7,200 seconds). After the URL expires, call this operation again to obtain a new URL.</li>
     * <li>If the task result report has not been generated (the task is not complete or the report has not been produced), the download URL in the response is an empty string and no error is returned. Call this operation after the task status changes to completed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a temporary download URL for the HTML result report of an AI Red Teaming scan task. The URL is valid for 2 hours. An empty string is returned if the report has not been generated.</p>
     * 
     * @param request GetScannerTaskResultHtmlUrlRequest
     * @return GetScannerTaskResultHtmlUrlResponse
     */
    public GetScannerTaskResultHtmlUrlResponse getScannerTaskResultHtmlUrl(GetScannerTaskResultHtmlUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScannerTaskResultHtmlUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of agent risk events.</p>
     * 
     * @param request ListAIAgentEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAIAgentEventResponse
     */
    public ListAIAgentEventResponse listAIAgentEventWithOptions(ListAIAgentEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetName)) {
            query.put("AssetName", request.assetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetType)) {
            query.put("AssetType", request.assetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infraInstanceId)) {
            query.put("InfraInstanceId", request.infraInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infraName)) {
            query.put("InfraName", request.infraName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infraRegionId)) {
            query.put("InfraRegionId", request.infraRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDirectoryAccountId)) {
            query.put("ResourceDirectoryAccountId", request.resourceDirectoryAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskName)) {
            query.put("RiskName", request.riskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            query.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAIAgentEvent"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAIAgentEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of agent risk events.</p>
     * 
     * @param request ListAIAgentEventRequest
     * @return ListAIAgentEventResponse
     */
    public ListAIAgentEventResponse listAIAgentEvent(ListAIAgentEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIAgentEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of scan targets for AI Red Teaming. This operation supports multi-dimensional filtering and sorting.</p>
     * 
     * @param request ListAttackTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAttackTargetsResponse
     */
    public ListAttackTargetsResponse listAttackTargetsWithOptions(ListAttackTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firstScanTimeEnd)) {
            query.put("FirstScanTimeEnd", request.firstScanTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstScanTimeStart)) {
            query.put("FirstScanTimeStart", request.firstScanTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastScanStatus)) {
            query.put("LastScanStatus", request.lastScanStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastScanTimeEnd)) {
            query.put("LastScanTimeEnd", request.lastScanTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastScanTimeStart)) {
            query.put("LastScanTimeStart", request.lastScanTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetName)) {
            query.put("TargetName", request.targetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAttackTargets"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAttackTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of scan targets for AI Red Teaming. This operation supports multi-dimensional filtering and sorting.</p>
     * 
     * @param request ListAttackTargetsRequest
     * @return ListAttackTargetsResponse
     */
    public ListAttackTargetsResponse listAttackTargets(ListAttackTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAttackTargetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query of the scan task list under a specified scan target. Only tasks belonging to targets owned by the current tenant are returned.
     * Query scope and sorting:</p>
     * <ul>
     * <li>Only tasks created within the last 366 days are returned.</li>
     * <li>Results are sorted by creation time in descending order.</li>
     * <li>TaskStatus filters by task status. ScanType filters by scan mode. The scan mode is stored in the task execute parameters. Historical tasks without a recorded scan mode are treated as attack.
     * Paged query rules:</li>
     * <li>PageNumber starts from 1. Values less than 1 are normalized to 1.</li>
     * <li>PageSize defaults to 10, with a maximum of 100 per page. Values greater than 100 are clamped to 100. Values less than 1 return HTTP status code 400.</li>
     * <li>The PageNumber and PageSize values in the response are the normalization values that actually take effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of scan tasks under a specified scan target for AI Red Teaming. Supports filtering by detection intensity, task status, and scan mode.</p>
     * 
     * @param request ListScanTasksByTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScanTasksByTargetResponse
     */
    public ListScanTasksByTargetResponse listScanTasksByTargetWithOptions(ListScanTasksByTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleLevel)) {
            query.put("SampleLevel", request.sampleLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanType)) {
            query.put("ScanType", request.scanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScanTasksByTarget"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScanTasksByTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query of the scan task list under a specified scan target. Only tasks belonging to targets owned by the current tenant are returned.
     * Query scope and sorting:</p>
     * <ul>
     * <li>Only tasks created within the last 366 days are returned.</li>
     * <li>Results are sorted by creation time in descending order.</li>
     * <li>TaskStatus filters by task status. ScanType filters by scan mode. The scan mode is stored in the task execute parameters. Historical tasks without a recorded scan mode are treated as attack.
     * Paged query rules:</li>
     * <li>PageNumber starts from 1. Values less than 1 are normalized to 1.</li>
     * <li>PageSize defaults to 10, with a maximum of 100 per page. Values greater than 100 are clamped to 100. Values less than 1 return HTTP status code 400.</li>
     * <li>The PageNumber and PageSize values in the response are the normalization values that actually take effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query of scan tasks under a specified scan target for AI Red Teaming. Supports filtering by detection intensity, task status, and scan mode.</p>
     * 
     * @param request ListScanTasksByTargetRequest
     * @return ListScanTasksByTargetResponse
     */
    public ListScanTasksByTargetResponse listScanTasksByTarget(ListScanTasksByTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScanTasksByTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get subtask information.</p>
     * 
     * @param request ListSubTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubTasksResponse
     */
    public ListSubTasksResponse listSubTasksWithOptions(ListSubTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootTaskId)) {
            query.put("RootTaskId", request.rootTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubTasks"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get subtask information.</p>
     * 
     * @param request ListSubTasksRequest
     * @return ListSubTasksResponse
     */
    public ListSubTasksResponse listSubTasks(ListSubTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Stops (cancels) the scan task specified by ScannerTaskId.</p>
     * <ul>
     * <li>You can only operate on tasks that belong to the current tenant. If the task does not exist or belongs to another tenant, a 400 error is returned without exposing whether the resource exists.</li>
     * <li>Only tasks in an in-progress state (sample preparation, waiting, processing, or report generation) are actually canceled. The task status is set to canceled, the end time is recorded, and the underlying execution job is stopped asynchronously.</li>
     * <li>Idempotent: If the task is already in a desired state (completed, failed, timed out, or canceled), the call returns success without modifying the task.</li>
     * <li>The underlying execution job is stopped asynchronously. A failure to stop the job does not affect the cancellation result of the task itself.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops (cancels) an in-progress scan task for AI Red Teaming. Calling this operation on a task that is already in a desired state is idempotent and performs no action.</p>
     * 
     * @param request StopScannerTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopScannerTaskResponse
     */
    public StopScannerTaskResponse stopScannerTaskWithOptions(StopScannerTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scannerTaskId)) {
            query.put("ScannerTaskId", request.scannerTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopScannerTask"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopScannerTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Stops (cancels) the scan task specified by ScannerTaskId.</p>
     * <ul>
     * <li>You can only operate on tasks that belong to the current tenant. If the task does not exist or belongs to another tenant, a 400 error is returned without exposing whether the resource exists.</li>
     * <li>Only tasks in an in-progress state (sample preparation, waiting, processing, or report generation) are actually canceled. The task status is set to canceled, the end time is recorded, and the underlying execution job is stopped asynchronously.</li>
     * <li>Idempotent: If the task is already in a desired state (completed, failed, timed out, or canceled), the call returns success without modifying the task.</li>
     * <li>The underlying execution job is stopped asynchronously. A failure to stop the job does not affect the cancellation result of the task itself.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops (cancels) an in-progress scan task for AI Red Teaming. Calling this operation on a task that is already in a desired state is idempotent and performs no action.</p>
     * 
     * @param request StopScannerTaskRequest
     * @return StopScannerTaskResponse
     */
    public StopScannerTaskResponse stopScannerTask(StopScannerTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopScannerTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Tests the network connectivity and authentication validity of a specified attack target.
     * This operation uses an asynchronous polling model:</p>
     * <ul>
     * <li>First call (without CheckId): Immediately returns a CheckId with VerifyStatus=checking. The actual test runs asynchronously in the background for up to 60 seconds.</li>
     * <li>Subsequent calls (with the CheckId returned from the first call): Queries the latest status of the corresponding CheckId, which may be checking, verified, or failed.</li>
     * <li>Poll at 2-second intervals for up to 60 seconds. After the CheckId expires, the operation returns failed with VerifyMessage set to &quot;check expired, please retry&quot;.
     * Use one of the following two approaches for parameters:</li>
     * <li>Approach A: Specify only TargetId. The system reads Endpoint, ApiKey, ModelName, ConnectionMethod, and ConnectionConfig from the saved target configuration and ignores any parameters with the same names in the request.</li>
     * <li>Approach B: Do not specify TargetId. Instead, provide the five connection parameters directly in the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Tests the network connectivity and authentication validity of an AI Red Teaming target.</p>
     * 
     * @param request TestConnectivityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestConnectivityResponse
     */
    public TestConnectivityResponse testConnectivityWithOptions(TestConnectivityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkId)) {
            query.put("CheckId", request.checkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionConfig)) {
            query.put("ConnectionConfig", request.connectionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionMethod)) {
            query.put("ConnectionMethod", request.connectionMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestConnectivity"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestConnectivityResponse());
    }

    /**
     * <b>description</b> :
     * <p>Tests the network connectivity and authentication validity of a specified attack target.
     * This operation uses an asynchronous polling model:</p>
     * <ul>
     * <li>First call (without CheckId): Immediately returns a CheckId with VerifyStatus=checking. The actual test runs asynchronously in the background for up to 60 seconds.</li>
     * <li>Subsequent calls (with the CheckId returned from the first call): Queries the latest status of the corresponding CheckId, which may be checking, verified, or failed.</li>
     * <li>Poll at 2-second intervals for up to 60 seconds. After the CheckId expires, the operation returns failed with VerifyMessage set to &quot;check expired, please retry&quot;.
     * Use one of the following two approaches for parameters:</li>
     * <li>Approach A: Specify only TargetId. The system reads Endpoint, ApiKey, ModelName, ConnectionMethod, and ConnectionConfig from the saved target configuration and ignores any parameters with the same names in the request.</li>
     * <li>Approach B: Do not specify TargetId. Instead, provide the five connection parameters directly in the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Tests the network connectivity and authentication validity of an AI Red Teaming target.</p>
     * 
     * @param request TestConnectivityRequest
     * @return TestConnectivityResponse
     */
    public TestConnectivityResponse testConnectivity(TestConnectivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testConnectivityWithOptions(request, runtime);
    }
}
