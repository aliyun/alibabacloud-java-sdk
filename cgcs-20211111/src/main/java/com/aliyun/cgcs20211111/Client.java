// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111;

import com.aliyun.tea.*;
import com.aliyun.cgcs20211111.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cgcs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AdaptCreateServiceResponse adaptCreateServiceWithOptions(AdaptCreateServiceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AdaptCreateServiceShrinkRequest request = new AdaptCreateServiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.adaptTarget))) {
            request.adaptTargetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.adaptTarget), "AdaptTarget", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adaptTargetShrink)) {
            body.put("AdaptTarget", request.adaptTargetShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionName)) {
            body.put("AppVersionName", request.appVersionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AdaptCreateService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AdaptCreateServiceResponse());
    }

    public AdaptCreateServiceResponse adaptCreateService(AdaptCreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.adaptCreateServiceWithOptions(request, runtime);
    }

    public AdaptGetServiceResponse adaptGetServiceWithOptions(AdaptGetServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AdaptGetService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AdaptGetServiceResponse());
    }

    public AdaptGetServiceResponse adaptGetService(AdaptGetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.adaptGetServiceWithOptions(request, runtime);
    }

    public AppCreateServiceResponse appCreateServiceWithOptions(AppCreateServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppCreateService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppCreateServiceResponse());
    }

    public AppCreateServiceResponse appCreateService(AppCreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appCreateServiceWithOptions(request, runtime);
    }

    public AppDeleteServiceResponse appDeleteServiceWithOptions(AppDeleteServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppDeleteService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppDeleteServiceResponse());
    }

    public AppDeleteServiceResponse appDeleteService(AppDeleteServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appDeleteServiceWithOptions(request, runtime);
    }

    public AppGetServiceResponse appGetServiceWithOptions(AppGetServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppGetService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppGetServiceResponse());
    }

    public AppGetServiceResponse appGetService(AppGetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appGetServiceWithOptions(request, runtime);
    }

    public AppListServiceResponse appListServiceWithOptions(AppListServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keySearch)) {
            body.put("KeySearch", request.keySearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppListService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppListServiceResponse());
    }

    public AppListServiceResponse appListService(AppListServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appListServiceWithOptions(request, runtime);
    }

    public AppModifyServiceResponse appModifyServiceWithOptions(AppModifyServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppModifyService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppModifyServiceResponse());
    }

    public AppModifyServiceResponse appModifyService(AppModifyServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appModifyServiceWithOptions(request, runtime);
    }

    public AppVersionCreateServiceResponse appVersionCreateServiceWithOptions(AppVersionCreateServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionName)) {
            body.put("AppVersionName", request.appVersionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileAddress)) {
            body.put("FileAddress", request.fileAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSize)) {
            body.put("FileSize", request.fileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUploadType)) {
            body.put("FileUploadType", request.fileUploadType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppVersionCreateService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppVersionCreateServiceResponse());
    }

    public AppVersionCreateServiceResponse appVersionCreateService(AppVersionCreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appVersionCreateServiceWithOptions(request, runtime);
    }

    public AppVersionDeleteServiceResponse appVersionDeleteServiceWithOptions(AppVersionDeleteServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppVersionDeleteService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppVersionDeleteServiceResponse());
    }

    public AppVersionDeleteServiceResponse appVersionDeleteService(AppVersionDeleteServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appVersionDeleteServiceWithOptions(request, runtime);
    }

    public AppVersionGetServiceResponse appVersionGetServiceWithOptions(AppVersionGetServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppVersionGetService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppVersionGetServiceResponse());
    }

    public AppVersionGetServiceResponse appVersionGetService(AppVersionGetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appVersionGetServiceWithOptions(request, runtime);
    }

    public AppVersionListServiceResponse appVersionListServiceWithOptions(AppVersionListServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppVersionListService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppVersionListServiceResponse());
    }

    public AppVersionListServiceResponse appVersionListService(AppVersionListServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appVersionListServiceWithOptions(request, runtime);
    }

    public AppVersionModifyServiceResponse appVersionModifyServiceWithOptions(AppVersionModifyServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionName)) {
            body.put("AppVersionName", request.appVersionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppVersionModifyService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppVersionModifyServiceResponse());
    }

    public AppVersionModifyServiceResponse appVersionModifyService(AppVersionModifyServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appVersionModifyServiceWithOptions(request, runtime);
    }

    public AppVersionQueryServiceResponse appVersionQueryServiceWithOptions(AppVersionQueryServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keySearch)) {
            body.put("KeySearch", request.keySearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppVersionQueryService"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppVersionQueryServiceResponse());
    }

    public AppVersionQueryServiceResponse appVersionQueryService(AppVersionQueryServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appVersionQueryServiceWithOptions(request, runtime);
    }

    public AppliedConsumStatResponse appliedConsumStatWithOptions(AppliedConsumStatRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AppliedConsumStatShrinkRequest request = new AppliedConsumStatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appliedId)) {
            request.appliedIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appliedId, "AppliedId", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appliedIdShrink)) {
            body.put("AppliedId", request.appliedIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            body.put("OperatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryEndDate)) {
            body.put("QueryEndDate", request.queryEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStartDate)) {
            body.put("QueryStartDate", request.queryStartDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppliedConsumStat"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppliedConsumStatResponse());
    }

    public AppliedConsumStatResponse appliedConsumStat(AppliedConsumStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appliedConsumStatWithOptions(request, runtime);
    }

    public AppliedNearRealStatResponse appliedNearRealStatWithOptions(AppliedNearRealStatRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AppliedNearRealStatShrinkRequest request = new AppliedNearRealStatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appliedVersionId)) {
            request.appliedVersionIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appliedVersionId, "AppliedVersionId", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appliedVersionIdShrink)) {
            body.put("AppliedVersionId", request.appliedVersionIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            body.put("OperatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppliedNearRealStat"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppliedNearRealStatResponse());
    }

    public AppliedNearRealStatResponse appliedNearRealStat(AppliedNearRealStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appliedNearRealStatWithOptions(request, runtime);
    }

    public AppliedStatResponse appliedStatWithOptions(AppliedStatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            body.put("OperatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryEndDate)) {
            body.put("QueryEndDate", request.queryEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStartDate)) {
            body.put("QueryStartDate", request.queryStartDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppliedStat"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppliedStatResponse());
    }

    public AppliedStatResponse appliedStat(AppliedStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appliedStatWithOptions(request, runtime);
    }

    public CreateAppSessionResponse createAppSessionWithOptions(CreateAppSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSessionId)) {
            query.put("CustomSessionId", request.customSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customUserId)) {
            query.put("CustomUserId", request.customUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startParameters)) {
            query.put("StartParameters", request.startParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemInfo)) {
            query.put("SystemInfo", request.systemInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppSession"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppSessionResponse());
    }

    public CreateAppSessionResponse createAppSession(CreateAppSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppSessionWithOptions(request, runtime);
    }

    public CreateUploadTaskResponse createUploadTaskWithOptions(CreateUploadTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            body.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileAddress)) {
            body.put("FileAddress", request.fileAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSize)) {
            body.put("FileSize", request.fileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.progress)) {
            body.put("Progress", request.progress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadToolVersion)) {
            body.put("UploadToolVersion", request.uploadToolVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            body.put("UploadType", request.uploadType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadTask"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadTaskResponse());
    }

    public CreateUploadTaskResponse createUploadTask(CreateUploadTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadTaskWithOptions(request, runtime);
    }

    public GetAppListResponse getAppListWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppList"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppListResponse());
    }

    public GetAppListResponse getAppList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppListWithOptions(runtime);
    }

    public GetAppSessionResponse getAppSessionWithOptions(GetAppSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customSessionId)) {
            query.put("CustomSessionId", request.customSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformSessionId)) {
            query.put("PlatformSessionId", request.platformSessionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSession"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSessionResponse());
    }

    public GetAppSessionResponse getAppSession(GetAppSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppSessionWithOptions(request, runtime);
    }

    public GetNeedUploadFileListResponse getNeedUploadFileListWithOptions(GetNeedUploadFileListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hashList)) {
            body.put("HashList", request.hashList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNeedUploadFileList"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNeedUploadFileListResponse());
    }

    public GetNeedUploadFileListResponse getNeedUploadFileList(GetNeedUploadFileListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNeedUploadFileListWithOptions(request, runtime);
    }

    public GetOssInfoResponse getOssInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssInfo"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssInfoResponse());
    }

    public GetOssInfoResponse getOssInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOssInfoWithOptions(runtime);
    }

    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            body.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
    }

    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTokenWithOptions(request, runtime);
    }

    public HasActivateResponse hasActivateWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HasActivate"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HasActivateResponse());
    }

    public HasActivateResponse hasActivate() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hasActivateWithOptions(runtime);
    }

    public ListAppSessionsResponse listAppSessionsWithOptions(ListAppSessionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSessionIds)) {
            query.put("CustomSessionIds", request.customSessionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformSessionIds)) {
            query.put("PlatformSessionIds", request.platformSessionIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppSessions"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppSessionsResponse());
    }

    public ListAppSessionsResponse listAppSessions(ListAppSessionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppSessionsWithOptions(request, runtime);
    }

    public PageQueryResourcePackageListResponse pageQueryResourcePackageListWithOptions(PageQueryResourcePackageListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            body.put("OperatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryValidType)) {
            body.put("QueryValidType", request.queryValidType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageQueryResourcePackageList"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageQueryResourcePackageListResponse());
    }

    public PageQueryResourcePackageListResponse pageQueryResourcePackageList(PageQueryResourcePackageListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pageQueryResourcePackageListWithOptions(request, runtime);
    }

    public QueryAdaptRecordsResponse queryAdaptRecordsWithOptions(QueryAdaptRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestApp)) {
            body.put("RequestApp", request.requestApp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAdaptRecords"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAdaptRecordsResponse());
    }

    public QueryAdaptRecordsResponse queryAdaptRecords(QueryAdaptRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAdaptRecordsWithOptions(request, runtime);
    }

    public QueryUploadProgressResponse queryUploadProgressWithOptions(QueryUploadProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryUploadProgressRequests)) {
            body.put("QueryUploadProgressRequests", request.queryUploadProgressRequests);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUploadProgress"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUploadProgressResponse());
    }

    public QueryUploadProgressResponse queryUploadProgress(QueryUploadProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUploadProgressWithOptions(request, runtime);
    }

    public ReplicateVersionResponse replicateVersionWithOptions(ReplicateVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceVersionId)) {
            body.put("SourceVersionId", request.sourceVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersionId)) {
            body.put("TargetVersionId", request.targetVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplicateVersion"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplicateVersionResponse());
    }

    public ReplicateVersionResponse replicateVersion(ReplicateVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replicateVersionWithOptions(request, runtime);
    }

    public ReportUploadProgressResponse reportUploadProgressWithOptions(ReportUploadProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.progress)) {
            body.put("Progress", request.progress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportUploadProgress"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportUploadProgressResponse());
    }

    public ReportUploadProgressResponse reportUploadProgress(ReportUploadProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportUploadProgressWithOptions(request, runtime);
    }

    public ReportUploadResultResponse reportUploadResultWithOptions(ReportUploadResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            body.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFingerprintDTOList)) {
            body.put("FileFingerprintDTOList", request.fileFingerprintDTOList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSize)) {
            body.put("FileSize", request.fileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolVersion)) {
            body.put("ToolVersion", request.toolVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportUploadResult"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportUploadResultResponse());
    }

    public ReportUploadResultResponse reportUploadResult(ReportUploadResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportUploadResultWithOptions(request, runtime);
    }

    public ReportUploadStatusResponse reportUploadStatusWithOptions(ReportUploadStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            body.put("Memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportUploadStatus"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportUploadStatusResponse());
    }

    public ReportUploadStatusResponse reportUploadStatus(ReportUploadStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportUploadStatusWithOptions(request, runtime);
    }

    public StopAppSessionResponse stopAppSessionWithOptions(StopAppSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customSessionId)) {
            query.put("CustomSessionId", request.customSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformSessionId)) {
            query.put("PlatformSessionId", request.platformSessionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAppSession"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAppSessionResponse());
    }

    public StopAppSessionResponse stopAppSession(StopAppSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopAppSessionWithOptions(request, runtime);
    }

    public TotalAppliedConsumStatResponse totalAppliedConsumStatWithOptions(TotalAppliedConsumStatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            body.put("OperatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryEndDate)) {
            body.put("QueryEndDate", request.queryEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStartDate)) {
            body.put("QueryStartDate", request.queryStartDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TotalAppliedConsumStat"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TotalAppliedConsumStatResponse());
    }

    public TotalAppliedConsumStatResponse totalAppliedConsumStat(TotalAppliedConsumStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.totalAppliedConsumStatWithOptions(request, runtime);
    }

    public TotalAppliedNearRealStatResponse totalAppliedNearRealStatWithOptions(TotalAppliedNearRealStatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            body.put("OperatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TotalAppliedNearRealStat"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TotalAppliedNearRealStatResponse());
    }

    public TotalAppliedNearRealStatResponse totalAppliedNearRealStat(TotalAppliedNearRealStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.totalAppliedNearRealStatWithOptions(request, runtime);
    }

    public TotalQueryResourcePackageResponse totalQueryResourcePackageWithOptions(TotalQueryResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            body.put("OperatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TotalQueryResourcePackage"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TotalQueryResourcePackageResponse());
    }

    public TotalQueryResourcePackageResponse totalQueryResourcePackage(TotalQueryResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.totalQueryResourcePackageWithOptions(request, runtime);
    }
}
