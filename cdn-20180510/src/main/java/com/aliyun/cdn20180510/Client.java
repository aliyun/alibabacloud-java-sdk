// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510;

import com.aliyun.tea.*;
import com.aliyun.cdn20180510.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "cdn.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cdn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>  You must activate Alibaba Cloud CDN before you can add a domain name to it. For more information, see <a href="https://help.aliyun.com/document_detail/27272.html">Activate Alibaba Cloud CDN</a>.</p>
     * <ul>
     * <li>The domain name that you want to add has a valid Internet Content Provider (ICP) number.</li>
     * <li>You can add only one domain name to Alibaba Cloud CDN in each call. Each Alibaba Cloud account can add a maximum of 50 domain names to Alibaba Cloud CDN.</li>
     * <li>If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review will be completed by the end of the next business day after you submit the application.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name to accelerate.</p>
     * 
     * @param request AddCdnDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCdnDomainResponse
     */
    public AddCdnDomainResponse addCdnDomainWithOptions(AddCdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdnType)) {
            query.put("CdnType", request.cdnType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkUrl)) {
            query.put("CheckUrl", request.checkUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCdnDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You must activate Alibaba Cloud CDN before you can add a domain name to it. For more information, see <a href="https://help.aliyun.com/document_detail/27272.html">Activate Alibaba Cloud CDN</a>.</p>
     * <ul>
     * <li>The domain name that you want to add has a valid Internet Content Provider (ICP) number.</li>
     * <li>You can add only one domain name to Alibaba Cloud CDN in each call. Each Alibaba Cloud account can add a maximum of 50 domain names to Alibaba Cloud CDN.</li>
     * <li>If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review will be completed by the end of the next business day after you submit the application.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name to accelerate.</p>
     * 
     * @param request AddCdnDomainRequest
     * @return AddCdnDomainResponse
     */
    public AddCdnDomainResponse addCdnDomain(AddCdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a Function Compute trigger.</p>
     * 
     * @param request AddFCTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFCTriggerResponse
     */
    public AddFCTriggerResponse addFCTriggerWithOptions(AddFCTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.triggerARN)) {
            query.put("TriggerARN", request.triggerARN);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventMetaName)) {
            body.put("EventMetaName", request.eventMetaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventMetaVersion)) {
            body.put("EventMetaVersion", request.eventMetaVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionARN)) {
            body.put("FunctionARN", request.functionARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notes)) {
            body.put("Notes", request.notes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleARN)) {
            body.put("RoleARN", request.roleARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceARN)) {
            body.put("SourceARN", request.sourceARN);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFCTriggerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a Function Compute trigger.</p>
     * 
     * @param request AddFCTriggerRequest
     * @return AddFCTriggerResponse
     */
    public AddFCTriggerResponse addFCTrigger(AddFCTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFCTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You must activate Alibaba Cloud CDN before you can add a domain name to it. For more information, see <a href="https://help.aliyun.com/document_detail/27272.html">Activate Alibaba Cloud CDN</a>.</p>
     * <ul>
     * <li>If the acceleration region is Chinese Mainland Only or Global, you must apply for an ICP filing for the domain name.</li>
     * <li>You can specify multiple domain names and separate them with commas (,). You can specify at most 50 domain names in each call.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/122181.html">Add a domain name</a>.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more domain names to Alibaba Cloud CDN. You can add a maximum of 50 domain names at a time.</p>
     * 
     * @param request BatchAddCdnDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchAddCdnDomainResponse
     */
    public BatchAddCdnDomainResponse batchAddCdnDomainWithOptions(BatchAddCdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdnType)) {
            query.put("CdnType", request.cdnType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkUrl)) {
            query.put("CheckUrl", request.checkUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddCdnDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You must activate Alibaba Cloud CDN before you can add a domain name to it. For more information, see <a href="https://help.aliyun.com/document_detail/27272.html">Activate Alibaba Cloud CDN</a>.</p>
     * <ul>
     * <li>If the acceleration region is Chinese Mainland Only or Global, you must apply for an ICP filing for the domain name.</li>
     * <li>You can specify multiple domain names and separate them with commas (,). You can specify at most 50 domain names in each call.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/122181.html">Add a domain name</a>.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more domain names to Alibaba Cloud CDN. You can add a maximum of 50 domain names at a time.</p>
     * 
     * @param request BatchAddCdnDomainRequest
     * @return BatchAddCdnDomainResponse
     */
    public BatchAddCdnDomainResponse batchAddCdnDomain(BatchAddCdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchAddCdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can specify up to 50 domain names in each request.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes configurations of multiple accelerated domain names at a time.</p>
     * 
     * @param request BatchDeleteCdnDomainConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteCdnDomainConfigResponse
     */
    public BatchDeleteCdnDomainConfigResponse batchDeleteCdnDomainConfigWithOptions(BatchDeleteCdnDomainConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteCdnDomainConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteCdnDomainConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can specify up to 50 domain names in each request.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes configurations of multiple accelerated domain names at a time.</p>
     * 
     * @param request BatchDeleteCdnDomainConfigRequest
     * @return BatchDeleteCdnDomainConfigResponse
     */
    public BatchDeleteCdnDomainConfigResponse batchDeleteCdnDomainConfig(BatchDeleteCdnDomainConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteCdnDomainConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum number of times that each user can call this operation per second is 20.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether one or more IP addresses are assigned to Alibaba Cloud CDN.</p>
     * 
     * @param request BatchDescribeCdnIpInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDescribeCdnIpInfoResponse
     */
    public BatchDescribeCdnIpInfoResponse batchDescribeCdnIpInfoWithOptions(BatchDescribeCdnIpInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipAddrList)) {
            query.put("IpAddrList", request.ipAddrList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDescribeCdnIpInfo"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDescribeCdnIpInfoResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum number of times that each user can call this operation per second is 20.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries whether one or more IP addresses are assigned to Alibaba Cloud CDN.</p>
     * 
     * @param request BatchDescribeCdnIpInfoRequest
     * @return BatchDescribeCdnIpInfoResponse
     */
    public BatchDescribeCdnIpInfoResponse batchDescribeCdnIpInfo(BatchDescribeCdnIpInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDescribeCdnIpInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * <ul>
     * <li>You can specify multiple domain names and must separate them with commas (,). You can specify up to 50 domain names in each call.</li>
     * <li>If the BatchSetCdnDomainConfig operation is successful, a unique configuration ID (ConfigId) is generated. You can use configuration IDs to update or delete configurations. For more information, see <a href="https://help.aliyun.com/document_detail/388994.html">Usage notes on ConfigId</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures multiple accelerated domain names at a time.</p>
     * 
     * @param request BatchSetCdnDomainConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSetCdnDomainConfigResponse
     */
    public BatchSetCdnDomainConfigResponse batchSetCdnDomainConfigWithOptions(BatchSetCdnDomainConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functions)) {
            query.put("Functions", request.functions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetCdnDomainConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetCdnDomainConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * <ul>
     * <li>You can specify multiple domain names and must separate them with commas (,). You can specify up to 50 domain names in each call.</li>
     * <li>If the BatchSetCdnDomainConfig operation is successful, a unique configuration ID (ConfigId) is generated. You can use configuration IDs to update or delete configurations. For more information, see <a href="https://help.aliyun.com/document_detail/388994.html">Usage notes on ConfigId</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures multiple accelerated domain names at a time.</p>
     * 
     * @param request BatchSetCdnDomainConfigRequest
     * @return BatchSetCdnDomainConfigResponse
     */
    public BatchSetCdnDomainConfigResponse batchSetCdnDomainConfig(BatchSetCdnDomainConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetCdnDomainConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * <li>You can specify up to 10 domain names in each request. Separate multiple domain names with commas (,)</li>
     * <li>If the service type of a domain name is live streaming, the service may be unavailable after you configure the certificate for the domain name. Therefore, you cannot use this operation to configure the certificate for a domain name that is used for live streaming.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables, disables, or configures the SSL certificates of one or more accelerated domain names at a time.</p>
     * 
     * @param request BatchSetCdnDomainServerCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSetCdnDomainServerCertificateResponse
     */
    public BatchSetCdnDomainServerCertificateResponse batchSetCdnDomainServerCertificateWithOptions(BatchSetCdnDomainServerCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceSet)) {
            query.put("ForceSet", request.forceSet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPri)) {
            query.put("SSLPri", request.SSLPri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLProtocol)) {
            query.put("SSLProtocol", request.SSLProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPub)) {
            query.put("SSLPub", request.SSLPub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetCdnDomainServerCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetCdnDomainServerCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * <li>You can specify up to 10 domain names in each request. Separate multiple domain names with commas (,)</li>
     * <li>If the service type of a domain name is live streaming, the service may be unavailable after you configure the certificate for the domain name. Therefore, you cannot use this operation to configure the certificate for a domain name that is used for live streaming.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables, disables, or configures the SSL certificates of one or more accelerated domain names at a time.</p>
     * 
     * @param request BatchSetCdnDomainServerCertificateRequest
     * @return BatchSetCdnDomainServerCertificateResponse
     */
    public BatchSetCdnDomainServerCertificateResponse batchSetCdnDomainServerCertificate(BatchSetCdnDomainServerCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetCdnDomainServerCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If a domain name specified in the request is in an invalid state or your account has an overdue payment, the domain name cannot be enabled.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables one or more domain names at a time. After a domain name is enabled, the value of the DomainStatus parameter is changed to Online.</p>
     * 
     * @param request BatchStartCdnDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchStartCdnDomainResponse
     */
    public BatchStartCdnDomainResponse batchStartCdnDomainWithOptions(BatchStartCdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStartCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStartCdnDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If a domain name specified in the request is in an invalid state or your account has an overdue payment, the domain name cannot be enabled.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables one or more domain names at a time. After a domain name is enabled, the value of the DomainStatus parameter is changed to Online.</p>
     * 
     * @param request BatchStartCdnDomainRequest
     * @return BatchStartCdnDomainResponse
     */
    public BatchStartCdnDomainResponse batchStartCdnDomain(BatchStartCdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartCdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After an accelerated domain name is disabled, Alibaba Cloud CDN retains its information and reroutes all the requests that are destined for the accelerated domain name to the origin.</p>
     * <ul>
     * <li>If you need to temporarily disable CDN acceleration for a domain name, we recommend that you call the StopDomain operation.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables one or more accelerated domain names at a time. After an accelerated domain name is disabled, the value of the DomainStatus parameter is changed to Offline.</p>
     * 
     * @param request BatchStopCdnDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchStopCdnDomainResponse
     */
    public BatchStopCdnDomainResponse batchStopCdnDomainWithOptions(BatchStopCdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStopCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStopCdnDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After an accelerated domain name is disabled, Alibaba Cloud CDN retains its information and reroutes all the requests that are destined for the accelerated domain name to the origin.</p>
     * <ul>
     * <li>If you need to temporarily disable CDN acceleration for a domain name, we recommend that you call the StopDomain operation.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables one or more accelerated domain names at a time. After an accelerated domain name is disabled, the value of the DomainStatus parameter is changed to Offline.</p>
     * 
     * @param request BatchStopCdnDomainRequest
     * @return BatchStopCdnDomainResponse
     */
    public BatchStopCdnDomainResponse batchStopCdnDomain(BatchStopCdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopCdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * <ul>
     * <li>You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of multiple accelerated domain names at a time.</p>
     * 
     * @param request BatchUpdateCdnDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateCdnDomainResponse
     */
    public BatchUpdateCdnDomainResponse batchUpdateCdnDomainWithOptions(BatchUpdateCdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateCdnDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * <ul>
     * <li>You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of multiple accelerated domain names at a time.</p>
     * 
     * @param request BatchUpdateCdnDomainRequest
     * @return BatchUpdateCdnDomainResponse
     */
    public BatchUpdateCdnDomainResponse batchUpdateCdnDomain(BatchUpdateCdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUpdateCdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers the dynamic routing feature of Dynamic Content Delivery Network (DCDN) for an Alibaba Cloud CDN-accelerated domain name. After the registration is successful, the routing center generates the dynamic routing information and send it to DCDN points of presence (POPs). This is a prerequisite for you to transfer a domain name from Alibaba Cloud CDN to DCDN.</p>
     * 
     * @param request CdnMigrateRegisterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CdnMigrateRegisterResponse
     */
    public CdnMigrateRegisterResponse cdnMigrateRegisterWithOptions(CdnMigrateRegisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CdnMigrateRegister"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CdnMigrateRegisterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Registers the dynamic routing feature of Dynamic Content Delivery Network (DCDN) for an Alibaba Cloud CDN-accelerated domain name. After the registration is successful, the routing center generates the dynamic routing information and send it to DCDN points of presence (POPs). This is a prerequisite for you to transfer a domain name from Alibaba Cloud CDN to DCDN.</p>
     * 
     * @param request CdnMigrateRegisterRequest
     * @return CdnMigrateRegisterResponse
     */
    public CdnMigrateRegisterResponse cdnMigrateRegister(CdnMigrateRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cdnMigrateRegisterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Transfer a domain name from Alibaba Cloud CDN to DCDN.</p>
     * 
     * @param request ChangeCdnDomainToDcdnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeCdnDomainToDcdnResponse
     */
    public ChangeCdnDomainToDcdnResponse changeCdnDomainToDcdnWithOptions(ChangeCdnDomainToDcdnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeCdnDomainToDcdn"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeCdnDomainToDcdnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Transfer a domain name from Alibaba Cloud CDN to DCDN.</p>
     * 
     * @param request ChangeCdnDomainToDcdnRequest
     * @return ChangeCdnDomainToDcdnResponse
     */
    public ChangeCdnDomainToDcdnResponse changeCdnDomainToDcdn(ChangeCdnDomainToDcdnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeCdnDomainToDcdnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a domain name exists.</p>
     * 
     * @param request CheckCdnDomainExistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckCdnDomainExistResponse
     */
    public CheckCdnDomainExistResponse checkCdnDomainExistWithOptions(CheckCdnDomainExistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCdnDomainExist"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCdnDomainExistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a domain name exists.</p>
     * 
     * @param request CheckCdnDomainExistRequest
     * @return CheckCdnDomainExistResponse
     */
    public CheckCdnDomainExistResponse checkCdnDomainExist(CheckCdnDomainExistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCdnDomainExistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an ICP filing is obtained for the domain name.</p>
     * 
     * @param request CheckCdnDomainICPRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckCdnDomainICPResponse
     */
    public CheckCdnDomainICPResponse checkCdnDomainICPWithOptions(CheckCdnDomainICPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCdnDomainICP"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCdnDomainICPResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an ICP filing is obtained for the domain name.</p>
     * 
     * @param request CheckCdnDomainICPRequest
     * @return CheckCdnDomainICPResponse
     */
    public CheckCdnDomainICPResponse checkCdnDomainICP(CheckCdnDomainICPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCdnDomainICPWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a certificate signing request (CSR).</p>
     * 
     * @param request CreateCdnCertificateSigningRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCdnCertificateSigningRequestResponse
     */
    public CreateCdnCertificateSigningRequestResponse createCdnCertificateSigningRequestWithOptions(CreateCdnCertificateSigningRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            query.put("CommonName", request.commonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationUnit)) {
            query.put("OrganizationUnit", request.organizationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SANs)) {
            query.put("SANs", request.SANs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCdnCertificateSigningRequest"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCdnCertificateSigningRequestResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a certificate signing request (CSR).</p>
     * 
     * @param request CreateCdnCertificateSigningRequestRequest
     * @return CreateCdnCertificateSigningRequestResponse
     */
    public CreateCdnCertificateSigningRequestResponse createCdnCertificateSigningRequest(CreateCdnCertificateSigningRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCdnCertificateSigningRequestWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a tracking task. After you create a tracking task, the system sends operations reports to you by email on a regular basis.</p>
     * 
     * @param request CreateCdnDeliverTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCdnDeliverTaskResponse
     */
    public CreateCdnDeliverTaskResponse createCdnDeliverTaskWithOptions(CreateCdnDeliverTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliver)) {
            body.put("Deliver", request.deliver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reports)) {
            body.put("Reports", request.reports);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("Schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCdnDeliverTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCdnDeliverTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a tracking task. After you create a tracking task, the system sends operations reports to you by email on a regular basis.</p>
     * 
     * @param request CreateCdnDeliverTaskRequest
     * @return CreateCdnDeliverTaskResponse
     */
    public CreateCdnDeliverTaskResponse createCdnDeliverTask(CreateCdnDeliverTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCdnDeliverTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation allows you to create a custom operations report for a specific domain name. You can view the statistics about the domain name in the report.</p>
     * <ul>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom operations report.</p>
     * 
     * @param request CreateCdnSubTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCdnSubTaskResponse
     */
    public CreateCdnSubTaskResponse createCdnSubTaskWithOptions(CreateCdnSubTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportIds)) {
            body.put("ReportIds", request.reportIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCdnSubTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCdnSubTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation allows you to create a custom operations report for a specific domain name. You can view the statistics about the domain name in the report.</p>
     * <ul>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom operations report.</p>
     * 
     * @param request CreateCdnSubTaskRequest
     * @return CreateCdnSubTaskResponse
     */
    public CreateCdnSubTaskResponse createCdnSubTask(CreateCdnSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCdnSubTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this API operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables real-time log delivery for specific accelerated domain names.</p>
     * 
     * @param request CreateRealTimeLogDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRealTimeLogDeliveryResponse
     */
    public CreateRealTimeLogDeliveryResponse createRealTimeLogDeliveryWithOptions(CreateRealTimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRealTimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRealTimeLogDeliveryResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this API operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables real-time log delivery for specific accelerated domain names.</p>
     * 
     * @param request CreateRealTimeLogDeliveryRequest
     * @return CreateRealTimeLogDeliveryResponse
     */
    public CreateRealTimeLogDeliveryResponse createRealTimeLogDelivery(CreateRealTimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRealTimeLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can create a task to query data in the last year. The maximum time range that can be queried is one month.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to export resource usage details to an Excel file.</p>
     * 
     * @param request CreateUsageDetailDataExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUsageDetailDataExportTaskResponse
     */
    public CreateUsageDetailDataExportTaskResponse createUsageDetailDataExportTaskWithOptions(CreateUsageDetailDataExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUsageDetailDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUsageDetailDataExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can create a task to query data in the last year. The maximum time range that can be queried is one month.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to export resource usage details to an Excel file.</p>
     * 
     * @param request CreateUsageDetailDataExportTaskRequest
     * @return CreateUsageDetailDataExportTaskResponse
     */
    public CreateUsageDetailDataExportTaskResponse createUsageDetailDataExportTask(CreateUsageDetailDataExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUsageDetailDataExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can create a task to query data in the last year. The maximum time range that can be queried is one month.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to export your resource usage history to a PDF file.</p>
     * 
     * @param request CreateUserUsageDataExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserUsageDataExportTaskResponse
     */
    public CreateUserUsageDataExportTaskResponse createUserUsageDataExportTaskWithOptions(CreateUserUsageDataExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserUsageDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserUsageDataExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can create a task to query data in the last year. The maximum time range that can be queried is one month.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to export your resource usage history to a PDF file.</p>
     * 
     * @param request CreateUserUsageDataExportTaskRequest
     * @return CreateUserUsageDataExportTaskResponse
     */
    public CreateUserUsageDataExportTaskResponse createUserUsageDataExportTask(CreateUserUsageDataExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserUsageDataExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes tracking tasks by task ID.</p>
     * 
     * @param request DeleteCdnDeliverTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCdnDeliverTaskResponse
     */
    public DeleteCdnDeliverTaskResponse deleteCdnDeliverTaskWithOptions(DeleteCdnDeliverTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliverId)) {
            query.put("DeliverId", request.deliverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCdnDeliverTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCdnDeliverTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes tracking tasks by task ID.</p>
     * 
     * @param request DeleteCdnDeliverTaskRequest
     * @return DeleteCdnDeliverTaskResponse
     */
    public DeleteCdnDeliverTaskResponse deleteCdnDeliverTask(DeleteCdnDeliverTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCdnDeliverTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  We recommend that you add an A record for the domain name in the system of your DNS service provider before you remove the domain name from Alibaba Cloud CDN. Otherwise, the domain name may become inaccessible. Proceed with caution.</p>
     * <ul>
     * <li>After you successfully call the DeleteCdnDomain operation, all records of the removed domain name are deleted. If you need to only disable the domain name, we recommend that you call the StopCdnDomain operation.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes an accelerated domain name from Alibaba Cloud CDN.</p>
     * 
     * @param request DeleteCdnDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCdnDomainResponse
     */
    public DeleteCdnDomainResponse deleteCdnDomainWithOptions(DeleteCdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCdnDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>  We recommend that you add an A record for the domain name in the system of your DNS service provider before you remove the domain name from Alibaba Cloud CDN. Otherwise, the domain name may become inaccessible. Proceed with caution.</p>
     * <ul>
     * <li>After you successfully call the DeleteCdnDomain operation, all records of the removed domain name are deleted. If you need to only disable the domain name, we recommend that you call the StopCdnDomain operation.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes an accelerated domain name from Alibaba Cloud CDN.</p>
     * 
     * @param request DeleteCdnDomainRequest
     * @return DeleteCdnDomainResponse
     */
    public DeleteCdnDomainResponse deleteCdnDomain(DeleteCdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this API operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request DeleteCdnSubTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCdnSubTaskResponse
     */
    public DeleteCdnSubTaskResponse deleteCdnSubTaskWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCdnSubTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCdnSubTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this API operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * @return DeleteCdnSubTaskResponse
     */
    public DeleteCdnSubTaskResponse deleteCdnSubTask() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCdnSubTaskWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified Function Compute trigger.</p>
     * 
     * @param request DeleteFCTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFCTriggerResponse
     */
    public DeleteFCTriggerResponse deleteFCTriggerWithOptions(DeleteFCTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.triggerARN)) {
            query.put("TriggerARN", request.triggerARN);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFCTriggerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified Function Compute trigger.</p>
     * 
     * @param request DeleteFCTriggerRequest
     * @return DeleteFCTriggerResponse
     */
    public DeleteFCTriggerResponse deleteFCTrigger(DeleteFCTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFCTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the Logstore that is used by a specified configuration record of real-time log delivery.</p>
     * 
     * @param request DeleteRealTimeLogLogstoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRealTimeLogLogstoreResponse
     */
    public DeleteRealTimeLogLogstoreResponse deleteRealTimeLogLogstoreWithOptions(DeleteRealTimeLogLogstoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRealTimeLogLogstore"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRealTimeLogLogstoreResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the Logstore that is used by a specified configuration record of real-time log delivery.</p>
     * 
     * @param request DeleteRealTimeLogLogstoreRequest
     * @return DeleteRealTimeLogLogstoreResponse
     */
    public DeleteRealTimeLogLogstoreResponse deleteRealTimeLogLogstore(DeleteRealTimeLogLogstoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRealTimeLogLogstoreWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configurations of real-time log delivery for specific accelerated domain names.</p>
     * 
     * @param request DeleteRealtimeLogDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRealtimeLogDeliveryResponse
     */
    public DeleteRealtimeLogDeliveryResponse deleteRealtimeLogDeliveryWithOptions(DeleteRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRealtimeLogDeliveryResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configurations of real-time log delivery for specific accelerated domain names.</p>
     * 
     * @param request DeleteRealtimeLogDeliveryRequest
     * @return DeleteRealtimeLogDeliveryResponse
     */
    public DeleteRealtimeLogDeliveryResponse deleteRealtimeLogDelivery(DeleteRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRealtimeLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes specified configurations of an accelerated domain name.</p>
     * 
     * @param request DeleteSpecificConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSpecificConfigResponse
     */
    public DeleteSpecificConfigResponse deleteSpecificConfigWithOptions(DeleteSpecificConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSpecificConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSpecificConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes specified configurations of an accelerated domain name.</p>
     * 
     * @param request DeleteSpecificConfigRequest
     * @return DeleteSpecificConfigResponse
     */
    public DeleteSpecificConfigResponse deleteSpecificConfig(DeleteSpecificConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSpecificConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified configuration of the staging environment.</p>
     * 
     * @param request DeleteSpecificStagingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSpecificStagingConfigResponse
     */
    public DeleteSpecificStagingConfigResponse deleteSpecificStagingConfigWithOptions(DeleteSpecificStagingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSpecificStagingConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSpecificStagingConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified configuration of the staging environment.</p>
     * 
     * @param request DeleteSpecificStagingConfigRequest
     * @return DeleteSpecificStagingConfigResponse
     */
    public DeleteSpecificStagingConfigResponse deleteSpecificStagingConfig(DeleteSpecificStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSpecificStagingConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a task that was used to export usage details.</p>
     * 
     * @param request DeleteUsageDetailDataExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUsageDetailDataExportTaskResponse
     */
    public DeleteUsageDetailDataExportTaskResponse deleteUsageDetailDataExportTaskWithOptions(DeleteUsageDetailDataExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUsageDetailDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUsageDetailDataExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a task that was used to export usage details.</p>
     * 
     * @param request DeleteUsageDetailDataExportTaskRequest
     * @return DeleteUsageDetailDataExportTaskResponse
     */
    public DeleteUsageDetailDataExportTaskResponse deleteUsageDetailDataExportTask(DeleteUsageDetailDataExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUsageDetailDataExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a task that was used to export usage history.</p>
     * 
     * @param request DeleteUserUsageDataExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserUsageDataExportTaskResponse
     */
    public DeleteUserUsageDataExportTaskResponse deleteUserUsageDataExportTaskWithOptions(DeleteUserUsageDataExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserUsageDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserUsageDataExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a task that was used to export usage history.</p>
     * 
     * @param request DeleteUserUsageDataExportTaskRequest
     * @return DeleteUserUsageDataExportTaskResponse
     */
    public DeleteUserUsageDataExportTaskResponse deleteUserUsageDataExportTask(DeleteUserUsageDataExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserUsageDataExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries countries and regions that can be added to the blacklist.</p>
     * 
     * @param request DescribeBlockedRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockedRegionsResponse
     */
    public DescribeBlockedRegionsResponse describeBlockedRegionsWithOptions(DescribeBlockedRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockedRegions"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockedRegionsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries countries and regions that can be added to the blacklist.</p>
     * 
     * @param request DescribeBlockedRegionsRequest
     * @return DescribeBlockedRegionsResponse
     */
    public DescribeBlockedRegionsResponse describeBlockedRegions(DescribeBlockedRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockedRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about an SSL certificate.</p>
     * 
     * @param request DescribeCdnCertificateDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnCertificateDetailResponse
     */
    public DescribeCdnCertificateDetailResponse describeCdnCertificateDetailWithOptions(DescribeCdnCertificateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnCertificateDetail"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnCertificateDetailResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about an SSL certificate.</p>
     * 
     * @param request DescribeCdnCertificateDetailRequest
     * @return DescribeCdnCertificateDetailResponse
     */
    public DescribeCdnCertificateDetailResponse describeCdnCertificateDetail(DescribeCdnCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnCertificateDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries certificate details by certificate ID.</p>
     * 
     * @param request DescribeCdnCertificateDetailByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnCertificateDetailByIdResponse
     */
    public DescribeCdnCertificateDetailByIdResponse describeCdnCertificateDetailByIdWithOptions(DescribeCdnCertificateDetailByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRegion)) {
            query.put("CertRegion", request.certRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnCertificateDetailById"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnCertificateDetailByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries certificate details by certificate ID.</p>
     * 
     * @param request DescribeCdnCertificateDetailByIdRequest
     * @return DescribeCdnCertificateDetailByIdResponse
     */
    public DescribeCdnCertificateDetailByIdResponse describeCdnCertificateDetailById(DescribeCdnCertificateDetailByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnCertificateDetailByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificates of accelerated domain names.</p>
     * 
     * @deprecated OpenAPI DescribeCdnCertificateList is deprecated, please use Cdn::2018-05-10::DescribeCdnSSLCertificateList instead.
     * 
     * @param request DescribeCdnCertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnCertificateListResponse
     */
    @Deprecated
    // Deprecated
    public DescribeCdnCertificateListResponse describeCdnCertificateListWithOptions(DescribeCdnCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnCertificateList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnCertificateListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificates of accelerated domain names.</p>
     * 
     * @deprecated OpenAPI DescribeCdnCertificateList is deprecated, please use Cdn::2018-05-10::DescribeCdnSSLCertificateList instead.
     * 
     * @param request DescribeCdnCertificateListRequest
     * @return DescribeCdnCertificateListResponse
     */
    @Deprecated
    // Deprecated
    public DescribeCdnCertificateListResponse describeCdnCertificateList(DescribeCdnCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnCertificateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Internet service provider (ISP), region, and country that are required for advanced conditions.</p>
     * 
     * @param request DescribeCdnConditionIPBInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnConditionIPBInfoResponse
     */
    public DescribeCdnConditionIPBInfoResponse describeCdnConditionIPBInfoWithOptions(DescribeCdnConditionIPBInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnConditionIPBInfo"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnConditionIPBInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Internet service provider (ISP), region, and country that are required for advanced conditions.</p>
     * 
     * @param request DescribeCdnConditionIPBInfoRequest
     * @return DescribeCdnConditionIPBInfoResponse
     */
    public DescribeCdnConditionIPBInfoResponse describeCdnConditionIPBInfo(DescribeCdnConditionIPBInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnConditionIPBInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain names that are deleted from your account.</p>
     * 
     * @param request DescribeCdnDeletedDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnDeletedDomainsResponse
     */
    public DescribeCdnDeletedDomainsResponse describeCdnDeletedDomainsWithOptions(DescribeCdnDeletedDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDeletedDomains"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDeletedDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain names that are deleted from your account.</p>
     * 
     * @param request DescribeCdnDeletedDomainsRequest
     * @return DescribeCdnDeletedDomainsResponse
     */
    public DescribeCdnDeletedDomainsResponse describeCdnDeletedDomains(DescribeCdnDeletedDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDeletedDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 3 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more tracking tasks of operations reports.</p>
     * 
     * @param request DescribeCdnDeliverListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnDeliverListResponse
     */
    public DescribeCdnDeliverListResponse describeCdnDeliverListWithOptions(DescribeCdnDeliverListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliverId)) {
            query.put("DeliverId", request.deliverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDeliverList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDeliverListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 3 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more tracking tasks of operations reports.</p>
     * 
     * @param request DescribeCdnDeliverListRequest
     * @return DescribeCdnDeliverListResponse
     */
    public DescribeCdnDeliverListResponse describeCdnDeliverList(DescribeCdnDeliverListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDeliverListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>天翼定制化小时日志下载接口</p>
     * 
     * @param request DescribeCdnDomainAtoaLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnDomainAtoaLogsResponse
     */
    public DescribeCdnDomainAtoaLogsResponse describeCdnDomainAtoaLogsWithOptions(DescribeCdnDomainAtoaLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainAtoaLogs"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainAtoaLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>天翼定制化小时日志下载接口</p>
     * 
     * @param request DescribeCdnDomainAtoaLogsRequest
     * @return DescribeCdnDomainAtoaLogsResponse
     */
    public DescribeCdnDomainAtoaLogsResponse describeCdnDomainAtoaLogs(DescribeCdnDomainAtoaLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDomainAtoaLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries accelerated domain names by SSL certificate.</p>
     * 
     * @param request DescribeCdnDomainByCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnDomainByCertificateResponse
     */
    public DescribeCdnDomainByCertificateResponse describeCdnDomainByCertificateWithOptions(DescribeCdnDomainByCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exact)) {
            query.put("Exact", request.exact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPub)) {
            query.put("SSLPub", request.SSLPub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLStatus)) {
            query.put("SSLStatus", request.SSLStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainByCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainByCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries accelerated domain names by SSL certificate.</p>
     * 
     * @param request DescribeCdnDomainByCertificateRequest
     * @return DescribeCdnDomainByCertificateResponse
     */
    public DescribeCdnDomainByCertificateResponse describeCdnDomainByCertificate(DescribeCdnDomainByCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDomainByCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of an accelerated domain name. You can query the configurations of one or more features at the same time.</p>
     * 
     * @param request DescribeCdnDomainConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnDomainConfigsResponse
     */
    public DescribeCdnDomainConfigsResponse describeCdnDomainConfigsWithOptions(DescribeCdnDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainConfigs"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainConfigsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of an accelerated domain name. You can query the configurations of one or more features at the same time.</p>
     * 
     * @param request DescribeCdnDomainConfigsRequest
     * @return DescribeCdnDomainConfigsResponse
     */
    public DescribeCdnDomainConfigsResponse describeCdnDomainConfigs(DescribeCdnDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about an accelerated domain name.</p>
     * 
     * @param request DescribeCdnDomainDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnDomainDetailResponse
     */
    public DescribeCdnDomainDetailResponse describeCdnDomainDetailWithOptions(DescribeCdnDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainDetail"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainDetailResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about an accelerated domain name.</p>
     * 
     * @param request DescribeCdnDomainDetailRequest
     * @return DescribeCdnDomainDetailResponse
     */
    public DescribeCdnDomainDetailResponse describeCdnDomainDetail(DescribeCdnDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDomainDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set <strong>StartTime</strong> or <strong>EndTime</strong>, the request returns the data collected in the last 24 hours. If you set both <strong>StartTime</strong> and <strong>EndTime</strong>, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>The log data is collected every hour.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can query only logs in the last month. The start time and the current time cannot exceed 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the address where you can download the log data of a specific domain name.</p>
     * 
     * @param request DescribeCdnDomainLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnDomainLogsResponse
     */
    public DescribeCdnDomainLogsResponse describeCdnDomainLogsWithOptions(DescribeCdnDomainLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainLogs"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set <strong>StartTime</strong> or <strong>EndTime</strong>, the request returns the data collected in the last 24 hours. If you set both <strong>StartTime</strong> and <strong>EndTime</strong>, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>The log data is collected every hour.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can query only logs in the last month. The start time and the current time cannot exceed 31 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the address where you can download the log data of a specific domain name.</p>
     * 
     * @param request DescribeCdnDomainLogsRequest
     * @return DescribeCdnDomainLogsResponse
     */
    public DescribeCdnDomainLogsResponse describeCdnDomainLogs(DescribeCdnDomainLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDomainLogsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCdnDomainLogsExTtlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnDomainLogsExTtlResponse
     */
    public DescribeCdnDomainLogsExTtlResponse describeCdnDomainLogsExTtlWithOptions(DescribeCdnDomainLogsExTtlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainLogsExTtl"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainLogsExTtlResponse());
    }

    /**
     * @param request DescribeCdnDomainLogsExTtlRequest
     * @return DescribeCdnDomainLogsExTtlResponse
     */
    public DescribeCdnDomainLogsExTtlResponse describeCdnDomainLogsExTtl(DescribeCdnDomainLogsExTtlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDomainLogsExTtlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of features in the staging environment.</p>
     * 
     * @param request DescribeCdnDomainStagingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnDomainStagingConfigResponse
     */
    public DescribeCdnDomainStagingConfigResponse describeCdnDomainStagingConfigWithOptions(DescribeCdnDomainStagingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnDomainStagingConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnDomainStagingConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of features in the staging environment.</p>
     * 
     * @param request DescribeCdnDomainStagingConfigRequest
     * @return DescribeCdnDomainStagingConfigResponse
     */
    public DescribeCdnDomainStagingConfigResponse describeCdnDomainStagingConfig(DescribeCdnDomainStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDomainStagingConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取海量封禁全量配置</p>
     * 
     * @param request DescribeCdnFullDomainsBlockIPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnFullDomainsBlockIPConfigResponse
     */
    public DescribeCdnFullDomainsBlockIPConfigResponse describeCdnFullDomainsBlockIPConfigWithOptions(DescribeCdnFullDomainsBlockIPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.IPList)) {
            body.put("IPList", request.IPList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnFullDomainsBlockIPConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnFullDomainsBlockIPConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取海量封禁全量配置</p>
     * 
     * @param request DescribeCdnFullDomainsBlockIPConfigRequest
     * @return DescribeCdnFullDomainsBlockIPConfigResponse
     */
    public DescribeCdnFullDomainsBlockIPConfigResponse describeCdnFullDomainsBlockIPConfig(DescribeCdnFullDomainsBlockIPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnFullDomainsBlockIPConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户海量封禁历史</p>
     * 
     * @param request DescribeCdnFullDomainsBlockIPHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnFullDomainsBlockIPHistoryResponse
     */
    public DescribeCdnFullDomainsBlockIPHistoryResponse describeCdnFullDomainsBlockIPHistoryWithOptions(DescribeCdnFullDomainsBlockIPHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPList)) {
            body.put("IPList", request.IPList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnFullDomainsBlockIPHistory"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnFullDomainsBlockIPHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户海量封禁历史</p>
     * 
     * @param request DescribeCdnFullDomainsBlockIPHistoryRequest
     * @return DescribeCdnFullDomainsBlockIPHistoryResponse
     */
    public DescribeCdnFullDomainsBlockIPHistoryResponse describeCdnFullDomainsBlockIPHistory(DescribeCdnFullDomainsBlockIPHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnFullDomainsBlockIPHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SSL certificates that belong to your Alibaba Cloud account.</p>
     * 
     * @param request DescribeCdnHttpsDomainListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnHttpsDomainListResponse
     */
    public DescribeCdnHttpsDomainListResponse describeCdnHttpsDomainListWithOptions(DescribeCdnHttpsDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnHttpsDomainList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnHttpsDomainListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SSL certificates that belong to your Alibaba Cloud account.</p>
     * 
     * @param request DescribeCdnHttpsDomainListRequest
     * @return DescribeCdnHttpsDomainListResponse
     */
    public DescribeCdnHttpsDomainListResponse describeCdnHttpsDomainList(DescribeCdnHttpsDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnHttpsDomainListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If a domain name is not transferred from Alibaba Cloud CDN to DCDN after it is registered in the routing center of DCDN, the registration information is retained for only one day.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the registration status of the dynamic routing feature of Dynamic Content Delivery Network (DCDN) for a domain name that is added to Alibaba Cloud CDN.</p>
     * 
     * @param request DescribeCdnMigrateRegisterStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnMigrateRegisterStatusResponse
     */
    public DescribeCdnMigrateRegisterStatusResponse describeCdnMigrateRegisterStatusWithOptions(DescribeCdnMigrateRegisterStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnMigrateRegisterStatus"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnMigrateRegisterStatusResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If a domain name is not transferred from Alibaba Cloud CDN to DCDN after it is registered in the routing center of DCDN, the registration information is retained for only one day.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the registration status of the dynamic routing feature of Dynamic Content Delivery Network (DCDN) for a domain name that is added to Alibaba Cloud CDN.</p>
     * 
     * @param request DescribeCdnMigrateRegisterStatusRequest
     * @return DescribeCdnMigrateRegisterStatusResponse
     */
    public DescribeCdnMigrateRegisterStatusResponse describeCdnMigrateRegisterStatus(DescribeCdnMigrateRegisterStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnMigrateRegisterStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the code of a commodity by account UID.</p>
     * 
     * @param request DescribeCdnOrderCommodityCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnOrderCommodityCodeResponse
     */
    public DescribeCdnOrderCommodityCodeResponse describeCdnOrderCommodityCodeWithOptions(DescribeCdnOrderCommodityCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnOrderCommodityCode"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnOrderCommodityCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the code of a commodity by account UID.</p>
     * 
     * @param request DescribeCdnOrderCommodityCodeRequest
     * @return DescribeCdnOrderCommodityCodeResponse
     */
    public DescribeCdnOrderCommodityCodeResponse describeCdnOrderCommodityCode(DescribeCdnOrderCommodityCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnOrderCommodityCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The lists of ISPs and regions that are supported by Alibaba Cloud CDN are updated and published on the Alibaba Cloud International site.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries Internet service providers (ISPs) and regions that are supported by Alibaba Cloud CDN.</p>
     * 
     * @param request DescribeCdnRegionAndIspRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnRegionAndIspResponse
     */
    public DescribeCdnRegionAndIspResponse describeCdnRegionAndIspWithOptions(DescribeCdnRegionAndIspRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnRegionAndIsp"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnRegionAndIspResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The lists of ISPs and regions that are supported by Alibaba Cloud CDN are updated and published on the Alibaba Cloud International site.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries Internet service providers (ISPs) and regions that are supported by Alibaba Cloud CDN.</p>
     * 
     * @param request DescribeCdnRegionAndIspRequest
     * @return DescribeCdnRegionAndIspResponse
     */
    public DescribeCdnRegionAndIspResponse describeCdnRegionAndIsp(DescribeCdnRegionAndIspRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnRegionAndIspWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of an operations report.</p>
     * 
     * @param request DescribeCdnReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnReportResponse
     */
    public DescribeCdnReportResponse describeCdnReportWithOptions(DescribeCdnReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpCode)) {
            query.put("HttpCode", request.httpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOverseas)) {
            query.put("IsOverseas", request.isOverseas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnReport"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnReportResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of an operations report.</p>
     * 
     * @param request DescribeCdnReportRequest
     * @return DescribeCdnReportResponse
     */
    public DescribeCdnReportResponse describeCdnReport(DescribeCdnReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation queries the metadata of all operations reports. The statistics in the reports are not returned.</p>
     * <ul>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries operations reports.</p>
     * 
     * @param request DescribeCdnReportListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnReportListResponse
     */
    public DescribeCdnReportListResponse describeCdnReportListWithOptions(DescribeCdnReportListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnReportList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnReportListResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation queries the metadata of all operations reports. The statistics in the reports are not returned.</p>
     * <ul>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries operations reports.</p>
     * 
     * @param request DescribeCdnReportListRequest
     * @return DescribeCdnReportListResponse
     */
    public DescribeCdnReportListResponse describeCdnReportList(DescribeCdnReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnReportListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a ShangMi (SM) certificate.</p>
     * 
     * @param request DescribeCdnSMCertificateDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnSMCertificateDetailResponse
     */
    public DescribeCdnSMCertificateDetailResponse describeCdnSMCertificateDetailWithOptions(DescribeCdnSMCertificateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnSMCertificateDetail"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnSMCertificateDetailResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a ShangMi (SM) certificate.</p>
     * 
     * @param request DescribeCdnSMCertificateDetailRequest
     * @return DescribeCdnSMCertificateDetailResponse
     */
    public DescribeCdnSMCertificateDetailResponse describeCdnSMCertificateDetail(DescribeCdnSMCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnSMCertificateDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the ShangMi (SM) certificates of an accelerated domain name.</p>
     * 
     * @param request DescribeCdnSMCertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnSMCertificateListResponse
     */
    public DescribeCdnSMCertificateListResponse describeCdnSMCertificateListWithOptions(DescribeCdnSMCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnSMCertificateList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnSMCertificateListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the ShangMi (SM) certificates of an accelerated domain name.</p>
     * 
     * @param request DescribeCdnSMCertificateListRequest
     * @return DescribeCdnSMCertificateListResponse
     */
    public DescribeCdnSMCertificateListResponse describeCdnSMCertificateList(DescribeCdnSMCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnSMCertificateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificate list by domain name.</p>
     * 
     * @param request DescribeCdnSSLCertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnSSLCertificateListResponse
     */
    public DescribeCdnSSLCertificateListResponse describeCdnSSLCertificateListWithOptions(DescribeCdnSSLCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyword)) {
            query.put("SearchKeyword", request.searchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnSSLCertificateList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnSSLCertificateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificate list by domain name.</p>
     * 
     * @param request DescribeCdnSSLCertificateListRequest
     * @return DescribeCdnSSLCertificateListResponse
     */
    public DescribeCdnSSLCertificateListResponse describeCdnSSLCertificateList(DescribeCdnSSLCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnSSLCertificateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about security features of Alibaba Cloud CDN.</p>
     * 
     * @param request DescribeCdnSecFuncInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnSecFuncInfoResponse
     */
    public DescribeCdnSecFuncInfoResponse describeCdnSecFuncInfoWithOptions(DescribeCdnSecFuncInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secFuncType)) {
            query.put("SecFuncType", request.secFuncType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnSecFuncInfo"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnSecFuncInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about security features of Alibaba Cloud CDN.</p>
     * 
     * @param request DescribeCdnSecFuncInfoRequest
     * @return DescribeCdnSecFuncInfoResponse
     */
    public DescribeCdnSecFuncInfoResponse describeCdnSecFuncInfo(DescribeCdnSecFuncInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnSecFuncInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of your Alibaba Cloud CDN service. The information includes the service activation time, the current service status, the current metering method, and the metering method for the next cycle.</p>
     * 
     * @param request DescribeCdnServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnServiceResponse
     */
    public DescribeCdnServiceResponse describeCdnServiceWithOptions(DescribeCdnServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnService"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnServiceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of your Alibaba Cloud CDN service. The information includes the service activation time, the current service status, the current metering method, and the metering method for the next cycle.</p>
     * 
     * @param request DescribeCdnServiceRequest
     * @return DescribeCdnServiceResponse
     */
    public DescribeCdnServiceResponse describeCdnService(DescribeCdnServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.</p>
     * <ul>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tracking tasks that you have created.</p>
     * 
     * @param request DescribeCdnSubListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnSubListResponse
     */
    public DescribeCdnSubListResponse describeCdnSubListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnSubList"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnSubListResponse());
    }

    /**
     * <b>description</b> :
     * <p>  By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.</p>
     * <ul>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tracking tasks that you have created.</p>
     * @return DescribeCdnSubListResponse
     */
    public DescribeCdnSubListResponse describeCdnSubList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnSubListWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can query billing history up to the last one month.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the billing history under your Alibaba Cloud account.</p>
     * 
     * @param request DescribeCdnUserBillHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnUserBillHistoryResponse
     */
    public DescribeCdnUserBillHistoryResponse describeCdnUserBillHistoryWithOptions(DescribeCdnUserBillHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserBillHistory"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserBillHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can query billing history up to the last one month.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the billing history under your Alibaba Cloud account.</p>
     * 
     * @param request DescribeCdnUserBillHistoryRequest
     * @return DescribeCdnUserBillHistoryResponse
     */
    public DescribeCdnUserBillHistoryResponse describeCdnUserBillHistory(DescribeCdnUserBillHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnUserBillHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to estimate resource usage of the current month based on the metering method that is specified on the first day of the current month. You can call this operation to estimate resource usage only of the current month within your Alibaba Cloud account. The time range used for the estimation starts at 00:00 on the first day of the current month and ends 2 hours earlier than the current time.</p>
     * <ul>
     * <li>Pay by monthly 95th percentile: The top 5% values between the start time and end time are excluded. The estimated value is the highest value among the remaining values.</li>
     * <li>Pay by average daily peak bandwidth per month: Estimated value = Sum of daily peak bandwidth values/Number of days. The current day is excluded.</li>
     * <li>Pay by 4th peak bandwidth per month: The estimated value is the 4th peak bandwidth value between the start time and end time. If the time range is less than four days, the estimated value is 0.</li>
     * <li>Pay by average daily 95th percentile bandwidth per month: Estimated value = Sum of daily 95th percentile bandwidth values/Number of days. The current day is excluded.</li>
     * <li>Pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00: The top 5% values between the start time and end time are excluded. The estimated value is the highest value among the remaining values.<blockquote>
     * <p>You can call this operation only once per second per account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Estimates resource usage of the current month.</p>
     * 
     * @param request DescribeCdnUserBillPredictionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnUserBillPredictionResponse
     */
    public DescribeCdnUserBillPredictionResponse describeCdnUserBillPredictionWithOptions(DescribeCdnUserBillPredictionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            query.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserBillPrediction"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserBillPredictionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to estimate resource usage of the current month based on the metering method that is specified on the first day of the current month. You can call this operation to estimate resource usage only of the current month within your Alibaba Cloud account. The time range used for the estimation starts at 00:00 on the first day of the current month and ends 2 hours earlier than the current time.</p>
     * <ul>
     * <li>Pay by monthly 95th percentile: The top 5% values between the start time and end time are excluded. The estimated value is the highest value among the remaining values.</li>
     * <li>Pay by average daily peak bandwidth per month: Estimated value = Sum of daily peak bandwidth values/Number of days. The current day is excluded.</li>
     * <li>Pay by 4th peak bandwidth per month: The estimated value is the 4th peak bandwidth value between the start time and end time. If the time range is less than four days, the estimated value is 0.</li>
     * <li>Pay by average daily 95th percentile bandwidth per month: Estimated value = Sum of daily 95th percentile bandwidth values/Number of days. The current day is excluded.</li>
     * <li>Pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00: The top 5% values between the start time and end time are excluded. The estimated value is the highest value among the remaining values.<blockquote>
     * <p>You can call this operation only once per second per account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Estimates resource usage of the current month.</p>
     * 
     * @param request DescribeCdnUserBillPredictionRequest
     * @return DescribeCdnUserBillPredictionResponse
     */
    public DescribeCdnUserBillPredictionResponse describeCdnUserBillPrediction(DescribeCdnUserBillPredictionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnUserBillPredictionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the metering methods of an account. The maximum time range to query is one month.</p>
     * 
     * @param request DescribeCdnUserBillTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnUserBillTypeResponse
     */
    public DescribeCdnUserBillTypeResponse describeCdnUserBillTypeWithOptions(DescribeCdnUserBillTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserBillType"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserBillTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the metering methods of an account. The maximum time range to query is one month.</p>
     * 
     * @param request DescribeCdnUserBillTypeRequest
     * @return DescribeCdnUserBillTypeResponse
     */
    public DescribeCdnUserBillTypeResponse describeCdnUserBillType(DescribeCdnUserBillTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnUserBillTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries configurations of security features.</p>
     * 
     * @param request DescribeCdnUserConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnUserConfigsResponse
     */
    public DescribeCdnUserConfigsResponse describeCdnUserConfigsWithOptions(DescribeCdnUserConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserConfigs"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserConfigsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries configurations of security features.</p>
     * 
     * @param request DescribeCdnUserConfigsRequest
     * @return DescribeCdnUserConfigsResponse
     */
    public DescribeCdnUserConfigsResponse describeCdnUserConfigs(DescribeCdnUserConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnUserConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 100.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries accelerated domain names that have specified features configured and the status of the domain names.</p>
     * 
     * @param request DescribeCdnUserDomainsByFuncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnUserDomainsByFuncResponse
     */
    public DescribeCdnUserDomainsByFuncResponse describeCdnUserDomainsByFuncWithOptions(DescribeCdnUserDomainsByFuncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.funcId)) {
            query.put("FuncId", request.funcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserDomainsByFunc"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserDomainsByFuncResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 100.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries accelerated domain names that have specified features configured and the status of the domain names.</p>
     * 
     * @param request DescribeCdnUserDomainsByFuncRequest
     * @return DescribeCdnUserDomainsByFuncResponse
     */
    public DescribeCdnUserDomainsByFuncResponse describeCdnUserDomainsByFunc(DescribeCdnUserDomainsByFuncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnUserDomainsByFuncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the quotas and usage of Alibaba Cloud CDN resources.</p>
     * 
     * @param request DescribeCdnUserQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnUserQuotaResponse
     */
    public DescribeCdnUserQuotaResponse describeCdnUserQuotaWithOptions(DescribeCdnUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserQuota"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the quotas and usage of Alibaba Cloud CDN resources.</p>
     * 
     * @param request DescribeCdnUserQuotaRequest
     * @return DescribeCdnUserQuotaResponse
     */
    public DescribeCdnUserQuotaResponse describeCdnUserQuota(DescribeCdnUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnUserQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource plans that you have purchased for Alibaba Cloud CDN.</p>
     * 
     * @param request DescribeCdnUserResourcePackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnUserResourcePackageResponse
     */
    public DescribeCdnUserResourcePackageResponse describeCdnUserResourcePackageWithOptions(DescribeCdnUserResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdnUserResourcePackage"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnUserResourcePackageResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource plans that you have purchased for Alibaba Cloud CDN.</p>
     * 
     * @param request DescribeCdnUserResourcePackageRequest
     * @return DescribeCdnUserResourcePackageResponse
     */
    public DescribeCdnUserResourcePackageResponse describeCdnUserResourcePackage(DescribeCdnUserResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnUserResourcePackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 150 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries domain names that use Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeCdnWafDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdnWafDomainResponse
     */
    public DescribeCdnWafDomainResponse describeCdnWafDomainWithOptions(DescribeCdnWafDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
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
            new TeaPair("action", "DescribeCdnWafDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdnWafDomainResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 150 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries domain names that use Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeCdnWafDomainRequest
     * @return DescribeCdnWafDomainResponse
     */
    public DescribeCdnWafDomainResponse describeCdnWafDomain(DescribeCdnWafDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnWafDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If a certificate is associated with a domain name but the certificate is not enabled, the result of this operation shows that the certificate does not exist.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a specific certificate by certificate ID.</p>
     * 
     * @param request DescribeCertificateInfoByIDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCertificateInfoByIDResponse
     */
    public DescribeCertificateInfoByIDResponse describeCertificateInfoByIDWithOptions(DescribeCertificateInfoByIDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCertificateInfoByID"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertificateInfoByIDResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If a certificate is associated with a domain name but the certificate is not enabled, the result of this operation shows that the certificate does not exist.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a specific certificate by certificate ID.</p>
     * 
     * @param request DescribeCertificateInfoByIDRequest
     * @return DescribeCertificateInfoByIDResponse
     */
    public DescribeCertificateInfoByIDResponse describeCertificateInfoByID(DescribeCertificateInfoByIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCertificateInfoByIDWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a custom logging configuration.</p>
     * 
     * @param request DescribeCustomLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomLogConfigResponse
     */
    public DescribeCustomLogConfigResponse describeCustomLogConfigWithOptions(DescribeCustomLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomLogConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomLogConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a custom logging configuration.</p>
     * 
     * @param request DescribeCustomLogConfigRequest
     * @return DescribeCustomLogConfigResponse
     */
    public DescribeCustomLogConfigResponse describeCustomLogConfig(DescribeCustomLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomLogConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature to for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can specify up to 500 domain names in each request. Separate multiple domain names with commas (,).</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the average response time of one or more accelerated domain names. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainAverageResponseTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainAverageResponseTimeResponse
     */
    public DescribeDomainAverageResponseTimeResponse describeDomainAverageResponseTimeWithOptions(DescribeDomainAverageResponseTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainType)) {
            query.put("DomainType", request.domainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeMerge)) {
            query.put("TimeMerge", request.timeMerge);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainAverageResponseTime"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainAverageResponseTimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature to for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can specify up to 500 domain names in each request. Separate multiple domain names with commas (,).</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the average response time of one or more accelerated domain names. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainAverageResponseTimeRequest
     * @return DescribeDomainAverageResponseTimeResponse
     */
    public DescribeDomainAverageResponseTimeResponse describeDomainAverageResponseTime(DescribeDomainAverageResponseTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainAverageResponseTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 150 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth monitoring data for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainBpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainBpsDataResponse
     */
    public DescribeDomainBpsDataResponse describeDomainBpsDataWithOptions(DescribeDomainBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainBpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainBpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 150 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth monitoring data for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainBpsDataRequest
     * @return DescribeDomainBpsDataResponse
     */
    public DescribeDomainBpsDataResponse describeDomainBpsData(DescribeDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth data by protocol.</p>
     * 
     * @param request DescribeDomainBpsDataByLayerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainBpsDataByLayerResponse
     */
    public DescribeDomainBpsDataByLayerResponse describeDomainBpsDataByLayerWithOptions(DescribeDomainBpsDataByLayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            query.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainBpsDataByLayer"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainBpsDataByLayerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth data by protocol.</p>
     * 
     * @param request DescribeDomainBpsDataByLayerRequest
     * @return DescribeDomainBpsDataByLayerResponse
     */
    public DescribeDomainBpsDataByLayerResponse describeDomainBpsDataByLayer(DescribeDomainBpsDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainBpsDataByLayerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The bandwidth is measured in bit/s.</p>
     * <ul>
     * <li>You can specify only one accelerated domain name in each request.</li>
     * <li>The data is collected every 5 minutes.</li>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data at a specified time for an accelerated domain.</p>
     * 
     * @param request DescribeDomainBpsDataByTimeStampRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainBpsDataByTimeStampResponse
     */
    public DescribeDomainBpsDataByTimeStampResponse describeDomainBpsDataByTimeStampWithOptions(DescribeDomainBpsDataByTimeStampRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNames)) {
            query.put("IspNames", request.ispNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNames)) {
            query.put("LocationNames", request.locationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoint)) {
            query.put("TimePoint", request.timePoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainBpsDataByTimeStamp"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainBpsDataByTimeStampResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The bandwidth is measured in bit/s.</p>
     * <ul>
     * <li>You can specify only one accelerated domain name in each request.</li>
     * <li>The data is collected every 5 minutes.</li>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data at a specified time for an accelerated domain.</p>
     * 
     * @param request DescribeDomainBpsDataByTimeStampRequest
     * @return DescribeDomainBpsDataByTimeStampResponse
     */
    public DescribeDomainBpsDataByTimeStampResponse describeDomainBpsDataByTimeStamp(DescribeDomainBpsDataByTimeStampRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainBpsDataByTimeStampWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.</p>
     * <ul>
     * <li>You can specify up to 20 domain names in reach request. If you specify multiple domain names, separate them with commas (,).</li>
     * <li>You can query data collected over the last 30 days.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries log entries of rate limiting.</p>
     * 
     * @param request DescribeDomainCcActivityLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainCcActivityLogResponse
     */
    public DescribeDomainCcActivityLogResponse describeDomainCcActivityLogWithOptions(DescribeDomainCcActivityLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerObject)) {
            query.put("TriggerObject", request.triggerObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainCcActivityLog"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainCcActivityLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.</p>
     * <ul>
     * <li>You can specify up to 20 domain names in reach request. If you specify multiple domain names, separate them with commas (,).</li>
     * <li>You can query data collected over the last 30 days.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries log entries of rate limiting.</p>
     * 
     * @param request DescribeDomainCcActivityLogRequest
     * @return DescribeDomainCcActivityLogResponse
     */
    public DescribeDomainCcActivityLogResponse describeDomainCcActivityLog(DescribeDomainCcActivityLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainCcActivityLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate information of an accelerated domain name.</p>
     * 
     * @param request DescribeDomainCertificateInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainCertificateInfoResponse
     */
    public DescribeDomainCertificateInfoResponse describeDomainCertificateInfoWithOptions(DescribeDomainCertificateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainCertificateInfo"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainCertificateInfoResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the certificate information of an accelerated domain name.</p>
     * 
     * @param request DescribeDomainCertificateInfoRequest
     * @return DescribeDomainCertificateInfoResponse
     */
    public DescribeDomainCertificateInfoResponse describeDomainCertificateInfo(DescribeDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainCertificateInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detects the CNAME for an accelerated domain name. You can check the resolution result to determine whether the CNAME is configured.</p>
     * 
     * @param request DescribeDomainCnameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainCnameResponse
     */
    public DescribeDomainCnameResponse describeDomainCnameWithOptions(DescribeDomainCnameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainCname"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainCnameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detects the CNAME for an accelerated domain name. You can check the resolution result to determine whether the CNAME is configured.</p>
     * 
     * @param request DescribeDomainCnameRequest
     * @return DescribeDomainCnameResponse
     */
    public DescribeDomainCnameResponse describeDomainCname(DescribeDomainCnameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainCnameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the custom log configuration of an accelerated domain name.</p>
     * 
     * @param request DescribeDomainCustomLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainCustomLogConfigResponse
     */
    public DescribeDomainCustomLogConfigResponse describeDomainCustomLogConfigWithOptions(DescribeDomainCustomLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainCustomLogConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainCustomLogConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the custom log configuration of an accelerated domain name.</p>
     * 
     * @param request DescribeDomainCustomLogConfigRequest
     * @return DescribeDomainCustomLogConfigResponse
     */
    public DescribeDomainCustomLogConfigResponse describeDomainCustomLogConfig(DescribeDomainCustomLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainCustomLogConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>The domain name that you want to query. You can specify multiple domain names and separate them with commas (,). You can specify at most 30 domain names in each call.</p>
     * 
     * @param request DescribeDomainDetailDataByLayerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainDetailDataByLayerResponse
     */
    public DescribeDomainDetailDataByLayerResponse describeDomainDetailDataByLayerWithOptions(DescribeDomainDetailDataByLayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainDetailDataByLayer"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainDetailDataByLayerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>The domain name that you want to query. You can specify multiple domain names and separate them with commas (,). You can specify at most 30 domain names in each call.</p>
     * 
     * @param request DescribeDomainDetailDataByLayerRequest
     * @return DescribeDomainDetailDataByLayerResponse
     */
    public DescribeDomainDetailDataByLayerResponse describeDomainDetailDataByLayer(DescribeDomainDetailDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainDetailDataByLayerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries byte hit ratios that are measured in percentage.</p>
     * 
     * @param request DescribeDomainHitRateDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainHitRateDataResponse
     */
    public DescribeDomainHitRateDataResponse describeDomainHitRateDataWithOptions(DescribeDomainHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainHitRateData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainHitRateDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries byte hit ratios that are measured in percentage.</p>
     * 
     * @param request DescribeDomainHitRateDataRequest
     * @return DescribeDomainHitRateDataResponse
     */
    public DescribeDomainHitRateDataResponse describeDomainHitRateData(DescribeDomainHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned from an accelerated domain name. The data is collected every 5 minutes.</p>
     * 
     * @param request DescribeDomainHttpCodeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainHttpCodeDataResponse
     */
    public DescribeDomainHttpCodeDataResponse describeDomainHttpCodeDataWithOptions(DescribeDomainHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainHttpCodeData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainHttpCodeDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned from an accelerated domain name. The data is collected every 5 minutes.</p>
     * 
     * @param request DescribeDomainHttpCodeDataRequest
     * @return DescribeDomainHttpCodeDataResponse
     */
    public DescribeDomainHttpCodeDataResponse describeDomainHttpCodeData(DescribeDomainHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainHttpCodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries HTTP status codes by protocol.</p>
     * 
     * @param request DescribeDomainHttpCodeDataByLayerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainHttpCodeDataByLayerResponse
     */
    public DescribeDomainHttpCodeDataByLayerResponse describeDomainHttpCodeDataByLayerWithOptions(DescribeDomainHttpCodeDataByLayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            query.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainHttpCodeDataByLayer"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainHttpCodeDataByLayerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries HTTP status codes by protocol.</p>
     * 
     * @param request DescribeDomainHttpCodeDataByLayerRequest
     * @return DescribeDomainHttpCodeDataByLayerResponse
     */
    public DescribeDomainHttpCodeDataByLayerResponse describeDomainHttpCodeDataByLayer(DescribeDomainHttpCodeDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainHttpCodeDataByLayerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set StartTime or EndTime, the request returns the data collected in the last 24 hours. If you set both StartTime and EndTime, the request returns the data collected within the specified time range.</li>
     * <li>This operation queries proportions of data usage of different ISPs for only a specific accelerated domain name, or for all accelerated domain names in your Alibaba Cloud account.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the proportions of data usage of different Internet service providers (ISPs). Data is collected every day. You can query data collected in the last 90 days.</p>
     * 
     * @param request DescribeDomainISPDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainISPDataResponse
     */
    public DescribeDomainISPDataResponse describeDomainISPDataWithOptions(DescribeDomainISPDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainISPData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainISPDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set StartTime or EndTime, the request returns the data collected in the last 24 hours. If you set both StartTime and EndTime, the request returns the data collected within the specified time range.</li>
     * <li>This operation queries proportions of data usage of different ISPs for only a specific accelerated domain name, or for all accelerated domain names in your Alibaba Cloud account.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the proportions of data usage of different Internet service providers (ISPs). Data is collected every day. You can query data collected in the last 90 days.</p>
     * 
     * @param request DescribeDomainISPDataRequest
     * @return DescribeDomainISPDataResponse
     */
    public DescribeDomainISPDataResponse describeDomainISPData(DescribeDomainISPDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainISPDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>You can use one of the following methods to query data:</em>*</p>
     * <ul>
     * <li>If you specify the StartTime and EndTime parameters and the time range that is specified by these parameters is less than or equal to 24 hours, the 95th percentile bandwidth data on the day of the start time is returned. If the time range that is specified by these parameters is more than 24 hours, the 95th percentile bandwidth data in the month of the start time is returned.</li>
     * <li>If you specify the TimePoint and Cycle parameters, the 95th percentile bandwidth data of the cycle is returned.</li>
     * <li>If you specify the StartTime, EndTime, and Cycle parameters, the 95th percentile bandwidth data of the cycle is returned.
     * If you do not use one of the methods, the 95th percentile bandwidth data of the previous 24 hours is returned by default.</li>
     * <li>Maximum time range to query: 90 days </li>
     * <li>Minimum data granularity to query: 1 day </li>
     * <li>Historical data available: 90 days</li>
     * </ul>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>The unit of the bandwidth data returned is bit/s.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the 95th percentile bandwidth data of a domain name.</p>
     * 
     * @param request DescribeDomainMax95BpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainMax95BpsDataResponse
     */
    public DescribeDomainMax95BpsDataResponse describeDomainMax95BpsDataWithOptions(DescribeDomainMax95BpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cycle)) {
            query.put("Cycle", request.cycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoint)) {
            query.put("TimePoint", request.timePoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainMax95BpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainMax95BpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>You can use one of the following methods to query data:</em>*</p>
     * <ul>
     * <li>If you specify the StartTime and EndTime parameters and the time range that is specified by these parameters is less than or equal to 24 hours, the 95th percentile bandwidth data on the day of the start time is returned. If the time range that is specified by these parameters is more than 24 hours, the 95th percentile bandwidth data in the month of the start time is returned.</li>
     * <li>If you specify the TimePoint and Cycle parameters, the 95th percentile bandwidth data of the cycle is returned.</li>
     * <li>If you specify the StartTime, EndTime, and Cycle parameters, the 95th percentile bandwidth data of the cycle is returned.
     * If you do not use one of the methods, the 95th percentile bandwidth data of the previous 24 hours is returned by default.</li>
     * <li>Maximum time range to query: 90 days </li>
     * <li>Minimum data granularity to query: 1 day </li>
     * <li>Historical data available: 90 days</li>
     * </ul>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>The unit of the bandwidth data returned is bit/s.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the 95th percentile bandwidth data of a domain name.</p>
     * 
     * @param request DescribeDomainMax95BpsDataRequest
     * @return DescribeDomainMax95BpsDataResponse
     */
    public DescribeDomainMax95BpsDataResponse describeDomainMax95BpsData(DescribeDomainMax95BpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainMax95BpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set StartTime or EndTime, data collected within the last 10 minutes is queried.</p>
     * <ul>
     * <li>The maximum interval between StartTime and EndTime is 1 hour.</li>
     * <li>You can query data within the last 90 days.</li>
     * <li>You can query the traffic data and the number of requests for accelerated domain names that are deleted.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic data and the number of requests for multiple accelerated domain names at a time.</p>
     * 
     * @param request DescribeDomainMultiUsageDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainMultiUsageDataResponse
     */
    public DescribeDomainMultiUsageDataResponse describeDomainMultiUsageDataWithOptions(DescribeDomainMultiUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainMultiUsageData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainMultiUsageDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If you do not set StartTime or EndTime, data collected within the last 10 minutes is queried.</p>
     * <ul>
     * <li>The maximum interval between StartTime and EndTime is 1 hour.</li>
     * <li>You can query data within the last 90 days.</li>
     * <li>You can query the traffic data and the number of requests for accelerated domain names that are deleted.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the traffic data and the number of requests for multiple accelerated domain names at a time.</p>
     * 
     * @param request DescribeDomainMultiUsageDataRequest
     * @return DescribeDomainMultiUsageDataResponse
     */
    public DescribeDomainMultiUsageDataResponse describeDomainMultiUsageData(DescribeDomainMultiUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainMultiUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to users that are on the whitelist. If the daily peak bandwidth value of your workloads reaches 10 Gbit/s, you can <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a> to apply to be included in the whitelist.</p>
     * <ul>
     * <li>You can call this API operation up to 6,000 times per second per account.</li>
     * <li>Data collection by directory is available only to specified domain names within your Alibaba Cloud account. It cannot be enabled for all domain names within your Alibaba Cloud account.</li>
     * <li>The average size of the files that belong to the domain name must be larger than 1 MB.</li>
     * <li>The number of directories specified for a single domain name cannot exceed 100. If the number of directories exceeds 100, the data accuracy reduces.</li>
     * <li>If you do not set StartTime or EndTime, data collected within the last 24 hours is queried. If you set both StartTime and EndTime, data within the specified time range is queried.</li>
     * <li>You can query data collected within the last 30 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries monitoring data including the amount of network traffic and the number of visits by directory.</p>
     * 
     * @param request DescribeDomainPathDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainPathDataResponse
     */
    public DescribeDomainPathDataResponse describeDomainPathDataWithOptions(DescribeDomainPathDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainPathData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainPathDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to users that are on the whitelist. If the daily peak bandwidth value of your workloads reaches 10 Gbit/s, you can <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a> to apply to be included in the whitelist.</p>
     * <ul>
     * <li>You can call this API operation up to 6,000 times per second per account.</li>
     * <li>Data collection by directory is available only to specified domain names within your Alibaba Cloud account. It cannot be enabled for all domain names within your Alibaba Cloud account.</li>
     * <li>The average size of the files that belong to the domain name must be larger than 1 MB.</li>
     * <li>The number of directories specified for a single domain name cannot exceed 100. If the number of directories exceeds 100, the data accuracy reduces.</li>
     * <li>If you do not set StartTime or EndTime, data collected within the last 24 hours is queried. If you set both StartTime and EndTime, data within the specified time range is queried.</li>
     * <li>You can query data collected within the last 30 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries monitoring data including the amount of network traffic and the number of visits by directory.</p>
     * 
     * @param request DescribeDomainPathDataRequest
     * @return DescribeDomainPathDataResponse
     */
    public DescribeDomainPathDataResponse describeDomainPathData(DescribeDomainPathDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainPathDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature to for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the page view (PV) data of an accelerated domain name. The data is collected at an interval of 1 hour. You can query data in the last 90 days.</p>
     * 
     * @param request DescribeDomainPvDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainPvDataResponse
     */
    public DescribeDomainPvDataResponse describeDomainPvDataWithOptions(DescribeDomainPvDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainPvData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainPvDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature to for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the page view (PV) data of an accelerated domain name. The data is collected at an interval of 1 hour. You can query data in the last 90 days.</p>
     * 
     * @param request DescribeDomainPvDataRequest
     * @return DescribeDomainPvDataResponse
     */
    public DescribeDomainPvDataResponse describeDomainPvData(DescribeDomainPvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainPvDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) for an accelerated domain name. The data is collected every 5 minutes. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainQpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainQpsDataResponse
     */
    public DescribeDomainQpsDataResponse describeDomainQpsDataWithOptions(DescribeDomainQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainQpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainQpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) for an accelerated domain name. The data is collected every 5 minutes. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainQpsDataRequest
     * @return DescribeDomainQpsDataResponse
     */
    public DescribeDomainQpsDataResponse describeDomainQpsData(DescribeDomainQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainQpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per user.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) at a specific layer for one or more accelerated domain names. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainQpsDataByLayerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainQpsDataByLayerResponse
     */
    public DescribeDomainQpsDataByLayerResponse describeDomainQpsDataByLayerWithOptions(DescribeDomainQpsDataByLayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layer)) {
            query.put("Layer", request.layer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainQpsDataByLayer"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainQpsDataByLayerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per user.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) at a specific layer for one or more accelerated domain names. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainQpsDataByLayerRequest
     * @return DescribeDomainQpsDataByLayerResponse
     */
    public DescribeDomainQpsDataByLayerResponse describeDomainQpsDataByLayer(DescribeDomainQpsDataByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainQpsDataByLayerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong> The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data about one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeBpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeBpsDataResponse
     */
    public DescribeDomainRealTimeBpsDataResponse describeDomainRealTimeBpsDataWithOptions(DescribeDomainRealTimeBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeBpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeBpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong> The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth data about one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeBpsDataRequest
     * @return DescribeDomainRealTimeBpsDataResponse
     */
    public DescribeDomainRealTimeBpsDataResponse describeDomainRealTimeBpsData(DescribeDomainRealTimeBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.</li>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratios of accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeByteHitRateDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeByteHitRateDataResponse
     */
    public DescribeDomainRealTimeByteHitRateDataResponse describeDomainRealTimeByteHitRateDataWithOptions(DescribeDomainRealTimeByteHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeByteHitRateData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeByteHitRateDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.</li>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the byte hit ratios of accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeByteHitRateDataRequest
     * @return DescribeDomainRealTimeByteHitRateDataResponse
     */
    public DescribeDomainRealTimeByteHitRateDataResponse describeDomainRealTimeByteHitRateData(DescribeDomainRealTimeByteHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeByteHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can query data in the last seven days. Data is collected every minute.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time monitoring data for a domain name.</p>
     * 
     * @param request DescribeDomainRealTimeDetailDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeDetailDataResponse
     */
    public DescribeDomainRealTimeDetailDataResponse describeDomainRealTimeDetailDataWithOptions(DescribeDomainRealTimeDetailDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeDetailData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeDetailDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can query data in the last seven days. Data is collected every minute.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time monitoring data for a domain name.</p>
     * 
     * @param request DescribeDomainRealTimeDetailDataRequest
     * @return DescribeDomainRealTimeDetailDataResponse
     */
    public DescribeDomainRealTimeDetailDataResponse describeDomainRealTimeDetailData(DescribeDomainRealTimeDetailDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeDetailDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned from an accelerated domain name.</p>
     * 
     * @param request DescribeDomainRealTimeHttpCodeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeHttpCodeDataResponse
     */
    public DescribeDomainRealTimeHttpCodeDataResponse describeDomainRealTimeHttpCodeDataWithOptions(DescribeDomainRealTimeHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeHttpCodeData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeHttpCodeDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned from an accelerated domain name.</p>
     * 
     * @param request DescribeDomainRealTimeHttpCodeDataRequest
     * @return DescribeDomainRealTimeHttpCodeDataResponse
     */
    public DescribeDomainRealTimeHttpCodeDataResponse describeDomainRealTimeHttpCodeData(DescribeDomainRealTimeHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeQpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeQpsDataResponse
     */
    public DescribeDomainRealTimeQpsDataResponse describeDomainRealTimeQpsDataWithOptions(DescribeDomainRealTimeQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeQpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeQpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeQpsDataRequest
     * @return DescribeDomainRealTimeQpsDataResponse
     */
    public DescribeDomainRealTimeQpsDataResponse describeDomainRealTimeQpsData(DescribeDomainRealTimeQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeQpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.</li>
     * <li>By default, requests in the Go programming language use the POST request method. You must manually change the request method to GET by declaring: request.Method=&quot;GET&quot;.</li>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the request hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratios for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeReqHitRateDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeReqHitRateDataResponse
     */
    public DescribeDomainRealTimeReqHitRateDataResponse describeDomainRealTimeReqHitRateDataWithOptions(DescribeDomainRealTimeReqHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeReqHitRateData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeReqHitRateDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.</li>
     * <li>By default, requests in the Go programming language use the POST request method. You must manually change the request method to GET by declaring: request.Method=&quot;GET&quot;.</li>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the request hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratios for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeReqHitRateDataRequest
     * @return DescribeDomainRealTimeReqHitRateDataResponse
     */
    public DescribeDomainRealTimeReqHitRateDataResponse describeDomainRealTimeReqHitRateData(DescribeDomainRealTimeReqHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeReqHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries origin bandwidth data for accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeSrcBpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeSrcBpsDataResponse
     */
    public DescribeDomainRealTimeSrcBpsDataResponse describeDomainRealTimeSrcBpsDataWithOptions(DescribeDomainRealTimeSrcBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeSrcBpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeSrcBpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries origin bandwidth data for accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeSrcBpsDataRequest
     * @return DescribeDomainRealTimeSrcBpsDataResponse
     */
    public DescribeDomainRealTimeSrcBpsDataResponse describeDomainRealTimeSrcBpsData(DescribeDomainRealTimeSrcBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeSrcBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned during back-to-origin routing.</p>
     * 
     * @param request DescribeDomainRealTimeSrcHttpCodeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeSrcHttpCodeDataResponse
     */
    public DescribeDomainRealTimeSrcHttpCodeDataResponse describeDomainRealTimeSrcHttpCodeDataWithOptions(DescribeDomainRealTimeSrcHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeSrcHttpCodeData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeSrcHttpCodeDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number and proportions of HTTP status codes returned during back-to-origin routing.</p>
     * 
     * @param request DescribeDomainRealTimeSrcHttpCodeDataRequest
     * @return DescribeDomainRealTimeSrcHttpCodeDataResponse
     */
    public DescribeDomainRealTimeSrcHttpCodeDataResponse describeDomainRealTimeSrcHttpCodeData(DescribeDomainRealTimeSrcHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeSrcHttpCodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour by default. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of back-to-origin traffic for one or more specified accelerated domains. The data is collected every minute.</p>
     * 
     * @param request DescribeDomainRealTimeSrcTrafficDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeSrcTrafficDataResponse
     */
    public DescribeDomainRealTimeSrcTrafficDataResponse describeDomainRealTimeSrcTrafficDataWithOptions(DescribeDomainRealTimeSrcTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeSrcTrafficData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeSrcTrafficDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour by default. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of back-to-origin traffic for one or more specified accelerated domains. The data is collected every minute.</p>
     * 
     * @param request DescribeDomainRealTimeSrcTrafficDataRequest
     * @return DescribeDomainRealTimeSrcTrafficDataResponse
     */
    public DescribeDomainRealTimeSrcTrafficDataResponse describeDomainRealTimeSrcTrafficData(DescribeDomainRealTimeSrcTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeSrcTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of network traffic for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeTrafficDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealTimeTrafficDataResponse
     */
    public DescribeDomainRealTimeTrafficDataResponse describeDomainRealTimeTrafficDataWithOptions(DescribeDomainRealTimeTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealTimeTrafficData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealTimeTrafficDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of network traffic for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainRealTimeTrafficDataRequest
     * @return DescribeDomainRealTimeTrafficDataResponse
     */
    public DescribeDomainRealTimeTrafficDataResponse describeDomainRealTimeTrafficData(DescribeDomainRealTimeTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time log delivery information about an accelerated domain name.</p>
     * 
     * @param request DescribeDomainRealtimeLogDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRealtimeLogDeliveryResponse
     */
    public DescribeDomainRealtimeLogDeliveryResponse describeDomainRealtimeLogDeliveryWithOptions(DescribeDomainRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRealtimeLogDeliveryResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time log delivery information about an accelerated domain name.</p>
     * 
     * @param request DescribeDomainRealtimeLogDeliveryRequest
     * @return DescribeDomainRealtimeLogDeliveryResponse
     */
    public DescribeDomainRealtimeLogDeliveryResponse describeDomainRealtimeLogDelivery(DescribeDomainRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRealtimeLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you not use this operation because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, data collected within the last <strong>24</strong> hours is queried. If you specify both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, data collected within the specified time range is queried.</li>
     * <li>There is delay in data collection. If you want to query data collected within the last day, we recommend that you query the data on the next day.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the geographic distribution of users for a domain name. The data is collected at an interval of one day. You can query the data in the last 90 days.</p>
     * 
     * @param request DescribeDomainRegionDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRegionDataResponse
     */
    public DescribeDomainRegionDataResponse describeDomainRegionDataWithOptions(DescribeDomainRegionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRegionData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRegionDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you not use this operation because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, data collected within the last <strong>24</strong> hours is queried. If you specify both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, data collected within the specified time range is queried.</li>
     * <li>There is delay in data collection. If you want to query data collected within the last day, we recommend that you query the data on the next day.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the geographic distribution of users for a domain name. The data is collected at an interval of one day. You can query the data in the last 90 days.</p>
     * 
     * @param request DescribeDomainRegionDataRequest
     * @return DescribeDomainRegionDataResponse
     */
    public DescribeDomainRegionDataResponse describeDomainRegionData(DescribeDomainRegionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRegionDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratio in percentage.</p>
     * 
     * @param request DescribeDomainReqHitRateDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainReqHitRateDataResponse
     */
    public DescribeDomainReqHitRateDataResponse describeDomainReqHitRateDataWithOptions(DescribeDomainReqHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainReqHitRateData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainReqHitRateDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the request hit ratio in percentage.</p>
     * 
     * @param request DescribeDomainReqHitRateDataRequest
     * @return DescribeDomainReqHitRateDataResponse
     */
    public DescribeDomainReqHitRateDataResponse describeDomainReqHitRateData(DescribeDomainReqHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainReqHitRateDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth monitoring data of requests that are redirected to origin servers for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainSrcBpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainSrcBpsDataResponse
     */
    public DescribeDomainSrcBpsDataResponse describeDomainSrcBpsDataWithOptions(DescribeDomainSrcBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcBpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcBpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries bandwidth monitoring data of requests that are redirected to origin servers for one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainSrcBpsDataRequest
     * @return DescribeDomainSrcBpsDataResponse
     */
    public DescribeDomainSrcBpsDataResponse describeDomainSrcBpsData(DescribeDomainSrcBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainSrcBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the proportions of HTTP status codes that are returned during back-to-origin routing.</p>
     * 
     * @param request DescribeDomainSrcHttpCodeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainSrcHttpCodeDataResponse
     */
    public DescribeDomainSrcHttpCodeDataResponse describeDomainSrcHttpCodeDataWithOptions(DescribeDomainSrcHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcHttpCodeData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcHttpCodeDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the proportions of HTTP status codes that are returned during back-to-origin routing.</p>
     * 
     * @param request DescribeDomainSrcHttpCodeDataRequest
     * @return DescribeDomainSrcHttpCodeDataResponse
     */
    public DescribeDomainSrcHttpCodeDataResponse describeDomainSrcHttpCodeData(DescribeDomainSrcHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainSrcHttpCodeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) that are sent to the origin server. You can query data collected in the last 90 days.</p>
     * 
     * @param request DescribeDomainSrcQpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainSrcQpsDataResponse
     */
    public DescribeDomainSrcQpsDataResponse describeDomainSrcQpsDataWithOptions(DescribeDomainSrcQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcQpsData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcQpsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of queries per second (QPS) that are sent to the origin server. You can query data collected in the last 90 days.</p>
     * 
     * @param request DescribeDomainSrcQpsDataRequest
     * @return DescribeDomainSrcQpsDataResponse
     */
    public DescribeDomainSrcQpsDataResponse describeDomainSrcQpsData(DescribeDomainSrcQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainSrcQpsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>The data is collected at an interval of 5 minutes.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries frequently requested origin URLs of one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainSrcTopUrlVisitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainSrcTopUrlVisitResponse
     */
    public DescribeDomainSrcTopUrlVisitResponse describeDomainSrcTopUrlVisitWithOptions(DescribeDomainSrcTopUrlVisitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcTopUrlVisit"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcTopUrlVisitResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>The data is collected at an interval of 5 minutes.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries frequently requested origin URLs of one or more accelerated domain names.</p>
     * 
     * @param request DescribeDomainSrcTopUrlVisitRequest
     * @return DescribeDomainSrcTopUrlVisitResponse
     */
    public DescribeDomainSrcTopUrlVisitResponse describeDomainSrcTopUrlVisit(DescribeDomainSrcTopUrlVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainSrcTopUrlVisitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries origin traffic for one or more specified accelerated domain names.</p>
     * 
     * @param request DescribeDomainSrcTrafficDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainSrcTrafficDataResponse
     */
    public DescribeDomainSrcTrafficDataResponse describeDomainSrcTrafficDataWithOptions(DescribeDomainSrcTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainSrcTrafficData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainSrcTrafficDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries origin traffic for one or more specified accelerated domain names.</p>
     * 
     * @param request DescribeDomainSrcTrafficDataRequest
     * @return DescribeDomainSrcTrafficDataResponse
     */
    public DescribeDomainSrcTrafficDataResponse describeDomainSrcTrafficData(DescribeDomainSrcTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainSrcTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature to for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>Data is collected every hour.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries client IP addresses that are ranked by the number of requests or the amount of network traffic within a specific time range for one or more accelerated domain names. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainTopClientIpVisitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainTopClientIpVisitResponse
     */
    public DescribeDomainTopClientIpVisitResponse describeDomainTopClientIpVisitWithOptions(DescribeDomainTopClientIpVisitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopClientIpVisit"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopClientIpVisitResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature to for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>Data is collected every hour.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries client IP addresses that are ranked by the number of requests or the amount of network traffic within a specific time range for one or more accelerated domain names. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainTopClientIpVisitRequest
     * @return DescribeDomainTopClientIpVisitResponse
     */
    public DescribeDomainTopClientIpVisitResponse describeDomainTopClientIpVisit(DescribeDomainTopClientIpVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainTopClientIpVisitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature or <a href="https://help.aliyun.com/document_detail/440145.html">ship real-time logs in Log Service</a> to analyze data.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>Data is collected at an interval of five minutes.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries frequently requested web pages of one or more accelerated domain names on a specified day and sorts the web pages. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainTopReferVisitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainTopReferVisitResponse
     */
    public DescribeDomainTopReferVisitResponse describeDomainTopReferVisitWithOptions(DescribeDomainTopReferVisitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopReferVisit"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopReferVisitResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature or <a href="https://help.aliyun.com/document_detail/440145.html">ship real-time logs in Log Service</a> to analyze data.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>Data is collected at an interval of five minutes.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries frequently requested web pages of one or more accelerated domain names on a specified day and sorts the web pages. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainTopReferVisitRequest
     * @return DescribeDomainTopReferVisitResponse
     */
    public DescribeDomainTopReferVisitResponse describeDomainTopReferVisit(DescribeDomainTopReferVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainTopReferVisitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can query data collected in the last 90 days.</li>
     * <li>You can specify only one domain name in each call.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries top 100 frequently requested URLs of an accelerated domain name within a specified time range.</p>
     * 
     * @param request DescribeDomainTopUrlVisitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainTopUrlVisitResponse
     */
    public DescribeDomainTopUrlVisitResponse describeDomainTopUrlVisitWithOptions(DescribeDomainTopUrlVisitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTopUrlVisit"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTopUrlVisitResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can query data collected in the last 90 days.</li>
     * <li>You can specify only one domain name in each call.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries top 100 frequently requested URLs of an accelerated domain name within a specified time range.</p>
     * 
     * @param request DescribeDomainTopUrlVisitRequest
     * @return DescribeDomainTopUrlVisitResponse
     */
    public DescribeDomainTopUrlVisitResponse describeDomainTopUrlVisit(DescribeDomainTopUrlVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainTopUrlVisitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries network traffic for one or more accelerated domain names. You can query data that is collected in the last 90 days.</p>
     * 
     * @param request DescribeDomainTrafficDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainTrafficDataResponse
     */
    public DescribeDomainTrafficDataResponse describeDomainTrafficDataWithOptions(DescribeDomainTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainTrafficData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainTrafficDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries network traffic for one or more accelerated domain names. You can query data that is collected in the last 90 days.</p>
     * 
     * @param request DescribeDomainTrafficDataRequest
     * @return DescribeDomainTrafficDataResponse
     */
    public DescribeDomainTrafficDataResponse describeDomainTrafficData(DescribeDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>90 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource usage data of specific domain names in a specified billable region.</p>
     * 
     * @param request DescribeDomainUsageDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainUsageDataResponse
     */
    public DescribeDomainUsageDataResponse describeDomainUsageDataWithOptions(DescribeDomainUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProtocol)) {
            query.put("DataProtocol", request.dataProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.field)) {
            query.put("Field", request.field);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainUsageData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainUsageDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>90 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource usage data of specific domain names in a specified billable region.</p>
     * 
     * @param request DescribeDomainUsageDataRequest
     * @return DescribeDomainUsageDataResponse
     */
    public DescribeDomainUsageDataResponse describeDomainUsageData(DescribeDomainUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can specify only one accelerated domain name or all accelerated domain names in your Alibaba Cloud account.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the unique visitor (UV) data of an accelerated domain name. Data is collected every hour. You can query data collected in the last 90 days.</p>
     * 
     * @param request DescribeDomainUvDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainUvDataResponse
     */
    public DescribeDomainUvDataResponse describeDomainUvDataWithOptions(DescribeDomainUvDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainUvData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainUvDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can specify only one accelerated domain name or all accelerated domain names in your Alibaba Cloud account.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the unique visitor (UV) data of an accelerated domain name. Data is collected every hour. You can query data collected in the last 90 days.</p>
     * 
     * @param request DescribeDomainUvDataRequest
     * @return DescribeDomainUvDataResponse
     */
    public DescribeDomainUvDataResponse describeDomainUvData(DescribeDomainUvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainUvDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the verification content of an accelerated domain name based on whether the global resource plan is enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the verification content of a domain name, including the host record and record value.</p>
     * 
     * @param request DescribeDomainVerifyDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainVerifyDataResponse
     */
    public DescribeDomainVerifyDataResponse describeDomainVerifyDataWithOptions(DescribeDomainVerifyDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalResourcePlan)) {
            query.put("GlobalResourcePlan", request.globalResourcePlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainVerifyData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainVerifyDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the verification content of an accelerated domain name based on whether the global resource plan is enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the verification content of a domain name, including the host record and record value.</p>
     * 
     * @param request DescribeDomainVerifyDataRequest
     * @return DescribeDomainVerifyDataResponse
     */
    public DescribeDomainVerifyDataResponse describeDomainVerifyData(DescribeDomainVerifyDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainVerifyDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries accelerated domain names by origin server.</p>
     * 
     * @param request DescribeDomainsBySourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainsBySourceResponse
     */
    public DescribeDomainsBySourceResponse describeDomainsBySourceWithOptions(DescribeDomainsBySourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainsBySource"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainsBySourceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries accelerated domain names by origin server.</p>
     * 
     * @param request DescribeDomainsBySourceRequest
     * @return DescribeDomainsBySourceResponse
     */
    public DescribeDomainsBySourceResponse describeDomainsBySource(DescribeDomainsBySourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainsBySourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set StartTime or EndTime, data within the last 24 hours is queried. If you set both StartTime and EndTime, data within the specified time range is queried.</li>
     * <li>You can query the monitoring data of a specific accelerated domain name or all accelerated domain names that belong to your Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of an accelerated domain name. Data is collected every day. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainsUsageByDayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainsUsageByDayResponse
     */
    public DescribeDomainsUsageByDayResponse describeDomainsUsageByDayWithOptions(DescribeDomainsUsageByDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainsUsageByDay"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainsUsageByDayResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set StartTime or EndTime, data within the last 24 hours is queried. If you set both StartTime and EndTime, data within the specified time range is queried.</li>
     * <li>You can query the monitoring data of a specific accelerated domain name or all accelerated domain names that belong to your Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of an accelerated domain name. Data is collected every day. You can query data collected within the last 90 days.</p>
     * 
     * @param request DescribeDomainsUsageByDayRequest
     * @return DescribeDomainsUsageByDayResponse
     */
    public DescribeDomainsUsageByDayResponse describeDomainsUsageByDay(DescribeDomainsUsageByDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainsUsageByDayWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution errors of a script in EdgeScript (ES).</p>
     * 
     * @param request DescribeEsExceptionDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEsExceptionDataResponse
     */
    public DescribeEsExceptionDataResponse describeEsExceptionDataWithOptions(DescribeEsExceptionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEsExceptionData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEsExceptionDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution errors of a script in EdgeScript (ES).</p>
     * 
     * @param request DescribeEsExceptionDataRequest
     * @return DescribeEsExceptionDataResponse
     */
    public DescribeEsExceptionDataResponse describeEsExceptionData(DescribeEsExceptionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEsExceptionDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution status of scripts in EdgeScript (ES).</p>
     * 
     * @param request DescribeEsExecuteDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEsExecuteDataResponse
     */
    public DescribeEsExecuteDataResponse describeEsExecuteDataWithOptions(DescribeEsExecuteDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEsExecuteData"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEsExecuteDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution status of scripts in EdgeScript (ES).</p>
     * 
     * @param request DescribeEsExecuteDataRequest
     * @return DescribeEsExecuteDataResponse
     */
    public DescribeEsExecuteDataResponse describeEsExecuteData(DescribeEsExecuteDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEsExecuteDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a specified Function Compute trigger.</p>
     * 
     * @param request DescribeFCTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFCTriggerResponse
     */
    public DescribeFCTriggerResponse describeFCTriggerWithOptions(DescribeFCTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFCTriggerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a specified Function Compute trigger.</p>
     * 
     * @param request DescribeFCTriggerRequest
     * @return DescribeFCTriggerResponse
     */
    public DescribeFCTriggerResponse describeFCTrigger(DescribeFCTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFCTriggerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a specified IP address is the IP address of a CDN point of presence (POP).</p>
     * 
     * @param request DescribeIpInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIpInfoResponse
     */
    public DescribeIpInfoResponse describeIpInfoWithOptions(DescribeIpInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.IP)) {
            query.put("IP", request.IP);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpInfo"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a specified IP address is the IP address of a CDN point of presence (POP).</p>
     * 
     * @param request DescribeIpInfoRequest
     * @return DescribeIpInfoResponse
     */
    public DescribeIpInfoResponse describeIpInfo(DescribeIpInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of IP addresses of points of presence (POPs). The status of an IP address of a POP indicates whether content delivery acceleration is supported by the POP.</p>
     * 
     * @param request DescribeIpStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIpStatusResponse
     */
    public DescribeIpStatusResponse describeIpStatusWithOptions(DescribeIpStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpStatus"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpStatusResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of IP addresses of points of presence (POPs). The status of an IP address of a POP indicates whether content delivery acceleration is supported by the POP.</p>
     * 
     * @param request DescribeIpStatusRequest
     * @return DescribeIpStatusResponse
     */
    public DescribeIpStatusResponse describeIpStatus(DescribeIpStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to users whose daily peak bandwidth value is higher than 1 Gbit/s. If you meet this requirement, you can <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a> to apply for permissions to use this operation.</p>
     * <ul>
     * <li>You can call this operation up to 40 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the virtual IP addresses (VIPs) of L2 CDN points of presence (POPs) for a specific domain name.</p>
     * 
     * @param request DescribeL2VipsByDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeL2VipsByDomainResponse
     */
    public DescribeL2VipsByDomainResponse describeL2VipsByDomainWithOptions(DescribeL2VipsByDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeL2VipsByDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeL2VipsByDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only to users whose daily peak bandwidth value is higher than 1 Gbit/s. If you meet this requirement, you can <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a> to apply for permissions to use this operation.</p>
     * <ul>
     * <li>You can call this operation up to 40 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the virtual IP addresses (VIPs) of L2 CDN points of presence (POPs) for a specific domain name.</p>
     * 
     * @param request DescribeL2VipsByDomainRequest
     * @return DescribeL2VipsByDomainResponse
     */
    public DescribeL2VipsByDomainResponse describeL2VipsByDomain(DescribeL2VipsByDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeL2VipsByDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can query data within the last 3 days.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the prefetch details of a task, including the prefetch progress of all resources in the task. Only users who are included in the whitelist can use this operation. You can contact your business manager to apply for the whitelist.</p>
     * 
     * @param request DescribePreloadDetailByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePreloadDetailByIdResponse
     */
    public DescribePreloadDetailByIdResponse describePreloadDetailByIdWithOptions(DescribePreloadDetailByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePreloadDetailById"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreloadDetailByIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can query data within the last 3 days.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the prefetch details of a task, including the prefetch progress of all resources in the task. Only users who are included in the whitelist can use this operation. You can contact your business manager to apply for the whitelist.</p>
     * 
     * @param request DescribePreloadDetailByIdRequest
     * @return DescribePreloadDetailByIdResponse
     */
    public DescribePreloadDetailByIdResponse describePreloadDetailById(DescribePreloadDetailByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreloadDetailByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The data is collected every 5 minutes.</p>
     * <ul>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth values by Internet service provider (ISP) and region.</p>
     * 
     * @param request DescribeRangeDataByLocateAndIspServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRangeDataByLocateAndIspServiceResponse
     */
    public DescribeRangeDataByLocateAndIspServiceResponse describeRangeDataByLocateAndIspServiceWithOptions(DescribeRangeDataByLocateAndIspServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNames)) {
            query.put("IspNames", request.ispNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNames)) {
            query.put("LocationNames", request.locationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRangeDataByLocateAndIspService"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRangeDataByLocateAndIspServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The data is collected every 5 minutes.</p>
     * <ul>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bandwidth values by Internet service provider (ISP) and region.</p>
     * 
     * @param request DescribeRangeDataByLocateAndIspServiceRequest
     * @return DescribeRangeDataByLocateAndIspServiceResponse
     */
    public DescribeRangeDataByLocateAndIspServiceResponse describeRangeDataByLocateAndIspService(DescribeRangeDataByLocateAndIspServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRangeDataByLocateAndIspServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of real-time log deliveries.</p>
     * 
     * @param request DescribeRealtimeDeliveryAccRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRealtimeDeliveryAccResponse
     */
    public DescribeRealtimeDeliveryAccResponse describeRealtimeDeliveryAccWithOptions(DescribeRealtimeDeliveryAccRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStore)) {
            query.put("LogStore", request.logStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRealtimeDeliveryAcc"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRealtimeDeliveryAccResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of real-time log deliveries.</p>
     * 
     * @param request DescribeRealtimeDeliveryAccRequest
     * @return DescribeRealtimeDeliveryAccResponse
     */
    public DescribeRealtimeDeliveryAccResponse describeRealtimeDeliveryAcc(DescribeRealtimeDeliveryAccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRealtimeDeliveryAccWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the maximum and remaining numbers of URLs and directories that can be refreshed, the maximum and remaining numbers of times that you can prefetch content, and the maximum and remaining numbers of URLs and directories that can be blocked on the current day.</p>
     * 
     * <b>summary</b> : 
     * <p>DescribeRefreshQuota</p>
     * 
     * @param request DescribeRefreshQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRefreshQuotaResponse
     */
    public DescribeRefreshQuotaResponse describeRefreshQuotaWithOptions(DescribeRefreshQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRefreshQuota"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRefreshQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the maximum and remaining numbers of URLs and directories that can be refreshed, the maximum and remaining numbers of times that you can prefetch content, and the maximum and remaining numbers of URLs and directories that can be blocked on the current day.</p>
     * 
     * <b>summary</b> : 
     * <p>DescribeRefreshQuota</p>
     * 
     * @param request DescribeRefreshQuotaRequest
     * @return DescribeRefreshQuotaResponse
     */
    public DescribeRefreshQuotaResponse describeRefreshQuota(DescribeRefreshQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRefreshQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can query data in the last three days.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statuses of refresh or prefetch tasks by task ID.</p>
     * 
     * @param request DescribeRefreshTaskByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRefreshTaskByIdResponse
     */
    public DescribeRefreshTaskByIdResponse describeRefreshTaskByIdWithOptions(DescribeRefreshTaskByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRefreshTaskById"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRefreshTaskByIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can query data in the last three days.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statuses of refresh or prefetch tasks by task ID.</p>
     * 
     * @param request DescribeRefreshTaskByIdRequest
     * @return DescribeRefreshTaskByIdResponse
     */
    public DescribeRefreshTaskByIdResponse describeRefreshTaskById(DescribeRefreshTaskByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRefreshTaskByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can query the status of tasks by task ID or URL.</p>
     * <ul>
     * <li>You can set both the <strong>TaskId</strong> and <strong>ObjectPath</strong> parameters. If you do not set the <strong>TaskId</strong> or <strong>ObjectPath</strong> parameter, data entries on the first page (20 entries) collected in the last 3 days are returned.</li>
     * <li>You can query data collected in the last 3 days.</li>
     * <li>If auto CDN cache update is enabled in the Object Storage Service (OSS) console, you cannot call the DescribeRefreshTasks operation to query automatic refresh tasks in OSS.</li>
     * <li>You can call this operation up to 10 times per second per account. If you want to query tasks at a higher frequency, call the <a href="https://help.aliyun.com/document_detail/187709.html">DescribeRefreshTaskById</a> operation. This operation allows you to query tasks by task ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of refresh or prefetch tasks that belong to an accelerated domain name.</p>
     * 
     * @param request DescribeRefreshTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRefreshTasksResponse
     */
    public DescribeRefreshTasksResponse describeRefreshTasksWithOptions(DescribeRefreshTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRefreshTasks"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRefreshTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can query the status of tasks by task ID or URL.</p>
     * <ul>
     * <li>You can set both the <strong>TaskId</strong> and <strong>ObjectPath</strong> parameters. If you do not set the <strong>TaskId</strong> or <strong>ObjectPath</strong> parameter, data entries on the first page (20 entries) collected in the last 3 days are returned.</li>
     * <li>You can query data collected in the last 3 days.</li>
     * <li>If auto CDN cache update is enabled in the Object Storage Service (OSS) console, you cannot call the DescribeRefreshTasks operation to query automatic refresh tasks in OSS.</li>
     * <li>You can call this operation up to 10 times per second per account. If you want to query tasks at a higher frequency, call the <a href="https://help.aliyun.com/document_detail/187709.html">DescribeRefreshTaskById</a> operation. This operation allows you to query tasks by task ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of refresh or prefetch tasks that belong to an accelerated domain name.</p>
     * 
     * @param request DescribeRefreshTasksRequest
     * @return DescribeRefreshTasksResponse
     */
    public DescribeRefreshTasksResponse describeRefreshTasks(DescribeRefreshTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRefreshTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum number of times that each user can call this operation per second is 30.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries node IP addresses in the staging environment.</p>
     * 
     * @param request DescribeStagingIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStagingIpResponse
     */
    public DescribeStagingIpResponse describeStagingIpWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStagingIp"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStagingIpResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum number of times that each user can call this operation per second is 30.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries node IP addresses in the staging environment.</p>
     * @return DescribeStagingIpResponse
     */
    public DescribeStagingIpResponse describeStagingIp() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStagingIpWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 10.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries tags that are added to specified resources.</p>
     * 
     * @param request DescribeTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagResourcesResponse
     */
    public DescribeTagResourcesResponse describeTagResourcesWithOptions(DescribeTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagResources"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 10.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries tags that are added to specified resources.</p>
     * 
     * @param request DescribeTagResourcesRequest
     * @return DescribeTagResourcesResponse
     */
    public DescribeTagResourcesResponse describeTagResources(DescribeTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the current month. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the top N domain names ranked by network traffic. You can query data collected in the last 30 days.</p>
     * 
     * @param request DescribeTopDomainsByFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTopDomainsByFlowResponse
     */
    public DescribeTopDomainsByFlowResponse describeTopDomainsByFlowWithOptions(DescribeTopDomainsByFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTopDomainsByFlow"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTopDomainsByFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the current month. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the top N domain names ranked by network traffic. You can query data collected in the last 30 days.</p>
     * 
     * @param request DescribeTopDomainsByFlowRequest
     * @return DescribeTopDomainsByFlowResponse
     */
    public DescribeTopDomainsByFlowResponse describeTopDomainsByFlow(DescribeTopDomainsByFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTopDomainsByFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of domain names whose SSL certificates are about to expire or have already expired.</p>
     * 
     * @param request DescribeUserCertificateExpireCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserCertificateExpireCountResponse
     */
    public DescribeUserCertificateExpireCountResponse describeUserCertificateExpireCountWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserCertificateExpireCount"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserCertificateExpireCountResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of domain names whose SSL certificates are about to expire or have already expired.</p>
     * @return DescribeUserCertificateExpireCountResponse
     */
    public DescribeUserCertificateExpireCountResponse describeUserCertificateExpireCount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserCertificateExpireCountWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries configurations of security features.</p>
     * 
     * @deprecated OpenAPI DescribeUserConfigs is deprecated
     * 
     * @param request DescribeUserConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserConfigsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeUserConfigsResponse describeUserConfigsWithOptions(DescribeUserConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserConfigs"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries configurations of security features.</p>
     * 
     * @deprecated OpenAPI DescribeUserConfigs is deprecated
     * 
     * @param request DescribeUserConfigsRequest
     * @return DescribeUserConfigsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeUserConfigsResponse describeUserConfigs(DescribeUserConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all accelerated domain names in your Alibaba Cloud account and the status of the accelerated domain names. You can filter domain names by name or status. Fuzzy match is supported.</p>
     * 
     * @param request DescribeUserDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserDomainsResponse
     */
    public DescribeUserDomainsResponse describeUserDomainsWithOptions(DescribeUserDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdnType)) {
            query.put("CdnType", request.cdnType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeEndTime)) {
            query.put("ChangeEndTime", request.changeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeStartTime)) {
            query.put("ChangeStartTime", request.changeStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkDomainShow)) {
            query.put("CheckDomainShow", request.checkDomainShow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverage)) {
            query.put("Coverage", request.coverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainSearchType)) {
            query.put("DomainSearchType", request.domainSearchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainStatus)) {
            query.put("DomainStatus", request.domainStatus);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserDomains"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all accelerated domain names in your Alibaba Cloud account and the status of the accelerated domain names. You can filter domain names by name or status. Fuzzy match is supported.</p>
     * 
     * @param request DescribeUserDomainsRequest
     * @return DescribeUserDomainsResponse
     */
    public DescribeUserDomainsResponse describeUserDomains(DescribeUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries user tags.</p>
     * 
     * @param request DescribeUserTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserTagsResponse
     */
    public DescribeUserTagsResponse describeUserTagsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserTags"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserTagsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries user tags.</p>
     * @return DescribeUserTagsResponse
     */
    public DescribeUserTagsResponse describeUserTags() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserTagsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries usage export tasks that were created in the last three months.</p>
     * 
     * @param request DescribeUserUsageDataExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserUsageDataExportTaskResponse
     */
    public DescribeUserUsageDataExportTaskResponse describeUserUsageDataExportTaskWithOptions(DescribeUserUsageDataExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserUsageDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserUsageDataExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries usage export tasks that were created in the last three months.</p>
     * 
     * @param request DescribeUserUsageDataExportTaskRequest
     * @return DescribeUserUsageDataExportTaskResponse
     */
    public DescribeUserUsageDataExportTaskResponse describeUserUsageDataExportTask(DescribeUserUsageDataExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserUsageDataExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation has been available since July 20, 2018. You can query information about resource usage collected within the last three months.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries tasks that were used to export resource usage details of one or more accelerated domain names that belong to your Alibaba Cloud account. Resource usage information is collected every five minutes.</p>
     * 
     * @param request DescribeUserUsageDetailDataExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserUsageDetailDataExportTaskResponse
     */
    public DescribeUserUsageDetailDataExportTaskResponse describeUserUsageDetailDataExportTaskWithOptions(DescribeUserUsageDetailDataExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserUsageDetailDataExportTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserUsageDetailDataExportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation has been available since July 20, 2018. You can query information about resource usage collected within the last three months.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries tasks that were used to export resource usage details of one or more accelerated domain names that belong to your Alibaba Cloud account. Resource usage information is collected every five minutes.</p>
     * 
     * @param request DescribeUserUsageDetailDataExportTaskRequest
     * @return DescribeUserUsageDetailDataExportTaskResponse
     */
    public DescribeUserUsageDetailDataExportTaskResponse describeUserUsageDetailDataExportTask(DescribeUserUsageDetailDataExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserUsageDetailDataExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries virtual IP addresses (VIPs) of CDN points of presence (POPs) by domain name.</p>
     * 
     * @param request DescribeUserVipsByDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserVipsByDomainResponse
     */
    public DescribeUserVipsByDomainResponse describeUserVipsByDomainWithOptions(DescribeUserVipsByDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserVipsByDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserVipsByDomainResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries virtual IP addresses (VIPs) of CDN points of presence (POPs) by domain name.</p>
     * 
     * @param request DescribeUserVipsByDomainRequest
     * @return DescribeUserVipsByDomainResponse
     */
    public DescribeUserVipsByDomainResponse describeUserVipsByDomain(DescribeUserVipsByDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserVipsByDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ownership verification content of an accelerated domain name.</p>
     * 
     * @param request DescribeVerifyContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyContentResponse
     */
    public DescribeVerifyContentResponse describeVerifyContentWithOptions(DescribeVerifyContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyContent"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ownership verification content of an accelerated domain name.</p>
     * 
     * @param request DescribeVerifyContentRequest
     * @return DescribeVerifyContentResponse
     */
    public DescribeVerifyContentResponse describeVerifyContent(DescribeVerifyContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 100.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request DisableRealtimeLogDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableRealtimeLogDeliveryResponse
     */
    public DisableRealtimeLogDeliveryResponse disableRealtimeLogDeliveryWithOptions(DisableRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableRealtimeLogDeliveryResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 100.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request DisableRealtimeLogDeliveryRequest
     * @return DisableRealtimeLogDeliveryResponse
     */
    public DisableRealtimeLogDeliveryResponse disableRealtimeLogDelivery(DisableRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableRealtimeLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 100.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request EnableRealtimeLogDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableRealtimeLogDeliveryResponse
     */
    public EnableRealtimeLogDeliveryResponse enableRealtimeLogDeliveryWithOptions(EnableRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRealtimeLogDeliveryResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 100.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request EnableRealtimeLogDeliveryRequest
     * @return EnableRealtimeLogDeliveryResponse
     */
    public EnableRealtimeLogDeliveryResponse enableRealtimeLogDelivery(EnableRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableRealtimeLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries domain names by log configuration ID.</p>
     * 
     * @param request ListDomainsByLogConfigIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainsByLogConfigIdResponse
     */
    public ListDomainsByLogConfigIdResponse listDomainsByLogConfigIdWithOptions(ListDomainsByLogConfigIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomainsByLogConfigId"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainsByLogConfigIdResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries domain names by log configuration ID.</p>
     * 
     * @param request ListDomainsByLogConfigIdRequest
     * @return ListDomainsByLogConfigIdResponse
     */
    public ListDomainsByLogConfigIdResponse listDomainsByLogConfigId(ListDomainsByLogConfigIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainsByLogConfigIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the Function Compute trigger that is set for an Alibaba Cloud CDN event.</p>
     * 
     * @param request ListFCTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFCTriggerResponse
     */
    public ListFCTriggerResponse listFCTriggerWithOptions(ListFCTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFCTriggerResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the Function Compute trigger that is set for an Alibaba Cloud CDN event.</p>
     * 
     * @param request ListFCTriggerRequest
     * @return ListFCTriggerResponse
     */
    public ListFCTriggerResponse listFCTrigger(ListFCTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFCTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all domain names that are associated with a specific real-time log delivery configuration record.</p>
     * 
     * @param request ListRealtimeLogDeliveryDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRealtimeLogDeliveryDomainsResponse
     */
    public ListRealtimeLogDeliveryDomainsResponse listRealtimeLogDeliveryDomainsWithOptions(ListRealtimeLogDeliveryDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRealtimeLogDeliveryDomains"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRealtimeLogDeliveryDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all domain names that are associated with a specific real-time log delivery configuration record.</p>
     * 
     * @param request ListRealtimeLogDeliveryDomainsRequest
     * @return ListRealtimeLogDeliveryDomainsResponse
     */
    public ListRealtimeLogDeliveryDomainsResponse listRealtimeLogDeliveryDomains(ListRealtimeLogDeliveryDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRealtimeLogDeliveryDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the real-time log delivery feature in a specified region.</p>
     * 
     * @param request ListRealtimeLogDeliveryInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRealtimeLogDeliveryInfosResponse
     */
    public ListRealtimeLogDeliveryInfosResponse listRealtimeLogDeliveryInfosWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRealtimeLogDeliveryInfos"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRealtimeLogDeliveryInfosResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the real-time log delivery feature in a specified region.</p>
     * @return ListRealtimeLogDeliveryInfosResponse
     */
    public ListRealtimeLogDeliveryInfosResponse listRealtimeLogDeliveryInfos() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRealtimeLogDeliveryInfosWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are attached to a resource.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOwnerBid)) {
            query.put("TagOwnerBid", request.tagOwnerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOwnerUid)) {
            query.put("TagOwnerUid", request.tagOwnerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are attached to a resource.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all custom log configurations in your account.</p>
     * 
     * @param request ListUserCustomLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserCustomLogConfigResponse
     */
    public ListUserCustomLogConfigResponse listUserCustomLogConfigWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserCustomLogConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserCustomLogConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries all custom log configurations in your account.</p>
     * @return ListUserCustomLogConfigResponse
     */
    public ListUserCustomLogConfigResponse listUserCustomLogConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserCustomLogConfigWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of an accelerated domain name.</p>
     * 
     * @param request ModifyCdnDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCdnDomainResponse
     */
    public ModifyCdnDomainResponse modifyCdnDomainWithOptions(ModifyCdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sources)) {
            query.put("Sources", request.sources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topLevelDomain)) {
            query.put("TopLevelDomain", request.topLevelDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCdnDomainResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of an accelerated domain name.</p>
     * 
     * @param request ModifyCdnDomainRequest
     * @return ModifyCdnDomainResponse
     */
    public ModifyCdnDomainResponse modifyCdnDomain(ModifyCdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used in the following scenario:</p>
     * <ul>
     * <li>You have multiple Alibaba Cloud accounts and want to transfer domain names from Account A to Account B.</li>
     * <li>You are prompted that a domain name has been added when you add the domain name to Alibaba Cloud CDN. You do not know which account does the domain name belong to, and you want to transfer the domain name to your current account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transfer domain names from an Alibaba Cloud account to the current account.</p>
     * 
     * @param request ModifyCdnDomainOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCdnDomainOwnerResponse
     */
    public ModifyCdnDomainOwnerResponse modifyCdnDomainOwnerWithOptions(ModifyCdnDomainOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCdnDomainOwner"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCdnDomainOwnerResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is used in the following scenario:</p>
     * <ul>
     * <li>You have multiple Alibaba Cloud accounts and want to transfer domain names from Account A to Account B.</li>
     * <li>You are prompted that a domain name has been added when you add the domain name to Alibaba Cloud CDN. You do not know which account does the domain name belong to, and you want to transfer the domain name to your current account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transfer domain names from an Alibaba Cloud account to the current account.</p>
     * 
     * @param request ModifyCdnDomainOwnerRequest
     * @return ModifyCdnDomainOwnerResponse
     */
    public ModifyCdnDomainOwnerResponse modifyCdnDomainOwner(ModifyCdnDomainOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCdnDomainOwnerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Changes the acceleration region for an accelerated domain name.</p>
     * 
     * @param request ModifyCdnDomainSchdmByPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCdnDomainSchdmByPropertyResponse
     */
    public ModifyCdnDomainSchdmByPropertyResponse modifyCdnDomainSchdmByPropertyWithOptions(ModifyCdnDomainSchdmByPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.property)) {
            query.put("Property", request.property);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCdnDomainSchdmByProperty"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCdnDomainSchdmByPropertyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Changes the acceleration region for an accelerated domain name.</p>
     * 
     * @param request ModifyCdnDomainSchdmByPropertyRequest
     * @return ModifyCdnDomainSchdmByPropertyResponse
     */
    public ModifyCdnDomainSchdmByPropertyResponse modifyCdnDomainSchdmByProperty(ModifyCdnDomainSchdmByPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCdnDomainSchdmByPropertyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of real-time log delivery for a specific domain name. Each domain name supports only one Logstore.</p>
     * 
     * @param request ModifyRealtimeLogDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRealtimeLogDeliveryResponse
     */
    public ModifyRealtimeLogDeliveryResponse modifyRealtimeLogDeliveryWithOptions(ModifyRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRealtimeLogDelivery"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRealtimeLogDeliveryResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of real-time log delivery for a specific domain name. Each domain name supports only one Logstore.</p>
     * 
     * @param request ModifyRealtimeLogDeliveryRequest
     * @return ModifyRealtimeLogDeliveryResponse
     */
    public ModifyRealtimeLogDeliveryResponse modifyRealtimeLogDelivery(ModifyRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRealtimeLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud CDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must complete real-name verification to activate Alibaba Cloud CDN.</p>
     * <ul>
     * <li>You can call this operation up to five times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Alibaba Cloud CDN. You must activate Alibaba Cloud CDN before you can manage domain names in Alibaba Cloud CDN.</p>
     * 
     * @param request OpenCdnServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenCdnServiceResponse
     */
    public OpenCdnServiceResponse openCdnServiceWithOptions(OpenCdnServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenCdnService"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenCdnServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud CDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must complete real-name verification to activate Alibaba Cloud CDN.</p>
     * <ul>
     * <li>You can call this operation up to five times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Alibaba Cloud CDN. You must activate Alibaba Cloud CDN before you can manage domain names in Alibaba Cloud CDN.</p>
     * 
     * @param request OpenCdnServiceRequest
     * @return OpenCdnServiceResponse
     */
    public OpenCdnServiceResponse openCdnService(OpenCdnServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openCdnServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Publishes the configurations of the staging environment to the production environment.</p>
     * 
     * @param request PublishStagingConfigToProductionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishStagingConfigToProductionResponse
     */
    public PublishStagingConfigToProductionResponse publishStagingConfigToProductionWithOptions(PublishStagingConfigToProductionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishStagingConfigToProduction"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishStagingConfigToProductionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Publishes the configurations of the staging environment to the production environment.</p>
     * 
     * @param request PublishStagingConfigToProductionRequest
     * @return PublishStagingConfigToProductionResponse
     */
    public PublishStagingConfigToProductionResponse publishStagingConfigToProduction(PublishStagingConfigToProductionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishStagingConfigToProductionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud CDN supports POST requests in which parameters are sent as a form.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/91164.html">RefreshObjectCaches</a> operation to refresh content and call the <a href="https://help.aliyun.com/document_detail/91161.html">PushObjectCache</a> operation to prefetch content.</li>
     * <li>By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.</li>
     * <li>You can specify at most 100 URLs in each prefetch request.</li>
     * <li>For each Alibaba Cloud account, the prefetch queue can contain up to 50,000 URLs. Content is prefetched based on the time when the URLs are submitted. The URL that is submitted the earliest has the highest priority. If the number of URLs in the queue reaches 50,000, you cannot submit more URLs until the number drops below 50,000.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * <li>For more information about how to automate refresh or prefetch tasks, see <a href="https://help.aliyun.com/document_detail/151829.html">Run scripts to refresh and prefetch content</a>.</li>
     * </ul>
     * <h2>Precautions</h2>
     * <ul>
     * <li>After a prefetch task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.</li>
     * <li>The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.</li>
     * <li>To allow RAM users to perform this operation, you must first grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/260300.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Prefetches content from origin servers to points of presence (POPs). This reduces loads on origin servers because users can directly hit cache upon their first visits.</p>
     * 
     * @param request PushObjectCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushObjectCacheResponse
     */
    public PushObjectCacheResponse pushObjectCacheWithOptions(PushObjectCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            query.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l2Preload)) {
            query.put("L2Preload", request.l2Preload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withHeader)) {
            query.put("WithHeader", request.withHeader);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushObjectCache"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushObjectCacheResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud CDN supports POST requests in which parameters are sent as a form.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/91164.html">RefreshObjectCaches</a> operation to refresh content and call the <a href="https://help.aliyun.com/document_detail/91161.html">PushObjectCache</a> operation to prefetch content.</li>
     * <li>By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.</li>
     * <li>You can specify at most 100 URLs in each prefetch request.</li>
     * <li>For each Alibaba Cloud account, the prefetch queue can contain up to 50,000 URLs. Content is prefetched based on the time when the URLs are submitted. The URL that is submitted the earliest has the highest priority. If the number of URLs in the queue reaches 50,000, you cannot submit more URLs until the number drops below 50,000.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * <li>For more information about how to automate refresh or prefetch tasks, see <a href="https://help.aliyun.com/document_detail/151829.html">Run scripts to refresh and prefetch content</a>.</li>
     * </ul>
     * <h2>Precautions</h2>
     * <ul>
     * <li>After a prefetch task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.</li>
     * <li>The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.</li>
     * <li>To allow RAM users to perform this operation, you must first grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/260300.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Prefetches content from origin servers to points of presence (POPs). This reduces loads on origin servers because users can directly hit cache upon their first visits.</p>
     * 
     * @param request PushObjectCacheRequest
     * @return PushObjectCacheResponse
     */
    public PushObjectCacheResponse pushObjectCache(PushObjectCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushObjectCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指定缓存tag刷新节点上的文件内容</p>
     * 
     * @param request RefreshObjectCacheByCacheTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshObjectCacheByCacheTagResponse
     */
    public RefreshObjectCacheByCacheTagResponse refreshObjectCacheByCacheTagWithOptions(RefreshObjectCacheByCacheTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cacheTag)) {
            query.put("CacheTag", request.cacheTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshObjectCacheByCacheTag"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshObjectCacheByCacheTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>指定缓存tag刷新节点上的文件内容</p>
     * 
     * @param request RefreshObjectCacheByCacheTagRequest
     * @return RefreshObjectCacheByCacheTagResponse
     */
    public RefreshObjectCacheByCacheTagResponse refreshObjectCacheByCacheTag(RefreshObjectCacheByCacheTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshObjectCacheByCacheTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud CDN supports POST requests in which parameters are sent as a form.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/91164.html">RefreshObjectCaches</a> operation to refresh content and call the <a href="https://help.aliyun.com/document_detail/91161.html">PushObjectCache</a> operation to prefetch content.</li>
     * <li>You can call the RefreshObjectCaches operation up to 50 times per second per account.</li>
     * <li>For more information about how to automatically refresh or prefetch tasks, see <a href="https://help.aliyun.com/document_detail/151829.html">Run scripts to refresh and prefetch content</a>.</li>
     * </ul>
     * <h2>Precautions</h2>
     * <ul>
     * <li>After a refresh task is submitted and completed, specific resources are removed from POPs. When a POP receives a request for the removed resources, the POP forwards the request to the origin server to retrieve the resources. The retrieved resources are returned to the client and cached on the POP. Multiple refresh tasks may cause a large number of resources to be removed from the POPs. This increases the number of requests that are forwarded to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.</li>
     * <li>A refresh task takes effect 5 to 6 minutes after being submitted. This means that if the resource you want to refresh has a TTL of less than five minutes, you wait for it to expire instead of manually running a refresh task.</li>
     * <li>If you want to use RAM users to refresh or prefetch resources, you must obtain the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/260300.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * <h3>Refresh quota</h3>
     * <ul>
     * <li>By default, each Alibaba Cloud account can refresh content from up to 10,000 URLs and 100 directories per day. The directories include subdirectories. If the daily peak bandwidth value exceeds 200 Mbit/s, you can <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to request a quota increase. Alibaba Cloud CDN evaluates your application based on your workloads.</li>
     * <li>By default, each Alibaba Cloud account can submit up to 20 refresh rules that contain regular expressions per day. If the daily peak bandwidth of your Alibaba Cloud account exceeds 10 Gbit/s, you can <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a> to request a quota increase.</li>
     * <li>You can specify up to 1,000 URL refresh rules, 100 directory refresh rules, or 1 refresh rule that contains regular expressions in each call.</li>
     * <li>You can refresh up to 1,000 URLs per minute for each domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refreshes files on Alibaba Cloud CDN points of presence (POPs). After files are refreshed, the original file content immediately becomes invalid. If clients request the original file content, Alibaba Cloud CDN forwards the requests to the origin server. Then, Alibaba Cloud CDN caches the latest content to the POPs and returns the content to the clients. Alibaba Cloud CDN allows you to refresh content from multiple URLs at the same time.</p>
     * 
     * @param request RefreshObjectCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshObjectCachesResponse
     */
    public RefreshObjectCachesResponse refreshObjectCachesWithOptions(RefreshObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectPath)) {
            query.put("ObjectPath", request.objectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshObjectCaches"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshObjectCachesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud CDN supports POST requests in which parameters are sent as a form.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/91164.html">RefreshObjectCaches</a> operation to refresh content and call the <a href="https://help.aliyun.com/document_detail/91161.html">PushObjectCache</a> operation to prefetch content.</li>
     * <li>You can call the RefreshObjectCaches operation up to 50 times per second per account.</li>
     * <li>For more information about how to automatically refresh or prefetch tasks, see <a href="https://help.aliyun.com/document_detail/151829.html">Run scripts to refresh and prefetch content</a>.</li>
     * </ul>
     * <h2>Precautions</h2>
     * <ul>
     * <li>After a refresh task is submitted and completed, specific resources are removed from POPs. When a POP receives a request for the removed resources, the POP forwards the request to the origin server to retrieve the resources. The retrieved resources are returned to the client and cached on the POP. Multiple refresh tasks may cause a large number of resources to be removed from the POPs. This increases the number of requests that are forwarded to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.</li>
     * <li>A refresh task takes effect 5 to 6 minutes after being submitted. This means that if the resource you want to refresh has a TTL of less than five minutes, you wait for it to expire instead of manually running a refresh task.</li>
     * <li>If you want to use RAM users to refresh or prefetch resources, you must obtain the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/260300.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * <h3>Refresh quota</h3>
     * <ul>
     * <li>By default, each Alibaba Cloud account can refresh content from up to 10,000 URLs and 100 directories per day. The directories include subdirectories. If the daily peak bandwidth value exceeds 200 Mbit/s, you can <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to request a quota increase. Alibaba Cloud CDN evaluates your application based on your workloads.</li>
     * <li>By default, each Alibaba Cloud account can submit up to 20 refresh rules that contain regular expressions per day. If the daily peak bandwidth of your Alibaba Cloud account exceeds 10 Gbit/s, you can <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a> to request a quota increase.</li>
     * <li>You can specify up to 1,000 URL refresh rules, 100 directory refresh rules, or 1 refresh rule that contains regular expressions in each call.</li>
     * <li>You can refresh up to 1,000 URLs per minute for each domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refreshes files on Alibaba Cloud CDN points of presence (POPs). After files are refreshed, the original file content immediately becomes invalid. If clients request the original file content, Alibaba Cloud CDN forwards the requests to the origin server. Then, Alibaba Cloud CDN caches the latest content to the POPs and returns the content to the clients. Alibaba Cloud CDN allows you to refresh content from multiple URLs at the same time.</p>
     * 
     * @param request RefreshObjectCachesRequest
     * @return RefreshObjectCachesResponse
     */
    public RefreshObjectCachesResponse refreshObjectCaches(RefreshObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshObjectCachesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Rolls back configurations in the staging environment. After you call this operation, all configurations in the staging environment are cleared.</p>
     * 
     * @param request RollbackStagingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackStagingConfigResponse
     */
    public RollbackStagingConfigResponse rollbackStagingConfigWithOptions(RollbackStagingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackStagingConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackStagingConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Rolls back configurations in the staging environment. After you call this operation, all configurations in the staging environment are cleared.</p>
     * 
     * @param request RollbackStagingConfigRequest
     * @return RollbackStagingConfigResponse
     */
    public RollbackStagingConfigResponse rollbackStagingConfig(RollbackStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackStagingConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to configure an SSL certificate for a specific domain name.</p>
     * 
     * @param request SetCdnDomainCSRCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCdnDomainCSRCertificateResponse
     */
    public SetCdnDomainCSRCertificateResponse setCdnDomainCSRCertificateWithOptions(SetCdnDomainCSRCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificate)) {
            query.put("ServerCertificate", request.serverCertificate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCdnDomainCSRCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCdnDomainCSRCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to configure an SSL certificate for a specific domain name.</p>
     * 
     * @param request SetCdnDomainCSRCertificateRequest
     * @return SetCdnDomainCSRCertificateResponse
     */
    public SetCdnDomainCSRCertificateResponse setCdnDomainCSRCertificate(SetCdnDomainCSRCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCdnDomainCSRCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a ShangMi (SM) certificate for a domain name.</p>
     * 
     * @param request SetCdnDomainSMCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCdnDomainSMCertificateResponse
     */
    public SetCdnDomainSMCertificateResponse setCdnDomainSMCertificateWithOptions(SetCdnDomainSMCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLProtocol)) {
            query.put("SSLProtocol", request.SSLProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCdnDomainSMCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCdnDomainSMCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a ShangMi (SM) certificate for a domain name.</p>
     * 
     * @param request SetCdnDomainSMCertificateRequest
     * @return SetCdnDomainSMCertificateResponse
     */
    public SetCdnDomainSMCertificateResponse setCdnDomainSMCertificate(SetCdnDomainSMCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCdnDomainSMCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * <ul>
     * <li>Method: POST.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the certificate for a domain name and updates the certificate information.</p>
     * 
     * @param request SetCdnDomainSSLCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCdnDomainSSLCertificateResponse
     */
    public SetCdnDomainSSLCertificateResponse setCdnDomainSSLCertificateWithOptions(SetCdnDomainSSLCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRegion)) {
            query.put("CertRegion", request.certRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPri)) {
            query.put("SSLPri", request.SSLPri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLProtocol)) {
            query.put("SSLProtocol", request.SSLProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPub)) {
            query.put("SSLPub", request.SSLPub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCdnDomainSSLCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCdnDomainSSLCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * <ul>
     * <li>Method: POST.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the certificate for a domain name and updates the certificate information.</p>
     * 
     * @param request SetCdnDomainSSLCertificateRequest
     * @return SetCdnDomainSSLCertificateResponse
     */
    public SetCdnDomainSSLCertificateResponse setCdnDomainSSLCertificate(SetCdnDomainSSLCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCdnDomainSSLCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures a domain name to be accelerated in the staging environment.</p>
     * 
     * @param request SetCdnDomainStagingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCdnDomainStagingConfigResponse
     */
    public SetCdnDomainStagingConfigResponse setCdnDomainStagingConfigWithOptions(SetCdnDomainStagingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functions)) {
            query.put("Functions", request.functions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCdnDomainStagingConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCdnDomainStagingConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures a domain name to be accelerated in the staging environment.</p>
     * 
     * @param request SetCdnDomainStagingConfigRequest
     * @return SetCdnDomainStagingConfigResponse
     */
    public SetCdnDomainStagingConfigResponse setCdnDomainStagingConfig(SetCdnDomainStagingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCdnDomainStagingConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置CDN上的海量封禁功能</p>
     * 
     * @param request SetCdnFullDomainsBlockIPRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCdnFullDomainsBlockIPResponse
     */
    public SetCdnFullDomainsBlockIPResponse setCdnFullDomainsBlockIPWithOptions(SetCdnFullDomainsBlockIPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blockInterval)) {
            body.put("BlockInterval", request.blockInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPList)) {
            body.put("IPList", request.IPList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            body.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateType)) {
            body.put("UpdateType", request.updateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCdnFullDomainsBlockIP"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCdnFullDomainsBlockIPResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置CDN上的海量封禁功能</p>
     * 
     * @param request SetCdnFullDomainsBlockIPRequest
     * @return SetCdnFullDomainsBlockIPResponse
     */
    public SetCdnFullDomainsBlockIPResponse setCdnFullDomainsBlockIP(SetCdnFullDomainsBlockIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCdnFullDomainsBlockIPWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per user.</p>
     * <ul>
     * <li>Method: POST.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures an SSL certificate for an accelerated domain name.</p>
     * 
     * @deprecated OpenAPI SetDomainServerCertificate is deprecated, please use Cdn::2018-05-10::SetCdnDomainSSLCertificate instead.
     * 
     * @param request SetDomainServerCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDomainServerCertificateResponse
     */
    @Deprecated
    // Deprecated
    public SetDomainServerCertificateResponse setDomainServerCertificateWithOptions(SetDomainServerCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceSet)) {
            query.put("ForceSet", request.forceSet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            query.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificate)) {
            query.put("ServerCertificate", request.serverCertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateStatus)) {
            query.put("ServerCertificateStatus", request.serverCertificateStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainServerCertificate"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainServerCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per user.</p>
     * <ul>
     * <li>Method: POST.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures an SSL certificate for an accelerated domain name.</p>
     * 
     * @deprecated OpenAPI SetDomainServerCertificate is deprecated, please use Cdn::2018-05-10::SetCdnDomainSSLCertificate instead.
     * 
     * @param request SetDomainServerCertificateRequest
     * @return SetDomainServerCertificateResponse
     */
    @Deprecated
    // Deprecated
    public SetDomainServerCertificateResponse setDomainServerCertificate(SetDomainServerCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDomainServerCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets a custom origin header.</p>
     * 
     * @param request SetReqHeaderConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetReqHeaderConfigResponse
     */
    public SetReqHeaderConfigResponse setReqHeaderConfigWithOptions(SetReqHeaderConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetReqHeaderConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetReqHeaderConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets a custom origin header.</p>
     * 
     * @param request SetReqHeaderConfigRequest
     * @return SetReqHeaderConfigResponse
     */
    public SetReqHeaderConfigResponse setReqHeaderConfig(SetReqHeaderConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setReqHeaderConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures the virtual waiting room feature for an accelerated domain name. This operation is available only for accelerated domain names of the Dynamic CDN workload type.</p>
     * 
     * @param request SetWaitingRoomConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetWaitingRoomConfigResponse
     */
    public SetWaitingRoomConfigResponse setWaitingRoomConfigWithOptions(SetWaitingRoomConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowPct)) {
            query.put("AllowPct", request.allowPct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gapTime)) {
            query.put("GapTime", request.gapTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTimeWait)) {
            query.put("MaxTimeWait", request.maxTimeWait);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitUri)) {
            query.put("WaitUri", request.waitUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitUrl)) {
            query.put("WaitUrl", request.waitUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetWaitingRoomConfig"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetWaitingRoomConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures the virtual waiting room feature for an accelerated domain name. This operation is available only for accelerated domain names of the Dynamic CDN workload type.</p>
     * 
     * @param request SetWaitingRoomConfigRequest
     * @return SetWaitingRoomConfigResponse
     */
    public SetWaitingRoomConfigResponse setWaitingRoomConfig(SetWaitingRoomConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setWaitingRoomConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If the domain name is in an invalid state or you have an overdue payment in your account, the domain name cannot be enabled.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a disabled domain name. After the domain name is enabled, the value of the DomainStatus parameter is changed to Online.</p>
     * 
     * @param request StartCdnDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartCdnDomainResponse
     */
    public StartCdnDomainResponse startCdnDomainWithOptions(StartCdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCdnDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If the domain name is in an invalid state or you have an overdue payment in your account, the domain name cannot be enabled.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a disabled domain name. After the domain name is enabled, the value of the DomainStatus parameter is changed to Online.</p>
     * 
     * @param request StartCdnDomainRequest
     * @return StartCdnDomainResponse
     */
    public StartCdnDomainResponse startCdnDomain(StartCdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After an accelerated domain is disabled, Alibaba Cloud CDN retains its information and routes all the requests that are destined for the accelerated domain to the origin server.</p>
     * <ul>
     * <li>You can call this operation up to 40 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables an accelerated domain name. After the domain name is disabled, the value of the DomainStatus parameter is changed to Offline.</p>
     * 
     * @param request StopCdnDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopCdnDomainResponse
     */
    public StopCdnDomainResponse stopCdnDomainWithOptions(StopCdnDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCdnDomain"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCdnDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After an accelerated domain is disabled, Alibaba Cloud CDN retains its information and routes all the requests that are destined for the accelerated domain to the origin server.</p>
     * <ul>
     * <li>You can call this operation up to 40 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables an accelerated domain name. After the domain name is disabled, the value of the DomainStatus parameter is changed to Offline.</p>
     * 
     * @param request StopCdnDomainRequest
     * @return StopCdnDomainResponse
     */
    public StopCdnDomainResponse stopCdnDomain(StopCdnDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopCdnDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more tags to specific resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more tags to specific resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from specified resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from specified resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates a tracking task.</p>
     * 
     * @param request UpdateCdnDeliverTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCdnDeliverTaskResponse
     */
    public UpdateCdnDeliverTaskResponse updateCdnDeliverTaskWithOptions(UpdateCdnDeliverTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliver)) {
            body.put("Deliver", request.deliver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverId)) {
            body.put("DeliverId", request.deliverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reports)) {
            body.put("Reports", request.reports);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("Schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCdnDeliverTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCdnDeliverTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates a tracking task.</p>
     * 
     * @param request UpdateCdnDeliverTaskRequest
     * @return UpdateCdnDeliverTaskResponse
     */
    public UpdateCdnDeliverTaskResponse updateCdnDeliverTask(UpdateCdnDeliverTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCdnDeliverTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates one or more operations reports.</p>
     * 
     * @param request UpdateCdnSubTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCdnSubTaskResponse
     */
    public UpdateCdnSubTaskResponse updateCdnSubTaskWithOptions(UpdateCdnSubTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportIds)) {
            body.put("ReportIds", request.reportIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCdnSubTask"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCdnSubTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates one or more operations reports.</p>
     * 
     * @param request UpdateCdnSubTaskRequest
     * @return UpdateCdnSubTaskResponse
     */
    public UpdateCdnSubTaskResponse updateCdnSubTask(UpdateCdnSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCdnSubTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a specified Function Compute trigger.</p>
     * 
     * @param request UpdateFCTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFCTriggerResponse
     */
    public UpdateFCTriggerResponse updateFCTriggerWithOptions(UpdateFCTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.triggerARN)) {
            query.put("TriggerARN", request.triggerARN);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionARN)) {
            body.put("FunctionARN", request.functionARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notes)) {
            body.put("Notes", request.notes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleARN)) {
            body.put("RoleARN", request.roleARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceARN)) {
            body.put("SourceARN", request.sourceARN);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFCTrigger"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFCTriggerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a specified Function Compute trigger.</p>
     * 
     * @param request UpdateFCTriggerRequest
     * @return UpdateFCTriggerResponse
     */
    public UpdateFCTriggerResponse updateFCTrigger(UpdateFCTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFCTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ownership of a specified domain name.</p>
     * 
     * @param request VerifyDomainOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyDomainOwnerResponse
     */
    public VerifyDomainOwnerResponse verifyDomainOwnerWithOptions(VerifyDomainOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyType)) {
            query.put("VerifyType", request.verifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyDomainOwner"),
            new TeaPair("version", "2018-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyDomainOwnerResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ownership of a specified domain name.</p>
     * 
     * @param request VerifyDomainOwnerRequest
     * @return VerifyDomainOwnerResponse
     */
    public VerifyDomainOwnerResponse verifyDomainOwner(VerifyDomainOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyDomainOwnerWithOptions(request, runtime);
    }
}
