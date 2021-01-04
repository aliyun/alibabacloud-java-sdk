// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190403;

import com.aliyun.tea.*;
import com.aliyun.cloudauth_console20190403.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudauth-console", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public RetrieveFaceResponse retrieveFaceWithOptions(RetrieveFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RetrieveFace", "2019-04-03", "HTTPS", "POST", "AK", "json", req, runtime), new RetrieveFaceResponse());
    }

    public RetrieveFaceResponse retrieveFace(RetrieveFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retrieveFaceWithOptions(request, runtime);
    }

    public UploadIdentifyRecordResponse uploadIdentifyRecordWithOptions(UploadIdentifyRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadIdentifyRecord", "2019-04-03", "HTTPS", "POST", "AK", "json", req, runtime), new UploadIdentifyRecordResponse());
    }

    public UploadIdentifyRecordResponse uploadIdentifyRecord(UploadIdentifyRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadIdentifyRecordWithOptions(request, runtime);
    }
}
