// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521;

import com.aliyun.tea.*;
import com.aliyun.computenestsupplier20210521.models.*;
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
        this._endpoint = this.getEndpoint("computenestsupplier", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public InvokeServiceInstanceOperationAPIResponse invokeServiceInstanceOperationAPIWithOptions(InvokeServiceInstanceOperationAPIRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeServiceInstanceOperationAPI", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new InvokeServiceInstanceOperationAPIResponse());
    }

    public InvokeServiceInstanceOperationAPIResponse invokeServiceInstanceOperationAPI(InvokeServiceInstanceOperationAPIRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeServiceInstanceOperationAPIWithOptions(request, runtime);
    }

    public GetServiceInstanceResponse getServiceInstanceWithOptions(GetServiceInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceInstance", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceInstanceResponse());
    }

    public GetServiceInstanceResponse getServiceInstance(GetServiceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceInstanceWithOptions(request, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(DeleteServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteService", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteServiceResponse());
    }

    public DeleteServiceResponse deleteService(DeleteServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceWithOptions(request, runtime);
    }

    public DeleteDeploymentVersionResponse deleteDeploymentVersionWithOptions(DeleteDeploymentVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeploymentVersion", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeploymentVersionResponse());
    }

    public DeleteDeploymentVersionResponse deleteDeploymentVersion(DeleteDeploymentVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeploymentVersionWithOptions(request, runtime);
    }

    public CancelServiceRegistrationResponse cancelServiceRegistrationWithOptions(CancelServiceRegistrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelServiceRegistration", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new CancelServiceRegistrationResponse());
    }

    public CancelServiceRegistrationResponse cancelServiceRegistration(CancelServiceRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelServiceRegistrationWithOptions(request, runtime);
    }

    public DeleteDeploymentResponse deleteDeploymentWithOptions(DeleteDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeployment", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeploymentResponse());
    }

    public DeleteDeploymentResponse deleteDeployment(DeleteDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeploymentWithOptions(request, runtime);
    }

    public ValidateTemplateResponse validateTemplateWithOptions(ValidateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ValidateTemplate", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ValidateTemplateResponse());
    }

    public ValidateTemplateResponse validateTemplate(ValidateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateTemplateWithOptions(request, runtime);
    }

    public GetSupplierInformationResponse getSupplierInformationWithOptions(GetSupplierInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSupplierInformation", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetSupplierInformationResponse());
    }

    public GetSupplierInformationResponse getSupplierInformation(GetSupplierInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSupplierInformationWithOptions(request, runtime);
    }

    public ListServiceInstancesResponse listServiceInstancesWithOptions(ListServiceInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServiceInstances", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListServiceInstancesResponse());
    }

    public ListServiceInstancesResponse listServiceInstances(ListServiceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceInstancesWithOptions(request, runtime);
    }

    public RegisterServiceResponse registerServiceWithOptions(RegisterServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterService", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterServiceResponse());
    }

    public RegisterServiceResponse registerService(RegisterServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerServiceWithOptions(request, runtime);
    }

    public ListDeploymentVersionsResponse listDeploymentVersionsWithOptions(ListDeploymentVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeploymentVersions", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListDeploymentVersionsResponse());
    }

    public ListDeploymentVersionsResponse listDeploymentVersions(ListDeploymentVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeploymentVersionsWithOptions(request, runtime);
    }

    public ListPoliciesResponse listPoliciesWithOptions(ListPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPolicies", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListPoliciesResponse());
    }

    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPoliciesWithOptions(request, runtime);
    }

    public GetDeploymentVersionResponse getDeploymentVersionWithOptions(GetDeploymentVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeploymentVersion", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeploymentVersionResponse());
    }

    public GetDeploymentVersionResponse getDeploymentVersion(GetDeploymentVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeploymentVersionWithOptions(request, runtime);
    }

    public LaunchServiceResponse launchServiceWithOptions(LaunchServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LaunchService", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new LaunchServiceResponse());
    }

    public LaunchServiceResponse launchService(LaunchServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.launchServiceWithOptions(request, runtime);
    }

    public UpdateDeploymentResponse updateDeploymentWithOptions(UpdateDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeployment", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeploymentResponse());
    }

    public UpdateDeploymentResponse updateDeployment(UpdateDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeploymentWithOptions(request, runtime);
    }

    public WithdrawServiceResponse withdrawServiceWithOptions(WithdrawServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("WithdrawService", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new WithdrawServiceResponse());
    }

    public WithdrawServiceResponse withdrawService(WithdrawServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.withdrawServiceWithOptions(request, runtime);
    }

    public GetServiceProviderKeyResponse getServiceProviderKeyWithOptions(GetServiceProviderKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceProviderKey", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceProviderKeyResponse());
    }

    public GetServiceProviderKeyResponse getServiceProviderKey(GetServiceProviderKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceProviderKeyWithOptions(request, runtime);
    }

    public UpdateSupplierInformationResponse updateSupplierInformationWithOptions(UpdateSupplierInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSupplierInformation", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSupplierInformationResponse());
    }

    public UpdateSupplierInformationResponse updateSupplierInformation(UpdateSupplierInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSupplierInformationWithOptions(request, runtime);
    }

    public GetDeploymentResponse getDeploymentWithOptions(GetDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeployment", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeploymentResponse());
    }

    public GetDeploymentResponse getDeployment(GetDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeploymentWithOptions(request, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServices", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListServicesResponse());
    }

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServicesWithOptions(request, runtime);
    }

    public ListServiceRegistrationsResponse listServiceRegistrationsWithOptions(ListServiceRegistrationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServiceRegistrations", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListServiceRegistrationsResponse());
    }

    public ListServiceRegistrationsResponse listServiceRegistrations(ListServiceRegistrationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceRegistrationsWithOptions(request, runtime);
    }

    public ListDeploymentsResponse listDeploymentsWithOptions(ListDeploymentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeployments", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListDeploymentsResponse());
    }

    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeploymentsWithOptions(request, runtime);
    }

    public UpdateDeploymentVersionResponse updateDeploymentVersionWithOptions(UpdateDeploymentVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeploymentVersion", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeploymentVersionResponse());
    }

    public UpdateDeploymentVersionResponse updateDeploymentVersion(UpdateDeploymentVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeploymentVersionWithOptions(request, runtime);
    }

    public DeployApplicationsResponse deployApplicationsWithOptions(DeployApplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeployApplications", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeployApplicationsResponse());
    }

    public DeployApplicationsResponse deployApplications(DeployApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployApplicationsWithOptions(request, runtime);
    }

    public CreateDeploymentResponse createDeploymentWithOptions(CreateDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeployment", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeploymentResponse());
    }

    public CreateDeploymentResponse createDeployment(CreateDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeploymentWithOptions(request, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateService", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceResponse());
    }

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceWithOptions(request, runtime);
    }

    public UpdateServiceResponse updateServiceWithOptions(UpdateServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateService", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateServiceResponse());
    }

    public UpdateServiceResponse updateService(UpdateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServiceWithOptions(request, runtime);
    }

    public CreateDeploymentVersionResponse createDeploymentVersionWithOptions(CreateDeploymentVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeploymentVersion", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeploymentVersionResponse());
    }

    public CreateDeploymentVersionResponse createDeploymentVersion(CreateDeploymentVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeploymentVersionWithOptions(request, runtime);
    }

    public GetServiceResponse getServiceWithOptions(GetServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetService", "2021-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceResponse());
    }

    public GetServiceResponse getService(GetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceWithOptions(request, runtime);
    }
}
