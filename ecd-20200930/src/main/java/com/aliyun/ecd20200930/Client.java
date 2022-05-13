// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930;

import com.aliyun.tea.*;
import com.aliyun.ecd20200930.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ecd", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActivateOfficeSiteResponse activateOfficeSiteWithOptions(ActivateOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateOfficeSite"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateOfficeSiteResponse());
    }

    public ActivateOfficeSiteResponse activateOfficeSite(ActivateOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateOfficeSiteWithOptions(request, runtime);
    }

    public AddUserToDesktopGroupResponse addUserToDesktopGroupWithOptions(AddUserToDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupIds)) {
            query.put("DesktopGroupIds", request.desktopGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserToDesktopGroupResponse());
    }

    public AddUserToDesktopGroupResponse addUserToDesktopGroup(AddUserToDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserToDesktopGroupWithOptions(request, runtime);
    }

    public ApproveFotaUpdateResponse approveFotaUpdateWithOptions(ApproveFotaUpdateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveFotaUpdate"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveFotaUpdateResponse());
    }

    public ApproveFotaUpdateResponse approveFotaUpdate(ApproveFotaUpdateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.approveFotaUpdateWithOptions(request, runtime);
    }

    public AttachCenResponse attachCenWithOptions(AttachCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachCen"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachCenResponse());
    }

    public AttachCenResponse attachCen(AttachCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachCenWithOptions(request, runtime);
    }

    public CheckUserTagsResponse checkUserTagsWithOptions(CheckUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUserTags"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUserTagsResponse());
    }

    public CheckUserTagsResponse checkUserTags(CheckUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkUserTagsWithOptions(request, runtime);
    }

    public ClonePolicyGroupResponse clonePolicyGroupWithOptions(ClonePolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClonePolicyGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClonePolicyGroupResponse());
    }

    public ClonePolicyGroupResponse clonePolicyGroup(ClonePolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clonePolicyGroupWithOptions(request, runtime);
    }

    public ConfigADConnectorTrustResponse configADConnectorTrustWithOptions(ConfigADConnectorTrustRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustKey)) {
            query.put("TrustKey", request.trustKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigADConnectorTrust"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigADConnectorTrustResponse());
    }

    public ConfigADConnectorTrustResponse configADConnectorTrust(ConfigADConnectorTrustRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configADConnectorTrustWithOptions(request, runtime);
    }

    public ConfigADConnectorUserResponse configADConnectorUserWithOptions(ConfigADConnectorUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OUName)) {
            query.put("OUName", request.OUName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigADConnectorUser"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigADConnectorUserResponse());
    }

    public ConfigADConnectorUserResponse configADConnectorUser(ConfigADConnectorUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configADConnectorUserWithOptions(request, runtime);
    }

    public CreateADConnectorDirectoryResponse createADConnectorDirectoryWithOptions(CreateADConnectorDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryName)) {
            query.put("DirectoryName", request.directoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsAddress)) {
            query.put("DnsAddress", request.dnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdminAccess)) {
            query.put("EnableAdminAccess", request.enableAdminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainDnsAddress)) {
            query.put("SubDomainDnsAddress", request.subDomainDnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainName)) {
            query.put("SubDomainName", request.subDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateADConnectorDirectory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateADConnectorDirectoryResponse());
    }

    public CreateADConnectorDirectoryResponse createADConnectorDirectory(CreateADConnectorDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createADConnectorDirectoryWithOptions(request, runtime);
    }

    public CreateADConnectorOfficeSiteResponse createADConnectorOfficeSiteWithOptions(CreateADConnectorOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adHostname)) {
            query.put("AdHostname", request.adHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsAddress)) {
            query.put("DnsAddress", request.dnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdminAccess)) {
            query.put("EnableAdminAccess", request.enableAdminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInternetAccess)) {
            query.put("EnableInternetAccess", request.enableInternetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainDnsAddress)) {
            query.put("SubDomainDnsAddress", request.subDomainDnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainName)) {
            query.put("SubDomainName", request.subDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateADConnectorOfficeSite"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateADConnectorOfficeSiteResponse());
    }

    public CreateADConnectorOfficeSiteResponse createADConnectorOfficeSite(CreateADConnectorOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createADConnectorOfficeSiteWithOptions(request, runtime);
    }

    public CreateBandwidthResourcePackagesResponse createBandwidthResourcePackagesWithOptions(CreateBandwidthResourcePackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageSize)) {
            query.put("PackageSize", request.packageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBandwidthResourcePackages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBandwidthResourcePackagesResponse());
    }

    public CreateBandwidthResourcePackagesResponse createBandwidthResourcePackages(CreateBandwidthResourcePackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBandwidthResourcePackagesWithOptions(request, runtime);
    }

    public CreateBundleResponse createBundleWithOptions(CreateBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleName)) {
            query.put("BundleName", request.bundleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopType)) {
            query.put("DesktopType", request.desktopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskPerformanceLevel)) {
            query.put("RootDiskPerformanceLevel", request.rootDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskSizeGib)) {
            query.put("RootDiskSizeGib", request.rootDiskSizeGib);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskPerformanceLevel)) {
            query.put("UserDiskPerformanceLevel", request.userDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskSizeGib)) {
            query.put("UserDiskSizeGib", request.userDiskSizeGib);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBundle"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBundleResponse());
    }

    public CreateBundleResponse createBundle(CreateBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBundleWithOptions(request, runtime);
    }

    public CreateDesktopGroupResponse createDesktopGroupWithOptions(CreateDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allClassifyUsers)) {
            query.put("AllClassifyUsers", request.allClassifyUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowAutoSetup)) {
            query.put("AllowAutoSetup", request.allowAutoSetup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowBufferCount)) {
            query.put("AllowBufferCount", request.allowBufferCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindAmount)) {
            query.put("BindAmount", request.bindAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classify)) {
            query.put("Classify", request.classify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultInitDesktopCount)) {
            query.put("DefaultInitDesktopCount", request.defaultInitDesktopCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupName)) {
            query.put("DesktopGroupName", request.desktopGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepDuration)) {
            query.put("KeepDuration", request.keepDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadPolicy)) {
            query.put("LoadPolicy", request.loadPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDesktopsCount)) {
            query.put("MaxDesktopsCount", request.maxDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDesktopsCount)) {
            query.put("MinDesktopsCount", request.minDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownType)) {
            query.put("OwnType", request.ownType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            query.put("ResetType", request.resetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleStrategyId)) {
            query.put("ScaleStrategyId", request.scaleStrategyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDesktopGroupResponse());
    }

    public CreateDesktopGroupResponse createDesktopGroup(CreateDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDesktopGroupWithOptions(request, runtime);
    }

    public CreateDesktopsResponse createDesktopsWithOptions(CreateDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopNameSuffix)) {
            query.put("DesktopNameSuffix", request.desktopNameSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            query.put("Hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAssignMode)) {
            query.put("UserAssignMode", request.userAssignMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDesktopsResponse());
    }

    public CreateDesktopsResponse createDesktops(CreateDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDesktopsWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageResourceType)) {
            query.put("ImageResourceType", request.imageResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotIds)) {
            query.put("SnapshotIds", request.snapshotIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public CreateNASFileSystemResponse createNASFileSystemWithOptions(CreateNASFileSystemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNASFileSystem"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNASFileSystemResponse());
    }

    public CreateNASFileSystemResponse createNASFileSystem(CreateNASFileSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNASFileSystemWithOptions(request, runtime);
    }

    public CreateNetworkPackageResponse createNetworkPackageWithOptions(CreateNetworkPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkPackage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkPackageResponse());
    }

    public CreateNetworkPackageResponse createNetworkPackage(CreateNetworkPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkPackageWithOptions(request, runtime);
    }

    public CreateOrderForHardwareResponse createOrderForHardwareWithOptions(CreateOrderForHardwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityName)) {
            query.put("CityName", request.cityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryName)) {
            query.put("CountryName", request.countryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailAddress)) {
            query.put("DetailAddress", request.detailAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtCode)) {
            query.put("DistrictCode", request.districtCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtName)) {
            query.put("DistrictName", request.districtName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hardwareType)) {
            query.put("HardwareType", request.hardwareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hardwareVersion)) {
            query.put("HardwareVersion", request.hardwareVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobilePhone)) {
            query.put("MobilePhone", request.mobilePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provCode)) {
            query.put("ProvCode", request.provCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provName)) {
            query.put("ProvName", request.provName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streetCode)) {
            query.put("StreetCode", request.streetCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streetName)) {
            query.put("StreetName", request.streetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zipCode)) {
            query.put("ZipCode", request.zipCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrderForHardware"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderForHardwareResponse());
    }

    public CreateOrderForHardwareResponse createOrderForHardware(CreateOrderForHardwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderForHardwareWithOptions(request, runtime);
    }

    public CreatePolicyGroupResponse createPolicyGroupWithOptions(CreatePolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizeAccessPolicyRule)) {
            query.put("AuthorizeAccessPolicyRule", request.authorizeAccessPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeSecurityPolicyRule)) {
            query.put("AuthorizeSecurityPolicyRule", request.authorizeSecurityPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraRedirect)) {
            query.put("CameraRedirect", request.cameraRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            query.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainList)) {
            query.put("DomainList", request.domainList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuAcceleration)) {
            query.put("GpuAcceleration", request.gpuAcceleration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5Access)) {
            query.put("Html5Access", request.html5Access);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5FileTransfer)) {
            query.put("Html5FileTransfer", request.html5FileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localDrive)) {
            query.put("LocalDrive", request.localDrive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preemptLogin)) {
            query.put("PreemptLogin", request.preemptLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preemptLoginUser)) {
            query.put("PreemptLoginUser", request.preemptLoginUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.printerRedirection)) {
            query.put("PrinterRedirection", request.printerRedirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recording)) {
            query.put("Recording", request.recording);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingEndTime)) {
            query.put("RecordingEndTime", request.recordingEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingFps)) {
            query.put("RecordingFps", request.recordingFps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingStartTime)) {
            query.put("RecordingStartTime", request.recordingStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usbRedirect)) {
            query.put("UsbRedirect", request.usbRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usbSupplyRedirectRule)) {
            query.put("UsbSupplyRedirectRule", request.usbSupplyRedirectRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visualQuality)) {
            query.put("VisualQuality", request.visualQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermark)) {
            query.put("Watermark", request.watermark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkCustomText)) {
            query.put("WatermarkCustomText", request.watermarkCustomText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkTransparency)) {
            query.put("WatermarkTransparency", request.watermarkTransparency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkType)) {
            query.put("WatermarkType", request.watermarkType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicyGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyGroupResponse());
    }

    public CreatePolicyGroupResponse createPolicyGroup(CreatePolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPolicyGroupWithOptions(request, runtime);
    }

    public CreateRAMDirectoryResponse createRAMDirectoryWithOptions(CreateRAMDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryName)) {
            query.put("DirectoryName", request.directoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdminAccess)) {
            query.put("EnableAdminAccess", request.enableAdminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInternetAccess)) {
            query.put("EnableInternetAccess", request.enableInternetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRAMDirectory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRAMDirectoryResponse());
    }

    public CreateRAMDirectoryResponse createRAMDirectory(CreateRAMDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRAMDirectoryWithOptions(request, runtime);
    }

    public CreateSimpleOfficeSiteResponse createSimpleOfficeSiteWithOptions(CreateSimpleOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudBoxOfficeSite)) {
            query.put("CloudBoxOfficeSite", request.cloudBoxOfficeSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdminAccess)) {
            query.put("EnableAdminAccess", request.enableAdminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInternetAccess)) {
            query.put("EnableInternetAccess", request.enableInternetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needVerifyZeroDevice)) {
            query.put("NeedVerifyZeroDevice", request.needVerifyZeroDevice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSimpleOfficeSite"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSimpleOfficeSiteResponse());
    }

    public CreateSimpleOfficeSiteResponse createSimpleOfficeSite(CreateSimpleOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSimpleOfficeSiteWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDiskType)) {
            query.put("SourceDiskType", request.sourceDiskType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public CreateUserTagsResponse createUserTagsWithOptions(CreateUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserTags"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserTagsResponse());
    }

    public CreateUserTagsResponse createUserTags(CreateUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserTagsWithOptions(request, runtime);
    }

    public DeleteBundlesResponse deleteBundlesWithOptions(DeleteBundlesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBundles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBundlesResponse());
    }

    public DeleteBundlesResponse deleteBundles(DeleteBundlesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBundlesWithOptions(request, runtime);
    }

    public DeleteDesktopGroupResponse deleteDesktopGroupWithOptions(DeleteDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDesktopGroupResponse());
    }

    public DeleteDesktopGroupResponse deleteDesktopGroup(DeleteDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDesktopGroupWithOptions(request, runtime);
    }

    public DeleteDesktopsResponse deleteDesktopsWithOptions(DeleteDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDesktopsResponse());
    }

    public DeleteDesktopsResponse deleteDesktops(DeleteDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDesktopsWithOptions(request, runtime);
    }

    public DeleteDirectoriesResponse deleteDirectoriesWithOptions(DeleteDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDirectories"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDirectoriesResponse());
    }

    public DeleteDirectoriesResponse deleteDirectories(DeleteDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDirectoriesWithOptions(request, runtime);
    }

    public DeleteImagesResponse deleteImagesWithOptions(DeleteImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImagesResponse());
    }

    public DeleteImagesResponse deleteImages(DeleteImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImagesWithOptions(request, runtime);
    }

    public DeleteNASFileSystemsResponse deleteNASFileSystemsWithOptions(DeleteNASFileSystemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNASFileSystems"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNASFileSystemsResponse());
    }

    public DeleteNASFileSystemsResponse deleteNASFileSystems(DeleteNASFileSystemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNASFileSystemsWithOptions(request, runtime);
    }

    public DeleteNetworkPackagesResponse deleteNetworkPackagesWithOptions(DeleteNetworkPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkPackages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkPackagesResponse());
    }

    public DeleteNetworkPackagesResponse deleteNetworkPackages(DeleteNetworkPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkPackagesWithOptions(request, runtime);
    }

    public DeleteOfficeSitesResponse deleteOfficeSitesWithOptions(DeleteOfficeSitesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOfficeSites"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOfficeSitesResponse());
    }

    public DeleteOfficeSitesResponse deleteOfficeSites(DeleteOfficeSitesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOfficeSitesWithOptions(request, runtime);
    }

    public DeletePolicyGroupsResponse deletePolicyGroupsWithOptions(DeletePolicyGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyGroups"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyGroupsResponse());
    }

    public DeletePolicyGroupsResponse deletePolicyGroups(DeletePolicyGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePolicyGroupsWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public DeleteUserTagsResponse deleteUserTagsWithOptions(DeleteUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserTags"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserTagsResponse());
    }

    public DeleteUserTagsResponse deleteUserTags(DeleteUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserTagsWithOptions(request, runtime);
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADeviceWithOptions(DeleteVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirtualMFADevice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualMFADeviceResponse());
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVirtualMFADeviceWithOptions(request, runtime);
    }

    public DescribeAlarmEventStackInfoResponse describeAlarmEventStackInfoWithOptions(DescribeAlarmEventStackInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueInfo)) {
            query.put("UniqueInfo", request.uniqueInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlarmEventStackInfo"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlarmEventStackInfoResponse());
    }

    public DescribeAlarmEventStackInfoResponse describeAlarmEventStackInfo(DescribeAlarmEventStackInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlarmEventStackInfoWithOptions(request, runtime);
    }

    public DescribeBundlesResponse describeBundlesWithOptions(DescribeBundlesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleType)) {
            query.put("BundleType", request.bundleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkStock)) {
            query.put("CheckStock", request.checkStock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuCount)) {
            query.put("CpuCount", request.cpuCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopTypeFamily)) {
            query.put("DesktopTypeFamily", request.desktopTypeFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromDesktopGroup)) {
            query.put("FromDesktopGroup", request.fromDesktopGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuCount)) {
            query.put("GpuCount", request.gpuCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memorySize)) {
            query.put("MemorySize", request.memorySize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportMultiSession)) {
            query.put("SupportMultiSession", request.supportMultiSession);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBundles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBundlesResponse());
    }

    public DescribeBundlesResponse describeBundles(DescribeBundlesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBundlesWithOptions(request, runtime);
    }

    public DescribeCensResponse describeCensWithOptions(DescribeCensRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCens"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCensResponse());
    }

    public DescribeCensResponse describeCens(DescribeCensRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCensWithOptions(request, runtime);
    }

    public DescribeClientEventsResponse describeClientEventsWithOptions(DescribeClientEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIp)) {
            query.put("DesktopIp", request.desktopIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientEvents"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientEventsResponse());
    }

    public DescribeClientEventsResponse describeClientEvents(DescribeClientEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClientEventsWithOptions(request, runtime);
    }

    public DescribeDesktopGroupsResponse describeDesktopGroupsWithOptions(DescribeDesktopGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupName)) {
            query.put("DesktopGroupName", request.desktopGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedEndUserIds)) {
            query.put("ExcludedEndUserIds", request.excludedEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownType)) {
            query.put("OwnType", request.ownType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopGroups"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopGroupsResponse());
    }

    public DescribeDesktopGroupsResponse describeDesktopGroups(DescribeDesktopGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopGroupsWithOptions(request, runtime);
    }

    public DescribeDesktopIdsByVulNamesResponse describeDesktopIdsByVulNamesWithOptions(DescribeDesktopIdsByVulNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.necessity)) {
            query.put("Necessity", request.necessity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulName)) {
            query.put("VulName", request.vulName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopIdsByVulNames"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopIdsByVulNamesResponse());
    }

    public DescribeDesktopIdsByVulNamesResponse describeDesktopIdsByVulNames(DescribeDesktopIdsByVulNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopIdsByVulNamesWithOptions(request, runtime);
    }

    public DescribeDesktopTypesResponse describeDesktopTypesWithOptions(DescribeDesktopTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuCount)) {
            query.put("CpuCount", request.cpuCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIdForModify)) {
            query.put("DesktopIdForModify", request.desktopIdForModify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopTypeId)) {
            query.put("DesktopTypeId", request.desktopTypeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuCount)) {
            query.put("GpuCount", request.gpuCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeFamily)) {
            query.put("InstanceTypeFamily", request.instanceTypeFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memorySize)) {
            query.put("MemorySize", request.memorySize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopTypes"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopTypesResponse());
    }

    public DescribeDesktopTypesResponse describeDesktopTypes(DescribeDesktopTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopTypesWithOptions(request, runtime);
    }

    public DescribeDesktopsResponse describeDesktopsWithOptions(DescribeDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopStatus)) {
            query.put("DesktopStatus", request.desktopStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedEndUserId)) {
            query.put("ExcludedEndUserId", request.excludedEndUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterDesktopGroup)) {
            query.put("FilterDesktopGroup", request.filterDesktopGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managementFlag)) {
            query.put("ManagementFlag", request.managementFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryFotaUpdate)) {
            query.put("QueryFotaUpdate", request.queryFotaUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopsResponse());
    }

    public DescribeDesktopsResponse describeDesktops(DescribeDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopsWithOptions(request, runtime);
    }

    public DescribeDesktopsInGroupResponse describeDesktopsInGroupWithOptions(DescribeDesktopsInGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopsInGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopsInGroupResponse());
    }

    public DescribeDesktopsInGroupResponse describeDesktopsInGroup(DescribeDesktopsInGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopsInGroupWithOptions(request, runtime);
    }

    public DescribeDirectoriesResponse describeDirectoriesWithOptions(DescribeDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryStatus)) {
            query.put("DirectoryStatus", request.directoryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryType)) {
            query.put("DirectoryType", request.directoryType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDirectories"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDirectoriesResponse());
    }

    public DescribeDirectoriesResponse describeDirectories(DescribeDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDirectoriesWithOptions(request, runtime);
    }

    public DescribeFlowMetricResponse describeFlowMetricWithOptions(DescribeFlowMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowMetric"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowMetricResponse());
    }

    public DescribeFlowMetricResponse describeFlowMetric(DescribeFlowMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowMetricWithOptions(request, runtime);
    }

    public DescribeFotaPendingDesktopsResponse describeFotaPendingDesktopsWithOptions(DescribeFotaPendingDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFotaPendingDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFotaPendingDesktopsResponse());
    }

    public DescribeFotaPendingDesktopsResponse describeFotaPendingDesktops(DescribeFotaPendingDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFotaPendingDesktopsWithOptions(request, runtime);
    }

    public DescribeFotaTasksResponse describeFotaTasksWithOptions(DescribeFotaTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fotaStatus)) {
            query.put("FotaStatus", request.fotaStatus);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskUid)) {
            query.put("TaskUid", request.taskUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatus)) {
            query.put("UserStatus", request.userStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFotaTasks"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFotaTasksResponse());
    }

    public DescribeFotaTasksResponse describeFotaTasks(DescribeFotaTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFotaTasksWithOptions(request, runtime);
    }

    public DescribeFrontVulPatchListResponse describeFrontVulPatchListWithOptions(DescribeFrontVulPatchListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulInfo)) {
            query.put("VulInfo", request.vulInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFrontVulPatchList"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFrontVulPatchListResponse());
    }

    public DescribeFrontVulPatchListResponse describeFrontVulPatchList(DescribeFrontVulPatchListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFrontVulPatchListWithOptions(request, runtime);
    }

    public DescribeGroupedVulResponse describeGroupedVulWithOptions(DescribeGroupedVulRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealed)) {
            query.put("Dealed", request.dealed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.necessity)) {
            query.put("Necessity", request.necessity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupedVul"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupedVulResponse());
    }

    public DescribeGroupedVulResponse describeGroupedVul(DescribeGroupedVulRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupedVulWithOptions(request, runtime);
    }

    public DescribeHardwareTerminalsResponse describeHardwareTerminalsWithOptions(DescribeHardwareTerminalsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hardwareType)) {
            query.put("HardwareType", request.hardwareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hardwareVersion)) {
            query.put("HardwareVersion", request.hardwareVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHardwareTerminals"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHardwareTerminalsResponse());
    }

    public DescribeHardwareTerminalsResponse describeHardwareTerminals(DescribeHardwareTerminalsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHardwareTerminalsWithOptions(request, runtime);
    }

    public DescribeImageModifiedRecordsResponse describeImageModifiedRecordsWithOptions(DescribeImageModifiedRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageModifiedRecords"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageModifiedRecordsResponse());
    }

    public DescribeImageModifiedRecordsResponse describeImageModifiedRecords(DescribeImageModifiedRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageModifiedRecordsWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopInstanceType)) {
            query.put("DesktopInstanceType", request.desktopInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuCategory)) {
            query.put("GpuCategory", request.gpuCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuDriverVersion)) {
            query.put("GpuDriverVersion", request.gpuDriverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageStatus)) {
            query.put("ImageStatus", request.imageStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageType)) {
            query.put("LanguageType", request.languageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandType)) {
            query.put("CommandType", request.commandType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentEncoding)) {
            query.put("ContentEncoding", request.contentEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeOutput)) {
            query.put("IncludeOutput", request.includeOutput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            query.put("InvokeId", request.invokeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeStatus)) {
            query.put("InvokeStatus", request.invokeStatus);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvocations"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvocationsResponse());
    }

    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    public DescribeModificationPriceResponse describeModificationPriceWithOptions(DescribeModificationPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskPerformanceLevel)) {
            query.put("RootDiskPerformanceLevel", request.rootDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskSizeGib)) {
            query.put("RootDiskSizeGib", request.rootDiskSizeGib);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskPerformanceLevel)) {
            query.put("UserDiskPerformanceLevel", request.userDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskSizeGib)) {
            query.put("UserDiskSizeGib", request.userDiskSizeGib);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModificationPrice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModificationPriceResponse());
    }

    public DescribeModificationPriceResponse describeModificationPrice(DescribeModificationPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeModificationPriceWithOptions(request, runtime);
    }

    public DescribeNASFileSystemsResponse describeNASFileSystemsWithOptions(DescribeNASFileSystemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNASFileSystems"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNASFileSystemsResponse());
    }

    public DescribeNASFileSystemsResponse describeNASFileSystems(DescribeNASFileSystemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNASFileSystemsWithOptions(request, runtime);
    }

    public DescribeNetworkPackagesResponse describeNetworkPackagesWithOptions(DescribeNetworkPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkPackages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkPackagesResponse());
    }

    public DescribeNetworkPackagesResponse describeNetworkPackages(DescribeNetworkPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkPackagesWithOptions(request, runtime);
    }

    public DescribeOfficeSitesResponse describeOfficeSitesWithOptions(DescribeOfficeSitesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteType)) {
            query.put("OfficeSiteType", request.officeSiteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOfficeSites"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOfficeSitesResponse());
    }

    public DescribeOfficeSitesResponse describeOfficeSites(DescribeOfficeSitesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOfficeSitesWithOptions(request, runtime);
    }

    public DescribePolicyGroupsResponse describePolicyGroupsWithOptions(DescribePolicyGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyGroups"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyGroupsResponse());
    }

    public DescribePolicyGroupsResponse describePolicyGroups(DescribePolicyGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolicyGroupsWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hardwareVersion)) {
            query.put("HardwareVersion", request.hardwareVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageSize)) {
            query.put("PackageSize", request.packageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskPerformanceLevel)) {
            query.put("RootDiskPerformanceLevel", request.rootDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskSizeGib)) {
            query.put("RootDiskSizeGib", request.rootDiskSizeGib);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskPerformanceLevel)) {
            query.put("UserDiskPerformanceLevel", request.userDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskSizeGib)) {
            query.put("UserDiskSizeGib", request.userDiskSizeGib);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public DescribeRecordingsResponse describeRecordingsWithOptions(DescribeRecordingsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordings"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordingsResponse());
    }

    public DescribeRecordingsResponse describeRecordings(DescribeRecordingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordingsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRenewalPriceResponse describeRenewalPriceWithOptions(DescribeRenewalPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRenewalPrice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRenewalPriceResponse());
    }

    public DescribeRenewalPriceResponse describeRenewalPrice(DescribeRenewalPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRenewalPriceWithOptions(request, runtime);
    }

    public DescribeScanTaskProgressResponse describeScanTaskProgressWithOptions(DescribeScanTaskProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScanTaskProgress"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScanTaskProgressResponse());
    }

    public DescribeScanTaskProgressResponse describeScanTaskProgress(DescribeScanTaskProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScanTaskProgressWithOptions(request, runtime);
    }

    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatusWithOptions(DescribeSecurityEventOperationStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityEventId)) {
            query.put("SecurityEventId", request.securityEventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityEventOperationStatus"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityEventOperationStatusResponse());
    }

    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityEventOperationStatusWithOptions(request, runtime);
    }

    public DescribeSecurityEventOperationsResponse describeSecurityEventOperationsWithOptions(DescribeSecurityEventOperationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityEventId)) {
            query.put("SecurityEventId", request.securityEventId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityEventOperations"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityEventOperationsResponse());
    }

    public DescribeSecurityEventOperationsResponse describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityEventOperationsWithOptions(request, runtime);
    }

    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshots"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotsResponse());
    }

    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    public DescribeSuspEventOverviewResponse describeSuspEventOverviewWithOptions(DescribeSuspEventOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSuspEventOverview"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSuspEventOverviewResponse());
    }

    public DescribeSuspEventOverviewResponse describeSuspEventOverview(DescribeSuspEventOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventOverviewWithOptions(request, runtime);
    }

    public DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFilesWithOptions(DescribeSuspEventQuaraFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSuspEventQuaraFiles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSuspEventQuaraFilesResponse());
    }

    public DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventQuaraFilesWithOptions(request, runtime);
    }

    public DescribeSuspEventsResponse describeSuspEventsWithOptions(DescribeSuspEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmUniqueInfo)) {
            query.put("AlarmUniqueInfo", request.alarmUniqueInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealed)) {
            query.put("Dealed", request.dealed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levels)) {
            query.put("Levels", request.levels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentEventType)) {
            query.put("ParentEventType", request.parentEventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSuspEvents"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSuspEventsResponse());
    }

    public DescribeSuspEventsResponse describeSuspEvents(DescribeSuspEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventsWithOptions(request, runtime);
    }

    public DescribeUserConnectionRecordsResponse describeUserConnectionRecordsWithOptions(DescribeUserConnectionRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectDurationFrom)) {
            query.put("ConnectDurationFrom", request.connectDurationFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectDurationTo)) {
            query.put("ConnectDurationTo", request.connectDurationTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectEndTimeFrom)) {
            query.put("ConnectEndTimeFrom", request.connectEndTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectEndTimeTo)) {
            query.put("ConnectEndTimeTo", request.connectEndTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectStartTimeFrom)) {
            query.put("ConnectStartTimeFrom", request.connectStartTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectStartTimeTo)) {
            query.put("ConnectStartTimeTo", request.connectStartTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserType)) {
            query.put("EndUserType", request.endUserType);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserConnectionRecords"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserConnectionRecordsResponse());
    }

    public DescribeUserConnectionRecordsResponse describeUserConnectionRecords(DescribeUserConnectionRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserConnectionRecordsWithOptions(request, runtime);
    }

    public DescribeUsersInGroupResponse describeUsersInGroupWithOptions(DescribeUsersInGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectState)) {
            query.put("ConnectState", request.connectState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryUserDetail)) {
            query.put("QueryUserDetail", request.queryUserDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsersInGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsersInGroupResponse());
    }

    public DescribeUsersInGroupResponse describeUsersInGroup(DescribeUsersInGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUsersInGroupWithOptions(request, runtime);
    }

    public DescribeVirtualMFADevicesResponse describeVirtualMFADevicesWithOptions(DescribeVirtualMFADevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualMFADevices"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualMFADevicesResponse());
    }

    public DescribeVirtualMFADevicesResponse describeVirtualMFADevices(DescribeVirtualMFADevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVirtualMFADevicesWithOptions(request, runtime);
    }

    public DescribeVulDetailsResponse describeVulDetailsWithOptions(DescribeVulDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVulDetails"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVulDetailsResponse());
    }

    public DescribeVulDetailsResponse describeVulDetails(DescribeVulDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulDetailsWithOptions(request, runtime);
    }

    public DescribeVulListResponse describeVulListWithOptions(DescribeVulListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealed)) {
            query.put("Dealed", request.dealed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.necessity)) {
            query.put("Necessity", request.necessity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVulList"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVulListResponse());
    }

    public DescribeVulListResponse describeVulList(DescribeVulListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulListWithOptions(request, runtime);
    }

    public DescribeVulOverviewResponse describeVulOverviewWithOptions(DescribeVulOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVulOverview"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVulOverviewResponse());
    }

    public DescribeVulOverviewResponse describeVulOverview(DescribeVulOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulOverviewWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneType)) {
            query.put("ZoneType", request.zoneType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DetachCenResponse detachCenWithOptions(DetachCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachCen"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachCenResponse());
    }

    public DetachCenResponse detachCen(DetachCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachCenWithOptions(request, runtime);
    }

    public DisableDesktopsInGroupResponse disableDesktopsInGroupWithOptions(DisableDesktopsInGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIds)) {
            query.put("DesktopIds", request.desktopIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDesktopsInGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDesktopsInGroupResponse());
    }

    public DisableDesktopsInGroupResponse disableDesktopsInGroup(DisableDesktopsInGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDesktopsInGroupWithOptions(request, runtime);
    }

    public DownloadRecordingsResponse downloadRecordingsWithOptions(DownloadRecordingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadRecordings"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadRecordingsResponse());
    }

    public DownloadRecordingsResponse downloadRecordings(DownloadRecordingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadRecordingsWithOptions(request, runtime);
    }

    public ExportClientEventsResponse exportClientEventsWithOptions(ExportClientEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportClientEvents"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportClientEventsResponse());
    }

    public ExportClientEventsResponse exportClientEvents(ExportClientEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportClientEventsWithOptions(request, runtime);
    }

    public ExportDesktopGroupInfoResponse exportDesktopGroupInfoWithOptions(ExportDesktopGroupInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupName)) {
            query.put("DesktopGroupName", request.desktopGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.langType)) {
            query.put("LangType", request.langType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportDesktopGroupInfo"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportDesktopGroupInfoResponse());
    }

    public ExportDesktopGroupInfoResponse exportDesktopGroupInfo(ExportDesktopGroupInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportDesktopGroupInfoWithOptions(request, runtime);
    }

    public ExportDesktopListInfoResponse exportDesktopListInfoWithOptions(ExportDesktopListInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopStatus)) {
            query.put("DesktopStatus", request.desktopStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.langType)) {
            query.put("LangType", request.langType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportDesktopListInfo"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportDesktopListInfoResponse());
    }

    public ExportDesktopListInfoResponse exportDesktopListInfo(ExportDesktopListInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportDesktopListInfoWithOptions(request, runtime);
    }

    public GetConnectionTicketResponse getConnectionTicketWithOptions(GetConnectionTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnectionTicket"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectionTicketResponse());
    }

    public GetConnectionTicketResponse getConnectionTicket(GetConnectionTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConnectionTicketWithOptions(request, runtime);
    }

    public GetDesktopGroupDetailResponse getDesktopGroupDetailWithOptions(GetDesktopGroupDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDesktopGroupDetail"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDesktopGroupDetailResponse());
    }

    public GetDesktopGroupDetailResponse getDesktopGroupDetail(GetDesktopGroupDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDesktopGroupDetailWithOptions(request, runtime);
    }

    public GetDirectorySsoStatusResponse getDirectorySsoStatusWithOptions(GetDirectorySsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDirectorySsoStatus"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDirectorySsoStatusResponse());
    }

    public GetDirectorySsoStatusResponse getDirectorySsoStatus(GetDirectorySsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDirectorySsoStatusWithOptions(request, runtime);
    }

    public GetOfficeSiteSsoStatusResponse getOfficeSiteSsoStatusWithOptions(GetOfficeSiteSsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOfficeSiteSsoStatus"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOfficeSiteSsoStatusResponse());
    }

    public GetOfficeSiteSsoStatusResponse getOfficeSiteSsoStatus(GetOfficeSiteSsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOfficeSiteSsoStatusWithOptions(request, runtime);
    }

    public GetSpMetadataResponse getSpMetadataWithOptions(GetSpMetadataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpMetadata"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpMetadataResponse());
    }

    public GetSpMetadataResponse getSpMetadata(GetSpMetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpMetadataWithOptions(request, runtime);
    }

    public HandleSecurityEventsResponse handleSecurityEventsWithOptions(HandleSecurityEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationCode)) {
            query.put("OperationCode", request.operationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationParams)) {
            query.put("OperationParams", request.operationParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityEvent)) {
            query.put("SecurityEvent", request.securityEvent);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HandleSecurityEvents"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HandleSecurityEventsResponse());
    }

    public HandleSecurityEventsResponse handleSecurityEvents(HandleSecurityEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.handleSecurityEventsWithOptions(request, runtime);
    }

    public ListDirectoryUsersResponse listDirectoryUsersWithOptions(ListDirectoryUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.OUPath)) {
            query.put("OUPath", request.OUPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDirectoryUsers"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDirectoryUsersResponse());
    }

    public ListDirectoryUsersResponse listDirectoryUsers(ListDirectoryUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDirectoryUsersWithOptions(request, runtime);
    }

    public ListOfficeSiteOverviewResponse listOfficeSiteOverviewWithOptions(ListOfficeSiteOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceRefresh)) {
            query.put("ForceRefresh", request.forceRefresh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRange)) {
            query.put("QueryRange", request.queryRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOfficeSiteOverview"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOfficeSiteOverviewResponse());
    }

    public ListOfficeSiteOverviewResponse listOfficeSiteOverview(ListOfficeSiteOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfficeSiteOverviewWithOptions(request, runtime);
    }

    public ListOfficeSiteUsersResponse listOfficeSiteUsersWithOptions(ListOfficeSiteUsersRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.OUPath)) {
            query.put("OUPath", request.OUPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOfficeSiteUsers"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOfficeSiteUsersResponse());
    }

    public ListOfficeSiteUsersResponse listOfficeSiteUsers(ListOfficeSiteUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfficeSiteUsersWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-09-30"),
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

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListUserAdOrganizationUnitsResponse listUserAdOrganizationUnitsWithOptions(ListUserAdOrganizationUnitsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserAdOrganizationUnits"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserAdOrganizationUnitsResponse());
    }

    public ListUserAdOrganizationUnitsResponse listUserAdOrganizationUnits(ListUserAdOrganizationUnitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserAdOrganizationUnitsWithOptions(request, runtime);
    }

    public LockVirtualMFADeviceResponse lockVirtualMFADeviceWithOptions(LockVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockVirtualMFADevice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockVirtualMFADeviceResponse());
    }

    public LockVirtualMFADeviceResponse lockVirtualMFADevice(LockVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockVirtualMFADeviceWithOptions(request, runtime);
    }

    public ModifyADConnectorDirectoryResponse modifyADConnectorDirectoryWithOptions(ModifyADConnectorDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adHostname)) {
            query.put("AdHostname", request.adHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryName)) {
            query.put("DirectoryName", request.directoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsAddress)) {
            query.put("DnsAddress", request.dnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OUName)) {
            query.put("OUName", request.OUName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainDnsAddress)) {
            query.put("SubDomainDnsAddress", request.subDomainDnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainName)) {
            query.put("SubDomainName", request.subDomainName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyADConnectorDirectory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyADConnectorDirectoryResponse());
    }

    public ModifyADConnectorDirectoryResponse modifyADConnectorDirectory(ModifyADConnectorDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyADConnectorDirectoryWithOptions(request, runtime);
    }

    public ModifyADConnectorOfficeSiteResponse modifyADConnectorOfficeSiteWithOptions(ModifyADConnectorOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adHostname)) {
            query.put("AdHostname", request.adHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsAddress)) {
            query.put("DnsAddress", request.dnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OUName)) {
            query.put("OUName", request.OUName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainDnsAddress)) {
            query.put("SubDomainDnsAddress", request.subDomainDnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainName)) {
            query.put("SubDomainName", request.subDomainName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyADConnectorOfficeSite"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyADConnectorOfficeSiteResponse());
    }

    public ModifyADConnectorOfficeSiteResponse modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyADConnectorOfficeSiteWithOptions(request, runtime);
    }

    public ModifyBundleResponse modifyBundleWithOptions(ModifyBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleName)) {
            query.put("BundleName", request.bundleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBundle"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBundleResponse());
    }

    public ModifyBundleResponse modifyBundle(ModifyBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBundleWithOptions(request, runtime);
    }

    public ModifyDesktopChargeTypeResponse modifyDesktopChargeTypeWithOptions(ModifyDesktopChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopChargeType"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopChargeTypeResponse());
    }

    public ModifyDesktopChargeTypeResponse modifyDesktopChargeType(ModifyDesktopChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopChargeTypeWithOptions(request, runtime);
    }

    public ModifyDesktopGroupResponse modifyDesktopGroupWithOptions(ModifyDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowAutoSetup)) {
            query.put("AllowAutoSetup", request.allowAutoSetup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowBufferCount)) {
            query.put("AllowBufferCount", request.allowBufferCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindAmount)) {
            query.put("BindAmount", request.bindAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classify)) {
            query.put("Classify", request.classify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupName)) {
            query.put("DesktopGroupName", request.desktopGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepDuration)) {
            query.put("KeepDuration", request.keepDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadPolicy)) {
            query.put("LoadPolicy", request.loadPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDesktopsCount)) {
            query.put("MaxDesktopsCount", request.maxDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDesktopsCount)) {
            query.put("MinDesktopsCount", request.minDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownBundleId)) {
            query.put("OwnBundleId", request.ownBundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            query.put("ResetType", request.resetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleStrategyId)) {
            query.put("ScaleStrategyId", request.scaleStrategyId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopGroupResponse());
    }

    public ModifyDesktopGroupResponse modifyDesktopGroup(ModifyDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopGroupWithOptions(request, runtime);
    }

    public ModifyDesktopHostNameResponse modifyDesktopHostNameWithOptions(ModifyDesktopHostNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newHostName)) {
            query.put("NewHostName", request.newHostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopHostName"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopHostNameResponse());
    }

    public ModifyDesktopHostNameResponse modifyDesktopHostName(ModifyDesktopHostNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopHostNameWithOptions(request, runtime);
    }

    public ModifyDesktopNameResponse modifyDesktopNameWithOptions(ModifyDesktopNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDesktopName)) {
            query.put("NewDesktopName", request.newDesktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopName"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopNameResponse());
    }

    public ModifyDesktopNameResponse modifyDesktopName(ModifyDesktopNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopNameWithOptions(request, runtime);
    }

    public ModifyDesktopSpecResponse modifyDesktopSpecWithOptions(ModifyDesktopSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopType)) {
            query.put("DesktopType", request.desktopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskSizeGib)) {
            query.put("RootDiskSizeGib", request.rootDiskSizeGib);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskPerformanceLevel)) {
            query.put("UserDiskPerformanceLevel", request.userDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskSizeGib)) {
            query.put("UserDiskSizeGib", request.userDiskSizeGib);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopSpec"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopSpecResponse());
    }

    public ModifyDesktopSpecResponse modifyDesktopSpec(ModifyDesktopSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopSpecWithOptions(request, runtime);
    }

    public ModifyDesktopsPolicyGroupResponse modifyDesktopsPolicyGroupWithOptions(ModifyDesktopsPolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopsPolicyGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopsPolicyGroupResponse());
    }

    public ModifyDesktopsPolicyGroupResponse modifyDesktopsPolicyGroup(ModifyDesktopsPolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopsPolicyGroupWithOptions(request, runtime);
    }

    public ModifyEntitlementResponse modifyEntitlementWithOptions(ModifyEntitlementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEntitlement"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEntitlementResponse());
    }

    public ModifyEntitlementResponse modifyEntitlement(ModifyEntitlementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEntitlementWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImageAttribute"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageAttributeResponse());
    }

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    public ModifyNASDefaultMountTargetResponse modifyNASDefaultMountTargetWithOptions(ModifyNASDefaultMountTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNASDefaultMountTarget"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNASDefaultMountTargetResponse());
    }

    public ModifyNASDefaultMountTargetResponse modifyNASDefaultMountTarget(ModifyNASDefaultMountTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNASDefaultMountTargetWithOptions(request, runtime);
    }

    public ModifyNetworkPackageResponse modifyNetworkPackageWithOptions(ModifyNetworkPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkPackage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkPackageResponse());
    }

    public ModifyNetworkPackageResponse modifyNetworkPackage(ModifyNetworkPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkPackageWithOptions(request, runtime);
    }

    public ModifyNetworkPackageBandwidthResponse modifyNetworkPackageBandwidthWithOptions(ModifyNetworkPackageBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkPackageBandwidth"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkPackageBandwidthResponse());
    }

    public ModifyNetworkPackageBandwidthResponse modifyNetworkPackageBandwidth(ModifyNetworkPackageBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkPackageBandwidthWithOptions(request, runtime);
    }

    public ModifyNetworkPackageEnabledResponse modifyNetworkPackageEnabledWithOptions(ModifyNetworkPackageEnabledRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkPackageEnabled"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkPackageEnabledResponse());
    }

    public ModifyNetworkPackageEnabledResponse modifyNetworkPackageEnabled(ModifyNetworkPackageEnabledRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkPackageEnabledWithOptions(request, runtime);
    }

    public ModifyOfficeSiteAttributeResponse modifyOfficeSiteAttributeWithOptions(ModifyOfficeSiteAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needVerifyLoginRisk)) {
            query.put("NeedVerifyLoginRisk", request.needVerifyLoginRisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needVerifyZeroDevice)) {
            query.put("NeedVerifyZeroDevice", request.needVerifyZeroDevice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOfficeSiteAttribute"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOfficeSiteAttributeResponse());
    }

    public ModifyOfficeSiteAttributeResponse modifyOfficeSiteAttribute(ModifyOfficeSiteAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOfficeSiteAttributeWithOptions(request, runtime);
    }

    public ModifyOfficeSiteCrossDesktopAccessResponse modifyOfficeSiteCrossDesktopAccessWithOptions(ModifyOfficeSiteCrossDesktopAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableCrossDesktopAccess)) {
            query.put("EnableCrossDesktopAccess", request.enableCrossDesktopAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOfficeSiteCrossDesktopAccess"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOfficeSiteCrossDesktopAccessResponse());
    }

    public ModifyOfficeSiteCrossDesktopAccessResponse modifyOfficeSiteCrossDesktopAccess(ModifyOfficeSiteCrossDesktopAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOfficeSiteCrossDesktopAccessWithOptions(request, runtime);
    }

    public ModifyOfficeSiteMfaEnabledResponse modifyOfficeSiteMfaEnabledWithOptions(ModifyOfficeSiteMfaEnabledRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOfficeSiteMfaEnabled"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOfficeSiteMfaEnabledResponse());
    }

    public ModifyOfficeSiteMfaEnabledResponse modifyOfficeSiteMfaEnabled(ModifyOfficeSiteMfaEnabledRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOfficeSiteMfaEnabledWithOptions(request, runtime);
    }

    public ModifyOperateVulResponse modifyOperateVulWithOptions(ModifyOperateVulRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulInfo)) {
            query.put("VulInfo", request.vulInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOperateVul"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOperateVulResponse());
    }

    public ModifyOperateVulResponse modifyOperateVul(ModifyOperateVulRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOperateVulWithOptions(request, runtime);
    }

    public ModifyPolicyGroupResponse modifyPolicyGroupWithOptions(ModifyPolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizeAccessPolicyRule)) {
            query.put("AuthorizeAccessPolicyRule", request.authorizeAccessPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeSecurityPolicyRule)) {
            query.put("AuthorizeSecurityPolicyRule", request.authorizeSecurityPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraRedirect)) {
            query.put("CameraRedirect", request.cameraRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            query.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainList)) {
            query.put("DomainList", request.domainList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuAcceleration)) {
            query.put("GpuAcceleration", request.gpuAcceleration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5Access)) {
            query.put("Html5Access", request.html5Access);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5FileTransfer)) {
            query.put("Html5FileTransfer", request.html5FileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localDrive)) {
            query.put("LocalDrive", request.localDrive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preemptLogin)) {
            query.put("PreemptLogin", request.preemptLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preemptLoginUser)) {
            query.put("PreemptLoginUser", request.preemptLoginUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.printerRedirection)) {
            query.put("PrinterRedirection", request.printerRedirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recording)) {
            query.put("Recording", request.recording);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingEndTime)) {
            query.put("RecordingEndTime", request.recordingEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingFps)) {
            query.put("RecordingFps", request.recordingFps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingStartTime)) {
            query.put("RecordingStartTime", request.recordingStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeAccessPolicyRule)) {
            query.put("RevokeAccessPolicyRule", request.revokeAccessPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeSecurityPolicyRule)) {
            query.put("RevokeSecurityPolicyRule", request.revokeSecurityPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usbRedirect)) {
            query.put("UsbRedirect", request.usbRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usbSupplyRedirectRule)) {
            query.put("UsbSupplyRedirectRule", request.usbSupplyRedirectRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visualQuality)) {
            query.put("VisualQuality", request.visualQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermark)) {
            query.put("Watermark", request.watermark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkCustomText)) {
            query.put("WatermarkCustomText", request.watermarkCustomText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkTransparency)) {
            query.put("WatermarkTransparency", request.watermarkTransparency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkType)) {
            query.put("WatermarkType", request.watermarkType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicyGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyGroupResponse());
    }

    public ModifyPolicyGroupResponse modifyPolicyGroup(ModifyPolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPolicyGroupWithOptions(request, runtime);
    }

    public ModifyUserEntitlementResponse modifyUserEntitlementWithOptions(ModifyUserEntitlementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizeDesktopId)) {
            query.put("AuthorizeDesktopId", request.authorizeDesktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeDesktopId)) {
            query.put("RevokeDesktopId", request.revokeDesktopId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserEntitlement"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserEntitlementResponse());
    }

    public ModifyUserEntitlementResponse modifyUserEntitlement(ModifyUserEntitlementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserEntitlementWithOptions(request, runtime);
    }

    public ModifyUserToDesktopGroupResponse modifyUserToDesktopGroupWithOptions(ModifyUserToDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newEndUserIds)) {
            query.put("NewEndUserIds", request.newEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldEndUserIds)) {
            query.put("OldEndUserIds", request.oldEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserToDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserToDesktopGroupResponse());
    }

    public ModifyUserToDesktopGroupResponse modifyUserToDesktopGroup(ModifyUserToDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserToDesktopGroupWithOptions(request, runtime);
    }

    public OperateVulsResponse operateVulsWithOptions(OperateVulsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.precondition)) {
            query.put("Precondition", request.precondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulName)) {
            query.put("VulName", request.vulName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateVuls"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateVulsResponse());
    }

    public OperateVulsResponse operateVuls(OperateVulsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateVulsWithOptions(request, runtime);
    }

    public RebootDesktopsResponse rebootDesktopsWithOptions(RebootDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootDesktopsResponse());
    }

    public RebootDesktopsResponse rebootDesktops(RebootDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootDesktopsWithOptions(request, runtime);
    }

    public RebuildDesktopsResponse rebuildDesktopsWithOptions(RebuildDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebuildDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebuildDesktopsResponse());
    }

    public RebuildDesktopsResponse rebuildDesktops(RebuildDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebuildDesktopsWithOptions(request, runtime);
    }

    public RemoveUserFromDesktopGroupResponse removeUserFromDesktopGroupWithOptions(RemoveUserFromDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupIds)) {
            query.put("DesktopGroupIds", request.desktopGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserFromDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserFromDesktopGroupResponse());
    }

    public RemoveUserFromDesktopGroupResponse removeUserFromDesktopGroup(RemoveUserFromDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUserFromDesktopGroupWithOptions(request, runtime);
    }

    public RenewDesktopsResponse renewDesktopsWithOptions(RenewDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewDesktopsResponse());
    }

    public RenewDesktopsResponse renewDesktops(RenewDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewDesktopsWithOptions(request, runtime);
    }

    public RenewNetworkPackagesResponse renewNetworkPackagesWithOptions(RenewNetworkPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewNetworkPackages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewNetworkPackagesResponse());
    }

    public RenewNetworkPackagesResponse renewNetworkPackages(RenewNetworkPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewNetworkPackagesWithOptions(request, runtime);
    }

    public ResetNASDefaultMountTargetResponse resetNASDefaultMountTargetWithOptions(ResetNASDefaultMountTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetNASDefaultMountTarget"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetNASDefaultMountTargetResponse());
    }

    public ResetNASDefaultMountTargetResponse resetNASDefaultMountTarget(ResetNASDefaultMountTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetNASDefaultMountTargetWithOptions(request, runtime);
    }

    public ResetSnapshotResponse resetSnapshotWithOptions(ResetSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSnapshot"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSnapshotResponse());
    }

    public ResetSnapshotResponse resetSnapshot(ResetSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetSnapshotWithOptions(request, runtime);
    }

    public RollbackSuspEventQuaraFileResponse rollbackSuspEventQuaraFileWithOptions(RollbackSuspEventQuaraFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quaraFieldId)) {
            query.put("QuaraFieldId", request.quaraFieldId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackSuspEventQuaraFile"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackSuspEventQuaraFileResponse());
    }

    public RollbackSuspEventQuaraFileResponse rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackSuspEventQuaraFileWithOptions(request, runtime);
    }

    public RunCommandResponse runCommandWithOptions(RunCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandContent)) {
            query.put("CommandContent", request.commandContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentEncoding)) {
            query.put("ContentEncoding", request.contentEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCommand"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCommandResponse());
    }

    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    public SendVerifyCodeResponse sendVerifyCodeWithOptions(SendVerifyCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            query.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCodeAction)) {
            query.put("VerifyCodeAction", request.verifyCodeAction);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVerifyCode"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVerifyCodeResponse());
    }

    public SendVerifyCodeResponse sendVerifyCode(SendVerifyCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendVerifyCodeWithOptions(request, runtime);
    }

    public SetDirectorySsoStatusResponse setDirectorySsoStatusWithOptions(SetDirectorySsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSso)) {
            query.put("EnableSso", request.enableSso);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDirectorySsoStatus"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDirectorySsoStatusResponse());
    }

    public SetDirectorySsoStatusResponse setDirectorySsoStatus(SetDirectorySsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDirectorySsoStatusWithOptions(request, runtime);
    }

    public SetIdpMetadataResponse setIdpMetadataWithOptions(SetIdpMetadataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpMetadata)) {
            query.put("IdpMetadata", request.idpMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIdpMetadata"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIdpMetadataResponse());
    }

    public SetIdpMetadataResponse setIdpMetadata(SetIdpMetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIdpMetadataWithOptions(request, runtime);
    }

    public SetOfficeSiteSsoStatusResponse setOfficeSiteSsoStatusWithOptions(SetOfficeSiteSsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableSso)) {
            query.put("EnableSso", request.enableSso);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssoType)) {
            query.put("SsoType", request.ssoType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetOfficeSiteSsoStatus"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetOfficeSiteSsoStatusResponse());
    }

    public SetOfficeSiteSsoStatusResponse setOfficeSiteSsoStatus(SetOfficeSiteSsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setOfficeSiteSsoStatusWithOptions(request, runtime);
    }

    public StartDesktopsResponse startDesktopsWithOptions(StartDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDesktopsResponse());
    }

    public StartDesktopsResponse startDesktops(StartDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDesktopsWithOptions(request, runtime);
    }

    public StartVirusScanTaskResponse startVirusScanTaskWithOptions(StartVirusScanTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartVirusScanTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartVirusScanTaskResponse());
    }

    public StartVirusScanTaskResponse startVirusScanTask(StartVirusScanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startVirusScanTaskWithOptions(request, runtime);
    }

    public StopDesktopsResponse stopDesktopsWithOptions(StopDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stoppedMode)) {
            query.put("StoppedMode", request.stoppedMode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDesktopsResponse());
    }

    public StopDesktopsResponse stopDesktops(StopDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDesktopsWithOptions(request, runtime);
    }

    public StopInvocationResponse stopInvocationWithOptions(StopInvocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            query.put("InvokeId", request.invokeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInvocation"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInvocationResponse());
    }

    public StopInvocationResponse stopInvocation(StopInvocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInvocationWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-09-30"),
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

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnlockVirtualMFADeviceResponse unlockVirtualMFADeviceWithOptions(UnlockVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockVirtualMFADevice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockVirtualMFADeviceResponse());
    }

    public UnlockVirtualMFADeviceResponse unlockVirtualMFADevice(UnlockVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockVirtualMFADeviceWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateFotaTaskResponse updateFotaTaskWithOptions(UpdateFotaTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskUid)) {
            query.put("TaskUid", request.taskUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatus)) {
            query.put("UserStatus", request.userStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFotaTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFotaTaskResponse());
    }

    public UpdateFotaTaskResponse updateFotaTask(UpdateFotaTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFotaTaskWithOptions(request, runtime);
    }

    public UploadImageResponse uploadImageWithOptions(UploadImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskSize)) {
            query.put("DataDiskSize", request.dataDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuCategory)) {
            query.put("GpuCategory", request.gpuCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuDriverType)) {
            query.put("GpuDriverType", request.gpuDriverType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseType)) {
            query.put("LicenseType", request.licenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectPath)) {
            query.put("OssObjectPath", request.ossObjectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadImage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadImageResponse());
    }

    public UploadImageResponse uploadImage(UploadImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadImageWithOptions(request, runtime);
    }

    public VerifyCenResponse verifyCenWithOptions(VerifyCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyCen"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyCenResponse());
    }

    public VerifyCenResponse verifyCen(VerifyCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyCenWithOptions(request, runtime);
    }
}
