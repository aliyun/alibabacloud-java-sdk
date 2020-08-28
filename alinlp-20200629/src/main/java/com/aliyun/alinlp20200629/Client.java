// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629;

import com.aliyun.tea.*;
import com.aliyun.alinlp20200629.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alinlp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetNerChMedicalResponse getNerChMedicalWithOptions(GetNerChMedicalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNerChMedical", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetNerChMedicalResponse());
    }

    public GetNerChMedicalResponse getNerChMedical(GetNerChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerChMedicalWithOptions(request, runtime);
    }

    public GetNerCustomizedChEcomResponse getNerCustomizedChEcomWithOptions(GetNerCustomizedChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNerCustomizedChEcom", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetNerCustomizedChEcomResponse());
    }

    public GetNerCustomizedChEcomResponse getNerCustomizedChEcom(GetNerCustomizedChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerCustomizedChEcomWithOptions(request, runtime);
    }

    public GetWsCustomizedChGeneralResponse getWsCustomizedChGeneralWithOptions(GetWsCustomizedChGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWsCustomizedChGeneral", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetWsCustomizedChGeneralResponse());
    }

    public GetWsCustomizedChGeneralResponse getWsCustomizedChGeneral(GetWsCustomizedChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChGeneralWithOptions(request, runtime);
    }

    public GetSummaryChEcomResponse getSummaryChEcomWithOptions(GetSummaryChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSummaryChEcom", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetSummaryChEcomResponse());
    }

    public GetSummaryChEcomResponse getSummaryChEcom(GetSummaryChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSummaryChEcomWithOptions(request, runtime);
    }

    public GetDpChEcomResponse getDpChEcomWithOptions(GetDpChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDpChEcom", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetDpChEcomResponse());
    }

    public GetDpChEcomResponse getDpChEcom(GetDpChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDpChEcomWithOptions(request, runtime);
    }

    public GetWsCustomizedSeaGeneralResponse getWsCustomizedSeaGeneralWithOptions(GetWsCustomizedSeaGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWsCustomizedSeaGeneral", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetWsCustomizedSeaGeneralResponse());
    }

    public GetWsCustomizedSeaGeneralResponse getWsCustomizedSeaGeneral(GetWsCustomizedSeaGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedSeaGeneralWithOptions(request, runtime);
    }

    public GetWeChEcomResponse getWeChEcomWithOptions(GetWeChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWeChEcom", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetWeChEcomResponse());
    }

    public GetWeChEcomResponse getWeChEcom(GetWeChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChEcomWithOptions(request, runtime);
    }

    public GetTsChEcomResponse getTsChEcomWithOptions(GetTsChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTsChEcom", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetTsChEcomResponse());
    }

    public GetTsChEcomResponse getTsChEcom(GetTsChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTsChEcomWithOptions(request, runtime);
    }

    public GetEcChGeneralResponse getEcChGeneralWithOptions(GetEcChGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEcChGeneral", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetEcChGeneralResponse());
    }

    public GetEcChGeneralResponse getEcChGeneral(GetEcChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEcChGeneralWithOptions(request, runtime);
    }

    public GetPosChEcomResponse getPosChEcomWithOptions(GetPosChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPosChEcom", "HTTPS", "POST", "2020-06-29", "AK", null, TeaModel.buildMap(request), runtime), new GetPosChEcomResponse());
    }

    public GetPosChEcomResponse getPosChEcom(GetPosChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPosChEcomWithOptions(request, runtime);
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
