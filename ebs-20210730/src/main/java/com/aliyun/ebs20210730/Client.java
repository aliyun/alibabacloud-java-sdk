// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730;

import com.aliyun.tea.*;
import com.aliyun.ebs20210730.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ebs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateDiskReplicaPairResponse createDiskReplicaPairWithOptions(CreateDiskReplicaPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Bandwidth", request.bandwidth);
        query.put("ChargeType", request.chargeType);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("DestinationDiskId", request.destinationDiskId);
        query.put("DestinationRegionId", request.destinationRegionId);
        query.put("DestinationZoneId", request.destinationZoneId);
        query.put("DiskId", request.diskId);
        query.put("PairName", request.pairName);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("SourceRegionId", request.sourceRegionId);
        query.put("SourceZoneId", request.sourceZoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiskReplicaPairResponse());
    }

    public CreateDiskReplicaPairResponse createDiskReplicaPair(CreateDiskReplicaPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDiskReplicaPairWithOptions(request, runtime);
    }

    public DeleteDiskReplicaPairResponse deleteDiskReplicaPairWithOptions(DeleteDiskReplicaPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("ReplicaPairId", request.replicaPairId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDiskReplicaPairResponse());
    }

    public DeleteDiskReplicaPairResponse deleteDiskReplicaPair(DeleteDiskReplicaPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDiskReplicaPairWithOptions(request, runtime);
    }

    public DescribeDiskReplicaPairsResponse describeDiskReplicaPairsWithOptions(DescribeDiskReplicaPairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("PairIds", request.pairIds);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiskReplicaPairs"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiskReplicaPairsResponse());
    }

    public DescribeDiskReplicaPairsResponse describeDiskReplicaPairs(DescribeDiskReplicaPairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiskReplicaPairsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AcceptLanguage", request.acceptLanguage);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public FailoverDiskReplicaPairResponse failoverDiskReplicaPairWithOptions(FailoverDiskReplicaPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("ReplicaPairId", request.replicaPairId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FailoverDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FailoverDiskReplicaPairResponse());
    }

    public FailoverDiskReplicaPairResponse failoverDiskReplicaPair(FailoverDiskReplicaPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.failoverDiskReplicaPairWithOptions(request, runtime);
    }

    public ModifyDiskReplicaPairResponse modifyDiskReplicaPairWithOptions(ModifyDiskReplicaPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("PairName", request.pairName);
        query.put("RegionId", request.regionId);
        query.put("ReplicaPairId", request.replicaPairId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskReplicaPairResponse());
    }

    public ModifyDiskReplicaPairResponse modifyDiskReplicaPair(ModifyDiskReplicaPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDiskReplicaPairWithOptions(request, runtime);
    }

    public ReprotectDiskReplicaPairResponse reprotectDiskReplicaPairWithOptions(ReprotectDiskReplicaPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("ReplicaPairId", request.replicaPairId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReprotectDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReprotectDiskReplicaPairResponse());
    }

    public ReprotectDiskReplicaPairResponse reprotectDiskReplicaPair(ReprotectDiskReplicaPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reprotectDiskReplicaPairWithOptions(request, runtime);
    }

    public StartDiskReplicaPairResponse startDiskReplicaPairWithOptions(StartDiskReplicaPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("ReplicaPairId", request.replicaPairId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDiskReplicaPairResponse());
    }

    public StartDiskReplicaPairResponse startDiskReplicaPair(StartDiskReplicaPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDiskReplicaPairWithOptions(request, runtime);
    }

    public StopDiskReplicaPairResponse stopDiskReplicaPairWithOptions(StopDiskReplicaPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("ReplicaPairId", request.replicaPairId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDiskReplicaPairResponse());
    }

    public StopDiskReplicaPairResponse stopDiskReplicaPair(StopDiskReplicaPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDiskReplicaPairWithOptions(request, runtime);
    }
}
