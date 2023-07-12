// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624;

import com.aliyun.tea.*;
import com.aliyun.eais20190624.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "eais.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "eais.aliyuncs.com"),
            new TeaPair("ap-south-1", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-edge-1", "eais.aliyuncs.com"),
            new TeaPair("cn-fujian", "eais.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "eais.aliyuncs.com"),
            new TeaPair("cn-hongkong", "eais.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "eais.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "eais.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "eais.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "eais.aliyuncs.com"),
            new TeaPair("cn-qingdao", "eais.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-wuhan", "eais.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "eais.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "eais.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "eais.aliyuncs.com"),
            new TeaPair("eu-central-1", "eais.aliyuncs.com"),
            new TeaPair("eu-west-1", "eais.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "eais.aliyuncs.com"),
            new TeaPair("me-east-1", "eais.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "eais.aliyuncs.com"),
            new TeaPair("us-east-1", "eais.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eais", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AttachEaiResponse attachEaiWithOptions(AttachEaiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInstanceId)) {
            query.put("ClientInstanceId", request.clientInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticAcceleratedInstanceId)) {
            query.put("ElasticAcceleratedInstanceId", request.elasticAcceleratedInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachEai"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachEaiResponse());
    }

    public AttachEaiResponse attachEai(AttachEaiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachEaiWithOptions(request, runtime);
    }

    public AttachEaisEiResponse attachEaisEiWithOptions(AttachEaisEiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInstanceId)) {
            query.put("ClientInstanceId", request.clientInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eiInstanceId)) {
            query.put("EiInstanceId", request.eiInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eiInstanceType)) {
            query.put("EiInstanceType", request.eiInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachEaisEi"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachEaisEiResponse());
    }

    public AttachEaisEiResponse attachEaisEi(AttachEaisEiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachEaisEiWithOptions(request, runtime);
    }

    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    public CreateEaiResponse createEaiWithOptions(CreateEaiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEai"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEaiResponse());
    }

    public CreateEaiResponse createEai(CreateEaiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEaiWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request CreateEaiAllRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateEaiAllResponse
     */
    // Deprecated
    public CreateEaiAllResponse createEaiAllWithOptions(CreateEaiAllRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientImageId)) {
            query.put("ClientImageId", request.clientImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInstanceName)) {
            query.put("ClientInstanceName", request.clientInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInstanceType)) {
            query.put("ClientInstanceType", request.clientInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInternetMaxBandwidthIn)) {
            query.put("ClientInternetMaxBandwidthIn", request.clientInternetMaxBandwidthIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInternetMaxBandwidthOut)) {
            query.put("ClientInternetMaxBandwidthOut", request.clientInternetMaxBandwidthOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPassword)) {
            query.put("ClientPassword", request.clientPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSecurityGroupId)) {
            query.put("ClientSecurityGroupId", request.clientSecurityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSystemDiskCategory)) {
            query.put("ClientSystemDiskCategory", request.clientSystemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSystemDiskSize)) {
            query.put("ClientSystemDiskSize", request.clientSystemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVSwitchId)) {
            query.put("ClientVSwitchId", request.clientVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientZoneId)) {
            query.put("ClientZoneId", request.clientZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eaiInstanceType)) {
            query.put("EaiInstanceType", request.eaiInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEaiAll"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEaiAllResponse());
    }

    /**
      * @deprecated
      *
      * @param request CreateEaiAllRequest
      * @return CreateEaiAllResponse
     */
    // Deprecated
    public CreateEaiAllResponse createEaiAll(CreateEaiAllRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEaiAllWithOptions(request, runtime);
    }

    public CreateEaiEciResponse createEaiEciWithOptions(CreateEaiEciRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEaiEciShrinkRequest request = new CreateEaiEciShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eci)) {
            request.eciShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eci, "Eci", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eaisName)) {
            query.put("EaisName", request.eaisName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eaisType)) {
            query.put("EaisType", request.eaisType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eciShrink)) {
            query.put("Eci", request.eciShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEaiEci"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEaiEciResponse());
    }

    public CreateEaiEciResponse createEaiEci(CreateEaiEciRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEaiEciWithOptions(request, runtime);
    }

    public CreateEaiEcsResponse createEaiEcsWithOptions(CreateEaiEcsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEaiEcsShrinkRequest request = new CreateEaiEcsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecs)) {
            request.ecsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecs, "Ecs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eaisName)) {
            query.put("EaisName", request.eaisName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eaisType)) {
            query.put("EaisType", request.eaisType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsShrink)) {
            query.put("Ecs", request.ecsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEaiEcs"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEaiEcsResponse());
    }

    public CreateEaiEcsResponse createEaiEcs(CreateEaiEcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEaiEcsWithOptions(request, runtime);
    }

    public CreateEaiJupyterResponse createEaiJupyterWithOptions(CreateEaiJupyterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEaiJupyterShrinkRequest request = new CreateEaiJupyterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.environmentVar)) {
            request.environmentVarShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.environmentVar, "EnvironmentVar", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eaisName)) {
            query.put("EaisName", request.eaisName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eaisType)) {
            query.put("EaisType", request.eaisType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentVarShrink)) {
            query.put("EnvironmentVar", request.environmentVarShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEaiJupyter"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEaiJupyterResponse());
    }

    public CreateEaiJupyterResponse createEaiJupyter(CreateEaiJupyterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEaiJupyterWithOptions(request, runtime);
    }

    public CreateEaisEiResponse createEaisEiWithOptions(CreateEaisEiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEaisEi"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEaisEiResponse());
    }

    public CreateEaisEiResponse createEaisEi(CreateEaisEiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEaisEiWithOptions(request, runtime);
    }

    public DeleteEaiResponse deleteEaiWithOptions(DeleteEaiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticAcceleratedInstanceId)) {
            query.put("ElasticAcceleratedInstanceId", request.elasticAcceleratedInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEai"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEaiResponse());
    }

    public DeleteEaiResponse deleteEai(DeleteEaiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEaiWithOptions(request, runtime);
    }

    public DeleteEaiAllResponse deleteEaiAllWithOptions(DeleteEaiAllRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInstanceId)) {
            query.put("ClientInstanceId", request.clientInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticAcceleratedInstanceId)) {
            query.put("ElasticAcceleratedInstanceId", request.elasticAcceleratedInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEaiAll"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEaiAllResponse());
    }

    public DeleteEaiAllResponse deleteEaiAll(DeleteEaiAllRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEaiAllWithOptions(request, runtime);
    }

    public DeleteEaisEiResponse deleteEaisEiWithOptions(DeleteEaisEiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eiInstanceId)) {
            query.put("EiInstanceId", request.eiInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEaisEi"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEaisEiResponse());
    }

    public DeleteEaisEiResponse deleteEaisEi(DeleteEaisEiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEaisEiWithOptions(request, runtime);
    }

    public DescribeEaisResponse describeEaisWithOptions(DescribeEaisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticAcceleratedInstanceIds)) {
            query.put("ElasticAcceleratedInstanceIds", request.elasticAcceleratedInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEais"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEaisResponse());
    }

    public DescribeEaisResponse describeEais(DescribeEaisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEaisWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-06-24"),
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

    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    public DetachEaiResponse detachEaiWithOptions(DetachEaiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticAcceleratedInstanceId)) {
            query.put("ElasticAcceleratedInstanceId", request.elasticAcceleratedInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachEai"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachEaiResponse());
    }

    public DetachEaiResponse detachEai(DetachEaiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachEaiWithOptions(request, runtime);
    }

    public DetachEaisEiResponse detachEaisEiWithOptions(DetachEaisEiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eiInstanceId)) {
            query.put("EiInstanceId", request.eiInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachEaisEi"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachEaisEiResponse());
    }

    public DetachEaisEiResponse detachEaisEi(DetachEaisEiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachEaisEiWithOptions(request, runtime);
    }

    public GetInstanceMetricsResponse getInstanceMetricsWithOptions(GetInstanceMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStep)) {
            query.put("TimeStep", request.timeStep);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceMetrics"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceMetricsResponse());
    }

    public GetInstanceMetricsResponse getInstanceMetrics(GetInstanceMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceMetricsWithOptions(request, runtime);
    }

    public StartEaisEiResponse startEaisEiWithOptions(StartEaisEiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eiInstanceId)) {
            query.put("EiInstanceId", request.eiInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartEaisEi"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartEaisEiResponse());
    }

    public StartEaisEiResponse startEaisEi(StartEaisEiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startEaisEiWithOptions(request, runtime);
    }

    public StopEaisEiResponse stopEaisEiWithOptions(StopEaisEiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eiInstanceId)) {
            query.put("EiInstanceId", request.eiInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopEaisEi"),
            new TeaPair("version", "2019-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopEaisEiResponse());
    }

    public StopEaisEiResponse stopEaisEi(StopEaisEiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopEaisEiWithOptions(request, runtime);
    }
}
