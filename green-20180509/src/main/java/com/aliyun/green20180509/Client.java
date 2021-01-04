// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509;

import com.aliyun.tea.*;
import com.aliyun.green20180509.models.*;
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
            new TeaPair("ap-northeast-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "green.aliyuncs.com"),
            new TeaPair("cn-hongkong", "green.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "green.aliyuncs.com"),
            new TeaPair("cn-qingdao", "green.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "green.aliyuncs.com"),
            new TeaPair("eu-central-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "green.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "green.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "green.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "green.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("green", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddFacesResponse addFaces(AddFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFacesWithOptions(request, headers, runtime);
    }

    public AddFacesResponse addFacesWithOptions(AddFacesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddFaces", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/face/add", "none", req, runtime), new AddFacesResponse());
    }

    public AddGroupsResponse addGroups(AddGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGroupsWithOptions(request, headers, runtime);
    }

    public AddGroupsResponse addGroupsWithOptions(AddGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddGroups", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/person/groups/add", "none", req, runtime), new AddGroupsResponse());
    }

    public AddPersonResponse addPerson(AddPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addPersonWithOptions(request, headers, runtime);
    }

    public AddPersonResponse addPersonWithOptions(AddPersonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddPerson", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/person/add", "none", req, runtime), new AddPersonResponse());
    }

    public AddSimilarityImageResponse addSimilarityImage(AddSimilarityImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSimilarityImageWithOptions(request, headers, runtime);
    }

    public AddSimilarityImageResponse addSimilarityImageWithOptions(AddSimilarityImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddSimilarityImage", "2018-05-09", "HTTPS", "POST", "AK", "/green/similarity/image/add", "none", req, runtime), new AddSimilarityImageResponse());
    }

    public AddSimilarityLibraryResponse addSimilarityLibrary(AddSimilarityLibraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSimilarityLibraryWithOptions(request, headers, runtime);
    }

    public AddSimilarityLibraryResponse addSimilarityLibraryWithOptions(AddSimilarityLibraryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddSimilarityLibrary", "2018-05-09", "HTTPS", "POST", "AK", "/green/similarity/library/add", "none", req, runtime), new AddSimilarityLibraryResponse());
    }

    public AddVideoDnaResponse addVideoDna(AddVideoDnaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addVideoDnaWithOptions(request, headers, runtime);
    }

    public AddVideoDnaResponse addVideoDnaWithOptions(AddVideoDnaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddVideoDna", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/dna/add", "none", req, runtime), new AddVideoDnaResponse());
    }

    public AddVideoDnaGroupResponse addVideoDnaGroup(AddVideoDnaGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addVideoDnaGroupWithOptions(request, headers, runtime);
    }

    public AddVideoDnaGroupResponse addVideoDnaGroupWithOptions(AddVideoDnaGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddVideoDnaGroup", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/dna/group/add", "none", req, runtime), new AddVideoDnaGroupResponse());
    }

    public DeleteFacesResponse deleteFaces(DeleteFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFacesWithOptions(request, headers, runtime);
    }

    public DeleteFacesResponse deleteFacesWithOptions(DeleteFacesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteFaces", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/face/delete", "none", req, runtime), new DeleteFacesResponse());
    }

    public DeleteGroupsResponse deleteGroups(DeleteGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupsWithOptions(request, headers, runtime);
    }

    public DeleteGroupsResponse deleteGroupsWithOptions(DeleteGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteGroups", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/person/groups/delete", "none", req, runtime), new DeleteGroupsResponse());
    }

    public DeletePersonResponse deletePerson(DeletePersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePersonWithOptions(request, headers, runtime);
    }

    public DeletePersonResponse deletePersonWithOptions(DeletePersonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeletePerson", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/person/delete", "none", req, runtime), new DeletePersonResponse());
    }

    public DeleteSimilarityImageResponse deleteSimilarityImage(DeleteSimilarityImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSimilarityImageWithOptions(request, headers, runtime);
    }

    public DeleteSimilarityImageResponse deleteSimilarityImageWithOptions(DeleteSimilarityImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSimilarityImage", "2018-05-09", "HTTPS", "POST", "AK", "/green/similarity/image/delete", "none", req, runtime), new DeleteSimilarityImageResponse());
    }

    public DeleteSimilarityLibraryResponse deleteSimilarityLibrary(DeleteSimilarityLibraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSimilarityLibraryWithOptions(request, headers, runtime);
    }

    public DeleteSimilarityLibraryResponse deleteSimilarityLibraryWithOptions(DeleteSimilarityLibraryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSimilarityLibrary", "2018-05-09", "HTTPS", "POST", "AK", "/green/similarity/library/delete", "none", req, runtime), new DeleteSimilarityLibraryResponse());
    }

    public DeleteVideoDnaResponse deleteVideoDna(DeleteVideoDnaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVideoDnaWithOptions(request, headers, runtime);
    }

    public DeleteVideoDnaResponse deleteVideoDnaWithOptions(DeleteVideoDnaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteVideoDna", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/dna/delete", "none", req, runtime), new DeleteVideoDnaResponse());
    }

    public DeleteVideoDnaGroupResponse deleteVideoDnaGroup(DeleteVideoDnaGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVideoDnaGroupWithOptions(request, headers, runtime);
    }

    public DeleteVideoDnaGroupResponse deleteVideoDnaGroupWithOptions(DeleteVideoDnaGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteVideoDnaGroup", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/dna/group/delete", "none", req, runtime), new DeleteVideoDnaGroupResponse());
    }

    public DetectFaceResponse detectFace(DetectFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detectFaceWithOptions(request, headers, runtime);
    }

    public DetectFaceResponse detectFaceWithOptions(DetectFaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DetectFace", "2018-05-09", "HTTPS", "POST", "AK", "/green/face/detect", "none", req, runtime), new DetectFaceResponse());
    }

    public FileAsyncScanResponse fileAsyncScan(FileAsyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileAsyncScanWithOptions(request, headers, runtime);
    }

    public FileAsyncScanResponse fileAsyncScanWithOptions(FileAsyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("FileAsyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/file/asyncscan", "none", req, runtime), new FileAsyncScanResponse());
    }

    public FileAsyncScanResultsResponse fileAsyncScanResults(FileAsyncScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileAsyncScanResultsWithOptions(request, headers, runtime);
    }

    public FileAsyncScanResultsResponse fileAsyncScanResultsWithOptions(FileAsyncScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("FileAsyncScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/file/results", "none", req, runtime), new FileAsyncScanResultsResponse());
    }

    public GetAddVideoDnaResultsResponse getAddVideoDnaResults(GetAddVideoDnaResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAddVideoDnaResultsWithOptions(request, headers, runtime);
    }

    public GetAddVideoDnaResultsResponse getAddVideoDnaResultsWithOptions(GetAddVideoDnaResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetAddVideoDnaResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/dna/add/results", "none", req, runtime), new GetAddVideoDnaResultsResponse());
    }

    public GetFacesResponse getFaces(GetFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFacesWithOptions(request, headers, runtime);
    }

    public GetFacesResponse getFacesWithOptions(GetFacesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetFaces", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/faces", "json", req, runtime), new GetFacesResponse());
    }

    public GetGroupsResponse getGroups(GetGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupsWithOptions(request, headers, runtime);
    }

    public GetGroupsResponse getGroupsWithOptions(GetGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetGroups", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/groups", "none", req, runtime), new GetGroupsResponse());
    }

    public GetPersonResponse getPerson(GetPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPersonWithOptions(request, headers, runtime);
    }

    public GetPersonResponse getPersonWithOptions(GetPersonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetPerson", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/person", "none", req, runtime), new GetPersonResponse());
    }

    public GetPersonsResponse getPersons(GetPersonsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPersonsWithOptions(request, headers, runtime);
    }

    public GetPersonsResponse getPersonsWithOptions(GetPersonsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetPersons", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/group/persons", "none", req, runtime), new GetPersonsResponse());
    }

    public GetSimilarityImageResponse getSimilarityImage(GetSimilarityImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSimilarityImageWithOptions(request, headers, runtime);
    }

    public GetSimilarityImageResponse getSimilarityImageWithOptions(GetSimilarityImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetSimilarityImage", "2018-05-09", "HTTPS", "POST", "AK", "/green/similarity/image/get", "none", req, runtime), new GetSimilarityImageResponse());
    }

    public GetSimilarityLibraryResponse getSimilarityLibrary(GetSimilarityLibraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSimilarityLibraryWithOptions(request, headers, runtime);
    }

    public GetSimilarityLibraryResponse getSimilarityLibraryWithOptions(GetSimilarityLibraryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetSimilarityLibrary", "2018-05-09", "HTTPS", "POST", "AK", "/green/similarity/library/get", "none", req, runtime), new GetSimilarityLibraryResponse());
    }

    public ImageAsyncManualScanResponse imageAsyncManualScan(ImageAsyncManualScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageAsyncManualScanWithOptions(request, headers, runtime);
    }

    public ImageAsyncManualScanResponse imageAsyncManualScanWithOptions(ImageAsyncManualScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ImageAsyncManualScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/image/manual/asyncScan", "none", req, runtime), new ImageAsyncManualScanResponse());
    }

    public ImageAsyncManualScanResultsResponse imageAsyncManualScanResults(ImageAsyncManualScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageAsyncManualScanResultsWithOptions(request, headers, runtime);
    }

    public ImageAsyncManualScanResultsResponse imageAsyncManualScanResultsWithOptions(ImageAsyncManualScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ImageAsyncManualScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/image/manual/scan/results", "none", req, runtime), new ImageAsyncManualScanResultsResponse());
    }

    public ImageAsyncScanResponse imageAsyncScan(ImageAsyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageAsyncScanWithOptions(request, headers, runtime);
    }

    public ImageAsyncScanResponse imageAsyncScanWithOptions(ImageAsyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ImageAsyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/image/asyncscan", "none", req, runtime), new ImageAsyncScanResponse());
    }

    public ImageAsyncScanResultsResponse imageAsyncScanResults(ImageAsyncScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageAsyncScanResultsWithOptions(request, headers, runtime);
    }

    public ImageAsyncScanResultsResponse imageAsyncScanResultsWithOptions(ImageAsyncScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ImageAsyncScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/image/results", "none", req, runtime), new ImageAsyncScanResultsResponse());
    }

    public ImageScanFeedbackResponse imageScanFeedback(ImageScanFeedbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageScanFeedbackWithOptions(request, headers, runtime);
    }

    public ImageScanFeedbackResponse imageScanFeedbackWithOptions(ImageScanFeedbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ImageScanFeedback", "2018-05-09", "HTTPS", "POST", "AK", "/green/image/feedback", "none", req, runtime), new ImageScanFeedbackResponse());
    }

    public ImageSyncScanResponse imageSyncScan(ImageSyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageSyncScanWithOptions(request, headers, runtime);
    }

    public ImageSyncScanResponse imageSyncScanWithOptions(ImageSyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ImageSyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/image/scan", "none", req, runtime), new ImageSyncScanResponse());
    }

    public ListSimilarityImagesResponse listSimilarityImages(ListSimilarityImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimilarityImagesWithOptions(request, headers, runtime);
    }

    public ListSimilarityImagesResponse listSimilarityImagesWithOptions(ListSimilarityImagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSimilarityImages", "2018-05-09", "HTTPS", "POST", "AK", "/green/similarity/image/list", "none", req, runtime), new ListSimilarityImagesResponse());
    }

    public ListSimilarityLibrariesResponse listSimilarityLibraries(ListSimilarityLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimilarityLibrariesWithOptions(request, headers, runtime);
    }

    public ListSimilarityLibrariesResponse listSimilarityLibrariesWithOptions(ListSimilarityLibrariesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSimilarityLibraries", "2018-05-09", "HTTPS", "POST", "AK", "/green/similarity/library/list", "none", req, runtime), new ListSimilarityLibrariesResponse());
    }

    public LiveStreamAsyncScanResponse liveStreamAsyncScan(LiveStreamAsyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.liveStreamAsyncScanWithOptions(request, headers, runtime);
    }

    public LiveStreamAsyncScanResponse liveStreamAsyncScanWithOptions(LiveStreamAsyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("LiveStreamAsyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/livestream/asyncscan", "none", req, runtime), new LiveStreamAsyncScanResponse());
    }

    public LiveStreamAsyncScanResultsResponse liveStreamAsyncScanResults(LiveStreamAsyncScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.liveStreamAsyncScanResultsWithOptions(request, headers, runtime);
    }

    public LiveStreamAsyncScanResultsResponse liveStreamAsyncScanResultsWithOptions(LiveStreamAsyncScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("LiveStreamAsyncScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/livestream/results", "none", req, runtime), new LiveStreamAsyncScanResultsResponse());
    }

    public LiveStreamCancelScanResponse liveStreamCancelScan(LiveStreamCancelScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.liveStreamCancelScanWithOptions(request, headers, runtime);
    }

    public LiveStreamCancelScanResponse liveStreamCancelScanWithOptions(LiveStreamCancelScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("LiveStreamCancelScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/livestream/cancelscan", "none", req, runtime), new LiveStreamCancelScanResponse());
    }

    public SearchPersonResponse searchPerson(SearchPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchPersonWithOptions(request, headers, runtime);
    }

    public SearchPersonResponse searchPersonWithOptions(SearchPersonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("SearchPerson", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/search", "none", req, runtime), new SearchPersonResponse());
    }

    public SetPersonResponse setPerson(SetPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setPersonWithOptions(request, headers, runtime);
    }

    public SetPersonResponse setPersonWithOptions(SetPersonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("SetPerson", "2018-05-09", "HTTPS", "POST", "AK", "/green/sface/person/update", "none", req, runtime), new SetPersonResponse());
    }

    public TextAsyncManualScanResponse textAsyncManualScan(TextAsyncManualScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textAsyncManualScanWithOptions(request, headers, runtime);
    }

    public TextAsyncManualScanResponse textAsyncManualScanWithOptions(TextAsyncManualScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("TextAsyncManualScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/text/manual/asyncScan", "none", req, runtime), new TextAsyncManualScanResponse());
    }

    public TextAsyncManualScanResultsResponse textAsyncManualScanResults(TextAsyncManualScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textAsyncManualScanResultsWithOptions(request, headers, runtime);
    }

    public TextAsyncManualScanResultsResponse textAsyncManualScanResultsWithOptions(TextAsyncManualScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("TextAsyncManualScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/text/manual/scan/results", "none", req, runtime), new TextAsyncManualScanResultsResponse());
    }

    public TextFeedbackResponse textFeedback(TextFeedbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textFeedbackWithOptions(request, headers, runtime);
    }

    public TextFeedbackResponse textFeedbackWithOptions(TextFeedbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("TextFeedback", "2018-05-09", "HTTPS", "POST", "AK", "/green/text/feedback", "none", req, runtime), new TextFeedbackResponse());
    }

    public TextScanResponse textScan(TextScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textScanWithOptions(request, headers, runtime);
    }

    public TextScanResponse textScanWithOptions(TextScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("TextScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/text/scan", "none", req, runtime), new TextScanResponse());
    }

    public UploadCredentialsResponse uploadCredentials(UploadCredentialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCredentialsWithOptions(request, headers, runtime);
    }

    public UploadCredentialsResponse uploadCredentialsWithOptions(UploadCredentialsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UploadCredentials", "2018-05-09", "HTTPS", "POST", "AK", "/green/credentials/uploadcredentials", "none", req, runtime), new UploadCredentialsResponse());
    }

    public VideoAsyncManualScanResponse videoAsyncManualScan(VideoAsyncManualScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoAsyncManualScanWithOptions(request, headers, runtime);
    }

    public VideoAsyncManualScanResponse videoAsyncManualScanWithOptions(VideoAsyncManualScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VideoAsyncManualScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/manual/asyncScan", "none", req, runtime), new VideoAsyncManualScanResponse());
    }

    public VideoAsyncManualScanResultsResponse videoAsyncManualScanResults(VideoAsyncManualScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoAsyncManualScanResultsWithOptions(request, headers, runtime);
    }

    public VideoAsyncManualScanResultsResponse videoAsyncManualScanResultsWithOptions(VideoAsyncManualScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VideoAsyncManualScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/manual/scan/results", "none", req, runtime), new VideoAsyncManualScanResultsResponse());
    }

    public VideoAsyncScanResponse videoAsyncScan(VideoAsyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoAsyncScanWithOptions(request, headers, runtime);
    }

    public VideoAsyncScanResponse videoAsyncScanWithOptions(VideoAsyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VideoAsyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/asyncscan", "none", req, runtime), new VideoAsyncScanResponse());
    }

    public VideoAsyncScanResultsResponse videoAsyncScanResults(VideoAsyncScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoAsyncScanResultsWithOptions(request, headers, runtime);
    }

    public VideoAsyncScanResultsResponse videoAsyncScanResultsWithOptions(VideoAsyncScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VideoAsyncScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/results", "none", req, runtime), new VideoAsyncScanResultsResponse());
    }

    public VideoCancelScanResponse videoCancelScan(VideoCancelScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoCancelScanWithOptions(request, headers, runtime);
    }

    public VideoCancelScanResponse videoCancelScanWithOptions(VideoCancelScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VideoCancelScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/cancelscan", "none", req, runtime), new VideoCancelScanResponse());
    }

    public VideoFeedbackResponse videoFeedback(VideoFeedbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoFeedbackWithOptions(request, headers, runtime);
    }

    public VideoFeedbackResponse videoFeedbackWithOptions(VideoFeedbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VideoFeedback", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/feedback", "none", req, runtime), new VideoFeedbackResponse());
    }

    public VideoSyncScanResponse videoSyncScan(VideoSyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoSyncScanWithOptions(request, headers, runtime);
    }

    public VideoSyncScanResponse videoSyncScanWithOptions(VideoSyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VideoSyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/video/syncscan", "none", req, runtime), new VideoSyncScanResponse());
    }

    public VodAsyncScanResponse vodAsyncScan(VodAsyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.vodAsyncScanWithOptions(request, headers, runtime);
    }

    public VodAsyncScanResponse vodAsyncScanWithOptions(VodAsyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VodAsyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/vod/asyncscan", "none", req, runtime), new VodAsyncScanResponse());
    }

    public VodAsyncScanResultsResponse vodAsyncScanResults(VodAsyncScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.vodAsyncScanResultsWithOptions(request, headers, runtime);
    }

    public VodAsyncScanResultsResponse vodAsyncScanResultsWithOptions(VodAsyncScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VodAsyncScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/vod/results", "none", req, runtime), new VodAsyncScanResultsResponse());
    }

    public VoiceAsyncManualScanResponse voiceAsyncManualScan(VoiceAsyncManualScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceAsyncManualScanWithOptions(request, headers, runtime);
    }

    public VoiceAsyncManualScanResponse voiceAsyncManualScanWithOptions(VoiceAsyncManualScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceAsyncManualScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/manual/asyncScan", "none", req, runtime), new VoiceAsyncManualScanResponse());
    }

    public VoiceAsyncManualScanResultsResponse voiceAsyncManualScanResults(VoiceAsyncManualScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceAsyncManualScanResultsWithOptions(request, headers, runtime);
    }

    public VoiceAsyncManualScanResultsResponse voiceAsyncManualScanResultsWithOptions(VoiceAsyncManualScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceAsyncManualScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/manual/scan/results", "none", req, runtime), new VoiceAsyncManualScanResultsResponse());
    }

    public VoiceAsyncScanResponse voiceAsyncScan(VoiceAsyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceAsyncScanWithOptions(request, headers, runtime);
    }

    public VoiceAsyncScanResponse voiceAsyncScanWithOptions(VoiceAsyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceAsyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/asyncscan", "none", req, runtime), new VoiceAsyncScanResponse());
    }

    public VoiceAsyncScanResultsResponse voiceAsyncScanResults(VoiceAsyncScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceAsyncScanResultsWithOptions(request, headers, runtime);
    }

    public VoiceAsyncScanResultsResponse voiceAsyncScanResultsWithOptions(VoiceAsyncScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceAsyncScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/results", "none", req, runtime), new VoiceAsyncScanResultsResponse());
    }

    public VoiceCancelScanResponse voiceCancelScan(VoiceCancelScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceCancelScanWithOptions(request, headers, runtime);
    }

    public VoiceCancelScanResponse voiceCancelScanWithOptions(VoiceCancelScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceCancelScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/cancelscan", "none", req, runtime), new VoiceCancelScanResponse());
    }

    public VoiceIdentityCheckResponse voiceIdentityCheck(VoiceIdentityCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityCheckWithOptions(request, headers, runtime);
    }

    public VoiceIdentityCheckResponse voiceIdentityCheckWithOptions(VoiceIdentityCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceIdentityCheck", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/auth/check", "none", req, runtime), new VoiceIdentityCheckResponse());
    }

    public VoiceIdentityRegisterResponse voiceIdentityRegister(VoiceIdentityRegisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityRegisterWithOptions(request, headers, runtime);
    }

    public VoiceIdentityRegisterResponse voiceIdentityRegisterWithOptions(VoiceIdentityRegisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceIdentityRegister", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/auth/register", "none", req, runtime), new VoiceIdentityRegisterResponse());
    }

    public VoiceIdentityStartCheckResponse voiceIdentityStartCheck(VoiceIdentityStartCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityStartCheckWithOptions(request, headers, runtime);
    }

    public VoiceIdentityStartCheckResponse voiceIdentityStartCheckWithOptions(VoiceIdentityStartCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceIdentityStartCheck", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/auth/start/check", "none", req, runtime), new VoiceIdentityStartCheckResponse());
    }

    public VoiceIdentityStartRegisterResponse voiceIdentityStartRegister(VoiceIdentityStartRegisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityStartRegisterWithOptions(request, headers, runtime);
    }

    public VoiceIdentityStartRegisterResponse voiceIdentityStartRegisterWithOptions(VoiceIdentityStartRegisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceIdentityStartRegister", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/auth/start/register", "none", req, runtime), new VoiceIdentityStartRegisterResponse());
    }

    public VoiceIdentityUnregisterResponse voiceIdentityUnregister(VoiceIdentityUnregisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityUnregisterWithOptions(request, headers, runtime);
    }

    public VoiceIdentityUnregisterResponse voiceIdentityUnregisterWithOptions(VoiceIdentityUnregisterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceIdentityUnregister", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/auth/unregister", "none", req, runtime), new VoiceIdentityUnregisterResponse());
    }

    public VoiceSyncScanResponse voiceSyncScan(VoiceSyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceSyncScanWithOptions(request, headers, runtime);
    }

    public VoiceSyncScanResponse voiceSyncScanWithOptions(VoiceSyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoiceSyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/voice/syncscan", "none", req, runtime), new VoiceSyncScanResponse());
    }

    public WebpageAsyncScanResponse webpageAsyncScan(WebpageAsyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.webpageAsyncScanWithOptions(request, headers, runtime);
    }

    public WebpageAsyncScanResponse webpageAsyncScanWithOptions(WebpageAsyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("WebpageAsyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/webpage/asyncscan", "none", req, runtime), new WebpageAsyncScanResponse());
    }

    public WebpageAsyncScanResultsResponse webpageAsyncScanResults(WebpageAsyncScanResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.webpageAsyncScanResultsWithOptions(request, headers, runtime);
    }

    public WebpageAsyncScanResultsResponse webpageAsyncScanResultsWithOptions(WebpageAsyncScanResultsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("WebpageAsyncScanResults", "2018-05-09", "HTTPS", "POST", "AK", "/green/webpage/results", "none", req, runtime), new WebpageAsyncScanResultsResponse());
    }

    public WebpageSyncScanResponse webpageSyncScan(WebpageSyncScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.webpageSyncScanWithOptions(request, headers, runtime);
    }

    public WebpageSyncScanResponse webpageSyncScanWithOptions(WebpageSyncScanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("WebpageSyncScan", "2018-05-09", "HTTPS", "POST", "AK", "/green/webpage/scan", "none", req, runtime), new WebpageSyncScanResponse());
    }
}
