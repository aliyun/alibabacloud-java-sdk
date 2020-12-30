// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711;

import com.aliyun.tea.*;
import com.aliyun.cloudphoto20170711.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudphoto", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActivatePhotosResponse activatePhotosWithOptions(ActivatePhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActivatePhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ActivatePhotosResponse());
    }

    public ActivatePhotosResponse activatePhotos(ActivatePhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activatePhotosWithOptions(request, runtime);
    }

    public AddAlbumPhotosResponse addAlbumPhotosWithOptions(AddAlbumPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAlbumPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new AddAlbumPhotosResponse());
    }

    public AddAlbumPhotosResponse addAlbumPhotos(AddAlbumPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAlbumPhotosWithOptions(request, runtime);
    }

    public CreateAlbumResponse createAlbumWithOptions(CreateAlbumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAlbum", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAlbumResponse());
    }

    public CreateAlbumResponse createAlbum(CreateAlbumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlbumWithOptions(request, runtime);
    }

    public CreatePhotoResponse createPhotoWithOptions(CreatePhotoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePhoto", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePhotoResponse());
    }

    public CreatePhotoResponse createPhoto(CreatePhotoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPhotoWithOptions(request, runtime);
    }

    public CreatePhotoStoreResponse createPhotoStoreWithOptions(CreatePhotoStoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePhotoStore", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePhotoStoreResponse());
    }

    public CreatePhotoStoreResponse createPhotoStore(CreatePhotoStoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPhotoStoreWithOptions(request, runtime);
    }

    public CreateTransactionResponse createTransactionWithOptions(CreateTransactionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTransaction", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTransactionResponse());
    }

    public CreateTransactionResponse createTransaction(CreateTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTransactionWithOptions(request, runtime);
    }

    public DeleteAlbumsResponse deleteAlbumsWithOptions(DeleteAlbumsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlbums", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlbumsResponse());
    }

    public DeleteAlbumsResponse deleteAlbums(DeleteAlbumsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlbumsWithOptions(request, runtime);
    }

    public DeleteEventResponse deleteEventWithOptions(DeleteEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEvent", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEventResponse());
    }

    public DeleteEventResponse deleteEvent(DeleteEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEventWithOptions(request, runtime);
    }

    public DeleteFacesResponse deleteFacesWithOptions(DeleteFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFaces", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFacesResponse());
    }

    public DeleteFacesResponse deleteFaces(DeleteFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFacesWithOptions(request, runtime);
    }

    public DeletePhotosResponse deletePhotosWithOptions(DeletePhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePhotosResponse());
    }

    public DeletePhotosResponse deletePhotos(DeletePhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePhotosWithOptions(request, runtime);
    }

    public DeletePhotoStoreResponse deletePhotoStoreWithOptions(DeletePhotoStoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePhotoStore", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePhotoStoreResponse());
    }

    public DeletePhotoStoreResponse deletePhotoStore(DeletePhotoStoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePhotoStoreWithOptions(request, runtime);
    }

    public EditPhotosResponse editPhotosWithOptions(EditPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new EditPhotosResponse());
    }

    public EditPhotosResponse editPhotos(EditPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editPhotosWithOptions(request, runtime);
    }

    public EditPhotoStoreResponse editPhotoStoreWithOptions(EditPhotoStoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditPhotoStore", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new EditPhotoStoreResponse());
    }

    public EditPhotoStoreResponse editPhotoStore(EditPhotoStoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editPhotoStoreWithOptions(request, runtime);
    }

    public FetchAlbumTagPhotosResponse fetchAlbumTagPhotosWithOptions(FetchAlbumTagPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FetchAlbumTagPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new FetchAlbumTagPhotosResponse());
    }

    public FetchAlbumTagPhotosResponse fetchAlbumTagPhotos(FetchAlbumTagPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fetchAlbumTagPhotosWithOptions(request, runtime);
    }

    public FetchLibrariesResponse fetchLibrariesWithOptions(FetchLibrariesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FetchLibraries", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new FetchLibrariesResponse());
    }

    public FetchLibrariesResponse fetchLibraries(FetchLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fetchLibrariesWithOptions(request, runtime);
    }

    public FetchMomentPhotosResponse fetchMomentPhotosWithOptions(FetchMomentPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FetchMomentPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new FetchMomentPhotosResponse());
    }

    public FetchMomentPhotosResponse fetchMomentPhotos(FetchMomentPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fetchMomentPhotosWithOptions(request, runtime);
    }

    public FetchPhotosResponse fetchPhotosWithOptions(FetchPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FetchPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new FetchPhotosResponse());
    }

    public FetchPhotosResponse fetchPhotos(FetchPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fetchPhotosWithOptions(request, runtime);
    }

    public GetAlbumsByNamesResponse getAlbumsByNamesWithOptions(GetAlbumsByNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAlbumsByNames", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetAlbumsByNamesResponse());
    }

    public GetAlbumsByNamesResponse getAlbumsByNames(GetAlbumsByNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlbumsByNamesWithOptions(request, runtime);
    }

    public GetDownloadUrlResponse getDownloadUrlWithOptions(GetDownloadUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDownloadUrl", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetDownloadUrlResponse());
    }

    public GetDownloadUrlResponse getDownloadUrl(GetDownloadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDownloadUrlWithOptions(request, runtime);
    }

    public GetDownloadUrlsResponse getDownloadUrlsWithOptions(GetDownloadUrlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDownloadUrls", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetDownloadUrlsResponse());
    }

    public GetDownloadUrlsResponse getDownloadUrls(GetDownloadUrlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDownloadUrlsWithOptions(request, runtime);
    }

    public GetFramedPhotoUrlsResponse getFramedPhotoUrlsWithOptions(GetFramedPhotoUrlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFramedPhotoUrls", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetFramedPhotoUrlsResponse());
    }

    public GetFramedPhotoUrlsResponse getFramedPhotoUrls(GetFramedPhotoUrlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFramedPhotoUrlsWithOptions(request, runtime);
    }

    public GetLibraryResponse getLibraryWithOptions(GetLibraryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLibrary", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetLibraryResponse());
    }

    public GetLibraryResponse getLibrary(GetLibraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLibraryWithOptions(request, runtime);
    }

    public GetPhotosResponse getPhotosWithOptions(GetPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetPhotosResponse());
    }

    public GetPhotosResponse getPhotos(GetPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPhotosWithOptions(request, runtime);
    }

    public GetPhotosByMd5sResponse getPhotosByMd5sWithOptions(GetPhotosByMd5sRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPhotosByMd5s", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetPhotosByMd5sResponse());
    }

    public GetPhotosByMd5sResponse getPhotosByMd5s(GetPhotosByMd5sRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPhotosByMd5sWithOptions(request, runtime);
    }

    public GetPhotoStoreResponse getPhotoStoreWithOptions(GetPhotoStoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPhotoStore", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetPhotoStoreResponse());
    }

    public GetPhotoStoreResponse getPhotoStore(GetPhotoStoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPhotoStoreWithOptions(request, runtime);
    }

    public GetPrivateAccessUrlsResponse getPrivateAccessUrlsWithOptions(GetPrivateAccessUrlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPrivateAccessUrls", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetPrivateAccessUrlsResponse());
    }

    public GetPrivateAccessUrlsResponse getPrivateAccessUrls(GetPrivateAccessUrlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPrivateAccessUrlsWithOptions(request, runtime);
    }

    public GetPublicAccessUrlsResponse getPublicAccessUrlsWithOptions(GetPublicAccessUrlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPublicAccessUrls", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetPublicAccessUrlsResponse());
    }

    public GetPublicAccessUrlsResponse getPublicAccessUrls(GetPublicAccessUrlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPublicAccessUrlsWithOptions(request, runtime);
    }

    public GetQuotaResponse getQuotaWithOptions(GetQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQuota", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetQuotaResponse());
    }

    public GetQuotaResponse getQuota(GetQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQuotaWithOptions(request, runtime);
    }

    public GetSimilarPhotosResponse getSimilarPhotosWithOptions(GetSimilarPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSimilarPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetSimilarPhotosResponse());
    }

    public GetSimilarPhotosResponse getSimilarPhotos(GetSimilarPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSimilarPhotosWithOptions(request, runtime);
    }

    public GetThumbnailResponse getThumbnailWithOptions(GetThumbnailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetThumbnail", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetThumbnailResponse());
    }

    public GetThumbnailResponse getThumbnail(GetThumbnailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThumbnailWithOptions(request, runtime);
    }

    public GetThumbnailsResponse getThumbnailsWithOptions(GetThumbnailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetThumbnails", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetThumbnailsResponse());
    }

    public GetThumbnailsResponse getThumbnails(GetThumbnailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThumbnailsWithOptions(request, runtime);
    }

    public GetVideoCoverResponse getVideoCoverWithOptions(GetVideoCoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoCover", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoCoverResponse());
    }

    public GetVideoCoverResponse getVideoCover(GetVideoCoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoCoverWithOptions(request, runtime);
    }

    public InactivatePhotosResponse inactivatePhotosWithOptions(InactivatePhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InactivatePhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new InactivatePhotosResponse());
    }

    public InactivatePhotosResponse inactivatePhotos(InactivatePhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.inactivatePhotosWithOptions(request, runtime);
    }

    public LikePhotoResponse likePhotoWithOptions(LikePhotoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LikePhoto", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new LikePhotoResponse());
    }

    public LikePhotoResponse likePhoto(LikePhotoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.likePhotoWithOptions(request, runtime);
    }

    public ListAlbumPhotosResponse listAlbumPhotosWithOptions(ListAlbumPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAlbumPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListAlbumPhotosResponse());
    }

    public ListAlbumPhotosResponse listAlbumPhotos(ListAlbumPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlbumPhotosWithOptions(request, runtime);
    }

    public ListAlbumsResponse listAlbumsWithOptions(ListAlbumsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAlbums", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListAlbumsResponse());
    }

    public ListAlbumsResponse listAlbums(ListAlbumsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlbumsWithOptions(request, runtime);
    }

    public ListFacePhotosResponse listFacePhotosWithOptions(ListFacePhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFacePhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListFacePhotosResponse());
    }

    public ListFacePhotosResponse listFacePhotos(ListFacePhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFacePhotosWithOptions(request, runtime);
    }

    public ListFacesResponse listFacesWithOptions(ListFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFaces", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListFacesResponse());
    }

    public ListFacesResponse listFaces(ListFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFacesWithOptions(request, runtime);
    }

    public ListMomentPhotosResponse listMomentPhotosWithOptions(ListMomentPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMomentPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListMomentPhotosResponse());
    }

    public ListMomentPhotosResponse listMomentPhotos(ListMomentPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMomentPhotosWithOptions(request, runtime);
    }

    public ListMomentsResponse listMomentsWithOptions(ListMomentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMoments", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListMomentsResponse());
    }

    public ListMomentsResponse listMoments(ListMomentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMomentsWithOptions(request, runtime);
    }

    public ListPhotoFacesResponse listPhotoFacesWithOptions(ListPhotoFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPhotoFaces", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListPhotoFacesResponse());
    }

    public ListPhotoFacesResponse listPhotoFaces(ListPhotoFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhotoFacesWithOptions(request, runtime);
    }

    public ListPhotosResponse listPhotosWithOptions(ListPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListPhotosResponse());
    }

    public ListPhotosResponse listPhotos(ListPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhotosWithOptions(request, runtime);
    }

    public ListPhotoStoresResponse listPhotoStoresWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListPhotoStores", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListPhotoStoresResponse());
    }

    public ListPhotoStoresResponse listPhotoStores() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhotoStoresWithOptions(runtime);
    }

    public ListPhotoTagsResponse listPhotoTagsWithOptions(ListPhotoTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPhotoTags", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListPhotoTagsResponse());
    }

    public ListPhotoTagsResponse listPhotoTags(ListPhotoTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhotoTagsWithOptions(request, runtime);
    }

    public ListRegisteredTagsResponse listRegisteredTagsWithOptions(ListRegisteredTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRegisteredTags", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListRegisteredTagsResponse());
    }

    public ListRegisteredTagsResponse listRegisteredTags(ListRegisteredTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRegisteredTagsWithOptions(request, runtime);
    }

    public ListTagPhotosResponse listTagPhotosWithOptions(ListTagPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagPhotosResponse());
    }

    public ListTagPhotosResponse listTagPhotos(ListTagPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagPhotosWithOptions(request, runtime);
    }

    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTags", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagsResponse());
    }

    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    public ListTimeLinePhotosResponse listTimeLinePhotosWithOptions(ListTimeLinePhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTimeLinePhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListTimeLinePhotosResponse());
    }

    public ListTimeLinePhotosResponse listTimeLinePhotos(ListTimeLinePhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTimeLinePhotosWithOptions(request, runtime);
    }

    public ListTimeLinesResponse listTimeLinesWithOptions(ListTimeLinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTimeLines", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListTimeLinesResponse());
    }

    public ListTimeLinesResponse listTimeLines(ListTimeLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTimeLinesWithOptions(request, runtime);
    }

    public MergeFacesResponse mergeFacesWithOptions(MergeFacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MergeFaces", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new MergeFacesResponse());
    }

    public MergeFacesResponse mergeFaces(MergeFacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mergeFacesWithOptions(request, runtime);
    }

    public MoveAlbumPhotosResponse moveAlbumPhotosWithOptions(MoveAlbumPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveAlbumPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new MoveAlbumPhotosResponse());
    }

    public MoveAlbumPhotosResponse moveAlbumPhotos(MoveAlbumPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveAlbumPhotosWithOptions(request, runtime);
    }

    public MoveFacePhotosResponse moveFacePhotosWithOptions(MoveFacePhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveFacePhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new MoveFacePhotosResponse());
    }

    public MoveFacePhotosResponse moveFacePhotos(MoveFacePhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveFacePhotosWithOptions(request, runtime);
    }

    public ReactivatePhotosResponse reactivatePhotosWithOptions(ReactivatePhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReactivatePhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ReactivatePhotosResponse());
    }

    public ReactivatePhotosResponse reactivatePhotos(ReactivatePhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reactivatePhotosWithOptions(request, runtime);
    }

    public RegisterPhotoResponse registerPhotoWithOptions(RegisterPhotoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterPhoto", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterPhotoResponse());
    }

    public RegisterPhotoResponse registerPhoto(RegisterPhotoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerPhotoWithOptions(request, runtime);
    }

    public RegisterTagResponse registerTagWithOptions(RegisterTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterTag", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterTagResponse());
    }

    public RegisterTagResponse registerTag(RegisterTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerTagWithOptions(request, runtime);
    }

    public RemoveAlbumPhotosResponse removeAlbumPhotosWithOptions(RemoveAlbumPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveAlbumPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveAlbumPhotosResponse());
    }

    public RemoveAlbumPhotosResponse removeAlbumPhotos(RemoveAlbumPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeAlbumPhotosWithOptions(request, runtime);
    }

    public RemoveFacePhotosResponse removeFacePhotosWithOptions(RemoveFacePhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveFacePhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveFacePhotosResponse());
    }

    public RemoveFacePhotosResponse removeFacePhotos(RemoveFacePhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeFacePhotosWithOptions(request, runtime);
    }

    public RenameAlbumResponse renameAlbumWithOptions(RenameAlbumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenameAlbum", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new RenameAlbumResponse());
    }

    public RenameAlbumResponse renameAlbum(RenameAlbumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renameAlbumWithOptions(request, runtime);
    }

    public RenameFaceResponse renameFaceWithOptions(RenameFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenameFace", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new RenameFaceResponse());
    }

    public RenameFaceResponse renameFace(RenameFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renameFaceWithOptions(request, runtime);
    }

    public SearchPhotosResponse searchPhotosWithOptions(SearchPhotosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchPhotos", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new SearchPhotosResponse());
    }

    public SearchPhotosResponse searchPhotos(SearchPhotosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchPhotosWithOptions(request, runtime);
    }

    public SetAlbumCoverResponse setAlbumCoverWithOptions(SetAlbumCoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAlbumCover", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new SetAlbumCoverResponse());
    }

    public SetAlbumCoverResponse setAlbumCover(SetAlbumCoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAlbumCoverWithOptions(request, runtime);
    }

    public SetFaceCoverResponse setFaceCoverWithOptions(SetFaceCoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetFaceCover", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new SetFaceCoverResponse());
    }

    public SetFaceCoverResponse setFaceCover(SetFaceCoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setFaceCoverWithOptions(request, runtime);
    }

    public SetMeResponse setMeWithOptions(SetMeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetMe", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new SetMeResponse());
    }

    public SetMeResponse setMe(SetMeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setMeWithOptions(request, runtime);
    }

    public SetQuotaResponse setQuotaWithOptions(SetQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetQuota", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new SetQuotaResponse());
    }

    public SetQuotaResponse setQuota(SetQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setQuotaWithOptions(request, runtime);
    }

    public TagPhotoResponse tagPhotoWithOptions(TagPhotoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagPhoto", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new TagPhotoResponse());
    }

    public TagPhotoResponse tagPhoto(TagPhotoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagPhotoWithOptions(request, runtime);
    }

    public ToggleFeaturesResponse toggleFeaturesWithOptions(ToggleFeaturesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ToggleFeatures", "2017-07-11", "HTTPS", "POST", "AK", "json", req, runtime), new ToggleFeaturesResponse());
    }

    public ToggleFeaturesResponse toggleFeatures(ToggleFeaturesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.toggleFeaturesWithOptions(request, runtime);
    }
}
