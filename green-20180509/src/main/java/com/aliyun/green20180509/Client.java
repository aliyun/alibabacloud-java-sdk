// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509;

import com.aliyun.tea.*;
import com.aliyun.green20180509.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>summary</b> : 
     * <p>添加人脸</p>
     * 
     * @param request AddFacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFacesResponse
     */
    public AddFacesResponse addFacesWithOptions(AddFacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFaces"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/face/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加人脸</p>
     * 
     * @param request AddFacesRequest
     * @return AddFacesResponse
     */
    public AddFacesResponse addFaces(AddFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加分组</p>
     * 
     * @param request AddGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGroupsResponse
     */
    public AddGroupsResponse addGroupsWithOptions(AddGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGroups"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/person/groups/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加分组</p>
     * 
     * @param request AddGroupsRequest
     * @return AddGroupsResponse
     */
    public AddGroupsResponse addGroups(AddGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加个体</p>
     * 
     * @param request AddPersonRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPersonResponse
     */
    public AddPersonResponse addPersonWithOptions(AddPersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPerson"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/person/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPersonResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加个体</p>
     * 
     * @param request AddPersonRequest
     * @return AddPersonResponse
     */
    public AddPersonResponse addPerson(AddPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addPersonWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加相似图</p>
     * 
     * @param request AddSimilarityImageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSimilarityImageResponse
     */
    public AddSimilarityImageResponse addSimilarityImageWithOptions(AddSimilarityImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSimilarityImage"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/similarity/image/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSimilarityImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加相似图</p>
     * 
     * @param request AddSimilarityImageRequest
     * @return AddSimilarityImageResponse
     */
    public AddSimilarityImageResponse addSimilarityImage(AddSimilarityImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSimilarityImageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加相似图库</p>
     * 
     * @param request AddSimilarityLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSimilarityLibraryResponse
     */
    public AddSimilarityLibraryResponse addSimilarityLibraryWithOptions(AddSimilarityLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSimilarityLibrary"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/similarity/library/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSimilarityLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加相似图库</p>
     * 
     * @param request AddSimilarityLibraryRequest
     * @return AddSimilarityLibraryResponse
     */
    public AddSimilarityLibraryResponse addSimilarityLibrary(AddSimilarityLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSimilarityLibraryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加视频Dna</p>
     * 
     * @param request AddVideoDnaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddVideoDnaResponse
     */
    public AddVideoDnaResponse addVideoDnaWithOptions(AddVideoDnaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVideoDna"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/dna/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVideoDnaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加视频Dna</p>
     * 
     * @param request AddVideoDnaRequest
     * @return AddVideoDnaResponse
     */
    public AddVideoDnaResponse addVideoDna(AddVideoDnaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addVideoDnaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加视频Dna分组</p>
     * 
     * @param request AddVideoDnaGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddVideoDnaGroupResponse
     */
    public AddVideoDnaGroupResponse addVideoDnaGroupWithOptions(AddVideoDnaGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVideoDnaGroup"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/dna/group/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVideoDnaGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加视频Dna分组</p>
     * 
     * @param request AddVideoDnaGroupRequest
     * @return AddVideoDnaGroupResponse
     */
    public AddVideoDnaGroupResponse addVideoDnaGroup(AddVideoDnaGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addVideoDnaGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除人脸</p>
     * 
     * @param request DeleteFacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFacesResponse
     */
    public DeleteFacesResponse deleteFacesWithOptions(DeleteFacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaces"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/face/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除人脸</p>
     * 
     * @param request DeleteFacesRequest
     * @return DeleteFacesResponse
     */
    public DeleteFacesResponse deleteFaces(DeleteFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除分组</p>
     * 
     * @param request DeleteGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupsResponse
     */
    public DeleteGroupsResponse deleteGroupsWithOptions(DeleteGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroups"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/person/groups/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除分组</p>
     * 
     * @param request DeleteGroupsRequest
     * @return DeleteGroupsResponse
     */
    public DeleteGroupsResponse deleteGroups(DeleteGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除个体</p>
     * 
     * @param request DeletePersonRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePersonResponse
     */
    public DeletePersonResponse deletePersonWithOptions(DeletePersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePerson"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/person/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePersonResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除个体</p>
     * 
     * @param request DeletePersonRequest
     * @return DeletePersonResponse
     */
    public DeletePersonResponse deletePerson(DeletePersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePersonWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除相似图</p>
     * 
     * @param request DeleteSimilarityImageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSimilarityImageResponse
     */
    public DeleteSimilarityImageResponse deleteSimilarityImageWithOptions(DeleteSimilarityImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSimilarityImage"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/similarity/image/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSimilarityImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除相似图</p>
     * 
     * @param request DeleteSimilarityImageRequest
     * @return DeleteSimilarityImageResponse
     */
    public DeleteSimilarityImageResponse deleteSimilarityImage(DeleteSimilarityImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSimilarityImageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除相似图库</p>
     * 
     * @param request DeleteSimilarityLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSimilarityLibraryResponse
     */
    public DeleteSimilarityLibraryResponse deleteSimilarityLibraryWithOptions(DeleteSimilarityLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSimilarityLibrary"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/similarity/library/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSimilarityLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除相似图库</p>
     * 
     * @param request DeleteSimilarityLibraryRequest
     * @return DeleteSimilarityLibraryResponse
     */
    public DeleteSimilarityLibraryResponse deleteSimilarityLibrary(DeleteSimilarityLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSimilarityLibraryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除视频Dna</p>
     * 
     * @param request DeleteVideoDnaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVideoDnaResponse
     */
    public DeleteVideoDnaResponse deleteVideoDnaWithOptions(DeleteVideoDnaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVideoDna"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/dna/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVideoDnaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除视频Dna</p>
     * 
     * @param request DeleteVideoDnaRequest
     * @return DeleteVideoDnaResponse
     */
    public DeleteVideoDnaResponse deleteVideoDna(DeleteVideoDnaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVideoDnaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除视频Dna分组</p>
     * 
     * @param request DeleteVideoDnaGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVideoDnaGroupResponse
     */
    public DeleteVideoDnaGroupResponse deleteVideoDnaGroupWithOptions(DeleteVideoDnaGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVideoDnaGroup"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/dna/group/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVideoDnaGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除视频Dna分组</p>
     * 
     * @param request DeleteVideoDnaGroupRequest
     * @return DeleteVideoDnaGroupResponse
     */
    public DeleteVideoDnaGroupResponse deleteVideoDnaGroup(DeleteVideoDnaGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVideoDnaGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>人脸属性检测</p>
     * 
     * @param request DetectFaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectFaceResponse
     */
    public DetectFaceResponse detectFaceWithOptions(DetectFaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectFace"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/face/detect"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectFaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>人脸属性检测</p>
     * 
     * @param request DetectFaceRequest
     * @return DetectFaceResponse
     */
    public DetectFaceResponse detectFace(DetectFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detectFaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文件异步检测</p>
     * 
     * @param request FileAsyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileAsyncScanResponse
     */
    public FileAsyncScanResponse fileAsyncScanWithOptions(FileAsyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileAsyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/file/asyncscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FileAsyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文件异步检测</p>
     * 
     * @param request FileAsyncScanRequest
     * @return FileAsyncScanResponse
     */
    public FileAsyncScanResponse fileAsyncScan(FileAsyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileAsyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文件异步检测结果</p>
     * 
     * @param request FileAsyncScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileAsyncScanResultsResponse
     */
    public FileAsyncScanResultsResponse fileAsyncScanResultsWithOptions(FileAsyncScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileAsyncScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/file/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FileAsyncScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文件异步检测结果</p>
     * 
     * @param request FileAsyncScanResultsRequest
     * @return FileAsyncScanResultsResponse
     */
    public FileAsyncScanResultsResponse fileAsyncScanResults(FileAsyncScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileAsyncScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文件检测新版本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileAsyncScanV2Response
     */
    public FileAsyncScanV2Response fileAsyncScanV2WithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileAsyncScanV2"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/file/asyncscanv2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FileAsyncScanV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>文件检测新版本</p>
     * @return FileAsyncScanV2Response
     */
    public FileAsyncScanV2Response fileAsyncScanV2() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileAsyncScanV2WithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取人脸列表</p>
     * 
     * @param request GetFacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFacesResponse
     */
    public GetFacesResponse getFacesWithOptions(GetFacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFaces"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/faces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取人脸列表</p>
     * 
     * @param request GetFacesRequest
     * @return GetFacesResponse
     */
    public GetFacesResponse getFaces(GetFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取组列表</p>
     * 
     * @param request GetGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupsResponse
     */
    public GetGroupsResponse getGroupsWithOptions(GetGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroups"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取组列表</p>
     * 
     * @param request GetGroupsRequest
     * @return GetGroupsResponse
     */
    public GetGroupsResponse getGroups(GetGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个个体</p>
     * 
     * @param request GetPersonRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPersonResponse
     */
    public GetPersonResponse getPersonWithOptions(GetPersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPerson"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/person"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPersonResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个个体</p>
     * 
     * @param request GetPersonRequest
     * @return GetPersonResponse
     */
    public GetPersonResponse getPerson(GetPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPersonWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取个体列表</p>
     * 
     * @param request GetPersonsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPersonsResponse
     */
    public GetPersonsResponse getPersonsWithOptions(GetPersonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPersons"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/group/persons"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPersonsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取个体列表</p>
     * 
     * @param request GetPersonsRequest
     * @return GetPersonsResponse
     */
    public GetPersonsResponse getPersons(GetPersonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPersonsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取相似图</p>
     * 
     * @param request GetSimilarityImageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSimilarityImageResponse
     */
    public GetSimilarityImageResponse getSimilarityImageWithOptions(GetSimilarityImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSimilarityImage"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/similarity/image/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSimilarityImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取相似图</p>
     * 
     * @param request GetSimilarityImageRequest
     * @return GetSimilarityImageResponse
     */
    public GetSimilarityImageResponse getSimilarityImage(GetSimilarityImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSimilarityImageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取相似图库</p>
     * 
     * @param request GetSimilarityLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSimilarityLibraryResponse
     */
    public GetSimilarityLibraryResponse getSimilarityLibraryWithOptions(GetSimilarityLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSimilarityLibrary"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/similarity/library/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSimilarityLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取相似图库</p>
     * 
     * @param request GetSimilarityLibraryRequest
     * @return GetSimilarityLibraryResponse
     */
    public GetSimilarityLibraryResponse getSimilarityLibrary(GetSimilarityLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSimilarityLibraryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片人工异步审核</p>
     * 
     * @param request ImageAsyncManualScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageAsyncManualScanResponse
     */
    public ImageAsyncManualScanResponse imageAsyncManualScanWithOptions(ImageAsyncManualScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageAsyncManualScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/image/manual/asyncScan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageAsyncManualScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片人工异步审核</p>
     * 
     * @param request ImageAsyncManualScanRequest
     * @return ImageAsyncManualScanResponse
     */
    public ImageAsyncManualScanResponse imageAsyncManualScan(ImageAsyncManualScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageAsyncManualScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片人工异步审核结果</p>
     * 
     * @param request ImageAsyncManualScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageAsyncManualScanResultsResponse
     */
    public ImageAsyncManualScanResultsResponse imageAsyncManualScanResultsWithOptions(ImageAsyncManualScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageAsyncManualScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/image/manual/scan/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageAsyncManualScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片人工异步审核结果</p>
     * 
     * @param request ImageAsyncManualScanResultsRequest
     * @return ImageAsyncManualScanResultsResponse
     */
    public ImageAsyncManualScanResultsResponse imageAsyncManualScanResults(ImageAsyncManualScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageAsyncManualScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片异步检测</p>
     * 
     * @param request ImageAsyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageAsyncScanResponse
     */
    public ImageAsyncScanResponse imageAsyncScanWithOptions(ImageAsyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageAsyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/image/asyncscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageAsyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片异步检测</p>
     * 
     * @param request ImageAsyncScanRequest
     * @return ImageAsyncScanResponse
     */
    public ImageAsyncScanResponse imageAsyncScan(ImageAsyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageAsyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片异步检测结果</p>
     * 
     * @param request ImageAsyncScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageAsyncScanResultsResponse
     */
    public ImageAsyncScanResultsResponse imageAsyncScanResultsWithOptions(ImageAsyncScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageAsyncScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/image/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageAsyncScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片异步检测结果</p>
     * 
     * @param request ImageAsyncScanResultsRequest
     * @return ImageAsyncScanResultsResponse
     */
    public ImageAsyncScanResultsResponse imageAsyncScanResults(ImageAsyncScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageAsyncScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片检测反馈</p>
     * 
     * @param request ImageScanFeedbackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageScanFeedbackResponse
     */
    public ImageScanFeedbackResponse imageScanFeedbackWithOptions(ImageScanFeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageScanFeedback"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/image/feedback"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageScanFeedbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片检测反馈</p>
     * 
     * @param request ImageScanFeedbackRequest
     * @return ImageScanFeedbackResponse
     */
    public ImageScanFeedbackResponse imageScanFeedback(ImageScanFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageScanFeedbackWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片同步检测</p>
     * 
     * @param request ImageSyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageSyncScanResponse
     */
    public ImageSyncScanResponse imageSyncScanWithOptions(ImageSyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageSyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/image/scan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageSyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片同步检测</p>
     * 
     * @param request ImageSyncScanRequest
     * @return ImageSyncScanResponse
     */
    public ImageSyncScanResponse imageSyncScan(ImageSyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.imageSyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取相似图</p>
     * 
     * @param request ListSimilarityImagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSimilarityImagesResponse
     */
    public ListSimilarityImagesResponse listSimilarityImagesWithOptions(ListSimilarityImagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSimilarityImages"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/similarity/image/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSimilarityImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取相似图</p>
     * 
     * @param request ListSimilarityImagesRequest
     * @return ListSimilarityImagesResponse
     */
    public ListSimilarityImagesResponse listSimilarityImages(ListSimilarityImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimilarityImagesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取相似图库</p>
     * 
     * @param request ListSimilarityLibrariesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSimilarityLibrariesResponse
     */
    public ListSimilarityLibrariesResponse listSimilarityLibrariesWithOptions(ListSimilarityLibrariesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSimilarityLibraries"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/similarity/library/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSimilarityLibrariesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取相似图库</p>
     * 
     * @param request ListSimilarityLibrariesRequest
     * @return ListSimilarityLibrariesResponse
     */
    public ListSimilarityLibrariesResponse listSimilarityLibraries(ListSimilarityLibrariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimilarityLibrariesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>直播流异步检测</p>
     * 
     * @param request LiveStreamAsyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return LiveStreamAsyncScanResponse
     */
    public LiveStreamAsyncScanResponse liveStreamAsyncScanWithOptions(LiveStreamAsyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LiveStreamAsyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/livestream/asyncscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LiveStreamAsyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>直播流异步检测</p>
     * 
     * @param request LiveStreamAsyncScanRequest
     * @return LiveStreamAsyncScanResponse
     */
    public LiveStreamAsyncScanResponse liveStreamAsyncScan(LiveStreamAsyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.liveStreamAsyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>直播流异步检测结果</p>
     * 
     * @param request LiveStreamAsyncScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return LiveStreamAsyncScanResultsResponse
     */
    public LiveStreamAsyncScanResultsResponse liveStreamAsyncScanResultsWithOptions(LiveStreamAsyncScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LiveStreamAsyncScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/livestream/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LiveStreamAsyncScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>直播流异步检测结果</p>
     * 
     * @param request LiveStreamAsyncScanResultsRequest
     * @return LiveStreamAsyncScanResultsResponse
     */
    public LiveStreamAsyncScanResultsResponse liveStreamAsyncScanResults(LiveStreamAsyncScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.liveStreamAsyncScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>直播流取消检测</p>
     * 
     * @param request LiveStreamCancelScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return LiveStreamCancelScanResponse
     */
    public LiveStreamCancelScanResponse liveStreamCancelScanWithOptions(LiveStreamCancelScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LiveStreamCancelScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/livestream/cancelscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LiveStreamCancelScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>直播流取消检测</p>
     * 
     * @param request LiveStreamCancelScanRequest
     * @return LiveStreamCancelScanResponse
     */
    public LiveStreamCancelScanResponse liveStreamCancelScan(LiveStreamCancelScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.liveStreamCancelScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置个体</p>
     * 
     * @param request SetPersonRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPersonResponse
     */
    public SetPersonResponse setPersonWithOptions(SetPersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPerson"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/sface/person/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPersonResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置个体</p>
     * 
     * @param request SetPersonRequest
     * @return SetPersonResponse
     */
    public SetPersonResponse setPerson(SetPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setPersonWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文本异步人工审核</p>
     * 
     * @param request TextAsyncManualScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextAsyncManualScanResponse
     */
    public TextAsyncManualScanResponse textAsyncManualScanWithOptions(TextAsyncManualScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextAsyncManualScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/text/manual/asyncScan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextAsyncManualScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文本异步人工审核</p>
     * 
     * @param request TextAsyncManualScanRequest
     * @return TextAsyncManualScanResponse
     */
    public TextAsyncManualScanResponse textAsyncManualScan(TextAsyncManualScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textAsyncManualScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文本异步人工审核结果</p>
     * 
     * @param request TextAsyncManualScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextAsyncManualScanResultsResponse
     */
    public TextAsyncManualScanResultsResponse textAsyncManualScanResultsWithOptions(TextAsyncManualScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextAsyncManualScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/text/manual/scan/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextAsyncManualScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文本异步人工审核结果</p>
     * 
     * @param request TextAsyncManualScanResultsRequest
     * @return TextAsyncManualScanResultsResponse
     */
    public TextAsyncManualScanResultsResponse textAsyncManualScanResults(TextAsyncManualScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textAsyncManualScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文本结果反馈</p>
     * 
     * @param request TextFeedbackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextFeedbackResponse
     */
    public TextFeedbackResponse textFeedbackWithOptions(TextFeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextFeedback"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/text/feedback"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextFeedbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文本结果反馈</p>
     * 
     * @param request TextFeedbackRequest
     * @return TextFeedbackResponse
     */
    public TextFeedbackResponse textFeedback(TextFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textFeedbackWithOptions(request, headers, runtime);
    }

    /**
     * @param request TextScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextScanResponse
     */
    public TextScanResponse textScanWithOptions(TextScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/text/scan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextScanResponse());
    }

    /**
     * @param request TextScanRequest
     * @return TextScanResponse
     */
    public TextScanResponse textScan(TextScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取上传证书</p>
     * 
     * @param request UploadCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadCredentialsResponse
     */
    public UploadCredentialsResponse uploadCredentialsWithOptions(UploadCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadCredentials"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/credentials/uploadcredentials"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取上传证书</p>
     * 
     * @param request UploadCredentialsRequest
     * @return UploadCredentialsResponse
     */
    public UploadCredentialsResponse uploadCredentials(UploadCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCredentialsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频异步人工审核</p>
     * 
     * @param request VideoAsyncManualScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoAsyncManualScanResponse
     */
    public VideoAsyncManualScanResponse videoAsyncManualScanWithOptions(VideoAsyncManualScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoAsyncManualScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/manual/asyncScan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoAsyncManualScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频异步人工审核</p>
     * 
     * @param request VideoAsyncManualScanRequest
     * @return VideoAsyncManualScanResponse
     */
    public VideoAsyncManualScanResponse videoAsyncManualScan(VideoAsyncManualScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoAsyncManualScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频异步人工审核结果</p>
     * 
     * @param request VideoAsyncManualScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoAsyncManualScanResultsResponse
     */
    public VideoAsyncManualScanResultsResponse videoAsyncManualScanResultsWithOptions(VideoAsyncManualScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoAsyncManualScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/manual/scan/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoAsyncManualScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频异步人工审核结果</p>
     * 
     * @param request VideoAsyncManualScanResultsRequest
     * @return VideoAsyncManualScanResultsResponse
     */
    public VideoAsyncManualScanResultsResponse videoAsyncManualScanResults(VideoAsyncManualScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoAsyncManualScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频异步检测</p>
     * 
     * @param request VideoAsyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoAsyncScanResponse
     */
    public VideoAsyncScanResponse videoAsyncScanWithOptions(VideoAsyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoAsyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/asyncscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoAsyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频异步检测</p>
     * 
     * @param request VideoAsyncScanRequest
     * @return VideoAsyncScanResponse
     */
    public VideoAsyncScanResponse videoAsyncScan(VideoAsyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoAsyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频异步检测结果</p>
     * 
     * @param request VideoAsyncScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoAsyncScanResultsResponse
     */
    public VideoAsyncScanResultsResponse videoAsyncScanResultsWithOptions(VideoAsyncScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoAsyncScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoAsyncScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频异步检测结果</p>
     * 
     * @param request VideoAsyncScanResultsRequest
     * @return VideoAsyncScanResultsResponse
     */
    public VideoAsyncScanResultsResponse videoAsyncScanResults(VideoAsyncScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoAsyncScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频取消检测</p>
     * 
     * @param request VideoCancelScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoCancelScanResponse
     */
    public VideoCancelScanResponse videoCancelScanWithOptions(VideoCancelScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoCancelScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/cancelscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoCancelScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频取消检测</p>
     * 
     * @param request VideoCancelScanRequest
     * @return VideoCancelScanResponse
     */
    public VideoCancelScanResponse videoCancelScan(VideoCancelScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoCancelScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频结果反馈</p>
     * 
     * @param request VideoFeedbackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoFeedbackResponse
     */
    public VideoFeedbackResponse videoFeedbackWithOptions(VideoFeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoFeedback"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/feedback"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoFeedbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频结果反馈</p>
     * 
     * @param request VideoFeedbackRequest
     * @return VideoFeedbackResponse
     */
    public VideoFeedbackResponse videoFeedback(VideoFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoFeedbackWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频同步检测</p>
     * 
     * @param request VideoSyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoSyncScanResponse
     */
    public VideoSyncScanResponse videoSyncScanWithOptions(VideoSyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoSyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/video/syncscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoSyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频同步检测</p>
     * 
     * @param request VideoSyncScanRequest
     * @return VideoSyncScanResponse
     */
    public VideoSyncScanResponse videoSyncScan(VideoSyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoSyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频点播异步检测</p>
     * 
     * @param request VodAsyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VodAsyncScanResponse
     */
    public VodAsyncScanResponse vodAsyncScanWithOptions(VodAsyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VodAsyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/vod/asyncscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VodAsyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频点播异步检测</p>
     * 
     * @param request VodAsyncScanRequest
     * @return VodAsyncScanResponse
     */
    public VodAsyncScanResponse vodAsyncScan(VodAsyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.vodAsyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频点播异步检测结果</p>
     * 
     * @param request VodAsyncScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VodAsyncScanResultsResponse
     */
    public VodAsyncScanResultsResponse vodAsyncScanResultsWithOptions(VodAsyncScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VodAsyncScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/vod/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VodAsyncScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频点播异步检测结果</p>
     * 
     * @param request VodAsyncScanResultsRequest
     * @return VodAsyncScanResultsResponse
     */
    public VodAsyncScanResultsResponse vodAsyncScanResults(VodAsyncScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.vodAsyncScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音异步人工审核</p>
     * 
     * @param request VoiceAsyncManualScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceAsyncManualScanResponse
     */
    public VoiceAsyncManualScanResponse voiceAsyncManualScanWithOptions(VoiceAsyncManualScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceAsyncManualScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/manual/asyncScan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceAsyncManualScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>语音异步人工审核</p>
     * 
     * @param request VoiceAsyncManualScanRequest
     * @return VoiceAsyncManualScanResponse
     */
    public VoiceAsyncManualScanResponse voiceAsyncManualScan(VoiceAsyncManualScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceAsyncManualScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音异步人工审核结果</p>
     * 
     * @param request VoiceAsyncManualScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceAsyncManualScanResultsResponse
     */
    public VoiceAsyncManualScanResultsResponse voiceAsyncManualScanResultsWithOptions(VoiceAsyncManualScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceAsyncManualScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/manual/scan/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceAsyncManualScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>语音异步人工审核结果</p>
     * 
     * @param request VoiceAsyncManualScanResultsRequest
     * @return VoiceAsyncManualScanResultsResponse
     */
    public VoiceAsyncManualScanResultsResponse voiceAsyncManualScanResults(VoiceAsyncManualScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceAsyncManualScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音异步检测</p>
     * 
     * @param request VoiceAsyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceAsyncScanResponse
     */
    public VoiceAsyncScanResponse voiceAsyncScanWithOptions(VoiceAsyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceAsyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/asyncscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceAsyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>语音异步检测</p>
     * 
     * @param request VoiceAsyncScanRequest
     * @return VoiceAsyncScanResponse
     */
    public VoiceAsyncScanResponse voiceAsyncScan(VoiceAsyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceAsyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音异步检测结果</p>
     * 
     * @param request VoiceAsyncScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceAsyncScanResultsResponse
     */
    public VoiceAsyncScanResultsResponse voiceAsyncScanResultsWithOptions(VoiceAsyncScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceAsyncScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceAsyncScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>语音异步检测结果</p>
     * 
     * @param request VoiceAsyncScanResultsRequest
     * @return VoiceAsyncScanResultsResponse
     */
    public VoiceAsyncScanResultsResponse voiceAsyncScanResults(VoiceAsyncScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceAsyncScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音取消检测</p>
     * 
     * @param request VoiceCancelScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceCancelScanResponse
     */
    public VoiceCancelScanResponse voiceCancelScanWithOptions(VoiceCancelScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceCancelScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/cancelscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceCancelScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>语音取消检测</p>
     * 
     * @param request VoiceCancelScanRequest
     * @return VoiceCancelScanResponse
     */
    public VoiceCancelScanResponse voiceCancelScan(VoiceCancelScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceCancelScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>声纹比对</p>
     * 
     * @param request VoiceIdentityCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceIdentityCheckResponse
     */
    public VoiceIdentityCheckResponse voiceIdentityCheckWithOptions(VoiceIdentityCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceIdentityCheck"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/auth/check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceIdentityCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>声纹比对</p>
     * 
     * @param request VoiceIdentityCheckRequest
     * @return VoiceIdentityCheckResponse
     */
    public VoiceIdentityCheckResponse voiceIdentityCheck(VoiceIdentityCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>声纹注册</p>
     * 
     * @param request VoiceIdentityRegisterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceIdentityRegisterResponse
     */
    public VoiceIdentityRegisterResponse voiceIdentityRegisterWithOptions(VoiceIdentityRegisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceIdentityRegister"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/auth/register"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceIdentityRegisterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>声纹注册</p>
     * 
     * @param request VoiceIdentityRegisterRequest
     * @return VoiceIdentityRegisterResponse
     */
    public VoiceIdentityRegisterResponse voiceIdentityRegister(VoiceIdentityRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityRegisterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>声纹开始比对</p>
     * 
     * @param request VoiceIdentityStartCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceIdentityStartCheckResponse
     */
    public VoiceIdentityStartCheckResponse voiceIdentityStartCheckWithOptions(VoiceIdentityStartCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceIdentityStartCheck"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/auth/start/check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceIdentityStartCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>声纹开始比对</p>
     * 
     * @param request VoiceIdentityStartCheckRequest
     * @return VoiceIdentityStartCheckResponse
     */
    public VoiceIdentityStartCheckResponse voiceIdentityStartCheck(VoiceIdentityStartCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityStartCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>声纹开始注册</p>
     * 
     * @param request VoiceIdentityStartRegisterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceIdentityStartRegisterResponse
     */
    public VoiceIdentityStartRegisterResponse voiceIdentityStartRegisterWithOptions(VoiceIdentityStartRegisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceIdentityStartRegister"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/auth/start/register"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceIdentityStartRegisterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>声纹开始注册</p>
     * 
     * @param request VoiceIdentityStartRegisterRequest
     * @return VoiceIdentityStartRegisterResponse
     */
    public VoiceIdentityStartRegisterResponse voiceIdentityStartRegister(VoiceIdentityStartRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityStartRegisterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>声纹注销</p>
     * 
     * @param request VoiceIdentityUnregisterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceIdentityUnregisterResponse
     */
    public VoiceIdentityUnregisterResponse voiceIdentityUnregisterWithOptions(VoiceIdentityUnregisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceIdentityUnregister"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/auth/unregister"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceIdentityUnregisterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>声纹注销</p>
     * 
     * @param request VoiceIdentityUnregisterRequest
     * @return VoiceIdentityUnregisterResponse
     */
    public VoiceIdentityUnregisterResponse voiceIdentityUnregister(VoiceIdentityUnregisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceIdentityUnregisterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音同步检测</p>
     * 
     * @param request VoiceSyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceSyncScanResponse
     */
    public VoiceSyncScanResponse voiceSyncScanWithOptions(VoiceSyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceSyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/voice/syncscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceSyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>语音同步检测</p>
     * 
     * @param request VoiceSyncScanRequest
     * @return VoiceSyncScanResponse
     */
    public VoiceSyncScanResponse voiceSyncScan(VoiceSyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voiceSyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>站点异步检测</p>
     * 
     * @param request WebpageAsyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return WebpageAsyncScanResponse
     */
    public WebpageAsyncScanResponse webpageAsyncScanWithOptions(WebpageAsyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WebpageAsyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/webpage/asyncscan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WebpageAsyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>站点异步检测</p>
     * 
     * @param request WebpageAsyncScanRequest
     * @return WebpageAsyncScanResponse
     */
    public WebpageAsyncScanResponse webpageAsyncScan(WebpageAsyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.webpageAsyncScanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>站点异步检测结果</p>
     * 
     * @param request WebpageAsyncScanResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return WebpageAsyncScanResultsResponse
     */
    public WebpageAsyncScanResultsResponse webpageAsyncScanResultsWithOptions(WebpageAsyncScanResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WebpageAsyncScanResults"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/webpage/results"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WebpageAsyncScanResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>站点异步检测结果</p>
     * 
     * @param request WebpageAsyncScanResultsRequest
     * @return WebpageAsyncScanResultsResponse
     */
    public WebpageAsyncScanResultsResponse webpageAsyncScanResults(WebpageAsyncScanResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.webpageAsyncScanResultsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>站点同步检测</p>
     * 
     * @param request WebpageSyncScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return WebpageSyncScanResponse
     */
    public WebpageSyncScanResponse webpageSyncScanWithOptions(WebpageSyncScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WebpageSyncScan"),
            new TeaPair("version", "2018-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/green/webpage/scan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WebpageSyncScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>站点同步检测</p>
     * 
     * @param request WebpageSyncScanRequest
     * @return WebpageSyncScanResponse
     */
    public WebpageSyncScanResponse webpageSyncScan(WebpageSyncScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.webpageSyncScanWithOptions(request, headers, runtime);
    }
}
