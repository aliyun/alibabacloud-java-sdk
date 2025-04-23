// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227;

import com.aliyun.tea.*;
import com.aliyun.agency20250227.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>summary</b> : 
     * <p>查询账单导出文件</p>
     * 
     * @param request GetBillDetailFileListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBillDetailFileListResponse
     */
    public GetBillDetailFileListResponse getBillDetailFileListWithOptions(GetBillDetailFileListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billMonth)) {
            query.put("BillMonth", request.billMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAccessKeyId)) {
            query.put("OssAccessKeyId", request.ossAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAccessKeySecret)) {
            query.put("OssAccessKeySecret", request.ossAccessKeySecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossRegion)) {
            query.put("OssRegion", request.ossRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossSecurityToken)) {
            query.put("OssSecurityToken", request.ossSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBillDetailFileList"),
            new TeaPair("version", "2025-02-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBillDetailFileListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询账单导出文件</p>
     * 
     * @param request GetBillDetailFileListRequest
     * @return GetBillDetailFileListResponse
     */
    public GetBillDetailFileListResponse getBillDetailFileList(GetBillDetailFileListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBillDetailFileListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询伙伴佣金明细</p>
     * 
     * @param request GetCommissionDetailFileListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCommissionDetailFileListResponse
     */
    public GetCommissionDetailFileListResponse getCommissionDetailFileListWithOptions(GetCommissionDetailFileListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billMonth)) {
            query.put("BillMonth", request.billMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAccessKeyId)) {
            query.put("OssAccessKeyId", request.ossAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAccessKeySecret)) {
            query.put("OssAccessKeySecret", request.ossAccessKeySecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossRegion)) {
            query.put("OssRegion", request.ossRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossSecurityToken)) {
            query.put("OssSecurityToken", request.ossSecurityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCommissionDetailFileList"),
            new TeaPair("version", "2025-02-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCommissionDetailFileListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询伙伴佣金明细</p>
     * 
     * @param request GetCommissionDetailFileListRequest
     * @return GetCommissionDetailFileListResponse
     */
    public GetCommissionDetailFileListResponse getCommissionDetailFileList(GetCommissionDetailFileListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCommissionDetailFileListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询伙伴拓客订单</p>
     * 
     * @param tmpReq GetCustomerOrderListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomerOrderListResponse
     */
    public GetCustomerOrderListResponse getCustomerOrderListWithOptions(GetCustomerOrderListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetCustomerOrderListShrinkRequest request = new GetCustomerOrderListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderTypeList)) {
            request.orderTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderTypeList, "OrderTypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerAccount)) {
            query.put("CustomerAccount", request.customerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerUid)) {
            query.put("CustomerUid", request.customerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCreateAfter)) {
            query.put("OrderCreateAfter", request.orderCreateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCreateBefore)) {
            query.put("OrderCreateBefore", request.orderCreateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderPayAfter)) {
            query.put("OrderPayAfter", request.orderPayAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderPayBefore)) {
            query.put("OrderPayBefore", request.orderPayBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatus)) {
            query.put("OrderStatus", request.orderStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderTypeListShrink)) {
            query.put("OrderTypeList", request.orderTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payAmountAfter)) {
            query.put("PayAmountAfter", request.payAmountAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payAmountBefore)) {
            query.put("PayAmountBefore", request.payAmountBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramAccountForCustomerManager)) {
            query.put("RamAccountForCustomerManager", request.ramAccountForCustomerManager);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerOrderList"),
            new TeaPair("version", "2025-02-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerOrderListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询伙伴拓客订单</p>
     * 
     * @param request GetCustomerOrderListRequest
     * @return GetCustomerOrderListResponse
     */
    public GetCustomerOrderListResponse getCustomerOrderList(GetCustomerOrderListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerOrderListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询伙伴续费率</p>
     * 
     * @param request GetRenewalRateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRenewalRateListResponse
     */
    public GetRenewalRateListResponse getRenewalRateListWithOptions(GetRenewalRateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fiscalYearAndQuarter)) {
            query.put("FiscalYearAndQuarter", request.fiscalYearAndQuarter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRenewalRateList"),
            new TeaPair("version", "2025-02-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRenewalRateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询伙伴续费率</p>
     * 
     * @param request GetRenewalRateListRequest
     * @return GetRenewalRateListResponse
     */
    public GetRenewalRateListResponse getRenewalRateList(GetRenewalRateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRenewalRateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询二级分销商列表</p>
     * 
     * @param request GetSubPartnerListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubPartnerListResponse
     */
    public GetSubPartnerListResponse getSubPartnerListWithOptions(GetSubPartnerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPartnerCompanyName)) {
            query.put("SubPartnerCompanyName", request.subPartnerCompanyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPartnerPid)) {
            query.put("SubPartnerPid", request.subPartnerPid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubPartnerList"),
            new TeaPair("version", "2025-02-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubPartnerListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询二级分销商列表</p>
     * 
     * @param request GetSubPartnerListRequest
     * @return GetSubPartnerListResponse
     */
    public GetSubPartnerListResponse getSubPartnerList(GetSubPartnerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubPartnerListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询拓渠订单</p>
     * 
     * @param tmpReq GetSubPartnerOrderListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubPartnerOrderListResponse
     */
    public GetSubPartnerOrderListResponse getSubPartnerOrderListWithOptions(GetSubPartnerOrderListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSubPartnerOrderListShrinkRequest request = new GetSubPartnerOrderListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderTypeList)) {
            request.orderTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderTypeList, "OrderTypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderCreateAfter)) {
            query.put("OrderCreateAfter", request.orderCreateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCreateBefore)) {
            query.put("OrderCreateBefore", request.orderCreateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderPayAfter)) {
            query.put("OrderPayAfter", request.orderPayAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderPayBefore)) {
            query.put("OrderPayBefore", request.orderPayBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatus)) {
            query.put("OrderStatus", request.orderStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderTypeListShrink)) {
            query.put("OrderTypeList", request.orderTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payAmountAfter)) {
            query.put("PayAmountAfter", request.payAmountAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payAmountBefore)) {
            query.put("PayAmountBefore", request.payAmountBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPartnerName)) {
            query.put("SubPartnerName", request.subPartnerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPartnerUid)) {
            query.put("SubPartnerUid", request.subPartnerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubPartnerOrderList"),
            new TeaPair("version", "2025-02-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubPartnerOrderListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询拓渠订单</p>
     * 
     * @param request GetSubPartnerOrderListRequest
     * @return GetSubPartnerOrderListResponse
     */
    public GetSubPartnerOrderListResponse getSubPartnerOrderList(GetSubPartnerOrderListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubPartnerOrderListWithOptions(request, runtime);
    }
}
