// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925;

import com.aliyun.tea.*;
import com.aliyun.hdr20170925.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hdr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ChangeRecoveryPointResponse changeRecoveryPointWithOptions(ChangeRecoveryPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddressId)) {
            query.put("EipAddressId", request.eipAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryEssdPerformanceLevel)) {
            query.put("RecoveryEssdPerformanceLevel", request.recoveryEssdPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceName)) {
            query.put("RecoveryInstanceName", request.recoveryInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceType)) {
            query.put("RecoveryInstanceType", request.recoveryInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryIpAddress)) {
            query.put("RecoveryIpAddress", request.recoveryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMemory)) {
            query.put("RecoveryMemory", request.recoveryMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptContent)) {
            query.put("RecoveryPostScriptContent", request.recoveryPostScriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptType)) {
            query.put("RecoveryPostScriptType", request.recoveryPostScriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryReserveIp)) {
            query.put("RecoveryReserveIp", request.recoveryReserveIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseDhcp)) {
            query.put("RecoveryUseDhcp", request.recoveryUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseEssd)) {
            query.put("RecoveryUseEssd", request.recoveryUseEssd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseSsd)) {
            query.put("RecoveryUseSsd", request.recoveryUseSsd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeRecoveryPoint"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeRecoveryPointResponse());
    }

    public ChangeRecoveryPointResponse changeRecoveryPoint(ChangeRecoveryPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeRecoveryPointWithOptions(request, runtime);
    }

    public CommitFailoverResponse commitFailoverWithOptions(CommitFailoverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitFailover"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitFailoverResponse());
    }

    public CommitFailoverResponse commitFailover(CommitFailoverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.commitFailoverWithOptions(request, runtime);
    }

    public CreateRecoveryPlanResponse createRecoveryPlanWithOptions(CreateRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecoveryPlan"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecoveryPlanResponse());
    }

    public CreateRecoveryPlanResponse createRecoveryPlan(CreateRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecoveryPlanWithOptions(request, runtime);
    }

    public CreateSitePairResponse createSitePairWithOptions(CreateSitePairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteName)) {
            query.put("PrimarySiteName", request.primarySiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteRegionId)) {
            query.put("PrimarySiteRegionId", request.primarySiteRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteType)) {
            query.put("PrimarySiteType", request.primarySiteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteVpcId)) {
            query.put("PrimarySiteVpcId", request.primarySiteVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteZoneId)) {
            query.put("PrimarySiteZoneId", request.primarySiteZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteName)) {
            query.put("SecondarySiteName", request.secondarySiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteRegionId)) {
            query.put("SecondarySiteRegionId", request.secondarySiteRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteType)) {
            query.put("SecondarySiteType", request.secondarySiteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteVpcId)) {
            query.put("SecondarySiteVpcId", request.secondarySiteVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteZoneId)) {
            query.put("SecondarySiteZoneId", request.secondarySiteZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairType)) {
            query.put("SitePairType", request.sitePairType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSitePair"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSitePairResponse());
    }

    public CreateSitePairResponse createSitePair(CreateSitePairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSitePairWithOptions(request, runtime);
    }

    public DeleteRecoveryPlanResponse deleteRecoveryPlanWithOptions(DeleteRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecoveryPlan"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecoveryPlanResponse());
    }

    public DeleteRecoveryPlanResponse deleteRecoveryPlan(DeleteRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecoveryPlanWithOptions(request, runtime);
    }

    public DeleteSitePairResponse deleteSitePairWithOptions(DeleteSitePairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSitePair"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSitePairResponse());
    }

    public DeleteSitePairResponse deleteSitePair(DeleteSitePairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSitePairWithOptions(request, runtime);
    }

    public DescribeAvailableInstanceTypesResponse describeAvailableInstanceTypesWithOptions(DescribeAvailableInstanceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioOptimized)) {
            query.put("IoOptimized", request.ioOptimized);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            query.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClient)) {
            query.put("UserClient", request.userClient);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableInstanceTypes"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableInstanceTypesResponse());
    }

    public DescribeAvailableInstanceTypesResponse describeAvailableInstanceTypes(DescribeAvailableInstanceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableInstanceTypesWithOptions(request, runtime);
    }

    public DescribeInfrastructuresResponse describeInfrastructuresWithOptions(DescribeInfrastructuresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInfrastructures"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInfrastructuresResponse());
    }

    public DescribeInfrastructuresResponse describeInfrastructures(DescribeInfrastructuresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInfrastructuresWithOptions(request, runtime);
    }

    public DescribeRecoveryPlanResponse describeRecoveryPlanWithOptions(DescribeRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoveryPlan"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoveryPlanResponse());
    }

    public DescribeRecoveryPlanResponse describeRecoveryPlan(DescribeRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecoveryPlanWithOptions(request, runtime);
    }

    public DescribeRecoveryPlansResponse describeRecoveryPlansWithOptions(DescribeRecoveryPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoveryPlans"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoveryPlansResponse());
    }

    public DescribeRecoveryPlansResponse describeRecoveryPlans(DescribeRecoveryPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecoveryPlansWithOptions(request, runtime);
    }

    public DescribeRecoveryPointsResponse describeRecoveryPointsWithOptions(DescribeRecoveryPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoveryPoints"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoveryPointsResponse());
    }

    public DescribeRecoveryPointsResponse describeRecoveryPoints(DescribeRecoveryPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecoveryPointsWithOptions(request, runtime);
    }

    public DescribeServerResponse describeServerWithOptions(DescribeServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServerResponse());
    }

    public DescribeServerResponse describeServer(DescribeServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServerWithOptions(request, runtime);
    }

    public DescribeServersResponse describeServersWithOptions(DescribeServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverIds)) {
            query.put("ServerIds", request.serverIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServers"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServersResponse());
    }

    public DescribeServersResponse describeServers(DescribeServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServersWithOptions(request, runtime);
    }

    public DescribeSiteResponse describeSiteWithOptions(DescribeSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSite"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteResponse());
    }

    public DescribeSiteResponse describeSite(DescribeSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteWithOptions(request, runtime);
    }

    public DescribeSitePairResponse describeSitePairWithOptions(DescribeSitePairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSitePair"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSitePairResponse());
    }

    public DescribeSitePairResponse describeSitePair(DescribeSitePairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSitePairWithOptions(request, runtime);
    }

    public DescribeSitePairStatisticsResponse describeSitePairStatisticsWithOptions(DescribeSitePairStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSitePairStatistics"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSitePairStatisticsResponse());
    }

    public DescribeSitePairStatisticsResponse describeSitePairStatistics(DescribeSitePairStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSitePairStatisticsWithOptions(request, runtime);
    }

    public DescribeSitePairsResponse describeSitePairsWithOptions(DescribeSitePairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairType)) {
            query.put("SitePairType", request.sitePairType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSitePairs"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSitePairsResponse());
    }

    public DescribeSitePairsResponse describeSitePairs(DescribeSitePairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSitePairsWithOptions(request, runtime);
    }

    public DescribeSummaryResponse describeSummaryWithOptions(DescribeSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSummary"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSummaryResponse());
    }

    public DescribeSummaryResponse describeSummary(DescribeSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSummaryWithOptions(request, runtime);
    }

    public DescribeTaskResponse describeTaskWithOptions(DescribeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTask"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskResponse());
    }

    public DescribeTaskResponse describeTask(DescribeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTaskWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTasks"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DisableReplicationResponse disableReplicationWithOptions(DisableReplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableReplicationResponse());
    }

    public DisableReplicationResponse disableReplication(DisableReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableReplicationWithOptions(request, runtime);
    }

    public EnableReplicationResponse enableReplicationWithOptions(EnableReplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crashConsistentPointPolicy)) {
            query.put("CrashConsistentPointPolicy", request.crashConsistentPointPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationNetwork)) {
            query.put("ReplicationNetwork", request.replicationNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationUseEssd)) {
            query.put("ReplicationUseEssd", request.replicationUseEssd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationUseSsd)) {
            query.put("ReplicationUseSsd", request.replicationUseSsd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableReplicationResponse());
    }

    public EnableReplicationResponse enableReplication(EnableReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableReplicationWithOptions(request, runtime);
    }

    public FailbackResponse failbackWithOptions(FailbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInfrastructureId)) {
            query.put("RecoveryInfrastructureId", request.recoveryInfrastructureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceName)) {
            query.put("RecoveryInstanceName", request.recoveryInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceType)) {
            query.put("RecoveryInstanceType", request.recoveryInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryIpAddress)) {
            query.put("RecoveryIpAddress", request.recoveryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMemory)) {
            query.put("RecoveryMemory", request.recoveryMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptContent)) {
            query.put("RecoveryPostScriptContent", request.recoveryPostScriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptType)) {
            query.put("RecoveryPostScriptType", request.recoveryPostScriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryReserveIp)) {
            query.put("RecoveryReserveIp", request.recoveryReserveIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseDhcp)) {
            query.put("RecoveryUseDhcp", request.recoveryUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Failback"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FailbackResponse());
    }

    public FailbackResponse failback(FailbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.failbackWithOptions(request, runtime);
    }

    public ForcedFailoverResponse forcedFailoverWithOptions(ForcedFailoverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddressId)) {
            query.put("EipAddressId", request.eipAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryEssdPerformanceLevel)) {
            query.put("RecoveryEssdPerformanceLevel", request.recoveryEssdPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceName)) {
            query.put("RecoveryInstanceName", request.recoveryInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceType)) {
            query.put("RecoveryInstanceType", request.recoveryInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryIpAddress)) {
            query.put("RecoveryIpAddress", request.recoveryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMemory)) {
            query.put("RecoveryMemory", request.recoveryMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptContent)) {
            query.put("RecoveryPostScriptContent", request.recoveryPostScriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptType)) {
            query.put("RecoveryPostScriptType", request.recoveryPostScriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryReserveIp)) {
            query.put("RecoveryReserveIp", request.recoveryReserveIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseDhcp)) {
            query.put("RecoveryUseDhcp", request.recoveryUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseEssd)) {
            query.put("RecoveryUseEssd", request.recoveryUseEssd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseSsd)) {
            query.put("RecoveryUseSsd", request.recoveryUseSsd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForcedFailover"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForcedFailoverResponse());
    }

    public ForcedFailoverResponse forcedFailover(ForcedFailoverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forcedFailoverWithOptions(request, runtime);
    }

    public RegisterServersResponse registerServersWithOptions(RegisterServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPort)) {
            query.put("AgentPort", request.agentPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverInstancesInfo)) {
            query.put("ServerInstancesInfo", request.serverInstancesInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterServers"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterServersResponse());
    }

    public RegisterServersResponse registerServers(RegisterServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerServersWithOptions(request, runtime);
    }

    public ReversedDisableReplicationResponse reversedDisableReplicationWithOptions(ReversedDisableReplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReversedDisableReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReversedDisableReplicationResponse());
    }

    public ReversedDisableReplicationResponse reversedDisableReplication(ReversedDisableReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reversedDisableReplicationWithOptions(request, runtime);
    }

    public ReversedEnableReplicationResponse reversedEnableReplicationWithOptions(ReversedEnableReplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appConsistentPointPolicy)) {
            query.put("AppConsistentPointPolicy", request.appConsistentPointPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crashConsistentPointPolicy)) {
            query.put("CrashConsistentPointPolicy", request.crashConsistentPointPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationComputeResource)) {
            query.put("ReplicationComputeResource", request.replicationComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationDatastore)) {
            query.put("ReplicationDatastore", request.replicationDatastore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationDns)) {
            query.put("ReplicationDns", request.replicationDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationGateway)) {
            query.put("ReplicationGateway", request.replicationGateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationInfrastructureId)) {
            query.put("ReplicationInfrastructureId", request.replicationInfrastructureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationIpAddress)) {
            query.put("ReplicationIpAddress", request.replicationIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationLocation)) {
            query.put("ReplicationLocation", request.replicationLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationNetMask)) {
            query.put("ReplicationNetMask", request.replicationNetMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationNetwork)) {
            query.put("ReplicationNetwork", request.replicationNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationUseDhcp)) {
            query.put("ReplicationUseDhcp", request.replicationUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationUseOriginalInstance)) {
            query.put("ReplicationUseOriginalInstance", request.replicationUseOriginalInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shadowInstanceType)) {
            query.put("ShadowInstanceType", request.shadowInstanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReversedEnableReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReversedEnableReplicationResponse());
    }

    public ReversedEnableReplicationResponse reversedEnableReplication(ReversedEnableReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reversedEnableReplicationWithOptions(request, runtime);
    }

    public TestCleanupResponse testCleanupWithOptions(TestCleanupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestCleanup"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestCleanupResponse());
    }

    public TestCleanupResponse testCleanup(TestCleanupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testCleanupWithOptions(request, runtime);
    }

    public TestFailoverResponse testFailoverWithOptions(TestFailoverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddressId)) {
            query.put("EipAddressId", request.eipAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryEssdPerformanceLevel)) {
            query.put("RecoveryEssdPerformanceLevel", request.recoveryEssdPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceName)) {
            query.put("RecoveryInstanceName", request.recoveryInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceType)) {
            query.put("RecoveryInstanceType", request.recoveryInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryIpAddress)) {
            query.put("RecoveryIpAddress", request.recoveryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMemory)) {
            query.put("RecoveryMemory", request.recoveryMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptContent)) {
            query.put("RecoveryPostScriptContent", request.recoveryPostScriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptType)) {
            query.put("RecoveryPostScriptType", request.recoveryPostScriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryReserveIp)) {
            query.put("RecoveryReserveIp", request.recoveryReserveIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseDhcp)) {
            query.put("RecoveryUseDhcp", request.recoveryUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseEssd)) {
            query.put("RecoveryUseEssd", request.recoveryUseEssd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseSsd)) {
            query.put("RecoveryUseSsd", request.recoveryUseSsd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestFailover"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestFailoverResponse());
    }

    public TestFailoverResponse testFailover(TestFailoverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testFailoverWithOptions(request, runtime);
    }

    public TriggerReversedRegisterResponse triggerReversedRegisterWithOptions(TriggerReversedRegisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerReversedRegister"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerReversedRegisterResponse());
    }

    public TriggerReversedRegisterResponse triggerReversedRegister(TriggerReversedRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerReversedRegisterWithOptions(request, runtime);
    }

    public UnregisterServerResponse unregisterServerWithOptions(UnregisterServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnregisterServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnregisterServerResponse());
    }

    public UnregisterServerResponse unregisterServer(UnregisterServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unregisterServerWithOptions(request, runtime);
    }

    public UpdateRecoveryPlanResponse updateRecoveryPlanWithOptions(UpdateRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecoveryPlan"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecoveryPlanResponse());
    }

    public UpdateRecoveryPlanResponse updateRecoveryPlan(UpdateRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecoveryPlanWithOptions(request, runtime);
    }
}
