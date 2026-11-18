// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612;

import com.aliyun.tea.*;
import com.aliyun.internetbankopen20240612.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "InternetBankOpen";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "internetbankopen.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("internetbankopen", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Queries the status of the AI report attached to a data product and returns a temporary download URL when the report is available. This operation is a read-only query. It does not call the data service provider again, nor does it start or regenerate the report.
     * You must specify either callId or reportId, but not both. The parameter names are case-sensitive as defined on this page. For per-use reports: first call InvokeDataProduct to obtain the callId, and then use the callId to query. When the report status is AVAILABLE, obtain the download URL from Report. For periodic reports: first call ListProductReports to obtain the ReportId, and then use this ID as reportId to query. Querying by the callId of a periodic product always returns WAITING_PERIOD. Even if the corresponding periodic report has been generated, no download URL is returned. Internal task IDs are not query keys for this operation.
     * The query scope is limited to the calls and reports that belong to the current Alibaba Cloud account. If the ID does not exist or does not belong to the account, ReportNotFound (HTTP 404) is returned without distinguishing between the two causes. When you call this operation as a RAM user, the gateway verifies the internetbank:GetAiReport operation permission.
     * The Report object is returned only when ReportStatus is AVAILABLE. DownloadUrl is a temporary signed download URL. The validity period of the signed URL does not exceed 300 seconds and is no later than ContentExpiresAt. Use the URL before UrlExpiresAt and do not share it publicly. If the URL expires but the report content is still within the retention period, you can query again to obtain a new URL. No download URL is returned when the report expires or its delivery is suspended. Delivery exceptions such as object verification or signing failures return ReportDeliveryFailed (HTTP 500). Invalid parameters return the corresponding InvalidParameter errors (HTTP 400).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the report status and retrieves a temporary download URL for available reports.</p>
     * 
     * @param request GetAiReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAiReportResponse
     */
    public GetAiReportResponse getAiReportWithOptions(GetAiReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("callId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("reportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAiReport"),
            new TeaPair("version", "2024-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/api/v1/ai-report"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAiReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the status of the AI report attached to a data product and returns a temporary download URL when the report is available. This operation is a read-only query. It does not call the data service provider again, nor does it start or regenerate the report.
     * You must specify either callId or reportId, but not both. The parameter names are case-sensitive as defined on this page. For per-use reports: first call InvokeDataProduct to obtain the callId, and then use the callId to query. When the report status is AVAILABLE, obtain the download URL from Report. For periodic reports: first call ListProductReports to obtain the ReportId, and then use this ID as reportId to query. Querying by the callId of a periodic product always returns WAITING_PERIOD. Even if the corresponding periodic report has been generated, no download URL is returned. Internal task IDs are not query keys for this operation.
     * The query scope is limited to the calls and reports that belong to the current Alibaba Cloud account. If the ID does not exist or does not belong to the account, ReportNotFound (HTTP 404) is returned without distinguishing between the two causes. When you call this operation as a RAM user, the gateway verifies the internetbank:GetAiReport operation permission.
     * The Report object is returned only when ReportStatus is AVAILABLE. DownloadUrl is a temporary signed download URL. The validity period of the signed URL does not exceed 300 seconds and is no later than ContentExpiresAt. Use the URL before UrlExpiresAt and do not share it publicly. If the URL expires but the report content is still within the retention period, you can query again to obtain a new URL. No download URL is returned when the report expires or its delivery is suspended. Delivery exceptions such as object verification or signing failures return ReportDeliveryFailed (HTTP 500). Invalid parameters return the corresponding InvalidParameter errors (HTTP 400).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the report status and retrieves a temporary download URL for available reports.</p>
     * 
     * @param request GetAiReportRequest
     * @return GetAiReportResponse
     */
    public GetAiReportResponse getAiReport(GetAiReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAiReportWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Provides a unified entry point for invoking data products. After the gateway completes identity parsing, RAM authentication, and product authorization, it forwards the request to the data service provider corresponding to the data product and returns the business data. A successful call returns an HTTP 200 status code, and the response body contains RequestId and Data. A failed call returns the corresponding HTTP status code (400 for parameter errors, 403 for no permissions or unactivated services, 409 if the initial request with the same ClientToken is still being processed, 429 for throttled requests, 503 for temporarily unavailable services, and 500 for internal errors), and the response body uses Code and Message to explain the cause.
     * This operation accepts only three business parameters: ClientToken, ProductCode, and ServiceParameters. It does not accept TaskId, Operation, parameters starting with Ai, or EnableAiArtifact (including when set to false). Passing these parameters returns an InvalidParameter error. Whether a product includes an AI report is determined by the product configuration corresponding to the ProductCode. For products that include reports, you can call ListProductReports to query the report list, and use GetAiReport to retrieve the report by CallId or ReportId.
     * Authorization prerequisites: When calling this operation with a RAM user, you must first grant the RAM user the operation permissions for this operation in RAM. Set Action to internetbank:InvokeDataProduct and Resource to acs:internetbank:<em>:<your Alibaba Cloud account UID>:</em>. No additional authorization is required when calling this operation directly with the AccessKey of an Alibaba Cloud account.
     * Service-linked role: After the preceding authorization is completed, the system automatically creates the service-linked role (SLR) AliyunServiceRoleForInternetBankPredict under your Alibaba Cloud account. This role is used to invoke the corresponding data service provider on behalf of the customer as a service identity. You can view the related invocation records in ActionTrail of your account.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides a unified entry point for invoking data products.</p>
     * 
     * @param request InvokeDataProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeDataProductResponse
     */
    public InvokeDataProductResponse invokeDataProductWithOptions(InvokeDataProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("productCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("serviceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeDataProduct"),
            new TeaPair("version", "2024-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/api/v1/rpc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeDataProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Provides a unified entry point for invoking data products. After the gateway completes identity parsing, RAM authentication, and product authorization, it forwards the request to the data service provider corresponding to the data product and returns the business data. A successful call returns an HTTP 200 status code, and the response body contains RequestId and Data. A failed call returns the corresponding HTTP status code (400 for parameter errors, 403 for no permissions or unactivated services, 409 if the initial request with the same ClientToken is still being processed, 429 for throttled requests, 503 for temporarily unavailable services, and 500 for internal errors), and the response body uses Code and Message to explain the cause.
     * This operation accepts only three business parameters: ClientToken, ProductCode, and ServiceParameters. It does not accept TaskId, Operation, parameters starting with Ai, or EnableAiArtifact (including when set to false). Passing these parameters returns an InvalidParameter error. Whether a product includes an AI report is determined by the product configuration corresponding to the ProductCode. For products that include reports, you can call ListProductReports to query the report list, and use GetAiReport to retrieve the report by CallId or ReportId.
     * Authorization prerequisites: When calling this operation with a RAM user, you must first grant the RAM user the operation permissions for this operation in RAM. Set Action to internetbank:InvokeDataProduct and Resource to acs:internetbank:<em>:<your Alibaba Cloud account UID>:</em>. No additional authorization is required when calling this operation directly with the AccessKey of an Alibaba Cloud account.
     * Service-linked role: After the preceding authorization is completed, the system automatically creates the service-linked role (SLR) AliyunServiceRoleForInternetBankPredict under your Alibaba Cloud account. This role is used to invoke the corresponding data service provider on behalf of the customer as a service identity. You can view the related invocation records in ActionTrail of your account.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides a unified entry point for invoking data products.</p>
     * 
     * @param request InvokeDataProductRequest
     * @return InvokeDataProductResponse
     */
    public InvokeDataProductResponse invokeDataProduct(InvokeDataProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invokeDataProductWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the available periodic reports generated for a specified product under the current Alibaba Cloud account. The list is used only to discover report IDs and their corresponding periods, and does not return download URLs. After obtaining a ReportId, call GetAiReport and pass the ID as the reportId parameter to obtain the latest status and download URL. This operation does not call the data service provider or trigger report generation.
     * If LatestOnly is omitted or set to false, the operation queries reports within the last ten completed natural weeks in UTC+8 and returns up to ten report records in descending order of epoch. Empty records are not padded for weeks without reports, and ten reports are not guaranteed to be returned. If LatestOnly is set to true, the operation searches for the most recent active report from all completed historical epochs and returns at most one record, without being limited to the last ten weeks.
     * A natural week is calculated based on UTC+8 (Asia/Shanghai), starting from 00:00:00 on Monday to 00:00:00 on the following Monday. The interval is left-closed and right-open, excluding the current unfinished natural week. PeriodStart and PeriodEnd are output in UTC RFC 3339 format. A single natural week may correspond to multiple report records. Therefore, identical epoch start and end times for two records do not indicate duplication. Use ReportId to distinguish them.
     * The list determines availability based on the asset records of published reports and does not return expired or suspended reports. The actual download status is subject to the query results of GetAiReport. If no available reports exist, an empty Reports array is returned successfully, and ReportNotFound is not returned. This operation provides only two business parameters, ProductCode and LatestOnly, and does not support pagination or custom period filtering. Passing PeriodStart, PageSize, or NextToken returns a corresponding InvalidParameter error (HTTP 400).
     * When called with a RAM identity, the gateway verifies the internetbank:ListProductReports operation permission. The query only reads existing reports of the current account and does not recheck the commercial activation status of the product. Parameter errors return a corresponding InvalidParameter error (HTTP 400). Inconsistent report asset records or query exceptions return ReportDeliveryFailed (HTTP 500).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available periodic report IDs and period ranges for a specified product.</p>
     * 
     * @param request ListProductReportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductReportsResponse
     */
    public ListProductReportsResponse listProductReportsWithOptions(ListProductReportsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.latestOnly)) {
            query.put("LatestOnly", request.latestOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductReports"),
            new TeaPair("version", "2024-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/api/v1/product-reports"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductReportsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the available periodic reports generated for a specified product under the current Alibaba Cloud account. The list is used only to discover report IDs and their corresponding periods, and does not return download URLs. After obtaining a ReportId, call GetAiReport and pass the ID as the reportId parameter to obtain the latest status and download URL. This operation does not call the data service provider or trigger report generation.
     * If LatestOnly is omitted or set to false, the operation queries reports within the last ten completed natural weeks in UTC+8 and returns up to ten report records in descending order of epoch. Empty records are not padded for weeks without reports, and ten reports are not guaranteed to be returned. If LatestOnly is set to true, the operation searches for the most recent active report from all completed historical epochs and returns at most one record, without being limited to the last ten weeks.
     * A natural week is calculated based on UTC+8 (Asia/Shanghai), starting from 00:00:00 on Monday to 00:00:00 on the following Monday. The interval is left-closed and right-open, excluding the current unfinished natural week. PeriodStart and PeriodEnd are output in UTC RFC 3339 format. A single natural week may correspond to multiple report records. Therefore, identical epoch start and end times for two records do not indicate duplication. Use ReportId to distinguish them.
     * The list determines availability based on the asset records of published reports and does not return expired or suspended reports. The actual download status is subject to the query results of GetAiReport. If no available reports exist, an empty Reports array is returned successfully, and ReportNotFound is not returned. This operation provides only two business parameters, ProductCode and LatestOnly, and does not support pagination or custom period filtering. Passing PeriodStart, PageSize, or NextToken returns a corresponding InvalidParameter error (HTTP 400).
     * When called with a RAM identity, the gateway verifies the internetbank:ListProductReports operation permission. The query only reads existing reports of the current account and does not recheck the commercial activation status of the product. Parameter errors return a corresponding InvalidParameter error (HTTP 400). Inconsistent report asset records or query exceptions return ReportDeliveryFailed (HTTP 500).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available periodic report IDs and period ranges for a specified product.</p>
     * 
     * @param request ListProductReportsRequest
     * @return ListProductReportsResponse
     */
    public ListProductReportsResponse listProductReports(ListProductReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductReportsWithOptions(request, headers, runtime);
    }
}
