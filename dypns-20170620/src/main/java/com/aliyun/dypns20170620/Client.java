// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620;

import com.aliyun.tea.*;
import com.aliyun.dypns20170620.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dypns", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>配置认证方案APP信息</p>
     * 
     * @param request ConfigVerifySceneAppInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigVerifySceneAppInfoResponse
     */
    public ConfigVerifySceneAppInfoResponse configVerifySceneAppInfoWithOptions(ConfigVerifySceneAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CM)) {
            query.put("CM", request.CM);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CT)) {
            query.put("CT", request.CT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CU)) {
            query.put("CU", request.CU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelist)) {
            query.put("IpWhitelist", request.ipWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigVerifySceneAppInfo"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigVerifySceneAppInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置认证方案APP信息</p>
     * 
     * @param request ConfigVerifySceneAppInfoRequest
     * @return ConfigVerifySceneAppInfoResponse
     */
    public ConfigVerifySceneAppInfoResponse configVerifySceneAppInfo(ConfigVerifySceneAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configVerifySceneAppInfoWithOptions(request, runtime);
    }

    /**
     * @param request CopySchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopySchemeResponse
     */
    public CopySchemeResponse copySchemeWithOptions(CopySchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeId)) {
            query.put("SchemeId", request.schemeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyScheme"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopySchemeResponse());
    }

    /**
     * @param request CopySchemeRequest
     * @return CopySchemeResponse
     */
    public CopySchemeResponse copyScheme(CopySchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copySchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>复制号码认证方案信息</p>
     * 
     * @param request CopyVerifySchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyVerifySchemeResponse
     */
    public CopyVerifySchemeResponse copyVerifySchemeWithOptions(CopyVerifySchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cmApiCode)) {
            query.put("CmApiCode", request.cmApiCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmNewFlag)) {
            query.put("CmNewFlag", request.cmNewFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ctApiCode)) {
            query.put("CtApiCode", request.ctApiCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ctNewFlag)) {
            query.put("CtNewFlag", request.ctNewFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cuApiCode)) {
            query.put("CuApiCode", request.cuApiCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cuNewFlag)) {
            query.put("CuNewFlag", request.cuNewFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelSceneCode)) {
            query.put("ModelSceneCode", request.modelSceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyVerifyScheme"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyVerifySchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>复制号码认证方案信息</p>
     * 
     * @param request CopyVerifySchemeRequest
     * @return CopyVerifySchemeResponse
     */
    public CopyVerifySchemeResponse copyVerifyScheme(CopyVerifySchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyVerifySchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证2.0http回执测试</p>
     * 
     * @param request CreateDypnsSmsVerifyCallBackTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDypnsSmsVerifyCallBackTestResponse
     */
    public CreateDypnsSmsVerifyCallBackTestResponse createDypnsSmsVerifyCallBackTestWithOptions(CreateDypnsSmsVerifyCallBackTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDypnsSmsVerifyCallBackTest"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDypnsSmsVerifyCallBackTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证2.0http回执测试</p>
     * 
     * @param request CreateDypnsSmsVerifyCallBackTestRequest
     * @return CreateDypnsSmsVerifyCallBackTestResponse
     */
    public CreateDypnsSmsVerifyCallBackTestResponse createDypnsSmsVerifyCallBackTest(CreateDypnsSmsVerifyCallBackTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDypnsSmsVerifyCallBackTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证2.0http回执url</p>
     * 
     * @param request CreateDypnsSmsVerifyMessageCallBackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDypnsSmsVerifyMessageCallBackResponse
     */
    public CreateDypnsSmsVerifyMessageCallBackResponse createDypnsSmsVerifyMessageCallBackWithOptions(CreateDypnsSmsVerifyMessageCallBackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDypnsSmsVerifyMessageCallBack"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDypnsSmsVerifyMessageCallBackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证2.0http回执url</p>
     * 
     * @param request CreateDypnsSmsVerifyMessageCallBackRequest
     * @return CreateDypnsSmsVerifyMessageCallBackResponse
     */
    public CreateDypnsSmsVerifyMessageCallBackResponse createDypnsSmsVerifyMessageCallBack(CreateDypnsSmsVerifyMessageCallBackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDypnsSmsVerifyMessageCallBackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证2.0mns回执队列</p>
     * 
     * @param request CreateDypnsSmsVerifyMessageQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDypnsSmsVerifyMessageQueueResponse
     */
    public CreateDypnsSmsVerifyMessageQueueResponse createDypnsSmsVerifyMessageQueueWithOptions(CreateDypnsSmsVerifyMessageQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryQueueTypes)) {
            query.put("QueryQueueTypes", request.queryQueueTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueType)) {
            query.put("QueueType", request.queueType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDypnsSmsVerifyMessageQueue"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDypnsSmsVerifyMessageQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证2.0mns回执队列</p>
     * 
     * @param request CreateDypnsSmsVerifyMessageQueueRequest
     * @return CreateDypnsSmsVerifyMessageQueueResponse
     */
    public CreateDypnsSmsVerifyMessageQueueResponse createDypnsSmsVerifyMessageQueue(CreateDypnsSmsVerifyMessageQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDypnsSmsVerifyMessageQueueWithOptions(request, runtime);
    }

    /**
     * @param request CreateFileByBizRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileByBizResponse
     */
    public CreateFileByBizResponse createFileByBizWithOptions(CreateFileByBizRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveOssFileName)) {
            query.put("SaveOssFileName", request.saveOssFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userViewFileName)) {
            query.put("UserViewFileName", request.userViewFileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileByBiz"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileByBizResponse());
    }

    /**
     * @param request CreateFileByBizRequest
     * @return CreateFileByBizResponse
     */
    public CreateFileByBizResponse createFileByBiz(CreateFileByBizRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileByBizWithOptions(request, runtime);
    }

    /**
     * @param request CreateGateVerifyExportLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGateVerifyExportLogResponse
     */
    public CreateGateVerifyExportLogResponse createGateVerifyExportLogWithOptions(CreateGateVerifyExportLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationType)) {
            query.put("AuthenticationType", request.authenticationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryMonth)) {
            query.put("QueryMonth", request.queryMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGateVerifyExportLog"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGateVerifyExportLogResponse());
    }

    /**
     * @param request CreateGateVerifyExportLogRequest
     * @return CreateGateVerifyExportLogResponse
     */
    public CreateGateVerifyExportLogResponse createGateVerifyExportLog(CreateGateVerifyExportLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGateVerifyExportLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建图形认证方案号</p>
     * 
     * @param request CreateGraphicAuthSchemeConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGraphicAuthSchemeConfigResponse
     */
    public CreateGraphicAuthSchemeConfigResponse createGraphicAuthSchemeConfigWithOptions(CreateGraphicAuthSchemeConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeName)) {
            query.put("SchemeName", request.schemeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGraphicAuthSchemeConfig"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGraphicAuthSchemeConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建图形认证方案号</p>
     * 
     * @param request CreateGraphicAuthSchemeConfigRequest
     * @return CreateGraphicAuthSchemeConfigResponse
     */
    public CreateGraphicAuthSchemeConfigResponse createGraphicAuthSchemeConfig(CreateGraphicAuthSchemeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGraphicAuthSchemeConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductResponse
     */
    public CreateProductResponse createProductWithOptions(CreateProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodId)) {
            query.put("ProdId", request.prodId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduct"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>融合认证-新增方案</p>
     * 
     * @param request CreateSchemeConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSchemeConfigResponse
     */
    public CreateSchemeConfigResponse createSchemeConfigWithOptions(CreateSchemeConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidPackageName)) {
            query.put("AndroidPackageName", request.androidPackageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidPackageSign)) {
            query.put("AndroidPackageSign", request.androidPackageSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Origin)) {
            query.put("H5Origin", request.h5Origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Url)) {
            query.put("H5Url", request.h5Url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iosBundleId)) {
            query.put("IosBundleId", request.iosBundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeName)) {
            query.put("SchemeName", request.schemeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSchemeConfig"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSchemeConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>融合认证-新增方案</p>
     * 
     * @param request CreateSchemeConfigRequest
     * @return CreateSchemeConfigResponse
     */
    public CreateSchemeConfigResponse createSchemeConfig(CreateSchemeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSchemeConfigWithOptions(request, runtime);
    }

    /**
     * @param request CreateSmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmsSignResponse
     */
    public CreateSmsSignResponse createSmsSignWithOptions(CreateSmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appUrl)) {
            query.put("AppUrl", request.appUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessLicenseCert)) {
            query.put("BusinessLicenseCert", request.businessLicenseCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendMessage)) {
            query.put("ExtendMessage", request.extendMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldSmsSignName)) {
            query.put("OldSmsSignName", request.oldSmsSignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationCodeCert)) {
            query.put("OrganizationCodeCert", request.organizationCodeCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsSignName)) {
            query.put("SmsSignName", request.smsSignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsSignRemark)) {
            query.put("SmsSignRemark", request.smsSignRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsSignSource)) {
            query.put("SmsSignSource", request.smsSignSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxRegistrationCert)) {
            query.put("TaxRegistrationCert", request.taxRegistrationCert);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmsSign"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmsSignResponse());
    }

    /**
     * @param request CreateSmsSignRequest
     * @return CreateSmsSignResponse
     */
    public CreateSmsSignResponse createSmsSign(CreateSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsSignWithOptions(request, runtime);
    }

    /**
     * @param request CreateSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmsTemplateResponse
     */
    public CreateSmsTemplateResponse createSmsTemplateWithOptions(CreateSmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizUrl)) {
            query.put("BizUrl", request.bizUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateContent)) {
            query.put("SmsTemplateContent", request.smsTemplateContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateName)) {
            query.put("SmsTemplateName", request.smsTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateRule)) {
            query.put("SmsTemplateRule", request.smsTemplateRule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmsTemplate"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmsTemplateResponse());
    }

    /**
     * @param request CreateSmsTemplateRequest
     * @return CreateSmsTemplateResponse
     */
    public CreateSmsTemplateResponse createSmsTemplate(CreateSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证用量统计记录导出任务</p>
     * 
     * @param request CreateSmsVerifyStatisticRecordsExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmsVerifyStatisticRecordsExportTaskResponse
     */
    public CreateSmsVerifyStatisticRecordsExportTaskResponse createSmsVerifyStatisticRecordsExportTaskWithOptions(CreateSmsVerifyStatisticRecordsExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromDate)) {
            query.put("FromDate", request.fromDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeName)) {
            query.put("SchemeName", request.schemeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toDate)) {
            query.put("ToDate", request.toDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmsVerifyStatisticRecordsExportTask"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmsVerifyStatisticRecordsExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证用量统计记录导出任务</p>
     * 
     * @param request CreateSmsVerifyStatisticRecordsExportTaskRequest
     * @return CreateSmsVerifyStatisticRecordsExportTaskResponse
     */
    public CreateSmsVerifyStatisticRecordsExportTaskResponse createSmsVerifyStatisticRecordsExportTask(CreateSmsVerifyStatisticRecordsExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsVerifyStatisticRecordsExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建认证方案</p>
     * 
     * @param request CreateVerifySchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVerifySchemeResponse
     */
    public CreateVerifySchemeResponse createVerifySchemeWithOptions(CreateVerifySchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmApiCode)) {
            query.put("CmApiCode", request.cmApiCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ctApiCode)) {
            query.put("CtApiCode", request.ctApiCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cuApiCode)) {
            query.put("CuApiCode", request.cuApiCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hmAppIdentifier)) {
            query.put("HmAppIdentifier", request.hmAppIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hmPackageName)) {
            query.put("HmPackageName", request.hmPackageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hmSignName)) {
            query.put("HmSignName", request.hmSignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhiteList)) {
            query.put("IpWhiteList", request.ipWhiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packName)) {
            query.put("PackName", request.packName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packSign)) {
            query.put("PackSign", request.packSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            query.put("SceneType", request.sceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeName)) {
            query.put("SchemeName", request.schemeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsSignName)) {
            query.put("SmsSignName", request.smsSignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVerifyScheme"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVerifySchemeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建认证方案</p>
     * 
     * @param request CreateVerifySchemeRequest
     * @return CreateVerifySchemeResponse
     */
    public CreateVerifySchemeResponse createVerifyScheme(CreateVerifySchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVerifySchemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证导出任务</p>
     * 
     * @param request CreatetVerifySmsExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatetVerifySmsExportTaskResponse
     */
    public CreatetVerifySmsExportTaskResponse createtVerifySmsExportTaskWithOptions(CreatetVerifySmsExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeName)) {
            query.put("SchemeName", request.schemeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendStatus)) {
            query.put("SendStatus", request.sendStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatetVerifySmsExportTask"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatetVerifySmsExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建短信认证导出任务</p>
     * 
     * @param request CreatetVerifySmsExportTaskRequest
     * @return CreatetVerifySmsExportTaskResponse
     */
    public CreatetVerifySmsExportTaskResponse createtVerifySmsExportTask(CreatetVerifySmsExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createtVerifySmsExportTaskWithOptions(request, runtime);
    }

    /**
     * @param request DeleteSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSceneResponse
     */
    public DeleteSceneResponse deleteSceneWithOptions(DeleteSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScene"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSceneResponse());
    }

    /**
     * @param request DeleteSceneRequest
     * @return DeleteSceneResponse
     */
    public DeleteSceneResponse deleteScene(DeleteSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSceneWithOptions(request, runtime);
    }

    /**
     * @param request DeleteSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSchemeResponse
     */
    public DeleteSchemeResponse deleteSchemeWithOptions(DeleteSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeId)) {
            query.put("SchemeId", request.schemeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheme"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSchemeResponse());
    }

    /**
     * @param request DeleteSchemeRequest
     * @return DeleteSchemeResponse
     */
    public DeleteSchemeResponse deleteScheme(DeleteSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSchemeWithOptions(request, runtime);
    }

    /**
     * @param request GetDownLoadFileUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDownLoadFileUrlResponse
     */
    public GetDownLoadFileUrlResponse getDownLoadFileUrlWithOptions(GetDownLoadFileUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acctId)) {
            query.put("AcctId", request.acctId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDownLoadFileUrl"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDownLoadFileUrlResponse());
    }

    /**
     * @param request GetDownLoadFileUrlRequest
     * @return GetDownLoadFileUrlResponse
     */
    public GetDownLoadFileUrlResponse getDownLoadFileUrl(GetDownLoadFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDownLoadFileUrlWithOptions(request, runtime);
    }

    /**
     * @param request GetEnterpriseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnterpriseInfoResponse
     */
    public GetEnterpriseInfoResponse getEnterpriseInfoWithOptions(GetEnterpriseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnterpriseInfo"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnterpriseInfoResponse());
    }

    /**
     * @param request GetEnterpriseInfoRequest
     * @return GetEnterpriseInfoResponse
     */
    public GetEnterpriseInfoResponse getEnterpriseInfo(GetEnterpriseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEnterpriseInfoWithOptions(request, runtime);
    }

    /**
     * @param request GetOpenSubProductStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpenSubProductStatusResponse
     */
    public GetOpenSubProductStatusResponse getOpenSubProductStatusWithOptions(GetOpenSubProductStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpenSubProductStatus"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpenSubProductStatusResponse());
    }

    /**
     * @param request GetOpenSubProductStatusRequest
     * @return GetOpenSubProductStatusResponse
     */
    public GetOpenSubProductStatusResponse getOpenSubProductStatus(GetOpenSubProductStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpenSubProductStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetOssUploadForEnterpriseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssUploadForEnterpriseResponse
     */
    public GetOssUploadForEnterpriseResponse getOssUploadForEnterpriseWithOptions(GetOssUploadForEnterpriseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssUploadForEnterprise"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssUploadForEnterpriseResponse());
    }

    /**
     * @param request GetOssUploadForEnterpriseRequest
     * @return GetOssUploadForEnterpriseResponse
     */
    public GetOssUploadForEnterpriseResponse getOssUploadForEnterprise(GetOssUploadForEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssUploadForEnterpriseWithOptions(request, runtime);
    }

    /**
     * @param request GetOssUploadSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssUploadSignResponse
     */
    public GetOssUploadSignResponse getOssUploadSignWithOptions(GetOssUploadSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssUploadSign"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssUploadSignResponse());
    }

    /**
     * @param request GetOssUploadSignRequest
     * @return GetOssUploadSignResponse
     */
    public GetOssUploadSignResponse getOssUploadSign(GetOssUploadSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssUploadSignWithOptions(request, runtime);
    }

    /**
     * @param request GetSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSchemeResponse
     */
    public GetSchemeResponse getSchemeWithOptions(GetSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemeId)) {
            query.put("SchemeId", request.schemeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheme"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSchemeResponse());
    }

    /**
     * @param request GetSchemeRequest
     * @return GetSchemeResponse
     */
    public GetSchemeResponse getScheme(GetSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSchemeWithOptions(request, runtime);
    }

    /**
     * @param request GetSmsCodeLimitConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmsCodeLimitConfigResponse
     */
    public GetSmsCodeLimitConfigResponse getSmsCodeLimitConfigWithOptions(GetSmsCodeLimitConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSmsCodeLimitConfig"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmsCodeLimitConfigResponse());
    }

    /**
     * @param request GetSmsCodeLimitConfigRequest
     * @return GetSmsCodeLimitConfigResponse
     */
    public GetSmsCodeLimitConfigResponse getSmsCodeLimitConfig(GetSmsCodeLimitConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmsCodeLimitConfigWithOptions(request, runtime);
    }

    /**
     * @param request GetSmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmsSignResponse
     */
    public GetSmsSignResponse getSmsSignWithOptions(GetSmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsSignName)) {
            query.put("SmsSignName", request.smsSignName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSmsSign"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmsSignResponse());
    }

    /**
     * @param request GetSmsSignRequest
     * @return GetSmsSignResponse
     */
    public GetSmsSignResponse getSmsSign(GetSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmsSignWithOptions(request, runtime);
    }

    /**
     * @param request ListAuditPassEnterpriseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuditPassEnterpriseInfoResponse
     */
    public ListAuditPassEnterpriseInfoResponse listAuditPassEnterpriseInfoWithOptions(ListAuditPassEnterpriseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuditPassEnterpriseInfo"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuditPassEnterpriseInfoResponse());
    }

    /**
     * @param request ListAuditPassEnterpriseInfoRequest
     * @return ListAuditPassEnterpriseInfoResponse
     */
    public ListAuditPassEnterpriseInfoResponse listAuditPassEnterpriseInfo(ListAuditPassEnterpriseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuditPassEnterpriseInfoWithOptions(request, runtime);
    }

    /**
     * @param request ListCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCertificateResponse
     */
    public ListCertificateResponse listCertificateWithOptions(ListCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNo)) {
            query.put("PhoneNo", request.phoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCertificate"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCertificateResponse());
    }

    /**
     * @param request ListCertificateRequest
     * @return ListCertificateResponse
     */
    public ListCertificateResponse listCertificate(ListCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCertificateWithOptions(request, runtime);
    }

    /**
     * @param request ListEnterpriseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseInfoResponse
     */
    public ListEnterpriseInfoResponse listEnterpriseInfoWithOptions(ListEnterpriseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseInfo"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseInfoResponse());
    }

    /**
     * @param request ListEnterpriseInfoRequest
     * @return ListEnterpriseInfoResponse
     */
    public ListEnterpriseInfoResponse listEnterpriseInfo(ListEnterpriseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseInfoWithOptions(request, runtime);
    }

    /**
     * @param request ListSchemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSchemeResponse
     */
    public ListSchemeResponse listSchemeWithOptions(ListSchemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheme"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSchemeResponse());
    }

    /**
     * @param request ListSchemeRequest
     * @return ListSchemeResponse
     */
    public ListSchemeResponse listScheme(ListSchemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSchemeWithOptions(request, runtime);
    }

    /**
     * @param request ListSmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSmsSignResponse
     */
    public ListSmsSignResponse listSmsSignWithOptions(ListSmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.querySmsSign)) {
            query.put("QuerySmsSign", request.querySmsSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSmsSign"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSmsSignResponse());
    }

    /**
     * @param request ListSmsSignRequest
     * @return ListSmsSignResponse
     */
    public ListSmsSignResponse listSmsSign(ListSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSmsSignWithOptions(request, runtime);
    }

    /**
     * @param request ListSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSmsTemplateResponse
     */
    public ListSmsTemplateResponse listSmsTemplateWithOptions(ListSmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTemplate)) {
            query.put("QueryTemplate", request.queryTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSmsTemplate"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSmsTemplateResponse());
    }

    /**
     * @param request ListSmsTemplateRequest
     * @return ListSmsTemplateResponse
     */
    public ListSmsTemplateResponse listSmsTemplate(ListSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSmsTemplateWithOptions(request, runtime);
    }

    /**
     * @param request OpenCommonProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenCommonProductResponse
     */
    public OpenCommonProductResponse openCommonProductWithOptions(OpenCommonProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenCommonProduct"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenCommonProductResponse());
    }

    /**
     * @param request OpenCommonProductRequest
     * @return OpenCommonProductResponse
     */
    public OpenCommonProductResponse openCommonProduct(OpenCommonProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openCommonProductWithOptions(request, runtime);
    }

    /**
     * @param request QueryCommonBillingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCommonBillingResponse
     */
    public QueryCommonBillingResponse queryCommonBillingWithOptions(QueryCommonBillingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.month)) {
            query.put("Month", request.month);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommonBilling"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommonBillingResponse());
    }

    /**
     * @param request QueryCommonBillingRequest
     * @return QueryCommonBillingResponse
     */
    public QueryCommonBillingResponse queryCommonBilling(QueryCommonBillingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCommonBillingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询客户信息</p>
     * 
     * @param request QueryCommonCustInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCommonCustInfoResponse
     */
    public QueryCommonCustInfoResponse queryCommonCustInfoWithOptions(QueryCommonCustInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommonCustInfo"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommonCustInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询客户信息</p>
     * 
     * @param request QueryCommonCustInfoRequest
     * @return QueryCommonCustInfoResponse
     */
    public QueryCommonCustInfoResponse queryCommonCustInfo(QueryCommonCustInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCommonCustInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryCommonStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCommonStatisticResponse
     */
    public QueryCommonStatisticResponse queryCommonStatisticWithOptions(QueryCommonStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommonStatistic"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommonStatisticResponse());
    }

    /**
     * @param request QueryCommonStatisticRequest
     * @return QueryCommonStatisticResponse
     */
    public QueryCommonStatisticResponse queryCommonStatistic(QueryCommonStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCommonStatisticWithOptions(request, runtime);
    }

    /**
     * @param request QueryCommonStatisticPreviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCommonStatisticPreviewResponse
     */
    public QueryCommonStatisticPreviewResponse queryCommonStatisticPreviewWithOptions(QueryCommonStatisticPreviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommonStatisticPreview"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommonStatisticPreviewResponse());
    }

    /**
     * @param request QueryCommonStatisticPreviewRequest
     * @return QueryCommonStatisticPreviewResponse
     */
    public QueryCommonStatisticPreviewResponse queryCommonStatisticPreview(QueryCommonStatisticPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCommonStatisticPreviewWithOptions(request, runtime);
    }

    /**
     * @param request QueryDayuMigrateStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDayuMigrateStatusResponse
     */
    public QueryDayuMigrateStatusResponse queryDayuMigrateStatusWithOptions(QueryDayuMigrateStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDayuMigrateStatus"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDayuMigrateStatusResponse());
    }

    /**
     * @param request QueryDayuMigrateStatusRequest
     * @return QueryDayuMigrateStatusResponse
     */
    public QueryDayuMigrateStatusResponse queryDayuMigrateStatus(QueryDayuMigrateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDayuMigrateStatusWithOptions(request, runtime);
    }

    /**
     * @param request QueryDictDataItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDictDataItemResponse
     */
    public QueryDictDataItemResponse queryDictDataItemWithOptions(QueryDictDataItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classifyItemCode)) {
            query.put("ClassifyItemCode", request.classifyItemCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDictDataItem"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDictDataItemResponse());
    }

    /**
     * @param request QueryDictDataItemRequest
     * @return QueryDictDataItemResponse
     */
    public QueryDictDataItemResponse queryDictDataItem(QueryDictDataItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDictDataItemWithOptions(request, runtime);
    }

    /**
     * @param request QueryGateVerifyBillingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGateVerifyBillingResponse
     */
    public QueryGateVerifyBillingResponse queryGateVerifyBillingWithOptions(QueryGateVerifyBillingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationType)) {
            query.put("AuthenticationType", request.authenticationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.month)) {
            query.put("Month", request.month);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGateVerifyBilling"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGateVerifyBillingResponse());
    }

    /**
     * @param request QueryGateVerifyBillingRequest
     * @return QueryGateVerifyBillingResponse
     */
    public QueryGateVerifyBillingResponse queryGateVerifyBilling(QueryGateVerifyBillingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGateVerifyBillingWithOptions(request, runtime);
    }

    /**
     * @param request QueryGateVerifyRecordListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGateVerifyRecordListResponse
     */
    public QueryGateVerifyRecordListResponse queryGateVerifyRecordListWithOptions(QueryGateVerifyRecordListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationType)) {
            query.put("AuthenticationType", request.authenticationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNum)) {
            query.put("PhoneNum", request.phoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDate)) {
            query.put("QueryDate", request.queryDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGateVerifyRecordList"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGateVerifyRecordListResponse());
    }

    /**
     * @param request QueryGateVerifyRecordListRequest
     * @return QueryGateVerifyRecordListResponse
     */
    public QueryGateVerifyRecordListResponse queryGateVerifyRecordList(QueryGateVerifyRecordListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGateVerifyRecordListWithOptions(request, runtime);
    }

    /**
     * @param request QueryGateVerifyStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGateVerifyStatisticResponse
     */
    public QueryGateVerifyStatisticResponse queryGateVerifyStatisticWithOptions(QueryGateVerifyStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationType)) {
            query.put("AuthenticationType", request.authenticationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGateVerifyStatistic"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGateVerifyStatisticResponse());
    }

    /**
     * @param request QueryGateVerifyStatisticRequest
     * @return QueryGateVerifyStatisticResponse
     */
    public QueryGateVerifyStatisticResponse queryGateVerifyStatistic(QueryGateVerifyStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGateVerifyStatisticWithOptions(request, runtime);
    }

    /**
     * @param request QueryPnsConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPnsConfigResponse
     */
    public QueryPnsConfigResponse queryPnsConfigWithOptions(QueryPnsConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPnsConfig"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPnsConfigResponse());
    }

    /**
     * @param request QueryPnsConfigRequest
     * @return QueryPnsConfigResponse
     */
    public QueryPnsConfigResponse queryPnsConfig(QueryPnsConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPnsConfigWithOptions(request, runtime);
    }

    /**
     * @param request QueryPnsPackageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPnsPackageDetailResponse
     */
    public QueryPnsPackageDetailResponse queryPnsPackageDetailWithOptions(QueryPnsPackageDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPnsPackageDetail"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPnsPackageDetailResponse());
    }

    /**
     * @param request QueryPnsPackageDetailRequest
     * @return QueryPnsPackageDetailResponse
     */
    public QueryPnsPackageDetailResponse queryPnsPackageDetail(QueryPnsPackageDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPnsPackageDetailWithOptions(request, runtime);
    }

    /**
     * @param request QueryPnsPackageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPnsPackageListResponse
     */
    public QueryPnsPackageListResponse queryPnsPackageListWithOptions(QueryPnsPackageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billCycle)) {
            query.put("BillCycle", request.billCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPnsPackageList"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPnsPackageListResponse());
    }

    /**
     * @param request QueryPnsPackageListRequest
     * @return QueryPnsPackageListResponse
     */
    public QueryPnsPackageListResponse queryPnsPackageList(QueryPnsPackageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPnsPackageListWithOptions(request, runtime);
    }

    /**
     * @param request QueryPnsPackageStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPnsPackageStatisticsResponse
     */
    public QueryPnsPackageStatisticsResponse queryPnsPackageStatisticsWithOptions(QueryPnsPackageStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPnsPackageStatistics"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPnsPackageStatisticsResponse());
    }

    /**
     * @param request QueryPnsPackageStatisticsRequest
     * @return QueryPnsPackageStatisticsResponse
     */
    public QueryPnsPackageStatisticsResponse queryPnsPackageStatistics(QueryPnsPackageStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPnsPackageStatisticsWithOptions(request, runtime);
    }

    /**
     * @param request QuerySceneListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySceneListResponse
     */
    public QuerySceneListResponse querySceneListWithOptions(QuerySceneListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySceneList"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySceneListResponse());
    }

    /**
     * @param request QuerySceneListRequest
     * @return QuerySceneListResponse
     */
    public QuerySceneListResponse querySceneList(QuerySceneListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySceneListWithOptions(request, runtime);
    }

    /**
     * @param request QuerySdkVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySdkVersionResponse
     */
    public QuerySdkVersionResponse querySdkVersionWithOptions(QuerySdkVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("customerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("prodCode", request.prodCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySdkVersion"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySdkVersionResponse());
    }

    /**
     * @param request QuerySdkVersionRequest
     * @return QuerySdkVersionResponse
     */
    public QuerySdkVersionResponse querySdkVersion(QuerySdkVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySdkVersionWithOptions(request, runtime);
    }

    /**
     * @param request QueryTagStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTagStatusResponse
     */
    public QueryTagStatusResponse queryTagStatusWithOptions(QueryTagStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attrKey)) {
            query.put("AttrKey", request.attrKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTagStatus"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTagStatusResponse());
    }

    /**
     * @param request QueryTagStatusRequest
     * @return QueryTagStatusResponse
     */
    public QueryTagStatusResponse queryTagStatus(QueryTagStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTagStatusWithOptions(request, runtime);
    }

    /**
     * @param request RemoveGateVerifyExportLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveGateVerifyExportLogResponse
     */
    public RemoveGateVerifyExportLogResponse removeGateVerifyExportLogWithOptions(RemoveGateVerifyExportLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveGateVerifyExportLog"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveGateVerifyExportLogResponse());
    }

    /**
     * @param request RemoveGateVerifyExportLogRequest
     * @return RemoveGateVerifyExportLogResponse
     */
    public RemoveGateVerifyExportLogResponse removeGateVerifyExportLog(RemoveGateVerifyExportLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeGateVerifyExportLogWithOptions(request, runtime);
    }

    /**
     * @param request SubmitEnterpriseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitEnterpriseInfoResponse
     */
    public SubmitEnterpriseInfoResponse submitEnterpriseInfoWithOptions(SubmitEnterpriseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessLicenseAddress)) {
            query.put("BusinessLicenseAddress", request.businessLicenseAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessLicensePicture)) {
            query.put("BusinessLicensePicture", request.businessLicensePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseName)) {
            query.put("EnterpriseName", request.enterpriseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertNumber)) {
            query.put("LegalPersonCertNumber", request.legalPersonCertNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertPicture)) {
            query.put("LegalPersonCertPicture", request.legalPersonCertPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonName)) {
            query.put("LegalPersonName", request.legalPersonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerCertNumber)) {
            query.put("ManagerCertNumber", request.managerCertNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerCertPicture)) {
            query.put("ManagerCertPicture", request.managerCertPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerContactNumber)) {
            query.put("ManagerContactNumber", request.managerContactNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerName)) {
            query.put("ManagerName", request.managerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberApplicationLetterPicture)) {
            query.put("NumberApplicationLetterPicture", request.numberApplicationLetterPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationCode)) {
            query.put("OrganizationCode", request.organizationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.undertakingPicture)) {
            query.put("UndertakingPicture", request.undertakingPicture);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitEnterpriseInfo"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitEnterpriseInfoResponse());
    }

    /**
     * @param request SubmitEnterpriseInfoRequest
     * @return SubmitEnterpriseInfoResponse
     */
    public SubmitEnterpriseInfoResponse submitEnterpriseInfo(SubmitEnterpriseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitEnterpriseInfoWithOptions(request, runtime);
    }

    /**
     * @param request UpdateExportLogStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExportLogStateResponse
     */
    public UpdateExportLogStateResponse updateExportLogStateWithOptions(UpdateExportLogStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExportLogState"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExportLogStateResponse());
    }

    /**
     * @param request UpdateExportLogStateRequest
     * @return UpdateExportLogStateResponse
     */
    public UpdateExportLogStateResponse updateExportLogState(UpdateExportLogStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateExportLogStateWithOptions(request, runtime);
    }

    /**
     * @param request UpdateSmsCodeLimitConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmsCodeLimitConfigResponse
     */
    public UpdateSmsCodeLimitConfigResponse updateSmsCodeLimitConfigWithOptions(UpdateSmsCodeLimitConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limitDay)) {
            query.put("LimitDay", request.limitDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitHour)) {
            query.put("LimitHour", request.limitHour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitId)) {
            query.put("LimitId", request.limitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitMinute)) {
            query.put("LimitMinute", request.limitMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitOther)) {
            query.put("LimitOther", request.limitOther);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmsCodeLimitConfig"),
            new TeaPair("version", "2017-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmsCodeLimitConfigResponse());
    }

    /**
     * @param request UpdateSmsCodeLimitConfigRequest
     * @return UpdateSmsCodeLimitConfigResponse
     */
    public UpdateSmsCodeLimitConfigResponse updateSmsCodeLimitConfig(UpdateSmsCodeLimitConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmsCodeLimitConfigWithOptions(request, runtime);
    }
}
