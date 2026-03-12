// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511;

import com.aliyun.tea.*;
import com.aliyun.domain20160511.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("domain", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>域名检查</p>
     * 
     * @param request CheckDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDomainResponse
     */
    public CheckDomainResponse checkDomainWithOptions(CheckDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDomain"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>域名检查</p>
     * 
     * @param request CheckDomainRequest
     * @return CheckDomainResponse
     */
    public CheckDomainResponse checkDomain(CheckDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除联系人模板</p>
     * 
     * @param request DeleteContactTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactTemplateResponse
     */
    public DeleteContactTemplateResponse deleteContactTemplateWithOptions(DeleteContactTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContactTemplate"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除联系人模板</p>
     * 
     * @param request DeleteContactTemplateRequest
     * @return DeleteContactTemplateResponse
     */
    public DeleteContactTemplateResponse deleteContactTemplate(DeleteContactTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务详情列表</p>
     * 
     * @param request QueryBatchTaskDetailListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBatchTaskDetailListResponse
     */
    public QueryBatchTaskDetailListResponse queryBatchTaskDetailListWithOptions(QueryBatchTaskDetailListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleId)) {
            query.put("SaleId", request.saleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskNo)) {
            query.put("TaskNo", request.taskNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBatchTaskDetailList"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBatchTaskDetailListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务详情列表</p>
     * 
     * @param request QueryBatchTaskDetailListRequest
     * @return QueryBatchTaskDetailListResponse
     */
    public QueryBatchTaskDetailListResponse queryBatchTaskDetailList(QueryBatchTaskDetailListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBatchTaskDetailListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param request QueryBatchTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBatchTaskListResponse
     */
    public QueryBatchTaskListResponse queryBatchTaskListWithOptions(QueryBatchTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginCreateTime)) {
            query.put("BeginCreateTime", request.beginCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCreateTime)) {
            query.put("EndCreateTime", request.endCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBatchTaskList"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBatchTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param request QueryBatchTaskListRequest
     * @return QueryBatchTaskListResponse
     */
    public QueryBatchTaskListResponse queryBatchTaskList(QueryBatchTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBatchTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人</p>
     * 
     * @param request QueryContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryContactResponse
     */
    public QueryContactResponse queryContactWithOptions(QueryContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryContact"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人</p>
     * 
     * @param request QueryContactRequest
     * @return QueryContactResponse
     */
    public QueryContactResponse queryContact(QueryContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人模板</p>
     * 
     * @param request QueryContactTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryContactTemplateResponse
     */
    public QueryContactTemplateResponse queryContactTemplateWithOptions(QueryContactTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CCompany)) {
            query.put("CCompany", request.CCompany);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultTemplate)) {
            query.put("DefaultTemplate", request.defaultTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ECompany)) {
            query.put("ECompany", request.ECompany);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regType)) {
            query.put("RegType", request.regType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryContactTemplate"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryContactTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人模板</p>
     * 
     * @param request QueryContactTemplateRequest
     * @return QueryContactTemplateResponse
     */
    public QueryContactTemplateResponse queryContactTemplate(QueryContactTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryContactTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据saleId查询域名信息</p>
     * 
     * @param request QueryDomainBySaleIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainBySaleIdResponse
     */
    public QueryDomainBySaleIdResponse queryDomainBySaleIdWithOptions(QueryDomainBySaleIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleId)) {
            query.put("SaleId", request.saleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainBySaleId"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainBySaleIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据saleId查询域名信息</p>
     * 
     * @param request QueryDomainBySaleIdRequest
     * @return QueryDomainBySaleIdResponse
     */
    public QueryDomainBySaleIdResponse queryDomainBySaleId(QueryDomainBySaleIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainBySaleIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名列表</p>
     * 
     * @param request QueryDomainListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainListResponse
     */
    public QueryDomainListResponse queryDomainListWithOptions(QueryDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deadEndDate)) {
            query.put("DeadEndDate", request.deadEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deadStartDate)) {
            query.put("DeadStartDate", request.deadStartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainType)) {
            query.put("DomainType", request.domainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByType)) {
            query.put("OrderByType", request.orderByType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderKeyType)) {
            query.put("OrderKeyType", request.orderKeyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDomainType)) {
            query.put("ProductDomainType", request.productDomainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regEndDate)) {
            query.put("RegEndDate", request.regEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regStartDate)) {
            query.put("RegStartDate", request.regStartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainList"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名列表</p>
     * 
     * @param request QueryDomainListRequest
     * @return QueryDomainListResponse
     */
    public QueryDomainListResponse queryDomainList(QueryDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询失败原因列表</p>
     * 
     * @param request QueryFailReasonListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFailReasonListResponse
     */
    public QueryFailReasonListResponse queryFailReasonListWithOptions(QueryFailReasonListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleId)) {
            query.put("SaleId", request.saleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFailReasonList"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFailReasonListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询失败原因列表</p>
     * 
     * @param request QueryFailReasonListRequest
     * @return QueryFailReasonListResponse
     */
    public QueryFailReasonListResponse queryFailReasonList(QueryFailReasonListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFailReasonListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存联系人模板</p>
     * 
     * @param request SaveContactTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveContactTemplateResponse
     */
    public SaveContactTemplateResponse saveContactTemplateWithOptions(SaveContactTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CCity)) {
            query.put("CCity", request.CCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CCompany)) {
            query.put("CCompany", request.CCompany);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CCountry)) {
            query.put("CCountry", request.CCountry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CName)) {
            query.put("CName", request.CName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CProvince)) {
            query.put("CProvince", request.CProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CVenu)) {
            query.put("CVenu", request.CVenu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultTemplate)) {
            query.put("DefaultTemplate", request.defaultTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ECity)) {
            query.put("ECity", request.ECity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ECompany)) {
            query.put("ECompany", request.ECompany);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EName)) {
            query.put("EName", request.EName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EProvince)) {
            query.put("EProvince", request.EProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EVenu)) {
            query.put("EVenu", request.EVenu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postalCode)) {
            query.put("PostalCode", request.postalCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regType)) {
            query.put("RegType", request.regType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telArea)) {
            query.put("TelArea", request.telArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telExt)) {
            query.put("TelExt", request.telExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telMain)) {
            query.put("TelMain", request.telMain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveContactTemplate"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveContactTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存联系人模板</p>
     * 
     * @param request SaveContactTemplateRequest
     * @return SaveContactTemplateResponse
     */
    public SaveContactTemplateResponse saveContactTemplate(SaveContactTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveContactTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存联系人模板实名资料</p>
     * 
     * @param request SaveContactTemplateCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveContactTemplateCredentialResponse
     */
    public SaveContactTemplateCredentialResponse saveContactTemplateCredentialWithOptions(SaveContactTemplateCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credential)) {
            query.put("Credential", request.credential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialNo)) {
            query.put("CredentialNo", request.credentialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveContactTemplateCredential"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveContactTemplateCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存联系人模板实名资料</p>
     * 
     * @param request SaveContactTemplateCredentialRequest
     * @return SaveContactTemplateCredentialResponse
     */
    public SaveContactTemplateCredentialResponse saveContactTemplateCredential(SaveContactTemplateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveContactTemplateCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名dns任务,对外开放接口，用于domain中</p>
     * 
     * @param request SaveTaskForModifyingDomainDnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForModifyingDomainDnsResponse
     */
    public SaveTaskForModifyingDomainDnsResponse saveTaskForModifyingDomainDnsWithOptions(SaveTaskForModifyingDomainDnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunDns)) {
            query.put("AliyunDns", request.aliyunDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsList)) {
            query.put("DnsList", request.dnsList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleId)) {
            query.put("SaleId", request.saleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForModifyingDomainDns"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForModifyingDomainDnsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名dns任务,对外开放接口，用于domain中</p>
     * 
     * @param request SaveTaskForModifyingDomainDnsRequest
     * @return SaveTaskForModifyingDomainDnsResponse
     */
    public SaveTaskForModifyingDomainDnsResponse saveTaskForModifyingDomainDns(SaveTaskForModifyingDomainDnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForModifyingDomainDnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存域名实名资料任务</p>
     * 
     * @param request SaveTaskForSubmittingDomainNameCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForSubmittingDomainNameCredentialResponse
     */
    public SaveTaskForSubmittingDomainNameCredentialResponse saveTaskForSubmittingDomainNameCredentialWithOptions(SaveTaskForSubmittingDomainNameCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credential)) {
            query.put("Credential", request.credential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialNo)) {
            query.put("CredentialNo", request.credentialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialType)) {
            query.put("CredentialType", request.credentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleId)) {
            query.put("SaleId", request.saleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForSubmittingDomainNameCredential"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForSubmittingDomainNameCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存域名实名资料任务</p>
     * 
     * @param request SaveTaskForSubmittingDomainNameCredentialRequest
     * @return SaveTaskForSubmittingDomainNameCredentialResponse
     */
    public SaveTaskForSubmittingDomainNameCredentialResponse saveTaskForSubmittingDomainNameCredential(SaveTaskForSubmittingDomainNameCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForSubmittingDomainNameCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据模板保存域名的实名认证信息</p>
     * 
     * @param request SaveTaskForSubmittingDomainNameCredentialByTemplateIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse
     */
    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse saveTaskForSubmittingDomainNameCredentialByTemplateIdWithOptions(SaveTaskForSubmittingDomainNameCredentialByTemplateIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleId)) {
            query.put("SaleId", request.saleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForSubmittingDomainNameCredentialByTemplateId"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据模板保存域名的实名认证信息</p>
     * 
     * @param request SaveTaskForSubmittingDomainNameCredentialByTemplateIdRequest
     * @return SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse
     */
    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse saveTaskForSubmittingDomainNameCredentialByTemplateId(SaveTaskForSubmittingDomainNameCredentialByTemplateIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForSubmittingDomainNameCredentialByTemplateIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存修改联系人的任务</p>
     * 
     * @param request SaveTaskForUpdatingContactByTempateIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForUpdatingContactByTempateIdResponse
     */
    public SaveTaskForUpdatingContactByTempateIdResponse saveTaskForUpdatingContactByTempateIdWithOptions(SaveTaskForUpdatingContactByTempateIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addTransferLock)) {
            query.put("AddTransferLock", request.addTransferLock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleId)) {
            query.put("SaleId", request.saleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForUpdatingContactByTempateId"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForUpdatingContactByTempateIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存修改联系人的任务</p>
     * 
     * @param request SaveTaskForUpdatingContactByTempateIdRequest
     * @return SaveTaskForUpdatingContactByTempateIdResponse
     */
    public SaveTaskForUpdatingContactByTempateIdResponse saveTaskForUpdatingContactByTempateId(SaveTaskForUpdatingContactByTempateIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForUpdatingContactByTempateIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存修改联系人的任务</p>
     * 
     * @param request SaveTaskForUpdatingContactByTemplateIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForUpdatingContactByTemplateIdResponse
     */
    public SaveTaskForUpdatingContactByTemplateIdResponse saveTaskForUpdatingContactByTemplateIdWithOptions(SaveTaskForUpdatingContactByTemplateIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addTransferLock)) {
            query.put("AddTransferLock", request.addTransferLock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleId)) {
            query.put("SaleId", request.saleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForUpdatingContactByTemplateId"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForUpdatingContactByTemplateIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存修改联系人的任务</p>
     * 
     * @param request SaveTaskForUpdatingContactByTemplateIdRequest
     * @return SaveTaskForUpdatingContactByTemplateIdResponse
     */
    public SaveTaskForUpdatingContactByTemplateIdResponse saveTaskForUpdatingContactByTemplateId(SaveTaskForUpdatingContactByTemplateIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForUpdatingContactByTemplateIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启或者关闭whois保护</p>
     * 
     * @param request WhoisProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WhoisProtectionResponse
     */
    public WhoisProtectionResponse whoisProtectionWithOptions(WhoisProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataContent)) {
            query.put("DataContent", request.dataContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            query.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whoisProtect)) {
            query.put("WhoisProtect", request.whoisProtect);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WhoisProtection"),
            new TeaPair("version", "2016-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WhoisProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启或者关闭whois保护</p>
     * 
     * @param request WhoisProtectionRequest
     * @return WhoisProtectionResponse
     */
    public WhoisProtectionResponse whoisProtection(WhoisProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.whoisProtectionWithOptions(request, runtime);
    }
}
