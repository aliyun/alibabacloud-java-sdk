// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510;

import com.aliyun.tea.*;
import com.aliyun.ltl20190510.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "ltl.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ltl.aliyuncs.com"),
            new TeaPair("ap-south-1", "ltl.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ltl.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ltl.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ltl.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ltl.aliyuncs.com"),
            new TeaPair("cn-beijing", "ltl.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ltl.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ltl.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ltl.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-fujian", "ltl.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ltl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ltl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ltl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ltl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ltl.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ltl.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ltl.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ltl.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ltl.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ltl.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ltl.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ltl.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ltl.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ltl.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ltl.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ltl.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ltl.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ltl.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ltl.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ltl.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "ltl.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ltl.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ltl.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ltl.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ltl.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ltl.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ltl.aliyuncs.com"),
            new TeaPair("eu-central-1", "ltl.aliyuncs.com"),
            new TeaPair("eu-west-1", "ltl.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ltl.aliyuncs.com"),
            new TeaPair("me-east-1", "ltl.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ltl.aliyuncs.com"),
            new TeaPair("us-east-1", "ltl.aliyuncs.com"),
            new TeaPair("us-west-1", "ltl.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ltl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ApplyDataModelConfigInfoResponse applyDataModelConfigInfoWithOptions(ApplyDataModelConfigInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            query.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataModelCode)) {
            query.put("DataModelCode", request.dataModelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyDataModelConfigInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyDataModelConfigInfoResponse());
    }

    public ApplyDataModelConfigInfoResponse applyDataModelConfigInfo(ApplyDataModelConfigInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyDataModelConfigInfoWithOptions(request, runtime);
    }

    public AttachDataResponse attachDataWithOptions(AttachDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachData"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDataResponse());
    }

    public AttachDataResponse attachData(AttachDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDataWithOptions(request, runtime);
    }

    public AttachDataWithSignatureResponse attachDataWithSignatureWithOptions(AttachDataWithSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotAuthType)) {
            query.put("IotAuthType", request.iotAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDigest)) {
            query.put("IotDataDigest", request.iotDataDigest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdServiceProvider)) {
            query.put("IotIdServiceProvider", request.iotIdServiceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdSource)) {
            query.put("IotIdSource", request.iotIdSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotSignature)) {
            query.put("IotSignature", request.iotSignature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDataWithSignature"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDataWithSignatureResponse());
    }

    public AttachDataWithSignatureResponse attachDataWithSignature(AttachDataWithSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDataWithSignatureWithOptions(request, runtime);
    }

    public AuthorizeDeviceResponse authorizeDeviceWithOptions(AuthorizeDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeDevice"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeDeviceResponse());
    }

    public AuthorizeDeviceResponse authorizeDevice(AuthorizeDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeDeviceWithOptions(request, runtime);
    }

    public AuthorizeDeviceGroupResponse authorizeDeviceGroupWithOptions(AuthorizeDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeDeviceGroup"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeDeviceGroupResponse());
    }

    public AuthorizeDeviceGroupResponse authorizeDeviceGroup(AuthorizeDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeDeviceGroupWithOptions(request, runtime);
    }

    public BatchUploadMPCoSPhaseDigestInfoResponse batchUploadMPCoSPhaseDigestInfoWithOptions(BatchUploadMPCoSPhaseDigestInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUploadMPCoSPhaseDigestInfoShrinkRequest request = new BatchUploadMPCoSPhaseDigestInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phaseDataList)) {
            request.phaseDataListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phaseDataList, "PhaseDataList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseDataListShrink)) {
            query.put("PhaseDataList", request.phaseDataListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUploadMPCoSPhaseDigestInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUploadMPCoSPhaseDigestInfoResponse());
    }

    public BatchUploadMPCoSPhaseDigestInfoResponse batchUploadMPCoSPhaseDigestInfo(BatchUploadMPCoSPhaseDigestInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUploadMPCoSPhaseDigestInfoWithOptions(request, runtime);
    }

    public BatchUploadMPCoSPhaseDigestInfoByDeviceResponse batchUploadMPCoSPhaseDigestInfoByDeviceWithOptions(BatchUploadMPCoSPhaseDigestInfoByDeviceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUploadMPCoSPhaseDigestInfoByDeviceShrinkRequest request = new BatchUploadMPCoSPhaseDigestInfoByDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phaseDataList)) {
            request.phaseDataListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phaseDataList, "PhaseDataList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotAuthType)) {
            query.put("IotAuthType", request.iotAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDigest)) {
            query.put("IotDataDigest", request.iotDataDigest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdServiceProvider)) {
            query.put("IotIdServiceProvider", request.iotIdServiceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdSource)) {
            query.put("IotIdSource", request.iotIdSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotSignature)) {
            query.put("IotSignature", request.iotSignature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseDataListShrink)) {
            query.put("PhaseDataList", request.phaseDataListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUploadMPCoSPhaseDigestInfoByDevice"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUploadMPCoSPhaseDigestInfoByDeviceResponse());
    }

    public BatchUploadMPCoSPhaseDigestInfoByDeviceResponse batchUploadMPCoSPhaseDigestInfoByDevice(BatchUploadMPCoSPhaseDigestInfoByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUploadMPCoSPhaseDigestInfoByDeviceWithOptions(request, runtime);
    }

    public BatchUploadMPCoSPhaseTextInfoResponse batchUploadMPCoSPhaseTextInfoWithOptions(BatchUploadMPCoSPhaseTextInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUploadMPCoSPhaseTextInfoShrinkRequest request = new BatchUploadMPCoSPhaseTextInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phaseDataList)) {
            request.phaseDataListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phaseDataList, "PhaseDataList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseDataListShrink)) {
            query.put("PhaseDataList", request.phaseDataListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUploadMPCoSPhaseTextInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUploadMPCoSPhaseTextInfoResponse());
    }

    public BatchUploadMPCoSPhaseTextInfoResponse batchUploadMPCoSPhaseTextInfo(BatchUploadMPCoSPhaseTextInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUploadMPCoSPhaseTextInfoWithOptions(request, runtime);
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponse batchUploadMPCoSPhaseTextInfoByDeviceWithOptions(BatchUploadMPCoSPhaseTextInfoByDeviceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUploadMPCoSPhaseTextInfoByDeviceShrinkRequest request = new BatchUploadMPCoSPhaseTextInfoByDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phaseDataList)) {
            request.phaseDataListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phaseDataList, "PhaseDataList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotAuthType)) {
            query.put("IotAuthType", request.iotAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDigest)) {
            query.put("IotDataDigest", request.iotDataDigest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdServiceProvider)) {
            query.put("IotIdServiceProvider", request.iotIdServiceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdSource)) {
            query.put("IotIdSource", request.iotIdSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotSignature)) {
            query.put("IotSignature", request.iotSignature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseDataListShrink)) {
            query.put("PhaseDataList", request.phaseDataListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUploadMPCoSPhaseTextInfoByDevice"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUploadMPCoSPhaseTextInfoByDeviceResponse());
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponse batchUploadMPCoSPhaseTextInfoByDevice(BatchUploadMPCoSPhaseTextInfoByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUploadMPCoSPhaseTextInfoByDeviceWithOptions(request, runtime);
    }

    public CreateMPCoSPhaseResponse createMPCoSPhaseWithOptions(CreateMPCoSPhaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMPCoSPhase"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMPCoSPhaseResponse());
    }

    public CreateMPCoSPhaseResponse createMPCoSPhase(CreateMPCoSPhaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMPCoSPhaseWithOptions(request, runtime);
    }

    public CreateMPCoSPhaseGroupResponse createMPCoSPhaseGroupWithOptions(CreateMPCoSPhaseGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMPCoSPhaseGroup"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMPCoSPhaseGroupResponse());
    }

    public CreateMPCoSPhaseGroupResponse createMPCoSPhaseGroup(CreateMPCoSPhaseGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMPCoSPhaseGroupWithOptions(request, runtime);
    }

    public CreateMemberResponse createMemberWithOptions(CreateMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberContact)) {
            query.put("MemberContact", request.memberContact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberPhone)) {
            query.put("MemberPhone", request.memberPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMember"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemberResponse());
    }

    public CreateMemberResponse createMember(CreateMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMemberWithOptions(request, runtime);
    }

    public DescribeCapacityInfoResponse describeCapacityInfoWithOptions(DescribeCapacityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCapacityInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCapacityInfoResponse());
    }

    public DescribeCapacityInfoResponse describeCapacityInfo(DescribeCapacityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCapacityInfoWithOptions(request, runtime);
    }

    public DescribeMPCoSAuthorizedInfoResponse describeMPCoSAuthorizedInfoWithOptions(DescribeMPCoSAuthorizedInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMPCoSAuthorizedInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMPCoSAuthorizedInfoResponse());
    }

    public DescribeMPCoSAuthorizedInfoResponse describeMPCoSAuthorizedInfo(DescribeMPCoSAuthorizedInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMPCoSAuthorizedInfoWithOptions(request, runtime);
    }

    public DescribeMPCoSPhaseInfoResponse describeMPCoSPhaseInfoWithOptions(DescribeMPCoSPhaseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataKey)) {
            query.put("DataKey", request.dataKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSeq)) {
            query.put("DataSeq", request.dataSeq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMPCoSPhaseInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMPCoSPhaseInfoResponse());
    }

    public DescribeMPCoSPhaseInfoResponse describeMPCoSPhaseInfo(DescribeMPCoSPhaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMPCoSPhaseInfoWithOptions(request, runtime);
    }

    public DescribeMPCoSResourceInfoResponse describeMPCoSResourceInfoWithOptions(DescribeMPCoSResourceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMPCoSResourceInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMPCoSResourceInfoResponse());
    }

    public DescribeMPCoSResourceInfoResponse describeMPCoSResourceInfo(DescribeMPCoSResourceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMPCoSResourceInfoWithOptions(request, runtime);
    }

    public DescribeMemberCapacityInfoResponse describeMemberCapacityInfoWithOptions(DescribeMemberCapacityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMemberCapacityInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMemberCapacityInfoResponse());
    }

    public DescribeMemberCapacityInfoResponse describeMemberCapacityInfo(DescribeMemberCapacityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMemberCapacityInfoWithOptions(request, runtime);
    }

    public DescribeResourceInfoResponse describeResourceInfoWithOptions(DescribeResourceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceInfoResponse());
    }

    public DescribeResourceInfoResponse describeResourceInfo(DescribeResourceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceInfoWithOptions(request, runtime);
    }

    public GetBlockChainInfoResponse getBlockChainInfoWithOptions(GetBlockChainInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBlockChainInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBlockChainInfoResponse());
    }

    public GetBlockChainInfoResponse getBlockChainInfo(GetBlockChainInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBlockChainInfoWithOptions(request, runtime);
    }

    public GetDataResponse getDataWithOptions(GetDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetData"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataResponse());
    }

    public GetDataResponse getData(GetDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataWithOptions(request, runtime);
    }

    public GetDataModelConfigInfoResponse getDataModelConfigInfoWithOptions(GetDataModelConfigInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataModelCode)) {
            query.put("DataModelCode", request.dataModelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataModelConfigInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataModelConfigInfoResponse());
    }

    public GetDataModelConfigInfoResponse getDataModelConfigInfo(GetDataModelConfigInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataModelConfigInfoWithOptions(request, runtime);
    }

    public GetHistoryDataCountResponse getHistoryDataCountWithOptions(GetHistoryDataCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoryDataCount"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryDataCountResponse());
    }

    public GetHistoryDataCountResponse getHistoryDataCount(GetHistoryDataCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoryDataCountWithOptions(request, runtime);
    }

    public GetHistoryDataListResponse getHistoryDataListWithOptions(GetHistoryDataListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoryDataList"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryDataListResponse());
    }

    public GetHistoryDataListResponse getHistoryDataList(GetHistoryDataListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoryDataListWithOptions(request, runtime);
    }

    public ListDependentDataModelsResponse listDependentDataModelsWithOptions(ListDependentDataModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDependentDataModels"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDependentDataModelsResponse());
    }

    public ListDependentDataModelsResponse listDependentDataModels(ListDependentDataModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDependentDataModelsWithOptions(request, runtime);
    }

    public ListDeviceResponse listDeviceWithOptions(ListDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDevice"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceResponse());
    }

    public ListDeviceResponse listDevice(ListDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceWithOptions(request, runtime);
    }

    public ListDeviceGroupResponse listDeviceGroupWithOptions(ListDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceGroup"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceGroupResponse());
    }

    public ListDeviceGroupResponse listDeviceGroup(ListDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceGroupWithOptions(request, runtime);
    }

    public ListMPCoSPhaseResponse listMPCoSPhaseWithOptions(ListMPCoSPhaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMPCoSPhase"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMPCoSPhaseResponse());
    }

    public ListMPCoSPhaseResponse listMPCoSPhase(ListMPCoSPhaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMPCoSPhaseWithOptions(request, runtime);
    }

    public ListMPCoSPhaseGroupResponse listMPCoSPhaseGroupWithOptions(ListMPCoSPhaseGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMPCoSPhaseGroup"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMPCoSPhaseGroupResponse());
    }

    public ListMPCoSPhaseGroupResponse listMPCoSPhaseGroup(ListMPCoSPhaseGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMPCoSPhaseGroupWithOptions(request, runtime);
    }

    public ListMPCoSPhaseHistoryResponse listMPCoSPhaseHistoryWithOptions(ListMPCoSPhaseHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataKey)) {
            query.put("DataKey", request.dataKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMPCoSPhaseHistory"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMPCoSPhaseHistoryResponse());
    }

    public ListMPCoSPhaseHistoryResponse listMPCoSPhaseHistory(ListMPCoSPhaseHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMPCoSPhaseHistoryWithOptions(request, runtime);
    }

    public ListMemberResponse listMemberWithOptions(ListMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMember"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemberResponse());
    }

    public ListMemberResponse listMember(ListMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMemberWithOptions(request, runtime);
    }

    public ListMultiPartyCollaborationChainResponse listMultiPartyCollaborationChainWithOptions(ListMultiPartyCollaborationChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultiPartyCollaborationChain"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultiPartyCollaborationChainResponse());
    }

    public ListMultiPartyCollaborationChainResponse listMultiPartyCollaborationChain(ListMultiPartyCollaborationChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultiPartyCollaborationChainWithOptions(request, runtime);
    }

    public ListPSMemberDataTypeCodeResponse listPSMemberDataTypeCodeWithOptions(ListPSMemberDataTypeCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPSMemberDataTypeCode"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPSMemberDataTypeCodeResponse());
    }

    public ListPSMemberDataTypeCodeResponse listPSMemberDataTypeCode(ListPSMemberDataTypeCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPSMemberDataTypeCodeWithOptions(request, runtime);
    }

    public ListProofChainResponse listProofChainWithOptions(ListProofChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProofChain"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProofChainResponse());
    }

    public ListProofChainResponse listProofChain(ListProofChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProofChainWithOptions(request, runtime);
    }

    public LockMemberResponse lockMemberWithOptions(LockMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockMember"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockMemberResponse());
    }

    public LockMemberResponse lockMember(LockMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockMemberWithOptions(request, runtime);
    }

    public ModifyMPCoSPhaseResponse modifyMPCoSPhaseWithOptions(ModifyMPCoSPhaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMPCoSPhase"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMPCoSPhaseResponse());
    }

    public ModifyMPCoSPhaseResponse modifyMPCoSPhase(ModifyMPCoSPhaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMPCoSPhaseWithOptions(request, runtime);
    }

    public ModifyMPCoSPhaseGroupResponse modifyMPCoSPhaseGroupWithOptions(ModifyMPCoSPhaseGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMPCoSPhaseGroup"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMPCoSPhaseGroupResponse());
    }

    public ModifyMPCoSPhaseGroupResponse modifyMPCoSPhaseGroup(ModifyMPCoSPhaseGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMPCoSPhaseGroupWithOptions(request, runtime);
    }

    public ModifyMemberResponse modifyMemberWithOptions(ModifyMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberContact)) {
            query.put("MemberContact", request.memberContact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberPhone)) {
            query.put("MemberPhone", request.memberPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMember"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMemberResponse());
    }

    public ModifyMemberResponse modifyMember(ModifyMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMemberWithOptions(request, runtime);
    }

    public RegisterDeviceGroupResponse registerDeviceGroupWithOptions(RegisterDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeType)) {
            query.put("AuthorizeType", request.authorizeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupName)) {
            query.put("DeviceGroupName", request.deviceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDeviceGroup"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDeviceGroupResponse());
    }

    public RegisterDeviceGroupResponse registerDeviceGroup(RegisterDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDeviceGroupWithOptions(request, runtime);
    }

    public SetDataResponse setDataWithOptions(SetDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetData"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDataResponse());
    }

    public SetDataResponse setData(SetDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataWithOptions(request, runtime);
    }

    public SetDataWithSignatureResponse setDataWithSignatureWithOptions(SetDataWithSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotAuthType)) {
            query.put("IotAuthType", request.iotAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDigest)) {
            query.put("IotDataDigest", request.iotDataDigest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdServiceProvider)) {
            query.put("IotIdServiceProvider", request.iotIdServiceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdSource)) {
            query.put("IotIdSource", request.iotIdSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotSignature)) {
            query.put("IotSignature", request.iotSignature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDataWithSignature"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDataWithSignatureResponse());
    }

    public SetDataWithSignatureResponse setDataWithSignature(SetDataWithSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataWithSignatureWithOptions(request, runtime);
    }

    public UnAuthorizeDeviceResponse unAuthorizeDeviceWithOptions(UnAuthorizeDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnAuthorizeDevice"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnAuthorizeDeviceResponse());
    }

    public UnAuthorizeDeviceResponse unAuthorizeDevice(UnAuthorizeDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unAuthorizeDeviceWithOptions(request, runtime);
    }

    public UnAuthorizeDeviceGroupResponse unAuthorizeDeviceGroupWithOptions(UnAuthorizeDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnAuthorizeDeviceGroup"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnAuthorizeDeviceGroupResponse());
    }

    public UnAuthorizeDeviceGroupResponse unAuthorizeDeviceGroup(UnAuthorizeDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unAuthorizeDeviceGroupWithOptions(request, runtime);
    }

    public UnLockMemberResponse unLockMemberWithOptions(UnLockMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnLockMember"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnLockMemberResponse());
    }

    public UnLockMemberResponse unLockMember(UnLockMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unLockMemberWithOptions(request, runtime);
    }

    public UpdateMPCoSAuthorizedInfoResponse updateMPCoSAuthorizedInfoWithOptions(UpdateMPCoSAuthorizedInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMPCoSAuthorizedInfoShrinkRequest request = new UpdateMPCoSAuthorizedInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authorizedPhaseList)) {
            request.authorizedPhaseListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authorizedPhaseList, "AuthorizedPhaseList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizedPhaseListShrink)) {
            query.put("AuthorizedPhaseList", request.authorizedPhaseListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMPCoSAuthorizedInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMPCoSAuthorizedInfoResponse());
    }

    public UpdateMPCoSAuthorizedInfoResponse updateMPCoSAuthorizedInfo(UpdateMPCoSAuthorizedInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMPCoSAuthorizedInfoWithOptions(request, runtime);
    }

    public UploadMPCoSPhaseDigestInfoResponse uploadMPCoSPhaseDigestInfoWithOptions(UploadMPCoSPhaseDigestInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadMPCoSPhaseDigestInfoShrinkRequest request = new UploadMPCoSPhaseDigestInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedDataList)) {
            request.relatedDataListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedDataList, "RelatedDataList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataKey)) {
            query.put("DataKey", request.dataKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSeq)) {
            query.put("DataSeq", request.dataSeq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseData)) {
            query.put("PhaseData", request.phaseData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedDataListShrink)) {
            query.put("RelatedDataList", request.relatedDataListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMPCoSPhaseDigestInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMPCoSPhaseDigestInfoResponse());
    }

    public UploadMPCoSPhaseDigestInfoResponse uploadMPCoSPhaseDigestInfo(UploadMPCoSPhaseDigestInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMPCoSPhaseDigestInfoWithOptions(request, runtime);
    }

    public UploadMPCoSPhaseDigestInfoByDeviceResponse uploadMPCoSPhaseDigestInfoByDeviceWithOptions(UploadMPCoSPhaseDigestInfoByDeviceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadMPCoSPhaseDigestInfoByDeviceShrinkRequest request = new UploadMPCoSPhaseDigestInfoByDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedDataList)) {
            request.relatedDataListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedDataList, "RelatedDataList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataKey)) {
            query.put("DataKey", request.dataKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSeq)) {
            query.put("DataSeq", request.dataSeq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotAuthType)) {
            query.put("IotAuthType", request.iotAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDigest)) {
            query.put("IotDataDigest", request.iotDataDigest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdServiceProvider)) {
            query.put("IotIdServiceProvider", request.iotIdServiceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdSource)) {
            query.put("IotIdSource", request.iotIdSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotSignature)) {
            query.put("IotSignature", request.iotSignature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseData)) {
            query.put("PhaseData", request.phaseData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedDataListShrink)) {
            query.put("RelatedDataList", request.relatedDataListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMPCoSPhaseDigestInfoByDevice"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMPCoSPhaseDigestInfoByDeviceResponse());
    }

    public UploadMPCoSPhaseDigestInfoByDeviceResponse uploadMPCoSPhaseDigestInfoByDevice(UploadMPCoSPhaseDigestInfoByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMPCoSPhaseDigestInfoByDeviceWithOptions(request, runtime);
    }

    public UploadMPCoSPhaseTextInfoResponse uploadMPCoSPhaseTextInfoWithOptions(UploadMPCoSPhaseTextInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadMPCoSPhaseTextInfoShrinkRequest request = new UploadMPCoSPhaseTextInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedDataList)) {
            request.relatedDataListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedDataList, "RelatedDataList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataKey)) {
            query.put("DataKey", request.dataKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSeq)) {
            query.put("DataSeq", request.dataSeq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseData)) {
            query.put("PhaseData", request.phaseData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedDataListShrink)) {
            query.put("RelatedDataList", request.relatedDataListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMPCoSPhaseTextInfo"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMPCoSPhaseTextInfoResponse());
    }

    public UploadMPCoSPhaseTextInfoResponse uploadMPCoSPhaseTextInfo(UploadMPCoSPhaseTextInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMPCoSPhaseTextInfoWithOptions(request, runtime);
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponse uploadMPCoSPhaseTextInfoByDeviceWithOptions(UploadMPCoSPhaseTextInfoByDeviceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadMPCoSPhaseTextInfoByDeviceShrinkRequest request = new UploadMPCoSPhaseTextInfoByDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedDataList)) {
            request.relatedDataListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedDataList, "RelatedDataList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataKey)) {
            query.put("DataKey", request.dataKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSeq)) {
            query.put("DataSeq", request.dataSeq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotAuthType)) {
            query.put("IotAuthType", request.iotAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDigest)) {
            query.put("IotDataDigest", request.iotDataDigest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdServiceProvider)) {
            query.put("IotIdServiceProvider", request.iotIdServiceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdSource)) {
            query.put("IotIdSource", request.iotIdSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotSignature)) {
            query.put("IotSignature", request.iotSignature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseData)) {
            query.put("PhaseData", request.phaseData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseGroupId)) {
            query.put("PhaseGroupId", request.phaseGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phaseId)) {
            query.put("PhaseId", request.phaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedDataListShrink)) {
            query.put("RelatedDataList", request.relatedDataListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMPCoSPhaseTextInfoByDevice"),
            new TeaPair("version", "2019-05-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMPCoSPhaseTextInfoByDeviceResponse());
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponse uploadMPCoSPhaseTextInfoByDevice(UploadMPCoSPhaseTextInfoByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMPCoSPhaseTextInfoByDeviceWithOptions(request, runtime);
    }
}
