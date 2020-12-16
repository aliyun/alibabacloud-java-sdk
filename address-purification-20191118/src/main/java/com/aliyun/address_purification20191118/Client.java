// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118;

import com.aliyun.tea.*;
import com.aliyun.address_purification20191118.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("address-purification", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetAddressGeocodeResponse getAddressGeocodeWithOptions(GetAddressGeocodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAddressGeocode", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new GetAddressGeocodeResponse());
    }

    public GetAddressGeocodeResponse getAddressGeocode(GetAddressGeocodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAddressGeocodeWithOptions(request, runtime);
    }

    public CompleteAddressResponse completeAddressWithOptions(CompleteAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CompleteAddress", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new CompleteAddressResponse());
    }

    public CompleteAddressResponse completeAddress(CompleteAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeAddressWithOptions(request, runtime);
    }

    public GetZipcodeResponse getZipcodeWithOptions(GetZipcodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetZipcode", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new GetZipcodeResponse());
    }

    public GetZipcodeResponse getZipcode(GetZipcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getZipcodeWithOptions(request, runtime);
    }

    public ExtractPhoneResponse extractPhoneWithOptions(ExtractPhoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExtractPhone", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new ExtractPhoneResponse());
    }

    public ExtractPhoneResponse extractPhone(ExtractPhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.extractPhoneWithOptions(request, runtime);
    }

    public ExtractNameResponse extractNameWithOptions(ExtractNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExtractName", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new ExtractNameResponse());
    }

    public ExtractNameResponse extractName(ExtractNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.extractNameWithOptions(request, runtime);
    }

    public GetAddressDivisionCodeResponse getAddressDivisionCodeWithOptions(GetAddressDivisionCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAddressDivisionCode", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new GetAddressDivisionCodeResponse());
    }

    public GetAddressDivisionCodeResponse getAddressDivisionCode(GetAddressDivisionCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAddressDivisionCodeWithOptions(request, runtime);
    }

    public ClassifyPOIResponse classifyPOIWithOptions(ClassifyPOIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ClassifyPOI", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new ClassifyPOIResponse());
    }

    public ClassifyPOIResponse classifyPOI(ClassifyPOIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.classifyPOIWithOptions(request, runtime);
    }

    public StructureAddressResponse structureAddressWithOptions(StructureAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StructureAddress", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new StructureAddressResponse());
    }

    public StructureAddressResponse structureAddress(StructureAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.structureAddressWithOptions(request, runtime);
    }

    public ExtractAddressResponse extractAddressWithOptions(ExtractAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExtractAddress", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new ExtractAddressResponse());
    }

    public ExtractAddressResponse extractAddress(ExtractAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.extractAddressWithOptions(request, runtime);
    }

    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        UpdateProjectShrinkRequest request = new UpdateProjectShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.parameters)) {
            request.parametersShrink = com.aliyun.teautil.Common.toJSONString(tmp.parameters);
        }

        return TeaModel.toModel(this.doRequest("UpdateProject", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateProjectResponse());
    }

    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }

    public CorrectAddressResponse correctAddressWithOptions(CorrectAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CorrectAddress", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new CorrectAddressResponse());
    }

    public CorrectAddressResponse correctAddress(CorrectAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.correctAddressWithOptions(request, runtime);
    }

    public GetAddressSimilarityResponse getAddressSimilarityWithOptions(GetAddressSimilarityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAddressSimilarity", "HTTPS", "POST", "2019-11-18", "AK", null, TeaModel.buildMap(request), runtime), new GetAddressSimilarityResponse());
    }

    public GetAddressSimilarityResponse getAddressSimilarity(GetAddressSimilarityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAddressSimilarityWithOptions(request, runtime);
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
