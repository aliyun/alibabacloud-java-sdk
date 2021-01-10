// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212;

import com.aliyun.tea.*;
import com.aliyun.logiccomposer20181212.models.*;
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
        this._endpoint = this.getEndpoint("logiccomposer", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AbolishFlowResponse abolishFlowWithOptions(AbolishFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AbolishFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new AbolishFlowResponse());
    }

    public AbolishFlowResponse abolishFlow(AbolishFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.abolishFlowWithOptions(request, runtime);
    }

    public CloneFlowResponse cloneFlowWithOptions(CloneFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloneFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CloneFlowResponse());
    }

    public CloneFlowResponse cloneFlow(CloneFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneFlowWithOptions(request, runtime);
    }

    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowResponse());
    }

    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowResponse());
    }

    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    public DeployFlowResponse deployFlowWithOptions(DeployFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeployFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeployFlowResponse());
    }

    public DeployFlowResponse deployFlow(DeployFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployFlowWithOptions(request, runtime);
    }

    public DescribeAccountSummaryResponse describeAccountSummaryWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeAccountSummary", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountSummaryResponse());
    }

    public DescribeAccountSummaryResponse describeAccountSummary() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountSummaryWithOptions(runtime);
    }

    public DescribeConnectorAttributeResponse describeConnectorAttributeWithOptions(DescribeConnectorAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConnectorAttribute", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeConnectorAttributeResponse());
    }

    public DescribeConnectorAttributeResponse describeConnectorAttribute(DescribeConnectorAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConnectorAttributeWithOptions(request, runtime);
    }

    public DescribeConnectorCapabilityResponse describeConnectorCapabilityWithOptions(DescribeConnectorCapabilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConnectorCapability", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeConnectorCapabilityResponse());
    }

    public DescribeConnectorCapabilityResponse describeConnectorCapability(DescribeConnectorCapabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConnectorCapabilityWithOptions(request, runtime);
    }

    public DescribeFlowResponse describeFlowWithOptions(DescribeFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowResponse());
    }

    public DescribeFlowResponse describeFlow(DescribeFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowWithOptions(request, runtime);
    }

    public DescribeFlowMetricResponse describeFlowMetricWithOptions(DescribeFlowMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowMetric", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowMetricResponse());
    }

    public DescribeFlowMetricResponse describeFlowMetric(DescribeFlowMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowMetricWithOptions(request, runtime);
    }

    public DescribeFlowTemplateResponse describeFlowTemplateWithOptions(DescribeFlowTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowTemplateResponse());
    }

    public DescribeFlowTemplateResponse describeFlowTemplate(DescribeFlowTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowTemplateWithOptions(request, runtime);
    }

    public DescribeInvocationLogResponse describeInvocationLogWithOptions(DescribeInvocationLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInvocationLog", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInvocationLogResponse());
    }

    public DescribeInvocationLogResponse describeInvocationLog(DescribeInvocationLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInvocationLogWithOptions(request, runtime);
    }

    public DescribeMetricDetailResponse describeMetricDetailWithOptions(DescribeMetricDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricDetail", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricDetailResponse());
    }

    public DescribeMetricDetailResponse describeMetricDetail(DescribeMetricDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricDetailWithOptions(request, runtime);
    }

    public DisableFlowResponse disableFlowWithOptions(DisableFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DisableFlowResponse());
    }

    public DisableFlowResponse disableFlow(DisableFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableFlowWithOptions(request, runtime);
    }

    public EnableFlowResponse enableFlowWithOptions(EnableFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new EnableFlowResponse());
    }

    public EnableFlowResponse enableFlow(EnableFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableFlowWithOptions(request, runtime);
    }

    public InvokeFlowResponse invokeFlowWithOptions(InvokeFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new InvokeFlowResponse());
    }

    public InvokeFlowResponse invokeFlow(InvokeFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeFlowWithOptions(request, runtime);
    }

    public ListConnectorsResponse listConnectorsWithOptions(ListConnectorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConnectors", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListConnectorsResponse());
    }

    public ListConnectorsResponse listConnectors(ListConnectorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectorsWithOptions(request, runtime);
    }

    public ListConnectorTriggersResponse listConnectorTriggersWithOptions(ListConnectorTriggersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConnectorTriggers", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListConnectorTriggersResponse());
    }

    public ListConnectorTriggersResponse listConnectorTriggers(ListConnectorTriggersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectorTriggersWithOptions(request, runtime);
    }

    public ListFlowResponse listFlowWithOptions(ListFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowResponse());
    }

    public ListFlowResponse listFlow(ListFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowWithOptions(request, runtime);
    }

    public ListFlowConnectionsResponse listFlowConnectionsWithOptions(ListFlowConnectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowConnections", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowConnectionsResponse());
    }

    public ListFlowConnectionsResponse listFlowConnections(ListFlowConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowConnectionsWithOptions(request, runtime);
    }

    public ListFlowTemplateResponse listFlowTemplateWithOptions(ListFlowTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowTemplateResponse());
    }

    public ListFlowTemplateResponse listFlowTemplate(ListFlowTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowTemplateWithOptions(request, runtime);
    }

    public ListFlowTriggersResponse listFlowTriggersWithOptions(ListFlowTriggersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowTriggers", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowTriggersResponse());
    }

    public ListFlowTriggersResponse listFlowTriggers(ListFlowTriggersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowTriggersWithOptions(request, runtime);
    }

    public ListFlowVersionResponse listFlowVersionWithOptions(ListFlowVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowVersion", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowVersionResponse());
    }

    public ListFlowVersionResponse listFlowVersion(ListFlowVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowVersionWithOptions(request, runtime);
    }

    public ListInvocationLogsResponse listInvocationLogsWithOptions(ListInvocationLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInvocationLogs", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListInvocationLogsResponse());
    }

    public ListInvocationLogsResponse listInvocationLogs(ListInvocationLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInvocationLogsWithOptions(request, runtime);
    }

    public ListTagResponse listTagWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListTag", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResponse());
    }

    public ListTagResponse listTag() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagWithOptions(runtime);
    }

    public ModifyFlowResponse modifyFlowWithOptions(ModifyFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowResponse());
    }

    public ModifyFlowResponse modifyFlow(ModifyFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowWithOptions(request, runtime);
    }

    public RollBackFlowResponse rollBackFlowWithOptions(RollBackFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RollBackFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new RollBackFlowResponse());
    }

    public RollBackFlowResponse rollBackFlow(RollBackFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollBackFlowWithOptions(request, runtime);
    }

    public UpdateConnectionResponse updateConnectionWithOptions(UpdateConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConnection", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConnectionResponse());
    }

    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConnectionWithOptions(request, runtime);
    }
}
