// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222;

import com.aliyun.tea.*;
import com.aliyun.ess20220222.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ess.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ess.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ess.aliyuncs.com"),
            new TeaPair("us-east-1", "ess.aliyuncs.com"),
            new TeaPair("us-west-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ess.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ess.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ess.aliyuncs.com"),
            new TeaPair("cn-fujian", "ess.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ess.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ess.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ess.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ess.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ess.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ess.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ess.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ess.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ess", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary Manages scaling configurations of the Elastic Container Instance type. If you want to efficiently create or update a scaling configuration of the Elastic Container Instance type by using a configuration file, you can call the ApplyEciScalingConfiguration operation.
     *
     * @description You can manage scaling configurations of the Elastic Container Instance type by using a YAML configuration file based on the following logic:
     * If you specify the ID of a scaling configuration, you can update the scaling configuration by using the YAML configuration file. If you do not specify the ID of a scaling configuration, you can create a scaling configuration by using the YAML configuration file.
     *
     * @param request ApplyEciScalingConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyEciScalingConfigurationResponse
     */
    public ApplyEciScalingConfigurationResponse applyEciScalingConfigurationWithOptions(ApplyEciScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            query.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyEciScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyEciScalingConfigurationResponse());
    }

    /**
     * @summary Manages scaling configurations of the Elastic Container Instance type. If you want to efficiently create or update a scaling configuration of the Elastic Container Instance type by using a configuration file, you can call the ApplyEciScalingConfiguration operation.
     *
     * @description You can manage scaling configurations of the Elastic Container Instance type by using a YAML configuration file based on the following logic:
     * If you specify the ID of a scaling configuration, you can update the scaling configuration by using the YAML configuration file. If you do not specify the ID of a scaling configuration, you can create a scaling configuration by using the YAML configuration file.
     *
     * @param request ApplyEciScalingConfigurationRequest
     * @return ApplyEciScalingConfigurationResponse
     */
    public ApplyEciScalingConfigurationResponse applyEciScalingConfiguration(ApplyEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyEciScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary 基于yaml配置进行弹性伸缩管理
     *
     * @description You can call the ApplyScalingGroup operation to create scaling groups of the Elastic Container Instance type with ease. The resources of the scaling groups are defined in Kubernetes Deployment YAML files. You can also call this operation to extend annotations for elastic container instances in Kubernetes Deployment YAML files. For more information, see "Supported annotations" in this topic.
     * Mapping between YAML files and scaling groups: You can map the triplet of namespace, kind, and name in a YAML file to a scaling group name. A YAML file and a scaling group have a one-to-one mapping relationship in a region. For example, if you use the Kubernetes Deployment YAML file whose name is NGINX in the default namespace to create a scaling group in a region, the unique name of the mapped scaling group is k8s_default_Deployment_nginx.
     * You can use a Kubernetes Deployment YAML file to manage a scaling group based on the following logic:
     * * If an existing scaling group has a mapping relationship with your Kubernetes Deployment YAML file, you can update the scaling group by using the YAML file.
     * * If no scaling group that has a mapping relationship with your Kubernetes Deployment YAML file exists, you can create a scaling group with ease by using the YAML file.
     * ### Precautions
     * 1. If you do not specify a virtual private cloud (VPC), vSwitch, security group, or annotation in your Kubernetes Deployment YAML file, the system creates a default VPC that has default vSwitches and uses the default security group ess-default-sg of Auto Scaling. By default, the security group rule allows traffic on Transmission Control Protocol (TCP)-based port 22 and port 3389 and enables Internet Control Message Protocol (ICMP) for IPv4 addresses. If you want to enable other ports or protocols, you can create custom security group rules.
     * 2. If you want to use a public image, you must enable the Internet access feature and configure the k8s.aliyun.com/eci-with-eip pod annotation to enable the elastic IP address (EIP) feature.
     * 3. After you call the ApplyScalingGroup operation to apply a Kubernetes Deployment YAML file, the scaling group immediately enters the Enabled state and the scaling configuration immediately enters the Active state. If the number of replicas that you specified in the YAML file is grater than 0, elastic container instances are automatically created.
     * ### Supported annotations
     * For more information about annotations, see [ECI Pod Annotation](https://help.aliyun.com/document_detail/186939.html).
     * |Annotation|Example|Description|
     * |---|---|---|
     * |k8s.aliyun.com/ess-scaling-group-min-size|1|The minimum size of the scaling group that you want to create. Default value: 0.|
     * |k8s.aliyun.com/ess-scaling-group-max-size|20|The maximum size of the scaling group that you want to create. Default value: maximum number of replicas or 30, whichever is greater.|
     * |k8s.aliyun.com/eci-ntp-server|100.100.*.*|The IP address of the Network Time Protocol (NTP) server.|
     * |k8s.aliyun.com/eci-use-specs|2-4Gi|The specifications of 2 vCPUs and 4 GB memory. For more information, see [Create pods by specifying multiple specifications](https://help.aliyun.com/document_detail/451267.html).|
     * |k8s.aliyun.com/eci-vswitch|vsw-bp1xpiowfm5vo8o3c\\*\\*\\*\\*|The ID of the vSwitch. You can specify multiple vSwitches to specify multiple zones.|
     * |k8s.aliyun.com/eci-security-group|sg-bp1dktddjsg5nktv\\*\\*\\*\\*|The ID of the security group. Before you configure this annotation, take note of the following requirements:<ul data-sourcepos="26:74-26:168"><li data-sourcepos="26:78-26:114">You can specify one or more security groups. You can specify up to five security groups for each scaling group.</li><li data-sourcepos="26:114-26:140">If you specify multiple security groups, the security groups must belong to the same VPC.</li><li data-sourcepos="26:140-26:163">If you specify multiple security groups, the security groups must be of the same type.</li></ul>|
     * |k8s.aliyun.com/eci-sls-enable|"false"|If you set the value to false, the log collection feature is disabled.
     * If you do not want to use Custom Resource Definition (CRD) for Simple Log Service to collect logs of specific pods, you can configure this annotation for the pods and set the value to false. This prevents resource wastes caused by Logtails created by the system.|
     * |k8s.aliyun.com/eci-spot-strategy|SpotAsPriceGo|The bidding policy for the preemptible instance. Valid values:<ul data-sourcepos="28:69-28:204"><li data-sourcepos="28:73-28:158">SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price If you set the value to SpotWithPriceLimit, you must configure the k8s.aliyun.com/eci-spot-price-limit annotation.</li><li data-sourcepos="28:158-28:199">SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</li></ul>|
     * |k8s.aliyun.com/eci-spot-price-limit|"0.5"|The maximum hourly price of the preemptible instance. This value can be accurate to up to three decimal places.
     * This annotation takes effect only when you set the k8s.aliyun.com/eci-spot-strategy annotation to SpotWithPriceLimit.|
     * |k8s.aliyun.com/eci-with-eip|"true"|If you set the value to true, an EIP is automatically created and bound to each elastic container instance.|
     * |k8s.aliyun.com/eci-data-cache-bucket|default|The bucket of the specified DataCache. If you want to use a DataCache to create a pod, you must configure this annotation.|
     * |k8s.aliyun.com/eci-data-cache-pl|PL1|The performance level (PL) of the cloud disk that you want to create by using the specified DataCache.
     * By default, enhanced SSDs (ESSDs) are created. Default value: PL1.|
     * |k8s.aliyun.com/eci-data-cache-provisionedIops|"40000"|The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}. For more information, see [ESSD AutoPL](https://help.aliyun.com/document_detail/368372.html).
     * If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.|
     * |k8s.aliyun.com/eci-data-cache-burstingEnabled|"true"|Specifies whether the Burst feature is enabled for the ESSD AutoPL disk. For more information, see [ESSD AutoPL](https://help.aliyun.com/document_detail/368372.html).
     * If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.|
     * |k8s.aliyun.com/eci-custom-tags|"env:test,name:alice"|The tags that you want to add to each elastic container instance. You can add up to three tags for each elastic container instance. Separate a tag key and a tag value with a colon (:). Separate multiple tags with commas (,).|
     *
     * @param request ApplyScalingGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyScalingGroupResponse
     */
    public ApplyScalingGroupResponse applyScalingGroupWithOptions(ApplyScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            query.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyScalingGroupResponse());
    }

    /**
     * @summary 基于yaml配置进行弹性伸缩管理
     *
     * @description You can call the ApplyScalingGroup operation to create scaling groups of the Elastic Container Instance type with ease. The resources of the scaling groups are defined in Kubernetes Deployment YAML files. You can also call this operation to extend annotations for elastic container instances in Kubernetes Deployment YAML files. For more information, see "Supported annotations" in this topic.
     * Mapping between YAML files and scaling groups: You can map the triplet of namespace, kind, and name in a YAML file to a scaling group name. A YAML file and a scaling group have a one-to-one mapping relationship in a region. For example, if you use the Kubernetes Deployment YAML file whose name is NGINX in the default namespace to create a scaling group in a region, the unique name of the mapped scaling group is k8s_default_Deployment_nginx.
     * You can use a Kubernetes Deployment YAML file to manage a scaling group based on the following logic:
     * * If an existing scaling group has a mapping relationship with your Kubernetes Deployment YAML file, you can update the scaling group by using the YAML file.
     * * If no scaling group that has a mapping relationship with your Kubernetes Deployment YAML file exists, you can create a scaling group with ease by using the YAML file.
     * ### Precautions
     * 1. If you do not specify a virtual private cloud (VPC), vSwitch, security group, or annotation in your Kubernetes Deployment YAML file, the system creates a default VPC that has default vSwitches and uses the default security group ess-default-sg of Auto Scaling. By default, the security group rule allows traffic on Transmission Control Protocol (TCP)-based port 22 and port 3389 and enables Internet Control Message Protocol (ICMP) for IPv4 addresses. If you want to enable other ports or protocols, you can create custom security group rules.
     * 2. If you want to use a public image, you must enable the Internet access feature and configure the k8s.aliyun.com/eci-with-eip pod annotation to enable the elastic IP address (EIP) feature.
     * 3. After you call the ApplyScalingGroup operation to apply a Kubernetes Deployment YAML file, the scaling group immediately enters the Enabled state and the scaling configuration immediately enters the Active state. If the number of replicas that you specified in the YAML file is grater than 0, elastic container instances are automatically created.
     * ### Supported annotations
     * For more information about annotations, see [ECI Pod Annotation](https://help.aliyun.com/document_detail/186939.html).
     * |Annotation|Example|Description|
     * |---|---|---|
     * |k8s.aliyun.com/ess-scaling-group-min-size|1|The minimum size of the scaling group that you want to create. Default value: 0.|
     * |k8s.aliyun.com/ess-scaling-group-max-size|20|The maximum size of the scaling group that you want to create. Default value: maximum number of replicas or 30, whichever is greater.|
     * |k8s.aliyun.com/eci-ntp-server|100.100.*.*|The IP address of the Network Time Protocol (NTP) server.|
     * |k8s.aliyun.com/eci-use-specs|2-4Gi|The specifications of 2 vCPUs and 4 GB memory. For more information, see [Create pods by specifying multiple specifications](https://help.aliyun.com/document_detail/451267.html).|
     * |k8s.aliyun.com/eci-vswitch|vsw-bp1xpiowfm5vo8o3c\\*\\*\\*\\*|The ID of the vSwitch. You can specify multiple vSwitches to specify multiple zones.|
     * |k8s.aliyun.com/eci-security-group|sg-bp1dktddjsg5nktv\\*\\*\\*\\*|The ID of the security group. Before you configure this annotation, take note of the following requirements:<ul data-sourcepos="26:74-26:168"><li data-sourcepos="26:78-26:114">You can specify one or more security groups. You can specify up to five security groups for each scaling group.</li><li data-sourcepos="26:114-26:140">If you specify multiple security groups, the security groups must belong to the same VPC.</li><li data-sourcepos="26:140-26:163">If you specify multiple security groups, the security groups must be of the same type.</li></ul>|
     * |k8s.aliyun.com/eci-sls-enable|"false"|If you set the value to false, the log collection feature is disabled.
     * If you do not want to use Custom Resource Definition (CRD) for Simple Log Service to collect logs of specific pods, you can configure this annotation for the pods and set the value to false. This prevents resource wastes caused by Logtails created by the system.|
     * |k8s.aliyun.com/eci-spot-strategy|SpotAsPriceGo|The bidding policy for the preemptible instance. Valid values:<ul data-sourcepos="28:69-28:204"><li data-sourcepos="28:73-28:158">SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price If you set the value to SpotWithPriceLimit, you must configure the k8s.aliyun.com/eci-spot-price-limit annotation.</li><li data-sourcepos="28:158-28:199">SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</li></ul>|
     * |k8s.aliyun.com/eci-spot-price-limit|"0.5"|The maximum hourly price of the preemptible instance. This value can be accurate to up to three decimal places.
     * This annotation takes effect only when you set the k8s.aliyun.com/eci-spot-strategy annotation to SpotWithPriceLimit.|
     * |k8s.aliyun.com/eci-with-eip|"true"|If you set the value to true, an EIP is automatically created and bound to each elastic container instance.|
     * |k8s.aliyun.com/eci-data-cache-bucket|default|The bucket of the specified DataCache. If you want to use a DataCache to create a pod, you must configure this annotation.|
     * |k8s.aliyun.com/eci-data-cache-pl|PL1|The performance level (PL) of the cloud disk that you want to create by using the specified DataCache.
     * By default, enhanced SSDs (ESSDs) are created. Default value: PL1.|
     * |k8s.aliyun.com/eci-data-cache-provisionedIops|"40000"|The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}. For more information, see [ESSD AutoPL](https://help.aliyun.com/document_detail/368372.html).
     * If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.|
     * |k8s.aliyun.com/eci-data-cache-burstingEnabled|"true"|Specifies whether the Burst feature is enabled for the ESSD AutoPL disk. For more information, see [ESSD AutoPL](https://help.aliyun.com/document_detail/368372.html).
     * If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.|
     * |k8s.aliyun.com/eci-custom-tags|"env:test,name:alice"|The tags that you want to add to each elastic container instance. You can add up to three tags for each elastic container instance. Separate a tag key and a tag value with a colon (:). Separate multiple tags with commas (,).|
     *
     * @param request ApplyScalingGroupRequest
     * @return ApplyScalingGroupResponse
     */
    public ApplyScalingGroupResponse applyScalingGroup(ApplyScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyScalingGroupWithOptions(request, runtime);
    }

    /**
     * @summary Associates Application Load Balancer (ALB) server groups with a scaling group.
     *
     * @description Before you associate an ALB server group with a scaling group, make sure that the following requirements are met:
     * *   The scaling group resides in a virtual private cloud (VPC). The scaling group and the ALB server group must reside in the same VPC.
     * *   The ALB server group is in the Available state.
     * *   You can associate only a limited number of ALB server groups with a scaling group. To view the quota or manually request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
     *
     * @param request AttachAlbServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachAlbServerGroupsResponse
     */
    public AttachAlbServerGroupsResponse attachAlbServerGroupsWithOptions(AttachAlbServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albServerGroups)) {
            query.put("AlbServerGroups", request.albServerGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachAlbServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachAlbServerGroupsResponse());
    }

    /**
     * @summary Associates Application Load Balancer (ALB) server groups with a scaling group.
     *
     * @description Before you associate an ALB server group with a scaling group, make sure that the following requirements are met:
     * *   The scaling group resides in a virtual private cloud (VPC). The scaling group and the ALB server group must reside in the same VPC.
     * *   The ALB server group is in the Available state.
     * *   You can associate only a limited number of ALB server groups with a scaling group. To view the quota or manually request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
     *
     * @param request AttachAlbServerGroupsRequest
     * @return AttachAlbServerGroupsResponse
     */
    public AttachAlbServerGroupsResponse attachAlbServerGroups(AttachAlbServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAlbServerGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Associates one or more ApsaraDB RDS instances with a scaling group.
     *
     * @description Before you associate an ApsaraDB RDS instance with a scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:
     * *   The ApsaraDB RDS instance and the scaling group must belong to the same Alibaba Cloud account.
     * *   The ApsaraDB RDS instance must be unlocked. For more information about the lock policy, see [ApsaraDB RDS usage notes](https://help.aliyun.com/document_detail/41872.html).
     * *   The ApsaraDB RDS instance must be in the Running state.
     * After an ApsaraDB RDS instance is associated with the scaling group, the default IP address whitelist of the ApsaraDB RDS instance can contain no more than 1,000 IP addresses. For more information, see [Set the whitelist](https://help.aliyun.com/document_detail/43185.html).
     *
     * @param request AttachDBInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachDBInstancesResponse
     */
    public AttachDBInstancesResponse attachDBInstancesWithOptions(AttachDBInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachMode)) {
            query.put("AttachMode", request.attachMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstances)) {
            query.put("DBInstances", request.DBInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDBInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDBInstancesResponse());
    }

    /**
     * @summary Associates one or more ApsaraDB RDS instances with a scaling group.
     *
     * @description Before you associate an ApsaraDB RDS instance with a scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:
     * *   The ApsaraDB RDS instance and the scaling group must belong to the same Alibaba Cloud account.
     * *   The ApsaraDB RDS instance must be unlocked. For more information about the lock policy, see [ApsaraDB RDS usage notes](https://help.aliyun.com/document_detail/41872.html).
     * *   The ApsaraDB RDS instance must be in the Running state.
     * After an ApsaraDB RDS instance is associated with the scaling group, the default IP address whitelist of the ApsaraDB RDS instance can contain no more than 1,000 IP addresses. For more information, see [Set the whitelist](https://help.aliyun.com/document_detail/43185.html).
     *
     * @param request AttachDBInstancesRequest
     * @return AttachDBInstancesResponse
     */
    public AttachDBInstancesResponse attachDBInstances(AttachDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDBInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Adds instances to a scaling group. You can call the AttachInstances operation to add independent Elastic Compute Service (ECS) instances, elastic container instances, or non-Alibaba Cloud instances to your scaling group to provide services. You can also call this operation to change the state of ECS instances in your scaling group from Economical Mode to In Service.
     *
     * @description Before you call this operation, take note of the following items:
     * *   The scaling group is in the Active state.
     * *   No scaling activities in the scaling group are in progress.
     * The ECS instances or the elastic container instances that you want to add to a scaling group must meet the following requirements:
     * *   The instances reside in the same region as the scaling group.
     * *   The instances must be in the Running state.
     * *   The instances are not added to other scaling groups.
     * *   The instances use the subscription or pay-as-you-go billing method, or are preemptible instances.
     * *   If the VswitchID parameter is specified for a scaling group, the instances that are in the classic network or those that are not in the same virtual private cloud (VPC) as the specified vSwitch cannot be added to the scaling group.
     * *   If the VswitchID parameter is not specified for a scaling group, the instances that are in VPCs cannot be added to the scaling group.
     * If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the sum of the number of instances that you want to add and the number of existing instances in the scaling group is greater than the value of the MaxSize parameter, the call fails.
     * Instances that are manually added by calling the AttachInstances operation are not associated with the active scaling configuration of the scaling group.
     *
     * @param request AttachInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachInstancesResponse
     */
    public AttachInstancesResponse attachInstancesWithOptions(AttachInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entrusted)) {
            query.put("Entrusted", request.entrusted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHook)) {
            query.put("LifecycleHook", request.lifecycleHook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeights)) {
            query.put("LoadBalancerWeights", request.loadBalancerWeights);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachInstancesResponse());
    }

    /**
     * @summary Adds instances to a scaling group. You can call the AttachInstances operation to add independent Elastic Compute Service (ECS) instances, elastic container instances, or non-Alibaba Cloud instances to your scaling group to provide services. You can also call this operation to change the state of ECS instances in your scaling group from Economical Mode to In Service.
     *
     * @description Before you call this operation, take note of the following items:
     * *   The scaling group is in the Active state.
     * *   No scaling activities in the scaling group are in progress.
     * The ECS instances or the elastic container instances that you want to add to a scaling group must meet the following requirements:
     * *   The instances reside in the same region as the scaling group.
     * *   The instances must be in the Running state.
     * *   The instances are not added to other scaling groups.
     * *   The instances use the subscription or pay-as-you-go billing method, or are preemptible instances.
     * *   If the VswitchID parameter is specified for a scaling group, the instances that are in the classic network or those that are not in the same virtual private cloud (VPC) as the specified vSwitch cannot be added to the scaling group.
     * *   If the VswitchID parameter is not specified for a scaling group, the instances that are in VPCs cannot be added to the scaling group.
     * If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the sum of the number of instances that you want to add and the number of existing instances in the scaling group is greater than the value of the MaxSize parameter, the call fails.
     * Instances that are manually added by calling the AttachInstances operation are not associated with the active scaling configuration of the scaling group.
     *
     * @param request AttachInstancesRequest
     * @return AttachInstancesResponse
     */
    public AttachInstancesResponse attachInstances(AttachInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Attaches load balancers to a scaling group. Auto Scaling supports the attachment of load balancers to scaling groups. Load balancers help distribute the access traffic to the instances in scaling groups, which effectively improves the service performance of the scaling groups. You can call the AttachLoadBalancers operation to attach one or more load balancers to your scaling group.
     *
     * @description Before you call this operation, make sure that the following requirements are met:
     * *   The load balancer and the scaling group belong to the same Alibaba Cloud account and region.
     * *   The load balancer is in the `Running` state.
     * *   At least one listener is configured for the load balancer, and the health check feature is enabled for the load balancer.
     * *   If the network type of the load balancer and the scaling group is virtual private cloud (VPC), they use the same VPC.
     * *   If the network type of the scaling group is VPC, and that of the load balancer is classic network and a backend server of the load balancer uses a VPC, the scaling group and the backend server use the same VPC.
     * *   The attachment of load balancers ensures that the cumulative number of load balancers attached to the scaling group stays within the predefined maximum limit. For information about the load balancer quota, see [Limits](https://help.aliyun.com/document_detail/25863.html).
     *
     * @param request AttachLoadBalancersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachLoadBalancersResponse
     */
    public AttachLoadBalancersResponse attachLoadBalancersWithOptions(AttachLoadBalancersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerConfigs)) {
            query.put("LoadBalancerConfigs", request.loadBalancerConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancers)) {
            query.put("LoadBalancers", request.loadBalancers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachLoadBalancers"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachLoadBalancersResponse());
    }

    /**
     * @summary Attaches load balancers to a scaling group. Auto Scaling supports the attachment of load balancers to scaling groups. Load balancers help distribute the access traffic to the instances in scaling groups, which effectively improves the service performance of the scaling groups. You can call the AttachLoadBalancers operation to attach one or more load balancers to your scaling group.
     *
     * @description Before you call this operation, make sure that the following requirements are met:
     * *   The load balancer and the scaling group belong to the same Alibaba Cloud account and region.
     * *   The load balancer is in the `Running` state.
     * *   At least one listener is configured for the load balancer, and the health check feature is enabled for the load balancer.
     * *   If the network type of the load balancer and the scaling group is virtual private cloud (VPC), they use the same VPC.
     * *   If the network type of the scaling group is VPC, and that of the load balancer is classic network and a backend server of the load balancer uses a VPC, the scaling group and the backend server use the same VPC.
     * *   The attachment of load balancers ensures that the cumulative number of load balancers attached to the scaling group stays within the predefined maximum limit. For information about the load balancer quota, see [Limits](https://help.aliyun.com/document_detail/25863.html).
     *
     * @param request AttachLoadBalancersRequest
     * @return AttachLoadBalancersResponse
     */
    public AttachLoadBalancersResponse attachLoadBalancers(AttachLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachLoadBalancersWithOptions(request, runtime);
    }

    /**
     * @summary Attaches one or more server groups to a scaling group. You can attach the following server groups to a scaling group: Application Load Balancer (ALB) and Network Load Balancer (NLB) server groups.
     *
     * @param request AttachServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachServerGroupsResponse
     */
    public AttachServerGroupsResponse attachServerGroupsWithOptions(AttachServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroups)) {
            query.put("ServerGroups", request.serverGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachServerGroupsResponse());
    }

    /**
     * @summary Attaches one or more server groups to a scaling group. You can attach the following server groups to a scaling group: Application Load Balancer (ALB) and Network Load Balancer (NLB) server groups.
     *
     * @param request AttachServerGroupsRequest
     * @return AttachServerGroupsResponse
     */
    public AttachServerGroupsResponse attachServerGroups(AttachServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachServerGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Associates Sever Load Balancer (SLB) vServer groups with a scaling group.
     *
     * @description Before you call this operation to attach a vServer group to your scaling group, take note of the following items:
     * *   The CLB instance and the scaling group must belong to the same Alibaba Cloud account.
     * *   The CLB instance and the scaling group must reside in the same region.
     * *   The CLB instance must be in the Running state.
     * *   The CLB instance must be configured with at least one listener. Health check is enabled for the CLB instance.
     * *   The CLB instance and the scaling group must be in the same VPC if their network type is VPC.
     * *   If the network type of the scaling group is VPC, the network type of the CLB instance is classic network, and the vServer groups of the CLB instance contain instances of the VPC network type, the instances and the scaling group must be in the same VPC.
     * *   The vServer group that you want to attach to your scaling group must belong to the CLB instance.
     * *   You can attach only a limited number of vServer groups to a scaling group. For information about the quota on vServer groups, see [Limits](https://help.aliyun.com/document_detail/25863.html).
     * When you call this operation, you must specify the following parameters:
     * *   LoadBalancerId: the ID of the CLB instance.
     * *   VServerGroupId: the ID of the vServer group.
     * *   Port: the port number of the vServer group.
     * If a vServer group is attached to a scaling group by using different ports, Auto Scaling considers that more than one vServer group is attached to the scaling group. If multiple vServer groups with the same group ID and port number are specified in the request parameters, only the first vServer group is used. The other vServer groups are ignored.
     *
     * @param request AttachVServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachVServerGroupsResponse
     */
    public AttachVServerGroupsResponse attachVServerGroupsWithOptions(AttachVServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroups)) {
            query.put("VServerGroups", request.VServerGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachVServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachVServerGroupsResponse());
    }

    /**
     * @summary Associates Sever Load Balancer (SLB) vServer groups with a scaling group.
     *
     * @description Before you call this operation to attach a vServer group to your scaling group, take note of the following items:
     * *   The CLB instance and the scaling group must belong to the same Alibaba Cloud account.
     * *   The CLB instance and the scaling group must reside in the same region.
     * *   The CLB instance must be in the Running state.
     * *   The CLB instance must be configured with at least one listener. Health check is enabled for the CLB instance.
     * *   The CLB instance and the scaling group must be in the same VPC if their network type is VPC.
     * *   If the network type of the scaling group is VPC, the network type of the CLB instance is classic network, and the vServer groups of the CLB instance contain instances of the VPC network type, the instances and the scaling group must be in the same VPC.
     * *   The vServer group that you want to attach to your scaling group must belong to the CLB instance.
     * *   You can attach only a limited number of vServer groups to a scaling group. For information about the quota on vServer groups, see [Limits](https://help.aliyun.com/document_detail/25863.html).
     * When you call this operation, you must specify the following parameters:
     * *   LoadBalancerId: the ID of the CLB instance.
     * *   VServerGroupId: the ID of the vServer group.
     * *   Port: the port number of the vServer group.
     * If a vServer group is attached to a scaling group by using different ports, Auto Scaling considers that more than one vServer group is attached to the scaling group. If multiple vServer groups with the same group ID and port number are specified in the request parameters, only the first vServer group is used. The other vServer groups are ignored.
     *
     * @param request AttachVServerGroupsRequest
     * @return AttachVServerGroupsResponse
     */
    public AttachVServerGroupsResponse attachVServerGroups(AttachVServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachVServerGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Adds a scaling group to a resource group.
     *
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2022-02-22"),
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

    /**
     * @summary Adds a scaling group to a resource group.
     *
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * @summary Ends the timeout period of a lifecycle hook ahead of schedule. If you have created a lifecycle hook for your scaling group, you can call the CompleteLifecycleAction operation to end the timeout period of the lifecycle hook ahead of schedule based on your business requirements.
     *
     * @description When you manually cut short the timeout period of a lifecycle hook, Auto Scaling proceeds with one of the following actions based on the predefined settings: responding to the scaling request, aborting the scaling request, and initiating a rollback process.
     *
     * @param request CompleteLifecycleActionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteLifecycleActionResponse
     */
    public CompleteLifecycleActionResponse completeLifecycleActionWithOptions(CompleteLifecycleActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionResult)) {
            query.put("LifecycleActionResult", request.lifecycleActionResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionToken)) {
            query.put("LifecycleActionToken", request.lifecycleActionToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookId)) {
            query.put("LifecycleHookId", request.lifecycleHookId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteLifecycleAction"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteLifecycleActionResponse());
    }

    /**
     * @summary Ends the timeout period of a lifecycle hook ahead of schedule. If you have created a lifecycle hook for your scaling group, you can call the CompleteLifecycleAction operation to end the timeout period of the lifecycle hook ahead of schedule based on your business requirements.
     *
     * @description When you manually cut short the timeout period of a lifecycle hook, Auto Scaling proceeds with one of the following actions based on the predefined settings: responding to the scaling request, aborting the scaling request, and initiating a rollback process.
     *
     * @param request CompleteLifecycleActionRequest
     * @return CompleteLifecycleActionResponse
     */
    public CompleteLifecycleActionResponse completeLifecycleAction(CompleteLifecycleActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeLifecycleActionWithOptions(request, runtime);
    }

    /**
     * @summary Creates an event-triggered task.
     *
     * @description *   If you set the MetricType parameter to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using custom metrics. For more information, see [Custom monitoring event-triggered tasks](https://help.aliyun.com/document_detail/74861.html).
     * *   When you create an event-triggered task, you must specify the MetricName, DimensionKey, and DimensionValue parameters to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances or elastic container instances in a scaling group within an Alibaba Cloud account.
     *     *   If you set the MetricType parameter to custom, the valid values are your custom metrics.
     *     *   For information about the supported metrics when you set the MetricType parameter to system, see [Event-triggered task for system monitoring](https://help.aliyun.com/document_detail/74854.html).
     * > The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see the `DimensionKey` and `DimensionValue` parameters in the "Request parameters" section of this topic.
     *
     * @param request CreateAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlarmResponse
     */
    public CreateAlarmResponse createAlarmWithOptions(CreateAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmActions)) {
            query.put("AlarmActions", request.alarmActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comparisonOperator)) {
            query.put("ComparisonOperator", request.comparisonOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effective)) {
            query.put("Effective", request.effective);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressions)) {
            query.put("Expressions", request.expressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionsLogicOperator)) {
            query.put("ExpressionsLogicOperator", request.expressionsLogicOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statistics)) {
            query.put("Statistics", request.statistics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlarmResponse());
    }

    /**
     * @summary Creates an event-triggered task.
     *
     * @description *   If you set the MetricType parameter to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using custom metrics. For more information, see [Custom monitoring event-triggered tasks](https://help.aliyun.com/document_detail/74861.html).
     * *   When you create an event-triggered task, you must specify the MetricName, DimensionKey, and DimensionValue parameters to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances or elastic container instances in a scaling group within an Alibaba Cloud account.
     *     *   If you set the MetricType parameter to custom, the valid values are your custom metrics.
     *     *   For information about the supported metrics when you set the MetricType parameter to system, see [Event-triggered task for system monitoring](https://help.aliyun.com/document_detail/74854.html).
     * > The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see the `DimensionKey` and `DimensionValue` parameters in the "Request parameters" section of this topic.
     *
     * @param request CreateAlarmRequest
     * @return CreateAlarmResponse
     */
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAlarmWithOptions(request, runtime);
    }

    /**
     * @summary Creates a scaling configuration of the Elastic Container Instance type. Auto Scaling uses the scaling configuration as a template to create elastic container instances to meet your business requirements during scale-outs.
     *
     * @description A scaling configuration is a template that is used to create elastic container instances during scale-out activities.
     * You can specify the Cpu and Memory parameters to determine the range of instance types. If you specify the parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances of the instance type that is provided at the lowest price. This scaling mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
     *
     * @param request CreateEciScalingConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEciScalingConfigurationResponse
     */
    public CreateEciScalingConfigurationResponse createEciScalingConfigurationWithOptions(CreateEciScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfos)) {
            query.put("AcrRegistryInfos", request.acrRegistryInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activeDeadlineSeconds)) {
            query.put("ActiveDeadlineSeconds", request.activeDeadlineSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateEip)) {
            query.put("AutoCreateEip", request.autoCreateEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoMatchImageCache)) {
            query.put("AutoMatchImageCache", request.autoMatchImageCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupName)) {
            query.put("ContainerGroupName", request.containerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containers)) {
            query.put("Containers", request.containers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costOptimization)) {
            query.put("CostOptimization", request.costOptimization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsCore)) {
            query.put("CpuOptionsCore", request.cpuOptionsCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsThreadsPerCore)) {
            query.put("CpuOptionsThreadsPerCore", request.cpuOptionsThreadsPerCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBucket)) {
            query.put("DataCacheBucket", request.dataCacheBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBurstingEnabled)) {
            query.put("DataCacheBurstingEnabled", request.dataCacheBurstingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCachePL)) {
            query.put("DataCachePL", request.dataCachePL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheProvisionedIops)) {
            query.put("DataCacheProvisionedIops", request.dataCacheProvisionedIops);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigNameServers)) {
            query.put("DnsConfigNameServers", request.dnsConfigNameServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigOptions)) {
            query.put("DnsConfigOptions", request.dnsConfigOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigSearchs)) {
            query.put("DnsConfigSearchs", request.dnsConfigSearchs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsPolicy)) {
            query.put("DnsPolicy", request.dnsPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressBandwidth)) {
            query.put("EgressBandwidth", request.egressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipBandwidth)) {
            query.put("EipBandwidth", request.eipBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSls)) {
            query.put("EnableSls", request.enableSls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeralStorage)) {
            query.put("EphemeralStorage", request.ephemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAliases)) {
            query.put("HostAliases", request.hostAliases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRegistryCredentials)) {
            query.put("ImageRegistryCredentials", request.imageRegistryCredentials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageSnapshotId)) {
            query.put("ImageSnapshotId", request.imageSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressBandwidth)) {
            query.put("IngressBandwidth", request.ingressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainers)) {
            query.put("InitContainers", request.initContainers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceFamilyLevel)) {
            query.put("InstanceFamilyLevel", request.instanceFamilyLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeight)) {
            query.put("LoadBalancerWeight", request.loadBalancerWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ntpServers)) {
            query.put("NtpServers", request.ntpServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartPolicy)) {
            query.put("RestartPolicy", request.restartPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationName)) {
            query.put("ScalingConfigurationName", request.scalingConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityContextSysctls)) {
            query.put("SecurityContextSysctls", request.securityContextSysctls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimit)) {
            query.put("SpotPriceLimit", request.spotPriceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumes)) {
            query.put("Volumes", request.volumes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEciScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEciScalingConfigurationResponse());
    }

    /**
     * @summary Creates a scaling configuration of the Elastic Container Instance type. Auto Scaling uses the scaling configuration as a template to create elastic container instances to meet your business requirements during scale-outs.
     *
     * @description A scaling configuration is a template that is used to create elastic container instances during scale-out activities.
     * You can specify the Cpu and Memory parameters to determine the range of instance types. If you specify the parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances of the instance type that is provided at the lowest price. This scaling mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
     *
     * @param request CreateEciScalingConfigurationRequest
     * @return CreateEciScalingConfigurationResponse
     */
    public CreateEciScalingConfigurationResponse createEciScalingConfiguration(CreateEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEciScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Creates one or more lifecycle hooks.
     *
     * @description You can create up to six lifecycle hooks for each scaling group. After a lifecycle hook is created for a scaling group, Elastic Compute Service (ECS) instances in the scaling group waits to be added to or removed from the scaling group during scaling activities. You can use the HeartbeatTimeout parameter to specify the timeout period of the lifecycle hook. During the timeout period of a lifecycle hook, you can perform custom operations such as initialize ECS instance configurations and download ECS instance data on the ECS instances for which the lifecycle hook is applied.
     * During a scale-out activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be added to the associated whitelist that manages access to the ApsaraDB RDS instance. The ECS instances also wait to be added to the backend server group of the associated Classic Load Balancer (CLB) instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are added to the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also added to the backend server group of the associated CLB instance. During a scale-in activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances also wait to be removed from the backend server group of the associated CLB instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also removed from the backend server group of the associated CLB instance.
     * You can configure a notification method for a lifecycle hook. When the lifecycle hook is triggered, a notification can be sent to the specified Message Service (MNS) topic or queue, or an operation can be performed based on the specified Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a Resource Access Management (RAM) role for OOS. For more information, see [Grant RAM permissions to OOS](https://help.aliyun.com/document_detail/120810.html).
     * > If your scaling group has existing ECS instances and you configured an OOS template that is used to add the private IP addresses of ECS instances to or remove the private IP addresses of ECS instances from the whitelists that manage access to cloud databases that are not ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the whitelists that manage access to the cloud databases.
     *
     * @param request CreateLifecycleHookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLifecycleHookResponse
     */
    public CreateLifecycleHookResponse createLifecycleHookWithOptions(CreateLifecycleHookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultResult)) {
            query.put("DefaultResult", request.defaultResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.heartbeatTimeout)) {
            query.put("HeartbeatTimeout", request.heartbeatTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookName)) {
            query.put("LifecycleHookName", request.lifecycleHookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleTransition)) {
            query.put("LifecycleTransition", request.lifecycleTransition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationMetadata)) {
            query.put("NotificationMetadata", request.notificationMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLifecycleHook"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLifecycleHookResponse());
    }

    /**
     * @summary Creates one or more lifecycle hooks.
     *
     * @description You can create up to six lifecycle hooks for each scaling group. After a lifecycle hook is created for a scaling group, Elastic Compute Service (ECS) instances in the scaling group waits to be added to or removed from the scaling group during scaling activities. You can use the HeartbeatTimeout parameter to specify the timeout period of the lifecycle hook. During the timeout period of a lifecycle hook, you can perform custom operations such as initialize ECS instance configurations and download ECS instance data on the ECS instances for which the lifecycle hook is applied.
     * During a scale-out activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be added to the associated whitelist that manages access to the ApsaraDB RDS instance. The ECS instances also wait to be added to the backend server group of the associated Classic Load Balancer (CLB) instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are added to the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also added to the backend server group of the associated CLB instance. During a scale-in activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances also wait to be removed from the backend server group of the associated CLB instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also removed from the backend server group of the associated CLB instance.
     * You can configure a notification method for a lifecycle hook. When the lifecycle hook is triggered, a notification can be sent to the specified Message Service (MNS) topic or queue, or an operation can be performed based on the specified Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a Resource Access Management (RAM) role for OOS. For more information, see [Grant RAM permissions to OOS](https://help.aliyun.com/document_detail/120810.html).
     * > If your scaling group has existing ECS instances and you configured an OOS template that is used to add the private IP addresses of ECS instances to or remove the private IP addresses of ECS instances from the whitelists that manage access to cloud databases that are not ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the whitelists that manage access to the cloud databases.
     *
     * @param request CreateLifecycleHookRequest
     * @return CreateLifecycleHookResponse
     */
    public CreateLifecycleHookResponse createLifecycleHook(CreateLifecycleHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecycleHookWithOptions(request, runtime);
    }

    /**
     * @summary Creates a notification rule. You can call the CreateNotificationConfiguration operation to create a notification rule to stay informed about scaling events or resource changes. This helps you learn about the dynamic status of your scaling group in real time and further automates the management of scaling events.
     *
     * @description ## Description
     * You can configure CloudMonitor system events, Message Service (MNS) queues, or MNS topics to receive notifications. When a specified type of scaling activity or resource change occurs in a scaling group, Auto Scaling sends notifications by using CloudMonitor or MNS.
     *
     * @param request CreateNotificationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNotificationConfigurationResponse
     */
    public CreateNotificationConfigurationResponse createNotificationConfigurationWithOptions(CreateNotificationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationTypes)) {
            query.put("NotificationTypes", request.notificationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNotificationConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNotificationConfigurationResponse());
    }

    /**
     * @summary Creates a notification rule. You can call the CreateNotificationConfiguration operation to create a notification rule to stay informed about scaling events or resource changes. This helps you learn about the dynamic status of your scaling group in real time and further automates the management of scaling events.
     *
     * @description ## Description
     * You can configure CloudMonitor system events, Message Service (MNS) queues, or MNS topics to receive notifications. When a specified type of scaling activity or resource change occurs in a scaling group, Auto Scaling sends notifications by using CloudMonitor or MNS.
     *
     * @param request CreateNotificationConfigurationRequest
     * @return CreateNotificationConfigurationResponse
     */
    public CreateNotificationConfigurationResponse createNotificationConfiguration(CreateNotificationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNotificationConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Creates a scaling configuration.
     *
     * @description Auto Scaling automatically creates Elastic Compute Service (ECS) instances based on the specified scaling configuration. ECS instances can be created in the following modes:
     * *   InstancePatternInfos: intelligent configuration mode. In this mode, you need to only specify the number of vCPUs, memory size, instance family, and maximum price. Auto Scaling selects the instance type that has the lowest price based on the configurations to create ECS instances. This mode is available only for scaling groups that reside in virtual private clouds (VPCs). This mode reduces scale-out failures caused by insufficient inventory of instance types.
     * *   InstanceType: In this mode, you must specify one instance type.
     * *   InstanceTypes: In this mode, you can specify more than one instance type.
     * *   InstanceTypeOverrides: In this mode, you can specify multiple instance types and weights for the instance types.
     * *   Cpu and Memory: In this mode, you must specify the number of vCPUs and the memory size. Auto Scaling determines the range of available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling creates ECS instances by using the lowest-priced instance type. This mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
     * > You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. You can specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfo at the same time. If you specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfos at the same time, Auto Scaling preferentially uses the instance types that are specified by InstanceType or InstanceTypes for scale-outs. If the instance types that are specified by InstanceType or InstanceTypes do not have sufficient inventory, Auto Scaling uses the instance types that are specified by InstancePatternInfos for scale-outs.
     *
     * @param tmpReq CreateScalingConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScalingConfigurationResponse
     */
    public CreateScalingConfigurationResponse createScalingConfigurationWithOptions(CreateScalingConfigurationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScalingConfigurationShrinkRequest request = new CreateScalingConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedulerOptions)) {
            request.schedulerOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedulerOptions, "SchedulerOptions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.affinity)) {
            query.put("Affinity", request.affinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creditSpecification)) {
            query.put("CreditSpecification", request.creditSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPriorities)) {
            query.put("CustomPriorities", request.customPriorities);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisks)) {
            query.put("DataDisks", request.dataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedHostClusterId)) {
            query.put("DedicatedHostClusterId", request.dedicatedHostClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedHostId)) {
            query.put("DedicatedHostId", request.dedicatedHostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentSetId)) {
            query.put("DeploymentSetId", request.deploymentSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hpcClusterId)) {
            query.put("HpcClusterId", request.hpcClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFamily)) {
            query.put("ImageFamily", request.imageFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            query.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instancePatternInfos)) {
            query.put("InstancePatternInfos", request.instancePatternInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeOverrides)) {
            query.put("InstanceTypeOverrides", request.instanceTypeOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidthIn)) {
            query.put("InternetMaxBandwidthIn", request.internetMaxBandwidthIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidthOut)) {
            query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioOptimized)) {
            query.put("IoOptimized", request.ioOptimized);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeight)) {
            query.put("LoadBalancerWeight", request.loadBalancerWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaces)) {
            query.put("NetworkInterfaces", request.networkInterfaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInherit)) {
            query.put("PasswordInherit", request.passwordInherit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationName)) {
            query.put("ScalingConfigurationName", request.scalingConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerOptionsShrink)) {
            query.put("SchedulerOptions", request.schedulerOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityEnhancementStrategy)) {
            query.put("SecurityEnhancementStrategy", request.securityEnhancementStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupIds)) {
            query.put("SecurityGroupIds", request.securityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotDuration)) {
            query.put("SpotDuration", request.spotDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInterruptionBehavior)) {
            query.put("SpotInterruptionBehavior", request.spotInterruptionBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimits)) {
            query.put("SpotPriceLimits", request.spotPriceLimits);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSetId)) {
            query.put("StorageSetId", request.storageSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSetPartitionNumber)) {
            query.put("StorageSetPartitionNumber", request.storageSetPartitionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskCategories)) {
            query.put("SystemDiskCategories", request.systemDiskCategories);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenancy)) {
            query.put("Tenancy", request.tenancy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageOptions)) {
            query.put("ImageOptions", request.imageOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privatePoolOptions)) {
            query.put("PrivatePoolOptions", request.privatePoolOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk)) {
            query.put("SystemDisk", request.systemDisk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScalingConfigurationResponse());
    }

    /**
     * @summary Creates a scaling configuration.
     *
     * @description Auto Scaling automatically creates Elastic Compute Service (ECS) instances based on the specified scaling configuration. ECS instances can be created in the following modes:
     * *   InstancePatternInfos: intelligent configuration mode. In this mode, you need to only specify the number of vCPUs, memory size, instance family, and maximum price. Auto Scaling selects the instance type that has the lowest price based on the configurations to create ECS instances. This mode is available only for scaling groups that reside in virtual private clouds (VPCs). This mode reduces scale-out failures caused by insufficient inventory of instance types.
     * *   InstanceType: In this mode, you must specify one instance type.
     * *   InstanceTypes: In this mode, you can specify more than one instance type.
     * *   InstanceTypeOverrides: In this mode, you can specify multiple instance types and weights for the instance types.
     * *   Cpu and Memory: In this mode, you must specify the number of vCPUs and the memory size. Auto Scaling determines the range of available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling creates ECS instances by using the lowest-priced instance type. This mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
     * > You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. You can specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfo at the same time. If you specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfos at the same time, Auto Scaling preferentially uses the instance types that are specified by InstanceType or InstanceTypes for scale-outs. If the instance types that are specified by InstanceType or InstanceTypes do not have sufficient inventory, Auto Scaling uses the instance types that are specified by InstancePatternInfos for scale-outs.
     *
     * @param request CreateScalingConfigurationRequest
     * @return CreateScalingConfigurationResponse
     */
    public CreateScalingConfigurationResponse createScalingConfiguration(CreateScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Creates a scaling group.
     *
     * @description A scaling group is a group of Elastic Compute Service (ECS) instances that can be used in similar business scenarios.
     * You can create only a limited number of scaling groups in a region. Go to Quota Center to check the quota of the scaling groups.
     * A scaling group does not immediately take effect after you create the scaling group. You must call the EnableScalingGroup operation to enable the scaling group. After you enable the scaling group, Auto Scaling can execute scaling rules to trigger scaling activities in the scaling group.
     * The Classic Load Balancer (CLB) instances and ApsaraDB RDS instances that you want to associate with a scaling group must reside in the same region as the scaling group. CLB instances are formerly known as Server Load Balancer (SLB) instances. For more information, see the [Regions and zones](https://help.aliyun.com/document_detail/40654.html) topic.
     * If you associate a CLB instance when you create a scaling group, Auto Scaling automatically adds ECS instances in the scaling group to the backend server group of the associated CLB instance. You can specify a server group to which ECS instances can be added. You can add ECS instances to the following types of server groups:
     * *   Default server group: a group of ECS instances that are used to receive requests. If you do not specify a vServer group or a primary/secondary server group for a listener, requests are forwarded to the ECS instances in the default server group.
     * *   vServer group: If you want to forward requests to backend servers that are not in the default server group or configure domain name-based or URL-based forwarding rules, you can use vServer groups.
     * > If you specify the default server group and multiple vServer groups at the same time, ECS instances are added to all specified server groups.
     * The default weight of an ECS instance that is added as a backend server of a CLB instance is 50. The CLB instance that you want to associate with your scaling group must meet the following requirements:
     * *   The CLB instance must be in the Active state. You can call the DescribeLoadBalancers operation to query the state of the CLB instance.
     * *   The health check feature must be enabled on all listener ports that are configured for the CLB instance. Otherwise, the scaling group fails to be created.
     * If you associate an Application Load Balancer (ALB) server group with a scaling group, Auto Scaling automatically adds ECS instances that are in the scaling group to the ALB server group to process requests distributed by the ALB instance to which the ALB server group belongs. You can specify multiple ALB server groups. The server groups must reside in the same virtual private cloud (VPC) as the scaling group. For more information, see the "AttachAlbServerGroups" topic.
     * If you associate an ApsaraDB RDS instance with a scaling group, Auto Scaling automatically adds the private IP addresses of the ECS instances in the scaling group to the IP address whitelist of the ApsaraDB RDS instance. The ApsaraDB RDS instance that you want to associate with your scaling group must meet the following requirements:
     * *   The ApsaraDB RDS instance must be in the Running state. You can call the DescribeDBInstances operation to query the state of the ApsaraDB RDS instance.
     * *   The number of IP addresses in the IP address whitelist of the ApsaraDB RDS instance cannot exceed the upper limit. For more information, see the "Configure whitelists" topic.
     * If you set the MultiAZPolicy parameter of the scaling group to COST_OPTIMIZED, take note of the following items:
     * *   You can use the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools parameters to specify the instance allocation method based on the cost optimization policy. This instance allocation method is prioritized during scaling.
     * *   If you do not specify the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools parameter, the instance types that are provided at the lowest price are used to create instances based on the cost optimization policy.
     * If you set the `Tags.Propagate` parameter of the scaling group to true, the following rules apply:
     * *   Tags that you add to the scaling group cannot be propagated to existing instances in the scaling group. Tags that you add to the scaling group are propagated to only new instances.
     * *   If you specify instance tags in the scaling configuration that is used to create instances and propagate the tags that you add to the scaling group to the instances, all tags exist at the same time.
     * *   If the tag key that you specify in a scaling configuration and the tag key that you add to the scaling group of the scaling configuration are the same, the tag value that you specify in the scaling configuration is preferentially used.
     *
     * @param request CreateScalingGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScalingGroupResponse
     */
    public CreateScalingGroupResponse createScalingGroupWithOptions(CreateScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albServerGroups)) {
            query.put("AlbServerGroups", request.albServerGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allocationStrategy)) {
            query.put("AllocationStrategy", request.allocationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.azBalance)) {
            query.put("AzBalance", request.azBalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compensateWithOnDemand)) {
            query.put("CompensateWithOnDemand", request.compensateWithOnDemand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPolicyARN)) {
            query.put("CustomPolicyARN", request.customPolicyARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceIds)) {
            query.put("DBInstanceIds", request.DBInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstances)) {
            query.put("DBInstances", request.DBInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCooldown)) {
            query.put("DefaultCooldown", request.defaultCooldown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupDeletionProtection)) {
            query.put("GroupDeletionProtection", request.groupDeletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            query.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTypes)) {
            query.put("HealthCheckTypes", request.healthCheckTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateId)) {
            query.put("LaunchTemplateId", request.launchTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateOverrides)) {
            query.put("LaunchTemplateOverrides", request.launchTemplateOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateVersion)) {
            query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHooks)) {
            query.put("LifecycleHooks", request.lifecycleHooks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerConfigs)) {
            query.put("LoadBalancerConfigs", request.loadBalancerConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerIds)) {
            query.put("LoadBalancerIds", request.loadBalancerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxInstanceLifetime)) {
            query.put("MaxInstanceLifetime", request.maxInstanceLifetime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSize)) {
            query.put("MaxSize", request.maxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minSize)) {
            query.put("MinSize", request.minSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiAZPolicy)) {
            query.put("MultiAZPolicy", request.multiAZPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onDemandBaseCapacity)) {
            query.put("OnDemandBaseCapacity", request.onDemandBaseCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onDemandPercentageAboveBaseCapacity)) {
            query.put("OnDemandPercentageAboveBaseCapacity", request.onDemandPercentageAboveBaseCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removalPolicies)) {
            query.put("RemovalPolicies", request.removalPolicies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupName)) {
            query.put("ScalingGroupName", request.scalingGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingPolicy)) {
            query.put("ScalingPolicy", request.scalingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroups)) {
            query.put("ServerGroups", request.serverGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotAllocationStrategy)) {
            query.put("SpotAllocationStrategy", request.spotAllocationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInstancePools)) {
            query.put("SpotInstancePools", request.spotInstancePools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInstanceRemedy)) {
            query.put("SpotInstanceRemedy", request.spotInstanceRemedy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncAlarmRuleToCms)) {
            query.put("SyncAlarmRuleToCms", request.syncAlarmRuleToCms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroups)) {
            query.put("VServerGroups", request.VServerGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScalingGroupResponse());
    }

    /**
     * @summary Creates a scaling group.
     *
     * @description A scaling group is a group of Elastic Compute Service (ECS) instances that can be used in similar business scenarios.
     * You can create only a limited number of scaling groups in a region. Go to Quota Center to check the quota of the scaling groups.
     * A scaling group does not immediately take effect after you create the scaling group. You must call the EnableScalingGroup operation to enable the scaling group. After you enable the scaling group, Auto Scaling can execute scaling rules to trigger scaling activities in the scaling group.
     * The Classic Load Balancer (CLB) instances and ApsaraDB RDS instances that you want to associate with a scaling group must reside in the same region as the scaling group. CLB instances are formerly known as Server Load Balancer (SLB) instances. For more information, see the [Regions and zones](https://help.aliyun.com/document_detail/40654.html) topic.
     * If you associate a CLB instance when you create a scaling group, Auto Scaling automatically adds ECS instances in the scaling group to the backend server group of the associated CLB instance. You can specify a server group to which ECS instances can be added. You can add ECS instances to the following types of server groups:
     * *   Default server group: a group of ECS instances that are used to receive requests. If you do not specify a vServer group or a primary/secondary server group for a listener, requests are forwarded to the ECS instances in the default server group.
     * *   vServer group: If you want to forward requests to backend servers that are not in the default server group or configure domain name-based or URL-based forwarding rules, you can use vServer groups.
     * > If you specify the default server group and multiple vServer groups at the same time, ECS instances are added to all specified server groups.
     * The default weight of an ECS instance that is added as a backend server of a CLB instance is 50. The CLB instance that you want to associate with your scaling group must meet the following requirements:
     * *   The CLB instance must be in the Active state. You can call the DescribeLoadBalancers operation to query the state of the CLB instance.
     * *   The health check feature must be enabled on all listener ports that are configured for the CLB instance. Otherwise, the scaling group fails to be created.
     * If you associate an Application Load Balancer (ALB) server group with a scaling group, Auto Scaling automatically adds ECS instances that are in the scaling group to the ALB server group to process requests distributed by the ALB instance to which the ALB server group belongs. You can specify multiple ALB server groups. The server groups must reside in the same virtual private cloud (VPC) as the scaling group. For more information, see the "AttachAlbServerGroups" topic.
     * If you associate an ApsaraDB RDS instance with a scaling group, Auto Scaling automatically adds the private IP addresses of the ECS instances in the scaling group to the IP address whitelist of the ApsaraDB RDS instance. The ApsaraDB RDS instance that you want to associate with your scaling group must meet the following requirements:
     * *   The ApsaraDB RDS instance must be in the Running state. You can call the DescribeDBInstances operation to query the state of the ApsaraDB RDS instance.
     * *   The number of IP addresses in the IP address whitelist of the ApsaraDB RDS instance cannot exceed the upper limit. For more information, see the "Configure whitelists" topic.
     * If you set the MultiAZPolicy parameter of the scaling group to COST_OPTIMIZED, take note of the following items:
     * *   You can use the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools parameters to specify the instance allocation method based on the cost optimization policy. This instance allocation method is prioritized during scaling.
     * *   If you do not specify the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools parameter, the instance types that are provided at the lowest price are used to create instances based on the cost optimization policy.
     * If you set the `Tags.Propagate` parameter of the scaling group to true, the following rules apply:
     * *   Tags that you add to the scaling group cannot be propagated to existing instances in the scaling group. Tags that you add to the scaling group are propagated to only new instances.
     * *   If you specify instance tags in the scaling configuration that is used to create instances and propagate the tags that you add to the scaling group to the instances, all tags exist at the same time.
     * *   If the tag key that you specify in a scaling configuration and the tag key that you add to the scaling group of the scaling configuration are the same, the tag value that you specify in the scaling configuration is preferentially used.
     *
     * @param request CreateScalingGroupRequest
     * @return CreateScalingGroupResponse
     */
    public CreateScalingGroupResponse createScalingGroup(CreateScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScalingGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates a scaling rule.
     *
     * @description ## Description
     * A scaling rule defines a specific scaling activity, such as adding or removing N instances. If the number of Elastic Compute Service (ECS) instances in a scaling group is less than the minimum number allowed or greater than the maximum number allowed after a scaling rule is executed, Auto Scaling adjusts the number of ECS instances that you want to add or remove. This way, the number of ECS instances can be maintained within the valid range after the scaling rule is executed. The number of ECS instances that is specified in the scaling rule remains unchanged. Example:
     * *   If your scaling group contains two ECS instances and allows up to three ECS instances, only one ECS instance is added to your scaling group after you execute a scale-out rule in which three ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
     * *   If your scaling group contains three ECS instances and requires at least two ECS instances, only one ECS instance is removed from your scaling group after you execute a scale-in rule in which five ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
     * Before you call this operation, take note of the following items:
     * *   If you set the AdjustmentType parameter to TotalCapacity, the number of ECS instances in the scaling group is adjusted to the specified value. The value of the AdjustmentValue parameter must be greater than or equal to 0.
     * *   If you set the AdjustmentType parameter to QuantityChangeInCapacity or PercentChangeInCapacity, a positive value of AdjustmentValue specifies the number of ECS instances that are added to the scaling group, and a negative value of AdjustmentValue specifies the number of ECS instances that are removed from the scaling group.
     * *   If you set the AdjustmentType parameter to PercentChangeInCapacity, Auto Scaling uses the following formula to calculate a value, and then rounds the value to the nearest integer to obtain the number of ECS instances that need to be scaled: Value of TotalCapacity × Value of AdjustmentValue/100.
     * *   If the cooldown time is specified in a scaling rule, the specified time applies to the scaling group after the rule is executed. Otherwise, the value of the DefaultCooldown parameter of the scaling group applies to the scaling group.
     * *   You can create only a limited number of scaling rules for a scaling group. For more information, see the "Limits" topic.
     * *   The unique identifier (ScalingRuleAri) of a scaling rule can be used by the following operations:
     *     *   ExecuteScalingRule: You can call this operation to manually execute a specific scaling rule by setting the ScalingRuleAri parameter to the unique identifier of the scaling rule.
     *     *   CreateScheduledTask: You can call this operation to create a scheduled task for a specific scaling rule by setting the ScheduledAction parameter to the unique identifier of the scaling rule.
     *
     * @param request CreateScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScalingRuleResponse
     */
    public CreateScalingRuleResponse createScalingRuleWithOptions(CreateScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentType)) {
            query.put("AdjustmentType", request.adjustmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentValue)) {
            query.put("AdjustmentValue", request.adjustmentValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmDimensions)) {
            query.put("AlarmDimensions", request.alarmDimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cooldown)) {
            query.put("Cooldown", request.cooldown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableScaleIn)) {
            query.put("DisableScaleIn", request.disableScaleIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.estimatedInstanceWarmup)) {
            query.put("EstimatedInstanceWarmup", request.estimatedInstanceWarmup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialMaxSize)) {
            query.put("InitialMaxSize", request.initialMaxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAdjustmentMagnitude)) {
            query.put("MinAdjustmentMagnitude", request.minAdjustmentMagnitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveScalingMode)) {
            query.put("PredictiveScalingMode", request.predictiveScalingMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveTaskBufferTime)) {
            query.put("PredictiveTaskBufferTime", request.predictiveTaskBufferTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveValueBehavior)) {
            query.put("PredictiveValueBehavior", request.predictiveValueBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveValueBuffer)) {
            query.put("PredictiveValueBuffer", request.predictiveValueBuffer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleInEvaluationCount)) {
            query.put("ScaleInEvaluationCount", request.scaleInEvaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleOutEvaluationCount)) {
            query.put("ScaleOutEvaluationCount", request.scaleOutEvaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleType)) {
            query.put("ScalingRuleType", request.scalingRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stepAdjustments)) {
            query.put("StepAdjustments", request.stepAdjustments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScalingRule"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScalingRuleResponse());
    }

    /**
     * @summary Creates a scaling rule.
     *
     * @description ## Description
     * A scaling rule defines a specific scaling activity, such as adding or removing N instances. If the number of Elastic Compute Service (ECS) instances in a scaling group is less than the minimum number allowed or greater than the maximum number allowed after a scaling rule is executed, Auto Scaling adjusts the number of ECS instances that you want to add or remove. This way, the number of ECS instances can be maintained within the valid range after the scaling rule is executed. The number of ECS instances that is specified in the scaling rule remains unchanged. Example:
     * *   If your scaling group contains two ECS instances and allows up to three ECS instances, only one ECS instance is added to your scaling group after you execute a scale-out rule in which three ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
     * *   If your scaling group contains three ECS instances and requires at least two ECS instances, only one ECS instance is removed from your scaling group after you execute a scale-in rule in which five ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
     * Before you call this operation, take note of the following items:
     * *   If you set the AdjustmentType parameter to TotalCapacity, the number of ECS instances in the scaling group is adjusted to the specified value. The value of the AdjustmentValue parameter must be greater than or equal to 0.
     * *   If you set the AdjustmentType parameter to QuantityChangeInCapacity or PercentChangeInCapacity, a positive value of AdjustmentValue specifies the number of ECS instances that are added to the scaling group, and a negative value of AdjustmentValue specifies the number of ECS instances that are removed from the scaling group.
     * *   If you set the AdjustmentType parameter to PercentChangeInCapacity, Auto Scaling uses the following formula to calculate a value, and then rounds the value to the nearest integer to obtain the number of ECS instances that need to be scaled: Value of TotalCapacity × Value of AdjustmentValue/100.
     * *   If the cooldown time is specified in a scaling rule, the specified time applies to the scaling group after the rule is executed. Otherwise, the value of the DefaultCooldown parameter of the scaling group applies to the scaling group.
     * *   You can create only a limited number of scaling rules for a scaling group. For more information, see the "Limits" topic.
     * *   The unique identifier (ScalingRuleAri) of a scaling rule can be used by the following operations:
     *     *   ExecuteScalingRule: You can call this operation to manually execute a specific scaling rule by setting the ScalingRuleAri parameter to the unique identifier of the scaling rule.
     *     *   CreateScheduledTask: You can call this operation to create a scheduled task for a specific scaling rule by setting the ScheduledAction parameter to the unique identifier of the scaling rule.
     *
     * @param request CreateScalingRuleRequest
     * @return CreateScalingRuleResponse
     */
    public CreateScalingRuleResponse createScalingRule(CreateScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScalingRuleWithOptions(request, runtime);
    }

    /**
     * @summary Creates a scheduled task. A scheduled task is a type of scaling task that enables automatic execution of a specific scaling rule at a specified point in time. You can call the CreateScheduledTask operation to create a scheduled task to implement automatic scaling of computing resources. This ensures your business continuity and minimizes resource costs.
     *
     * @description *   If a scheduled task fails to trigger a scaling activity due to an ongoing scaling activity in a scaling group or because the scaling group is disabled, the scheduled task is automatically retried during the period that is specified by the LaunchExpirationTime parameter. If the scheduled task still fails to trigger a scaling activity after the period ends, the task is automatically skipped.
     * *   If multiple tasks are scheduled at similar points in time to trigger scaling activities in the same scaling group, the earliest task triggers the scaling activity first. Other tasks trigger scaling activities within their launch expiration time. Only one scaling activity can be triggered in a scaling group at a time.`` If the previous scaling activity is complete and another scheduled task attempts to trigger a scaling activity, Auto Scaling executes the scaling rule that is specified in the scheduled task and then triggers a scaling activity.``
     * *   A scheduled task supports the following scaling methods:
     *     *   `ScheduledAction`: Specify an existing scaling rule that you want Auto Scaling to execute when the scheduled task is triggered.
     *     *   `ScalingGroupId`: Specify the minimum number, maximum number, or expected number of instances for the scaling group for which you created the scheduled task.
     * > You cannot specify the `ScheduledAction` and ScalingGroupId parameters at the same time.
     *
     * @param request CreateScheduledTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTaskWithOptions(CreateScheduledTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchExpirationTime)) {
            query.put("LaunchExpirationTime", request.launchExpirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTime)) {
            query.put("LaunchTime", request.launchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxValue)) {
            query.put("MaxValue", request.maxValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minValue)) {
            query.put("MinValue", request.minValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceEndTime)) {
            query.put("RecurrenceEndTime", request.recurrenceEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceType)) {
            query.put("RecurrenceType", request.recurrenceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceValue)) {
            query.put("RecurrenceValue", request.recurrenceValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledAction)) {
            query.put("ScheduledAction", request.scheduledAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskName)) {
            query.put("ScheduledTaskName", request.scheduledTaskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskEnabled)) {
            query.put("TaskEnabled", request.taskEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledTask"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledTaskResponse());
    }

    /**
     * @summary Creates a scheduled task. A scheduled task is a type of scaling task that enables automatic execution of a specific scaling rule at a specified point in time. You can call the CreateScheduledTask operation to create a scheduled task to implement automatic scaling of computing resources. This ensures your business continuity and minimizes resource costs.
     *
     * @description *   If a scheduled task fails to trigger a scaling activity due to an ongoing scaling activity in a scaling group or because the scaling group is disabled, the scheduled task is automatically retried during the period that is specified by the LaunchExpirationTime parameter. If the scheduled task still fails to trigger a scaling activity after the period ends, the task is automatically skipped.
     * *   If multiple tasks are scheduled at similar points in time to trigger scaling activities in the same scaling group, the earliest task triggers the scaling activity first. Other tasks trigger scaling activities within their launch expiration time. Only one scaling activity can be triggered in a scaling group at a time.`` If the previous scaling activity is complete and another scheduled task attempts to trigger a scaling activity, Auto Scaling executes the scaling rule that is specified in the scheduled task and then triggers a scaling activity.``
     * *   A scheduled task supports the following scaling methods:
     *     *   `ScheduledAction`: Specify an existing scaling rule that you want Auto Scaling to execute when the scheduled task is triggered.
     *     *   `ScalingGroupId`: Specify the minimum number, maximum number, or expected number of instances for the scaling group for which you created the scheduled task.
     * > You cannot specify the `ScheduledAction` and ScalingGroupId parameters at the same time.
     *
     * @param request CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledTaskWithOptions(request, runtime);
    }

    /**
     * @summary Deactivates a scaling configuration.
     *
     * @description *   You can call this operation to deactivate a scaling configuration only in a disabled scaling group.
     *
     * @param request DeactivateScalingConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeactivateScalingConfigurationResponse
     */
    public DeactivateScalingConfigurationResponse deactivateScalingConfigurationWithOptions(DeactivateScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactivateScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactivateScalingConfigurationResponse());
    }

    /**
     * @summary Deactivates a scaling configuration.
     *
     * @description *   You can call this operation to deactivate a scaling configuration only in a disabled scaling group.
     *
     * @param request DeactivateScalingConfigurationRequest
     * @return DeactivateScalingConfigurationResponse
     */
    public DeactivateScalingConfigurationResponse deactivateScalingConfiguration(DeactivateScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactivateScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you no longer need an event-triggered task, you can call the DeleteAlarm operation to delete it.
     *
     * @param request DeleteAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlarmResponse
     */
    public DeleteAlarmResponse deleteAlarmWithOptions(DeleteAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlarmResponse());
    }

    /**
     * @summary Deletes an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you no longer need an event-triggered task, you can call the DeleteAlarm operation to delete it.
     *
     * @param request DeleteAlarmRequest
     * @return DeleteAlarmResponse
     */
    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlarmWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a scaling configuration of the Elastic Container Instance type. If the scaling configuration of a scaling group is in the Inactive state and the scaling group contains no elastic container instances created from the scaling configuration, you can call the DeleteEciScalingConfiguration operation to delete the scaling configuration to free up the scaling configuration quota.
     *
     * @description You cannot call this operation to delete a scaling configuration in the following scenarios:
     * *   The scaling configuration is in the Active state.
     * *   The scaling group contains elastic container instances created from the scaling configuration.
     *
     * @param request DeleteEciScalingConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEciScalingConfigurationResponse
     */
    public DeleteEciScalingConfigurationResponse deleteEciScalingConfigurationWithOptions(DeleteEciScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEciScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEciScalingConfigurationResponse());
    }

    /**
     * @summary Deletes a scaling configuration of the Elastic Container Instance type. If the scaling configuration of a scaling group is in the Inactive state and the scaling group contains no elastic container instances created from the scaling configuration, you can call the DeleteEciScalingConfiguration operation to delete the scaling configuration to free up the scaling configuration quota.
     *
     * @description You cannot call this operation to delete a scaling configuration in the following scenarios:
     * *   The scaling configuration is in the Active state.
     * *   The scaling group contains elastic container instances created from the scaling configuration.
     *
     * @param request DeleteEciScalingConfigurationRequest
     * @return DeleteEciScalingConfigurationResponse
     */
    public DeleteEciScalingConfigurationResponse deleteEciScalingConfiguration(DeleteEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEciScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a lifecycle hook.
     *
     * @description If you delete a lifecycle hook that is in effect in a scaling group, instances exit the Pending state in advance. You can use one of the following methods to specify the lifecycle hooks that you want to delete:
     * *   Specify the scaling group ID of the lifecycle hook that you want to delete by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter.
     * *   Specify the lifecycle hook ID by using the LifecycleHookId parameter. In this case, the ScalingGroupId parameter and the LifecycleHookName parameter are ignored.
     *
     * @param request DeleteLifecycleHookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLifecycleHookResponse
     */
    public DeleteLifecycleHookResponse deleteLifecycleHookWithOptions(DeleteLifecycleHookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookId)) {
            query.put("LifecycleHookId", request.lifecycleHookId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookName)) {
            query.put("LifecycleHookName", request.lifecycleHookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLifecycleHook"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLifecycleHookResponse());
    }

    /**
     * @summary Deletes a lifecycle hook.
     *
     * @description If you delete a lifecycle hook that is in effect in a scaling group, instances exit the Pending state in advance. You can use one of the following methods to specify the lifecycle hooks that you want to delete:
     * *   Specify the scaling group ID of the lifecycle hook that you want to delete by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter.
     * *   Specify the lifecycle hook ID by using the LifecycleHookId parameter. In this case, the ScalingGroupId parameter and the LifecycleHookName parameter are ignored.
     *
     * @param request DeleteLifecycleHookRequest
     * @return DeleteLifecycleHookResponse
     */
    public DeleteLifecycleHookResponse deleteLifecycleHook(DeleteLifecycleHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLifecycleHookWithOptions(request, runtime);
    }

    /**
     * @summary Deletes event notification rules. The event notification feature facilitates efficient issue identification and event management by automatically forwarding notifications from Auto Scaling to designated endpoints such as CloudMonitor or Message Service (MNS) topics and queues. If you no longer require an event notification rule, you can call the DeleteNotificationConfiguration operation to delete it.
     *
     * @param request DeleteNotificationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNotificationConfigurationResponse
     */
    public DeleteNotificationConfigurationResponse deleteNotificationConfigurationWithOptions(DeleteNotificationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNotificationConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNotificationConfigurationResponse());
    }

    /**
     * @summary Deletes event notification rules. The event notification feature facilitates efficient issue identification and event management by automatically forwarding notifications from Auto Scaling to designated endpoints such as CloudMonitor or Message Service (MNS) topics and queues. If you no longer require an event notification rule, you can call the DeleteNotificationConfiguration operation to delete it.
     *
     * @param request DeleteNotificationConfigurationRequest
     * @return DeleteNotificationConfigurationResponse
     */
    public DeleteNotificationConfigurationResponse deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNotificationConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a scaling configuration that is used to create Elastic Compute Service (ECS) instances.
     *
     * @description You cannot delete a scaling configuration in one of the following scenarios:
     * *   The scaling configuration in your scaling group is in the Active state.
     * *   The scaling group contains ECS instances that were created based on the scaling configuration.
     *
     * @param request DeleteScalingConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScalingConfigurationResponse
     */
    public DeleteScalingConfigurationResponse deleteScalingConfigurationWithOptions(DeleteScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScalingConfigurationResponse());
    }

    /**
     * @summary Deletes a scaling configuration that is used to create Elastic Compute Service (ECS) instances.
     *
     * @description You cannot delete a scaling configuration in one of the following scenarios:
     * *   The scaling configuration in your scaling group is in the Active state.
     * *   The scaling group contains ECS instances that were created based on the scaling configuration.
     *
     * @param request DeleteScalingConfigurationRequest
     * @return DeleteScalingConfigurationResponse
     */
    public DeleteScalingConfigurationResponse deleteScalingConfiguration(DeleteScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a scaling group. If you want to enable policy-based automatic addition or removal of instances of a specific type to meet evolving business requirements, you can create scaling groups to manage your computing power with ease. The computing power refers to the instances that provide the computing capability. If you no longer require a scaling group, you can call the DeleteScalingGroup operation to delete it to free up the scaling group quota.
     *
     * @description Before you call the DeleteScalingGroup operation, take note of the following items:
     * *   If you delete a scaling group, the scaling configurations, scaling rules, scaling activities, and scaling requests related to the scaling group are also deleted.
     * *   If you delete a scaling group, the scheduled tasks and event-triggered tasks of the scaling group are not deleted. The Server Load Balancer (SLB) instances and ApsaraDB RDS instances that are attached to the scaling group are also not deleted.
     * *   If the scaling group that you want to delete contains ECS instances or elastic container instances that are in the In Service state, Auto Scaling stops the instances and then removes all manually added instances from the scaling group or releases all automatically created instances in the scaling group before the scaling group is deleted.
     *     **
     *     **Note** Before you delete a scaling group, make sure that the Deletion Protection feature is disabled. If you have enabled the Deletion Protection feature for a scaling group, disable the feature on the Modify Scaling Group page before you delete the scaling group.
     * *   If you do not disable the Deletion Protection feature for a scaling group, you cannot delete the scaling group by using the Auto Scaling console or calling this operation. The Deletion Protection feature is an effective measure to safeguard scaling groups against unintended deletion.
     * *   Prior to deleting a scaling group, make sure that your ECS instances within the scaling group are safeguarded against unintended release. Even if you have already enabled the Release Protection feature for the ECS instances, you must manually put these ECS instances into the Protected state. Doing so guarantees that the ECS instances will not be forcibly released during the deletion process of the scaling group, providing an extra layer of security.
     *     **
     *     **Note** Before you delete a scaling group, we recommend that you enable the Deletion Protection feature for ECS instances that you want to retain. This action guarantees that the ECS instances are not forcibly released after you delete the scaling group. For more information, see [SetInstancesProtection](https://help.aliyun.com/document_detail/459342.html).
     *
     * @param request DeleteScalingGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScalingGroupResponse
     */
    public DeleteScalingGroupResponse deleteScalingGroupWithOptions(DeleteScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDelete)) {
            query.put("ForceDelete", request.forceDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScalingGroupResponse());
    }

    /**
     * @summary Deletes a scaling group. If you want to enable policy-based automatic addition or removal of instances of a specific type to meet evolving business requirements, you can create scaling groups to manage your computing power with ease. The computing power refers to the instances that provide the computing capability. If you no longer require a scaling group, you can call the DeleteScalingGroup operation to delete it to free up the scaling group quota.
     *
     * @description Before you call the DeleteScalingGroup operation, take note of the following items:
     * *   If you delete a scaling group, the scaling configurations, scaling rules, scaling activities, and scaling requests related to the scaling group are also deleted.
     * *   If you delete a scaling group, the scheduled tasks and event-triggered tasks of the scaling group are not deleted. The Server Load Balancer (SLB) instances and ApsaraDB RDS instances that are attached to the scaling group are also not deleted.
     * *   If the scaling group that you want to delete contains ECS instances or elastic container instances that are in the In Service state, Auto Scaling stops the instances and then removes all manually added instances from the scaling group or releases all automatically created instances in the scaling group before the scaling group is deleted.
     *     **
     *     **Note** Before you delete a scaling group, make sure that the Deletion Protection feature is disabled. If you have enabled the Deletion Protection feature for a scaling group, disable the feature on the Modify Scaling Group page before you delete the scaling group.
     * *   If you do not disable the Deletion Protection feature for a scaling group, you cannot delete the scaling group by using the Auto Scaling console or calling this operation. The Deletion Protection feature is an effective measure to safeguard scaling groups against unintended deletion.
     * *   Prior to deleting a scaling group, make sure that your ECS instances within the scaling group are safeguarded against unintended release. Even if you have already enabled the Release Protection feature for the ECS instances, you must manually put these ECS instances into the Protected state. Doing so guarantees that the ECS instances will not be forcibly released during the deletion process of the scaling group, providing an extra layer of security.
     *     **
     *     **Note** Before you delete a scaling group, we recommend that you enable the Deletion Protection feature for ECS instances that you want to retain. This action guarantees that the ECS instances are not forcibly released after you delete the scaling group. For more information, see [SetInstancesProtection](https://help.aliyun.com/document_detail/459342.html).
     *
     * @param request DeleteScalingGroupRequest
     * @return DeleteScalingGroupResponse
     */
    public DeleteScalingGroupResponse deleteScalingGroup(DeleteScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScalingGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a scaling rule.
     *
     * @param request DeleteScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScalingRuleResponse
     */
    public DeleteScalingRuleResponse deleteScalingRuleWithOptions(DeleteScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleId)) {
            query.put("ScalingRuleId", request.scalingRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScalingRule"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScalingRuleResponse());
    }

    /**
     * @summary Deletes a scaling rule.
     *
     * @param request DeleteScalingRuleRequest
     * @return DeleteScalingRuleResponse
     */
    public DeleteScalingRuleResponse deleteScalingRule(DeleteScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScalingRuleWithOptions(request, runtime);
    }

    /**
     * @summary Deletes scheduled tasks. For workloads with predictable patterns, you can create scheduled tasks to align with your business requirements and optimize resource utilization for cost savings. These tasks automatically ensure that sufficient computing resources are provisioned in anticipation of peak hours and efficiently release unused resources during off-peak hours, thereby streamlining operational efficiency and reducing expenses. If you no longer require a scheduled task, you can call the DeleteScheduledTask operation to delete it.
     *
     * @param request DeleteScheduledTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduledTaskResponse
     */
    public DeleteScheduledTaskResponse deleteScheduledTaskWithOptions(DeleteScheduledTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskId)) {
            query.put("ScheduledTaskId", request.scheduledTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheduledTask"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduledTaskResponse());
    }

    /**
     * @summary Deletes scheduled tasks. For workloads with predictable patterns, you can create scheduled tasks to align with your business requirements and optimize resource utilization for cost savings. These tasks automatically ensure that sufficient computing resources are provisioned in anticipation of peak hours and efficiently release unused resources during off-peak hours, thereby streamlining operational efficiency and reducing expenses. If you no longer require a scheduled task, you can call the DeleteScheduledTask operation to delete it.
     *
     * @param request DeleteScheduledTaskRequest
     * @return DeleteScheduledTaskResponse
     */
    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduledTaskWithOptions(request, runtime);
    }

    /**
     * @summary Queries event-triggered tasks.
     *
     * @param request DescribeAlarmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlarmsResponse
     */
    public DescribeAlarmsResponse describeAlarmsWithOptions(DescribeAlarmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnable)) {
            query.put("IsEnable", request.isEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlarms"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlarmsResponse());
    }

    /**
     * @summary Queries event-triggered tasks.
     *
     * @param request DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     */
    public DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlarmsWithOptions(request, runtime);
    }

    /**
     * @summary Queries scaling configurations of the Elastic Container Instance type to learn the scaling configuration details. This allows you to select an appropriate template when you create elastic container instances. If you set OutputFormat to yaml, the output is a Kubernetes Deployment file in the YAML format.
     *
     * @param request DescribeEciScalingConfigurationDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEciScalingConfigurationDetailResponse
     */
    public DescribeEciScalingConfigurationDetailResponse describeEciScalingConfigurationDetailWithOptions(DescribeEciScalingConfigurationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            query.put("OutputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEciScalingConfigurationDetail"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEciScalingConfigurationDetailResponse());
    }

    /**
     * @summary Queries scaling configurations of the Elastic Container Instance type to learn the scaling configuration details. This allows you to select an appropriate template when you create elastic container instances. If you set OutputFormat to yaml, the output is a Kubernetes Deployment file in the YAML format.
     *
     * @param request DescribeEciScalingConfigurationDetailRequest
     * @return DescribeEciScalingConfigurationDetailResponse
     */
    public DescribeEciScalingConfigurationDetailResponse describeEciScalingConfigurationDetail(DescribeEciScalingConfigurationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEciScalingConfigurationDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries scaling configurations of the Elastic Container Instance type to learn the scaling configuration details. This allows you to select an appropriate template when you create elastic container instances.
     *
     * @param request DescribeEciScalingConfigurationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEciScalingConfigurationsResponse
     */
    public DescribeEciScalingConfigurationsResponse describeEciScalingConfigurationsWithOptions(DescribeEciScalingConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationIds)) {
            query.put("ScalingConfigurationIds", request.scalingConfigurationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationNames)) {
            query.put("ScalingConfigurationNames", request.scalingConfigurationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEciScalingConfigurations"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEciScalingConfigurationsResponse());
    }

    /**
     * @summary Queries scaling configurations of the Elastic Container Instance type to learn the scaling configuration details. This allows you to select an appropriate template when you create elastic container instances.
     *
     * @param request DescribeEciScalingConfigurationsRequest
     * @return DescribeEciScalingConfigurationsResponse
     */
    public DescribeEciScalingConfigurationsResponse describeEciScalingConfigurations(DescribeEciScalingConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEciScalingConfigurationsWithOptions(request, runtime);
    }

    /**
     * @summary Queries lifecycle actions.
     *
     * @description If a scaling activity is executed and a lifecycle hook is created for the scaling activity, the lifecycle hook triggers a lifecycle action. A lifecycle action can be in one of the following states:
     * *   If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.
     * *   If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action expires and ECS instances are added to or removed from a scaling group.
     * *   If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.
     * If you do not specify the action to perform, such as execute a specific OOS template, after a lifecycle hook ends, you can call this operation to obtain the token of the lifecycle action that corresponds to the lifecycle hook. Then, you can specify a custom action to perform after the lifecycle hook ends.
     *
     * @param request DescribeLifecycleActionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLifecycleActionsResponse
     */
    public DescribeLifecycleActionsResponse describeLifecycleActionsWithOptions(DescribeLifecycleActionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionStatus)) {
            query.put("LifecycleActionStatus", request.lifecycleActionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityId)) {
            query.put("ScalingActivityId", request.scalingActivityId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLifecycleActions"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLifecycleActionsResponse());
    }

    /**
     * @summary Queries lifecycle actions.
     *
     * @description If a scaling activity is executed and a lifecycle hook is created for the scaling activity, the lifecycle hook triggers a lifecycle action. A lifecycle action can be in one of the following states:
     * *   If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.
     * *   If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action expires and ECS instances are added to or removed from a scaling group.
     * *   If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.
     * If you do not specify the action to perform, such as execute a specific OOS template, after a lifecycle hook ends, you can call this operation to obtain the token of the lifecycle action that corresponds to the lifecycle hook. Then, you can specify a custom action to perform after the lifecycle hook ends.
     *
     * @param request DescribeLifecycleActionsRequest
     * @return DescribeLifecycleActionsResponse
     */
    public DescribeLifecycleActionsResponse describeLifecycleActions(DescribeLifecycleActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecycleActionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries lifecycle hooks.
     *
     * @description You can use one of the following methods to query lifecycle hooks:
     * *   Specify a list of lifecycle hook IDs by using the LifecycleHookIds parameter. In this case, you do not need to specify the ScalingGroupId and LifecycleHookName parameters.
     * *   Specify the scaling group ID by using the ScalingGroupId parameter.
     * *   Specify the scaling group ID by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter at the same time.
     *
     * @param request DescribeLifecycleHooksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLifecycleHooksResponse
     */
    public DescribeLifecycleHooksResponse describeLifecycleHooksWithOptions(DescribeLifecycleHooksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookIds)) {
            query.put("LifecycleHookIds", request.lifecycleHookIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookName)) {
            query.put("LifecycleHookName", request.lifecycleHookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLifecycleHooks"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLifecycleHooksResponse());
    }

    /**
     * @summary Queries lifecycle hooks.
     *
     * @description You can use one of the following methods to query lifecycle hooks:
     * *   Specify a list of lifecycle hook IDs by using the LifecycleHookIds parameter. In this case, you do not need to specify the ScalingGroupId and LifecycleHookName parameters.
     * *   Specify the scaling group ID by using the ScalingGroupId parameter.
     * *   Specify the scaling group ID by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter at the same time.
     *
     * @param request DescribeLifecycleHooksRequest
     * @return DescribeLifecycleHooksResponse
     */
    public DescribeLifecycleHooksResponse describeLifecycleHooks(DescribeLifecycleHooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecycleHooksWithOptions(request, runtime);
    }

    /**
     * @summary Queries resource quotas. You can call the DescribeLimitation operation to query the upper limits on resources such as scheduled tasks that can be created in a scaling group, load balancers that can be attached to a scaling group, instances that can be contained in a scaling group, and scaling configurations that can be created in a scaling group.
     *
     * @param request DescribeLimitationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLimitationResponse
     */
    public DescribeLimitationResponse describeLimitationWithOptions(DescribeLimitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLimitation"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLimitationResponse());
    }

    /**
     * @summary Queries resource quotas. You can call the DescribeLimitation operation to query the upper limits on resources such as scheduled tasks that can be created in a scaling group, load balancers that can be attached to a scaling group, instances that can be contained in a scaling group, and scaling configurations that can be created in a scaling group.
     *
     * @param request DescribeLimitationRequest
     * @return DescribeLimitationResponse
     */
    public DescribeLimitationResponse describeLimitation(DescribeLimitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLimitationWithOptions(request, runtime);
    }

    /**
     * @summary Queries event notifications.
     *
     * @param request DescribeNotificationConfigurationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNotificationConfigurationsResponse
     */
    public DescribeNotificationConfigurationsResponse describeNotificationConfigurationsWithOptions(DescribeNotificationConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNotificationConfigurations"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNotificationConfigurationsResponse());
    }

    /**
     * @summary Queries event notifications.
     *
     * @param request DescribeNotificationConfigurationsRequest
     * @return DescribeNotificationConfigurationsResponse
     */
    public DescribeNotificationConfigurationsResponse describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNotificationConfigurationsWithOptions(request, runtime);
    }

    /**
     * @summary Queries notification types.
     *
     * @param request DescribeNotificationTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNotificationTypesResponse
     */
    public DescribeNotificationTypesResponse describeNotificationTypesWithOptions(DescribeNotificationTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNotificationTypes"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNotificationTypesResponse());
    }

    /**
     * @summary Queries notification types.
     *
     * @param request DescribeNotificationTypesRequest
     * @return DescribeNotificationTypesResponse
     */
    public DescribeNotificationTypesResponse describeNotificationTypes(DescribeNotificationTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNotificationTypesWithOptions(request, runtime);
    }

    /**
     * @summary DescribePatternTypes
     *
     * @param request DescribePatternTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePatternTypesResponse
     */
    public DescribePatternTypesResponse describePatternTypesWithOptions(DescribePatternTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePatternTypes"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePatternTypesResponse());
    }

    /**
     * @summary DescribePatternTypes
     *
     * @param request DescribePatternTypesRequest
     * @return DescribePatternTypesResponse
     */
    public DescribePatternTypesResponse describePatternTypes(DescribePatternTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePatternTypesWithOptions(request, runtime);
    }

    /**
     * @summary Queries regions. Before you activate Auto Scaling, you can call the DescribeRegions operation to query the regions where Auto Scaling is officially launched. This preliminary step facilitates the strategic selection of both the optimal region and availability zones for activating Auto Scaling, thereby guaranteeing the finest access speeds and operational efficiency within your chosen geographical area.
     *
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2022-02-22"),
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

    /**
     * @summary Queries regions. Before you activate Auto Scaling, you can call the DescribeRegions operation to query the regions where Auto Scaling is officially launched. This preliminary step facilitates the strategic selection of both the optimal region and availability zones for activating Auto Scaling, thereby guaranteeing the finest access speeds and operational efficiency within your chosen geographical area.
     *
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries scaling activities.
     *
     * @description You can specify a scaling group ID to query all scaling activities in the scaling group.
     * You can filter query results based on the status of scaling activities.
     * You can query scaling activities that are executed in the previous 30 days.
     *
     * @param request DescribeScalingActivitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingActivitiesResponse
     */
    public DescribeScalingActivitiesResponse describeScalingActivitiesWithOptions(DescribeScalingActivitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityIds)) {
            query.put("ScalingActivityIds", request.scalingActivityIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCode)) {
            query.put("StatusCode", request.statusCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingActivities"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingActivitiesResponse());
    }

    /**
     * @summary Queries scaling activities.
     *
     * @description You can specify a scaling group ID to query all scaling activities in the scaling group.
     * You can filter query results based on the status of scaling activities.
     * You can query scaling activities that are executed in the previous 30 days.
     *
     * @param request DescribeScalingActivitiesRequest
     * @return DescribeScalingActivitiesResponse
     */
    public DescribeScalingActivitiesResponse describeScalingActivities(DescribeScalingActivitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingActivitiesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details about a scaling activity.
     *
     * @param request DescribeScalingActivityDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingActivityDetailResponse
     */
    public DescribeScalingActivityDetailResponse describeScalingActivityDetailWithOptions(DescribeScalingActivityDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityId)) {
            query.put("ScalingActivityId", request.scalingActivityId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingActivityDetail"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingActivityDetailResponse());
    }

    /**
     * @summary Queries the details about a scaling activity.
     *
     * @param request DescribeScalingActivityDetailRequest
     * @return DescribeScalingActivityDetailResponse
     */
    public DescribeScalingActivityDetailResponse describeScalingActivityDetail(DescribeScalingActivityDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingActivityDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries scaling configurations.
     *
     * @param request DescribeScalingConfigurationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingConfigurationsResponse
     */
    public DescribeScalingConfigurationsResponse describeScalingConfigurationsWithOptions(DescribeScalingConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationIds)) {
            query.put("ScalingConfigurationIds", request.scalingConfigurationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationNames)) {
            query.put("ScalingConfigurationNames", request.scalingConfigurationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingConfigurations"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingConfigurationsResponse());
    }

    /**
     * @summary Queries scaling configurations.
     *
     * @param request DescribeScalingConfigurationsRequest
     * @return DescribeScalingConfigurationsResponse
     */
    public DescribeScalingConfigurationsResponse describeScalingConfigurations(DescribeScalingConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingConfigurationsWithOptions(request, runtime);
    }

    /**
     * @summary Queries a scaling group. You can call the DescribeScalingGroupDetail operation to query the basic information, instances, and scaling configurations of a scaling group. If you set OutputFormat to yaml, a Kubernetes Deployment file that is in the YAML format is returned.
     *
     * @param request DescribeScalingGroupDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingGroupDetailResponse
     */
    public DescribeScalingGroupDetailResponse describeScalingGroupDetailWithOptions(DescribeScalingGroupDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            query.put("OutputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingGroupDetail"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingGroupDetailResponse());
    }

    /**
     * @summary Queries a scaling group. You can call the DescribeScalingGroupDetail operation to query the basic information, instances, and scaling configurations of a scaling group. If you set OutputFormat to yaml, a Kubernetes Deployment file that is in the YAML format is returned.
     *
     * @param request DescribeScalingGroupDetailRequest
     * @return DescribeScalingGroupDetailResponse
     */
    public DescribeScalingGroupDetailResponse describeScalingGroupDetail(DescribeScalingGroupDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingGroupDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries scaling groups. If you want to query the basic information, instances, and scaling configurations of a scaling group, you can call the DescribeScalingGroups operation.
     *
     * @param request DescribeScalingGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingGroupsResponse
     */
    public DescribeScalingGroupsResponse describeScalingGroupsWithOptions(DescribeScalingGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupIds)) {
            query.put("ScalingGroupIds", request.scalingGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupName)) {
            query.put("ScalingGroupName", request.scalingGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupNames)) {
            query.put("ScalingGroupNames", request.scalingGroupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingGroupsResponse());
    }

    /**
     * @summary Queries scaling groups. If you want to query the basic information, instances, and scaling configurations of a scaling group, you can call the DescribeScalingGroups operation.
     *
     * @param request DescribeScalingGroupsRequest
     * @return DescribeScalingGroupsResponse
     */
    public DescribeScalingGroupsResponse describeScalingGroups(DescribeScalingGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the Elastic Compute Service (ECS) instances in a scaling group
     *
     * @param request DescribeScalingInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingInstancesResponse
     */
    public DescribeScalingInstancesResponse describeScalingInstancesWithOptions(DescribeScalingInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creationType)) {
            query.put("CreationType", request.creationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creationTypes)) {
            query.put("CreationTypes", request.creationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthStatus)) {
            query.put("HealthStatus", request.healthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleState)) {
            query.put("LifecycleState", request.lifecycleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleStates)) {
            query.put("LifecycleStates", request.lifecycleStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityId)) {
            query.put("ScalingActivityId", request.scalingActivityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingInstancesResponse());
    }

    /**
     * @summary Queries the Elastic Compute Service (ECS) instances in a scaling group
     *
     * @param request DescribeScalingInstancesRequest
     * @return DescribeScalingInstancesResponse
     */
    public DescribeScalingInstancesResponse describeScalingInstances(DescribeScalingInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Queries all scaling rules in a scaling group.
     *
     * @description You can specify a scaling group ID to query all scaling rules in the scaling group. You can also specify the scaling rule ID, name, unique identifier, and type in the request parameters as filter conditions.
     *
     * @param request DescribeScalingRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingRulesResponse
     */
    public DescribeScalingRulesResponse describeScalingRulesWithOptions(DescribeScalingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleAris)) {
            query.put("ScalingRuleAris", request.scalingRuleAris);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleIds)) {
            query.put("ScalingRuleIds", request.scalingRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleNames)) {
            query.put("ScalingRuleNames", request.scalingRuleNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleType)) {
            query.put("ScalingRuleType", request.scalingRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showAlarmRules)) {
            query.put("ShowAlarmRules", request.showAlarmRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingRules"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingRulesResponse());
    }

    /**
     * @summary Queries all scaling rules in a scaling group.
     *
     * @description You can specify a scaling group ID to query all scaling rules in the scaling group. You can also specify the scaling rule ID, name, unique identifier, and type in the request parameters as filter conditions.
     *
     * @param request DescribeScalingRulesRequest
     * @return DescribeScalingRulesResponse
     */
    public DescribeScalingRulesResponse describeScalingRules(DescribeScalingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingRulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries scheduled tasks.
     *
     * @description You can query scheduled tasks by scaling rule, task ID, or task name.
     *
     * @param request DescribeScheduledTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScheduledTasksResponse
     */
    public DescribeScheduledTasksResponse describeScheduledTasksWithOptions(DescribeScheduledTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledActions)) {
            query.put("ScheduledActions", request.scheduledActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskIds)) {
            query.put("ScheduledTaskIds", request.scheduledTaskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskNames)) {
            query.put("ScheduledTaskNames", request.scheduledTaskNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScheduledTasks"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScheduledTasksResponse());
    }

    /**
     * @summary Queries scheduled tasks.
     *
     * @description You can query scheduled tasks by scaling rule, task ID, or task name.
     *
     * @param request DescribeScheduledTasksRequest
     * @return DescribeScheduledTasksResponse
     */
    public DescribeScheduledTasksResponse describeScheduledTasks(DescribeScheduledTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScheduledTasksWithOptions(request, runtime);
    }

    /**
     * @summary Disassociates one or more Application Load Balancer (ALB) server groups from a scaling group.
     *
     * @param request DetachAlbServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachAlbServerGroupsResponse
     */
    public DetachAlbServerGroupsResponse detachAlbServerGroupsWithOptions(DetachAlbServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albServerGroups)) {
            query.put("AlbServerGroups", request.albServerGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachAlbServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachAlbServerGroupsResponse());
    }

    /**
     * @summary Disassociates one or more Application Load Balancer (ALB) server groups from a scaling group.
     *
     * @param request DetachAlbServerGroupsRequest
     * @return DetachAlbServerGroupsResponse
     */
    public DetachAlbServerGroupsResponse detachAlbServerGroups(DetachAlbServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachAlbServerGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Disassociates one or more ApsaraDB RDS instances from a scaling group.
     *
     * @param request DetachDBInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachDBInstancesResponse
     */
    public DetachDBInstancesResponse detachDBInstancesWithOptions(DetachDBInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstances)) {
            query.put("DBInstances", request.DBInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeSecurityGroup)) {
            query.put("RemoveSecurityGroup", request.removeSecurityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDBInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDBInstancesResponse());
    }

    /**
     * @summary Disassociates one or more ApsaraDB RDS instances from a scaling group.
     *
     * @param request DetachDBInstancesRequest
     * @return DetachDBInstancesResponse
     */
    public DetachDBInstancesResponse detachDBInstances(DetachDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDBInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Removes one or more Elastic Compute Service (ECS) instances or elastic container instances from a scaling group.
     *
     * @description After ECS instances or elastic container instances are removed from a scaling group, you can call the AttachInstances operation to add the ECS instances or elastic container instances that are removed from the scaling group to other scaling groups.
     * After you remove an ECS instance or elastic container instance by calling the DetachInstances operation, the instance is not stopped or released.
     * Before you call this operation, make sure that the following conditions are met:
     * *   The specified scaling group is enabled.
     * *   No scaling activities in the specified scaling group are in progress.
     * > If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates only that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.
     * The number of ECS instances or elastic container instances in a scaling group after you remove a specific number of instances from the scaling group must be equal to or greater than the value of the MinSize parameter. Otherwise, an error is reported when you call the DetachInstances operation.
     *
     * @param request DetachInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachInstancesResponse
     */
    public DetachInstancesResponse detachInstancesWithOptions(DetachInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decreaseDesiredCapacity)) {
            query.put("DecreaseDesiredCapacity", request.decreaseDesiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detachOption)) {
            query.put("DetachOption", request.detachOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreInvalidInstance)) {
            query.put("IgnoreInvalidInstance", request.ignoreInvalidInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHook)) {
            query.put("LifecycleHook", request.lifecycleHook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachInstancesResponse());
    }

    /**
     * @summary Removes one or more Elastic Compute Service (ECS) instances or elastic container instances from a scaling group.
     *
     * @description After ECS instances or elastic container instances are removed from a scaling group, you can call the AttachInstances operation to add the ECS instances or elastic container instances that are removed from the scaling group to other scaling groups.
     * After you remove an ECS instance or elastic container instance by calling the DetachInstances operation, the instance is not stopped or released.
     * Before you call this operation, make sure that the following conditions are met:
     * *   The specified scaling group is enabled.
     * *   No scaling activities in the specified scaling group are in progress.
     * > If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates only that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.
     * The number of ECS instances or elastic container instances in a scaling group after you remove a specific number of instances from the scaling group must be equal to or greater than the value of the MinSize parameter. Otherwise, an error is reported when you call the DetachInstances operation.
     *
     * @param request DetachInstancesRequest
     * @return DetachInstancesResponse
     */
    public DetachInstancesResponse detachInstances(DetachInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Detaches one or more Classic Load Balancer (CLB) instances from a scaling group.
     *
     * @param request DetachLoadBalancersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachLoadBalancersResponse
     */
    public DetachLoadBalancersResponse detachLoadBalancersWithOptions(DetachLoadBalancersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancers)) {
            query.put("LoadBalancers", request.loadBalancers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachLoadBalancers"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachLoadBalancersResponse());
    }

    /**
     * @summary Detaches one or more Classic Load Balancer (CLB) instances from a scaling group.
     *
     * @param request DetachLoadBalancersRequest
     * @return DetachLoadBalancersResponse
     */
    public DetachLoadBalancersResponse detachLoadBalancers(DetachLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachLoadBalancersWithOptions(request, runtime);
    }

    /**
     * @summary Detaches one or more server groups from a scaling group. You can attach and detach the following server groups from a scaling group: Application Load Balancer (ALB) and Network Load Balancer (NLB) server groups.
     *
     * @param request DetachServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachServerGroupsResponse
     */
    public DetachServerGroupsResponse detachServerGroupsWithOptions(DetachServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroups)) {
            query.put("ServerGroups", request.serverGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachServerGroupsResponse());
    }

    /**
     * @summary Detaches one or more server groups from a scaling group. You can attach and detach the following server groups from a scaling group: Application Load Balancer (ALB) and Network Load Balancer (NLB) server groups.
     *
     * @param request DetachServerGroupsRequest
     * @return DetachServerGroupsResponse
     */
    public DetachServerGroupsResponse detachServerGroups(DetachServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachServerGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Detaches vServer groups from a scaling group. Auto Scaling supports the attachment of load balancers to scaling groups to improve service performance. If the load balancer currently attached to your scaling group is no longer needed to distribute the access traffic to the instances in your scaling group, you can call the DetachVServerGroups operation to detach one or more vServer groups of this load balancer from the scaling group.
     *
     * @description *   When you call the DetachVServerGroups operation, you must use the following parameters to specify the vServer groups that you want to detach from your scaling group:
     *     *   LoadBalancerId: the ID of the load balancer
     *     *   VServerGroupId: the ID of the vServer group
     *     *   Port: the port number of the vServer group
     * *   When the vServer group specified by the request parameters matches that attached to your scaling group, this operation yields a favorable result. Otherwise, the request is ignored and no error is reported.
     * *   Before you call this operation, you must make sure that the load balancer has ceased routing the access traffic to the instances in the scaling group. Failure to do so may lead to service requests being dropped or lost during the detachment process.
     *
     * @param request DetachVServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachVServerGroupsResponse
     */
    public DetachVServerGroupsResponse detachVServerGroupsWithOptions(DetachVServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroups)) {
            query.put("VServerGroups", request.VServerGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachVServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachVServerGroupsResponse());
    }

    /**
     * @summary Detaches vServer groups from a scaling group. Auto Scaling supports the attachment of load balancers to scaling groups to improve service performance. If the load balancer currently attached to your scaling group is no longer needed to distribute the access traffic to the instances in your scaling group, you can call the DetachVServerGroups operation to detach one or more vServer groups of this load balancer from the scaling group.
     *
     * @description *   When you call the DetachVServerGroups operation, you must use the following parameters to specify the vServer groups that you want to detach from your scaling group:
     *     *   LoadBalancerId: the ID of the load balancer
     *     *   VServerGroupId: the ID of the vServer group
     *     *   Port: the port number of the vServer group
     * *   When the vServer group specified by the request parameters matches that attached to your scaling group, this operation yields a favorable result. Otherwise, the request is ignored and no error is reported.
     * *   Before you call this operation, you must make sure that the load balancer has ceased routing the access traffic to the instances in the scaling group. Failure to do so may lead to service requests being dropped or lost during the detachment process.
     *
     * @param request DetachVServerGroupsRequest
     * @return DetachVServerGroupsResponse
     */
    public DetachVServerGroupsResponse detachVServerGroups(DetachVServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachVServerGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Disables an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you currently do not need an event-triggered task, you can call the DisableAlarm operation to disable it.
     *
     * @description Before you disable an event-triggered task, make sure that the task is in the `Normal`, `Alert`, or `Insufficient Data` state.
     *
     * @param request DisableAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAlarmResponse
     */
    public DisableAlarmResponse disableAlarmWithOptions(DisableAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAlarmResponse());
    }

    /**
     * @summary Disables an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you currently do not need an event-triggered task, you can call the DisableAlarm operation to disable it.
     *
     * @description Before you disable an event-triggered task, make sure that the task is in the `Normal`, `Alert`, or `Insufficient Data` state.
     *
     * @param request DisableAlarmRequest
     * @return DisableAlarmResponse
     */
    public DisableAlarmResponse disableAlarm(DisableAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAlarmWithOptions(request, runtime);
    }

    /**
     * @summary Disables a scaling group.
     *
     * @description Before you call this operation to disable a scaling group, take note of the following items:
     * *   When you call this operation, ongoing scaling activities will continue until they are complete, but new activities will be rejected.
     * *   You can disable only scaling groups that are in the Active state.
     *
     * @param request DisableScalingGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableScalingGroupResponse
     */
    public DisableScalingGroupResponse disableScalingGroupWithOptions(DisableScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableScalingGroupResponse());
    }

    /**
     * @summary Disables a scaling group.
     *
     * @description Before you call this operation to disable a scaling group, take note of the following items:
     * *   When you call this operation, ongoing scaling activities will continue until they are complete, but new activities will be rejected.
     * *   You can disable only scaling groups that are in the Active state.
     *
     * @param request DisableScalingGroupRequest
     * @return DisableScalingGroupResponse
     */
    public DisableScalingGroupResponse disableScalingGroup(DisableScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableScalingGroupWithOptions(request, runtime);
    }

    /**
     * @summary Enables an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you want to reuse an event-triggered task that is in the Disabled state, you can call the EnableAlarm operation to enable it.
     *
     * @param request EnableAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAlarmResponse
     */
    public EnableAlarmResponse enableAlarmWithOptions(EnableAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAlarmResponse());
    }

    /**
     * @summary Enables an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you want to reuse an event-triggered task that is in the Disabled state, you can call the EnableAlarm operation to enable it.
     *
     * @param request EnableAlarmRequest
     * @return EnableAlarmResponse
     */
    public EnableAlarmResponse enableAlarm(EnableAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAlarmWithOptions(request, runtime);
    }

    /**
     * @summary Enables a scaling group.
     *
     * @description You can call this operation to enable a scaling group that is in the Inactive state and has an instance configuration source. The instance configuration source can be a scaling configuration, a launch template, or an Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If a scaling group is not in the Inactive state or does not have an active instance configuration source, you cannot call this operation to enable the scaling group.
     * > A scaling group can have only one active instance configuration source. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If an instance configuration source has been configured for the scaling group before you call this operation, the scaling configuration or launch template that you specify in the request overwrites the original scaling configuration or launch template.
     * If you specify a value for the InstanceId parameter when you call the operation, Auto Scaling checks whether the total number of ECS instances is within the range allowed in the scaling group after you call the operation.
     * *   If the total number of ECS instances is less than the minimum number of instances allowed in the scaling group after you call the operation, Auto Scaling automatically creates the required number of pay-as-you-go ECS instances and adds the instances to the scaling group to reach the minimum number. For example, if the minimum number of instances allowed in your scaling group is five, and you specify the InstanceId parameter to add two created ECS instances to the scaling group, Auto Scaling automatically creates three instances in the scaling group after the two instances are added.
     * *   If the value of the TotalCapactiy parameter is greater than the value of the MaxSize parameter, the call fails.
     *
     * @param request EnableScalingGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableScalingGroupResponse
     */
    public EnableScalingGroupResponse enableScalingGroupWithOptions(EnableScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeScalingConfigurationId)) {
            query.put("ActiveScalingConfigurationId", request.activeScalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateId)) {
            query.put("LaunchTemplateId", request.launchTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateOverrides)) {
            query.put("LaunchTemplateOverrides", request.launchTemplateOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateVersion)) {
            query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeights)) {
            query.put("LoadBalancerWeights", request.loadBalancerWeights);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableScalingGroupResponse());
    }

    /**
     * @summary Enables a scaling group.
     *
     * @description You can call this operation to enable a scaling group that is in the Inactive state and has an instance configuration source. The instance configuration source can be a scaling configuration, a launch template, or an Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If a scaling group is not in the Inactive state or does not have an active instance configuration source, you cannot call this operation to enable the scaling group.
     * > A scaling group can have only one active instance configuration source. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If an instance configuration source has been configured for the scaling group before you call this operation, the scaling configuration or launch template that you specify in the request overwrites the original scaling configuration or launch template.
     * If you specify a value for the InstanceId parameter when you call the operation, Auto Scaling checks whether the total number of ECS instances is within the range allowed in the scaling group after you call the operation.
     * *   If the total number of ECS instances is less than the minimum number of instances allowed in the scaling group after you call the operation, Auto Scaling automatically creates the required number of pay-as-you-go ECS instances and adds the instances to the scaling group to reach the minimum number. For example, if the minimum number of instances allowed in your scaling group is five, and you specify the InstanceId parameter to add two created ECS instances to the scaling group, Auto Scaling automatically creates three instances in the scaling group after the two instances are added.
     * *   If the value of the TotalCapactiy parameter is greater than the value of the MaxSize parameter, the call fails.
     *
     * @param request EnableScalingGroupRequest
     * @return EnableScalingGroupResponse
     */
    public EnableScalingGroupResponse enableScalingGroup(EnableScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableScalingGroupWithOptions(request, runtime);
    }

    /**
     * @summary Puts an Elastic Compute Service (ECS) instance into the Standby state.
     *
     * @description ## Description
     * *   If you call the operation to put an ECS instance in a scaling group that is associated with a Classic Load Balancer (CLB) instance into the Standby state, the weight of the ECS instance as a backend server of the CLB instance is set to 0.
     * *   You can remove an instance that is in the Standby state from a scaling group, and then release the instance.
     * *   ECS instances that are in the Standby state are not removed from the scaling group during scale-in activities triggered by event-triggered tasks.
     * *   If Auto Scaling considers an ECS instance that is in the Standby state unhealthy, for example, the ECS instance is being stopped or being restarted, Auto Scaling does not update the health status of the ECS instance or trigger scale-in activities to remove the ECS instance from the scaling group. Auto Scaling updates the health status of the ECS instance only when the ECS instance is no longer in the Standby state.
     *
     * @param request EnterStandbyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterStandbyResponse
     */
    public EnterStandbyResponse enterStandbyWithOptions(EnterStandbyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterStandby"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterStandbyResponse());
    }

    /**
     * @summary Puts an Elastic Compute Service (ECS) instance into the Standby state.
     *
     * @description ## Description
     * *   If you call the operation to put an ECS instance in a scaling group that is associated with a Classic Load Balancer (CLB) instance into the Standby state, the weight of the ECS instance as a backend server of the CLB instance is set to 0.
     * *   You can remove an instance that is in the Standby state from a scaling group, and then release the instance.
     * *   ECS instances that are in the Standby state are not removed from the scaling group during scale-in activities triggered by event-triggered tasks.
     * *   If Auto Scaling considers an ECS instance that is in the Standby state unhealthy, for example, the ECS instance is being stopped or being restarted, Auto Scaling does not update the health status of the ECS instance or trigger scale-in activities to remove the ECS instance from the scaling group. Auto Scaling updates the health status of the ECS instance only when the ECS instance is no longer in the Standby state.
     *
     * @param request EnterStandbyRequest
     * @return EnterStandbyResponse
     */
    public EnterStandbyResponse enterStandby(EnterStandbyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterStandbyWithOptions(request, runtime);
    }

    /**
     * @summary Executes a scaling rule.
     *
     * @description Before you call this operation, take note of the following items:
     * *   The scaling group is in the Active state.
     * *   No scaling activities in the scaling group are in progress.
     * If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
     * If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
     * You can specify only a limited number of ECS instances in each adjustment. For more information, see the description of the AdjustmentValue parameter in the CreateScalingRule topic.
     *
     * @param request ExecuteScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteScalingRuleResponse
     */
    public ExecuteScalingRuleResponse executeScalingRuleWithOptions(ExecuteScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.breachThreshold)) {
            query.put("BreachThreshold", request.breachThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricValue)) {
            query.put("MetricValue", request.metricValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleAri)) {
            query.put("ScalingRuleAri", request.scalingRuleAri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteScalingRule"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteScalingRuleResponse());
    }

    /**
     * @summary Executes a scaling rule.
     *
     * @description Before you call this operation, take note of the following items:
     * *   The scaling group is in the Active state.
     * *   No scaling activities in the scaling group are in progress.
     * If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
     * If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
     * You can specify only a limited number of ECS instances in each adjustment. For more information, see the description of the AdjustmentValue parameter in the CreateScalingRule topic.
     *
     * @param request ExecuteScalingRuleRequest
     * @return ExecuteScalingRuleResponse
     */
    public ExecuteScalingRuleResponse executeScalingRule(ExecuteScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeScalingRuleWithOptions(request, runtime);
    }

    /**
     * @summary Moves an Elastic Compute Service (ECS) instance out of the Standby state.
     *
     * @description ## Description
     * If your scaling group is associated with a Classic Load Balancer (CLB) instance and you move an ECS instance in your scaling group out of the Standby state, the weight of the ECS instance is reset to the value that is specified in the scaling configuration of your scaling group.
     *
     * @param request ExitStandbyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExitStandbyResponse
     */
    public ExitStandbyResponse exitStandbyWithOptions(ExitStandbyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExitStandby"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExitStandbyResponse());
    }

    /**
     * @summary Moves an Elastic Compute Service (ECS) instance out of the Standby state.
     *
     * @description ## Description
     * If your scaling group is associated with a Classic Load Balancer (CLB) instance and you move an ECS instance in your scaling group out of the Standby state, the weight of the ECS instance is reset to the value that is specified in the scaling configuration of your scaling group.
     *
     * @param request ExitStandbyRequest
     * @return ExitStandbyResponse
     */
    public ExitStandbyResponse exitStandby(ExitStandbyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exitStandbyWithOptions(request, runtime);
    }

    /**
     * @summary Queries the tag keys added to Auto Scaling resources. Querying tag keys facilitates easier classification, identification, and monitoring of your Auto Scaling resources, thereby enhancing the flexibility and convenience of your resource management processes.
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2022-02-22"),
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
     * @summary Queries the tag keys added to Auto Scaling resources. Querying tag keys facilitates easier classification, identification, and monitoring of your Auto Scaling resources, thereby enhancing the flexibility and convenience of your resource management processes.
     *
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * @summary Queries tags that are added to one or more Auto Scaling resources.
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2022-02-22"),
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
     * @summary Queries tags that are added to one or more Auto Scaling resources.
     *
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the tag keys associated with Auto Scaling resources to facilitate a deeper comprehension of those resources. By doing so, you can categorize and manage your Auto Scaling resources more efficiently.
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2022-02-22"),
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
     * @summary Queries the tag keys associated with Auto Scaling resources to facilitate a deeper comprehension of those resources. By doing so, you can categorize and manage your Auto Scaling resources more efficiently.
     *
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * @summary Modifies an event-triggered task.
     *
     * @description *   If you set the MetricType parameter to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see [Custom monitoring event-triggered tasks](https://help.aliyun.com/document_detail/74861.html).
     * *   When you create an event-triggered task, you must specify the MetricName, DimensionKey, and DimensionValue parameters to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances or elastic container instances in a scaling group within an Alibaba Cloud account.
     *     *   If you set the MetricType parameter to custom, the valid values are your custom metrics.
     *     *   For information about the metrics that are supported if you set the MetricType parameter to system, see[ Event-triggered task for system monitoring](https://help.aliyun.com/document_detail/74854.html).
     * > The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see the `DimensionKey` and `DimensionValue` parameters in the "Request parameters" section of this topic.
     *
     * @param request ModifyAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAlarmResponse
     */
    public ModifyAlarmResponse modifyAlarmWithOptions(ModifyAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmActions)) {
            query.put("AlarmActions", request.alarmActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comparisonOperator)) {
            query.put("ComparisonOperator", request.comparisonOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effective)) {
            query.put("Effective", request.effective);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressions)) {
            query.put("Expressions", request.expressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionsLogicOperator)) {
            query.put("ExpressionsLogicOperator", request.expressionsLogicOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statistics)) {
            query.put("Statistics", request.statistics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAlarmResponse());
    }

    /**
     * @summary Modifies an event-triggered task.
     *
     * @description *   If you set the MetricType parameter to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see [Custom monitoring event-triggered tasks](https://help.aliyun.com/document_detail/74861.html).
     * *   When you create an event-triggered task, you must specify the MetricName, DimensionKey, and DimensionValue parameters to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances or elastic container instances in a scaling group within an Alibaba Cloud account.
     *     *   If you set the MetricType parameter to custom, the valid values are your custom metrics.
     *     *   For information about the metrics that are supported if you set the MetricType parameter to system, see[ Event-triggered task for system monitoring](https://help.aliyun.com/document_detail/74854.html).
     * > The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see the `DimensionKey` and `DimensionValue` parameters in the "Request parameters" section of this topic.
     *
     * @param request ModifyAlarmRequest
     * @return ModifyAlarmResponse
     */
    public ModifyAlarmResponse modifyAlarm(ModifyAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAlarmWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a scaling configuration for a scaling group that contains elastic container instances.
     *
     * @description If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.
     *
     * @param request ModifyEciScalingConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEciScalingConfigurationResponse
     */
    public ModifyEciScalingConfigurationResponse modifyEciScalingConfigurationWithOptions(ModifyEciScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfos)) {
            query.put("AcrRegistryInfos", request.acrRegistryInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activeDeadlineSeconds)) {
            query.put("ActiveDeadlineSeconds", request.activeDeadlineSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateEip)) {
            query.put("AutoCreateEip", request.autoCreateEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoMatchImageCache)) {
            query.put("AutoMatchImageCache", request.autoMatchImageCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupName)) {
            query.put("ContainerGroupName", request.containerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containers)) {
            query.put("Containers", request.containers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containersUpdateType)) {
            query.put("ContainersUpdateType", request.containersUpdateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costOptimization)) {
            query.put("CostOptimization", request.costOptimization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsCore)) {
            query.put("CpuOptionsCore", request.cpuOptionsCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsThreadsPerCore)) {
            query.put("CpuOptionsThreadsPerCore", request.cpuOptionsThreadsPerCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBucket)) {
            query.put("DataCacheBucket", request.dataCacheBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBurstingEnabled)) {
            query.put("DataCacheBurstingEnabled", request.dataCacheBurstingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCachePL)) {
            query.put("DataCachePL", request.dataCachePL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheProvisionedIops)) {
            query.put("DataCacheProvisionedIops", request.dataCacheProvisionedIops);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigNameServers)) {
            query.put("DnsConfigNameServers", request.dnsConfigNameServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigOptions)) {
            query.put("DnsConfigOptions", request.dnsConfigOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigSearchs)) {
            query.put("DnsConfigSearchs", request.dnsConfigSearchs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsPolicy)) {
            query.put("DnsPolicy", request.dnsPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressBandwidth)) {
            query.put("EgressBandwidth", request.egressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipBandwidth)) {
            query.put("EipBandwidth", request.eipBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSls)) {
            query.put("EnableSls", request.enableSls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeralStorage)) {
            query.put("EphemeralStorage", request.ephemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAliases)) {
            query.put("HostAliases", request.hostAliases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRegistryCredentials)) {
            query.put("ImageRegistryCredentials", request.imageRegistryCredentials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageSnapshotId)) {
            query.put("ImageSnapshotId", request.imageSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressBandwidth)) {
            query.put("IngressBandwidth", request.ingressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainers)) {
            query.put("InitContainers", request.initContainers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceFamilyLevel)) {
            query.put("InstanceFamilyLevel", request.instanceFamilyLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeight)) {
            query.put("LoadBalancerWeight", request.loadBalancerWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ntpServers)) {
            query.put("NtpServers", request.ntpServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartPolicy)) {
            query.put("RestartPolicy", request.restartPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationName)) {
            query.put("ScalingConfigurationName", request.scalingConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityContextSysCtls)) {
            query.put("SecurityContextSysCtls", request.securityContextSysCtls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimit)) {
            query.put("SpotPriceLimit", request.spotPriceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumes)) {
            query.put("Volumes", request.volumes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEciScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEciScalingConfigurationResponse());
    }

    /**
     * @summary Modifies a scaling configuration for a scaling group that contains elastic container instances.
     *
     * @description If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.
     *
     * @param request ModifyEciScalingConfigurationRequest
     * @return ModifyEciScalingConfigurationResponse
     */
    public ModifyEciScalingConfigurationResponse modifyEciScalingConfiguration(ModifyEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEciScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the attributes of an Elastic Compute Service (ECS) instance in a scaling group. You can call the ModifyInstanceAttribute operation to modify the lifecycle management attribute of a manually added ECS instance in a scaling group.
     *
     * @param request ModifyInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceAttributeResponse
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entrusted)) {
            query.put("Entrusted", request.entrusted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAttribute"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAttributeResponse());
    }

    /**
     * @summary Modifies the attributes of an Elastic Compute Service (ECS) instance in a scaling group. You can call the ModifyInstanceAttribute operation to modify the lifecycle management attribute of a manually added ECS instance in a scaling group.
     *
     * @param request ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a lifecycle hook.
     *
     * @description You can use one of the following methods to specify the lifecycle hook that you want to modify:
     * *   Specify the lifecycle hook ID by using the LifecycleHookId parameter. When you use this method, the ScalingGroupId and LifecycleHookName parameters are ignored.
     * *   Specify the scaling group ID by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter.
     *
     * @param request ModifyLifecycleHookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLifecycleHookResponse
     */
    public ModifyLifecycleHookResponse modifyLifecycleHookWithOptions(ModifyLifecycleHookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultResult)) {
            query.put("DefaultResult", request.defaultResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.heartbeatTimeout)) {
            query.put("HeartbeatTimeout", request.heartbeatTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookId)) {
            query.put("LifecycleHookId", request.lifecycleHookId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookName)) {
            query.put("LifecycleHookName", request.lifecycleHookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookStatus)) {
            query.put("LifecycleHookStatus", request.lifecycleHookStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleTransition)) {
            query.put("LifecycleTransition", request.lifecycleTransition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationMetadata)) {
            query.put("NotificationMetadata", request.notificationMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLifecycleHook"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLifecycleHookResponse());
    }

    /**
     * @summary Modifies a lifecycle hook.
     *
     * @description You can use one of the following methods to specify the lifecycle hook that you want to modify:
     * *   Specify the lifecycle hook ID by using the LifecycleHookId parameter. When you use this method, the ScalingGroupId and LifecycleHookName parameters are ignored.
     * *   Specify the scaling group ID by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter.
     *
     * @param request ModifyLifecycleHookRequest
     * @return ModifyLifecycleHookResponse
     */
    public ModifyLifecycleHookResponse modifyLifecycleHook(ModifyLifecycleHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLifecycleHookWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a notification.
     *
     * @param request ModifyNotificationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNotificationConfigurationResponse
     */
    public ModifyNotificationConfigurationResponse modifyNotificationConfigurationWithOptions(ModifyNotificationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationTypes)) {
            query.put("NotificationTypes", request.notificationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNotificationConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNotificationConfigurationResponse());
    }

    /**
     * @summary Modifies a notification.
     *
     * @param request ModifyNotificationConfigurationRequest
     * @return ModifyNotificationConfigurationResponse
     */
    public ModifyNotificationConfigurationResponse modifyNotificationConfiguration(ModifyNotificationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNotificationConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a scaling configuration.
     *
     * @description You can change the name of a scaling configuration in a scaling group. The name must be unique within the scaling group.
     *
     * @param tmpReq ModifyScalingConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScalingConfigurationResponse
     */
    public ModifyScalingConfigurationResponse modifyScalingConfigurationWithOptions(ModifyScalingConfigurationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyScalingConfigurationShrinkRequest request = new ModifyScalingConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedulerOptions)) {
            request.schedulerOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedulerOptions, "SchedulerOptions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.affinity)) {
            query.put("Affinity", request.affinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creditSpecification)) {
            query.put("CreditSpecification", request.creditSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPriorities)) {
            query.put("CustomPriorities", request.customPriorities);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisks)) {
            query.put("DataDisks", request.dataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedHostClusterId)) {
            query.put("DedicatedHostClusterId", request.dedicatedHostClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedHostId)) {
            query.put("DedicatedHostId", request.dedicatedHostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentSetId)) {
            query.put("DeploymentSetId", request.deploymentSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hpcClusterId)) {
            query.put("HpcClusterId", request.hpcClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFamily)) {
            query.put("ImageFamily", request.imageFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            query.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instancePatternInfos)) {
            query.put("InstancePatternInfos", request.instancePatternInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeOverrides)) {
            query.put("InstanceTypeOverrides", request.instanceTypeOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidthOut)) {
            query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioOptimized)) {
            query.put("IoOptimized", request.ioOptimized);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeight)) {
            query.put("LoadBalancerWeight", request.loadBalancerWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaces)) {
            query.put("NetworkInterfaces", request.networkInterfaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.override)) {
            query.put("Override", request.override);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInherit)) {
            query.put("PasswordInherit", request.passwordInherit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationName)) {
            query.put("ScalingConfigurationName", request.scalingConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerOptionsShrink)) {
            query.put("SchedulerOptions", request.schedulerOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupIds)) {
            query.put("SecurityGroupIds", request.securityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotDuration)) {
            query.put("SpotDuration", request.spotDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInterruptionBehavior)) {
            query.put("SpotInterruptionBehavior", request.spotInterruptionBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimits)) {
            query.put("SpotPriceLimits", request.spotPriceLimits);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSetId)) {
            query.put("StorageSetId", request.storageSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSetPartitionNumber)) {
            query.put("StorageSetPartitionNumber", request.storageSetPartitionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskCategories)) {
            query.put("SystemDiskCategories", request.systemDiskCategories);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenancy)) {
            query.put("Tenancy", request.tenancy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageOptions)) {
            query.put("ImageOptions", request.imageOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privatePoolOptions)) {
            query.put("PrivatePoolOptions", request.privatePoolOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk)) {
            query.put("SystemDisk", request.systemDisk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScalingConfigurationResponse());
    }

    /**
     * @summary Modifies a scaling configuration.
     *
     * @description You can change the name of a scaling configuration in a scaling group. The name must be unique within the scaling group.
     *
     * @param request ModifyScalingConfigurationRequest
     * @return ModifyScalingConfigurationResponse
     */
    public ModifyScalingConfigurationResponse modifyScalingConfiguration(ModifyScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a scaling group.
     *
     * @description *   You cannot call this operation to modify the settings of the following parameters:
     *     *   RegionId
     *     *   LoadBalancerId
     *     > If you want to change the CLB instances that are associated with your scaling group, call the AttachLoadBalancers and DetachLoadBalancers operations.
     *     *   DBInstanceId
     *     > If you want to change the ApsaraDB RDS instances that are associated with your scaling group, call the AttachDBInstances and DetachDBInstances operations.
     * *   You can modify only scaling groups that are in the Active or Inactive state.
     * *   If you enable a new scaling configuration, Elastic Compute Service (ECS) instances that are created based on the previous scaling configuration still run as expected in the scaling group.
     * *   If the total number of instances in the scaling group is greater than the allowed maximum number after you change the value of the MaxSize parameter, Auto Scaling automatically removes instances from the scaling group to ensure that the number of instances is within the new range.
     * *   If the total number of instances in the scaling group is less than the allowed minimum number after you change the value of the MinSize parameter, Auto Scaling automatically adds instances to the scaling group to ensure that the number of instances is within the new range.
     * *   If the total number of instances in the scaling group does not match the expected number of instances after you change the value of the DesiredCapacity parameter, Auto Scaling automatically adds instances to or removes instances from the scaling group to ensure that the number of instances matches the value of the DesiredCapacity parameter.
     *
     * @param request ModifyScalingGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScalingGroupResponse
     */
    public ModifyScalingGroupResponse modifyScalingGroupWithOptions(ModifyScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeScalingConfigurationId)) {
            query.put("ActiveScalingConfigurationId", request.activeScalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allocationStrategy)) {
            query.put("AllocationStrategy", request.allocationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.azBalance)) {
            query.put("AzBalance", request.azBalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compensateWithOnDemand)) {
            query.put("CompensateWithOnDemand", request.compensateWithOnDemand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPolicyARN)) {
            query.put("CustomPolicyARN", request.customPolicyARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCooldown)) {
            query.put("DefaultCooldown", request.defaultCooldown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableDesiredCapacity)) {
            query.put("DisableDesiredCapacity", request.disableDesiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupDeletionProtection)) {
            query.put("GroupDeletionProtection", request.groupDeletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            query.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTypes)) {
            query.put("HealthCheckTypes", request.healthCheckTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateId)) {
            query.put("LaunchTemplateId", request.launchTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateOverrides)) {
            query.put("LaunchTemplateOverrides", request.launchTemplateOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateVersion)) {
            query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxInstanceLifetime)) {
            query.put("MaxInstanceLifetime", request.maxInstanceLifetime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSize)) {
            query.put("MaxSize", request.maxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minSize)) {
            query.put("MinSize", request.minSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiAZPolicy)) {
            query.put("MultiAZPolicy", request.multiAZPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onDemandBaseCapacity)) {
            query.put("OnDemandBaseCapacity", request.onDemandBaseCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onDemandPercentageAboveBaseCapacity)) {
            query.put("OnDemandPercentageAboveBaseCapacity", request.onDemandPercentageAboveBaseCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removalPolicies)) {
            query.put("RemovalPolicies", request.removalPolicies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupName)) {
            query.put("ScalingGroupName", request.scalingGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingPolicy)) {
            query.put("ScalingPolicy", request.scalingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotAllocationStrategy)) {
            query.put("SpotAllocationStrategy", request.spotAllocationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInstancePools)) {
            query.put("SpotInstancePools", request.spotInstancePools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInstanceRemedy)) {
            query.put("SpotInstanceRemedy", request.spotInstanceRemedy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScalingGroupResponse());
    }

    /**
     * @summary Modifies a scaling group.
     *
     * @description *   You cannot call this operation to modify the settings of the following parameters:
     *     *   RegionId
     *     *   LoadBalancerId
     *     > If you want to change the CLB instances that are associated with your scaling group, call the AttachLoadBalancers and DetachLoadBalancers operations.
     *     *   DBInstanceId
     *     > If you want to change the ApsaraDB RDS instances that are associated with your scaling group, call the AttachDBInstances and DetachDBInstances operations.
     * *   You can modify only scaling groups that are in the Active or Inactive state.
     * *   If you enable a new scaling configuration, Elastic Compute Service (ECS) instances that are created based on the previous scaling configuration still run as expected in the scaling group.
     * *   If the total number of instances in the scaling group is greater than the allowed maximum number after you change the value of the MaxSize parameter, Auto Scaling automatically removes instances from the scaling group to ensure that the number of instances is within the new range.
     * *   If the total number of instances in the scaling group is less than the allowed minimum number after you change the value of the MinSize parameter, Auto Scaling automatically adds instances to the scaling group to ensure that the number of instances is within the new range.
     * *   If the total number of instances in the scaling group does not match the expected number of instances after you change the value of the DesiredCapacity parameter, Auto Scaling automatically adds instances to or removes instances from the scaling group to ensure that the number of instances matches the value of the DesiredCapacity parameter.
     *
     * @param request ModifyScalingGroupRequest
     * @return ModifyScalingGroupResponse
     */
    public ModifyScalingGroupResponse modifyScalingGroup(ModifyScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScalingGroupWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a scaling rule.
     *
     * @param request ModifyScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScalingRuleResponse
     */
    public ModifyScalingRuleResponse modifyScalingRuleWithOptions(ModifyScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentType)) {
            query.put("AdjustmentType", request.adjustmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentValue)) {
            query.put("AdjustmentValue", request.adjustmentValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmDimensions)) {
            query.put("AlarmDimensions", request.alarmDimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cooldown)) {
            query.put("Cooldown", request.cooldown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableScaleIn)) {
            query.put("DisableScaleIn", request.disableScaleIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.estimatedInstanceWarmup)) {
            query.put("EstimatedInstanceWarmup", request.estimatedInstanceWarmup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialMaxSize)) {
            query.put("InitialMaxSize", request.initialMaxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAdjustmentMagnitude)) {
            query.put("MinAdjustmentMagnitude", request.minAdjustmentMagnitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveScalingMode)) {
            query.put("PredictiveScalingMode", request.predictiveScalingMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveTaskBufferTime)) {
            query.put("PredictiveTaskBufferTime", request.predictiveTaskBufferTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveValueBehavior)) {
            query.put("PredictiveValueBehavior", request.predictiveValueBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveValueBuffer)) {
            query.put("PredictiveValueBuffer", request.predictiveValueBuffer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleInEvaluationCount)) {
            query.put("ScaleInEvaluationCount", request.scaleInEvaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleOutEvaluationCount)) {
            query.put("ScaleOutEvaluationCount", request.scaleOutEvaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleId)) {
            query.put("ScalingRuleId", request.scalingRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stepAdjustments)) {
            query.put("StepAdjustments", request.stepAdjustments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScalingRule"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScalingRuleResponse());
    }

    /**
     * @summary Modifies a scaling rule.
     *
     * @param request ModifyScalingRuleRequest
     * @return ModifyScalingRuleResponse
     */
    public ModifyScalingRuleResponse modifyScalingRule(ModifyScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScalingRuleWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a scheduled task.
     *
     * @description You can use the following parameters to specify the scaling method of a scheduled task:
     * *   If you use the `ScheduledAction` parameter, you must select an existing scaling rule for the scheduled task.
     * *   If you use the `ScalingGroupId` parameter, you must specify the minimum number, maximum number, or expected number of instances in the scheduled task.
     * > You cannot specify the `ScheduledAction` and `ScalingGroupId` parameters at the same time.
     *
     * @param request ModifyScheduledTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScheduledTaskResponse
     */
    public ModifyScheduledTaskResponse modifyScheduledTaskWithOptions(ModifyScheduledTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchExpirationTime)) {
            query.put("LaunchExpirationTime", request.launchExpirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTime)) {
            query.put("LaunchTime", request.launchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxValue)) {
            query.put("MaxValue", request.maxValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minValue)) {
            query.put("MinValue", request.minValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceEndTime)) {
            query.put("RecurrenceEndTime", request.recurrenceEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceType)) {
            query.put("RecurrenceType", request.recurrenceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceValue)) {
            query.put("RecurrenceValue", request.recurrenceValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledAction)) {
            query.put("ScheduledAction", request.scheduledAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskId)) {
            query.put("ScheduledTaskId", request.scheduledTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskName)) {
            query.put("ScheduledTaskName", request.scheduledTaskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskEnabled)) {
            query.put("TaskEnabled", request.taskEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScheduledTask"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScheduledTaskResponse());
    }

    /**
     * @summary Modifies a scheduled task.
     *
     * @description You can use the following parameters to specify the scaling method of a scheduled task:
     * *   If you use the `ScheduledAction` parameter, you must select an existing scaling rule for the scheduled task.
     * *   If you use the `ScalingGroupId` parameter, you must specify the minimum number, maximum number, or expected number of instances in the scheduled task.
     * > You cannot specify the `ScheduledAction` and `ScalingGroupId` parameters at the same time.
     *
     * @param request ModifyScheduledTaskRequest
     * @return ModifyScheduledTaskResponse
     */
    public ModifyScheduledTaskResponse modifyScheduledTask(ModifyScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScheduledTaskWithOptions(request, runtime);
    }

    /**
     * @summary Rebalances the distribution of Elastic Compute Service (ECS) instances across zones. If ECS instances are unevenly distributed across multiple zones, you can call the RebalanceInstances operation to rebalance the distribution of the ECS instances across the zones.
     *
     * @description ## [](#)Usage notes
     * Auto Scaling creates new ECS instances to replace the existing ECS instances to fulfill the rebalancing purpose. Auto Scaling starts the new ECS instances before stopping the existing ECS instances. The rebalancing operation does not affect the performance or service availability of your application.
     * *   This operation is supported by only multi-zone scaling groups whose `MultiAZPolicy` is set to `BALANCE`.
     * *   A rebalancing operation is required only when the distribution of the instances of a multi-zone scaling group is significantly unbalanced. In a rebalancing activity, Auto Scaling replaces up to 20 ECS instances to rectify the unbalanced distribution.
     * *   During the execution of a rebalancing operation, if the number of instances in the scaling group approaches or hits the value of MaxSize but the rebalancing operation needs to continue, Auto Scaling allows the total number of ECS instances to momentarily exceed the value of MaxSize by 10%. This temporary surplus condition persists for a duration until equilibrium in the distribution of ECS instances is achieved. Typically, it takes 1 to 6 minutes.
     *     **
     *     **Note** If the 10% increment of the maximum number of instances in a scaling group yield a non-integer value, the decimal portion is always rounded up to ensure an additional instance is accounted for. For example, you have a scaling group that holds a maximum of 15 ECS instances. During a rebalancing operation, Auto Scaling would permit the total number of instances to momentarily surpass this limit by 2, instead of the calculated 10% (which is 1.5).
     *
     * @param request RebalanceInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebalanceInstancesResponse
     */
    public RebalanceInstancesResponse rebalanceInstancesWithOptions(RebalanceInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebalanceInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebalanceInstancesResponse());
    }

    /**
     * @summary Rebalances the distribution of Elastic Compute Service (ECS) instances across zones. If ECS instances are unevenly distributed across multiple zones, you can call the RebalanceInstances operation to rebalance the distribution of the ECS instances across the zones.
     *
     * @description ## [](#)Usage notes
     * Auto Scaling creates new ECS instances to replace the existing ECS instances to fulfill the rebalancing purpose. Auto Scaling starts the new ECS instances before stopping the existing ECS instances. The rebalancing operation does not affect the performance or service availability of your application.
     * *   This operation is supported by only multi-zone scaling groups whose `MultiAZPolicy` is set to `BALANCE`.
     * *   A rebalancing operation is required only when the distribution of the instances of a multi-zone scaling group is significantly unbalanced. In a rebalancing activity, Auto Scaling replaces up to 20 ECS instances to rectify the unbalanced distribution.
     * *   During the execution of a rebalancing operation, if the number of instances in the scaling group approaches or hits the value of MaxSize but the rebalancing operation needs to continue, Auto Scaling allows the total number of ECS instances to momentarily exceed the value of MaxSize by 10%. This temporary surplus condition persists for a duration until equilibrium in the distribution of ECS instances is achieved. Typically, it takes 1 to 6 minutes.
     *     **
     *     **Note** If the 10% increment of the maximum number of instances in a scaling group yield a non-integer value, the decimal portion is always rounded up to ensure an additional instance is accounted for. For example, you have a scaling group that holds a maximum of 15 ECS instances. During a rebalancing operation, Auto Scaling would permit the total number of instances to momentarily surpass this limit by 2, instead of the calculated 10% (which is 1.5).
     *
     * @param request RebalanceInstancesRequest
     * @return RebalanceInstancesResponse
     */
    public RebalanceInstancesResponse rebalanceInstances(RebalanceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebalanceInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Prolongs a lifecycle hook for Elastic Compute Service (ECS) instances.
     *
     * @description You can call this operation to prolong the length of a lifecycle hook up to 20 times. Take note that the total length of a lifecycle hook cannot exceed 6 hours.
     *
     * @param request RecordLifecycleActionHeartbeatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecordLifecycleActionHeartbeatResponse
     */
    public RecordLifecycleActionHeartbeatResponse recordLifecycleActionHeartbeatWithOptions(RecordLifecycleActionHeartbeatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.heartbeatTimeout)) {
            query.put("heartbeatTimeout", request.heartbeatTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionToken)) {
            query.put("lifecycleActionToken", request.lifecycleActionToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookId)) {
            query.put("lifecycleHookId", request.lifecycleHookId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecordLifecycleActionHeartbeat"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecordLifecycleActionHeartbeatResponse());
    }

    /**
     * @summary Prolongs a lifecycle hook for Elastic Compute Service (ECS) instances.
     *
     * @description You can call this operation to prolong the length of a lifecycle hook up to 20 times. Take note that the total length of a lifecycle hook cannot exceed 6 hours.
     *
     * @param request RecordLifecycleActionHeartbeatRequest
     * @return RecordLifecycleActionHeartbeatResponse
     */
    public RecordLifecycleActionHeartbeatResponse recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recordLifecycleActionHeartbeatWithOptions(request, runtime);
    }

    /**
     * @summary Removes one or more Elastic Compute Service (ECS) instances or elastic container instances from a scaling group.
     *
     * @description *   Before you call this operation, make sure that the following requirements are met:
     *     *   The scaling group is in the Active state.
     *     *   No scaling activity is in progress within the scaling group.
     * > If no scaling activity is in progress within the scaling group, you can call the operation even within the cooldown period.
     * *   If an ECS instance is automatically created by Auto Scaling, or if an ECS instance is manually added to a scaling group and managed by the scaling group, the ECS instance is stopped in economical mode or is released after the instance is removed from the scaling group.
     * *   If an ECS instance is manually added to a scaling group and is not managed by the scaling group, the ECS instance is not stopped or released after the instance is removed from the scaling group.
     * *   If the difference between the number of existing ECS instances specified by the TotalCapacity parameter and the number of ECS instances that you call this operation to remove is less than the value of the MinSize parameter, the call fails.
     * A successful call only means that Auto Scaling accepts the request. The scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.
     *
     * @param request RemoveInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveInstancesResponse
     */
    public RemoveInstancesResponse removeInstancesWithOptions(RemoveInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decreaseDesiredCapacity)) {
            query.put("DecreaseDesiredCapacity", request.decreaseDesiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreInvalidInstance)) {
            query.put("IgnoreInvalidInstance", request.ignoreInvalidInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removePolicy)) {
            query.put("RemovePolicy", request.removePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveInstancesResponse());
    }

    /**
     * @summary Removes one or more Elastic Compute Service (ECS) instances or elastic container instances from a scaling group.
     *
     * @description *   Before you call this operation, make sure that the following requirements are met:
     *     *   The scaling group is in the Active state.
     *     *   No scaling activity is in progress within the scaling group.
     * > If no scaling activity is in progress within the scaling group, you can call the operation even within the cooldown period.
     * *   If an ECS instance is automatically created by Auto Scaling, or if an ECS instance is manually added to a scaling group and managed by the scaling group, the ECS instance is stopped in economical mode or is released after the instance is removed from the scaling group.
     * *   If an ECS instance is manually added to a scaling group and is not managed by the scaling group, the ECS instance is not stopped or released after the instance is removed from the scaling group.
     * *   If the difference between the number of existing ECS instances specified by the TotalCapacity parameter and the number of ECS instances that you call this operation to remove is less than the value of the MinSize parameter, the call fails.
     * A successful call only means that Auto Scaling accepts the request. The scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.
     *
     * @param request RemoveInstancesRequest
     * @return RemoveInstancesResponse
     */
    public RemoveInstancesResponse removeInstances(RemoveInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Resumes suspended processes in a scaling group.
     *
     * @param request ResumeProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeProcessesResponse
     */
    public ResumeProcessesResponse resumeProcessesWithOptions(ResumeProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processes)) {
            query.put("Processes", request.processes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeProcesses"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeProcessesResponse());
    }

    /**
     * @summary Resumes suspended processes in a scaling group.
     *
     * @param request ResumeProcessesRequest
     * @return ResumeProcessesResponse
     */
    public ResumeProcessesResponse resumeProcesses(ResumeProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeProcessesWithOptions(request, runtime);
    }

    /**
     * @summary Scales instances in a scaling group based on the specified scaling policy.
     *
     * @description Compared with the ExecuteScalingRule operation, the ScaleWithAdjustment operation does not require a scaling rule to be created in advance. Before you call the ScaleWithAdjustment operation, take note of the following items:
     * *   The following conditions must be met:
     *     *   The scaling group is in the Active state.
     *     *   No scaling activities in the scaling group are in progress.
     * *   If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * *   If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
     * *   If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the `ScalingActivityId` parameter in the response.
     *
     * @param tmpReq ScaleWithAdjustmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScaleWithAdjustmentResponse
     */
    public ScaleWithAdjustmentResponse scaleWithAdjustmentWithOptions(ScaleWithAdjustmentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScaleWithAdjustmentShrinkRequest request = new ScaleWithAdjustmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lifecycleHookContext)) {
            request.lifecycleHookContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lifecycleHookContext, "LifecycleHookContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.overrides)) {
            request.overridesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.overrides, "Overrides", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityMetadata)) {
            query.put("ActivityMetadata", request.activityMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentType)) {
            query.put("AdjustmentType", request.adjustmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentValue)) {
            query.put("AdjustmentValue", request.adjustmentValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookContextShrink)) {
            query.put("LifecycleHookContext", request.lifecycleHookContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAdjustmentMagnitude)) {
            query.put("MinAdjustmentMagnitude", request.minAdjustmentMagnitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overridesShrink)) {
            query.put("Overrides", request.overridesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncActivity)) {
            query.put("SyncActivity", request.syncActivity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleWithAdjustment"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleWithAdjustmentResponse());
    }

    /**
     * @summary Scales instances in a scaling group based on the specified scaling policy.
     *
     * @description Compared with the ExecuteScalingRule operation, the ScaleWithAdjustment operation does not require a scaling rule to be created in advance. Before you call the ScaleWithAdjustment operation, take note of the following items:
     * *   The following conditions must be met:
     *     *   The scaling group is in the Active state.
     *     *   No scaling activities in the scaling group are in progress.
     * *   If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * *   If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
     * *   If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the `ScalingActivityId` parameter in the response.
     *
     * @param request ScaleWithAdjustmentRequest
     * @return ScaleWithAdjustmentResponse
     */
    public ScaleWithAdjustmentResponse scaleWithAdjustment(ScaleWithAdjustmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scaleWithAdjustmentWithOptions(request, runtime);
    }

    /**
     * @summary Sets deletion protection for a scaling group. If you enable deletion protection for a scaling group, you cannot delete the scaling group. If you disable deletion protection for a scaling group, you can directly delete the scaling group. You can call the SetGroupDeletionProtection operation to enable or disable deletion protection.
     *
     * @param request SetGroupDeletionProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetGroupDeletionProtectionResponse
     */
    public SetGroupDeletionProtectionResponse setGroupDeletionProtectionWithOptions(SetGroupDeletionProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupDeletionProtection)) {
            query.put("GroupDeletionProtection", request.groupDeletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetGroupDeletionProtection"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetGroupDeletionProtectionResponse());
    }

    /**
     * @summary Sets deletion protection for a scaling group. If you enable deletion protection for a scaling group, you cannot delete the scaling group. If you disable deletion protection for a scaling group, you can directly delete the scaling group. You can call the SetGroupDeletionProtection operation to enable or disable deletion protection.
     *
     * @param request SetGroupDeletionProtectionRequest
     * @return SetGroupDeletionProtectionResponse
     */
    public SetGroupDeletionProtectionResponse setGroupDeletionProtection(SetGroupDeletionProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setGroupDeletionProtectionWithOptions(request, runtime);
    }

    /**
     * @summary Sets instance health. At times, the automatic health check system might not sufficiently determine the precise health status of your Elastic Compute Service (ECS) instances or elastic container instances. To overcome this, you can call the SetInstanceHealth operation to swiftly pinpoint problematic instances and resolve issues. This operation is designed to more precisely align with real-world business requirements and tackle O\\&M hurdles efficiently.
     *
     * @description Auto Scaling detects and removes unhealthy ECS instances or elastic container instances from the corresponding scaling groups. If you want to retain a specific instance in the corresponding scaling group, you can put the instance into the Standby or Protected state. For more information, see [EnterStandby](~~EnterStandby~~) and [SetInstancesProtection](~~SetInstancesProtection~~).
     *
     * @param request SetInstanceHealthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetInstanceHealthResponse
     */
    public SetInstanceHealthResponse setInstanceHealthWithOptions(SetInstanceHealthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.healthStatus)) {
            query.put("HealthStatus", request.healthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetInstanceHealth"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetInstanceHealthResponse());
    }

    /**
     * @summary Sets instance health. At times, the automatic health check system might not sufficiently determine the precise health status of your Elastic Compute Service (ECS) instances or elastic container instances. To overcome this, you can call the SetInstanceHealth operation to swiftly pinpoint problematic instances and resolve issues. This operation is designed to more precisely align with real-world business requirements and tackle O\\&M hurdles efficiently.
     *
     * @description Auto Scaling detects and removes unhealthy ECS instances or elastic container instances from the corresponding scaling groups. If you want to retain a specific instance in the corresponding scaling group, you can put the instance into the Standby or Protected state. For more information, see [EnterStandby](~~EnterStandby~~) and [SetInstancesProtection](~~SetInstancesProtection~~).
     *
     * @param request SetInstanceHealthRequest
     * @return SetInstanceHealthResponse
     */
    public SetInstanceHealthResponse setInstanceHealth(SetInstanceHealthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstanceHealthWithOptions(request, runtime);
    }

    /**
     * @summary Puts Elastic Compute Service (ECS) instances into the Protected state. When ECS instances are put into the Protected state, they become immune to manual deletion attempts by using the Auto Scaling console or API operations. This operation serves as a robust safeguard, efficiently preventing any inadvertent instance release that could lead to irreversible consequences.
     *
     * @description Once ECS instances enter the Protected state, they become subject to the following restrictions:
     * *   ECS instances will persist in the Protected state, unless you deliberately remove them from this state.
     * *   Even in scenarios where automatic scale-in actions are initiated due to fluctuations in the number of ECS instances or the execution of event-triggered tasks, Auto Scaling does not remove ECS instances that are in the Protected state from their respective scaling groups. Only after being manually removed from their respective scaling groups can ECS instances that are in the Protected state be released. For more information, see [Remove an ECS instance](https://help.aliyun.com/document_detail/25955.html).
     * *   ECS instances in the Protected state maintain their existing health status even when they undergo stopping or restarting processes.
     *
     * @param request SetInstancesProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetInstancesProtectionResponse
     */
    public SetInstancesProtectionResponse setInstancesProtectionWithOptions(SetInstancesProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectedFromScaleIn)) {
            query.put("ProtectedFromScaleIn", request.protectedFromScaleIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetInstancesProtection"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetInstancesProtectionResponse());
    }

    /**
     * @summary Puts Elastic Compute Service (ECS) instances into the Protected state. When ECS instances are put into the Protected state, they become immune to manual deletion attempts by using the Auto Scaling console or API operations. This operation serves as a robust safeguard, efficiently preventing any inadvertent instance release that could lead to irreversible consequences.
     *
     * @description Once ECS instances enter the Protected state, they become subject to the following restrictions:
     * *   ECS instances will persist in the Protected state, unless you deliberately remove them from this state.
     * *   Even in scenarios where automatic scale-in actions are initiated due to fluctuations in the number of ECS instances or the execution of event-triggered tasks, Auto Scaling does not remove ECS instances that are in the Protected state from their respective scaling groups. Only after being manually removed from their respective scaling groups can ECS instances that are in the Protected state be released. For more information, see [Remove an ECS instance](https://help.aliyun.com/document_detail/25955.html).
     * *   ECS instances in the Protected state maintain their existing health status even when they undergo stopping or restarting processes.
     *
     * @param request SetInstancesProtectionRequest
     * @return SetInstancesProtectionResponse
     */
    public SetInstancesProtectionResponse setInstancesProtection(SetInstancesProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstancesProtectionWithOptions(request, runtime);
    }

    /**
     * @summary Suspends scaling processes. This operation empowers you to selectively pause distinct scaling processes within a particular scaling group, enabling you to carry out alternative tasks and achieve more granular management over your scaling operations.
     *
     * @param request SuspendProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendProcessesResponse
     */
    public SuspendProcessesResponse suspendProcessesWithOptions(SuspendProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processes)) {
            query.put("Processes", request.processes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendProcesses"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendProcessesResponse());
    }

    /**
     * @summary Suspends scaling processes. This operation empowers you to selectively pause distinct scaling processes within a particular scaling group, enabling you to carry out alternative tasks and achieve more granular management over your scaling operations.
     *
     * @param request SuspendProcessesRequest
     * @return SuspendProcessesResponse
     */
    public SuspendProcessesResponse suspendProcesses(SuspendProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendProcessesWithOptions(request, runtime);
    }

    /**
     * @summary Adds tags to specified Auto Scaling resources.
     *
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2022-02-22"),
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
     * @summary Adds tags to specified Auto Scaling resources.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Removes tags from Auto Scaling resources simultaneously. This operation streamlines resource management activities, enhances system efficiency, and mitigates potential security vulnerabilities. Once a tag is removed from a particular resource, and if it is not re-added to any other resource, the system will automatically delete the unused tag.
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2022-02-22"),
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
     * @summary Removes tags from Auto Scaling resources simultaneously. This operation streamlines resource management activities, enhances system efficiency, and mitigates potential security vulnerabilities. Once a tag is removed from a particular resource, and if it is not re-added to any other resource, the system will automatically delete the unused tag.
     *
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Checks whether Auto Scaling is authorized to access Elastic Compute Service (ECS) and Elastic Container Instance resources.
     *
     * @param request VerifyAuthenticationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyAuthenticationResponse
     */
    public VerifyAuthenticationResponse verifyAuthenticationWithOptions(VerifyAuthenticationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.onlyCheck)) {
            query.put("OnlyCheck", request.onlyCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyAuthentication"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyAuthenticationResponse());
    }

    /**
     * @summary Checks whether Auto Scaling is authorized to access Elastic Compute Service (ECS) and Elastic Container Instance resources.
     *
     * @param request VerifyAuthenticationRequest
     * @return VerifyAuthenticationResponse
     */
    public VerifyAuthenticationResponse verifyAuthentication(VerifyAuthenticationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyAuthenticationWithOptions(request, runtime);
    }

    /**
     * @summary Verifies whether Auto Scaling is activated. This operation guarantees that in response to shifts in business workloads or variations in incoming traffic, the system will automatically adjust resource provisioning. This auto-scaling capability enhances the overall system performance, ensuring high availability and improved flexibility to accommodate dynamic demands.
     *
     * @param request VerifyUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyUserResponse
     */
    public VerifyUserResponse verifyUserWithOptions(VerifyUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyUser"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyUserResponse());
    }

    /**
     * @summary Verifies whether Auto Scaling is activated. This operation guarantees that in response to shifts in business workloads or variations in incoming traffic, the system will automatically adjust resource provisioning. This auto-scaling capability enhances the overall system performance, ensuring high availability and improved flexibility to accommodate dynamic demands.
     *
     * @param request VerifyUserRequest
     * @return VerifyUserResponse
     */
    public VerifyUserResponse verifyUser(VerifyUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyUserWithOptions(request, runtime);
    }
}
