// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925;

import com.aliyun.tea.*;
import com.aliyun.hdr20170925.models.*;
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

    public ChangeRecoveryPointResponse changeRecoveryPointWithOptions(ChangeRecoveryPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddressId)) {
            query.put("EipAddressId", request.eipAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
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

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeRecoveryPointWithOptions(request, runtime);
    }

    public CommitFailoverResponse commitFailoverWithOptions(CommitFailoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commitFailoverWithOptions(request, runtime);
    }

    public CreateSitePairResponse createSitePairWithOptions(CreateSitePairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudSiteName)) {
            query.put("CloudSiteName", request.cloudSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localGatewayName)) {
            query.put("LocalGatewayName", request.localGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localSiteName)) {
            query.put("LocalSiteName", request.localSiteName);
        }

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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSitePairWithOptions(request, runtime);
    }

    public DeleteSitePairResponse deleteSitePairWithOptions(DeleteSitePairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSitePairWithOptions(request, runtime);
    }

    public DescribeAvailableInstanceTypesResponse describeAvailableInstanceTypesWithOptions(DescribeAvailableInstanceTypesRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableInstanceTypesWithOptions(request, runtime);
    }

    public DescribeInfrastructuresResponse describeInfrastructuresWithOptions(DescribeInfrastructuresRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInfrastructuresWithOptions(request, runtime);
    }

    public DescribeRecoveryPointsResponse describeRecoveryPointsWithOptions(DescribeRecoveryPointsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecoveryPointsWithOptions(request, runtime);
    }

    public DescribeServerResponse describeServerWithOptions(DescribeServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServerWithOptions(request, runtime);
    }

    public DescribeServersResponse describeServersWithOptions(DescribeServersRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServersWithOptions(request, runtime);
    }

    public DescribeSiteResponse describeSiteWithOptions(DescribeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSiteWithOptions(request, runtime);
    }

    public DescribeSitePairResponse describeSitePairWithOptions(DescribeSitePairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSitePairWithOptions(request, runtime);
    }

    public DescribeSitePairsResponse describeSitePairsWithOptions(DescribeSitePairsRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairType)) {
            query.put("SitePairType", request.sitePairType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSitePairsWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DisableReplicationResponse disableReplicationWithOptions(DisableReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableReplicationWithOptions(request, runtime);
    }

    public EnableReplicationResponse enableReplicationWithOptions(EnableReplicationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableReplicationWithOptions(request, runtime);
    }

    public FailbackResponse failbackWithOptions(FailbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryComputeResource)) {
            query.put("RecoveryComputeResource", request.recoveryComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryDatastore)) {
            query.put("RecoveryDatastore", request.recoveryDatastore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryDns)) {
            query.put("RecoveryDns", request.recoveryDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryGateway)) {
            query.put("RecoveryGateway", request.recoveryGateway);
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

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryLocation)) {
            query.put("RecoveryLocation", request.recoveryLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMemory)) {
            query.put("RecoveryMemory", request.recoveryMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetMask)) {
            query.put("RecoveryNetMask", request.recoveryNetMask);
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

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.failbackWithOptions(request, runtime);
    }

    public ForcedFailoverResponse forcedFailoverWithOptions(ForcedFailoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddressId)) {
            query.put("EipAddressId", request.eipAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
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

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.forcedFailoverWithOptions(request, runtime);
    }

    public RegisterServersResponse registerServersWithOptions(RegisterServersRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerServersWithOptions(request, runtime);
    }

    public ReversedDisableReplicationResponse reversedDisableReplicationWithOptions(ReversedDisableReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reversedDisableReplicationWithOptions(request, runtime);
    }

    public ReversedRegisterServerResponse reversedRegisterServerWithOptions(ReversedRegisterServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bootMode)) {
            query.put("BootMode", request.bootMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disks)) {
            query.put("Disks", request.disks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            query.put("Hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipAddress)) {
            query.put("IpAddress", request.ipAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osDetail)) {
            query.put("OsDetail", request.osDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumes)) {
            query.put("Volumes", request.volumes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReversedRegisterServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReversedRegisterServerResponse());
    }

    public ReversedRegisterServerResponse reversedRegisterServer(ReversedRegisterServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reversedRegisterServerWithOptions(request, runtime);
    }

    public TestCleanupResponse testCleanupWithOptions(TestCleanupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testCleanupWithOptions(request, runtime);
    }

    public TestFailoverResponse testFailoverWithOptions(TestFailoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddressId)) {
            query.put("EipAddressId", request.eipAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testFailoverWithOptions(request, runtime);
    }

    public TriggerReversedRegisterResponse triggerReversedRegisterWithOptions(TriggerReversedRegisterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerReversedRegisterWithOptions(request, runtime);
    }

    public UnregisterServerResponse unregisterServerWithOptions(UnregisterServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unregisterServerWithOptions(request, runtime);
    }
}
