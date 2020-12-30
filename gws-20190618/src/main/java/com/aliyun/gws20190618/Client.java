// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618;

import com.aliyun.tea.*;
import com.aliyun.gws20190618.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-3", "gws.ap-northeast-3.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ecd.cn-hangzhou-finance.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("gws", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCluster", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImage", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("CreateServiceLinkedRole", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceLinkedRoleResponse());
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCluster", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImage", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResource", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(runtime);
    }

    public DescribeClusterADDomainResponse describeClusterADDomainWithOptions(DescribeClusterADDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterADDomain", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterADDomainResponse());
    }

    public DescribeClusterADDomainResponse describeClusterADDomain(DescribeClusterADDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterADDomainWithOptions(request, runtime);
    }

    public DescribeClusterConnectionsResponse describeClusterConnectionsWithOptions(DescribeClusterConnectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterConnections", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterConnectionsResponse());
    }

    public DescribeClusterConnectionsResponse describeClusterConnections(DescribeClusterConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterConnectionsWithOptions(request, runtime);
    }

    public DescribeClusterPolicyResponse describeClusterPolicyWithOptions(DescribeClusterPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterPolicy", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterPolicyResponse());
    }

    public DescribeClusterPolicyResponse describeClusterPolicy(DescribeClusterPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterPolicyWithOptions(request, runtime);
    }

    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusters", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClustersResponse());
    }

    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClustersWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImages", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public DescribeInstancePolicyResponse describeInstancePolicyWithOptions(DescribeInstancePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstancePolicy", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancePolicyResponse());
    }

    public DescribeInstancePolicyResponse describeInstancePolicy(DescribeInstancePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancePolicyWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public GetConnectTicketResponse getConnectTicketWithOptions(GetConnectTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConnectTicket", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetConnectTicketResponse());
    }

    public GetConnectTicketResponse getConnectTicket(GetConnectTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConnectTicketWithOptions(request, runtime);
    }

    public IsUserAdminResponse isUserAdminWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("IsUserAdmin", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new IsUserAdminResponse());
    }

    public IsUserAdminResponse isUserAdmin() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.isUserAdminWithOptions(runtime);
    }

    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartInstance", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new RestartInstanceResponse());
    }

    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartInstanceWithOptions(request, runtime);
    }

    public SetClusterADDomainResponse setClusterADDomainWithOptions(SetClusterADDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetClusterADDomain", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetClusterADDomainResponse());
    }

    public SetClusterADDomainResponse setClusterADDomain(SetClusterADDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setClusterADDomainWithOptions(request, runtime);
    }

    public SetClusterDnatResponse setClusterDnatWithOptions(SetClusterDnatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetClusterDnat", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetClusterDnatResponse());
    }

    public SetClusterDnatResponse setClusterDnat(SetClusterDnatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setClusterDnatWithOptions(request, runtime);
    }

    public SetClusterNameResponse setClusterNameWithOptions(SetClusterNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetClusterName", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetClusterNameResponse());
    }

    public SetClusterNameResponse setClusterName(SetClusterNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setClusterNameWithOptions(request, runtime);
    }

    public SetClusterPolicyResponse setClusterPolicyWithOptions(SetClusterPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetClusterPolicy", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetClusterPolicyResponse());
    }

    public SetClusterPolicyResponse setClusterPolicy(SetClusterPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setClusterPolicyWithOptions(request, runtime);
    }

    public SetImageNameResponse setImageNameWithOptions(SetImageNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetImageName", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetImageNameResponse());
    }

    public SetImageNameResponse setImageName(SetImageNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setImageNameWithOptions(request, runtime);
    }

    public SetInstanceNameResponse setInstanceNameWithOptions(SetInstanceNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetInstanceName", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetInstanceNameResponse());
    }

    public SetInstanceNameResponse setInstanceName(SetInstanceNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setInstanceNameWithOptions(request, runtime);
    }

    public SetInstancePolicyResponse setInstancePolicyWithOptions(SetInstancePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetInstancePolicy", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetInstancePolicyResponse());
    }

    public SetInstancePolicyResponse setInstancePolicy(SetInstancePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setInstancePolicyWithOptions(request, runtime);
    }

    public SetInstanceUserResponse setInstanceUserWithOptions(SetInstanceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetInstanceUser", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetInstanceUserResponse());
    }

    public SetInstanceUserResponse setInstanceUser(SetInstanceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setInstanceUserWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartInstance", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopInstance", "2019-06-18", "HTTPS", "POST", "AK", "json", req, runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }
}
