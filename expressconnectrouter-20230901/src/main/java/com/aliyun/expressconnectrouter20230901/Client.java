// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901;

import com.aliyun.tea.*;
import com.aliyun.expressconnectrouter20230901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("expressconnectrouter", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AttachExpressConnectRouterChildInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachExpressConnectRouterChildInstanceResponse
     */
    public AttachExpressConnectRouterChildInstanceResponse attachExpressConnectRouterChildInstanceWithOptions(AttachExpressConnectRouterChildInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            body.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceOwnerId)) {
            body.put("ChildInstanceOwnerId", request.childInstanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            body.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            body.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachExpressConnectRouterChildInstance"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachExpressConnectRouterChildInstanceResponse());
    }

    /**
     * @param request AttachExpressConnectRouterChildInstanceRequest
     * @return AttachExpressConnectRouterChildInstanceResponse
     */
    public AttachExpressConnectRouterChildInstanceResponse attachExpressConnectRouterChildInstance(AttachExpressConnectRouterChildInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachExpressConnectRouterChildInstanceWithOptions(request, runtime);
    }

    /**
     * @param request CheckAddRegionToExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAddRegionToExpressConnectRouterResponse
     */
    public CheckAddRegionToExpressConnectRouterResponse checkAddRegionToExpressConnectRouterWithOptions(CheckAddRegionToExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freshRegionId)) {
            body.put("FreshRegionId", request.freshRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAddRegionToExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAddRegionToExpressConnectRouterResponse());
    }

    /**
     * @param request CheckAddRegionToExpressConnectRouterRequest
     * @return CheckAddRegionToExpressConnectRouterResponse
     */
    public CheckAddRegionToExpressConnectRouterResponse checkAddRegionToExpressConnectRouter(CheckAddRegionToExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAddRegionToExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * @param request CreateExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExpressConnectRouterResponse
     */
    public CreateExpressConnectRouterResponse createExpressConnectRouterWithOptions(CreateExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alibabaSideAsn)) {
            body.put("AlibabaSideAsn", request.alibabaSideAsn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExpressConnectRouterResponse());
    }

    /**
     * @param request CreateExpressConnectRouterRequest
     * @return CreateExpressConnectRouterResponse
     */
    public CreateExpressConnectRouterResponse createExpressConnectRouter(CreateExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * @param request CreateExpressConnectRouterAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExpressConnectRouterAssociationResponse
     */
    public CreateExpressConnectRouterAssociationResponse createExpressConnectRouterAssociationWithOptions(CreateExpressConnectRouterAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedPrefixes)) {
            body.put("AllowedPrefixes", request.allowedPrefixes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationRegionId)) {
            body.put("AssociationRegionId", request.associationRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            body.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createAttachment)) {
            body.put("CreateAttachment", request.createAttachment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            body.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterOwnerId)) {
            body.put("TransitRouterOwnerId", request.transitRouterOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcOwnerId)) {
            body.put("VpcOwnerId", request.vpcOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExpressConnectRouterAssociation"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExpressConnectRouterAssociationResponse());
    }

    /**
     * @param request CreateExpressConnectRouterAssociationRequest
     * @return CreateExpressConnectRouterAssociationResponse
     */
    public CreateExpressConnectRouterAssociationResponse createExpressConnectRouterAssociation(CreateExpressConnectRouterAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExpressConnectRouterAssociationWithOptions(request, runtime);
    }

    /**
     * @param request DeleteExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExpressConnectRouterResponse
     */
    public DeleteExpressConnectRouterResponse deleteExpressConnectRouterWithOptions(DeleteExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExpressConnectRouterResponse());
    }

    /**
     * @param request DeleteExpressConnectRouterRequest
     * @return DeleteExpressConnectRouterResponse
     */
    public DeleteExpressConnectRouterResponse deleteExpressConnectRouter(DeleteExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * @param request DeleteExpressConnectRouterAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExpressConnectRouterAssociationResponse
     */
    public DeleteExpressConnectRouterAssociationResponse deleteExpressConnectRouterAssociationWithOptions(DeleteExpressConnectRouterAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteAttachment)) {
            body.put("DeleteAttachment", request.deleteAttachment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExpressConnectRouterAssociation"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExpressConnectRouterAssociationResponse());
    }

    /**
     * @param request DeleteExpressConnectRouterAssociationRequest
     * @return DeleteExpressConnectRouterAssociationResponse
     */
    public DeleteExpressConnectRouterAssociationResponse deleteExpressConnectRouterAssociation(DeleteExpressConnectRouterAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExpressConnectRouterAssociationWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDisabledExpressConnectRouterRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDisabledExpressConnectRouterRouteEntriesResponse
     */
    public DescribeDisabledExpressConnectRouterRouteEntriesResponse describeDisabledExpressConnectRouterRouteEntriesWithOptions(DescribeDisabledExpressConnectRouterRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDisabledExpressConnectRouterRouteEntries"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDisabledExpressConnectRouterRouteEntriesResponse());
    }

    /**
     * @param request DescribeDisabledExpressConnectRouterRouteEntriesRequest
     * @return DescribeDisabledExpressConnectRouterRouteEntriesResponse
     */
    public DescribeDisabledExpressConnectRouterRouteEntriesResponse describeDisabledExpressConnectRouterRouteEntries(DescribeDisabledExpressConnectRouterRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDisabledExpressConnectRouterRouteEntriesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterResponse
     */
    public DescribeExpressConnectRouterResponse describeExpressConnectRouterWithOptions(DescribeExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagModels)) {
            body.put("TagModels", request.tagModels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterResponse());
    }

    /**
     * @param request DescribeExpressConnectRouterRequest
     * @return DescribeExpressConnectRouterResponse
     */
    public DescribeExpressConnectRouterResponse describeExpressConnectRouter(DescribeExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExpressConnectRouterAllowedPrefixHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterAllowedPrefixHistoryResponse
     */
    public DescribeExpressConnectRouterAllowedPrefixHistoryResponse describeExpressConnectRouterAllowedPrefixHistoryWithOptions(DescribeExpressConnectRouterAllowedPrefixHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterAllowedPrefixHistory"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterAllowedPrefixHistoryResponse());
    }

    /**
     * @param request DescribeExpressConnectRouterAllowedPrefixHistoryRequest
     * @return DescribeExpressConnectRouterAllowedPrefixHistoryResponse
     */
    public DescribeExpressConnectRouterAllowedPrefixHistoryResponse describeExpressConnectRouterAllowedPrefixHistory(DescribeExpressConnectRouterAllowedPrefixHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterAllowedPrefixHistoryWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExpressConnectRouterAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterAssociationResponse
     */
    public DescribeExpressConnectRouterAssociationResponse describeExpressConnectRouterAssociationWithOptions(DescribeExpressConnectRouterAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationNodeType)) {
            body.put("AssociationNodeType", request.associationNodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationRegionId)) {
            body.put("AssociationRegionId", request.associationRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            body.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            body.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterAssociation"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterAssociationResponse());
    }

    /**
     * @param request DescribeExpressConnectRouterAssociationRequest
     * @return DescribeExpressConnectRouterAssociationResponse
     */
    public DescribeExpressConnectRouterAssociationResponse describeExpressConnectRouterAssociation(DescribeExpressConnectRouterAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterAssociationWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExpressConnectRouterChildInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterChildInstanceResponse
     */
    public DescribeExpressConnectRouterChildInstanceResponse describeExpressConnectRouterChildInstanceWithOptions(DescribeExpressConnectRouterChildInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            body.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            body.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            body.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterChildInstance"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterChildInstanceResponse());
    }

    /**
     * @param request DescribeExpressConnectRouterChildInstanceRequest
     * @return DescribeExpressConnectRouterChildInstanceResponse
     */
    public DescribeExpressConnectRouterChildInstanceResponse describeExpressConnectRouterChildInstance(DescribeExpressConnectRouterChildInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterChildInstanceWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExpressConnectRouterInterRegionTransitModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterInterRegionTransitModeResponse
     */
    public DescribeExpressConnectRouterInterRegionTransitModeResponse describeExpressConnectRouterInterRegionTransitModeWithOptions(DescribeExpressConnectRouterInterRegionTransitModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterInterRegionTransitMode"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterInterRegionTransitModeResponse());
    }

    /**
     * @param request DescribeExpressConnectRouterInterRegionTransitModeRequest
     * @return DescribeExpressConnectRouterInterRegionTransitModeResponse
     */
    public DescribeExpressConnectRouterInterRegionTransitModeResponse describeExpressConnectRouterInterRegionTransitMode(DescribeExpressConnectRouterInterRegionTransitModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterInterRegionTransitModeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExpressConnectRouterRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterRegionResponse
     */
    public DescribeExpressConnectRouterRegionResponse describeExpressConnectRouterRegionWithOptions(DescribeExpressConnectRouterRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterRegion"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterRegionResponse());
    }

    /**
     * @param request DescribeExpressConnectRouterRegionRequest
     * @return DescribeExpressConnectRouterRegionResponse
     */
    public DescribeExpressConnectRouterRegionResponse describeExpressConnectRouterRegion(DescribeExpressConnectRouterRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterRegionWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExpressConnectRouterRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterRouteEntriesResponse
     */
    public DescribeExpressConnectRouterRouteEntriesResponse describeExpressConnectRouterRouteEntriesWithOptions(DescribeExpressConnectRouterRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asPath)) {
            body.put("AsPath", request.asPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.community)) {
            body.put("Community", request.community);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nexthopInstanceId)) {
            body.put("NexthopInstanceId", request.nexthopInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRegionId)) {
            body.put("QueryRegionId", request.queryRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterRouteEntries"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterRouteEntriesResponse());
    }

    /**
     * @param request DescribeExpressConnectRouterRouteEntriesRequest
     * @return DescribeExpressConnectRouterRouteEntriesResponse
     */
    public DescribeExpressConnectRouterRouteEntriesResponse describeExpressConnectRouterRouteEntries(DescribeExpressConnectRouterRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterRouteEntriesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInstanceGrantedToExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceGrantedToExpressConnectRouterResponse
     */
    public DescribeInstanceGrantedToExpressConnectRouterResponse describeInstanceGrantedToExpressConnectRouterWithOptions(DescribeInstanceGrantedToExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            body.put("InstanceOwnerId", request.instanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegionId)) {
            body.put("InstanceRegionId", request.instanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagModels)) {
            body.put("TagModels", request.tagModels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceGrantedToExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceGrantedToExpressConnectRouterResponse());
    }

    /**
     * @param request DescribeInstanceGrantedToExpressConnectRouterRequest
     * @return DescribeInstanceGrantedToExpressConnectRouterResponse
     */
    public DescribeInstanceGrantedToExpressConnectRouterResponse describeInstanceGrantedToExpressConnectRouter(DescribeInstanceGrantedToExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceGrantedToExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * @param request DetachExpressConnectRouterChildInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachExpressConnectRouterChildInstanceResponse
     */
    public DetachExpressConnectRouterChildInstanceResponse detachExpressConnectRouterChildInstanceWithOptions(DetachExpressConnectRouterChildInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            body.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            body.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachExpressConnectRouterChildInstance"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachExpressConnectRouterChildInstanceResponse());
    }

    /**
     * @param request DetachExpressConnectRouterChildInstanceRequest
     * @return DetachExpressConnectRouterChildInstanceResponse
     */
    public DetachExpressConnectRouterChildInstanceResponse detachExpressConnectRouterChildInstance(DetachExpressConnectRouterChildInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachExpressConnectRouterChildInstanceWithOptions(request, runtime);
    }

    /**
     * @param request DisableExpressConnectRouterRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableExpressConnectRouterRouteEntriesResponse
     */
    public DisableExpressConnectRouterRouteEntriesResponse disableExpressConnectRouterRouteEntriesWithOptions(DisableExpressConnectRouterRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nexthopInstanceId)) {
            body.put("NexthopInstanceId", request.nexthopInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableExpressConnectRouterRouteEntries"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableExpressConnectRouterRouteEntriesResponse());
    }

    /**
     * @param request DisableExpressConnectRouterRouteEntriesRequest
     * @return DisableExpressConnectRouterRouteEntriesResponse
     */
    public DisableExpressConnectRouterRouteEntriesResponse disableExpressConnectRouterRouteEntries(DisableExpressConnectRouterRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableExpressConnectRouterRouteEntriesWithOptions(request, runtime);
    }

    /**
     * @param request EnableExpressConnectRouterRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableExpressConnectRouterRouteEntriesResponse
     */
    public EnableExpressConnectRouterRouteEntriesResponse enableExpressConnectRouterRouteEntriesWithOptions(EnableExpressConnectRouterRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nexthopInstanceId)) {
            body.put("NexthopInstanceId", request.nexthopInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableExpressConnectRouterRouteEntries"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableExpressConnectRouterRouteEntriesResponse());
    }

    /**
     * @param request EnableExpressConnectRouterRouteEntriesRequest
     * @return EnableExpressConnectRouterRouteEntriesResponse
     */
    public EnableExpressConnectRouterRouteEntriesResponse enableExpressConnectRouterRouteEntries(EnableExpressConnectRouterRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableExpressConnectRouterRouteEntriesWithOptions(request, runtime);
    }

    /**
     * @param request ForceDeleteExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ForceDeleteExpressConnectRouterResponse
     */
    public ForceDeleteExpressConnectRouterResponse forceDeleteExpressConnectRouterWithOptions(ForceDeleteExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForceDeleteExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForceDeleteExpressConnectRouterResponse());
    }

    /**
     * @param request ForceDeleteExpressConnectRouterRequest
     * @return ForceDeleteExpressConnectRouterResponse
     */
    public ForceDeleteExpressConnectRouterResponse forceDeleteExpressConnectRouter(ForceDeleteExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forceDeleteExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * @param request GrantInstanceToExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantInstanceToExpressConnectRouterResponse
     */
    public GrantInstanceToExpressConnectRouterResponse grantInstanceToExpressConnectRouterWithOptions(GrantInstanceToExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrOwnerAliUid)) {
            body.put("EcrOwnerAliUid", request.ecrOwnerAliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegionId)) {
            body.put("InstanceRegionId", request.instanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantInstanceToExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantInstanceToExpressConnectRouterResponse());
    }

    /**
     * @param request GrantInstanceToExpressConnectRouterRequest
     * @return GrantInstanceToExpressConnectRouterResponse
     */
    public GrantInstanceToExpressConnectRouterResponse grantInstanceToExpressConnectRouter(GrantInstanceToExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantInstanceToExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * @param request ListExpressConnectRouterSupportedRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExpressConnectRouterSupportedRegionResponse
     */
    public ListExpressConnectRouterSupportedRegionResponse listExpressConnectRouterSupportedRegionWithOptions(ListExpressConnectRouterSupportedRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            body.put("NodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExpressConnectRouterSupportedRegion"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExpressConnectRouterSupportedRegionResponse());
    }

    /**
     * @param request ListExpressConnectRouterSupportedRegionRequest
     * @return ListExpressConnectRouterSupportedRegionResponse
     */
    public ListExpressConnectRouterSupportedRegionResponse listExpressConnectRouterSupportedRegion(ListExpressConnectRouterSupportedRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExpressConnectRouterSupportedRegionWithOptions(request, runtime);
    }

    /**
     * @param request ModifyExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyExpressConnectRouterResponse
     */
    public ModifyExpressConnectRouterResponse modifyExpressConnectRouterWithOptions(ModifyExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyExpressConnectRouterResponse());
    }

    /**
     * @param request ModifyExpressConnectRouterRequest
     * @return ModifyExpressConnectRouterResponse
     */
    public ModifyExpressConnectRouterResponse modifyExpressConnectRouter(ModifyExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * @param request ModifyExpressConnectRouterAssociationAllowedPrefixRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyExpressConnectRouterAssociationAllowedPrefixResponse
     */
    public ModifyExpressConnectRouterAssociationAllowedPrefixResponse modifyExpressConnectRouterAssociationAllowedPrefixWithOptions(ModifyExpressConnectRouterAssociationAllowedPrefixRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedPrefixes)) {
            body.put("AllowedPrefixes", request.allowedPrefixes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            body.put("OwnerAccount", request.ownerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyExpressConnectRouterAssociationAllowedPrefix"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyExpressConnectRouterAssociationAllowedPrefixResponse());
    }

    /**
     * @param request ModifyExpressConnectRouterAssociationAllowedPrefixRequest
     * @return ModifyExpressConnectRouterAssociationAllowedPrefixResponse
     */
    public ModifyExpressConnectRouterAssociationAllowedPrefixResponse modifyExpressConnectRouterAssociationAllowedPrefix(ModifyExpressConnectRouterAssociationAllowedPrefixRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExpressConnectRouterAssociationAllowedPrefixWithOptions(request, runtime);
    }

    /**
     * @param request ModifyExpressConnectRouterInterRegionTransitModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyExpressConnectRouterInterRegionTransitModeResponse
     */
    public ModifyExpressConnectRouterInterRegionTransitModeResponse modifyExpressConnectRouterInterRegionTransitModeWithOptions(ModifyExpressConnectRouterInterRegionTransitModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitModeList)) {
            body.put("TransitModeList", request.transitModeList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyExpressConnectRouterInterRegionTransitMode"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyExpressConnectRouterInterRegionTransitModeResponse());
    }

    /**
     * @param request ModifyExpressConnectRouterInterRegionTransitModeRequest
     * @return ModifyExpressConnectRouterInterRegionTransitModeResponse
     */
    public ModifyExpressConnectRouterInterRegionTransitModeResponse modifyExpressConnectRouterInterRegionTransitMode(ModifyExpressConnectRouterInterRegionTransitModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExpressConnectRouterInterRegionTransitModeWithOptions(request, runtime);
    }

    /**
     * @param request RevokeInstanceFromExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeInstanceFromExpressConnectRouterResponse
     */
    public RevokeInstanceFromExpressConnectRouterResponse revokeInstanceFromExpressConnectRouterWithOptions(RevokeInstanceFromExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrOwnerAliUid)) {
            body.put("EcrOwnerAliUid", request.ecrOwnerAliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegionId)) {
            body.put("InstanceRegionId", request.instanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeInstanceFromExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeInstanceFromExpressConnectRouterResponse());
    }

    /**
     * @param request RevokeInstanceFromExpressConnectRouterRequest
     * @return RevokeInstanceFromExpressConnectRouterResponse
     */
    public RevokeInstanceFromExpressConnectRouterResponse revokeInstanceFromExpressConnectRouter(RevokeInstanceFromExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeInstanceFromExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * @param request SynchronizeExpressConnectRouterInterRegionBandwidthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SynchronizeExpressConnectRouterInterRegionBandwidthResponse
     */
    public SynchronizeExpressConnectRouterInterRegionBandwidthResponse synchronizeExpressConnectRouterInterRegionBandwidthWithOptions(SynchronizeExpressConnectRouterInterRegionBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SynchronizeExpressConnectRouterInterRegionBandwidth"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SynchronizeExpressConnectRouterInterRegionBandwidthResponse());
    }

    /**
     * @param request SynchronizeExpressConnectRouterInterRegionBandwidthRequest
     * @return SynchronizeExpressConnectRouterInterRegionBandwidthResponse
     */
    public SynchronizeExpressConnectRouterInterRegionBandwidthResponse synchronizeExpressConnectRouterInterRegionBandwidth(SynchronizeExpressConnectRouterInterRegionBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.synchronizeExpressConnectRouterInterRegionBandwidthWithOptions(request, runtime);
    }
}
