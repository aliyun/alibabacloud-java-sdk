// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521;

import com.aliyun.tea.*;
import com.aliyun.computenestsupplier20210521.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>summary</b> : 
     * <p>Adds a shared account of a service.</p>
     * 
     * @param request AddServiceSharedAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddServiceSharedAccountsResponse
     */
    public AddServiceSharedAccountsResponse addServiceSharedAccountsWithOptions(AddServiceSharedAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedAccounts)) {
            query.put("SharedAccounts", request.sharedAccounts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddServiceSharedAccounts"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddServiceSharedAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a shared account of a service.</p>
     * 
     * @param request AddServiceSharedAccountsRequest
     * @return AddServiceSharedAccountsResponse
     */
    public AddServiceSharedAccountsResponse addServiceSharedAccounts(AddServiceSharedAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addServiceSharedAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>商家通过服务使用请求</p>
     * 
     * @param request ApproveServiceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveServiceUsageResponse
     */
    public ApproveServiceUsageResponse approveServiceUsageWithOptions(ApproveServiceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAliUid)) {
            query.put("UserAliUid", request.userAliUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveServiceUsage"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveServiceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>商家通过服务使用请求</p>
     * 
     * @param request ApproveServiceUsageRequest
     * @return ApproveServiceUsageResponse
     */
    public ApproveServiceUsageResponse approveServiceUsage(ApproveServiceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveServiceUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only service registration in the Submitted status can be canceled.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancel service registration.</p>
     * 
     * @param request CancelServiceRegistrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelServiceRegistrationResponse
     */
    public CancelServiceRegistrationResponse cancelServiceRegistrationWithOptions(CancelServiceRegistrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationId)) {
            query.put("RegistrationId", request.registrationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelServiceRegistration"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelServiceRegistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only service registration in the Submitted status can be canceled.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancel service registration.</p>
     * 
     * @param request CancelServiceRegistrationRequest
     * @return CancelServiceRegistrationResponse
     */
    public CancelServiceRegistrationResponse cancelServiceRegistration(CancelServiceRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelServiceRegistrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Redeploys a service instance after the service instance failed to be deployed.</p>
     * 
     * @param request ContinueDeployServiceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContinueDeployServiceInstanceResponse
     */
    public ContinueDeployServiceInstanceResponse continueDeployServiceInstanceWithOptions(ContinueDeployServiceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinueDeployServiceInstance"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinueDeployServiceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Redeploys a service instance after the service instance failed to be deployed.</p>
     * 
     * @param request ContinueDeployServiceInstanceRequest
     * @return ContinueDeployServiceInstanceResponse
     */
    public ContinueDeployServiceInstanceResponse continueDeployServiceInstance(ContinueDeployServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continueDeployServiceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a deployment package.</p>
     * 
     * @param tmpReq CreateArtifactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateArtifactResponse
     */
    public CreateArtifactResponse createArtifactWithOptions(CreateArtifactRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateArtifactShrinkRequest request = new CreateArtifactShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.artifactBuildProperty)) {
            request.artifactBuildPropertyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.artifactBuildProperty, "ArtifactBuildProperty", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.artifactProperty)) {
            request.artifactPropertyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.artifactProperty, "ArtifactProperty", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactBuildPropertyShrink)) {
            query.put("ArtifactBuildProperty", request.artifactBuildPropertyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactBuildType)) {
            query.put("ArtifactBuildType", request.artifactBuildType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            query.put("ArtifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactPropertyShrink)) {
            query.put("ArtifactProperty", request.artifactPropertyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactType)) {
            query.put("ArtifactType", request.artifactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportRegionIds)) {
            query.put("SupportRegionIds", request.supportRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateArtifact"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateArtifactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a deployment package.</p>
     * 
     * @param request CreateArtifactRequest
     * @return CreateArtifactResponse
     */
    public CreateArtifactResponse createArtifact(CreateArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createArtifactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service.</p>
     * 
     * @param tmpReq CreateServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateServiceShrinkRequest request = new CreateServiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.complianceMetadata)) {
            request.complianceMetadataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.complianceMetadata, "ComplianceMetadata", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmMetadata)) {
            query.put("AlarmMetadata", request.alarmMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalType)) {
            query.put("ApprovalType", request.approvalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildParameters)) {
            query.put("BuildParameters", request.buildParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complianceMetadataShrink)) {
            query.put("ComplianceMetadata", request.complianceMetadataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployMetadata)) {
            query.put("DeployMetadata", request.deployMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSupportOperated)) {
            query.put("IsSupportOperated", request.isSupportOperated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseMetadata)) {
            query.put("LicenseMetadata", request.licenseMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logMetadata)) {
            query.put("LogMetadata", request.logMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationMetadata)) {
            query.put("OperationMetadata", request.operationMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyNames)) {
            query.put("PolicyNames", request.policyNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resellable)) {
            query.put("Resellable", request.resellable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInfo)) {
            query.put("ServiceInfo", request.serviceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceServiceId)) {
            query.put("SourceServiceId", request.sourceServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceServiceVersion)) {
            query.put("SourceServiceVersion", request.sourceServiceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantType)) {
            query.put("TenantType", request.tenantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trialDuration)) {
            query.put("TrialDuration", request.trialDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeMetadata)) {
            query.put("UpgradeMetadata", request.upgradeMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateService"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service.</p>
     * 
     * @param request CreateServiceRequest
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and deploys a service instance.</p>
     * 
     * @param tmpReq CreateServiceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceInstanceResponse
     */
    public CreateServiceInstanceResponse createServiceInstanceWithOptions(CreateServiceInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateServiceInstanceShrinkRequest request = new CreateServiceInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specificationName)) {
            query.put("SpecificationName", request.specificationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceInstance"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and deploys a service instance.</p>
     * 
     * @param request CreateServiceInstanceRequest
     * @return CreateServiceInstanceResponse
     */
    public CreateServiceInstanceResponse createServiceInstance(CreateServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create service test case.</p>
     * 
     * @param request CreateServiceTestCaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceTestCaseResponse
     */
    public CreateServiceTestCaseResponse createServiceTestCaseWithOptions(CreateServiceTestCaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testCaseName)) {
            query.put("TestCaseName", request.testCaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testConfig)) {
            query.put("TestConfig", request.testConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceTestCase"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceTestCaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create service test case.</p>
     * 
     * @param request CreateServiceTestCaseRequest
     * @return CreateServiceTestCaseResponse
     */
    public CreateServiceTestCaseResponse createServiceTestCase(CreateServiceTestCaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceTestCaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务测试任务</p>
     * 
     * @param request CreateServiceTestTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceTestTaskResponse
     */
    public CreateServiceTestTaskResponse createServiceTestTaskWithOptions(CreateServiceTestTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskRegionId)) {
            query.put("TaskRegionId", request.taskRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testCaseIds)) {
            query.put("TestCaseIds", request.testCaseIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceTestTask"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceTestTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务测试任务</p>
     * 
     * @param request CreateServiceTestTaskRequest
     * @return CreateServiceTestTaskResponse
     */
    public CreateServiceTestTaskResponse createServiceTestTask(CreateServiceTestTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceTestTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create  Service resell application.</p>
     * 
     * @param request CreateServiceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceUsageResponse
     */
    public CreateServiceUsageResponse createServiceUsageWithOptions(CreateServiceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceUsage"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create  Service resell application.</p>
     * 
     * @param request CreateServiceUsageRequest
     * @return CreateServiceUsageResponse
     */
    public CreateServiceUsageResponse createServiceUsage(CreateServiceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册成为服务商</p>
     * 
     * @param request CreateSupplierRegistrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSupplierRegistrationResponse
     */
    public CreateSupplierRegistrationResponse createSupplierRegistrationWithOptions(CreateSupplierRegistrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactEmail)) {
            query.put("ContactEmail", request.contactEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactNumber)) {
            query.put("ContactNumber", request.contactNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactPerson)) {
            query.put("ContactPerson", request.contactPerson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactPersonTitle)) {
            query.put("ContactPersonTitle", request.contactPersonTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableResellerMode)) {
            query.put("EnableResellerMode", request.enableResellerMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productAnnualRevenue)) {
            query.put("ProductAnnualRevenue", request.productAnnualRevenue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productBusiness)) {
            query.put("ProductBusiness", request.productBusiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDeliveryTypes)) {
            query.put("ProductDeliveryTypes", request.productDeliveryTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productPublishTime)) {
            query.put("ProductPublishTime", request.productPublishTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productSellTypes)) {
            query.put("ProductSellTypes", request.productSellTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resellBusinessDesc)) {
            query.put("ResellBusinessDesc", request.resellBusinessDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suggestion)) {
            query.put("Suggestion", request.suggestion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierDesc)) {
            query.put("SupplierDesc", request.supplierDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierLogo)) {
            query.put("SupplierLogo", request.supplierLogo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierName)) {
            query.put("SupplierName", request.supplierName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierNameEn)) {
            query.put("SupplierNameEn", request.supplierNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierUrl)) {
            query.put("SupplierUrl", request.supplierUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSupplierRegistration"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSupplierRegistrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注册成为服务商</p>
     * 
     * @param request CreateSupplierRegistrationRequest
     * @return CreateSupplierRegistrationResponse
     */
    public CreateSupplierRegistrationResponse createSupplierRegistration(CreateSupplierRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSupplierRegistrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an artifact.</p>
     * 
     * @param request DeleteArtifactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteArtifactResponse
     */
    public DeleteArtifactResponse deleteArtifactWithOptions(DeleteArtifactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            query.put("ArtifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactVersion)) {
            query.put("ArtifactVersion", request.artifactVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteArtifact"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteArtifactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an artifact.</p>
     * 
     * @param request DeleteArtifactRequest
     * @return DeleteArtifactResponse
     */
    public DeleteArtifactResponse deleteArtifact(DeleteArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteArtifactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service.</p>
     * 
     * @param request DeleteServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteServiceWithOptions(DeleteServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service.</p>
     * 
     * @param request DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service instance.</p>
     * 
     * @param request DeleteServiceInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceInstancesResponse
     */
    public DeleteServiceInstancesResponse deleteServiceInstancesWithOptions(DeleteServiceInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceInstances"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service instance.</p>
     * 
     * @param request DeleteServiceInstancesRequest
     * @return DeleteServiceInstancesResponse
     */
    public DeleteServiceInstancesResponse deleteServiceInstances(DeleteServiceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务测试配置</p>
     * 
     * @param request DeleteServiceTestCaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceTestCaseResponse
     */
    public DeleteServiceTestCaseResponse deleteServiceTestCaseWithOptions(DeleteServiceTestCaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testCaseId)) {
            query.put("TestCaseId", request.testCaseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceTestCase"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceTestCaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务测试配置</p>
     * 
     * @param request DeleteServiceTestCaseRequest
     * @return DeleteServiceTestCaseResponse
     */
    public DeleteServiceTestCaseResponse deleteServiceTestCase(DeleteServiceTestCaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceTestCaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys a service instance.</p>
     * 
     * @param request DeployServiceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployServiceInstanceResponse
     */
    public DeployServiceInstanceResponse deployServiceInstanceWithOptions(DeployServiceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployServiceInstance"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployServiceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys a service instance.</p>
     * 
     * @param request DeployServiceInstanceRequest
     * @return DeployServiceInstanceResponse
     */
    public DeployServiceInstanceResponse deployServiceInstance(DeployServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployServiceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成默认服务测试配置</p>
     * 
     * @param request GenerateDefaultServiceTestConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateDefaultServiceTestConfigResponse
     */
    public GenerateDefaultServiceTestConfigResponse generateDefaultServiceTestConfigWithOptions(GenerateDefaultServiceTestConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDefaultServiceTestConfig"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDefaultServiceTestConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成默认服务测试配置</p>
     * 
     * @param request GenerateDefaultServiceTestConfigRequest
     * @return GenerateDefaultServiceTestConfigResponse
     */
    public GenerateDefaultServiceTestConfigResponse generateDefaultServiceTestConfig(GenerateDefaultServiceTestConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDefaultServiceTestConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成并校验服务创建stack所需要</p>
     * 
     * @param request GenerateServicePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateServicePolicyResponse
     */
    public GenerateServicePolicyResponse generateServicePolicyWithOptions(GenerateServicePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationTypes)) {
            query.put("OperationTypes", request.operationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trialType)) {
            query.put("TrialType", request.trialType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateServicePolicy"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateServicePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成并校验服务创建stack所需要</p>
     * 
     * @param request GenerateServicePolicyRequest
     * @return GenerateServicePolicyResponse
     */
    public GenerateServicePolicyResponse generateServicePolicy(GenerateServicePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateServicePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a deployment package.</p>
     * 
     * @param request GetArtifactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactResponse
     */
    public GetArtifactResponse getArtifactWithOptions(GetArtifactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            query.put("ArtifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactName)) {
            query.put("ArtifactName", request.artifactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactVersion)) {
            query.put("ArtifactVersion", request.artifactVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifact"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArtifactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a deployment package.</p>
     * 
     * @param request GetArtifactRequest
     * @return GetArtifactResponse
     */
    public GetArtifactResponse getArtifact(GetArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArtifactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the credentials that are required to upload a deployment package.</p>
     * 
     * @param request GetArtifactRepositoryCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactRepositoryCredentialsResponse
     */
    public GetArtifactRepositoryCredentialsResponse getArtifactRepositoryCredentialsWithOptions(GetArtifactRepositoryCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactType)) {
            query.put("ArtifactType", request.artifactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployRegionId)) {
            query.put("DeployRegionId", request.deployRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifactRepositoryCredentials"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArtifactRepositoryCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the credentials that are required to upload a deployment package.</p>
     * 
     * @param request GetArtifactRepositoryCredentialsRequest
     * @return GetArtifactRepositoryCredentialsResponse
     */
    public GetArtifactRepositoryCredentialsResponse getArtifactRepositoryCredentials(GetArtifactRepositoryCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArtifactRepositoryCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a service.</p>
     * 
     * @param request GetServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceResponse
     */
    public GetServiceResponse getServiceWithOptions(GetServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterAliUid)) {
            query.put("FilterAliUid", request.filterAliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedAccountType)) {
            query.put("SharedAccountType", request.sharedAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDetail)) {
            query.put("ShowDetail", request.showDetail);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a service.</p>
     * 
     * @param request GetServiceRequest
     * @return GetServiceResponse
     */
    public GetServiceResponse getService(GetServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the estimated price for creating a service instance.</p>
     * 
     * @param tmpReq GetServiceEstimateCostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceEstimateCostResponse
     */
    public GetServiceEstimateCostResponse getServiceEstimateCostWithOptions(GetServiceEstimateCostRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetServiceEstimateCostShrinkRequest request = new GetServiceEstimateCostShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commodity)) {
            request.commodityShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commodity, "Commodity", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityShrink)) {
            query.put("Commodity", request.commodityShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specificationName)) {
            query.put("SpecificationName", request.specificationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceEstimateCost"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceEstimateCostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the estimated price for creating a service instance.</p>
     * 
     * @param request GetServiceEstimateCostRequest
     * @return GetServiceEstimateCostResponse
     */
    public GetServiceEstimateCostResponse getServiceEstimateCost(GetServiceEstimateCostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceEstimateCostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a service instance.</p>
     * 
     * @param request GetServiceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceInstanceResponse
     */
    public GetServiceInstanceResponse getServiceInstanceWithOptions(GetServiceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceInstance"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a service instance.</p>
     * 
     * @param request GetServiceInstanceRequest
     * @return GetServiceInstanceResponse
     */
    public GetServiceInstanceResponse getServiceInstance(GetServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>计算巢查询服务是否开通</p>
     * 
     * @param tmpReq GetServiceProvisionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceProvisionsResponse
     */
    public GetServiceProvisionsResponse getServiceProvisionsWithOptions(GetServiceProvisionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetServiceProvisionsShrinkRequest request = new GetServiceProvisionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceProvisions"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceProvisionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>计算巢查询服务是否开通</p>
     * 
     * @param request GetServiceProvisionsRequest
     * @return GetServiceProvisionsResponse
     */
    public GetServiceProvisionsResponse getServiceProvisions(GetServiceProvisionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceProvisionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get service registration detail.</p>
     * 
     * @param request GetServiceRegistrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceRegistrationResponse
     */
    public GetServiceRegistrationResponse getServiceRegistrationWithOptions(GetServiceRegistrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationId)) {
            query.put("RegistrationId", request.registrationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceRegistration"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceRegistrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get service registration detail.</p>
     * 
     * @param request GetServiceRegistrationRequest
     * @return GetServiceRegistrationResponse
     */
    public GetServiceRegistrationResponse getServiceRegistration(GetServiceRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceRegistrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the valid values of parameters in a Resource Orchestration Service (ROS) template.</p>
     * 
     * @param request GetServiceTemplateParameterConstraintsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceTemplateParameterConstraintsResponse
     */
    public GetServiceTemplateParameterConstraintsResponse getServiceTemplateParameterConstraintsWithOptions(GetServiceTemplateParameterConstraintsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployRegionId)) {
            query.put("DeployRegionId", request.deployRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePrivateVpcConnection)) {
            query.put("EnablePrivateVpcConnection", request.enablePrivateVpcConnection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceTemplateParameterConstraints"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceTemplateParameterConstraintsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the valid values of parameters in a Resource Orchestration Service (ROS) template.</p>
     * 
     * @param request GetServiceTemplateParameterConstraintsRequest
     * @return GetServiceTemplateParameterConstraintsResponse
     */
    public GetServiceTemplateParameterConstraintsResponse getServiceTemplateParameterConstraints(GetServiceTemplateParameterConstraintsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceTemplateParameterConstraintsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务测试任务中Cases执行情况</p>
     * 
     * @param request GetServiceTestTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceTestTaskResponse
     */
    public GetServiceTestTaskResponse getServiceTestTaskWithOptions(GetServiceTestTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceTestTask"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceTestTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务测试任务中Cases执行情况</p>
     * 
     * @param request GetServiceTestTaskRequest
     * @return GetServiceTestTaskResponse
     */
    public GetServiceTestTaskResponse getServiceTestTask(GetServiceTestTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceTestTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务商信息</p>
     * 
     * @param request GetSupplierInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSupplierInformationResponse
     */
    public GetSupplierInformationResponse getSupplierInformationWithOptions(GetSupplierInformationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSupplierInformation"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSupplierInformationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务商信息</p>
     * 
     * @param request GetSupplierInformationRequest
     * @return GetSupplierInformationResponse
     */
    public GetSupplierInformationResponse getSupplierInformation(GetSupplierInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSupplierInformationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the AccessKey pair of uploaded files.</p>
     * 
     * @param request GetUploadCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadCredentialsResponse
     */
    public GetUploadCredentialsResponse getUploadCredentialsWithOptions(GetUploadCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadCredentials"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the AccessKey pair of uploaded files.</p>
     * 
     * @param request GetUploadCredentialsRequest
     * @return GetUploadCredentialsResponse
     */
    public GetUploadCredentialsResponse getUploadCredentials(GetUploadCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上线服务</p>
     * 
     * @param request LaunchServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LaunchServiceResponse
     */
    public LaunchServiceResponse launchServiceWithOptions(LaunchServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categories)) {
            query.put("Categories", request.categories);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommend)) {
            query.put("Recommend", request.recommend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LaunchService"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LaunchServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上线服务</p>
     * 
     * @param request LaunchServiceRequest
     * @return LaunchServiceResponse
     */
    public LaunchServiceResponse launchService(LaunchServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.launchServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of images uploaded to Container Registry.</p>
     * 
     * @param request ListAcrImageRepositoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAcrImageRepositoriesResponse
     */
    public ListAcrImageRepositoriesResponse listAcrImageRepositoriesWithOptions(ListAcrImageRepositoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactType)) {
            query.put("ArtifactType", request.artifactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoName)) {
            query.put("RepoName", request.repoName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAcrImageRepositories"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAcrImageRepositoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of images uploaded to Container Registry.</p>
     * 
     * @param request ListAcrImageRepositoriesRequest
     * @return ListAcrImageRepositoriesResponse
     */
    public ListAcrImageRepositoriesResponse listAcrImageRepositories(ListAcrImageRepositoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAcrImageRepositoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of images that are uploaded to the image repository.</p>
     * 
     * @param request ListAcrImageTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAcrImageTagsResponse
     */
    public ListAcrImageTagsResponse listAcrImageTagsWithOptions(ListAcrImageTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactType)) {
            query.put("ArtifactType", request.artifactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAcrImageTags"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAcrImageTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of images that are uploaded to the image repository.</p>
     * 
     * @param request ListAcrImageTagsRequest
     * @return ListAcrImageTagsResponse
     */
    public ListAcrImageTagsResponse listAcrImageTags(ListAcrImageTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAcrImageTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the list of artifact security risks</p>
     * 
     * @param request ListArtifactRisksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListArtifactRisksResponse
     */
    public ListArtifactRisksResponse listArtifactRisksWithOptions(ListArtifactRisksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            query.put("ArtifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactVersion)) {
            query.put("ArtifactVersion", request.artifactVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListArtifactRisks"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListArtifactRisksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the list of artifact security risks</p>
     * 
     * @param request ListArtifactRisksRequest
     * @return ListArtifactRisksResponse
     */
    public ListArtifactRisksResponse listArtifactRisks(ListArtifactRisksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listArtifactRisksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the version information about a deployment package.</p>
     * 
     * @param tmpReq ListArtifactVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListArtifactVersionsResponse
     */
    public ListArtifactVersionsResponse listArtifactVersionsWithOptions(ListArtifactVersionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListArtifactVersionsShrinkRequest request = new ListArtifactVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filters)) {
            request.filtersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filters, "Filters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            query.put("ArtifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filtersShrink)) {
            query.put("Filters", request.filtersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListArtifactVersions"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListArtifactVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the version information about a deployment package.</p>
     * 
     * @param request ListArtifactVersionsRequest
     * @return ListArtifactVersionsResponse
     */
    public ListArtifactVersionsResponse listArtifactVersions(ListArtifactVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listArtifactVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of deployment packages.</p>
     * 
     * @param request ListArtifactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListArtifactsResponse
     */
    public ListArtifactsResponse listArtifactsWithOptions(ListArtifactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListArtifacts"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListArtifactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of deployment packages.</p>
     * 
     * @param request ListArtifactsRequest
     * @return ListArtifactsResponse
     */
    public ListArtifactsResponse listArtifacts(ListArtifactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listArtifactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Paginated query of distributor information list</p>
     * 
     * @param request ListResellersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResellersResponse
     */
    public ListResellersResponse listResellersWithOptions(ListResellersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResellers"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResellersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Paginated query of distributor information list</p>
     * 
     * @param request ListResellersRequest
     * @return ListResellersResponse
     */
    public ListResellersResponse listResellers(ListResellersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResellersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务实例部署详情</p>
     * 
     * @param request ListServiceInstanceDeployDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceInstanceDeployDetailsResponse
     */
    public ListServiceInstanceDeployDetailsResponse listServiceInstanceDeployDetailsWithOptions(ListServiceInstanceDeployDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cycleTimeZone)) {
            query.put("CycleTimeZone", request.cycleTimeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            query.put("CycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            query.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceInstanceDeployDetails"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceInstanceDeployDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务实例部署详情</p>
     * 
     * @param request ListServiceInstanceDeployDetailsRequest
     * @return ListServiceInstanceDeployDetailsResponse
     */
    public ListServiceInstanceDeployDetailsResponse listServiceInstanceDeployDetails(ListServiceInstanceDeployDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceInstanceDeployDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>“Query logs at various levels, including service instance application, instance, and resource.”</p>
     * 
     * @param request ListServiceInstanceLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceInstanceLogsResponse
     */
    public ListServiceInstanceLogsResponse listServiceInstanceLogsWithOptions(ListServiceInstanceLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSource)) {
            query.put("LogSource", request.logSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("Logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceInstanceLogs"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceInstanceLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>“Query logs at various levels, including service instance application, instance, and resource.”</p>
     * 
     * @param request ListServiceInstanceLogsRequest
     * @return ListServiceInstanceLogsResponse
     */
    public ListServiceInstanceLogsResponse listServiceInstanceLogs(ListServiceInstanceLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceInstanceLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务实例资源</p>
     * 
     * @param request ListServiceInstanceResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceInstanceResourcesResponse
     */
    public ListServiceInstanceResourcesResponse listServiceInstanceResourcesWithOptions(ListServiceInstanceResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceResourceType)) {
            query.put("ServiceInstanceResourceType", request.serviceInstanceResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceInstanceResources"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceInstanceResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务实例资源</p>
     * 
     * @param request ListServiceInstanceResourcesRequest
     * @return ListServiceInstanceResourcesResponse
     */
    public ListServiceInstanceResourcesResponse listServiceInstanceResources(ListServiceInstanceResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceInstanceResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>View the upgrade history of a service instance</p>
     * 
     * @param request ListServiceInstanceUpgradeHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceInstanceUpgradeHistoryResponse
     */
    public ListServiceInstanceUpgradeHistoryResponse listServiceInstanceUpgradeHistoryWithOptions(ListServiceInstanceUpgradeHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceInstanceUpgradeHistory"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceInstanceUpgradeHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>View the upgrade history of a service instance</p>
     * 
     * @param request ListServiceInstanceUpgradeHistoryRequest
     * @return ListServiceInstanceUpgradeHistoryResponse
     */
    public ListServiceInstanceUpgradeHistoryResponse listServiceInstanceUpgradeHistory(ListServiceInstanceUpgradeHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceInstanceUpgradeHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of service instances.</p>
     * 
     * @param request ListServiceInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceInstancesResponse
     */
    public ListServiceInstancesResponse listServiceInstancesWithOptions(ListServiceInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDeleted)) {
            query.put("ShowDeleted", request.showDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceInstances"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of service instances.</p>
     * 
     * @param request ListServiceInstancesRequest
     * @return ListServiceInstancesResponse
     */
    public ListServiceInstancesResponse listServiceInstances(ListServiceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query service registrations.</p>
     * 
     * @param request ListServiceRegistrationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceRegistrationsResponse
     */
    public ListServiceRegistrationsResponse listServiceRegistrationsWithOptions(ListServiceRegistrationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceRegistrations"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceRegistrationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query service registrations.</p>
     * 
     * @param request ListServiceRegistrationsRequest
     * @return ListServiceRegistrationsResponse
     */
    public ListServiceRegistrationsResponse listServiceRegistrations(ListServiceRegistrationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceRegistrationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用ListServiceSharedAccounts查看服务共享账号列表。</p>
     * 
     * @param request ListServiceSharedAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceSharedAccountsResponse
     */
    public ListServiceSharedAccountsResponse listServiceSharedAccountsWithOptions(ListServiceSharedAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permission)) {
            query.put("Permission", request.permission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceSharedAccounts"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceSharedAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用ListServiceSharedAccounts查看服务共享账号列表。</p>
     * 
     * @param request ListServiceSharedAccountsRequest
     * @return ListServiceSharedAccountsResponse
     */
    public ListServiceSharedAccountsResponse listServiceSharedAccounts(ListServiceSharedAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceSharedAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>服务测试用例列表</p>
     * 
     * @param request ListServiceTestCasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceTestCasesResponse
     */
    public ListServiceTestCasesResponse listServiceTestCasesWithOptions(ListServiceTestCasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceTestCases"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceTestCasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>服务测试用例列表</p>
     * 
     * @param request ListServiceTestCasesRequest
     * @return ListServiceTestCasesResponse
     */
    public ListServiceTestCasesResponse listServiceTestCases(ListServiceTestCasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceTestCasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务测试实时日志</p>
     * 
     * @param request ListServiceTestTaskLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceTestTaskLogsResponse
     */
    public ListServiceTestTaskLogsResponse listServiceTestTaskLogsWithOptions(ListServiceTestTaskLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceTestTaskLogs"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceTestTaskLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务测试实时日志</p>
     * 
     * @param request ListServiceTestTaskLogsRequest
     * @return ListServiceTestTaskLogsResponse
     */
    public ListServiceTestTaskLogsResponse listServiceTestTaskLogs(ListServiceTestTaskLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceTestTaskLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务执行列表</p>
     * 
     * @param request ListServiceTestTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceTestTasksResponse
     */
    public ListServiceTestTasksResponse listServiceTestTasksWithOptions(ListServiceTestTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceTestTasks"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceTestTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务执行列表</p>
     * 
     * @param request ListServiceTestTasksRequest
     * @return ListServiceTestTasksResponse
     */
    public ListServiceTestTasksResponse listServiceTestTasks(ListServiceTestTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceTestTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications for using a service.</p>
     * 
     * @param request ListServiceUsagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceUsagesResponse
     */
    public ListServiceUsagesResponse listServiceUsagesWithOptions(ListServiceUsagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceUsages"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceUsagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications for using a service.</p>
     * 
     * @param request ListServiceUsagesRequest
     * @return ListServiceUsagesResponse
     */
    public ListServiceUsagesResponse listServiceUsages(ListServiceUsagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceUsagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of services.</p>
     * 
     * @param request ListServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServicesResponse
     */
    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allVersions)) {
            query.put("AllVersions", request.allVersions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of services.</p>
     * 
     * @param request ListServicesRequest
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务商入职审核列表</p>
     * 
     * @param request ListSupplierRegistrationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSupplierRegistrationsResponse
     */
    public ListSupplierRegistrationsResponse listSupplierRegistrationsWithOptions(ListSupplierRegistrationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSupplierRegistrations"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSupplierRegistrationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务商入职审核列表</p>
     * 
     * @param request ListSupplierRegistrationsRequest
     * @return ListSupplierRegistrationsResponse
     */
    public ListSupplierRegistrationsResponse listSupplierRegistrations(ListSupplierRegistrationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSupplierRegistrationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询标签键列表</p>
     * 
     * @param request ListTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询标签键列表</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源标签</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源标签</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询标签值列表</p>
     * 
     * @param request ListTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询标签值列表</p>
     * 
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the resource information about a service instance.</p>
     * 
     * @param request ModifyServiceInstanceResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyServiceInstanceResourcesResponse
     */
    public ModifyServiceInstanceResourcesResponse modifyServiceInstanceResourcesWithOptions(ModifyServiceInstanceResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceResourcesAction)) {
            query.put("ServiceInstanceResourcesAction", request.serviceInstanceResourcesAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyServiceInstanceResources"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyServiceInstanceResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the resource information about a service instance.</p>
     * 
     * @param request ModifyServiceInstanceResourcesRequest
     * @return ModifyServiceInstanceResourcesResponse
     */
    public ModifyServiceInstanceResourcesResponse modifyServiceInstanceResources(ModifyServiceInstanceResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyServiceInstanceResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预发布服务</p>
     * 
     * @param request PreLaunchServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreLaunchServiceResponse
     */
    public PreLaunchServiceResponse preLaunchServiceWithOptions(PreLaunchServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreLaunchService"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreLaunchServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预发布服务</p>
     * 
     * @param request PreLaunchServiceRequest
     * @return PreLaunchServiceResponse
     */
    public PreLaunchServiceResponse preLaunchService(PreLaunchServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preLaunchServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pushes metering data of an Alibaba Cloud Marketplace commodity.</p>
     * 
     * @param request PushMeteringDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushMeteringDataResponse
     */
    public PushMeteringDataResponse pushMeteringDataWithOptions(PushMeteringDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metering)) {
            query.put("Metering", request.metering);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushMeteringData"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushMeteringDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Pushes metering data of an Alibaba Cloud Marketplace commodity.</p>
     * 
     * @param request PushMeteringDataRequest
     * @return PushMeteringDataResponse
     */
    public PushMeteringDataResponse pushMeteringData(PushMeteringDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMeteringDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers an artifact.</p>
     * 
     * @param request RegisterServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterServiceResponse
     */
    public RegisterServiceResponse registerServiceWithOptions(RegisterServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterService"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Registers an artifact.</p>
     * 
     * @param request RegisterServiceRequest
     * @return RegisterServiceResponse
     */
    public RegisterServiceResponse registerService(RegisterServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reject service usage.</p>
     * 
     * @param request RejectServiceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RejectServiceUsageResponse
     */
    public RejectServiceUsageResponse rejectServiceUsageWithOptions(RejectServiceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAliUid)) {
            query.put("UserAliUid", request.userAliUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectServiceUsage"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectServiceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reject service usage.</p>
     * 
     * @param request RejectServiceUsageRequest
     * @return RejectServiceUsageResponse
     */
    public RejectServiceUsageResponse rejectServiceUsage(RejectServiceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectServiceUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Publishes an artifact.</p>
     * 
     * @param request ReleaseArtifactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseArtifactResponse
     */
    public ReleaseArtifactResponse releaseArtifactWithOptions(ReleaseArtifactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            query.put("ArtifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseArtifact"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseArtifactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Publishes an artifact.</p>
     * 
     * @param request ReleaseArtifactRequest
     * @return ReleaseArtifactResponse
     */
    public ReleaseArtifactResponse releaseArtifact(ReleaseArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseArtifactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Remove  service shared account.</p>
     * 
     * @param request RemoveServiceSharedAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveServiceSharedAccountsResponse
     */
    public RemoveServiceSharedAccountsResponse removeServiceSharedAccountsWithOptions(RemoveServiceSharedAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAliUids)) {
            query.put("UserAliUids", request.userAliUids);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveServiceSharedAccounts"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveServiceSharedAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Remove  service shared account.</p>
     * 
     * @param request RemoveServiceSharedAccountsRequest
     * @return RemoveServiceSharedAccountsResponse
     */
    public RemoveServiceSharedAccountsResponse removeServiceSharedAccounts(RemoveServiceSharedAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeServiceSharedAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>When the service instance is Deployed, call the RestartServiceInstance interface to restart the service instance.</p>
     * 
     * @param request RestartServiceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartServiceInstanceResponse
     */
    public RestartServiceInstanceResponse restartServiceInstanceWithOptions(RestartServiceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartServiceInstance"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartServiceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>When the service instance is Deployed, call the RestartServiceInstance interface to restart the service instance.</p>
     * 
     * @param request RestartServiceInstanceRequest
     * @return RestartServiceInstanceResponse
     */
    public RestartServiceInstanceResponse restartServiceInstance(RestartServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartServiceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rollback Service Instance</p>
     * 
     * @param request RollbackServiceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackServiceInstanceResponse
     */
    public RollbackServiceInstanceResponse rollbackServiceInstanceWithOptions(RollbackServiceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackServiceInstance"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackServiceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rollback Service Instance</p>
     * 
     * @param request RollbackServiceInstanceRequest
     * @return RollbackServiceInstanceResponse
     */
    public RollbackServiceInstanceResponse rollbackServiceInstance(RollbackServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackServiceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>When the service instance status is Stopped (Stopped) or StartFailed (Startup failed), the StartServiceInstance interface is invoked to start the service instance.</p>
     * 
     * @param request StartServiceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartServiceInstanceResponse
     */
    public StartServiceInstanceResponse startServiceInstanceWithOptions(StartServiceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartServiceInstance"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartServiceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>When the service instance status is Stopped (Stopped) or StartFailed (Startup failed), the StartServiceInstance interface is invoked to start the service instance.</p>
     * 
     * @param request StartServiceInstanceRequest
     * @return StartServiceInstanceResponse
     */
    public StartServiceInstanceResponse startServiceInstance(StartServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startServiceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>When the service instance is Deployed and StopFailed, call the StopServiceInstance interface to stop the service instance.</p>
     * 
     * @param request StopServiceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopServiceInstanceResponse
     */
    public StopServiceInstanceResponse stopServiceInstanceWithOptions(StopServiceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopServiceInstance"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopServiceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>When the service instance is Deployed and StopFailed, call the StopServiceInstance interface to stop the service instance.</p>
     * 
     * @param request StopServiceInstanceRequest
     * @return StopServiceInstanceResponse
     */
    public StopServiceInstanceResponse stopServiceInstance(StopServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopServiceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>给资源打标签</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>给资源打标签</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>资源解绑标签</p>
     * 
     * @param request UnTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnTagResources"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>资源解绑标签</p>
     * 
     * @param request UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a deployment package.</p>
     * 
     * @param tmpReq UpdateArtifactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateArtifactResponse
     */
    public UpdateArtifactResponse updateArtifactWithOptions(UpdateArtifactRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateArtifactShrinkRequest request = new UpdateArtifactShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.artifactBuildProperty)) {
            request.artifactBuildPropertyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.artifactBuildProperty, "ArtifactBuildProperty", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.artifactProperty)) {
            request.artifactPropertyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.artifactProperty, "ArtifactProperty", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactBuildPropertyShrink)) {
            query.put("ArtifactBuildProperty", request.artifactBuildPropertyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            query.put("ArtifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactPropertyShrink)) {
            query.put("ArtifactProperty", request.artifactPropertyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionType)) {
            query.put("PermissionType", request.permissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportRegionIds)) {
            query.put("SupportRegionIds", request.supportRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateArtifact"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateArtifactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a deployment package.</p>
     * 
     * @param request UpdateArtifactRequest
     * @return UpdateArtifactResponse
     */
    public UpdateArtifactResponse updateArtifact(UpdateArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateArtifactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update a service.</p>
     * 
     * @param tmpReq UpdateServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateServiceWithOptions(UpdateServiceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateServiceShrinkRequest request = new UpdateServiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commodity)) {
            request.commodityShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commodity, "Commodity", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.complianceMetadata)) {
            request.complianceMetadataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.complianceMetadata, "ComplianceMetadata", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateOption)) {
            request.updateOptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateOption, "UpdateOption", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmMetadata)) {
            query.put("AlarmMetadata", request.alarmMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalType)) {
            query.put("ApprovalType", request.approvalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityShrink)) {
            query.put("Commodity", request.commodityShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complianceMetadataShrink)) {
            query.put("ComplianceMetadata", request.complianceMetadataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployMetadata)) {
            query.put("DeployMetadata", request.deployMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSupportOperated)) {
            query.put("IsSupportOperated", request.isSupportOperated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseMetadata)) {
            query.put("LicenseMetadata", request.licenseMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logMetadata)) {
            query.put("LogMetadata", request.logMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationMetadata)) {
            query.put("OperationMetadata", request.operationMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyNames)) {
            query.put("PolicyNames", request.policyNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resellable)) {
            query.put("Resellable", request.resellable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInfo)) {
            query.put("ServiceInfo", request.serviceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantType)) {
            query.put("TenantType", request.tenantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trialDuration)) {
            query.put("TrialDuration", request.trialDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateOptionShrink)) {
            query.put("UpdateOption", request.updateOptionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeMetadata)) {
            query.put("UpgradeMetadata", request.upgradeMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateService"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update a service.</p>
     * 
     * @param request UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the properties of a service instance.</p>
     * 
     * @param tmpReq UpdateServiceInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceInstanceAttributeResponse
     */
    public UpdateServiceInstanceAttributeResponse updateServiceInstanceAttributeWithOptions(UpdateServiceInstanceAttributeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateServiceInstanceAttributeShrinkRequest request = new UpdateServiceInstanceAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.licenseData)) {
            request.licenseDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.licenseData, "LicenseData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseDataShrink)) {
            query.put("LicenseData", request.licenseDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceInstanceAttribute"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceInstanceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the properties of a service instance.</p>
     * 
     * @param request UpdateServiceInstanceAttributeRequest
     * @return UpdateServiceInstanceAttributeResponse
     */
    public UpdateServiceInstanceAttributeResponse updateServiceInstanceAttribute(UpdateServiceInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of a service instance.</p>
     * 
     * @param tmpReq UpdateServiceInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceInstanceSpecResponse
     */
    public UpdateServiceInstanceSpecResponse updateServiceInstanceSpecWithOptions(UpdateServiceInstanceSpecRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateServiceInstanceSpecShrinkRequest request = new UpdateServiceInstanceSpecShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableUserPrometheus)) {
            query.put("EnableUserPrometheus", request.enableUserPrometheus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationName)) {
            query.put("OperationName", request.operationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predefinedParametersName)) {
            query.put("PredefinedParametersName", request.predefinedParametersName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceInstanceSpec"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceInstanceSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of a service instance.</p>
     * 
     * @param request UpdateServiceInstanceSpecRequest
     * @return UpdateServiceInstanceSpecResponse
     */
    public UpdateServiceInstanceSpecResponse updateServiceInstanceSpec(UpdateServiceInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceInstanceSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改服务测试用例</p>
     * 
     * @param request UpdateServiceTestCaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceTestCaseResponse
     */
    public UpdateServiceTestCaseResponse updateServiceTestCaseWithOptions(UpdateServiceTestCaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testCaseId)) {
            query.put("TestCaseId", request.testCaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testCaseName)) {
            query.put("TestCaseName", request.testCaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testConfig)) {
            query.put("TestConfig", request.testConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceTestCase"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceTestCaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改服务测试用例</p>
     * 
     * @param request UpdateServiceTestCaseRequest
     * @return UpdateServiceTestCaseResponse
     */
    public UpdateServiceTestCaseResponse updateServiceTestCase(UpdateServiceTestCaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceTestCaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Service Sharing Permissions</p>
     * 
     * @param request UpdateSharedAccountPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSharedAccountPermissionResponse
     */
    public UpdateSharedAccountPermissionResponse updateSharedAccountPermissionWithOptions(UpdateSharedAccountPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permission)) {
            query.put("Permission", request.permission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAliUid)) {
            query.put("UserAliUid", request.userAliUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSharedAccountPermission"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSharedAccountPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Service Sharing Permissions</p>
     * 
     * @param request UpdateSharedAccountPermissionRequest
     * @return UpdateSharedAccountPermissionResponse
     */
    public UpdateSharedAccountPermissionResponse updateSharedAccountPermission(UpdateSharedAccountPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSharedAccountPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新供应商全局信息</p>
     * 
     * @param request UpdateSupplierInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSupplierInformationResponse
     */
    public UpdateSupplierInformationResponse updateSupplierInformationWithOptions(UpdateSupplierInformationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliverySettings)) {
            query.put("DeliverySettings", request.deliverySettings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationIp)) {
            query.put("OperationIp", request.operationIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationMfaPresent)) {
            query.put("OperationMfaPresent", request.operationMfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierDesc)) {
            query.put("SupplierDesc", request.supplierDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierLogo)) {
            query.put("SupplierLogo", request.supplierLogo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierUrl)) {
            query.put("SupplierUrl", request.supplierUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportContacts)) {
            query.put("SupportContacts", request.supportContacts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSupplierInformation"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSupplierInformationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新供应商全局信息</p>
     * 
     * @param request UpdateSupplierInformationRequest
     * @return UpdateSupplierInformationResponse
     */
    public UpdateSupplierInformationResponse updateSupplierInformation(UpdateSupplierInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSupplierInformationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a service instance.</p>
     * 
     * @param tmpReq UpgradeServiceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeServiceInstanceResponse
     */
    public UpgradeServiceInstanceResponse upgradeServiceInstanceWithOptions(UpgradeServiceInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpgradeServiceInstanceShrinkRequest request = new UpgradeServiceInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInstanceId)) {
            query.put("ServiceInstanceId", request.serviceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeServiceInstance"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeServiceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a service instance.</p>
     * 
     * @param request UpgradeServiceInstanceRequest
     * @return UpgradeServiceInstanceResponse
     */
    public UpgradeServiceInstanceResponse upgradeServiceInstance(UpgradeServiceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeServiceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Withdraw service version.</p>
     * 
     * @param request WithdrawServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WithdrawServiceResponse
     */
    public WithdrawServiceResponse withdrawServiceWithOptions(WithdrawServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WithdrawService"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WithdrawServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Withdraw service version.</p>
     * 
     * @param request WithdrawServiceRequest
     * @return WithdrawServiceResponse
     */
    public WithdrawServiceResponse withdrawService(WithdrawServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.withdrawServiceWithOptions(request, runtime);
    }
}
