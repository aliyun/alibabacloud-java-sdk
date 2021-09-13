// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930;

import com.aliyun.tea.*;
import com.aliyun.assettech20190930.models.*;
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
        this._endpoint = this.getEndpoint("assettech", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetIssueSymbolRoutingPolicyResponse getIssueSymbolRoutingPolicyWithOptions(GetIssueSymbolRoutingPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIssueSymbolRoutingPolicy", "2019-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetIssueSymbolRoutingPolicyResponse());
    }

    public GetIssueSymbolRoutingPolicyResponse getIssueSymbolRoutingPolicy(GetIssueSymbolRoutingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIssueSymbolRoutingPolicyWithOptions(request, runtime);
    }

    public ListIssueSymbolRoutingPolicyResponse listIssueSymbolRoutingPolicyWithOptions(ListIssueSymbolRoutingPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIssueSymbolRoutingPolicy", "2019-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListIssueSymbolRoutingPolicyResponse());
    }

    public ListIssueSymbolRoutingPolicyResponse listIssueSymbolRoutingPolicy(ListIssueSymbolRoutingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIssueSymbolRoutingPolicyWithOptions(request, runtime);
    }

    public CreateIssueSymbolRoutingPolicyResponse createIssueSymbolRoutingPolicyWithOptions(CreateIssueSymbolRoutingPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIssueSymbolRoutingPolicy", "2019-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIssueSymbolRoutingPolicyResponse());
    }

    public CreateIssueSymbolRoutingPolicyResponse createIssueSymbolRoutingPolicy(CreateIssueSymbolRoutingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIssueSymbolRoutingPolicyWithOptions(request, runtime);
    }

    public UpdateIssueSymbolRoutingPolicyResponse updateIssueSymbolRoutingPolicyWithOptions(UpdateIssueSymbolRoutingPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIssueSymbolRoutingPolicy", "2019-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIssueSymbolRoutingPolicyResponse());
    }

    public UpdateIssueSymbolRoutingPolicyResponse updateIssueSymbolRoutingPolicy(UpdateIssueSymbolRoutingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIssueSymbolRoutingPolicyWithOptions(request, runtime);
    }

    public DeleteIssueSymbolRoutingPolicyResponse deleteIssueSymbolRoutingPolicyWithOptions(DeleteIssueSymbolRoutingPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIssueSymbolRoutingPolicy", "2019-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIssueSymbolRoutingPolicyResponse());
    }

    public DeleteIssueSymbolRoutingPolicyResponse deleteIssueSymbolRoutingPolicy(DeleteIssueSymbolRoutingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIssueSymbolRoutingPolicyWithOptions(request, runtime);
    }
}
