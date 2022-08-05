// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011;

import com.aliyun.tea.*;
import com.aliyun.lmztest20101011.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("lmztest", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AAbckResponse aAbckWithOptions(AAbckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AAbck"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AAbckResponse());
    }

    public AAbckResponse aAbck(AAbckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.aAbckWithOptions(request, runtime);
    }

    public AndBackResponse andBackWithOptions(AndBackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AndBack"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AndBackResponse());
    }

    public AndBackResponse andBack(AndBackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.andBackWithOptions(request, runtime);
    }

    public DataRateLimitTestResponse dataRateLimitTestWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DataRateLimitTest"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DataRateLimitTestResponse());
    }

    public DataRateLimitTestResponse dataRateLimitTest() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dataRateLimitTestWithOptions(runtime);
    }

    public DemoGrayReleaseTestResponse demoGrayReleaseTestWithOptions(DemoGrayReleaseTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberCode)) {
            query.put("NumberCode", request.numberCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DemoGrayReleaseTest"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DemoGrayReleaseTestResponse());
    }

    public DemoGrayReleaseTestResponse demoGrayReleaseTest(DemoGrayReleaseTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.demoGrayReleaseTestWithOptions(request, runtime);
    }

    public DemoGrayReleaseTestTwoResponse demoGrayReleaseTestTwoWithOptions(DemoGrayReleaseTestTwoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberCode)) {
            query.put("NumberCode", request.numberCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DemoGrayReleaseTestTwo"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DemoGrayReleaseTestTwoResponse());
    }

    public DemoGrayReleaseTestTwoResponse demoGrayReleaseTestTwo(DemoGrayReleaseTestTwoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.demoGrayReleaseTestTwoWithOptions(request, runtime);
    }

    public DemoGreyReleaseTestResponse demoGreyReleaseTestWithOptions(DemoGreyReleaseTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DemoGreyReleaseTest"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DemoGreyReleaseTestResponse());
    }

    public DemoGreyReleaseTestResponse demoGreyReleaseTest(DemoGreyReleaseTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.demoGreyReleaseTestWithOptions(request, runtime);
    }

    public DemoHsfNineResponseResponse demoHsfNineResponseWithOptions(DemoHsfNineResponseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.testF1)) {
            query.put("TestF1", request.testF1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMap)) {
            query.put("userMap", request.userMap);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DemoHsfNineResponse"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DemoHsfNineResponseResponse());
    }

    public DemoHsfNineResponseResponse demoHsfNineResponse(DemoHsfNineResponseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.demoHsfNineResponseWithOptions(request, runtime);
    }

    public DemoHsfSixTestResponse demoHsfSixTestWithOptions(DemoHsfSixTestRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DemoHsfSixTestShrinkRequest request = new DemoHsfSixTestShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.map)) {
            request.mapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.map, "Map", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.strListMap)) {
            request.strListMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.strListMap, "StrListMap", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.codeMap)) {
            request.codeMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.codeMap, "codeMap", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeMapShrink)) {
            query.put("codeMap", request.codeMapShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            body.put("Data", request.dataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapShrink)) {
            body.put("Map", request.mapShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strListMapShrink)) {
            body.put("StrListMap", request.strListMapShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DemoHsfSixTest"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DemoHsfSixTestResponse());
    }

    public DemoHsfSixTestResponse demoHsfSixTest(DemoHsfSixTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.demoHsfSixTestWithOptions(request, runtime);
    }

    public DemoHttpComplexResponseResponse demoHttpComplexResponseWithOptions(DemoHttpComplexResponseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reqInfo)) {
            query.put("reqInfo", request.reqInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DemoHttpComplexResponse"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DemoHttpComplexResponseResponse());
    }

    public DemoHttpComplexResponseResponse demoHttpComplexResponse(DemoHttpComplexResponseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.demoHttpComplexResponseWithOptions(request, runtime);
    }

    public DescribeDisksResponse describeDisksWithOptions(DescribeDisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalAttributes)) {
            query.put("AdditionalAttributes", request.additionalAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyId)) {
            query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteAutoSnapshot)) {
            query.put("DeleteAutoSnapshot", request.deleteAutoSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteWithInstance)) {
            query.put("DeleteWithInstance", request.deleteWithInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskChargeType)) {
            query.put("DiskChargeType", request.diskChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskIds)) {
            query.put("DiskIds", request.diskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskName)) {
            query.put("DiskName", request.diskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutoSnapshot)) {
            query.put("EnableAutoSnapshot", request.enableAutoSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutomatedSnapshotPolicy)) {
            query.put("EnableAutomatedSnapshotPolicy", request.enableAutomatedSnapshotPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableShared)) {
            query.put("EnableShared", request.enableShared);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encrypted)) {
            query.put("Encrypted", request.encrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.KMSKeyId)) {
            query.put("KMSKeyId", request.KMSKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lockReason)) {
            query.put("LockReason", request.lockReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiAttach)) {
            query.put("MultiAttach", request.multiAttach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.portable)) {
            query.put("Portable", request.portable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDisks"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDisksResponse());
    }

    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDisksWithOptions(request, runtime);
    }

    public GetPackageStorageCredentialResponse getPackageStorageCredentialWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPackageStorageCredential"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPackageStorageCredentialResponse());
    }

    public GetPackageStorageCredentialResponse getPackageStorageCredential() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPackageStorageCredentialWithOptions(runtime);
    }

    public GrayReleaseDemoResponse grayReleaseDemoWithOptions(GrayReleaseDemoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrayReleaseDemo"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrayReleaseDemoResponse());
    }

    public GrayReleaseDemoResponse grayReleaseDemo(GrayReleaseDemoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grayReleaseDemoWithOptions(request, runtime);
    }

    public ListProductsByPopCodeResponse listProductsByPopCodeWithOptions(ListProductsByPopCodeRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProductsByPopCodeShrinkRequest request = new ListProductsByPopCodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraParams)) {
            request.extraParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraParams, "ExtraParams", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.identityDTO)) {
            request.identityDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.identityDTO, "IdentityDTO", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popCode)) {
            query.put("PopCode", request.popCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverClientIp)) {
            query.put("ServerClientIp", request.serverClientIp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraParamsShrink)) {
            body.put("ExtraParams", request.extraParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityDTOShrink)) {
            body.put("IdentityDTO", request.identityDTOShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductsByPopCode"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsByPopCodeResponse());
    }

    public ListProductsByPopCodeResponse listProductsByPopCode(ListProductsByPopCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductsByPopCodeWithOptions(request, runtime);
    }

    public LjxTestResponse ljxTestWithOptions(LjxTestRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        LjxTestShrinkRequest request = new LjxTestShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.code)) {
            request.codeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.code, "code", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.newParam1)) {
            request.newParam1Shrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.newParam1, "new-param-1", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeShrink)) {
            query.put("code", request.codeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newParam1Shrink)) {
            query.put("new-param-1", request.newParam1Shrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newParam2)) {
            query.put("new-param-2", request.newParam2);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LjxTest"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LjxTestResponse());
    }

    public LjxTestResponse ljxTest(LjxTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ljxTestWithOptions(request, runtime);
    }

    public ReqBeanTestResponse reqBeanTestWithOptions(ReqBeanTestRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReqBeanTestShrinkRequest request = new ReqBeanTestShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.codes)) {
            request.codesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.codes, "codes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nums)) {
            request.numsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nums, "nums", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.users)) {
            request.usersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.users, "users", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codesShrink)) {
            query.put("codes", request.codesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numsShrink)) {
            query.put("nums", request.numsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usersShrink)) {
            query.put("users", request.usersShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReqBeanTest"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReqBeanTestResponse());
    }

    public ReqBeanTestResponse reqBeanTest(ReqBeanTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reqBeanTestWithOptions(request, runtime);
    }

    public RomeGetExecutionResultResponse romeGetExecutionResultWithOptions(RomeGetExecutionResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RomeGetExecutionResult"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RomeGetExecutionResultResponse());
    }

    public RomeGetExecutionResultResponse romeGetExecutionResult(RomeGetExecutionResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.romeGetExecutionResultWithOptions(request, runtime);
    }

    public RpcHttpResponse rpcHttpWithOptions(RpcHttpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codes)) {
            query.put("Codes", request.codes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monkey)) {
            query.put("Monkey", request.monkey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.news)) {
            query.put("News", request.news);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.none)) {
            query.put("None", request.none);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.old)) {
            query.put("Old", request.old);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RpcHttp"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RpcHttpResponse());
    }

    public RpcHttpResponse rpcHttp(RpcHttpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rpcHttpWithOptions(request, runtime);
    }

    public TestPutApiAndGetApiResponse testPutApiAndGetApiWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestPutApiAndGetApi"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestPutApiAndGetApiResponse());
    }

    public TestPutApiAndGetApiResponse testPutApiAndGetApi() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testPutApiAndGetApiWithOptions(runtime);
    }

    public UpdateListenerResponse updateListenerWithOptions(UpdateListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendPorts)) {
            query.put("BackendPorts", request.backendPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            query.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientAffinity)) {
            query.put("ClientAffinity", request.clientAffinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            query.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRanges)) {
            query.put("PortRanges", request.portRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyProtocol)) {
            query.put("ProxyProtocol", request.proxyProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateListener"),
            new TeaPair("version", "2010-10-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListenerResponse());
    }

    public UpdateListenerResponse updateListener(UpdateListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateListenerWithOptions(request, runtime);
    }
}
