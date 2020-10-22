// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318;

import com.aliyun.tea.*;
import com.aliyun.efc_service20190318.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("efc-service", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public CheckAllMasterTrusteeshipResponse checkAllMasterTrusteeshipWithOptions(CheckAllMasterTrusteeshipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckAllMasterTrusteeship", "HTTPS", "POST", "2019-03-18", "AK", null, TeaModel.buildMap(request), runtime), new CheckAllMasterTrusteeshipResponse());
    }

    public CheckAllMasterTrusteeshipResponse checkAllMasterTrusteeship(CheckAllMasterTrusteeshipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAllMasterTrusteeshipWithOptions(request, runtime);
    }

    public QueryReservedInstanceSharedInfosResponse queryReservedInstanceSharedInfosWithOptions(QueryReservedInstanceSharedInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryReservedInstanceSharedInfos", "HTTPS", "GET", "2019-03-18", "AK", TeaModel.buildMap(request), null, runtime), new QueryReservedInstanceSharedInfosResponse());
    }

    public QueryReservedInstanceSharedInfosResponse queryReservedInstanceSharedInfos(QueryReservedInstanceSharedInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryReservedInstanceSharedInfosWithOptions(request, runtime);
    }

    public QueryRdTrusteeshiperResponse queryRdTrusteeshiperWithOptions(QueryRdTrusteeshiperRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRdTrusteeshiper", "HTTPS", "POST", "2019-03-18", "AK", null, TeaModel.buildMap(request), runtime), new QueryRdTrusteeshiperResponse());
    }

    public QueryRdTrusteeshiperResponse queryRdTrusteeshiper(QueryRdTrusteeshiperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRdTrusteeshiperWithOptions(request, runtime);
    }

    public CheckMasterTrusteeshipResponse checkMasterTrusteeshipWithOptions(CheckMasterTrusteeshipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckMasterTrusteeship", "HTTPS", "POST", "2019-03-18", "AK", null, TeaModel.buildMap(request), runtime), new CheckMasterTrusteeshipResponse());
    }

    public CheckMasterTrusteeshipResponse checkMasterTrusteeship(CheckMasterTrusteeshipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMasterTrusteeshipWithOptions(request, runtime);
    }

    public VerifyRdOperationResponse verifyRdOperationWithOptions(VerifyRdOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("VerifyRdOperation", "HTTPS", "POST", "2019-03-18", "AK", null, TeaModel.buildMap(request), runtime), new VerifyRdOperationResponse());
    }

    public VerifyRdOperationResponse verifyRdOperation(VerifyRdOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyRdOperationWithOptions(request, runtime);
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
