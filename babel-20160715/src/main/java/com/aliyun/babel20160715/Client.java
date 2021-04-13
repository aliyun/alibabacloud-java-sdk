// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715;

import com.aliyun.tea.*;
import com.aliyun.babel20160715.models.*;
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
        this._endpoint = this.getEndpoint("babel", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ClientReportResponse clientReportWithOptions(ClientReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClientReport", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new ClientReportResponse());
    }

    public ClientReportResponse clientReport(ClientReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clientReportWithOptions(request, runtime);
    }

    public CountProductSpiServiceResponse countProductSpiServiceWithOptions(CountProductSpiServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CountProductSpiService", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new CountProductSpiServiceResponse());
    }

    public CountProductSpiServiceResponse countProductSpiService(CountProductSpiServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countProductSpiServiceWithOptions(request, runtime);
    }

    public DisableProductSpiServiceResponse disableProductSpiServiceWithOptions(DisableProductSpiServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableProductSpiService", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new DisableProductSpiServiceResponse());
    }

    public DisableProductSpiServiceResponse disableProductSpiService(DisableProductSpiServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableProductSpiServiceWithOptions(request, runtime);
    }

    public EnableProductSpiServiceResponse enableProductSpiServiceWithOptions(EnableProductSpiServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableProductSpiService", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new EnableProductSpiServiceResponse());
    }

    public EnableProductSpiServiceResponse enableProductSpiService(EnableProductSpiServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableProductSpiServiceWithOptions(request, runtime);
    }

    public FindServiceProviderCodeByUidResponse findServiceProviderCodeByUidWithOptions(FindServiceProviderCodeByUidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindServiceProviderCodeByUid", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new FindServiceProviderCodeByUidResponse());
    }

    public FindServiceProviderCodeByUidResponse findServiceProviderCodeByUid(FindServiceProviderCodeByUidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findServiceProviderCodeByUidWithOptions(request, runtime);
    }

    public GetRootBusinessLocationsResponse getRootBusinessLocationsWithOptions(GetRootBusinessLocationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRootBusinessLocations", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetRootBusinessLocationsResponse());
    }

    public GetRootBusinessLocationsResponse getRootBusinessLocations(GetRootBusinessLocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRootBusinessLocationsWithOptions(request, runtime);
    }

    public ListAllServiceProviderResponse listAllServiceProviderWithOptions(ListAllServiceProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAllServiceProvider", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListAllServiceProviderResponse());
    }

    public ListAllServiceProviderResponse listAllServiceProvider(ListAllServiceProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllServiceProviderWithOptions(request, runtime);
    }

    public LookupAllActiveProductSpiServiceListResponse lookupAllActiveProductSpiServiceListWithOptions(LookupAllActiveProductSpiServiceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LookupAllActiveProductSpiServiceList", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new LookupAllActiveProductSpiServiceListResponse());
    }

    public LookupAllActiveProductSpiServiceListResponse lookupAllActiveProductSpiServiceList(LookupAllActiveProductSpiServiceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lookupAllActiveProductSpiServiceListWithOptions(request, runtime);
    }

    public LookupProductSpiServiceResponse lookupProductSpiServiceWithOptions(LookupProductSpiServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LookupProductSpiService", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new LookupProductSpiServiceResponse());
    }

    public LookupProductSpiServiceResponse lookupProductSpiService(LookupProductSpiServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lookupProductSpiServiceWithOptions(request, runtime);
    }

    public LookupProductSpiServiceListResponse lookupProductSpiServiceListWithOptions(LookupProductSpiServiceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LookupProductSpiServiceList", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new LookupProductSpiServiceListResponse());
    }

    public LookupProductSpiServiceListResponse lookupProductSpiServiceList(LookupProductSpiServiceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lookupProductSpiServiceListWithOptions(request, runtime);
    }

    public NotifyMessageRepeaterResponse notifyMessageRepeaterWithOptions(NotifyMessageRepeaterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NotifyMessageRepeater", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new NotifyMessageRepeaterResponse());
    }

    public NotifyMessageRepeaterResponse notifyMessageRepeater(NotifyMessageRepeaterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyMessageRepeaterWithOptions(request, runtime);
    }

    public NotifyUserBusinessCommandResponse notifyUserBusinessCommandWithOptions(NotifyUserBusinessCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NotifyUserBusinessCommand", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new NotifyUserBusinessCommandResponse());
    }

    public NotifyUserBusinessCommandResponse notifyUserBusinessCommand(NotifyUserBusinessCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyUserBusinessCommandWithOptions(request, runtime);
    }

    public PaginateSpiEndpointSnapshotResponse paginateSpiEndpointSnapshotWithOptions(PaginateSpiEndpointSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PaginateSpiEndpointSnapshot", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new PaginateSpiEndpointSnapshotResponse());
    }

    public PaginateSpiEndpointSnapshotResponse paginateSpiEndpointSnapshot(PaginateSpiEndpointSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.paginateSpiEndpointSnapshotWithOptions(request, runtime);
    }

    public RegisterProductSpiServiceResponse registerProductSpiServiceWithOptions(RegisterProductSpiServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterProductSpiService", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterProductSpiServiceResponse());
    }

    public RegisterProductSpiServiceResponse registerProductSpiService(RegisterProductSpiServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerProductSpiServiceWithOptions(request, runtime);
    }

    public SendCommonMessageResponse sendCommonMessageWithOptions(SendCommonMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendCommonMessage", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new SendCommonMessageResponse());
    }

    public SendCommonMessageResponse sendCommonMessage(SendCommonMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCommonMessageWithOptions(request, runtime);
    }

    public SetProductSpiServiceDefaultResponse setProductSpiServiceDefaultWithOptions(SetProductSpiServiceDefaultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetProductSpiServiceDefault", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetProductSpiServiceDefaultResponse());
    }

    public SetProductSpiServiceDefaultResponse setProductSpiServiceDefault(SetProductSpiServiceDefaultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setProductSpiServiceDefaultWithOptions(request, runtime);
    }

    public SwitchProductSpiServiceEnvironmentResponse switchProductSpiServiceEnvironmentWithOptions(SwitchProductSpiServiceEnvironmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchProductSpiServiceEnvironment", "2016-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchProductSpiServiceEnvironmentResponse());
    }

    public SwitchProductSpiServiceEnvironmentResponse switchProductSpiServiceEnvironment(SwitchProductSpiServiceEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchProductSpiServiceEnvironmentWithOptions(request, runtime);
    }
}
