// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810;

import com.aliyun.tea.*;
import com.aliyun.beian20160810.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("beian", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request DeleteUnbeianIpCheckTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUnbeianIpCheckTypeResponse
     */
    public DeleteUnbeianIpCheckTypeResponse deleteUnbeianIpCheckTypeWithOptions(DeleteUnbeianIpCheckTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUnbeianIpCheckType"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUnbeianIpCheckTypeResponse());
    }

    /**
     * @param request DeleteUnbeianIpCheckTypeRequest
     * @return DeleteUnbeianIpCheckTypeResponse
     */
    public DeleteUnbeianIpCheckTypeResponse deleteUnbeianIpCheckType(DeleteUnbeianIpCheckTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUnbeianIpCheckTypeWithOptions(request, runtime);
    }

    /**
     * @summary 获取主域名接口
     *
     * @param request GetMainDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMainDomainResponse
     */
    public GetMainDomainResponse getMainDomainWithOptions(GetMainDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMainDomain"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMainDomainResponse());
    }

    /**
     * @summary 获取主域名接口
     *
     * @param request GetMainDomainRequest
     * @return GetMainDomainResponse
     */
    public GetMainDomainResponse getMainDomain(GetMainDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMainDomainWithOptions(request, runtime);
    }

    /**
     * @param request InsertUnbeianIpCheckTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertUnbeianIpCheckTypeResponse
     */
    public InsertUnbeianIpCheckTypeResponse insertUnbeianIpCheckTypeWithOptions(InsertUnbeianIpCheckTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertUnbeianIpCheckType"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertUnbeianIpCheckTypeResponse());
    }

    /**
     * @param request InsertUnbeianIpCheckTypeRequest
     * @return InsertUnbeianIpCheckTypeResponse
     */
    public InsertUnbeianIpCheckTypeResponse insertUnbeianIpCheckType(InsertUnbeianIpCheckTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertUnbeianIpCheckTypeWithOptions(request, runtime);
    }

    /**
     * @param request ListUnbeianIpCheckTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUnbeianIpCheckTypeResponse
     */
    public ListUnbeianIpCheckTypeResponse listUnbeianIpCheckTypeWithOptions(ListUnbeianIpCheckTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUnbeianIpCheckType"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUnbeianIpCheckTypeResponse());
    }

    /**
     * @param request ListUnbeianIpCheckTypeRequest
     * @return ListUnbeianIpCheckTypeResponse
     */
    public ListUnbeianIpCheckTypeResponse listUnbeianIpCheckType(ListUnbeianIpCheckTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUnbeianIpCheckTypeWithOptions(request, runtime);
    }

    /**
     * @summary 接入方服务域名上报接口
     *
     * @param request ManageAccessorDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManageAccessorDomainResponse
     */
    public ManageAccessorDomainResponse manageAccessorDomainWithOptions(ManageAccessorDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManageAccessorDomain"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManageAccessorDomainResponse());
    }

    /**
     * @summary 接入方服务域名上报接口
     *
     * @param request ManageAccessorDomainRequest
     * @return ManageAccessorDomainResponse
     */
    public ManageAccessorDomainResponse manageAccessorDomain(ManageAccessorDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manageAccessorDomainWithOptions(request, runtime);
    }

    /**
     * @summary 接入方域名白名单上报接口
     *
     * @param request ManageAccessorDomainWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManageAccessorDomainWhiteListResponse
     */
    public ManageAccessorDomainWhiteListResponse manageAccessorDomainWhiteListWithOptions(ManageAccessorDomainWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManageAccessorDomainWhiteList"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManageAccessorDomainWhiteListResponse());
    }

    /**
     * @summary 接入方域名白名单上报接口
     *
     * @param request ManageAccessorDomainWhiteListRequest
     * @return ManageAccessorDomainWhiteListResponse
     */
    public ManageAccessorDomainWhiteListResponse manageAccessorDomainWhiteList(ManageAccessorDomainWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manageAccessorDomainWhiteListWithOptions(request, runtime);
    }

    /**
     * @summary 接入方管控IP上报接口
     *
     * @param request ManageAccessorIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManageAccessorIpResponse
     */
    public ManageAccessorIpResponse manageAccessorIpWithOptions(ManageAccessorIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManageAccessorIp"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManageAccessorIpResponse());
    }

    /**
     * @summary 接入方管控IP上报接口
     *
     * @param request ManageAccessorIpRequest
     * @return ManageAccessorIpResponse
     */
    public ManageAccessorIpResponse manageAccessorIp(ManageAccessorIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manageAccessorIpWithOptions(request, runtime);
    }

    /**
     * @summary 接入方服务域名是否上报查询接口
     *
     * @param request QueryAccessorDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccessorDomainResponse
     */
    public QueryAccessorDomainResponse queryAccessorDomainWithOptions(QueryAccessorDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccessorDomain"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccessorDomainResponse());
    }

    /**
     * @summary 接入方服务域名是否上报查询接口
     *
     * @param request QueryAccessorDomainRequest
     * @return QueryAccessorDomainResponse
     */
    public QueryAccessorDomainResponse queryAccessorDomain(QueryAccessorDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccessorDomainWithOptions(request, runtime);
    }

    /**
     * @summary 接入方查询服务域名列表接口
     *
     * @param request QueryAccessorDomainListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccessorDomainListResponse
     */
    public QueryAccessorDomainListResponse queryAccessorDomainListWithOptions(QueryAccessorDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccessorDomainList"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccessorDomainListResponse());
    }

    /**
     * @summary 接入方查询服务域名列表接口
     *
     * @param request QueryAccessorDomainListRequest
     * @return QueryAccessorDomainListResponse
     */
    public QueryAccessorDomainListResponse queryAccessorDomainList(QueryAccessorDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccessorDomainListWithOptions(request, runtime);
    }

    /**
     * @summary 接入方域名状态查询接口
     *
     * @param request QueryAccessorDomainStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccessorDomainStatusResponse
     */
    public QueryAccessorDomainStatusResponse queryAccessorDomainStatusWithOptions(QueryAccessorDomainStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccessorDomainStatus"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccessorDomainStatusResponse());
    }

    /**
     * @summary 接入方域名状态查询接口
     *
     * @param request QueryAccessorDomainStatusRequest
     * @return QueryAccessorDomainStatusResponse
     */
    public QueryAccessorDomainStatusResponse queryAccessorDomainStatus(QueryAccessorDomainStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccessorDomainStatusWithOptions(request, runtime);
    }

    /**
     * @summary 接入方域名白名单上报查询接口
     *
     * @param request QueryAccessorDomainWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccessorDomainWhiteListResponse
     */
    public QueryAccessorDomainWhiteListResponse queryAccessorDomainWhiteListWithOptions(QueryAccessorDomainWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccessorDomainWhiteList"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccessorDomainWhiteListResponse());
    }

    /**
     * @summary 接入方域名白名单上报查询接口
     *
     * @param request QueryAccessorDomainWhiteListRequest
     * @return QueryAccessorDomainWhiteListResponse
     */
    public QueryAccessorDomainWhiteListResponse queryAccessorDomainWhiteList(QueryAccessorDomainWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccessorDomainWhiteListWithOptions(request, runtime);
    }

    /**
     * @summary 接入方域名状态批量查询接口
     *
     * @param request QueryAccessorDomainsStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccessorDomainsStatusResponse
     */
    public QueryAccessorDomainsStatusResponse queryAccessorDomainsStatusWithOptions(QueryAccessorDomainsStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccessorDomainsStatus"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccessorDomainsStatusResponse());
    }

    /**
     * @summary 接入方域名状态批量查询接口
     *
     * @param request QueryAccessorDomainsStatusRequest
     * @return QueryAccessorDomainsStatusResponse
     */
    public QueryAccessorDomainsStatusResponse queryAccessorDomainsStatus(QueryAccessorDomainsStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccessorDomainsStatusWithOptions(request, runtime);
    }

    /**
     * @summary 接入方服务域名上报接口
     *
     * @param request QueryAccessorIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccessorIpResponse
     */
    public QueryAccessorIpResponse queryAccessorIpWithOptions(QueryAccessorIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccessorIp"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccessorIpResponse());
    }

    /**
     * @summary 接入方服务域名上报接口
     *
     * @param request QueryAccessorIpRequest
     * @return QueryAccessorIpResponse
     */
    public QueryAccessorIpResponse queryAccessorIp(QueryAccessorIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccessorIpWithOptions(request, runtime);
    }

    /**
     * @summary 接入方服务域名全量上报接口
     *
     * @param request SubmitAccessorFullDomainsOssListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAccessorFullDomainsOssListResponse
     */
    public SubmitAccessorFullDomainsOssListResponse submitAccessorFullDomainsOssListWithOptions(SubmitAccessorFullDomainsOssListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossList)) {
            query.put("OssList", request.ossList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAccessorFullDomainsOssList"),
            new TeaPair("version", "2016-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAccessorFullDomainsOssListResponse());
    }

    /**
     * @summary 接入方服务域名全量上报接口
     *
     * @param request SubmitAccessorFullDomainsOssListRequest
     * @return SubmitAccessorFullDomainsOssListResponse
     */
    public SubmitAccessorFullDomainsOssListResponse submitAccessorFullDomainsOssList(SubmitAccessorFullDomainsOssListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAccessorFullDomainsOssListWithOptions(request, runtime);
    }
}
