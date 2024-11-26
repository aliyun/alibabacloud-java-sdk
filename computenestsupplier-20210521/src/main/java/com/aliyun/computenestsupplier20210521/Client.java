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

        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            query.put("ArtifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactPropertyShrink)) {
            query.put("ArtifactProperty", request.artifactPropertyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.artifactType)) {
            query.put("ArtifactType", request.artifactType);
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
     * @param request ListServiceSharedAccountsRequest
     * @return ListServiceSharedAccountsResponse
     */
    public ListServiceSharedAccountsResponse listServiceSharedAccounts(ListServiceSharedAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceSharedAccountsWithOptions(request, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.supplierRole)) {
            query.put("SupplierRole", request.supplierRole);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceUsages"),
            new TeaPair("version", "2021-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
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
     * <p>回滚服务实例</p>
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
     * <p>回滚服务实例</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
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
     * <p>Upgrades a service.</p>
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
     * <p>Upgrades a service.</p>
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
}
