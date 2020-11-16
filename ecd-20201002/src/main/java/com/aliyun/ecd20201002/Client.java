// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002;

import com.aliyun.tea.*;
import com.aliyun.ecd20201002.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ecd", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public RefreshLoginTokenResponse refreshLoginTokenWithOptions(RefreshLoginTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshLoginToken", "HTTPS", "POST", "2020-10-02", "Anonymous", null, TeaModel.buildMap(request), runtime), new RefreshLoginTokenResponse());
    }

    public RefreshLoginTokenResponse refreshLoginToken(RefreshLoginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshLoginTokenWithOptions(request, runtime);
    }

    public DescribeDirectoriesResponse describeDirectoriesWithOptions(DescribeDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDirectories", "HTTPS", "POST", "2020-10-02", "Anonymous", null, TeaModel.buildMap(request), runtime), new DescribeDirectoriesResponse());
    }

    public DescribeDirectoriesResponse describeDirectories(DescribeDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirectoriesWithOptions(request, runtime);
    }

    public DescribeDesktopsResponse describeDesktopsWithOptions(DescribeDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDesktops", "HTTPS", "POST", "2020-10-02", "Anonymous", null, TeaModel.buildMap(request), runtime), new DescribeDesktopsResponse());
    }

    public DescribeDesktopsResponse describeDesktops(DescribeDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopsWithOptions(request, runtime);
    }

    public RebootDesktopsResponse rebootDesktopsWithOptions(RebootDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RebootDesktops", "HTTPS", "POST", "2020-10-02", "Anonymous", null, TeaModel.buildMap(request), runtime), new RebootDesktopsResponse());
    }

    public RebootDesktopsResponse rebootDesktops(RebootDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootDesktopsWithOptions(request, runtime);
    }

    public GetConnectionTicketResponse getConnectionTicketWithOptions(GetConnectionTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetConnectionTicket", "HTTPS", "POST", "2020-10-02", "Anonymous", null, TeaModel.buildMap(request), runtime), new GetConnectionTicketResponse());
    }

    public GetConnectionTicketResponse getConnectionTicket(GetConnectionTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectionTicketWithOptions(request, runtime);
    }

    public GetLoginTokenResponse getLoginTokenWithOptions(GetLoginTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetLoginToken", "HTTPS", "POST", "2020-10-02", "Anonymous", null, TeaModel.buildMap(request), runtime), new GetLoginTokenResponse());
    }

    public GetLoginTokenResponse getLoginToken(GetLoginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginTokenWithOptions(request, runtime);
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
