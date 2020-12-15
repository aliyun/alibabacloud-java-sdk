// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101;

import com.aliyun.tea.*;
import com.aliyun.cdrs20201101.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cdrs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListPersonTrackResponse listPersonTrackWithOptions(ListPersonTrackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPersonTrack", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListPersonTrackResponse());
    }

    public ListPersonTrackResponse listPersonTrack(ListPersonTrackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonTrackWithOptions(request, runtime);
    }

    public ListDeviceDetailResponse listDeviceDetailWithOptions(ListDeviceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDeviceDetail", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListDeviceDetailResponse());
    }

    public ListDeviceDetailResponse listDeviceDetail(ListDeviceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceDetailWithOptions(request, runtime);
    }

    public ListCityMapRangeStatisticResponse listCityMapRangeStatisticWithOptions(ListCityMapRangeStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCityMapRangeStatistic", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCityMapRangeStatisticResponse());
    }

    public ListCityMapRangeStatisticResponse listCityMapRangeStatistic(ListCityMapRangeStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCityMapRangeStatisticWithOptions(request, runtime);
    }

    public ListPersonDetailsResponse listPersonDetailsWithOptions(ListPersonDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPersonDetails", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListPersonDetailsResponse());
    }

    public ListPersonDetailsResponse listPersonDetails(ListPersonDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonDetailsWithOptions(request, runtime);
    }

    public ListVehicleTrackResponse listVehicleTrackWithOptions(ListVehicleTrackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVehicleTrack", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListVehicleTrackResponse());
    }

    public ListVehicleTrackResponse listVehicleTrack(ListVehicleTrackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVehicleTrackWithOptions(request, runtime);
    }

    public ListDevicePersonStatisticsResponse listDevicePersonStatisticsWithOptions(ListDevicePersonStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDevicePersonStatistics", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListDevicePersonStatisticsResponse());
    }

    public ListDevicePersonStatisticsResponse listDevicePersonStatistics(ListDevicePersonStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDevicePersonStatisticsWithOptions(request, runtime);
    }

    public ListVehicleResultsResponse listVehicleResultsWithOptions(ListVehicleResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVehicleResults", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListVehicleResultsResponse());
    }

    public ListVehicleResultsResponse listVehicleResults(ListVehicleResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVehicleResultsWithOptions(request, runtime);
    }

    public ListPersonTopResponse listPersonTopWithOptions(ListPersonTopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPersonTop", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListPersonTopResponse());
    }

    public ListPersonTopResponse listPersonTop(ListPersonTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonTopWithOptions(request, runtime);
    }

    public ListStorageStatisticsResponse listStorageStatisticsWithOptions(ListStorageStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStorageStatistics", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListStorageStatisticsResponse());
    }

    public ListStorageStatisticsResponse listStorageStatistics(ListStorageStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStorageStatisticsWithOptions(request, runtime);
    }

    public ListVehicleTagDistributeResponse listVehicleTagDistributeWithOptions(ListVehicleTagDistributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVehicleTagDistribute", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListVehicleTagDistributeResponse());
    }

    public ListVehicleTagDistributeResponse listVehicleTagDistribute(ListVehicleTagDistributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVehicleTagDistributeWithOptions(request, runtime);
    }

    public ListCityMapAoisResponse listCityMapAoisWithOptions(ListCityMapAoisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCityMapAois", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCityMapAoisResponse());
    }

    public ListCityMapAoisResponse listCityMapAois(ListCityMapAoisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCityMapAoisWithOptions(request, runtime);
    }

    public ListDeviceGenderStatisticsResponse listDeviceGenderStatisticsWithOptions(ListDeviceGenderStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDeviceGenderStatistics", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListDeviceGenderStatisticsResponse());
    }

    public ListDeviceGenderStatisticsResponse listDeviceGenderStatistics(ListDeviceGenderStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceGenderStatisticsWithOptions(request, runtime);
    }

    public ListVehicleTopResponse listVehicleTopWithOptions(ListVehicleTopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVehicleTop", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListVehicleTopResponse());
    }

    public ListVehicleTopResponse listVehicleTop(ListVehicleTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVehicleTopWithOptions(request, runtime);
    }

    public ListStructureStatisticsResponse listStructureStatisticsWithOptions(ListStructureStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStructureStatistics", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListStructureStatisticsResponse());
    }

    public ListStructureStatisticsResponse listStructureStatistics(ListStructureStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStructureStatisticsWithOptions(request, runtime);
    }

    public ListPersonTagResponse listPersonTagWithOptions(ListPersonTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPersonTag", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListPersonTagResponse());
    }

    public ListPersonTagResponse listPersonTag(ListPersonTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonTagWithOptions(request, runtime);
    }

    public ListRangeDeviceResponse listRangeDeviceWithOptions(ListRangeDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListRangeDevice", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListRangeDeviceResponse());
    }

    public ListRangeDeviceResponse listRangeDevice(ListRangeDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRangeDeviceWithOptions(request, runtime);
    }

    public ListCityMapCameraResultsResponse listCityMapCameraResultsWithOptions(ListCityMapCameraResultsRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        ListCityMapCameraResultsShrinkRequest request = new ListCityMapCameraResultsShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.dataSourceIdList)) {
            request.dataSourceIdListShrink = com.aliyun.teautil.Common.toJSONString(tmp.dataSourceIdList);
        }

        return TeaModel.toModel(this.doRequest("ListCityMapCameraResults", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCityMapCameraResultsResponse());
    }

    public ListCityMapCameraResultsResponse listCityMapCameraResults(ListCityMapCameraResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCityMapCameraResultsWithOptions(request, runtime);
    }

    public ListCityMapCameraStatisticsResponse listCityMapCameraStatisticsWithOptions(ListCityMapCameraStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCityMapCameraStatistics", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCityMapCameraStatisticsResponse());
    }

    public ListCityMapCameraStatisticsResponse listCityMapCameraStatistics(ListCityMapCameraStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCityMapCameraStatisticsWithOptions(request, runtime);
    }

    public ListMapRouteDetailsResponse listMapRouteDetailsWithOptions(ListMapRouteDetailsRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        ListMapRouteDetailsShrinkRequest request = new ListMapRouteDetailsShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.routeList)) {
            request.routeListShrink = com.aliyun.teautil.Common.toJSONString(tmp.routeList);
        }

        return TeaModel.toModel(this.doRequest("ListMapRouteDetails", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListMapRouteDetailsResponse());
    }

    public ListMapRouteDetailsResponse listMapRouteDetails(ListMapRouteDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMapRouteDetailsWithOptions(request, runtime);
    }

    public ListDevicePersonResponse listDevicePersonWithOptions(ListDevicePersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDevicePerson", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListDevicePersonResponse());
    }

    public ListDevicePersonResponse listDevicePerson(ListDevicePersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDevicePersonWithOptions(request, runtime);
    }

    public ListDataStatisticsByDayResponse listDataStatisticsByDayWithOptions(ListDataStatisticsByDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataStatisticsByDay", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListDataStatisticsByDayResponse());
    }

    public ListDataStatisticsByDayResponse listDataStatisticsByDay(ListDataStatisticsByDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataStatisticsByDayWithOptions(request, runtime);
    }

    public ListVehicleDetailsResponse listVehicleDetailsWithOptions(ListVehicleDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVehicleDetails", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListVehicleDetailsResponse());
    }

    public ListVehicleDetailsResponse listVehicleDetails(ListVehicleDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVehicleDetailsWithOptions(request, runtime);
    }

    public ListDataStatisticsResponse listDataStatisticsWithOptions(ListDataStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataStatistics", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListDataStatisticsResponse());
    }

    public ListDataStatisticsResponse listDataStatistics(ListDataStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataStatisticsWithOptions(request, runtime);
    }

    public ListCityMapImageDetailsResponse listCityMapImageDetailsWithOptions(ListCityMapImageDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCityMapImageDetails", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCityMapImageDetailsResponse());
    }

    public ListCityMapImageDetailsResponse listCityMapImageDetails(ListCityMapImageDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCityMapImageDetailsWithOptions(request, runtime);
    }

    public ListPersonResultResponse listPersonResultWithOptions(ListPersonResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPersonResult", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListPersonResultResponse());
    }

    public ListPersonResultResponse listPersonResult(ListPersonResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonResultWithOptions(request, runtime);
    }

    public ListCityMapPersonFlowResponse listCityMapPersonFlowWithOptions(ListCityMapPersonFlowRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        ListCityMapPersonFlowShrinkRequest request = new ListCityMapPersonFlowShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.originDataSourceIdList)) {
            request.originDataSourceIdListShrink = com.aliyun.teautil.Common.toJSONString(tmp.originDataSourceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.targetDataSourceIdList)) {
            request.targetDataSourceIdListShrink = com.aliyun.teautil.Common.toJSONString(tmp.targetDataSourceIdList);
        }

        return TeaModel.toModel(this.doRequest("ListCityMapPersonFlow", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCityMapPersonFlowResponse());
    }

    public ListCityMapPersonFlowResponse listCityMapPersonFlow(ListCityMapPersonFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCityMapPersonFlowWithOptions(request, runtime);
    }

    public SearchObjectResponse searchObjectWithOptions(SearchObjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchObject", "HTTPS", "POST", "2020-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SearchObjectResponse());
    }

    public SearchObjectResponse searchObject(SearchObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchObjectWithOptions(request, runtime);
    }

    public RecognizeImageResponse recognizeImageWithOptions(RecognizeImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecognizeImage", "HTTPS", "POST", "2020-11-01", "AK,APP", null, TeaModel.buildMap(request), runtime), new RecognizeImageResponse());
    }

    public RecognizeImageResponse recognizeImage(RecognizeImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeImageWithOptions(request, runtime);
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
}
