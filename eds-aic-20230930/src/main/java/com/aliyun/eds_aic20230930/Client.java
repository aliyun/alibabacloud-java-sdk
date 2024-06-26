// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930;

import com.aliyun.tea.*;
import com.aliyun.eds_aic20230930.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eds-aic", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>绑定密钥对</p>
     * 
     * @param request AttachKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachKeyPairResponse
     */
    public AttachKeyPairResponse attachKeyPairWithOptions(AttachKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachKeyPair"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachKeyPairResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定密钥对</p>
     * 
     * @param request AttachKeyPairRequest
     * @return AttachKeyPairResponse
     */
    public AttachKeyPairResponse attachKeyPair(AttachKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为用户授权/解授权安卓实例</p>
     * 
     * @param request AuthorizeAndroidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeAndroidInstanceResponse
     */
    public AuthorizeAndroidInstanceResponse authorizeAndroidInstanceWithOptions(AuthorizeAndroidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeUserId)) {
            query.put("AuthorizeUserId", request.authorizeUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unAuthorizeUserId)) {
            query.put("UnAuthorizeUserId", request.unAuthorizeUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeAndroidInstance"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeAndroidInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为用户授权/解授权安卓实例</p>
     * 
     * @param request AuthorizeAndroidInstanceRequest
     * @return AuthorizeAndroidInstanceResponse
     */
    public AuthorizeAndroidInstanceResponse authorizeAndroidInstance(AuthorizeAndroidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeAndroidInstanceWithOptions(request, runtime);
    }

    /**
     * @param request BackupFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BackupFileResponse
     */
    public BackupFileResponse backupFileWithOptions(BackupFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIdList)) {
            query.put("AndroidInstanceIdList", request.androidInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFilePath)) {
            query.put("BackupFilePath", request.backupFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFilePathList)) {
            query.put("SourceFilePathList", request.sourceFilePathList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadEndpoint)) {
            query.put("UploadEndpoint", request.uploadEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BackupFile"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BackupFileResponse());
    }

    /**
     * @param request BackupFileRequest
     * @return BackupFileResponse
     */
    public BackupFileResponse backupFile(BackupFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.backupFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查资源库存</p>
     * 
     * @param request CheckResourceStockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckResourceStockResponse
     */
    public CheckResourceStockResponse checkResourceStockWithOptions(CheckResourceStockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acpSpecId)) {
            query.put("AcpSpecId", request.acpSpecId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckResourceStock"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckResourceStockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查资源库存</p>
     * 
     * @param request CheckResourceStockRequest
     * @return CheckResourceStockResponse
     */
    public CheckResourceStockResponse checkResourceStock(CheckResourceStockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkResourceStockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建安卓实例组</p>
     * 
     * @param request CreateAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndroidInstanceGroupResponse
     */
    public CreateAndroidInstanceGroupResponse createAndroidInstanceGroupWithOptions(CreateAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupName)) {
            query.put("InstanceGroupName", request.instanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupSpec)) {
            query.put("InstanceGroupSpec", request.instanceGroupSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberOfInstances)) {
            query.put("NumberOfInstances", request.numberOfInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndroidInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建安卓实例组</p>
     * 
     * @param request CreateAndroidInstanceGroupRequest
     * @return CreateAndroidInstanceGroupResponse
     */
    public CreateAndroidInstanceGroupResponse createAndroidInstanceGroup(CreateAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAndroidInstanceGroupWithOptions(request, runtime);
    }

    /**
     * @param request CreateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconUrl)) {
            query.put("IconUrl", request.iconUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installParam)) {
            query.put("InstallParam", request.installParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAppUrl)) {
            query.put("OssAppUrl", request.ossAppUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    /**
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义镜像</p>
     * 
     * @param request CreateCustomImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomImageResponse
     */
    public CreateCustomImageResponse createCustomImageWithOptions(CreateCustomImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomImage"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义镜像</p>
     * 
     * @param request CreateCustomImageRequest
     * @return CreateCustomImageResponse
     */
    public CreateCustomImageResponse createCustomImage(CreateCustomImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建密钥对</p>
     * 
     * @param request CreateKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKeyPairResponse
     */
    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKeyPair"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKeyPairResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建密钥对</p>
     * 
     * @param request CreateKeyPairRequest
     * @return CreateKeyPairResponse
     */
    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建策略</p>
     * 
     * @param request CreatePolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyGroupResponse
     */
    public CreatePolicyGroupResponse createPolicyGroupWithOptions(CreatePolicyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cameraRedirect)) {
            body.put("CameraRedirect", request.cameraRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            body.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5FileTransfer)) {
            body.put("Html5FileTransfer", request.html5FileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localDrive)) {
            body.put("LocalDrive", request.localDrive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupName)) {
            body.put("PolicyGroupName", request.policyGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolutionHeight)) {
            body.put("ResolutionHeight", request.resolutionHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolutionWidth)) {
            body.put("ResolutionWidth", request.resolutionWidth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicyGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建策略</p>
     * 
     * @param request CreatePolicyGroupRequest
     * @return CreatePolicyGroupResponse
     */
    public CreatePolicyGroupResponse createPolicyGroup(CreatePolicyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除安卓实例组</p>
     * 
     * @param request DeleteAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAndroidInstanceGroupResponse
     */
    public DeleteAndroidInstanceGroupResponse deleteAndroidInstanceGroupWithOptions(DeleteAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            query.put("InstanceGroupIds", request.instanceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAndroidInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除安卓实例组</p>
     * 
     * @param request DeleteAndroidInstanceGroupRequest
     * @return DeleteAndroidInstanceGroupResponse
     */
    public DeleteAndroidInstanceGroupResponse deleteAndroidInstanceGroup(DeleteAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAndroidInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除app</p>
     * 
     * @param request DeleteAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppsResponse
     */
    public DeleteAppsResponse deleteAppsWithOptions(DeleteAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            query.put("AppIdList", request.appIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApps"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除app</p>
     * 
     * @param request DeleteAppsRequest
     * @return DeleteAppsResponse
     */
    public DeleteAppsResponse deleteApps(DeleteAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppsWithOptions(request, runtime);
    }

    /**
     * @param tmpReq DeleteImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImagesResponse
     */
    public DeleteImagesResponse deleteImagesWithOptions(DeleteImagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteImagesShrinkRequest request = new DeleteImagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageIds)) {
            request.imageIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageIds, "ImageIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageIdsShrink)) {
            body.put("ImageIds", request.imageIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImages"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImagesResponse());
    }

    /**
     * @param request DeleteImagesRequest
     * @return DeleteImagesResponse
     */
    public DeleteImagesResponse deleteImages(DeleteImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除密钥对</p>
     * 
     * @param request DeleteKeyPairsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKeyPairsResponse
     */
    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairIds)) {
            query.put("KeyPairIds", request.keyPairIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKeyPairs"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKeyPairsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除密钥对</p>
     * 
     * @param request DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除策略</p>
     * 
     * @param request DeletePolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyGroupResponse
     */
    public DeletePolicyGroupResponse deletePolicyGroupWithOptions(DeletePolicyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupIds)) {
            query.put("PolicyGroupIds", request.policyGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除策略</p>
     * 
     * @param request DeletePolicyGroupRequest
     * @return DeletePolicyGroupResponse
     */
    public DeletePolicyGroupResponse deletePolicyGroup(DeletePolicyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询安卓实例组</p>
     * 
     * @param request DescribeAndroidInstanceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAndroidInstanceGroupsResponse
     */
    public DescribeAndroidInstanceGroupsResponse describeAndroidInstanceGroupsWithOptions(DescribeAndroidInstanceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            query.put("InstanceGroupIds", request.instanceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupName)) {
            query.put("InstanceGroupName", request.instanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleMode)) {
            query.put("SaleMode", request.saleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAndroidInstanceGroups"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAndroidInstanceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询安卓实例组</p>
     * 
     * @param request DescribeAndroidInstanceGroupsRequest
     * @return DescribeAndroidInstanceGroupsResponse
     */
    public DescribeAndroidInstanceGroupsResponse describeAndroidInstanceGroups(DescribeAndroidInstanceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAndroidInstanceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询安卓实例列表</p>
     * 
     * @param request DescribeAndroidInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAndroidInstancesResponse
     */
    public DescribeAndroidInstancesResponse describeAndroidInstancesWithOptions(DescribeAndroidInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceName)) {
            query.put("AndroidInstanceName", request.androidInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleMode)) {
            query.put("SaleMode", request.saleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAndroidInstances"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAndroidInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询安卓实例列表</p>
     * 
     * @param request DescribeAndroidInstancesRequest
     * @return DescribeAndroidInstancesResponse
     */
    public DescribeAndroidInstancesResponse describeAndroidInstances(DescribeAndroidInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAndroidInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询app</p>
     * 
     * @param request DescribeAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeAppsWithOptions(DescribeAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            query.put("AppIdList", request.appIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installationStatus)) {
            query.put("InstallationStatus", request.installationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApps"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询app</p>
     * 
     * @param request DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBackupFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupFilesResponse
     */
    public DescribeBackupFilesResponse describeBackupFilesWithOptions(DescribeBackupFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceId)) {
            query.put("AndroidInstanceId", request.androidInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceName)) {
            query.put("AndroidInstanceName", request.androidInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFileId)) {
            query.put("BackupFileId", request.backupFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFileName)) {
            query.put("BackupFileName", request.backupFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupFiles"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupFilesResponse());
    }

    /**
     * @param request DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     */
    public DescribeBackupFilesResponse describeBackupFiles(DescribeBackupFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupFilesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeImageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageListResponse
     */
    public DescribeImageListResponse describeImageListWithOptions(DescribeImageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            body.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageList"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageListResponse());
    }

    /**
     * @param request DescribeImageListRequest
     * @return DescribeImageListResponse
     */
    public DescribeImageListResponse describeImageList(DescribeImageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询命令结果</p>
     * 
     * @param request DescribeInvocationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvocationsResponse
     */
    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invocationId)) {
            query.put("InvocationId", request.invocationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvocations"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvocationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询命令结果</p>
     * 
     * @param request DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥对</p>
     * 
     * @param request DescribeKeyPairsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKeyPairsResponse
     */
    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairIds)) {
            query.put("KeyPairIds", request.keyPairIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKeyPairs"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKeyPairsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥对</p>
     * 
     * @param request DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     */
    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询地域</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询地域</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询规格</p>
     * 
     * @param request DescribeSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSpecResponse
     */
    public DescribeSpecResponse describeSpecWithOptions(DescribeSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specIds)) {
            query.put("SpecIds", request.specIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specStatus)) {
            query.put("SpecStatus", request.specStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSpec"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询规格</p>
     * 
     * @param request DescribeSpecRequest
     * @return DescribeSpecResponse
     */
    public DescribeSpecResponse describeSpec(DescribeSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑密钥对</p>
     * 
     * @param request DetachKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachKeyPairResponse
     */
    public DetachKeyPairResponse detachKeyPairWithOptions(DetachKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachKeyPair"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachKeyPairResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑密钥对</p>
     * 
     * @param request DetachKeyPairRequest
     * @return DetachKeyPairResponse
     */
    public DetachKeyPairResponse detachKeyPair(DetachKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义镜像分发</p>
     * 
     * @param request DistributeImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DistributeImageResponse
     */
    public DistributeImageResponse distributeImageWithOptions(DistributeImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributeRegionList)) {
            body.put("DistributeRegionList", request.distributeRegionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DistributeImage"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DistributeImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义镜像分发</p>
     * 
     * @param request DistributeImageRequest
     * @return DistributeImageResponse
     */
    public DistributeImageResponse distributeImage(DistributeImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.distributeImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例组缩容</p>
     * 
     * @param request DowngradeAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DowngradeAndroidInstanceGroupResponse
     */
    public DowngradeAndroidInstanceGroupResponse downgradeAndroidInstanceGroupWithOptions(DowngradeAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DowngradeAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DowngradeAndroidInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例组缩容</p>
     * 
     * @param request DowngradeAndroidInstanceGroupRequest
     * @return DowngradeAndroidInstanceGroupResponse
     */
    public DowngradeAndroidInstanceGroupResponse downgradeAndroidInstanceGroup(DowngradeAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downgradeAndroidInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云手机拉取文件到OSS</p>
     * 
     * @param request FetchFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchFileResponse
     */
    public FetchFileResponse fetchFileWithOptions(FetchFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIdList)) {
            query.put("AndroidInstanceIdList", request.androidInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFilePath)) {
            query.put("SourceFilePath", request.sourceFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadEndpoint)) {
            query.put("UploadEndpoint", request.uploadEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadUrl)) {
            query.put("UploadUrl", request.uploadUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchFile"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FetchFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云手机拉取文件到OSS</p>
     * 
     * @param request FetchFileRequest
     * @return FetchFileResponse
     */
    public FetchFileResponse fetchFile(FetchFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fetchFileWithOptions(request, runtime);
    }

    /**
     * @param request GetAdbSecureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAdbSecureResponse
     */
    public GetAdbSecureResponse getAdbSecureWithOptions(GetAdbSecureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdbSecure"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdbSecureResponse());
    }

    /**
     * @param request GetAdbSecureRequest
     * @return GetAdbSecureResponse
     */
    public GetAdbSecureResponse getAdbSecure(GetAdbSecureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAdbSecureWithOptions(request, runtime);
    }

    /**
     * @param request ImportKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportKeyPairResponse
     */
    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyBody)) {
            query.put("PublicKeyBody", request.publicKeyBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportKeyPair"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportKeyPairResponse());
    }

    /**
     * @param request ImportKeyPairRequest
     * @return ImportKeyPairResponse
     */
    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>安装app到实例组</p>
     * 
     * @param request InstallAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallAppResponse
     */
    public InstallAppResponse installAppWithOptions(InstallAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            query.put("AppIdList", request.appIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIdList)) {
            query.put("InstanceGroupIdList", request.instanceGroupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallApp"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>安装app到实例组</p>
     * 
     * @param request InstallAppRequest
     * @return InstallAppResponse
     */
    public InstallAppResponse installApp(InstallAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Policy列表</p>
     * 
     * @param request ListPolicyGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicyGroupsResponse
     */
    public ListPolicyGroupsResponse listPolicyGroupsWithOptions(ListPolicyGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupIds)) {
            body.put("PolicyGroupIds", request.policyGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupName)) {
            body.put("PolicyGroupName", request.policyGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicyGroups"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicyGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Policy列表</p>
     * 
     * @param request ListPolicyGroupsRequest
     * @return ListPolicyGroupsResponse
     */
    public ListPolicyGroupsResponse listPolicyGroups(ListPolicyGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicyGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改安卓实例信息</p>
     * 
     * @param request ModifyAndroidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAndroidInstanceResponse
     */
    public ModifyAndroidInstanceResponse modifyAndroidInstanceWithOptions(ModifyAndroidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceId)) {
            query.put("AndroidInstanceId", request.androidInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newAndroidInstanceName)) {
            query.put("NewAndroidInstanceName", request.newAndroidInstanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAndroidInstance"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAndroidInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改安卓实例信息</p>
     * 
     * @param request ModifyAndroidInstanceRequest
     * @return ModifyAndroidInstanceResponse
     */
    public ModifyAndroidInstanceResponse modifyAndroidInstance(ModifyAndroidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAndroidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改安卓实例组</p>
     * 
     * @param request ModifyAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAndroidInstanceGroupResponse
     */
    public ModifyAndroidInstanceGroupResponse modifyAndroidInstanceGroupWithOptions(ModifyAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newInstanceGroupName)) {
            query.put("NewInstanceGroupName", request.newInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAndroidInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改安卓实例组</p>
     * 
     * @param request ModifyAndroidInstanceGroupRequest
     * @return ModifyAndroidInstanceGroupResponse
     */
    public ModifyAndroidInstanceGroupResponse modifyAndroidInstanceGroup(ModifyAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAndroidInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改app</p>
     * 
     * @param request ModifyAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconUrl)) {
            query.put("IconUrl", request.iconUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApp"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改app</p>
     * 
     * @param request ModifyAppRequest
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改密钥对名称</p>
     * 
     * @param request ModifyKeyPairNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyKeyPairNameResponse
     */
    public ModifyKeyPairNameResponse modifyKeyPairNameWithOptions(ModifyKeyPairNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newKeyPairName)) {
            query.put("NewKeyPairName", request.newKeyPairName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyKeyPairName"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyKeyPairNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改密钥对名称</p>
     * 
     * @param request ModifyKeyPairNameRequest
     * @return ModifyKeyPairNameResponse
     */
    public ModifyKeyPairNameResponse modifyKeyPairName(ModifyKeyPairNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyKeyPairNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改policy</p>
     * 
     * @param request ModifyPolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPolicyGroupResponse
     */
    public ModifyPolicyGroupResponse modifyPolicyGroupWithOptions(ModifyPolicyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cameraRedirect)) {
            body.put("CameraRedirect", request.cameraRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            body.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5FileTransfer)) {
            body.put("Html5FileTransfer", request.html5FileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localDrive)) {
            body.put("LocalDrive", request.localDrive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            body.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupName)) {
            body.put("PolicyGroupName", request.policyGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolutionHeight)) {
            body.put("ResolutionHeight", request.resolutionHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolutionWidth)) {
            body.put("ResolutionWidth", request.resolutionWidth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicyGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改policy</p>
     * 
     * @param request ModifyPolicyGroupRequest
     * @return ModifyPolicyGroupResponse
     */
    public ModifyPolicyGroupResponse modifyPolicyGroup(ModifyPolicyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPolicyGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重启安卓实例</p>
     * 
     * @param request RebootAndroidInstancesInGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootAndroidInstancesInGroupResponse
     */
    public RebootAndroidInstancesInGroupResponse rebootAndroidInstancesInGroupWithOptions(RebootAndroidInstancesInGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootAndroidInstancesInGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootAndroidInstancesInGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重启安卓实例</p>
     * 
     * @param request RebootAndroidInstancesInGroupRequest
     * @return RebootAndroidInstancesInGroupResponse
     */
    public RebootAndroidInstancesInGroupResponse rebootAndroidInstancesInGroup(RebootAndroidInstancesInGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootAndroidInstancesInGroupWithOptions(request, runtime);
    }

    /**
     * @param request RecoveryFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecoveryFileResponse
     */
    public RecoveryFileResponse recoveryFileWithOptions(RecoveryFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIdList)) {
            query.put("AndroidInstanceIdList", request.androidInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFileId)) {
            query.put("BackupFileId", request.backupFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFilePath)) {
            query.put("BackupFilePath", request.backupFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadEndpoint)) {
            query.put("UploadEndpoint", request.uploadEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoveryFile"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecoveryFileResponse());
    }

    /**
     * @param request RecoveryFileRequest
     * @return RecoveryFileResponse
     */
    public RecoveryFileResponse recoveryFile(RecoveryFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoveryFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>续费安卓实例组</p>
     * 
     * @param request RenewAndroidInstanceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewAndroidInstanceGroupsResponse
     */
    public RenewAndroidInstanceGroupsResponse renewAndroidInstanceGroupsWithOptions(RenewAndroidInstanceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            query.put("InstanceGroupIds", request.instanceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAndroidInstanceGroups"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAndroidInstanceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>续费安卓实例组</p>
     * 
     * @param request RenewAndroidInstanceGroupsRequest
     * @return RenewAndroidInstanceGroupsResponse
     */
    public RenewAndroidInstanceGroupsResponse renewAndroidInstanceGroups(RenewAndroidInstanceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewAndroidInstanceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置安卓实例</p>
     * 
     * @param request ResetAndroidInstancesInGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAndroidInstancesInGroupResponse
     */
    public ResetAndroidInstancesInGroupResponse resetAndroidInstancesInGroupWithOptions(ResetAndroidInstancesInGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAndroidInstancesInGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAndroidInstancesInGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重置安卓实例</p>
     * 
     * @param request ResetAndroidInstancesInGroupRequest
     * @return ResetAndroidInstancesInGroupResponse
     */
    public ResetAndroidInstancesInGroupResponse resetAndroidInstancesInGroup(ResetAndroidInstancesInGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAndroidInstancesInGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过eds agent通道下发命令</p>
     * 
     * @param request RunCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCommandResponse
     */
    public RunCommandResponse runCommandWithOptions(RunCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandContent)) {
            query.put("CommandContent", request.commandContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCommand"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过eds agent通道下发命令</p>
     * 
     * @param request RunCommandRequest
     * @return RunCommandResponse
     */
    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送文件到云手机</p>
     * 
     * @param request SendFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendFileResponse
     */
    public SendFileResponse sendFileWithOptions(SendFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIdList)) {
            query.put("AndroidInstanceIdList", request.androidInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFilePath)) {
            query.put("SourceFilePath", request.sourceFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadEndpoint)) {
            query.put("UploadEndpoint", request.uploadEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadUrl)) {
            query.put("UploadUrl", request.uploadUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendFile"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送文件到云手机</p>
     * 
     * @param request SendFileRequest
     * @return SendFileResponse
     */
    public SendFileResponse sendFile(SendFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendFileWithOptions(request, runtime);
    }

    /**
     * @param request SetAdbSecureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAdbSecureResponse
     */
    public SetAdbSecureResponse setAdbSecureWithOptions(SetAdbSecureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAdbSecure"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAdbSecureResponse());
    }

    /**
     * @param request SetAdbSecureRequest
     * @return SetAdbSecureResponse
     */
    public SetAdbSecureResponse setAdbSecure(SetAdbSecureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAdbSecureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例开机</p>
     * 
     * @param request StartAndroidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAndroidInstanceResponse
     */
    public StartAndroidInstanceResponse startAndroidInstanceWithOptions(StartAndroidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAndroidInstance"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAndroidInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例开机</p>
     * 
     * @param request StartAndroidInstanceRequest
     * @return StartAndroidInstanceResponse
     */
    public StartAndroidInstanceResponse startAndroidInstance(StartAndroidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAndroidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例关机</p>
     * 
     * @param request StopAndroidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAndroidInstanceResponse
     */
    public StopAndroidInstanceResponse stopAndroidInstanceWithOptions(StopAndroidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAndroidInstance"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAndroidInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例关机</p>
     * 
     * @param request StopAndroidInstanceRequest
     * @return StopAndroidInstanceResponse
     */
    public StopAndroidInstanceResponse stopAndroidInstance(StopAndroidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAndroidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>卸载app</p>
     * 
     * @param request UninstallAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallAppResponse
     */
    public UninstallAppResponse uninstallAppWithOptions(UninstallAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            query.put("AppIdList", request.appIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIdList)) {
            query.put("InstanceGroupIdList", request.instanceGroupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallApp"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>卸载app</p>
     * 
     * @param request UninstallAppRequest
     * @return UninstallAppResponse
     */
    public UninstallAppResponse uninstallApp(UninstallAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改自定义镜像名称</p>
     * 
     * @param request UpdateCustomImageNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomImageNameResponse
     */
    public UpdateCustomImageNameResponse updateCustomImageNameWithOptions(UpdateCustomImageNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomImageName"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomImageNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改自定义镜像名称</p>
     * 
     * @param request UpdateCustomImageNameRequest
     * @return UpdateCustomImageNameResponse
     */
    public UpdateCustomImageNameResponse updateCustomImageName(UpdateCustomImageNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomImageNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例组变更镜像</p>
     * 
     * @param request UpdateInstanceGroupImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceGroupImageResponse
     */
    public UpdateInstanceGroupImageResponse updateInstanceGroupImageWithOptions(UpdateInstanceGroupImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            body.put("InstanceGroupIds", request.instanceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceGroupImage"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceGroupImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例组变更镜像</p>
     * 
     * @param request UpdateInstanceGroupImageRequest
     * @return UpdateInstanceGroupImageResponse
     */
    public UpdateInstanceGroupImageResponse updateInstanceGroupImage(UpdateInstanceGroupImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceGroupImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>安卓实例组扩容</p>
     * 
     * @param request UpgradeAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeAndroidInstanceGroupResponse
     */
    public UpgradeAndroidInstanceGroupResponse upgradeAndroidInstanceGroupWithOptions(UpgradeAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.increaseNumberOfInstance)) {
            query.put("IncreaseNumberOfInstance", request.increaseNumberOfInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeAndroidInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>安卓实例组扩容</p>
     * 
     * @param request UpgradeAndroidInstanceGroupRequest
     * @return UpgradeAndroidInstanceGroupResponse
     */
    public UpgradeAndroidInstanceGroupResponse upgradeAndroidInstanceGroup(UpgradeAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeAndroidInstanceGroupWithOptions(request, runtime);
    }
}
