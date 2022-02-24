// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309;

import com.aliyun.tea.*;
import com.aliyun.eipanycast20200309.models.*;
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
        this._endpoint = this.getEndpoint("eipanycast", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AllocateAnycastEipAddressResponse allocateAnycastEipAddressWithOptions(AllocateAnycastEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceLocation)) {
            query.put("ServiceLocation", request.serviceLocation);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateAnycastEipAddress"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateAnycastEipAddressResponse());
    }

    public AllocateAnycastEipAddressResponse allocateAnycastEipAddress(AllocateAnycastEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateAnycastEipAddressWithOptions(request, runtime);
    }

    public AssociateAnycastEipAddressResponse associateAnycastEipAddressWithOptions(AssociateAnycastEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anycastId)) {
            query.put("AnycastId", request.anycastId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationMode)) {
            query.put("AssociationMode", request.associationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindInstanceId)) {
            query.put("BindInstanceId", request.bindInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindInstanceRegionId)) {
            query.put("BindInstanceRegionId", request.bindInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindInstanceType)) {
            query.put("BindInstanceType", request.bindInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popLocations)) {
            query.put("PopLocations", request.popLocations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateAnycastEipAddress"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateAnycastEipAddressResponse());
    }

    public AssociateAnycastEipAddressResponse associateAnycastEipAddress(AssociateAnycastEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateAnycastEipAddressWithOptions(request, runtime);
    }

    public DescribeAnycastEipAddressResponse describeAnycastEipAddressWithOptions(DescribeAnycastEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anycastId)) {
            query.put("AnycastId", request.anycastId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindInstanceId)) {
            query.put("BindInstanceId", request.bindInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAnycastEipAddress"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAnycastEipAddressResponse());
    }

    public DescribeAnycastEipAddressResponse describeAnycastEipAddress(DescribeAnycastEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAnycastEipAddressWithOptions(request, runtime);
    }

    public DescribeAnycastPopLocationsResponse describeAnycastPopLocationsWithOptions(DescribeAnycastPopLocationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceLocation)) {
            query.put("ServiceLocation", request.serviceLocation);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAnycastPopLocations"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAnycastPopLocationsResponse());
    }

    public DescribeAnycastPopLocationsResponse describeAnycastPopLocations(DescribeAnycastPopLocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAnycastPopLocationsWithOptions(request, runtime);
    }

    public DescribeAnycastServerRegionsResponse describeAnycastServerRegionsWithOptions(DescribeAnycastServerRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceLocation)) {
            query.put("ServiceLocation", request.serviceLocation);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAnycastServerRegions"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAnycastServerRegionsResponse());
    }

    public DescribeAnycastServerRegionsResponse describeAnycastServerRegions(DescribeAnycastServerRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAnycastServerRegionsWithOptions(request, runtime);
    }

    public ListAnycastEipAddressesResponse listAnycastEipAddressesWithOptions(ListAnycastEipAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anycastEipAddress)) {
            query.put("AnycastEipAddress", request.anycastEipAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anycastId)) {
            query.put("AnycastId", request.anycastId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindInstanceIds)) {
            query.put("BindInstanceIds", request.bindInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessStatus)) {
            query.put("BusinessStatus", request.businessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceLocation)) {
            query.put("ServiceLocation", request.serviceLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnycastEipAddresses"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnycastEipAddressesResponse());
    }

    public ListAnycastEipAddressesResponse listAnycastEipAddresses(ListAnycastEipAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnycastEipAddressesWithOptions(request, runtime);
    }

    public ModifyAnycastEipAddressAttributeResponse modifyAnycastEipAddressAttributeWithOptions(ModifyAnycastEipAddressAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anycastId)) {
            query.put("AnycastId", request.anycastId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAnycastEipAddressAttribute"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAnycastEipAddressAttributeResponse());
    }

    public ModifyAnycastEipAddressAttributeResponse modifyAnycastEipAddressAttribute(ModifyAnycastEipAddressAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAnycastEipAddressAttributeWithOptions(request, runtime);
    }

    public ModifyAnycastEipAddressSpecResponse modifyAnycastEipAddressSpecWithOptions(ModifyAnycastEipAddressSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anycastId)) {
            query.put("AnycastId", request.anycastId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAnycastEipAddressSpec"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAnycastEipAddressSpecResponse());
    }

    public ModifyAnycastEipAddressSpecResponse modifyAnycastEipAddressSpec(ModifyAnycastEipAddressSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAnycastEipAddressSpecWithOptions(request, runtime);
    }

    public ReleaseAnycastEipAddressResponse releaseAnycastEipAddressWithOptions(ReleaseAnycastEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anycastId)) {
            query.put("AnycastId", request.anycastId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseAnycastEipAddress"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseAnycastEipAddressResponse());
    }

    public ReleaseAnycastEipAddressResponse releaseAnycastEipAddress(ReleaseAnycastEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseAnycastEipAddressWithOptions(request, runtime);
    }

    public UnassociateAnycastEipAddressResponse unassociateAnycastEipAddressWithOptions(UnassociateAnycastEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anycastId)) {
            query.put("AnycastId", request.anycastId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindInstanceId)) {
            query.put("BindInstanceId", request.bindInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindInstanceRegionId)) {
            query.put("BindInstanceRegionId", request.bindInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindInstanceType)) {
            query.put("BindInstanceType", request.bindInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassociateAnycastEipAddress"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassociateAnycastEipAddressResponse());
    }

    public UnassociateAnycastEipAddressResponse unassociateAnycastEipAddress(UnassociateAnycastEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateAnycastEipAddressWithOptions(request, runtime);
    }

    public UpdateAnycastEipAddressAssociationsResponse updateAnycastEipAddressAssociationsWithOptions(UpdateAnycastEipAddressAssociationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anycastId)) {
            query.put("AnycastId", request.anycastId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationMode)) {
            query.put("AssociationMode", request.associationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindInstanceId)) {
            query.put("BindInstanceId", request.bindInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popLocationAddList)) {
            query.put("PopLocationAddList", request.popLocationAddList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.popLocationDeleteList)) {
            query.put("PopLocationDeleteList", request.popLocationDeleteList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAnycastEipAddressAssociations"),
            new TeaPair("version", "2020-03-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAnycastEipAddressAssociationsResponse());
    }

    public UpdateAnycastEipAddressAssociationsResponse updateAnycastEipAddressAssociations(UpdateAnycastEipAddressAssociationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAnycastEipAddressAssociationsWithOptions(request, runtime);
    }
}
