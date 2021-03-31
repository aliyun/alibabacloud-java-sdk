// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324;

import com.aliyun.tea.*;
import com.aliyun.gts_dayu20210324.models.*;
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
        this._endpoint = this.getEndpoint("gts-dayu", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetPartnerInfoByDingOrgIdResponse getPartnerInfoByDingOrgIdWithOptions(GetPartnerInfoByDingOrgIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPartnerInfoByDingOrgId", "2021-03-24", "HTTPS", "GET", "AK", "json", req, runtime), new GetPartnerInfoByDingOrgIdResponse());
    }

    public GetPartnerInfoByDingOrgIdResponse getPartnerInfoByDingOrgId(GetPartnerInfoByDingOrgIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPartnerInfoByDingOrgIdWithOptions(request, runtime);
    }

    public CreateByAccountResponse createByAccountWithOptions(CreateByAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateByAccount", "2021-03-24", "HTTPS", "GET", "AK", "json", req, runtime), new CreateByAccountResponse());
    }

    public CreateByAccountResponse createByAccount(CreateByAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createByAccountWithOptions(request, runtime);
    }

    public QueryPersonInfoResponse queryPersonInfoWithOptions(QueryPersonInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPersonInfo", "2021-03-24", "HTTPS", "GET", "AK", "json", req, runtime), new QueryPersonInfoResponse());
    }

    public QueryPersonInfoResponse queryPersonInfo(QueryPersonInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPersonInfoWithOptions(request, runtime);
    }
}
