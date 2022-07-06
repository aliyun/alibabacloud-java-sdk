// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324;

import com.aliyun.tea.*;
import com.aliyun.agency20200324.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "agency.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "agency.aliyuncs.com"),
            new TeaPair("ap-south-1", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-chengdu", "agency.aliyuncs.com"),
            new TeaPair("cn-edge-1", "agency.aliyuncs.com"),
            new TeaPair("cn-fujian", "agency.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "agency.aliyuncs.com"),
            new TeaPair("cn-hongkong", "agency.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "agency.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "agency.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "agency.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "agency.aliyuncs.com"),
            new TeaPair("cn-qingdao", "agency.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-wuhan", "agency.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "agency.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "agency.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "agency.aliyuncs.com"),
            new TeaPair("eu-central-1", "agency.aliyuncs.com"),
            new TeaPair("eu-west-1", "agency.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "agency.aliyuncs.com"),
            new TeaPair("me-east-1", "agency.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "agency.aliyuncs.com"),
            new TeaPair("us-east-1", "agency.aliyuncs.com"),
            new TeaPair("us-west-1", "agency.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agency", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateBpmsRecordResponse createBpmsRecordWithOptions(CreateBpmsRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bpmsParamJson)) {
            query.put("BpmsParamJson", request.bpmsParamJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bpmsType)) {
            query.put("BpmsType", request.bpmsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partnerId)) {
            query.put("PartnerId", request.partnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBpmsRecord"),
            new TeaPair("version", "2020-03-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBpmsRecordResponse());
    }

    public CreateBpmsRecordResponse createBpmsRecord(CreateBpmsRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBpmsRecordWithOptions(request, runtime);
    }

    public CreateBpmsResultResponse createBpmsResultWithOptions(CreateBpmsResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyStatus)) {
            query.put("ApplyStatus", request.applyStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bpmsResultId)) {
            query.put("BpmsResultId", request.bpmsResultId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBpmsResult"),
            new TeaPair("version", "2020-03-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBpmsResultResponse());
    }

    public CreateBpmsResultResponse createBpmsResult(CreateBpmsResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBpmsResultWithOptions(request, runtime);
    }

    public GetCustomerRebateTypeResponse getCustomerRebateTypeWithOptions(GetCustomerRebateTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferUid)) {
            query.put("TransferUid", request.transferUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerRebateType"),
            new TeaPair("version", "2020-03-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerRebateTypeResponse());
    }

    public GetCustomerRebateTypeResponse getCustomerRebateType(GetCustomerRebateTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerRebateTypeWithOptions(request, runtime);
    }

    public QueryBpmsListResponse queryBpmsListWithOptions(QueryBpmsListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bpmsType)) {
            query.put("BpmsType", request.bpmsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerName)) {
            query.put("CustomerName", request.customerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partnerId)) {
            query.put("PartnerId", request.partnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeEnd)) {
            query.put("TimeEnd", request.timeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStart)) {
            query.put("TimeStart", request.timeStart);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBpmsList"),
            new TeaPair("version", "2020-03-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBpmsListResponse());
    }

    public QueryBpmsListResponse queryBpmsList(QueryBpmsListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBpmsListWithOptions(request, runtime);
    }

    public TransferResellerToUserResponse transferResellerToUserWithOptions(TransferResellerToUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.empId)) {
            query.put("EmpId", request.empId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realName)) {
            query.put("RealName", request.realName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferUid)) {
            query.put("TransferUid", request.transferUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferResellerToUser"),
            new TeaPair("version", "2020-03-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferResellerToUserResponse());
    }

    public TransferResellerToUserResponse transferResellerToUser(TransferResellerToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferResellerToUserWithOptions(request, runtime);
    }

    public TransferUserToResellerResponse transferUserToResellerWithOptions(TransferUserToResellerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.empId)) {
            query.put("EmpId", request.empId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUid)) {
            query.put("ParentUid", request.parentUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realName)) {
            query.put("RealName", request.realName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferUid)) {
            query.put("TransferUid", request.transferUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferUserToReseller"),
            new TeaPair("version", "2020-03-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferUserToResellerResponse());
    }

    public TransferUserToResellerResponse transferUserToReseller(TransferUserToResellerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferUserToResellerWithOptions(request, runtime);
    }
}
