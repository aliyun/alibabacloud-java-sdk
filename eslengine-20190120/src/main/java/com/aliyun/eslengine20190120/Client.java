// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eslengine20190120;

import com.aliyun.tea.*;
import com.aliyun.eslengine20190120.models.*;
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
        this._endpoint = this.getEndpoint("eslengine", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public SendOrderResponse sendOrderWithOptions(SendOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendOrder", "2019-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SendOrderResponse());
    }

    public SendOrderResponse sendOrder(SendOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendOrderWithOptions(request, runtime);
    }

    public SendCommandResponse sendCommandWithOptions(SendCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendCommand", "2019-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SendCommandResponse());
    }

    public SendCommandResponse sendCommand(SendCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCommandWithOptions(request, runtime);
    }

    public ActiveMboxDeviceResponse activeMboxDeviceWithOptions(ActiveMboxDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActiveMboxDevice", "2019-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ActiveMboxDeviceResponse());
    }

    public ActiveMboxDeviceResponse activeMboxDevice(ActiveMboxDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activeMboxDeviceWithOptions(request, runtime);
    }
}
