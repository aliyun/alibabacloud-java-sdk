// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120;

import com.aliyun.tea.*;
import com.aliyun.iot20180120.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "iot.aliyuncs.com"),
            new TeaPair("ap-south-1", "iot.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "iot.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "iot.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-chengdu", "iot.aliyuncs.com"),
            new TeaPair("cn-edge-1", "iot.aliyuncs.com"),
            new TeaPair("cn-fujian", "iot.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "iot.aliyuncs.com"),
            new TeaPair("cn-hongkong", "iot.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "iot.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "iot.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "iot.aliyuncs.com"),
            new TeaPair("cn-qingdao", "iot.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-wuhan", "iot.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "iot.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "iot.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "iot.aliyuncs.com"),
            new TeaPair("eu-west-1", "iot.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "iot.aliyuncs.com"),
            new TeaPair("me-east-1", "iot.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "iot.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("iot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BatchAddDeviceGroupRelationsResponse batchAddDeviceGroupRelationsWithOptions(BatchAddDeviceGroupRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchAddDeviceGroupRelations", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchAddDeviceGroupRelationsResponse());
    }

    public BatchAddDeviceGroupRelationsResponse batchAddDeviceGroupRelations(BatchAddDeviceGroupRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddDeviceGroupRelationsWithOptions(request, runtime);
    }

    public BatchAddThingTopoResponse batchAddThingTopoWithOptions(BatchAddThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchAddThingTopo", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchAddThingTopoResponse());
    }

    public BatchAddThingTopoResponse batchAddThingTopo(BatchAddThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddThingTopoWithOptions(request, runtime);
    }

    public BatchBindDevicesIntoProjectResponse batchBindDevicesIntoProjectWithOptions(BatchBindDevicesIntoProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchBindDevicesIntoProject", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchBindDevicesIntoProjectResponse());
    }

    public BatchBindDevicesIntoProjectResponse batchBindDevicesIntoProject(BatchBindDevicesIntoProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindDevicesIntoProjectWithOptions(request, runtime);
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponse batchBindDeviceToEdgeInstanceWithDriverWithOptions(BatchBindDeviceToEdgeInstanceWithDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchBindDeviceToEdgeInstanceWithDriver", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchBindDeviceToEdgeInstanceWithDriverResponse());
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponse batchBindDeviceToEdgeInstanceWithDriver(BatchBindDeviceToEdgeInstanceWithDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindDeviceToEdgeInstanceWithDriverWithOptions(request, runtime);
    }

    public BatchBindProductsIntoProjectResponse batchBindProductsIntoProjectWithOptions(BatchBindProductsIntoProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchBindProductsIntoProject", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchBindProductsIntoProjectResponse());
    }

    public BatchBindProductsIntoProjectResponse batchBindProductsIntoProject(BatchBindProductsIntoProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindProductsIntoProjectWithOptions(request, runtime);
    }

    public BatchCheckDeviceNamesResponse batchCheckDeviceNamesWithOptions(BatchCheckDeviceNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchCheckDeviceNames", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchCheckDeviceNamesResponse());
    }

    public BatchCheckDeviceNamesResponse batchCheckDeviceNames(BatchCheckDeviceNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchCheckDeviceNamesWithOptions(request, runtime);
    }

    public BatchClearEdgeInstanceDeviceConfigResponse batchClearEdgeInstanceDeviceConfigWithOptions(BatchClearEdgeInstanceDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchClearEdgeInstanceDeviceConfig", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchClearEdgeInstanceDeviceConfigResponse());
    }

    public BatchClearEdgeInstanceDeviceConfigResponse batchClearEdgeInstanceDeviceConfig(BatchClearEdgeInstanceDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchClearEdgeInstanceDeviceConfigWithOptions(request, runtime);
    }

    public BatchDeleteDeviceGroupRelationsResponse batchDeleteDeviceGroupRelationsWithOptions(BatchDeleteDeviceGroupRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteDeviceGroupRelations", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteDeviceGroupRelationsResponse());
    }

    public BatchDeleteDeviceGroupRelationsResponse batchDeleteDeviceGroupRelations(BatchDeleteDeviceGroupRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteDeviceGroupRelationsWithOptions(request, runtime);
    }

    public BatchDeleteEdgeInstanceChannelResponse batchDeleteEdgeInstanceChannelWithOptions(BatchDeleteEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteEdgeInstanceChannel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteEdgeInstanceChannelResponse());
    }

    public BatchDeleteEdgeInstanceChannelResponse batchDeleteEdgeInstanceChannel(BatchDeleteEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteEdgeInstanceChannelWithOptions(request, runtime);
    }

    public BatchGetDeviceBindStatusResponse batchGetDeviceBindStatusWithOptions(BatchGetDeviceBindStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetDeviceBindStatus", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetDeviceBindStatusResponse());
    }

    public BatchGetDeviceBindStatusResponse batchGetDeviceBindStatus(BatchGetDeviceBindStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetDeviceBindStatusWithOptions(request, runtime);
    }

    public BatchGetDeviceStateResponse batchGetDeviceStateWithOptions(BatchGetDeviceStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetDeviceState", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetDeviceStateResponse());
    }

    public BatchGetDeviceStateResponse batchGetDeviceState(BatchGetDeviceStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetDeviceStateWithOptions(request, runtime);
    }

    public BatchGetEdgeDriverResponse batchGetEdgeDriverWithOptions(BatchGetEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetEdgeDriver", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetEdgeDriverResponse());
    }

    public BatchGetEdgeDriverResponse batchGetEdgeDriver(BatchGetEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeDriverWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceChannelResponse batchGetEdgeInstanceChannelWithOptions(BatchGetEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetEdgeInstanceChannel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetEdgeInstanceChannelResponse());
    }

    public BatchGetEdgeInstanceChannelResponse batchGetEdgeInstanceChannel(BatchGetEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceChannelWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDeviceChannelResponse batchGetEdgeInstanceDeviceChannelWithOptions(BatchGetEdgeInstanceDeviceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetEdgeInstanceDeviceChannel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetEdgeInstanceDeviceChannelResponse());
    }

    public BatchGetEdgeInstanceDeviceChannelResponse batchGetEdgeInstanceDeviceChannel(BatchGetEdgeInstanceDeviceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDeviceChannelWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDeviceConfigResponse batchGetEdgeInstanceDeviceConfigWithOptions(BatchGetEdgeInstanceDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetEdgeInstanceDeviceConfig", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetEdgeInstanceDeviceConfigResponse());
    }

    public BatchGetEdgeInstanceDeviceConfigResponse batchGetEdgeInstanceDeviceConfig(BatchGetEdgeInstanceDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDeviceConfigWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDeviceDriverResponse batchGetEdgeInstanceDeviceDriverWithOptions(BatchGetEdgeInstanceDeviceDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetEdgeInstanceDeviceDriver", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetEdgeInstanceDeviceDriverResponse());
    }

    public BatchGetEdgeInstanceDeviceDriverResponse batchGetEdgeInstanceDeviceDriver(BatchGetEdgeInstanceDeviceDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDeviceDriverWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDriverConfigsResponse batchGetEdgeInstanceDriverConfigsWithOptions(BatchGetEdgeInstanceDriverConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetEdgeInstanceDriverConfigs", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetEdgeInstanceDriverConfigsResponse());
    }

    public BatchGetEdgeInstanceDriverConfigsResponse batchGetEdgeInstanceDriverConfigs(BatchGetEdgeInstanceDriverConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDriverConfigsWithOptions(request, runtime);
    }

    public BatchPubResponse batchPubWithOptions(BatchPubRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchPub", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchPubResponse());
    }

    public BatchPubResponse batchPub(BatchPubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchPubWithOptions(request, runtime);
    }

    public BatchQueryDeviceDetailResponse batchQueryDeviceDetailWithOptions(BatchQueryDeviceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchQueryDeviceDetail", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchQueryDeviceDetailResponse());
    }

    public BatchQueryDeviceDetailResponse batchQueryDeviceDetail(BatchQueryDeviceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchQueryDeviceDetailWithOptions(request, runtime);
    }

    public BatchRegisterDeviceResponse batchRegisterDeviceWithOptions(BatchRegisterDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchRegisterDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchRegisterDeviceResponse());
    }

    public BatchRegisterDeviceResponse batchRegisterDevice(BatchRegisterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRegisterDeviceWithOptions(request, runtime);
    }

    public BatchRegisterDeviceWithApplyIdResponse batchRegisterDeviceWithApplyIdWithOptions(BatchRegisterDeviceWithApplyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchRegisterDeviceWithApplyId", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchRegisterDeviceWithApplyIdResponse());
    }

    public BatchRegisterDeviceWithApplyIdResponse batchRegisterDeviceWithApplyId(BatchRegisterDeviceWithApplyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRegisterDeviceWithApplyIdWithOptions(request, runtime);
    }

    public BatchSetEdgeInstanceDeviceChannelResponse batchSetEdgeInstanceDeviceChannelWithOptions(BatchSetEdgeInstanceDeviceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetEdgeInstanceDeviceChannel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetEdgeInstanceDeviceChannelResponse());
    }

    public BatchSetEdgeInstanceDeviceChannelResponse batchSetEdgeInstanceDeviceChannel(BatchSetEdgeInstanceDeviceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetEdgeInstanceDeviceChannelWithOptions(request, runtime);
    }

    public BatchSetEdgeInstanceDeviceConfigResponse batchSetEdgeInstanceDeviceConfigWithOptions(BatchSetEdgeInstanceDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetEdgeInstanceDeviceConfig", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetEdgeInstanceDeviceConfigResponse());
    }

    public BatchSetEdgeInstanceDeviceConfigResponse batchSetEdgeInstanceDeviceConfig(BatchSetEdgeInstanceDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetEdgeInstanceDeviceConfigWithOptions(request, runtime);
    }

    public BatchUnbindDeviceFromEdgeInstanceResponse batchUnbindDeviceFromEdgeInstanceWithOptions(BatchUnbindDeviceFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUnbindDeviceFromEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUnbindDeviceFromEdgeInstanceResponse());
    }

    public BatchUnbindDeviceFromEdgeInstanceResponse batchUnbindDeviceFromEdgeInstance(BatchUnbindDeviceFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindDeviceFromEdgeInstanceWithOptions(request, runtime);
    }

    public BatchUnbindProjectDevicesResponse batchUnbindProjectDevicesWithOptions(BatchUnbindProjectDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUnbindProjectDevices", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUnbindProjectDevicesResponse());
    }

    public BatchUnbindProjectDevicesResponse batchUnbindProjectDevices(BatchUnbindProjectDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindProjectDevicesWithOptions(request, runtime);
    }

    public BatchUnbindProjectProductsResponse batchUnbindProjectProductsWithOptions(BatchUnbindProjectProductsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUnbindProjectProducts", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUnbindProjectProductsResponse());
    }

    public BatchUnbindProjectProductsResponse batchUnbindProjectProducts(BatchUnbindProjectProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindProjectProductsWithOptions(request, runtime);
    }

    public BatchUpdateDeviceNicknameResponse batchUpdateDeviceNicknameWithOptions(BatchUpdateDeviceNicknameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUpdateDeviceNickname", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUpdateDeviceNicknameResponse());
    }

    public BatchUpdateDeviceNicknameResponse batchUpdateDeviceNickname(BatchUpdateDeviceNicknameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUpdateDeviceNicknameWithOptions(request, runtime);
    }

    public BindApplicationToEdgeInstanceResponse bindApplicationToEdgeInstanceWithOptions(BindApplicationToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindApplicationToEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BindApplicationToEdgeInstanceResponse());
    }

    public BindApplicationToEdgeInstanceResponse bindApplicationToEdgeInstance(BindApplicationToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindApplicationToEdgeInstanceWithOptions(request, runtime);
    }

    public BindDriverToEdgeInstanceResponse bindDriverToEdgeInstanceWithOptions(BindDriverToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindDriverToEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BindDriverToEdgeInstanceResponse());
    }

    public BindDriverToEdgeInstanceResponse bindDriverToEdgeInstance(BindDriverToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindDriverToEdgeInstanceWithOptions(request, runtime);
    }

    public BindGatewayToEdgeInstanceResponse bindGatewayToEdgeInstanceWithOptions(BindGatewayToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindGatewayToEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BindGatewayToEdgeInstanceResponse());
    }

    public BindGatewayToEdgeInstanceResponse bindGatewayToEdgeInstance(BindGatewayToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindGatewayToEdgeInstanceWithOptions(request, runtime);
    }

    public BindRoleToEdgeInstanceResponse bindRoleToEdgeInstanceWithOptions(BindRoleToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindRoleToEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BindRoleToEdgeInstanceResponse());
    }

    public BindRoleToEdgeInstanceResponse bindRoleToEdgeInstance(BindRoleToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindRoleToEdgeInstanceWithOptions(request, runtime);
    }

    public BindSceneRuleToEdgeInstanceResponse bindSceneRuleToEdgeInstanceWithOptions(BindSceneRuleToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindSceneRuleToEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new BindSceneRuleToEdgeInstanceResponse());
    }

    public BindSceneRuleToEdgeInstanceResponse bindSceneRuleToEdgeInstance(BindSceneRuleToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindSceneRuleToEdgeInstanceWithOptions(request, runtime);
    }

    public CancelJobResponse cancelJobWithOptions(CancelJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CancelJobResponse());
    }

    public CancelJobResponse cancelJob(CancelJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelJobWithOptions(request, runtime);
    }

    public CancelOTAStrategyByJobResponse cancelOTAStrategyByJobWithOptions(CancelOTAStrategyByJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelOTAStrategyByJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CancelOTAStrategyByJobResponse());
    }

    public CancelOTAStrategyByJobResponse cancelOTAStrategyByJob(CancelOTAStrategyByJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOTAStrategyByJobWithOptions(request, runtime);
    }

    public CancelOTATaskByDeviceResponse cancelOTATaskByDeviceWithOptions(CancelOTATaskByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelOTATaskByDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CancelOTATaskByDeviceResponse());
    }

    public CancelOTATaskByDeviceResponse cancelOTATaskByDevice(CancelOTATaskByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOTATaskByDeviceWithOptions(request, runtime);
    }

    public CancelOTATaskByJobResponse cancelOTATaskByJobWithOptions(CancelOTATaskByJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelOTATaskByJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CancelOTATaskByJobResponse());
    }

    public CancelOTATaskByJobResponse cancelOTATaskByJob(CancelOTATaskByJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOTATaskByJobWithOptions(request, runtime);
    }

    public CancelReleaseProductResponse cancelReleaseProductWithOptions(CancelReleaseProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelReleaseProduct", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CancelReleaseProductResponse());
    }

    public CancelReleaseProductResponse cancelReleaseProduct(CancelReleaseProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelReleaseProductWithOptions(request, runtime);
    }

    public ClearEdgeInstanceDriverConfigsResponse clearEdgeInstanceDriverConfigsWithOptions(ClearEdgeInstanceDriverConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClearEdgeInstanceDriverConfigs", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ClearEdgeInstanceDriverConfigsResponse());
    }

    public ClearEdgeInstanceDriverConfigsResponse clearEdgeInstanceDriverConfigs(ClearEdgeInstanceDriverConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearEdgeInstanceDriverConfigsWithOptions(request, runtime);
    }

    public CloseEdgeInstanceDeploymentResponse closeEdgeInstanceDeploymentWithOptions(CloseEdgeInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseEdgeInstanceDeployment", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CloseEdgeInstanceDeploymentResponse());
    }

    public CloseEdgeInstanceDeploymentResponse closeEdgeInstanceDeployment(CloseEdgeInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeEdgeInstanceDeploymentWithOptions(request, runtime);
    }

    public CopyThingModelResponse copyThingModelWithOptions(CopyThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyThingModel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CopyThingModelResponse());
    }

    public CopyThingModelResponse copyThingModel(CopyThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyThingModelWithOptions(request, runtime);
    }

    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConsumerGroup", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConsumerGroupResponse());
    }

    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    public CreateConsumerGroupSubscribeRelationResponse createConsumerGroupSubscribeRelationWithOptions(CreateConsumerGroupSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConsumerGroupSubscribeRelation", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConsumerGroupSubscribeRelationResponse());
    }

    public CreateConsumerGroupSubscribeRelationResponse createConsumerGroupSubscribeRelation(CreateConsumerGroupSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupSubscribeRelationWithOptions(request, runtime);
    }

    public CreateDataAPIServiceResponse createDataAPIServiceWithOptions(CreateDataAPIServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataAPIService", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDataAPIServiceResponse());
    }

    public CreateDataAPIServiceResponse createDataAPIService(CreateDataAPIServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataAPIServiceWithOptions(request, runtime);
    }

    public CreateDeviceDistributeJobResponse createDeviceDistributeJobWithOptions(CreateDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeviceDistributeJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceDistributeJobResponse());
    }

    public CreateDeviceDistributeJobResponse createDeviceDistributeJob(CreateDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceDistributeJobWithOptions(request, runtime);
    }

    public CreateDeviceGroupResponse createDeviceGroupWithOptions(CreateDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeviceGroup", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceGroupResponse());
    }

    public CreateDeviceGroupResponse createDeviceGroup(CreateDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceGroupWithOptions(request, runtime);
    }

    public CreateEdgeDriverResponse createEdgeDriverWithOptions(CreateEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEdgeDriver", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEdgeDriverResponse());
    }

    public CreateEdgeDriverResponse createEdgeDriver(CreateEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeDriverWithOptions(request, runtime);
    }

    public CreateEdgeDriverVersionResponse createEdgeDriverVersionWithOptions(CreateEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEdgeDriverVersion", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEdgeDriverVersionResponse());
    }

    public CreateEdgeDriverVersionResponse createEdgeDriverVersion(CreateEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeDriverVersionWithOptions(request, runtime);
    }

    public CreateEdgeInstanceResponse createEdgeInstanceWithOptions(CreateEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEdgeInstanceResponse());
    }

    public CreateEdgeInstanceResponse createEdgeInstance(CreateEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceWithOptions(request, runtime);
    }

    public CreateEdgeInstanceChannelResponse createEdgeInstanceChannelWithOptions(CreateEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEdgeInstanceChannel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEdgeInstanceChannelResponse());
    }

    public CreateEdgeInstanceChannelResponse createEdgeInstanceChannel(CreateEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceChannelWithOptions(request, runtime);
    }

    public CreateEdgeInstanceDeploymentResponse createEdgeInstanceDeploymentWithOptions(CreateEdgeInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEdgeInstanceDeployment", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEdgeInstanceDeploymentResponse());
    }

    public CreateEdgeInstanceDeploymentResponse createEdgeInstanceDeployment(CreateEdgeInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceDeploymentWithOptions(request, runtime);
    }

    public CreateEdgeInstanceMessageRoutingResponse createEdgeInstanceMessageRoutingWithOptions(CreateEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEdgeInstanceMessageRouting", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEdgeInstanceMessageRoutingResponse());
    }

    public CreateEdgeInstanceMessageRoutingResponse createEdgeInstanceMessageRouting(CreateEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public CreateEdgeOssPreSignedAddressResponse createEdgeOssPreSignedAddressWithOptions(CreateEdgeOssPreSignedAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEdgeOssPreSignedAddress", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEdgeOssPreSignedAddressResponse());
    }

    public CreateEdgeOssPreSignedAddressResponse createEdgeOssPreSignedAddress(CreateEdgeOssPreSignedAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeOssPreSignedAddressWithOptions(request, runtime);
    }

    public CreateJobResponse createJobWithOptions(CreateJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateJobResponse());
    }

    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createJobWithOptions(request, runtime);
    }

    public CreateLoRaNodesTaskResponse createLoRaNodesTaskWithOptions(CreateLoRaNodesTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoRaNodesTask", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoRaNodesTaskResponse());
    }

    public CreateLoRaNodesTaskResponse createLoRaNodesTask(CreateLoRaNodesTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoRaNodesTaskWithOptions(request, runtime);
    }

    public CreateOTADynamicUpgradeJobResponse createOTADynamicUpgradeJobWithOptions(CreateOTADynamicUpgradeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOTADynamicUpgradeJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOTADynamicUpgradeJobResponse());
    }

    public CreateOTADynamicUpgradeJobResponse createOTADynamicUpgradeJob(CreateOTADynamicUpgradeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTADynamicUpgradeJobWithOptions(request, runtime);
    }

    public CreateOTAFirmwareResponse createOTAFirmwareWithOptions(CreateOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOTAFirmware", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOTAFirmwareResponse());
    }

    public CreateOTAFirmwareResponse createOTAFirmware(CreateOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAFirmwareWithOptions(request, runtime);
    }

    public CreateOTAModuleResponse createOTAModuleWithOptions(CreateOTAModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOTAModule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOTAModuleResponse());
    }

    public CreateOTAModuleResponse createOTAModule(CreateOTAModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAModuleWithOptions(request, runtime);
    }

    public CreateOTAStaticUpgradeJobResponse createOTAStaticUpgradeJobWithOptions(CreateOTAStaticUpgradeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOTAStaticUpgradeJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOTAStaticUpgradeJobResponse());
    }

    public CreateOTAStaticUpgradeJobResponse createOTAStaticUpgradeJob(CreateOTAStaticUpgradeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAStaticUpgradeJobWithOptions(request, runtime);
    }

    public CreateOTAVerifyJobResponse createOTAVerifyJobWithOptions(CreateOTAVerifyJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOTAVerifyJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOTAVerifyJobResponse());
    }

    public CreateOTAVerifyJobResponse createOTAVerifyJob(CreateOTAVerifyJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAVerifyJobWithOptions(request, runtime);
    }

    public CreateProductResponse createProductWithOptions(CreateProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProduct", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProductResponse());
    }

    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
    }

    public CreateProductDistributeJobResponse createProductDistributeJobWithOptions(CreateProductDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProductDistributeJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProductDistributeJobResponse());
    }

    public CreateProductDistributeJobResponse createProductDistributeJob(CreateProductDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductDistributeJobWithOptions(request, runtime);
    }

    public CreateProductTagsResponse createProductTagsWithOptions(CreateProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProductTags", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProductTagsResponse());
    }

    public CreateProductTagsResponse createProductTags(CreateProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductTagsWithOptions(request, runtime);
    }

    public CreateProductTopicResponse createProductTopicWithOptions(CreateProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProductTopic", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProductTopicResponse());
    }

    public CreateProductTopicResponse createProductTopic(CreateProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductTopicWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateRuleActionResponse createRuleActionWithOptions(CreateRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRuleAction", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRuleActionResponse());
    }

    public CreateRuleActionResponse createRuleAction(CreateRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleActionWithOptions(request, runtime);
    }

    public CreateRulengDistributeJobResponse createRulengDistributeJobWithOptions(CreateRulengDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRulengDistributeJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRulengDistributeJobResponse());
    }

    public CreateRulengDistributeJobResponse createRulengDistributeJob(CreateRulengDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRulengDistributeJobWithOptions(request, runtime);
    }

    public CreateSceneRuleResponse createSceneRuleWithOptions(CreateSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSceneRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSceneRuleResponse());
    }

    public CreateSceneRuleResponse createSceneRule(CreateSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSceneRuleWithOptions(request, runtime);
    }

    public CreateSpeechResponse createSpeechWithOptions(CreateSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSpeech", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSpeechResponse());
    }

    public CreateSpeechResponse createSpeech(CreateSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSpeechWithOptions(request, runtime);
    }

    public CreateStudioAppDomainOpenResponse createStudioAppDomainOpenWithOptions(CreateStudioAppDomainOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateStudioAppDomainOpen", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateStudioAppDomainOpenResponse());
    }

    public CreateStudioAppDomainOpenResponse createStudioAppDomainOpen(CreateStudioAppDomainOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStudioAppDomainOpenWithOptions(request, runtime);
    }

    public CreateSubscribeRelationResponse createSubscribeRelationWithOptions(CreateSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSubscribeRelation", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSubscribeRelationResponse());
    }

    public CreateSubscribeRelationResponse createSubscribeRelation(CreateSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubscribeRelationWithOptions(request, runtime);
    }

    public CreateThingModelResponse createThingModelWithOptions(CreateThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateThingModel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateThingModelResponse());
    }

    public CreateThingModelResponse createThingModel(CreateThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createThingModelWithOptions(request, runtime);
    }

    public CreateThingScriptResponse createThingScriptWithOptions(CreateThingScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateThingScript", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateThingScriptResponse());
    }

    public CreateThingScriptResponse createThingScript(CreateThingScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createThingScriptWithOptions(request, runtime);
    }

    public CreateTopicRouteTableResponse createTopicRouteTableWithOptions(CreateTopicRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTopicRouteTable", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTopicRouteTableResponse());
    }

    public CreateTopicRouteTableResponse createTopicRouteTable(CreateTopicRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTopicRouteTableWithOptions(request, runtime);
    }

    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConsumerGroup", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConsumerGroupResponse());
    }

    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    public DeleteConsumerGroupSubscribeRelationResponse deleteConsumerGroupSubscribeRelationWithOptions(DeleteConsumerGroupSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConsumerGroupSubscribeRelation", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConsumerGroupSubscribeRelationResponse());
    }

    public DeleteConsumerGroupSubscribeRelationResponse deleteConsumerGroupSubscribeRelation(DeleteConsumerGroupSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupSubscribeRelationWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    public DeleteDeviceDistributeJobResponse deleteDeviceDistributeJobWithOptions(DeleteDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeviceDistributeJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceDistributeJobResponse());
    }

    public DeleteDeviceDistributeJobResponse deleteDeviceDistributeJob(DeleteDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceDistributeJobWithOptions(request, runtime);
    }

    public DeleteDeviceFileResponse deleteDeviceFileWithOptions(DeleteDeviceFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeviceFile", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceFileResponse());
    }

    public DeleteDeviceFileResponse deleteDeviceFile(DeleteDeviceFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceFileWithOptions(request, runtime);
    }

    public DeleteDeviceGroupResponse deleteDeviceGroupWithOptions(DeleteDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeviceGroup", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceGroupResponse());
    }

    public DeleteDeviceGroupResponse deleteDeviceGroup(DeleteDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceGroupWithOptions(request, runtime);
    }

    public DeleteDevicePropResponse deleteDevicePropWithOptions(DeleteDevicePropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeviceProp", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDevicePropResponse());
    }

    public DeleteDevicePropResponse deleteDeviceProp(DeleteDevicePropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevicePropWithOptions(request, runtime);
    }

    public DeleteEdgeDriverResponse deleteEdgeDriverWithOptions(DeleteEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEdgeDriver", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEdgeDriverResponse());
    }

    public DeleteEdgeDriverResponse deleteEdgeDriver(DeleteEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeDriverWithOptions(request, runtime);
    }

    public DeleteEdgeDriverVersionResponse deleteEdgeDriverVersionWithOptions(DeleteEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEdgeDriverVersion", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEdgeDriverVersionResponse());
    }

    public DeleteEdgeDriverVersionResponse deleteEdgeDriverVersion(DeleteEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeDriverVersionWithOptions(request, runtime);
    }

    public DeleteEdgeInstanceResponse deleteEdgeInstanceWithOptions(DeleteEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEdgeInstanceResponse());
    }

    public DeleteEdgeInstanceResponse deleteEdgeInstance(DeleteEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeInstanceWithOptions(request, runtime);
    }

    public DeleteEdgeInstanceMessageRoutingResponse deleteEdgeInstanceMessageRoutingWithOptions(DeleteEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEdgeInstanceMessageRouting", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEdgeInstanceMessageRoutingResponse());
    }

    public DeleteEdgeInstanceMessageRoutingResponse deleteEdgeInstanceMessageRouting(DeleteEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public DeleteJobResponse deleteJobWithOptions(DeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteJobResponse());
    }

    public DeleteJobResponse deleteJob(DeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteJobWithOptions(request, runtime);
    }

    public DeleteOTAFirmwareResponse deleteOTAFirmwareWithOptions(DeleteOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOTAFirmware", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteOTAFirmwareResponse());
    }

    public DeleteOTAFirmwareResponse deleteOTAFirmware(DeleteOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOTAFirmwareWithOptions(request, runtime);
    }

    public DeleteOTAModuleResponse deleteOTAModuleWithOptions(DeleteOTAModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOTAModule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteOTAModuleResponse());
    }

    public DeleteOTAModuleResponse deleteOTAModule(DeleteOTAModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOTAModuleWithOptions(request, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProduct", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProductResponse());
    }

    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    public DeleteProductTagsResponse deleteProductTagsWithOptions(DeleteProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProductTags", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProductTagsResponse());
    }

    public DeleteProductTagsResponse deleteProductTags(DeleteProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductTagsWithOptions(request, runtime);
    }

    public DeleteProductTopicResponse deleteProductTopicWithOptions(DeleteProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProductTopic", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProductTopicResponse());
    }

    public DeleteProductTopicResponse deleteProductTopic(DeleteProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductTopicWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DeleteRuleActionResponse deleteRuleActionWithOptions(DeleteRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRuleAction", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRuleActionResponse());
    }

    public DeleteRuleActionResponse deleteRuleAction(DeleteRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleActionWithOptions(request, runtime);
    }

    public DeleteSceneRuleResponse deleteSceneRuleWithOptions(DeleteSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSceneRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSceneRuleResponse());
    }

    public DeleteSceneRuleResponse deleteSceneRule(DeleteSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSceneRuleWithOptions(request, runtime);
    }

    public DeleteSpeechResponse deleteSpeechWithOptions(DeleteSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSpeech", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSpeechResponse());
    }

    public DeleteSpeechResponse deleteSpeech(DeleteSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpeechWithOptions(request, runtime);
    }

    public DeleteStudioAppDomainOpenResponse deleteStudioAppDomainOpenWithOptions(DeleteStudioAppDomainOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteStudioAppDomainOpen", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteStudioAppDomainOpenResponse());
    }

    public DeleteStudioAppDomainOpenResponse deleteStudioAppDomainOpen(DeleteStudioAppDomainOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStudioAppDomainOpenWithOptions(request, runtime);
    }

    public DeleteSubscribeRelationResponse deleteSubscribeRelationWithOptions(DeleteSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSubscribeRelation", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSubscribeRelationResponse());
    }

    public DeleteSubscribeRelationResponse deleteSubscribeRelation(DeleteSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubscribeRelationWithOptions(request, runtime);
    }

    public DeleteThingModelResponse deleteThingModelWithOptions(DeleteThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteThingModel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteThingModelResponse());
    }

    public DeleteThingModelResponse deleteThingModel(DeleteThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteThingModelWithOptions(request, runtime);
    }

    public DeleteTopicRouteTableResponse deleteTopicRouteTableWithOptions(DeleteTopicRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTopicRouteTable", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTopicRouteTableResponse());
    }

    public DeleteTopicRouteTableResponse deleteTopicRouteTable(DeleteTopicRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTopicRouteTableWithOptions(request, runtime);
    }

    public DisableDeviceTunnelResponse disableDeviceTunnelWithOptions(DisableDeviceTunnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableDeviceTunnel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DisableDeviceTunnelResponse());
    }

    public DisableDeviceTunnelResponse disableDeviceTunnel(DisableDeviceTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDeviceTunnelWithOptions(request, runtime);
    }

    public DisableDeviceTunnelShareResponse disableDeviceTunnelShareWithOptions(DisableDeviceTunnelShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableDeviceTunnelShare", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DisableDeviceTunnelShareResponse());
    }

    public DisableDeviceTunnelShareResponse disableDeviceTunnelShare(DisableDeviceTunnelShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDeviceTunnelShareWithOptions(request, runtime);
    }

    public DisableSceneRuleResponse disableSceneRuleWithOptions(DisableSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableSceneRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DisableSceneRuleResponse());
    }

    public DisableSceneRuleResponse disableSceneRule(DisableSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSceneRuleWithOptions(request, runtime);
    }

    public DisableThingResponse disableThingWithOptions(DisableThingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableThing", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DisableThingResponse());
    }

    public DisableThingResponse disableThing(DisableThingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableThingWithOptions(request, runtime);
    }

    public EnableDeviceTunnelResponse enableDeviceTunnelWithOptions(EnableDeviceTunnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableDeviceTunnel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new EnableDeviceTunnelResponse());
    }

    public EnableDeviceTunnelResponse enableDeviceTunnel(EnableDeviceTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDeviceTunnelWithOptions(request, runtime);
    }

    public EnableDeviceTunnelShareResponse enableDeviceTunnelShareWithOptions(EnableDeviceTunnelShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableDeviceTunnelShare", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new EnableDeviceTunnelShareResponse());
    }

    public EnableDeviceTunnelShareResponse enableDeviceTunnelShare(EnableDeviceTunnelShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDeviceTunnelShareWithOptions(request, runtime);
    }

    public EnableSceneRuleResponse enableSceneRuleWithOptions(EnableSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableSceneRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSceneRuleResponse());
    }

    public EnableSceneRuleResponse enableSceneRule(EnableSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSceneRuleWithOptions(request, runtime);
    }

    public EnableThingResponse enableThingWithOptions(EnableThingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableThing", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new EnableThingResponse());
    }

    public EnableThingResponse enableThing(EnableThingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableThingWithOptions(request, runtime);
    }

    public GenerateDeviceNameListURLResponse generateDeviceNameListURLWithOptions(GenerateDeviceNameListURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateDeviceNameListURL", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateDeviceNameListURLResponse());
    }

    public GenerateDeviceNameListURLResponse generateDeviceNameListURL(GenerateDeviceNameListURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateDeviceNameListURLWithOptions(request, runtime);
    }

    public GenerateFileUploadURLResponse generateFileUploadURLWithOptions(GenerateFileUploadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateFileUploadURL", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateFileUploadURLResponse());
    }

    public GenerateFileUploadURLResponse generateFileUploadURL(GenerateFileUploadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateFileUploadURLWithOptions(request, runtime);
    }

    public GenerateOTAUploadURLResponse generateOTAUploadURLWithOptions(GenerateOTAUploadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateOTAUploadURL", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateOTAUploadURLResponse());
    }

    public GenerateOTAUploadURLResponse generateOTAUploadURL(GenerateOTAUploadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateOTAUploadURLWithOptions(request, runtime);
    }

    public GetDataAPIServiceDetailResponse getDataAPIServiceDetailWithOptions(GetDataAPIServiceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDataAPIServiceDetail", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetDataAPIServiceDetailResponse());
    }

    public GetDataAPIServiceDetailResponse getDataAPIServiceDetail(GetDataAPIServiceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataAPIServiceDetailWithOptions(request, runtime);
    }

    public GetDeviceShadowResponse getDeviceShadowWithOptions(GetDeviceShadowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceShadow", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceShadowResponse());
    }

    public GetDeviceShadowResponse getDeviceShadow(GetDeviceShadowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceShadowWithOptions(request, runtime);
    }

    public GetDeviceStatusResponse getDeviceStatusWithOptions(GetDeviceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceStatus", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceStatusResponse());
    }

    public GetDeviceStatusResponse getDeviceStatus(GetDeviceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceStatusWithOptions(request, runtime);
    }

    public GetDeviceTunnelShareStatusResponse getDeviceTunnelShareStatusWithOptions(GetDeviceTunnelShareStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceTunnelShareStatus", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceTunnelShareStatusResponse());
    }

    public GetDeviceTunnelShareStatusResponse getDeviceTunnelShareStatus(GetDeviceTunnelShareStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceTunnelShareStatusWithOptions(request, runtime);
    }

    public GetDeviceTunnelStatusResponse getDeviceTunnelStatusWithOptions(GetDeviceTunnelStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceTunnelStatus", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceTunnelStatusResponse());
    }

    public GetDeviceTunnelStatusResponse getDeviceTunnelStatus(GetDeviceTunnelStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceTunnelStatusWithOptions(request, runtime);
    }

    public GetEdgeDriverVersionResponse getEdgeDriverVersionWithOptions(GetEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEdgeDriverVersion", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetEdgeDriverVersionResponse());
    }

    public GetEdgeDriverVersionResponse getEdgeDriverVersion(GetEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeDriverVersionWithOptions(request, runtime);
    }

    public GetEdgeInstanceResponse getEdgeInstanceWithOptions(GetEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetEdgeInstanceResponse());
    }

    public GetEdgeInstanceResponse getEdgeInstance(GetEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeInstanceWithOptions(request, runtime);
    }

    public GetEdgeInstanceDeploymentResponse getEdgeInstanceDeploymentWithOptions(GetEdgeInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEdgeInstanceDeployment", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetEdgeInstanceDeploymentResponse());
    }

    public GetEdgeInstanceDeploymentResponse getEdgeInstanceDeployment(GetEdgeInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeInstanceDeploymentWithOptions(request, runtime);
    }

    public GetEdgeInstanceMessageRoutingResponse getEdgeInstanceMessageRoutingWithOptions(GetEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEdgeInstanceMessageRouting", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetEdgeInstanceMessageRoutingResponse());
    }

    public GetEdgeInstanceMessageRoutingResponse getEdgeInstanceMessageRouting(GetEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public GetGatewayBySubDeviceResponse getGatewayBySubDeviceWithOptions(GetGatewayBySubDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGatewayBySubDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetGatewayBySubDeviceResponse());
    }

    public GetGatewayBySubDeviceResponse getGatewayBySubDevice(GetGatewayBySubDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayBySubDeviceWithOptions(request, runtime);
    }

    public GetLoraNodesTaskResponse getLoraNodesTaskWithOptions(GetLoraNodesTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLoraNodesTask", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLoraNodesTaskResponse());
    }

    public GetLoraNodesTaskResponse getLoraNodesTask(GetLoraNodesTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoraNodesTaskWithOptions(request, runtime);
    }

    public GetNodesAddingTaskResponse getNodesAddingTaskWithOptions(GetNodesAddingTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNodesAddingTask", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetNodesAddingTaskResponse());
    }

    public GetNodesAddingTaskResponse getNodesAddingTask(GetNodesAddingTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNodesAddingTaskWithOptions(request, runtime);
    }

    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetRuleResponse());
    }

    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    public GetRuleActionResponse getRuleActionWithOptions(GetRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRuleAction", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetRuleActionResponse());
    }

    public GetRuleActionResponse getRuleAction(GetRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleActionWithOptions(request, runtime);
    }

    public GetSceneRuleResponse getSceneRuleWithOptions(GetSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSceneRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetSceneRuleResponse());
    }

    public GetSceneRuleResponse getSceneRule(GetSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSceneRuleWithOptions(request, runtime);
    }

    public GetSpeechVoiceResponse getSpeechVoiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetSpeechVoice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetSpeechVoiceResponse());
    }

    public GetSpeechVoiceResponse getSpeechVoice() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpeechVoiceWithOptions(runtime);
    }

    public GetStudioAppTokenOpenResponse getStudioAppTokenOpenWithOptions(GetStudioAppTokenOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetStudioAppTokenOpen", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetStudioAppTokenOpenResponse());
    }

    public GetStudioAppTokenOpenResponse getStudioAppTokenOpen(GetStudioAppTokenOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStudioAppTokenOpenWithOptions(request, runtime);
    }

    public GetThingModelTslResponse getThingModelTslWithOptions(GetThingModelTslRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetThingModelTsl", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetThingModelTslResponse());
    }

    public GetThingModelTslResponse getThingModelTsl(GetThingModelTslRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingModelTslWithOptions(request, runtime);
    }

    public GetThingModelTslPublishedResponse getThingModelTslPublishedWithOptions(GetThingModelTslPublishedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetThingModelTslPublished", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetThingModelTslPublishedResponse());
    }

    public GetThingModelTslPublishedResponse getThingModelTslPublished(GetThingModelTslPublishedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingModelTslPublishedWithOptions(request, runtime);
    }

    public GetThingScriptResponse getThingScriptWithOptions(GetThingScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetThingScript", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetThingScriptResponse());
    }

    public GetThingScriptResponse getThingScript(GetThingScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingScriptWithOptions(request, runtime);
    }

    public GetThingTemplateResponse getThingTemplateWithOptions(GetThingTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetThingTemplate", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetThingTemplateResponse());
    }

    public GetThingTemplateResponse getThingTemplate(GetThingTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingTemplateWithOptions(request, runtime);
    }

    public GetThingTopoResponse getThingTopoWithOptions(GetThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetThingTopo", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetThingTopoResponse());
    }

    public GetThingTopoResponse getThingTopo(GetThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingTopoWithOptions(request, runtime);
    }

    public ImportThingModelTslResponse importThingModelTslWithOptions(ImportThingModelTslRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportThingModelTsl", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ImportThingModelTslResponse());
    }

    public ImportThingModelTslResponse importThingModelTsl(ImportThingModelTslRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importThingModelTslWithOptions(request, runtime);
    }

    public InvokeDataAPIServiceResponse invokeDataAPIServiceWithOptions(InvokeDataAPIServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeDataAPIService", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new InvokeDataAPIServiceResponse());
    }

    public InvokeDataAPIServiceResponse invokeDataAPIService(InvokeDataAPIServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeDataAPIServiceWithOptions(request, runtime);
    }

    public InvokeThingServiceResponse invokeThingServiceWithOptions(InvokeThingServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeThingService", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new InvokeThingServiceResponse());
    }

    public InvokeThingServiceResponse invokeThingService(InvokeThingServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeThingServiceWithOptions(request, runtime);
    }

    public InvokeThingsServiceResponse invokeThingsServiceWithOptions(InvokeThingsServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeThingsService", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new InvokeThingsServiceResponse());
    }

    public InvokeThingsServiceResponse invokeThingsService(InvokeThingsServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeThingsServiceWithOptions(request, runtime);
    }

    public ListAnalyticsDataResponse listAnalyticsDataWithOptions(ListAnalyticsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAnalyticsData", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAnalyticsDataResponse());
    }

    public ListAnalyticsDataResponse listAnalyticsData(ListAnalyticsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnalyticsDataWithOptions(request, runtime);
    }

    public ListDeviceDistributeJobResponse listDeviceDistributeJobWithOptions(ListDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceDistributeJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListDeviceDistributeJobResponse());
    }

    public ListDeviceDistributeJobResponse listDeviceDistributeJob(ListDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceDistributeJobWithOptions(request, runtime);
    }

    public ListDistributedDeviceResponse listDistributedDeviceWithOptions(ListDistributedDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDistributedDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListDistributedDeviceResponse());
    }

    public ListDistributedDeviceResponse listDistributedDevice(ListDistributedDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDistributedDeviceWithOptions(request, runtime);
    }

    public ListDistributedProductResponse listDistributedProductWithOptions(ListDistributedProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDistributedProduct", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListDistributedProductResponse());
    }

    public ListDistributedProductResponse listDistributedProduct(ListDistributedProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDistributedProductWithOptions(request, runtime);
    }

    public ListJobResponse listJobWithOptions(ListJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobResponse());
    }

    public ListJobResponse listJob(ListJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobWithOptions(request, runtime);
    }

    public ListOTAFirmwareResponse listOTAFirmwareWithOptions(ListOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOTAFirmware", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListOTAFirmwareResponse());
    }

    public ListOTAFirmwareResponse listOTAFirmware(ListOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAFirmwareWithOptions(request, runtime);
    }

    public ListOTAJobByDeviceResponse listOTAJobByDeviceWithOptions(ListOTAJobByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOTAJobByDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListOTAJobByDeviceResponse());
    }

    public ListOTAJobByDeviceResponse listOTAJobByDevice(ListOTAJobByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAJobByDeviceWithOptions(request, runtime);
    }

    public ListOTAJobByFirmwareResponse listOTAJobByFirmwareWithOptions(ListOTAJobByFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOTAJobByFirmware", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListOTAJobByFirmwareResponse());
    }

    public ListOTAJobByFirmwareResponse listOTAJobByFirmware(ListOTAJobByFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAJobByFirmwareWithOptions(request, runtime);
    }

    public ListOTAModuleByProductResponse listOTAModuleByProductWithOptions(ListOTAModuleByProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOTAModuleByProduct", "2018-01-20", "HTTPS", "GET", "AK", "json", req, runtime), new ListOTAModuleByProductResponse());
    }

    public ListOTAModuleByProductResponse listOTAModuleByProduct(ListOTAModuleByProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAModuleByProductWithOptions(request, runtime);
    }

    public ListOTAModuleVersionsByDeviceResponse listOTAModuleVersionsByDeviceWithOptions(ListOTAModuleVersionsByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOTAModuleVersionsByDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListOTAModuleVersionsByDeviceResponse());
    }

    public ListOTAModuleVersionsByDeviceResponse listOTAModuleVersionsByDevice(ListOTAModuleVersionsByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAModuleVersionsByDeviceWithOptions(request, runtime);
    }

    public ListOTATaskByJobResponse listOTATaskByJobWithOptions(ListOTATaskByJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOTATaskByJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListOTATaskByJobResponse());
    }

    public ListOTATaskByJobResponse listOTATaskByJob(ListOTATaskByJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTATaskByJobWithOptions(request, runtime);
    }

    public ListProductByTagsResponse listProductByTagsWithOptions(ListProductByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProductByTags", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListProductByTagsResponse());
    }

    public ListProductByTagsResponse listProductByTags(ListProductByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductByTagsWithOptions(request, runtime);
    }

    public ListProductTagsResponse listProductTagsWithOptions(ListProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProductTags", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListProductTagsResponse());
    }

    public ListProductTagsResponse listProductTags(ListProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductTagsWithOptions(request, runtime);
    }

    public ListRuleResponse listRuleWithOptions(ListRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListRuleResponse());
    }

    public ListRuleResponse listRule(ListRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleWithOptions(request, runtime);
    }

    public ListRuleActionsResponse listRuleActionsWithOptions(ListRuleActionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRuleActions", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListRuleActionsResponse());
    }

    public ListRuleActionsResponse listRuleActions(ListRuleActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleActionsWithOptions(request, runtime);
    }

    public ListTaskResponse listTaskWithOptions(ListTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTask", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListTaskResponse());
    }

    public ListTaskResponse listTask(ListTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskWithOptions(request, runtime);
    }

    public ListTaskByPageResponse listTaskByPageWithOptions(ListTaskByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTaskByPage", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListTaskByPageResponse());
    }

    public ListTaskByPageResponse listTaskByPage(ListTaskByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskByPageWithOptions(request, runtime);
    }

    public ListThingModelVersionResponse listThingModelVersionWithOptions(ListThingModelVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListThingModelVersion", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListThingModelVersionResponse());
    }

    public ListThingModelVersionResponse listThingModelVersion(ListThingModelVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listThingModelVersionWithOptions(request, runtime);
    }

    public ListThingTemplatesResponse listThingTemplatesWithOptions(ListThingTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListThingTemplates", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListThingTemplatesResponse());
    }

    public ListThingTemplatesResponse listThingTemplates(ListThingTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listThingTemplatesWithOptions(request, runtime);
    }

    public NotifyAddThingTopoResponse notifyAddThingTopoWithOptions(NotifyAddThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NotifyAddThingTopo", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new NotifyAddThingTopoResponse());
    }

    public NotifyAddThingTopoResponse notifyAddThingTopo(NotifyAddThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyAddThingTopoWithOptions(request, runtime);
    }

    public OpenIotServiceResponse openIotServiceWithOptions(OpenIotServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenIotService", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new OpenIotServiceResponse());
    }

    public OpenIotServiceResponse openIotService(OpenIotServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openIotServiceWithOptions(request, runtime);
    }

    public PrintByTemplateResponse printByTemplateWithOptions(PrintByTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PrintByTemplate", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new PrintByTemplateResponse());
    }

    public PrintByTemplateResponse printByTemplate(PrintByTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.printByTemplateWithOptions(request, runtime);
    }

    public PubResponse pubWithOptions(PubRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Pub", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new PubResponse());
    }

    public PubResponse pub(PubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pubWithOptions(request, runtime);
    }

    public PubBroadcastResponse pubBroadcastWithOptions(PubBroadcastRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PubBroadcast", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new PubBroadcastResponse());
    }

    public PubBroadcastResponse pubBroadcast(PubBroadcastRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pubBroadcastWithOptions(request, runtime);
    }

    public PublishStudioAppResponse publishStudioAppWithOptions(PublishStudioAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishStudioApp", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new PublishStudioAppResponse());
    }

    public PublishStudioAppResponse publishStudioApp(PublishStudioAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishStudioAppWithOptions(request, runtime);
    }

    public PublishThingModelResponse publishThingModelWithOptions(PublishThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishThingModel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new PublishThingModelResponse());
    }

    public PublishThingModelResponse publishThingModel(PublishThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishThingModelWithOptions(request, runtime);
    }

    public PushSpeechResponse pushSpeechWithOptions(PushSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushSpeech", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new PushSpeechResponse());
    }

    public PushSpeechResponse pushSpeech(PushSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushSpeechWithOptions(request, runtime);
    }

    public QueryAppDeviceListResponse queryAppDeviceListWithOptions(QueryAppDeviceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAppDeviceList", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAppDeviceListResponse());
    }

    public QueryAppDeviceListResponse queryAppDeviceList(QueryAppDeviceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppDeviceListWithOptions(request, runtime);
    }

    public QueryBatchRegisterDeviceStatusResponse queryBatchRegisterDeviceStatusWithOptions(QueryBatchRegisterDeviceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryBatchRegisterDeviceStatus", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryBatchRegisterDeviceStatusResponse());
    }

    public QueryBatchRegisterDeviceStatusResponse queryBatchRegisterDeviceStatus(QueryBatchRegisterDeviceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBatchRegisterDeviceStatusWithOptions(request, runtime);
    }

    public QueryCertUrlByApplyIdResponse queryCertUrlByApplyIdWithOptions(QueryCertUrlByApplyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCertUrlByApplyId", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCertUrlByApplyIdResponse());
    }

    public QueryCertUrlByApplyIdResponse queryCertUrlByApplyId(QueryCertUrlByApplyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCertUrlByApplyIdWithOptions(request, runtime);
    }

    public QueryConsumerGroupByGroupIdResponse queryConsumerGroupByGroupIdWithOptions(QueryConsumerGroupByGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryConsumerGroupByGroupId", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryConsumerGroupByGroupIdResponse());
    }

    public QueryConsumerGroupByGroupIdResponse queryConsumerGroupByGroupId(QueryConsumerGroupByGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConsumerGroupByGroupIdWithOptions(request, runtime);
    }

    public QueryConsumerGroupListResponse queryConsumerGroupListWithOptions(QueryConsumerGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryConsumerGroupList", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryConsumerGroupListResponse());
    }

    public QueryConsumerGroupListResponse queryConsumerGroupList(QueryConsumerGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConsumerGroupListWithOptions(request, runtime);
    }

    public QueryConsumerGroupStatusResponse queryConsumerGroupStatusWithOptions(QueryConsumerGroupStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryConsumerGroupStatus", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryConsumerGroupStatusResponse());
    }

    public QueryConsumerGroupStatusResponse queryConsumerGroupStatus(QueryConsumerGroupStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConsumerGroupStatusWithOptions(request, runtime);
    }

    public QueryDetailSceneRuleLogResponse queryDetailSceneRuleLogWithOptions(QueryDetailSceneRuleLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDetailSceneRuleLog", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDetailSceneRuleLogResponse());
    }

    public QueryDetailSceneRuleLogResponse queryDetailSceneRuleLog(QueryDetailSceneRuleLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDetailSceneRuleLogWithOptions(request, runtime);
    }

    public QueryDeviceResponse queryDeviceWithOptions(QueryDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceResponse());
    }

    public QueryDeviceResponse queryDevice(QueryDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceWithOptions(request, runtime);
    }

    public QueryDeviceBySQLResponse queryDeviceBySQLWithOptions(QueryDeviceBySQLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceBySQL", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceBySQLResponse());
    }

    public QueryDeviceBySQLResponse queryDeviceBySQL(QueryDeviceBySQLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceBySQLWithOptions(request, runtime);
    }

    public QueryDeviceByStatusResponse queryDeviceByStatusWithOptions(QueryDeviceByStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceByStatus", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceByStatusResponse());
    }

    public QueryDeviceByStatusResponse queryDeviceByStatus(QueryDeviceByStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceByStatusWithOptions(request, runtime);
    }

    public QueryDeviceByTagsResponse queryDeviceByTagsWithOptions(QueryDeviceByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceByTags", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceByTagsResponse());
    }

    public QueryDeviceByTagsResponse queryDeviceByTags(QueryDeviceByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceByTagsWithOptions(request, runtime);
    }

    public QueryDeviceCertResponse queryDeviceCertWithOptions(QueryDeviceCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceCert", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceCertResponse());
    }

    public QueryDeviceCertResponse queryDeviceCert(QueryDeviceCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceCertWithOptions(request, runtime);
    }

    public QueryDeviceDesiredPropertyResponse queryDeviceDesiredPropertyWithOptions(QueryDeviceDesiredPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceDesiredProperty", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceDesiredPropertyResponse());
    }

    public QueryDeviceDesiredPropertyResponse queryDeviceDesiredProperty(QueryDeviceDesiredPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDesiredPropertyWithOptions(request, runtime);
    }

    public QueryDeviceDetailResponse queryDeviceDetailWithOptions(QueryDeviceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceDetail", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceDetailResponse());
    }

    public QueryDeviceDetailResponse queryDeviceDetail(QueryDeviceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDetailWithOptions(request, runtime);
    }

    public QueryDeviceDistributeDetailResponse queryDeviceDistributeDetailWithOptions(QueryDeviceDistributeDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceDistributeDetail", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceDistributeDetailResponse());
    }

    public QueryDeviceDistributeDetailResponse queryDeviceDistributeDetail(QueryDeviceDistributeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDistributeDetailWithOptions(request, runtime);
    }

    public QueryDeviceDistributeJobResponse queryDeviceDistributeJobWithOptions(QueryDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceDistributeJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceDistributeJobResponse());
    }

    public QueryDeviceDistributeJobResponse queryDeviceDistributeJob(QueryDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDistributeJobWithOptions(request, runtime);
    }

    public QueryDeviceEventDataResponse queryDeviceEventDataWithOptions(QueryDeviceEventDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceEventData", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceEventDataResponse());
    }

    public QueryDeviceEventDataResponse queryDeviceEventData(QueryDeviceEventDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceEventDataWithOptions(request, runtime);
    }

    public QueryDeviceFileResponse queryDeviceFileWithOptions(QueryDeviceFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceFile", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceFileResponse());
    }

    public QueryDeviceFileResponse queryDeviceFile(QueryDeviceFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceFileWithOptions(request, runtime);
    }

    public QueryDeviceFileListResponse queryDeviceFileListWithOptions(QueryDeviceFileListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceFileList", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceFileListResponse());
    }

    public QueryDeviceFileListResponse queryDeviceFileList(QueryDeviceFileListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceFileListWithOptions(request, runtime);
    }

    public QueryDeviceGroupByDeviceResponse queryDeviceGroupByDeviceWithOptions(QueryDeviceGroupByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceGroupByDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceGroupByDeviceResponse());
    }

    public QueryDeviceGroupByDeviceResponse queryDeviceGroupByDevice(QueryDeviceGroupByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupByDeviceWithOptions(request, runtime);
    }

    public QueryDeviceGroupByTagsResponse queryDeviceGroupByTagsWithOptions(QueryDeviceGroupByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceGroupByTags", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceGroupByTagsResponse());
    }

    public QueryDeviceGroupByTagsResponse queryDeviceGroupByTags(QueryDeviceGroupByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupByTagsWithOptions(request, runtime);
    }

    public QueryDeviceGroupInfoResponse queryDeviceGroupInfoWithOptions(QueryDeviceGroupInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceGroupInfo", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceGroupInfoResponse());
    }

    public QueryDeviceGroupInfoResponse queryDeviceGroupInfo(QueryDeviceGroupInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupInfoWithOptions(request, runtime);
    }

    public QueryDeviceGroupListResponse queryDeviceGroupListWithOptions(QueryDeviceGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceGroupList", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceGroupListResponse());
    }

    public QueryDeviceGroupListResponse queryDeviceGroupList(QueryDeviceGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupListWithOptions(request, runtime);
    }

    public QueryDeviceGroupTagListResponse queryDeviceGroupTagListWithOptions(QueryDeviceGroupTagListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceGroupTagList", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceGroupTagListResponse());
    }

    public QueryDeviceGroupTagListResponse queryDeviceGroupTagList(QueryDeviceGroupTagListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupTagListWithOptions(request, runtime);
    }

    public QueryDeviceListByDeviceGroupResponse queryDeviceListByDeviceGroupWithOptions(QueryDeviceListByDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceListByDeviceGroup", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceListByDeviceGroupResponse());
    }

    public QueryDeviceListByDeviceGroupResponse queryDeviceListByDeviceGroup(QueryDeviceListByDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceListByDeviceGroupWithOptions(request, runtime);
    }

    public QueryDeviceOriginalEventDataResponse queryDeviceOriginalEventDataWithOptions(QueryDeviceOriginalEventDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceOriginalEventData", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceOriginalEventDataResponse());
    }

    public QueryDeviceOriginalEventDataResponse queryDeviceOriginalEventData(QueryDeviceOriginalEventDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalEventDataWithOptions(request, runtime);
    }

    public QueryDeviceOriginalPropertyDataResponse queryDeviceOriginalPropertyDataWithOptions(QueryDeviceOriginalPropertyDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceOriginalPropertyData", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceOriginalPropertyDataResponse());
    }

    public QueryDeviceOriginalPropertyDataResponse queryDeviceOriginalPropertyData(QueryDeviceOriginalPropertyDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalPropertyDataWithOptions(request, runtime);
    }

    public QueryDeviceOriginalPropertyStatusResponse queryDeviceOriginalPropertyStatusWithOptions(QueryDeviceOriginalPropertyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceOriginalPropertyStatus", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceOriginalPropertyStatusResponse());
    }

    public QueryDeviceOriginalPropertyStatusResponse queryDeviceOriginalPropertyStatus(QueryDeviceOriginalPropertyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalPropertyStatusWithOptions(request, runtime);
    }

    public QueryDeviceOriginalServiceDataResponse queryDeviceOriginalServiceDataWithOptions(QueryDeviceOriginalServiceDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceOriginalServiceData", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceOriginalServiceDataResponse());
    }

    public QueryDeviceOriginalServiceDataResponse queryDeviceOriginalServiceData(QueryDeviceOriginalServiceDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalServiceDataWithOptions(request, runtime);
    }

    public QueryDevicePropResponse queryDevicePropWithOptions(QueryDevicePropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceProp", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDevicePropResponse());
    }

    public QueryDevicePropResponse queryDeviceProp(QueryDevicePropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropWithOptions(request, runtime);
    }

    public QueryDevicePropertiesDataResponse queryDevicePropertiesDataWithOptions(QueryDevicePropertiesDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDevicePropertiesData", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDevicePropertiesDataResponse());
    }

    public QueryDevicePropertiesDataResponse queryDevicePropertiesData(QueryDevicePropertiesDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropertiesDataWithOptions(request, runtime);
    }

    public QueryDevicePropertyDataResponse queryDevicePropertyDataWithOptions(QueryDevicePropertyDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDevicePropertyData", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDevicePropertyDataResponse());
    }

    public QueryDevicePropertyDataResponse queryDevicePropertyData(QueryDevicePropertyDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropertyDataWithOptions(request, runtime);
    }

    public QueryDevicePropertyStatusResponse queryDevicePropertyStatusWithOptions(QueryDevicePropertyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDevicePropertyStatus", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDevicePropertyStatusResponse());
    }

    public QueryDevicePropertyStatusResponse queryDevicePropertyStatus(QueryDevicePropertyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropertyStatusWithOptions(request, runtime);
    }

    public QueryDeviceServiceDataResponse queryDeviceServiceDataWithOptions(QueryDeviceServiceDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceServiceData", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceServiceDataResponse());
    }

    public QueryDeviceServiceDataResponse queryDeviceServiceData(QueryDeviceServiceDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceServiceDataWithOptions(request, runtime);
    }

    public QueryDeviceStatisticsResponse queryDeviceStatisticsWithOptions(QueryDeviceStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeviceStatistics", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDeviceStatisticsResponse());
    }

    public QueryDeviceStatisticsResponse queryDeviceStatistics(QueryDeviceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceStatisticsWithOptions(request, runtime);
    }

    public QueryEdgeDriverResponse queryEdgeDriverWithOptions(QueryEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeDriver", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeDriverResponse());
    }

    public QueryEdgeDriverResponse queryEdgeDriver(QueryEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeDriverWithOptions(request, runtime);
    }

    public QueryEdgeDriverVersionResponse queryEdgeDriverVersionWithOptions(QueryEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeDriverVersion", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeDriverVersionResponse());
    }

    public QueryEdgeDriverVersionResponse queryEdgeDriverVersion(QueryEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeDriverVersionWithOptions(request, runtime);
    }

    public QueryEdgeInstanceResponse queryEdgeInstanceWithOptions(QueryEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeInstanceResponse());
    }

    public QueryEdgeInstanceResponse queryEdgeInstance(QueryEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceWithOptions(request, runtime);
    }

    public QueryEdgeInstanceChannelResponse queryEdgeInstanceChannelWithOptions(QueryEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeInstanceChannel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeInstanceChannelResponse());
    }

    public QueryEdgeInstanceChannelResponse queryEdgeInstanceChannel(QueryEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceChannelWithOptions(request, runtime);
    }

    public QueryEdgeInstanceDeviceResponse queryEdgeInstanceDeviceWithOptions(QueryEdgeInstanceDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeInstanceDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeInstanceDeviceResponse());
    }

    public QueryEdgeInstanceDeviceResponse queryEdgeInstanceDevice(QueryEdgeInstanceDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceDeviceWithOptions(request, runtime);
    }

    public QueryEdgeInstanceDeviceByDriverResponse queryEdgeInstanceDeviceByDriverWithOptions(QueryEdgeInstanceDeviceByDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeInstanceDeviceByDriver", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeInstanceDeviceByDriverResponse());
    }

    public QueryEdgeInstanceDeviceByDriverResponse queryEdgeInstanceDeviceByDriver(QueryEdgeInstanceDeviceByDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceDeviceByDriverWithOptions(request, runtime);
    }

    public QueryEdgeInstanceDriverResponse queryEdgeInstanceDriverWithOptions(QueryEdgeInstanceDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeInstanceDriver", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeInstanceDriverResponse());
    }

    public QueryEdgeInstanceDriverResponse queryEdgeInstanceDriver(QueryEdgeInstanceDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceDriverWithOptions(request, runtime);
    }

    public QueryEdgeInstanceGatewayResponse queryEdgeInstanceGatewayWithOptions(QueryEdgeInstanceGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeInstanceGateway", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeInstanceGatewayResponse());
    }

    public QueryEdgeInstanceGatewayResponse queryEdgeInstanceGateway(QueryEdgeInstanceGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceGatewayWithOptions(request, runtime);
    }

    public QueryEdgeInstanceHistoricDeploymentResponse queryEdgeInstanceHistoricDeploymentWithOptions(QueryEdgeInstanceHistoricDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeInstanceHistoricDeployment", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeInstanceHistoricDeploymentResponse());
    }

    public QueryEdgeInstanceHistoricDeploymentResponse queryEdgeInstanceHistoricDeployment(QueryEdgeInstanceHistoricDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceHistoricDeploymentWithOptions(request, runtime);
    }

    public QueryEdgeInstanceMessageRoutingResponse queryEdgeInstanceMessageRoutingWithOptions(QueryEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeInstanceMessageRouting", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeInstanceMessageRoutingResponse());
    }

    public QueryEdgeInstanceMessageRoutingResponse queryEdgeInstanceMessageRouting(QueryEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public QueryEdgeInstanceSceneRuleResponse queryEdgeInstanceSceneRuleWithOptions(QueryEdgeInstanceSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEdgeInstanceSceneRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEdgeInstanceSceneRuleResponse());
    }

    public QueryEdgeInstanceSceneRuleResponse queryEdgeInstanceSceneRule(QueryEdgeInstanceSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceSceneRuleWithOptions(request, runtime);
    }

    public QueryJobResponse queryJobWithOptions(QueryJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryJobResponse());
    }

    public QueryJobResponse queryJob(QueryJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobWithOptions(request, runtime);
    }

    public QueryJobStatisticsResponse queryJobStatisticsWithOptions(QueryJobStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryJobStatistics", "2018-01-20", "HTTPS", "GET", "AK", "json", req, runtime), new QueryJobStatisticsResponse());
    }

    public QueryJobStatisticsResponse queryJobStatistics(QueryJobStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobStatisticsWithOptions(request, runtime);
    }

    public QueryLoRaJoinPermissionsResponse queryLoRaJoinPermissionsWithOptions(QueryLoRaJoinPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryLoRaJoinPermissions", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryLoRaJoinPermissionsResponse());
    }

    public QueryLoRaJoinPermissionsResponse queryLoRaJoinPermissions(QueryLoRaJoinPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryLoRaJoinPermissionsWithOptions(request, runtime);
    }

    public QueryOTAFirmwareResponse queryOTAFirmwareWithOptions(QueryOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOTAFirmware", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOTAFirmwareResponse());
    }

    public QueryOTAFirmwareResponse queryOTAFirmware(QueryOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOTAFirmwareWithOptions(request, runtime);
    }

    public QueryOTAJobResponse queryOTAJobWithOptions(QueryOTAJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOTAJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOTAJobResponse());
    }

    public QueryOTAJobResponse queryOTAJob(QueryOTAJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOTAJobWithOptions(request, runtime);
    }

    public QueryPageByApplyIdResponse queryPageByApplyIdWithOptions(QueryPageByApplyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPageByApplyId", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPageByApplyIdResponse());
    }

    public QueryPageByApplyIdResponse queryPageByApplyId(QueryPageByApplyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPageByApplyIdWithOptions(request, runtime);
    }

    public QueryProductResponse queryProductWithOptions(QueryProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryProduct", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryProductResponse());
    }

    public QueryProductResponse queryProduct(QueryProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductWithOptions(request, runtime);
    }

    public QueryProductCertInfoResponse queryProductCertInfoWithOptions(QueryProductCertInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryProductCertInfo", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryProductCertInfoResponse());
    }

    public QueryProductCertInfoResponse queryProductCertInfo(QueryProductCertInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductCertInfoWithOptions(request, runtime);
    }

    public QueryProductListResponse queryProductListWithOptions(QueryProductListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryProductList", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryProductListResponse());
    }

    public QueryProductListResponse queryProductList(QueryProductListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductListWithOptions(request, runtime);
    }

    public QueryProductTopicResponse queryProductTopicWithOptions(QueryProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryProductTopic", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryProductTopicResponse());
    }

    public QueryProductTopicResponse queryProductTopic(QueryProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductTopicWithOptions(request, runtime);
    }

    public QuerySceneRuleResponse querySceneRuleWithOptions(QuerySceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySceneRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySceneRuleResponse());
    }

    public QuerySceneRuleResponse querySceneRule(QuerySceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySceneRuleWithOptions(request, runtime);
    }

    public QuerySolutionDeviceGroupPageResponse querySolutionDeviceGroupPageWithOptions(QuerySolutionDeviceGroupPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySolutionDeviceGroupPage", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySolutionDeviceGroupPageResponse());
    }

    public QuerySolutionDeviceGroupPageResponse querySolutionDeviceGroupPage(QuerySolutionDeviceGroupPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySolutionDeviceGroupPageWithOptions(request, runtime);
    }

    public QuerySpeechResponse querySpeechWithOptions(QuerySpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySpeech", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySpeechResponse());
    }

    public QuerySpeechResponse querySpeech(QuerySpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechWithOptions(request, runtime);
    }

    public QuerySpeechListResponse querySpeechListWithOptions(QuerySpeechListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySpeechList", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySpeechListResponse());
    }

    public QuerySpeechListResponse querySpeechList(QuerySpeechListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechListWithOptions(request, runtime);
    }

    public QuerySpeechPushJobResponse querySpeechPushJobWithOptions(QuerySpeechPushJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySpeechPushJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySpeechPushJobResponse());
    }

    public QuerySpeechPushJobResponse querySpeechPushJob(QuerySpeechPushJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechPushJobWithOptions(request, runtime);
    }

    public QuerySpeechPushJobDeviceResponse querySpeechPushJobDeviceWithOptions(QuerySpeechPushJobDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySpeechPushJobDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySpeechPushJobDeviceResponse());
    }

    public QuerySpeechPushJobDeviceResponse querySpeechPushJobDevice(QuerySpeechPushJobDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechPushJobDeviceWithOptions(request, runtime);
    }

    public QuerySpeechPushJobSpeechResponse querySpeechPushJobSpeechWithOptions(QuerySpeechPushJobSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySpeechPushJobSpeech", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySpeechPushJobSpeechResponse());
    }

    public QuerySpeechPushJobSpeechResponse querySpeechPushJobSpeech(QuerySpeechPushJobSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechPushJobSpeechWithOptions(request, runtime);
    }

    public QueryStudioAppDomainListOpenResponse queryStudioAppDomainListOpenWithOptions(QueryStudioAppDomainListOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryStudioAppDomainListOpen", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryStudioAppDomainListOpenResponse());
    }

    public QueryStudioAppDomainListOpenResponse queryStudioAppDomainListOpen(QueryStudioAppDomainListOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStudioAppDomainListOpenWithOptions(request, runtime);
    }

    public QueryStudioAppListResponse queryStudioAppListWithOptions(QueryStudioAppListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryStudioAppList", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryStudioAppListResponse());
    }

    public QueryStudioAppListResponse queryStudioAppList(QueryStudioAppListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStudioAppListWithOptions(request, runtime);
    }

    public QueryStudioAppPageListOpenResponse queryStudioAppPageListOpenWithOptions(QueryStudioAppPageListOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryStudioAppPageListOpen", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryStudioAppPageListOpenResponse());
    }

    public QueryStudioAppPageListOpenResponse queryStudioAppPageListOpen(QueryStudioAppPageListOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStudioAppPageListOpenWithOptions(request, runtime);
    }

    public QueryStudioProjectListResponse queryStudioProjectListWithOptions(QueryStudioProjectListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryStudioProjectList", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryStudioProjectListResponse());
    }

    public QueryStudioProjectListResponse queryStudioProjectList(QueryStudioProjectListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStudioProjectListWithOptions(request, runtime);
    }

    public QuerySubscribeRelationResponse querySubscribeRelationWithOptions(QuerySubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySubscribeRelation", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySubscribeRelationResponse());
    }

    public QuerySubscribeRelationResponse querySubscribeRelation(QuerySubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubscribeRelationWithOptions(request, runtime);
    }

    public QuerySummarySceneRuleLogResponse querySummarySceneRuleLogWithOptions(QuerySummarySceneRuleLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySummarySceneRuleLog", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySummarySceneRuleLogResponse());
    }

    public QuerySummarySceneRuleLogResponse querySummarySceneRuleLog(QuerySummarySceneRuleLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySummarySceneRuleLogWithOptions(request, runtime);
    }

    public QuerySuperDeviceGroupResponse querySuperDeviceGroupWithOptions(QuerySuperDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySuperDeviceGroup", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySuperDeviceGroupResponse());
    }

    public QuerySuperDeviceGroupResponse querySuperDeviceGroup(QuerySuperDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySuperDeviceGroupWithOptions(request, runtime);
    }

    public QueryTaskResponse queryTaskWithOptions(QueryTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTask", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskResponse());
    }

    public QueryTaskResponse queryTask(QueryTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskWithOptions(request, runtime);
    }

    public QueryThingModelResponse queryThingModelWithOptions(QueryThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryThingModel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryThingModelResponse());
    }

    public QueryThingModelResponse queryThingModel(QueryThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelWithOptions(request, runtime);
    }

    public QueryThingModelExtendConfigResponse queryThingModelExtendConfigWithOptions(QueryThingModelExtendConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryThingModelExtendConfig", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryThingModelExtendConfigResponse());
    }

    public QueryThingModelExtendConfigResponse queryThingModelExtendConfig(QueryThingModelExtendConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelExtendConfigWithOptions(request, runtime);
    }

    public QueryThingModelExtendConfigPublishedResponse queryThingModelExtendConfigPublishedWithOptions(QueryThingModelExtendConfigPublishedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryThingModelExtendConfigPublished", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryThingModelExtendConfigPublishedResponse());
    }

    public QueryThingModelExtendConfigPublishedResponse queryThingModelExtendConfigPublished(QueryThingModelExtendConfigPublishedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelExtendConfigPublishedWithOptions(request, runtime);
    }

    public QueryThingModelPublishedResponse queryThingModelPublishedWithOptions(QueryThingModelPublishedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryThingModelPublished", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryThingModelPublishedResponse());
    }

    public QueryThingModelPublishedResponse queryThingModelPublished(QueryThingModelPublishedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelPublishedWithOptions(request, runtime);
    }

    public QueryTopicReverseRouteTableResponse queryTopicReverseRouteTableWithOptions(QueryTopicReverseRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTopicReverseRouteTable", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTopicReverseRouteTableResponse());
    }

    public QueryTopicReverseRouteTableResponse queryTopicReverseRouteTable(QueryTopicReverseRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTopicReverseRouteTableWithOptions(request, runtime);
    }

    public QueryTopicRouteTableResponse queryTopicRouteTableWithOptions(QueryTopicRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTopicRouteTable", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTopicRouteTableResponse());
    }

    public QueryTopicRouteTableResponse queryTopicRouteTable(QueryTopicRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTopicRouteTableWithOptions(request, runtime);
    }

    public RefreshDeviceTunnelSharePasswordResponse refreshDeviceTunnelSharePasswordWithOptions(RefreshDeviceTunnelSharePasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshDeviceTunnelSharePassword", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshDeviceTunnelSharePasswordResponse());
    }

    public RefreshDeviceTunnelSharePasswordResponse refreshDeviceTunnelSharePassword(RefreshDeviceTunnelSharePasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshDeviceTunnelSharePasswordWithOptions(request, runtime);
    }

    public RefreshStudioAppTokenOpenResponse refreshStudioAppTokenOpenWithOptions(RefreshStudioAppTokenOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshStudioAppTokenOpen", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshStudioAppTokenOpenResponse());
    }

    public RefreshStudioAppTokenOpenResponse refreshStudioAppTokenOpen(RefreshStudioAppTokenOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshStudioAppTokenOpenWithOptions(request, runtime);
    }

    public RegisterDeviceResponse registerDeviceWithOptions(RegisterDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterDevice", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterDeviceResponse());
    }

    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    public ReleaseEdgeDriverVersionResponse releaseEdgeDriverVersionWithOptions(ReleaseEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseEdgeDriverVersion", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseEdgeDriverVersionResponse());
    }

    public ReleaseEdgeDriverVersionResponse releaseEdgeDriverVersion(ReleaseEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseEdgeDriverVersionWithOptions(request, runtime);
    }

    public ReleaseProductResponse releaseProductWithOptions(ReleaseProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseProduct", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseProductResponse());
    }

    public ReleaseProductResponse releaseProduct(ReleaseProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseProductWithOptions(request, runtime);
    }

    public RemoveThingTopoResponse removeThingTopoWithOptions(RemoveThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveThingTopo", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveThingTopoResponse());
    }

    public RemoveThingTopoResponse removeThingTopo(RemoveThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeThingTopoWithOptions(request, runtime);
    }

    public ReplaceEdgeInstanceGatewayResponse replaceEdgeInstanceGatewayWithOptions(ReplaceEdgeInstanceGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReplaceEdgeInstanceGateway", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ReplaceEdgeInstanceGatewayResponse());
    }

    public ReplaceEdgeInstanceGatewayResponse replaceEdgeInstanceGateway(ReplaceEdgeInstanceGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceEdgeInstanceGatewayWithOptions(request, runtime);
    }

    public ResetConsumerGroupPositionResponse resetConsumerGroupPositionWithOptions(ResetConsumerGroupPositionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetConsumerGroupPosition", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ResetConsumerGroupPositionResponse());
    }

    public ResetConsumerGroupPositionResponse resetConsumerGroupPosition(ResetConsumerGroupPositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetConsumerGroupPositionWithOptions(request, runtime);
    }

    public ResetThingResponse resetThingWithOptions(ResetThingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetThing", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ResetThingResponse());
    }

    public ResetThingResponse resetThing(ResetThingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetThingWithOptions(request, runtime);
    }

    public RRpcResponse rRpcWithOptions(RRpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RRpc", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new RRpcResponse());
    }

    public RRpcResponse rRpc(RRpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rRpcWithOptions(request, runtime);
    }

    public SaveDevicePropResponse saveDevicePropWithOptions(SaveDevicePropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveDeviceProp", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SaveDevicePropResponse());
    }

    public SaveDevicePropResponse saveDeviceProp(SaveDevicePropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveDevicePropWithOptions(request, runtime);
    }

    public SetDeviceDesiredPropertyResponse setDeviceDesiredPropertyWithOptions(SetDeviceDesiredPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDeviceDesiredProperty", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SetDeviceDesiredPropertyResponse());
    }

    public SetDeviceDesiredPropertyResponse setDeviceDesiredProperty(SetDeviceDesiredPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeviceDesiredPropertyWithOptions(request, runtime);
    }

    public SetDeviceGroupTagsResponse setDeviceGroupTagsWithOptions(SetDeviceGroupTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDeviceGroupTags", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SetDeviceGroupTagsResponse());
    }

    public SetDeviceGroupTagsResponse setDeviceGroupTags(SetDeviceGroupTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeviceGroupTagsWithOptions(request, runtime);
    }

    public SetDevicePropertyResponse setDevicePropertyWithOptions(SetDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDeviceProperty", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SetDevicePropertyResponse());
    }

    public SetDevicePropertyResponse setDeviceProperty(SetDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDevicePropertyWithOptions(request, runtime);
    }

    public SetDevicesPropertyResponse setDevicesPropertyWithOptions(SetDevicesPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDevicesProperty", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SetDevicesPropertyResponse());
    }

    public SetDevicesPropertyResponse setDevicesProperty(SetDevicesPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDevicesPropertyWithOptions(request, runtime);
    }

    public SetEdgeInstanceDriverConfigsResponse setEdgeInstanceDriverConfigsWithOptions(SetEdgeInstanceDriverConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetEdgeInstanceDriverConfigs", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SetEdgeInstanceDriverConfigsResponse());
    }

    public SetEdgeInstanceDriverConfigsResponse setEdgeInstanceDriverConfigs(SetEdgeInstanceDriverConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setEdgeInstanceDriverConfigsWithOptions(request, runtime);
    }

    public SetProductCertInfoResponse setProductCertInfoWithOptions(SetProductCertInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetProductCertInfo", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SetProductCertInfoResponse());
    }

    public SetProductCertInfoResponse setProductCertInfo(SetProductCertInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setProductCertInfoWithOptions(request, runtime);
    }

    public SetStudioProjectCooperationResponse setStudioProjectCooperationWithOptions(SetStudioProjectCooperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetStudioProjectCooperation", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SetStudioProjectCooperationResponse());
    }

    public SetStudioProjectCooperationResponse setStudioProjectCooperation(SetStudioProjectCooperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setStudioProjectCooperationWithOptions(request, runtime);
    }

    public SetupStudioAppAuthModeOpenResponse setupStudioAppAuthModeOpenWithOptions(SetupStudioAppAuthModeOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetupStudioAppAuthModeOpen", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SetupStudioAppAuthModeOpenResponse());
    }

    public SetupStudioAppAuthModeOpenResponse setupStudioAppAuthModeOpen(SetupStudioAppAuthModeOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setupStudioAppAuthModeOpenWithOptions(request, runtime);
    }

    public SpeechByCombinationResponse speechByCombinationWithOptions(SpeechByCombinationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SpeechByCombination", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SpeechByCombinationResponse());
    }

    public SpeechByCombinationResponse speechByCombination(SpeechByCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.speechByCombinationWithOptions(request, runtime);
    }

    public StartCpuResponse startCpuWithOptions(StartCpuRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartCpu", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new StartCpuResponse());
    }

    public StartCpuResponse startCpu(StartCpuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCpuWithOptions(request, runtime);
    }

    public StartRuleResponse startRuleWithOptions(StartRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new StartRuleResponse());
    }

    public StartRuleResponse startRule(StartRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRuleWithOptions(request, runtime);
    }

    public StopRuleResponse stopRuleWithOptions(StopRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new StopRuleResponse());
    }

    public StopRuleResponse stopRule(StopRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopRuleWithOptions(request, runtime);
    }

    public SyncSpeechByCombinationResponse syncSpeechByCombinationWithOptions(SyncSpeechByCombinationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncSpeechByCombination", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new SyncSpeechByCombinationResponse());
    }

    public SyncSpeechByCombinationResponse syncSpeechByCombination(SyncSpeechByCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncSpeechByCombinationWithOptions(request, runtime);
    }

    public TestSpeechResponse testSpeechWithOptions(TestSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TestSpeech", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new TestSpeechResponse());
    }

    public TestSpeechResponse testSpeech(TestSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testSpeechWithOptions(request, runtime);
    }

    public TriggerSceneRuleResponse triggerSceneRuleWithOptions(TriggerSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TriggerSceneRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new TriggerSceneRuleResponse());
    }

    public TriggerSceneRuleResponse triggerSceneRule(TriggerSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerSceneRuleWithOptions(request, runtime);
    }

    public UnbindApplicationFromEdgeInstanceResponse unbindApplicationFromEdgeInstanceWithOptions(UnbindApplicationFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindApplicationFromEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindApplicationFromEdgeInstanceResponse());
    }

    public UnbindApplicationFromEdgeInstanceResponse unbindApplicationFromEdgeInstance(UnbindApplicationFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindApplicationFromEdgeInstanceWithOptions(request, runtime);
    }

    public UnbindDriverFromEdgeInstanceResponse unbindDriverFromEdgeInstanceWithOptions(UnbindDriverFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindDriverFromEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindDriverFromEdgeInstanceResponse());
    }

    public UnbindDriverFromEdgeInstanceResponse unbindDriverFromEdgeInstance(UnbindDriverFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindDriverFromEdgeInstanceWithOptions(request, runtime);
    }

    public UnbindRoleFromEdgeInstanceResponse unbindRoleFromEdgeInstanceWithOptions(UnbindRoleFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindRoleFromEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindRoleFromEdgeInstanceResponse());
    }

    public UnbindRoleFromEdgeInstanceResponse unbindRoleFromEdgeInstance(UnbindRoleFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindRoleFromEdgeInstanceWithOptions(request, runtime);
    }

    public UnbindSceneRuleFromEdgeInstanceResponse unbindSceneRuleFromEdgeInstanceWithOptions(UnbindSceneRuleFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindSceneRuleFromEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindSceneRuleFromEdgeInstanceResponse());
    }

    public UnbindSceneRuleFromEdgeInstanceResponse unbindSceneRuleFromEdgeInstance(UnbindSceneRuleFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindSceneRuleFromEdgeInstanceWithOptions(request, runtime);
    }

    public UpdateConsumerGroupResponse updateConsumerGroupWithOptions(UpdateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConsumerGroup", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConsumerGroupResponse());
    }

    public UpdateConsumerGroupResponse updateConsumerGroup(UpdateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConsumerGroupWithOptions(request, runtime);
    }

    public UpdateDeviceGroupResponse updateDeviceGroupWithOptions(UpdateDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceGroup", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceGroupResponse());
    }

    public UpdateDeviceGroupResponse updateDeviceGroup(UpdateDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceGroupWithOptions(request, runtime);
    }

    public UpdateDeviceShadowResponse updateDeviceShadowWithOptions(UpdateDeviceShadowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceShadow", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceShadowResponse());
    }

    public UpdateDeviceShadowResponse updateDeviceShadow(UpdateDeviceShadowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceShadowWithOptions(request, runtime);
    }

    public UpdateEdgeDriverVersionResponse updateEdgeDriverVersionWithOptions(UpdateEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEdgeDriverVersion", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEdgeDriverVersionResponse());
    }

    public UpdateEdgeDriverVersionResponse updateEdgeDriverVersion(UpdateEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeDriverVersionWithOptions(request, runtime);
    }

    public UpdateEdgeInstanceResponse updateEdgeInstanceWithOptions(UpdateEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEdgeInstance", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEdgeInstanceResponse());
    }

    public UpdateEdgeInstanceResponse updateEdgeInstance(UpdateEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeInstanceWithOptions(request, runtime);
    }

    public UpdateEdgeInstanceChannelResponse updateEdgeInstanceChannelWithOptions(UpdateEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEdgeInstanceChannel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEdgeInstanceChannelResponse());
    }

    public UpdateEdgeInstanceChannelResponse updateEdgeInstanceChannel(UpdateEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeInstanceChannelWithOptions(request, runtime);
    }

    public UpdateEdgeInstanceMessageRoutingResponse updateEdgeInstanceMessageRoutingWithOptions(UpdateEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEdgeInstanceMessageRouting", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEdgeInstanceMessageRoutingResponse());
    }

    public UpdateEdgeInstanceMessageRoutingResponse updateEdgeInstanceMessageRouting(UpdateEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public UpdateJobResponse updateJobWithOptions(UpdateJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateJob", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateJobResponse());
    }

    public UpdateJobResponse updateJob(UpdateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateJobWithOptions(request, runtime);
    }

    public UpdateOTAModuleResponse updateOTAModuleWithOptions(UpdateOTAModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOTAModule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateOTAModuleResponse());
    }

    public UpdateOTAModuleResponse updateOTAModule(UpdateOTAModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOTAModuleWithOptions(request, runtime);
    }

    public UpdateProductResponse updateProductWithOptions(UpdateProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProduct", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProductResponse());
    }

    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductWithOptions(request, runtime);
    }

    public UpdateProductFilterConfigResponse updateProductFilterConfigWithOptions(UpdateProductFilterConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProductFilterConfig", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProductFilterConfigResponse());
    }

    public UpdateProductFilterConfigResponse updateProductFilterConfig(UpdateProductFilterConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductFilterConfigWithOptions(request, runtime);
    }

    public UpdateProductTagsResponse updateProductTagsWithOptions(UpdateProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProductTags", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProductTagsResponse());
    }

    public UpdateProductTagsResponse updateProductTags(UpdateProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductTagsWithOptions(request, runtime);
    }

    public UpdateProductTopicResponse updateProductTopicWithOptions(UpdateProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProductTopic", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProductTopicResponse());
    }

    public UpdateProductTopicResponse updateProductTopic(UpdateProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductTopicWithOptions(request, runtime);
    }

    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRuleResponse());
    }

    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    public UpdateRuleActionResponse updateRuleActionWithOptions(UpdateRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRuleAction", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRuleActionResponse());
    }

    public UpdateRuleActionResponse updateRuleAction(UpdateRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleActionWithOptions(request, runtime);
    }

    public UpdateSceneRuleResponse updateSceneRuleWithOptions(UpdateSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSceneRule", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSceneRuleResponse());
    }

    public UpdateSceneRuleResponse updateSceneRule(UpdateSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSceneRuleWithOptions(request, runtime);
    }

    public UpdateSpeechResponse updateSpeechWithOptions(UpdateSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSpeech", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSpeechResponse());
    }

    public UpdateSpeechResponse updateSpeech(UpdateSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpeechWithOptions(request, runtime);
    }

    public UpdateSubscribeRelationResponse updateSubscribeRelationWithOptions(UpdateSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSubscribeRelation", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSubscribeRelationResponse());
    }

    public UpdateSubscribeRelationResponse updateSubscribeRelation(UpdateSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSubscribeRelationWithOptions(request, runtime);
    }

    public UpdateThingModelResponse updateThingModelWithOptions(UpdateThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateThingModel", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateThingModelResponse());
    }

    public UpdateThingModelResponse updateThingModel(UpdateThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateThingModelWithOptions(request, runtime);
    }

    public UpdateThingModelValidationConfigResponse updateThingModelValidationConfigWithOptions(UpdateThingModelValidationConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateThingModelValidationConfig", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateThingModelValidationConfigResponse());
    }

    public UpdateThingModelValidationConfigResponse updateThingModelValidationConfig(UpdateThingModelValidationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateThingModelValidationConfigWithOptions(request, runtime);
    }

    public UpdateThingScriptResponse updateThingScriptWithOptions(UpdateThingScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateThingScript", "2018-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateThingScriptResponse());
    }

    public UpdateThingScriptResponse updateThingScript(UpdateThingScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateThingScriptWithOptions(request, runtime);
    }
}
