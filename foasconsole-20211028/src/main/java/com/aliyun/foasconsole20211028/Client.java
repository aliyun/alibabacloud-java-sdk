// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028;

import com.aliyun.tea.*;
import com.aliyun.foasconsole20211028.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "foasconsole.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "foasconsole.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-beijing", "foasconsole.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-shanghai", "foasconsole.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "foasconsole.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "foasconsole.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "foasconsole.cn-shenzhen.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "foasconsole.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "foasconsole.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "foasconsole.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "foasconsole.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "foasconsole.cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-east-1", "foasconsole.us-east-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "foasconsole.eu-west-1.aliyuncs.com"),
            new TeaPair("us-west-1", "foasconsole.us-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "foasconsole.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "foasconsole.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "foasconsole.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "foasconsole.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("foasconsole", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p><em>Before using this API, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/hybrid-pricing">pricing</a> of hybrid billing for Realtime Compute for Apache Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a subscription instance to a hybrid billing instance.</p>
     * 
     * @param tmpReq ConvertHybridInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConvertHybridInstanceResponse
     */
    public ConvertHybridInstanceResponse convertHybridInstanceWithOptions(ConvertHybridInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ConvertHybridInstanceShrinkRequest request = new ConvertHybridInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSpec)) {
            request.resourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSpec, "ResourceSpec", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecShrink)) {
            query.put("ResourceSpec", request.resourceSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertHybridInstance"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertHybridInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this API, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/hybrid-pricing">pricing</a> of hybrid billing for Realtime Compute for Apache Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a subscription instance to a hybrid billing instance.</p>
     * 
     * @param request ConvertHybridInstanceRequest
     * @return ConvertHybridInstanceResponse
     */
    public ConvertHybridInstanceResponse convertHybridInstance(ConvertHybridInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertHybridInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/switch-from-pay-as-you-go-to-subscription">pricing</a> of fully managed Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a pay-as-you-go workspace to a subscription workspace.</p>
     * 
     * @param tmpReq ConvertInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConvertInstanceResponse
     */
    public ConvertInstanceResponse convertInstanceWithOptions(ConvertInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ConvertInstanceShrinkRequest request = new ConvertInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.namespaceResourceSpecs)) {
            request.namespaceResourceSpecsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.namespaceResourceSpecs, "NamespaceResourceSpecs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAutoRenew)) {
            body.put("IsAutoRenew", request.isAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceResourceSpecsShrink)) {
            body.put("NamespaceResourceSpecs", request.namespaceResourceSpecsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionCode)) {
            body.put("PromotionCode", request.promotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotionCode)) {
            body.put("UsePromotionCode", request.usePromotionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertInstance"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/switch-from-pay-as-you-go-to-subscription">pricing</a> of fully managed Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a pay-as-you-go workspace to a subscription workspace.</p>
     * 
     * @param request ConvertInstanceRequest
     * @return ConvertInstanceResponse
     */
    public ConvertInstanceResponse convertInstance(ConvertInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this operation, make sure that you fully understand the <a href="https://www.alibabacloud.com/help/en/flink/product-overview/switch-from-subscription-to-pay-as-you-go">billing methods and pricing</a> of Alibaba Cloud Realtime Compute for Apache Flink.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a subscription instance to pay-as-you-go.</p>
     * 
     * @param request ConvertPrepayInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConvertPrepayInstanceResponse
     */
    public ConvertPrepayInstanceResponse convertPrepayInstanceWithOptions(ConvertPrepayInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertPrepayInstance"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertPrepayInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before using this operation, make sure that you fully understand the <a href="https://www.alibabacloud.com/help/en/flink/product-overview/switch-from-subscription-to-pay-as-you-go">billing methods and pricing</a> of Alibaba Cloud Realtime Compute for Apache Flink.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a subscription instance to pay-as-you-go.</p>
     * 
     * @param request ConvertPrepayInstanceRequest
     * @return ConvertPrepayInstanceResponse
     */
    public ConvertPrepayInstanceResponse convertPrepayInstance(ConvertPrepayInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertPrepayInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/billing-overview">pricing</a> of fully managed Flink before you call this operation.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a subscription or pay-as-you-go fully managed Flink workspace.</p>
     * 
     * @param tmpReq CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateInstanceShrinkRequest request = new CreateInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haResourceSpec)) {
            request.haResourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haResourceSpec, "HaResourceSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haVSwitchIds)) {
            request.haVSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haVSwitchIds, "HaVSwitchIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSpec)) {
            request.resourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSpec, "ResourceSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storage)) {
            request.storageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storage, "Storage", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vSwitchIds)) {
            request.vSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vSwitchIds, "VSwitchIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architectureType)) {
            body.put("ArchitectureType", request.architectureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ha)) {
            body.put("Ha", request.ha);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haResourceSpecShrink)) {
            body.put("HaResourceSpec", request.haResourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haVSwitchIdsShrink)) {
            body.put("HaVSwitchIds", request.haVSwitchIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorType)) {
            body.put("MonitorType", request.monitorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionCode)) {
            body.put("PromotionCode", request.promotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecShrink)) {
            body.put("ResourceSpec", request.resourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageShrink)) {
            body.put("Storage", request.storageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            body.put("Tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotionCode)) {
            body.put("UsePromotionCode", request.usePromotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdsShrink)) {
            body.put("VSwitchIds", request.vSwitchIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/billing-overview">pricing</a> of fully managed Flink before you call this operation.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a subscription or pay-as-you-go fully managed Flink workspace.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workspace in a fully managed Flink instance.</p>
     * 
     * @param tmpReq CreateNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateNamespaceShrinkRequest request = new CreateNamespaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSpec)) {
            request.resourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSpec, "ResourceSpec", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ha)) {
            body.put("Ha", request.ha);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecShrink)) {
            body.put("ResourceSpec", request.resourceSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNamespace"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workspace in a fully managed Flink instance.</p>
     * 
     * @param request CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/refund-policy">pricing</a> of Realtime Compute for Apache Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go Realtime Compute for Apache Flink workspace.</p>
     * 
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/refund-policy">pricing</a> of Realtime Compute for Apache Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go Realtime Compute for Apache Flink workspace.</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a project workspace.</p>
     * 
     * @param request DeleteNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNamespace"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a project workspace.</p>
     * 
     * @param request DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more fully managed Flink workspaces.</p>
     * 
     * @param tmpReq DescribeInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeInstancesShrinkRequest request = new DescribeInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more fully managed Flink workspaces.</p>
     * 
     * @param request DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the namespace information of a specified instance.</p>
     * 
     * @param tmpReq DescribeNamespacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNamespacesResponse
     */
    public DescribeNamespacesResponse describeNamespacesWithOptions(DescribeNamespacesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeNamespacesShrinkRequest request = new DescribeNamespacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNamespaces"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNamespacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the namespace information of a specified instance.</p>
     * 
     * @param request DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     */
    public DescribeNamespacesResponse describeNamespaces(DescribeNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNamespacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about regions that support purchases of fully managed Flink.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSupportedRegionsResponse
     */
    public DescribeSupportedRegionsResponse describeSupportedRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupportedRegions"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupportedRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about regions that support purchases of fully managed Flink.</p>
     * @return DescribeSupportedRegionsResponse
     */
    public DescribeSupportedRegionsResponse describeSupportedRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupportedRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about zones that are available for purchase.</p>
     * 
     * @param request DescribeSupportedZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSupportedZonesResponse
     */
    public DescribeSupportedZonesResponse describeSupportedZonesWithOptions(DescribeSupportedZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupportedZones"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupportedZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about zones that are available for purchase.</p>
     * 
     * @param request DescribeSupportedZonesRequest
     * @return DescribeSupportedZonesResponse
     */
    public DescribeSupportedZonesResponse describeSupportedZones(DescribeSupportedZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupportedZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resource tags. You can query tag keys by tag values, query tag values by tag keys, or retrieve all tag information used in your Flink fully managed workspace.</p>
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
            new TeaPair("version", "2021-10-28"),
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
     * <p>Queries resource tags. You can query tag keys by tag values, query tag values by tag keys, or retrieve all tag information used in your Flink fully managed workspace.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Make sure that you are familiar with the <a href="https://www.alibabacloud.com/help/en/flink/user-guide/reconfigure-resources#task-2507532">billing methods</a> and pricing of Realtime Compute for Apache Flink before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maximum pay-as-you-go resource limit for a hybrid billing instance.</p>
     * 
     * @param tmpReq ModifyElasticResourceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyElasticResourceSpecResponse
     */
    public ModifyElasticResourceSpecResponse modifyElasticResourceSpecWithOptions(ModifyElasticResourceSpecRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyElasticResourceSpecShrinkRequest request = new ModifyElasticResourceSpecShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSpec)) {
            request.resourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSpec, "ResourceSpec", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecShrink)) {
            body.put("ResourceSpec", request.resourceSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyElasticResourceSpec"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyElasticResourceSpecResponse());
    }

    /**
     * <b>description</b> :
     * <p>Make sure that you are familiar with the <a href="https://www.alibabacloud.com/help/en/flink/user-guide/reconfigure-resources#task-2507532">billing methods</a> and pricing of Realtime Compute for Apache Flink before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maximum pay-as-you-go resource limit for a hybrid billing instance.</p>
     * 
     * @param request ModifyElasticResourceSpecRequest
     * @return ModifyElasticResourceSpecResponse
     */
    public ModifyElasticResourceSpecResponse modifyElasticResourceSpec(ModifyElasticResourceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyElasticResourceSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Make sure that you are familiar with the <a href="https://www.alibabacloud.com/help/en/flink/user-guide/reconfigure-resources#task-2507532">billing methods</a> and pricing of Realtime Compute for Apache Flink before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Scales up or scales down the resources of a workspace.</p>
     * 
     * @param tmpReq ModifyInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceSpecResponse
     */
    public ModifyInstanceSpecResponse modifyInstanceSpecWithOptions(ModifyInstanceSpecRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyInstanceSpecShrinkRequest request = new ModifyInstanceSpecShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haResourceSpec)) {
            request.haResourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haResourceSpec, "HaResourceSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haVSwitchIds)) {
            request.haVSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haVSwitchIds, "HaVSwitchIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSpec)) {
            request.resourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSpec, "ResourceSpec", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ha)) {
            body.put("Ha", request.ha);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haResourceSpecShrink)) {
            body.put("HaResourceSpec", request.haResourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haVSwitchIdsShrink)) {
            body.put("HaVSwitchIds", request.haVSwitchIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionCode)) {
            body.put("PromotionCode", request.promotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecShrink)) {
            body.put("ResourceSpec", request.resourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotionCode)) {
            body.put("UsePromotionCode", request.usePromotionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceSpec"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceSpecResponse());
    }

    /**
     * <b>description</b> :
     * <p>Make sure that you are familiar with the <a href="https://www.alibabacloud.com/help/en/flink/user-guide/reconfigure-resources#task-2507532">billing methods</a> and pricing of Realtime Compute for Apache Flink before you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Scales up or scales down the resources of a workspace.</p>
     * 
     * @param request ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    public ModifyInstanceSpecResponse modifyInstanceSpec(ModifyInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this operation, make sure that you fully understand the restrictions on <a href="https://www.alibabacloud.com/help/en/flink/user-guide/modify-a-vswitch">modifying vSwitches</a> in Realtime Compute for Apache Flink.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the vSwitches available to a Flink workspace.</p>
     * 
     * @deprecated OpenAPI ModifyInstanceVswitch is deprecated
     * 
     * @param tmpReq ModifyInstanceVswitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceVswitchResponse
     */
    @Deprecated
    // Deprecated
    public ModifyInstanceVswitchResponse modifyInstanceVswitchWithOptions(ModifyInstanceVswitchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyInstanceVswitchShrinkRequest request = new ModifyInstanceVswitchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haVSwitchIds)) {
            request.haVSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haVSwitchIds, "HaVSwitchIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vSwitchIds)) {
            request.vSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vSwitchIds, "VSwitchIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.haVSwitchIdsShrink)) {
            body.put("HaVSwitchIds", request.haVSwitchIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdsShrink)) {
            body.put("VSwitchIds", request.vSwitchIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceVswitch"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceVswitchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before using this operation, make sure that you fully understand the restrictions on <a href="https://www.alibabacloud.com/help/en/flink/user-guide/modify-a-vswitch">modifying vSwitches</a> in Realtime Compute for Apache Flink.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the vSwitches available to a Flink workspace.</p>
     * 
     * @deprecated OpenAPI ModifyInstanceVswitch is deprecated
     * 
     * @param request ModifyInstanceVswitchRequest
     * @return ModifyInstanceVswitchResponse
     */
    @Deprecated
    // Deprecated
    public ModifyInstanceVswitchResponse modifyInstanceVswitch(ModifyInstanceVswitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceVswitchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>When calling this operation, note the following: - The order status must be normal, that is, OrderType=NORMAL. - When decreasing the quota, the specified resource specification quantity cannot be less than the quantity already in use. For details about the project resource specifications before and after the change, call <a href="https://help.aliyun.com/document_detail/323441.html">DescribeNamespaces</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource configurations of a project namespace in a pay-as-you-go, subscription, or hybrid billing workspace.</p>
     * 
     * @param tmpReq ModifyNamespaceSpecV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNamespaceSpecV2Response
     */
    public ModifyNamespaceSpecV2Response modifyNamespaceSpecV2WithOptions(ModifyNamespaceSpecV2Request tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyNamespaceSpecV2ShrinkRequest request = new ModifyNamespaceSpecV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.elasticResourceSpec)) {
            request.elasticResourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.elasticResourceSpec, "ElasticResourceSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.guaranteedResourceSpec)) {
            request.guaranteedResourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.guaranteedResourceSpec, "GuaranteedResourceSpec", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ha)) {
            query.put("Ha", request.ha);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticResourceSpecShrink)) {
            body.put("ElasticResourceSpec", request.elasticResourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guaranteedResourceSpecShrink)) {
            body.put("GuaranteedResourceSpec", request.guaranteedResourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNamespaceSpecV2"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNamespaceSpecV2Response());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>When calling this operation, note the following: - The order status must be normal, that is, OrderType=NORMAL. - When decreasing the quota, the specified resource specification quantity cannot be less than the quantity already in use. For details about the project resource specifications before and after the change, call <a href="https://help.aliyun.com/document_detail/323441.html">DescribeNamespaces</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource configurations of a project namespace in a pay-as-you-go, subscription, or hybrid billing workspace.</p>
     * 
     * @param request ModifyNamespaceSpecV2Request
     * @return ModifyNamespaceSpecV2Response
     */
    public ModifyNamespaceSpecV2Response modifyNamespaceSpecV2(ModifyNamespaceSpecV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNamespaceSpecV2WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/subscription">pricing</a> of Realtime Compute for Apache Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the compute resource specifications of a subscription Realtime Compute for Apache Flink instance. If the new specifications are smaller than the current specifications, a scale-in operation is performed. If the new specifications are larger than the current specifications, a scale-out operation is performed.</p>
     * 
     * @deprecated OpenAPI ModifyPrepayInstanceSpec is deprecated, please use foasconsole::2021-10-28::ModifyInstanceSpec instead.
     * 
     * @param tmpReq ModifyPrepayInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPrepayInstanceSpecResponse
     */
    @Deprecated
    // Deprecated
    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpecWithOptions(ModifyPrepayInstanceSpecRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPrepayInstanceSpecShrinkRequest request = new ModifyPrepayInstanceSpecShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haResourceSpec)) {
            request.haResourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haResourceSpec, "HaResourceSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haVSwitchIds)) {
            request.haVSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haVSwitchIds, "HaVSwitchIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSpec)) {
            request.resourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSpec, "ResourceSpec", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ha)) {
            body.put("Ha", request.ha);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haResourceSpecShrink)) {
            body.put("HaResourceSpec", request.haResourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haVSwitchIdsShrink)) {
            body.put("HaVSwitchIds", request.haVSwitchIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haZoneId)) {
            body.put("HaZoneId", request.haZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecShrink)) {
            body.put("ResourceSpec", request.resourceSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPrepayInstanceSpec"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPrepayInstanceSpecResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/subscription">pricing</a> of Realtime Compute for Apache Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the compute resource specifications of a subscription Realtime Compute for Apache Flink instance. If the new specifications are smaller than the current specifications, a scale-in operation is performed. If the new specifications are larger than the current specifications, a scale-out operation is performed.</p>
     * 
     * @deprecated OpenAPI ModifyPrepayInstanceSpec is deprecated, please use foasconsole::2021-10-28::ModifyInstanceSpec instead.
     * 
     * @param request ModifyPrepayInstanceSpecRequest
     * @return ModifyPrepayInstanceSpecResponse
     */
    @Deprecated
    // Deprecated
    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPrepayInstanceSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the specifications of a namespace in a subscription instance.</p>
     * 
     * @deprecated OpenAPI ModifyPrepayNamespaceSpec is deprecated, please use foasconsole::2021-10-28::ModifyNamespaceSpec instead.
     * 
     * @param tmpReq ModifyPrepayNamespaceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPrepayNamespaceSpecResponse
     */
    @Deprecated
    // Deprecated
    public ModifyPrepayNamespaceSpecResponse modifyPrepayNamespaceSpecWithOptions(ModifyPrepayNamespaceSpecRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPrepayNamespaceSpecShrinkRequest request = new ModifyPrepayNamespaceSpecShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSpec)) {
            request.resourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSpec, "ResourceSpec", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecShrink)) {
            body.put("ResourceSpec", request.resourceSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPrepayNamespaceSpec"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPrepayNamespaceSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the specifications of a namespace in a subscription instance.</p>
     * 
     * @deprecated OpenAPI ModifyPrepayNamespaceSpec is deprecated, please use foasconsole::2021-10-28::ModifyNamespaceSpec instead.
     * 
     * @param request ModifyPrepayNamespaceSpecRequest
     * @return ModifyPrepayNamespaceSpecResponse
     */
    @Deprecated
    // Deprecated
    public ModifyPrepayNamespaceSpecResponse modifyPrepayNamespaceSpec(ModifyPrepayNamespaceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPrepayNamespaceSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price for converting a pay-as-you-go instance to a subscription instance.</p>
     * 
     * @param tmpReq QueryConvertInstancePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConvertInstancePriceResponse
     */
    public QueryConvertInstancePriceResponse queryConvertInstancePriceWithOptions(QueryConvertInstancePriceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryConvertInstancePriceShrinkRequest request = new QueryConvertInstancePriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.namespaceResourceSpecs)) {
            request.namespaceResourceSpecsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.namespaceResourceSpecs, "NamespaceResourceSpecs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAutoRenew)) {
            body.put("IsAutoRenew", request.isAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceResourceSpecsShrink)) {
            body.put("NamespaceResourceSpecs", request.namespaceResourceSpecsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionCode)) {
            body.put("PromotionCode", request.promotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotionCode)) {
            body.put("UsePromotionCode", request.usePromotionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConvertInstancePrice"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConvertInstancePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price for converting a pay-as-you-go instance to a subscription instance.</p>
     * 
     * @param request QueryConvertInstancePriceRequest
     * @return QueryConvertInstancePriceResponse
     */
    public QueryConvertInstancePriceResponse queryConvertInstancePrice(QueryConvertInstancePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConvertInstancePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the estimated refund amount after converting your Flink instance from subscription to pay-as-you-go. After the conversion, your usage is metered hourly and bills are generated accordingly.</p>
     * 
     * @param request QueryConvertPrepayInstancePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConvertPrepayInstancePriceResponse
     */
    public QueryConvertPrepayInstancePriceResponse queryConvertPrepayInstancePriceWithOptions(QueryConvertPrepayInstancePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConvertPrepayInstancePrice"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConvertPrepayInstancePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the estimated refund amount after converting your Flink instance from subscription to pay-as-you-go. After the conversion, your usage is metered hourly and bills are generated accordingly.</p>
     * 
     * @param request QueryConvertPrepayInstancePriceRequest
     * @return QueryConvertPrepayInstancePriceResponse
     */
    public QueryConvertPrepayInstancePriceResponse queryConvertPrepayInstancePrice(QueryConvertPrepayInstancePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConvertPrepayInstancePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the price of a workspace for the current account.</p>
     * 
     * @param tmpReq QueryCreateInstancePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCreateInstancePriceResponse
     */
    public QueryCreateInstancePriceResponse queryCreateInstancePriceWithOptions(QueryCreateInstancePriceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCreateInstancePriceShrinkRequest request = new QueryCreateInstancePriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haResourceSpec)) {
            request.haResourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haResourceSpec, "HaResourceSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSpec)) {
            request.resourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSpec, "ResourceSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storage)) {
            request.storageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storage, "Storage", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vSwitchIds)) {
            request.vSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vSwitchIds, "VSwitchIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architectureType)) {
            body.put("ArchitectureType", request.architectureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ha)) {
            body.put("Ha", request.ha);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haResourceSpecShrink)) {
            body.put("HaResourceSpec", request.haResourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionCode)) {
            body.put("PromotionCode", request.promotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecShrink)) {
            body.put("ResourceSpec", request.resourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageShrink)) {
            body.put("Storage", request.storageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotionCode)) {
            body.put("UsePromotionCode", request.usePromotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdsShrink)) {
            body.put("VSwitchIds", request.vSwitchIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCreateInstancePrice"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCreateInstancePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the price of a workspace for the current account.</p>
     * 
     * @param request QueryCreateInstancePriceRequest
     * @return QueryCreateInstancePriceResponse
     */
    public QueryCreateInstancePriceResponse queryCreateInstancePrice(QueryCreateInstancePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCreateInstancePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price for upgrading or downgrading an instance.</p>
     * 
     * @param tmpReq QueryModifyInstancePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryModifyInstancePriceResponse
     */
    public QueryModifyInstancePriceResponse queryModifyInstancePriceWithOptions(QueryModifyInstancePriceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryModifyInstancePriceShrinkRequest request = new QueryModifyInstancePriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haResourceSpec)) {
            request.haResourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haResourceSpec, "HaResourceSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.haVSwitchIds)) {
            request.haVSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.haVSwitchIds, "HaVSwitchIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSpec)) {
            request.resourceSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSpec, "ResourceSpec", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ha)) {
            body.put("Ha", request.ha);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haResourceSpecShrink)) {
            body.put("HaResourceSpec", request.haResourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haVSwitchIdsShrink)) {
            body.put("HaVSwitchIds", request.haVSwitchIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionCode)) {
            body.put("PromotionCode", request.promotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecShrink)) {
            body.put("ResourceSpec", request.resourceSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotionCode)) {
            body.put("UsePromotionCode", request.usePromotionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryModifyInstancePrice"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryModifyInstancePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price for upgrading or downgrading an instance.</p>
     * 
     * @param request QueryModifyInstancePriceRequest
     * @return QueryModifyInstancePriceResponse
     */
    public QueryModifyInstancePriceResponse queryModifyInstancePrice(QueryModifyInstancePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryModifyInstancePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the renewal price of a subscription workspace.</p>
     * 
     * @param request QueryRenewInstancePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRenewInstancePriceResponse
     */
    public QueryRenewInstancePriceResponse queryRenewInstancePriceWithOptions(QueryRenewInstancePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionCode)) {
            body.put("PromotionCode", request.promotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotionCode)) {
            body.put("UsePromotionCode", request.usePromotionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRenewInstancePrice"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRenewInstancePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the renewal price of a subscription workspace.</p>
     * 
     * @param request QueryRenewInstancePriceRequest
     * @return QueryRenewInstancePriceResponse
     */
    public QueryRenewInstancePriceResponse queryRenewInstancePrice(QueryRenewInstancePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRenewInstancePriceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/renewal-policy">pricing</a> of Realtime Compute for Apache Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Renews a subscription Realtime Compute for Apache Flink workspace.</p>
     * 
     * @param request RenewInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionCode)) {
            body.put("PromotionCode", request.promotionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotionCode)) {
            body.put("UsePromotionCode", request.usePromotionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2021-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/renewal-policy">pricing</a> of Realtime Compute for Apache Flink.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Renews a subscription Realtime Compute for Apache Flink workspace.</p>
     * 
     * @param request RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call this API to add tags to resources.</p>
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
            new TeaPair("version", "2021-10-28"),
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
     * <p>Call this API to add tags to resources.</p>
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
     * <p>Deletes resource tags.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2021-10-28"),
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

    /**
     * <b>summary</b> : 
     * <p>Deletes resource tags.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
